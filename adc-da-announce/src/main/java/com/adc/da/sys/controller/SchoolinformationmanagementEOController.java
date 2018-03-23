package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.SchoolinformationmanagementEO;
import com.adc.da.sys.page.SchoolinformationmanagementEOPage;
import com.adc.da.sys.service.SchoolinformationmanagementEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/${restPath}/sys/schoolinformationmanagement")
@Api(description = "|SchoolinformationmanagementEO|")
public class SchoolinformationmanagementEOController extends BaseController<SchoolinformationmanagementEO>{

    private static final Logger logger = LoggerFactory.getLogger(SchoolinformationmanagementEOController.class);

    @Autowired
    private SchoolinformationmanagementEOService schoolinformationmanagementEOService;

	@ApiOperation(value = "|SchoolinformationmanagementEO|分页查询")
    @GetMapping("/page")
    public ResponseMessage<PageInfo<SchoolinformationmanagementEO>> page(SchoolinformationmanagementEOPage page) throws Exception {
        List<SchoolinformationmanagementEO> rows = schoolinformationmanagementEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|SchoolinformationmanagementEO|查询")
    @GetMapping("")
    public ResponseMessage<List<SchoolinformationmanagementEO>> list(SchoolinformationmanagementEOPage page) throws Exception {
        return Result.success(schoolinformationmanagementEOService.queryByList(page));
	}

    @ApiOperation(value = "|SchoolinformationmanagementEO|详情")
    @GetMapping("/{pkschoolinformation}")
    public ResponseMessage<SchoolinformationmanagementEO> find(@PathVariable String pkschoolinformation) throws Exception {
        return Result.success(schoolinformationmanagementEOService.selectByPrimaryKey(pkschoolinformation));
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<SchoolinformationmanagementEO> create(@RequestBody SchoolinformationmanagementEO schoolinformationmanagementEO) throws Exception {
        schoolinformationmanagementEOService.insertSelective(schoolinformationmanagementEO);
        return Result.success(schoolinformationmanagementEO);
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<SchoolinformationmanagementEO> update(@RequestBody SchoolinformationmanagementEO schoolinformationmanagementEO) throws Exception {
        schoolinformationmanagementEOService.updateByPrimaryKeySelective(schoolinformationmanagementEO);
        return Result.success(schoolinformationmanagementEO);
    }

    @ApiOperation(value = "|SchoolinformationmanagementEO|删除")
    @DeleteMapping("/{pkschoolinformation}")
    public ResponseMessage delete(@PathVariable String pkschoolinformation) throws Exception {
        schoolinformationmanagementEOService.deleteByPrimaryKey(pkschoolinformation);
        logger.info("delete from TS_SCHOOLINFORMATIONMANAGEMENT where pkschoolinformation = {}", pkschoolinformation);
        return Result.success();
    }

}
