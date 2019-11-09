package com.zking.test.biz.impl;

import com.zking.test.biz.IApplyBiz;
import com.zking.test.mapper.ApplyMapper;
import com.zking.test.model.Apply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("applyBiz")
public class ApplyBizImpl implements IApplyBiz {

    @Autowired
    @SuppressWarnings("all")
    private ApplyMapper applyMapper;

    @Override
    public int update(Apply apply) {
        Apply applys = new Apply();
        apply.setApplyId(apply.getApplyId());
        if(apply.getState()==1){
            apply.setState(2);
        }
        else if(apply.getState()==2){
            apply.setState(3);
        }
        else if(apply.getState()==5){
            apply.setState(2);
        }
        else if(apply.getState()==3){
            apply.setState(4);
        }
        return applyMapper.update(apply);
    }
    @Override
    public int updateById(Apply apply){
        Apply applys = new Apply();
        applys.setApplyId(apply.getApplyId());
        applys.setAdmId(apply.getAdmId());
        apply.setState(apply.getState());
        return applyMapper.updateByPrimaryKeySelective(apply);
    };

    @Override
    public int update1(Apply apply) {
        Apply applys = new Apply();
        apply.setApplyId(apply.getApplyId());
        if(apply.getState()==1){
            apply.setState(5);
        }
        else if(apply.getState()==2){
            apply.setState(5);
        }
        else if(apply.getState()==3){
            apply.setState(5);
        }
        return applyMapper.update(apply);
    }

}
