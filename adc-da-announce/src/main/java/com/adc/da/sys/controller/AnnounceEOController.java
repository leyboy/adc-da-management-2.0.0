package com.adc.da.sys.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.adc.da.sys.entity.AnnounceEO;
import com.adc.da.sys.page.AnnounceEOPage;
import com.adc.da.sys.service.AnnounceEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/sys/TS_ANNOUNCE")
@Api(description = "|AnnounceEO|")
public class AnnounceEOController extends BaseController<AnnounceEO> {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(AnnounceEOController.class);

	@Autowired
	private AnnounceEOService announceEOService;

	/**
	 * 根据url分页查询
	 * **/
	@ApiOperation(value = "|AnnounceEO|分页查询", notes = "根据url分页插叙")
	@GetMapping(value="/ANNOUNCEByUrlPage")
	public ResponseMessage<PageInfo<AnnounceEO>> page(AnnounceEOPage page) throws Exception {
		List<AnnounceEO> rows = announceEOService.queryByPage(page);
		return Result.success(getPageInfo(page.getPager(), rows));
	}

	/**
	 * 分页查询通告
	 * **/
	@ApiOperation(value = "|AnnounceEO|查询")
	@GetMapping(value = "/ANNOUNCEByPage")
	public ResponseMessage<List<AnnounceEO>> list(AnnounceEOPage page) throws Exception {
		return Result.success(announceEOService.queryByList(page));
	}

	/**
	 * 添加通告
	 * **/
	@ApiOperation(value = "|AnnounceEO|新增")
	@PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = "/ANNOUNCESave")
	public ResponseMessage<AnnounceEO> create(@Valid @RequestBody AnnounceEO announceEO, BindingResult errors)
			throws Exception {
		announceEOService.insertSelective(announceEO);
		return Result.success(announceEO);
	}

	/**
	 * 修改通告
	 * **/
	@ApiOperation(value = "|AnnounceEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = "/ANNOUNCEModify")
	public ResponseMessage<AnnounceEO> modify(@Validated @RequestBody AnnounceEO announceEO, BindingResult errors)
			throws Exception {
		announceEOService.updateByPrimaryKey(announceEO);
		return Result.success("200", announceEO);
	}

	/**
	 * 发布通告,只需要将{@link AnnounceEO#setState(Integer)}=1
	 * **/
	@ApiOperation(value = "|AnnounceEO|修改")
	@PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = "/ANNOUNCERelease")
	public ResponseMessage<AnnounceEO> release(@Validated @RequestBody AnnounceEO announceEO, BindingResult errors)
			throws Exception {
		announceEOService.updateByPrimaryKeySelective(announceEO);
		return Result.success("200",announceEO);
	}
	
	/**
	 * 删除通告,只需要将{@link AnnounceEO#setDeleteflag(Integer)}=1
	 * **/
	@ApiOperation(value = "|AnnounceEO|删除")
	@DeleteMapping(consumes = APPLICATION_JSON_UTF8_VALUE, value = "/ANNOUNCEDelete")
	public ResponseMessage<AnnounceEO> delete(@Validated @RequestBody AnnounceEO announceEO, BindingResult errors)
			throws Exception {
		announceEOService.updateByPrimaryKey(announceEO);
		return Result.success("200",announceEO);
	}
}
