package com.zking.test.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.test.biz.IProductBiz;
import com.zking.test.mapper.ProductMapper;
import com.zking.test.model.Customer;
import com.zking.test.model.Product;
import com.zking.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductBiz")
public class IProductBizImpl implements IProductBiz {

    @Autowired
    ProductMapper productMapper;

    @Override
    public int deleteByPrimaryKey(Long proId) {
        return productMapper.deleteByPrimaryKey(proId);
    }

    @Override
    public int insert(Product record) {
        return productMapper.insert(record);
    }

    @Override
    public int insertSelective(Product record) {
        return 0;
    }

    @Override
    public Product selectByPrimaryKey(Long proId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Product> selectByProduct(Product product,PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<Product> objects = productMapper.selectByProduct(product);
        if (null != pageBean && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo(objects);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return objects;
    }
}
