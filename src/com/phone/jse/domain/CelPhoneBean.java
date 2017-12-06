package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	
	protected String move;
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	//super에 의해서 정의되어 @이표시를 붙인다.
		@Override
		public String toString() {
			return String.format("%s 제품으로 %s %s 에게 전화를 걸다", 
					company,move,call);
					
		}
}
