package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.adc.da.sys.util.BindingResultUtils;
import com.adc.da.sys.util.ResultError;
import com.adc.da.util.utils.DateUtils;
import com.adc.da.util.utils.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;


import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.AnnounceEO;
import com.adc.da.sys.page.AnnounceEOPage;
import com.adc.da.sys.service.AnnounceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/sys/TS_ANNOUNCE")
@Api(description = "|AnnounceEO|")
public class AnnounceEOController extends BaseController<AnnounceEO>{

    private static final Logger logger = LoggerFactory.getLogger(AnnounceEOController.class);

    @Autowired
    private AnnounceEOService announceEOService;

	@ApiOperation(value = "|AnnounceEO|分页查询")
    @GetMapping("WEBSITECONFIGURATION/PCWEBSITECONFIGURATIONSelect/page")
    public ResponseMessage<PageInfo<AnnounceEO>> page(AnnounceEOPage page) throws Exception {
        List<AnnounceEO> rows = announceEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|AnnounceEO|查询")
    @GetMapping("")
    public ResponseMessage<List<AnnounceEO>> list(AnnounceEOPage page) throws Exception {
        return Result.success(announceEOService.queryByList(page));
	}

    @ApiOperation(value = "|AnnounceEO|详情")
    @GetMapping(value = {"WEBSITECONFIGURATION/PCWEBSITECONFIGURATIONSelect/{pkAnnounce}",
            "WEBSITECONFIGURATION/MoveWEBSITECONFIGURATIONSelect/{pkAnnounce}"})
    public ResponseMessage<AnnounceEO> find(@PathVariable String pkAnnounce) throws Exception {
        return Result.success(announceEOService.selectByPrimaryKey(pkAnnounce));
    }

    /**
     *
     * **/
    @ApiOperation(value = "|AnnounceEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE,value = "/ANNOUNCESave")
    public ResponseMessage<?> create(@Validated @RequestBody AnnounceEO announceEO, BindingResult errors) throws Exception {
        if(errors.hasErrors()){
            return BindingResultUtils.bindingResult(errors);
        }else{
            announceEO.setPkAnnounce(UUID.randomUUID());
            announceEO.setCreateTime(new Date(System.currentTimeMillis()));
            logger.info(announceEO.toString());
            announceEOService.insertSelective(announceEO);
            return Result.success(announceEO);
        }
    }

    @ApiOperation(value = "|AnnounceEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE,value = {"/ANNOUNCEModify","/ANNOUNCERelease"})
    public ResponseMessage<?> update(@Validated @RequestBody  AnnounceEO announceEO,BindingResult errors) throws Exception {
        if(errors.hasErrors()){
            return BindingResultUtils.bindingResult(errors);
        }else{
            announceEOService.updateByPrimaryKeySelective(announceEO);
            return Result.success(announceEO);
        }
    }


    @ApiOperation(value = "|AnnounceEO|删除")
    @DeleteMapping("/{pkAnnounce}")
    public ResponseMessage delete(@PathVariable String pkAnnounce) throws Exception {
        announceEOService.deleteByPrimaryKey(pkAnnounce);
        logger.info("delete from TS_ANNOUNCE where pkAnnounce = {}", pkAnnounce);
        return Result.success();
    }
}
