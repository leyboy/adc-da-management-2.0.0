package com.adc.da.sys.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.sys.dao.AnnounceEODao;
import com.adc.da.sys.entity.AnnounceEO;


/**
 *
 * <br>
 * <b>功能：</b>TS_ANNOUNCE AnnounceEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("announceEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class AnnounceEOService extends BaseService<AnnounceEO, Void> {

    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(AnnounceEOService.class);

    @Autowired
    private AnnounceEODao dao;

    public AnnounceEODao getDao() {
        return dao;
    }

}
