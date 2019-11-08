package com.zking.test.biz;

import com.zking.test.model.Product;
import com.zking.test.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IProductBiz {
    int deleteByPrimaryKey(Long proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByProduct(Product product,PageBean pageBean);
}
