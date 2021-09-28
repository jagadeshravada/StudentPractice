package org.boot.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("msg")
public class WishesImplManagement implements WishMessage {
	
	@Autowired
	private LocalDateTime ldt;

	@Override
	public String getWishes() {
	   int hours=ldt.getHour();
    return (hours<12)?"GoodMorning::"+hours:(hours<16)?"GoodAfternoon::"+hours:(hours<20)?"GoodEvening:"+hours:"GoodNight::"+hours;
	}

}
