package com.zking.test.biz.impl;

import com.zking.test.biz.IDict;
import com.zking.test.model.Dict;
import org.springframework.stereotype.Service;

@Service("DictBiz")
public class IDictImpl implements IDict {
    @Override
    public int deleteByPrimaryKey(Long dictId) {
        return 0;
    }

    @Override
    public int insert(Dict record) {
        return 0;
    }

    @Override
    public int insertSelective(Dict record) {
        return 0;
    }

    @Override
    public Dict selectByPrimaryKey(Long dictId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Dict record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dict record) {
        return 0;
    }
}
