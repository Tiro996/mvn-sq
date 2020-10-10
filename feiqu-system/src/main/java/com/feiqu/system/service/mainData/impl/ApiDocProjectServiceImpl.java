package com.feiqu.system.service.mainData.impl;


import com.feiqu.system.annotation.BaseService;
import com.feiqu.system.base.BaseServiceImpl;
import com.feiqu.system.mapper.mainData.ApiDocProjectMapper;
import com.feiqu.system.model.ApiDocProject;
import com.feiqu.system.model.ApiDocProjectExample;
import com.feiqu.system.service.mainData.ApiDocProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* ApiDocProjectService实现
* Created by cwd on 2019/1/13.
*/
@Service
@Transactional
@BaseService

public class ApiDocProjectServiceImpl extends BaseServiceImpl<ApiDocProjectMapper, ApiDocProject, ApiDocProjectExample> implements ApiDocProjectService {

    private static Logger _log = LoggerFactory.getLogger(ApiDocProjectServiceImpl.class);

    @Resource
    ApiDocProjectMapper apiDocProjectMapper;

}