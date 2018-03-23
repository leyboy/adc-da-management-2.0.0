package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.StaffstyleEO;
import com.adc.da.sys.page.StaffstyleEOPage;
import com.adc.da.sys.service.StaffstyleEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/${restPath}/sys/staffstyle")
@Api(description = "|StaffstyleEO|")
public class StaffstyleEOController extends BaseController<StaffstyleEO>{

    private static final Logger logger = LoggerFactory.getLogger(StaffstyleEOController.class);

    @Autowired
    private StaffstyleEOService staffstyleEOService;

	@ApiOperation(value = "|StaffstyleEO|分页查询")
    @GetMapping("/page")
    public ResponseMessage<PageInfo<StaffstyleEO>> page(StaffstyleEOPage page) throws Exception {
        List<StaffstyleEO> rows = staffstyleEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|StaffstyleEO|查询")
    @GetMapping("")
    public ResponseMessage<List<StaffstyleEO>> list(StaffstyleEOPage page) throws Exception {
        return Result.success(staffstyleEOService.queryByList(page));
	}

    @ApiOperation(value = "|StaffstyleEO|详情")
    @GetMapping("/{pkstaff}")
    public ResponseMessage<StaffstyleEO> find(@PathVariable String pkstaff) throws Exception {
        return Result.success(staffstyleEOService.selectByPrimaryKey(pkstaff));
    }

    @ApiOperation(value = "|StaffstyleEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<StaffstyleEO> create(@RequestBody StaffstyleEO staffstyleEO) throws Exception {
        staffstyleEOService.insertSelective(staffstyleEO);
        return Result.success(staffstyleEO);
    }

    @ApiOperation(value = "|StaffstyleEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<StaffstyleEO> update(@RequestBody StaffstyleEO staffstyleEO) throws Exception {
        staffstyleEOService.updateByPrimaryKeySelective(staffstyleEO);
        return Result.success(staffstyleEO);
    }

    @ApiOperation(value = "|StaffstyleEO|删除")
    @DeleteMapping("/{pkstaff}")
    public ResponseMessage delete(@PathVariable String pkstaff) throws Exception {
        staffstyleEOService.deleteByPrimaryKey(pkstaff);
        logger.info("delete from TS_STAFFSTYLE where pkstaff = {}", pkstaff);
        return Result.success();
    }

}
