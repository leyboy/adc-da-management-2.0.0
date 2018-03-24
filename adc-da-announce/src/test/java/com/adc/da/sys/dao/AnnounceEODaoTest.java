package com.adc.da.sys.dao;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.adc.da.sys.page.AnnounceEOPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adc.da.sys.dao.AnnounceEODao;
import com.adc.da.sys.entity.AnnounceEO;
import com.adc.da.util.utils.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages={"com.adc.da..*.dao"})
public class AnnounceEODaoTest {

	@Autowired
	AnnounceEODao announceEODao;

	private static AnnounceEOPage announceEOPage;

	static {
		announceEOPage=new AnnounceEOPage();
	}
	
	@Test
	public void testGetAnnounceByPk(){
		System.out.println(UUID.randomUUID());
	}
	
	
	@Test
	public void tesSelectAnnounceByPrimaryKey(){
		String pkAnnounce="f4a00f1e50e44feeae200dd75eaa8078";
		System.out.println(announceEODao.selectByPrimaryKey(pkAnnounce));
	}


	@Test
	public void testSaveAnnounce(){
		AnnounceEO announceEO=new AnnounceEO();
		announceEO.setPkAnnounce(UUID.randomUUID());
		announceEO.setAnnounCecreator("孙一川");
		announceEO.setContent1("哈哈哈");
		announceEO.setCreateTime(new Date(System.currentTimeMillis()));
		announceEO.setExpriyTime(new Date(System.currentTimeMillis()));
		announceEO.setTitle1("孙一川");
		announceEO.setState1(0);
		announceEODao.insertSelective(announceEO);
	}


	@Test
	public void testDeleteAnnoucne(){
		String pkAnnounce="f4a00f1e50e44feeae200dd75eaa8078";
		announceEODao.deleteByPrimaryKey(pkAnnounce);
	}

	@Test
	public void testQueryByCount(){
		System.out.println(announceEODao.queryByPage(announceEOPage).size());
	}
}
