package com.adc.da.sys.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.adc.da.sys.dao.StaffstyleEODao;
import com.adc.da.sys.entity.StaffstyleEO;


/**
 *
 * <br>
 * <b>功能：</b>TS_STAFFSTYLE StaffstyleEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("staffstyleEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class StaffstyleEOService extends BaseService<StaffstyleEO, String> {

    private static final Logger logger = LoggerFactory.getLogger(StaffstyleEOService.class);

    @Autowired
    private StaffstyleEODao dao;

    public StaffstyleEODao getDao() {
        return dao;
    }

}
