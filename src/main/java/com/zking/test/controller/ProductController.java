package com.zking.test.controller;

import com.zking.test.biz.IProductBiz;
import com.zking.test.model.Customer;
import com.zking.test.model.Product;
import com.zking.test.util.JsonData;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ProductController")
public class ProductController {

    @Autowired
    IProductBiz iProductBiz;

    @Value("${saveDir}")
    private String saveDir;

    @RequestMapping("/GetProduct")
    public @ResponseBody JsonData login(Model model, Product product, PageBean pageBean) {
        JsonData jsonData = new JsonData();

        if(null == product.getProName()){
            product.setProName("");
        }
        if (null != product.getProName()){
            product.setProName(product.getProName());
        }

        final List<Product> productList = iProductBiz.selectByProduct(product,pageBean);
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setPage(pageBean.getPage());

        jsonData.setResult(productList);
        return jsonData;
    }

    @RequestMapping("/UpProduct")
    public @ResponseBody JsonData login(Model model, Product product) {
        JsonData jsonData = new JsonData();

        int i = iProductBiz.updateByPrimaryKey(product);

        jsonData.setCode(i);
        jsonData.setMessage("成功！");
        return jsonData;
    }

    @RequestMapping("/DelProduct")
    public @ResponseBody JsonData Del(Model model, Product product) {
        JsonData jsonData = new JsonData();

        int i = iProductBiz.deleteByPrimaryKey(product.getProId());

        jsonData.setCode(i);
        jsonData.setMessage("成功！");
        return jsonData;
    }

    @RequestMapping("/addProduct")
    public @ResponseBody JsonData add(Model model, Product product) {
        JsonData jsonData = new JsonData();

        int i = iProductBiz.insert(product);

        jsonData.setCode(i);
        jsonData.setMessage("成功！");
        return jsonData;
    }

    @RequestMapping(value = "/toUpload")
    public String toUpload() throws Exception {
        return "upload";
    }

    @RequestMapping(value = "/upload1")
    public JsonData upload1(MultipartFile img) throws Exception {
        JsonData jsonData = new JsonData();

        String fileId = this.getFileId();
        String path = this.saveDir + File.separator + fileId;
        System.out.println(path);

        File file = new File(path);
        img.transferTo(file);

        jsonData.setResult(file);
        return jsonData;
    }

    private String getFileId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
