package org.boot.model;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import org.springframework.stereotype.Component;

@Component("info")
@ConfigurationProperties(prefix = "ipl.crick")
@PropertySource(value = "org/boot/commons/Myprop.properties")
public class CricketerInfo {
	//@Value("${ipl.crick.id}")
	private Integer id;
	//@Value("${ipl.crick.name}")
	private String name;
	//@Value("${ipl.crick.place}")
	private String place;
	//@Value("${ipl.crick.fee}")
	 private Double matcfee;
	 private Integer mathces;
	 private String battingtype;
	 private String type;
	
	
	public CricketerInfo() {
		System.out.println("CricketerInfo.CricketerInfo()");
	}

 
	public void setId(Integer id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public void setMatcfee(Double matcfee) {
		this.matcfee = matcfee;
	}


	public void setMathces(Integer mathces) {
		this.mathces = mathces;
	}



	public void setBattingtype(String battingtype) {
		this.battingtype = battingtype;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "CricketerInfo [id=" + id + ", name=" + name + ", place=" + place + ", matcfee=" + matcfee + ", mathces="
				+ mathces + ", battingtype=" + battingtype + ", type=" + type + "]";
	}
	
}
