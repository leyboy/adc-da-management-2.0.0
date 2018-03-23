package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.WebsiteconfigurationEO;
import com.adc.da.sys.page.WebsiteconfigurationEOPage;
import com.adc.da.sys.service.WebsiteconfigurationEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/sys/websiteconfiguration")
@Api(description = "|WebsiteconfigurationEO|")
public class WebsiteconfigurationEOController extends BaseController<WebsiteconfigurationEO>{

    private static final Logger logger = LoggerFactory.getLogger(WebsiteconfigurationEOController.class);

    @Autowired
    private WebsiteconfigurationEOService websiteconfigurationEOService;

	@ApiOperation(value = "|WebsiteconfigurationEO|分页查询")
    @GetMapping("/page")
    public ResponseMessage<PageInfo<WebsiteconfigurationEO>> page(WebsiteconfigurationEOPage page) throws Exception {
        List<WebsiteconfigurationEO> rows = websiteconfigurationEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|WebsiteconfigurationEO|查询")
    @GetMapping("")
    public ResponseMessage<List<WebsiteconfigurationEO>> list(WebsiteconfigurationEOPage page) throws Exception {
        return Result.success(websiteconfigurationEOService.queryByList(page));
	}

    @ApiOperation(value = "|WebsiteconfigurationEO|详情")
    @GetMapping("/{pkWebsiteconfiguration}")
    public ResponseMessage<WebsiteconfigurationEO> find(@PathVariable String pkWebsiteconfiguration) throws Exception {
        return Result.success(websiteconfigurationEOService.selectByPrimaryKey(pkWebsiteconfiguration));
    }

    @ApiOperation(value = "|WebsiteconfigurationEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<WebsiteconfigurationEO> create(@RequestBody WebsiteconfigurationEO websiteconfigurationEO) throws Exception {
        websiteconfigurationEOService.insertSelective(websiteconfigurationEO);
        return Result.success(websiteconfigurationEO);
    }

    @ApiOperation(value = "|WebsiteconfigurationEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    public ResponseMessage<WebsiteconfigurationEO> update(@RequestBody WebsiteconfigurationEO websiteconfigurationEO) throws Exception {
        websiteconfigurationEOService.updateByPrimaryKeySelective(websiteconfigurationEO);
        return Result.success(websiteconfigurationEO);
    }

    @ApiOperation(value = "|WebsiteconfigurationEO|删除")
    @DeleteMapping("/{pkWebsiteconfiguration}")
    public ResponseMessage delete(@PathVariable String pkWebsiteconfiguration) throws Exception {
        websiteconfigurationEOService.deleteByPrimaryKey(pkWebsiteconfiguration);
        logger.info("delete from TS_WEBSITECONFIGURATION where pkWebsiteconfiguration = {}", pkWebsiteconfiguration);
        return Result.success();
    }

}
