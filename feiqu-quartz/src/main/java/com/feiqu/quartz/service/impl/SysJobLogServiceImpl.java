package com.feiqu.quartz.service.impl;


import com.feiqu.quartz.mapper.SysJobLogMapper;
import com.feiqu.quartz.model.SysJobLog;
import com.feiqu.quartz.model.SysJobLogExample;
import com.feiqu.quartz.service.SysJobLogService;
import com.feiqu.system.annotation.BaseService;
import com.feiqu.system.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* SysJobLogService实现
* Created by cwd on 2019/3/13.
*/
@Service
@Transactional
@BaseService
public class SysJobLogServiceImpl extends BaseServiceImpl<SysJobLogMapper, SysJobLog, SysJobLogExample> implements SysJobLogService {

    private static Logger logger = LoggerFactory.getLogger(SysJobLogServiceImpl.class);

    @Resource
    SysJobLogMapper sysJobLogMapper;

}