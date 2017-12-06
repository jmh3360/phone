package com.phone.jse.domain;

public class IphoneBean extends CelPhoneBean{
	private String data;
	private final static String KIND = "스마트폰"
			,BRAND = "아이폰";
	
	@Override
	public String toString() {
		return String.format("%s 이기 때문에 %s 상태에서 "
				+ "%s 으로 %s 에게 %s 이라고 문자를 보냄", KIND,
				move, BRAND, call, data);
	}
	/*@Override  get move를 그냥 내려 받을때 작성한다. toString에서 슈퍼로 작성시
	 * 바뀌지 않늗다.
	public String getMove() {
		return "이동중";
	}*/
	public void setData(String data) {
		setMove("이동중");
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public static String getKind() {
		return KIND;
	}
	public static String getBrand() {
		return BRAND;
	}
	
}


