package com.phone.jse.domain;

public class PhoneBean {
	protected String call, company;

	public String getCall() {
		return call ;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//super에 의해서 정의되어 @이표시를 붙인다.
	@Override
	public String toString() {
		return String.format("%s 제픔으로 %s 에게 전화를 걸다", 
				company, call);
				
	}
	
}
