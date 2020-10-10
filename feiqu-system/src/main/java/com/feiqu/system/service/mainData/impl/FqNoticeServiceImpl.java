package com.feiqu.system.service.mainData.impl;


import com.feiqu.system.annotation.BaseService;
import com.feiqu.system.base.BaseServiceImpl;
import com.feiqu.system.mapper.mainData.FqNoticeMapper;
import com.feiqu.system.model.FqNotice;
import com.feiqu.system.model.FqNoticeExample;
import com.feiqu.system.service.mainData.FqNoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* FqNoticeService实现
* Created by cwd on 2017/11/9.
*/
@Service
@Transactional
@BaseService

public class FqNoticeServiceImpl extends BaseServiceImpl<FqNoticeMapper, FqNotice, FqNoticeExample> implements FqNoticeService {

    private static Logger _log = LoggerFactory.getLogger(FqNoticeServiceImpl.class);

    @Resource
    FqNoticeMapper fqNoticeMapper;

}