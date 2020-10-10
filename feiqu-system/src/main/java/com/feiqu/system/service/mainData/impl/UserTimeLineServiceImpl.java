package com.feiqu.system.service.mainData.impl;


import com.feiqu.system.annotation.BaseService;
import com.feiqu.system.base.BaseServiceImpl;
import com.feiqu.system.mapper.mainData.UserTimeLineMapper;
import com.feiqu.system.model.UserTimeLine;
import com.feiqu.system.model.UserTimeLineExample;
import com.feiqu.system.service.mainData.UserTimeLineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* UserTimeLineService实现
* Created by cwd on 2017/10/24.
*/
@Service
@Transactional
@BaseService

public class UserTimeLineServiceImpl extends BaseServiceImpl<UserTimeLineMapper, UserTimeLine, UserTimeLineExample> implements UserTimeLineService {

    private static Logger _log = LoggerFactory.getLogger(UserTimeLineServiceImpl.class);

    @Resource
    UserTimeLineMapper userTimeLineMapper;

}