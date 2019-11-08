package com.zking.test.mapper;

import com.zking.test.model.Product;
import com.zking.test.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Long proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByProduct(Product product);
}