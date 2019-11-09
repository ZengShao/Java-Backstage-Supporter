package com.zking.test.biz;

import com.zking.test.model.Apply;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IApplyBiz {
    int update(Apply apply);
    int updateById(Apply apply);
    int update1(Apply apply);
}
