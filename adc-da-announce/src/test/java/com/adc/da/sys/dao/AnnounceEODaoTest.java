package com.adc.da.sys.dao;

import java.util.Date;

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
	
	@Test
	public void testGetAnnounceByPk(){
		System.out.println(UUID.randomUUID());
	}
	
	
	@Test
	public void testSaveAnnounce(){

	}
}
