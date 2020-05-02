package com.xdclass.userapp;

import com.xdclass.userapp.domain.TCoupon;
import com.xdclass.userapp.mapper.TCouponMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@SpringBootTest
class UserAppApplicationTests {

	@Resource
	private TCouponMapper tCouponMapper;

	@Test
	public void insert(){
		for (int i = 0; i < 100000; i++) {
			TCoupon tCoupon = new TCoupon();
			tCoupon.setAchieveAmount(500);
			tCoupon.setReduceAmount(30);
			tCoupon.setCreateTime(new Date());
			tCoupon.setCode(UUID.randomUUID().toString());
			tCoupon.setPicUrl("1.jpg");
			tCoupon.setStatus(1);
			tCoupon.setStock(100);
			tCoupon.setTitle("测试Coupon");
			tCouponMapper.insert(tCoupon);
		}
	}


	@Test
	void contextLoads() {
	}

}
