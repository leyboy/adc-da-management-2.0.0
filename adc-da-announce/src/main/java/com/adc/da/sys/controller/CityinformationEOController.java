package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.CityinformationEO;
import com.adc.da.sys.page.CityinformationEOPage;
import com.adc.da.sys.service.CityinformationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/${restPath}/sys/cityinformation")
@Api(description = "|CityinformationEO|")
public class CityinformationEOController extends BaseController<CityinformationEO>{

    private static final Logger logger = LoggerFactory.getLogger(CityinformationEOController.class);

    @Autowired
    private CityinformationEOService cityinformationEOService;

	@ApiOperation(value = "|CityinformationEO|分页查询")
    @GetMapping("/page")
    public ResponseMessage<PageInfo<CityinformationEO>> page(CityinformationEOPage page) throws Exception {
        List<CityinformationEO> rows = cityinformationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|CityinformationEO|查询")
    @GetMapping("")
    public ResponseMessage<List<CityinformationEO>> list(CityinformationEOPage page) throws Exception {
        return Result.success(cityinformationEOService.queryByList(page));
	}

    @ApiOperation(value = "|CityinformationEO|详情")
    @GetMapping("/{pkcity}")
    public ResponseMessage<CityinformationEO> find(@PathVariable String pkcity) throws Exception {
        return Result.success(cityinformationEOService.selectByPrimaryKey(pkcity));
    }

    @ApiOperation(value = "|CityinformationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<CityinformationEO> create(@RequestBody CityinformationEO cityinformationEO) throws Exception {
        cityinformationEOService.insertSelective(cityinformationEO);
        return Result.success(cityinformationEO);
    }

    @ApiOperation(value = "|CityinformationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<CityinformationEO> update(@RequestBody CityinformationEO cityinformationEO) throws Exception {
        cityinformationEOService.updateByPrimaryKeySelective(cityinformationEO);
        return Result.success(cityinformationEO);
    }

    @ApiOperation(value = "|CityinformationEO|删除")
    @DeleteMapping("/{pkcity}")
    public ResponseMessage delete(@PathVariable String pkcity) throws Exception {
        cityinformationEOService.deleteByPrimaryKey(pkcity);
        logger.info("delete from TS_CITYINFORMATION where pkcity = {}", pkcity);
        return Result.success();
    }

}
