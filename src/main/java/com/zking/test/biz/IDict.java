package com.zking.test.biz;

import com.zking.test.model.Dict;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IDict {
    int deleteByPrimaryKey(Long dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}
