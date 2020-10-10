package com.feiqu.system.service.mainData.impl;


import com.feiqu.system.annotation.BaseService;
import com.feiqu.system.base.BaseServiceImpl;
import com.feiqu.system.mapper.mainData.FqSignMapper;
import com.feiqu.system.model.FqSign;
import com.feiqu.system.model.FqSignExample;
import com.feiqu.system.pojo.response.SignUserResponse;
import com.feiqu.system.service.mainData.FqSignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* FqSignService实现
* Created by cwd on 2017/11/17.
*/
@Service
@Transactional
@BaseService

public class FqSignServiceImpl extends BaseServiceImpl<FqSignMapper, FqSign, FqSignExample> implements FqSignService {

    private static Logger _log = LoggerFactory.getLogger(FqSignServiceImpl.class);

    @Resource
    FqSignMapper fqSignMapper;

    public List<SignUserResponse> selectWithUserByExample(FqSignExample example) {
        return fqSignMapper.selectWithUserByExample(example);
    }
}