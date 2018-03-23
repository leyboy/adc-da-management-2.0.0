package com.adc.da.sys;

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
		AnnounceEO announceEO=new AnnounceEO();
		announceEO.setAnnouncecreator("我的世界");
		announceEO.setContent("你错了");
		announceEO.setState(0);
		announceEO.setCreatetime(new Date(System.currentTimeMillis()));
		announceEO.setExpriytime(new Date(System.currentTimeMillis()*2));
		announceEO.setPkannounce(UUID.randomUUID());
		announceEO.setTitle("我的");
		announceEODao.insertSelective(announceEO);
	}
}
