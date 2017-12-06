package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {

	public static void main(String[] args) {
		CelPhoneBean celPhoneBean = null;
		PhoneBean phone = null;
		IphoneBean iPhoneBean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료 "
					+ "1.일반전화 "
					+ "2.휴대폰"
					+ "3.아이폰"
					+ "")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
			case "1" :
				// 어디 제품? -> 금성전화기
				//누구에게 겁니까? - >
				// [금성] 제품으로, [ㅁㅁㅁ]에게 전화를 걸다.
				phone = new IphoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				phone.setCall(JOptionPane.showInputDialog("누구에게 전화를 거시겠습니까?"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case "2" :
				//휴대폰 맞습니까?(맞으면 true, 틀리면 false)
				//누구에게 겁니까?
				//노키아 휴대폰을 가지고,이동하면서 홍길동에게 전화를 걸다.
				celPhoneBean = new CelPhoneBean();//다시해

				celPhoneBean.setMove(JOptionPane.showInputDialog("휴대폰이 맞습니까? (맞으면 y, 틀리면 n " )
						.equals("y") ? "이동중에" : "정지중에");
				
						
				
				celPhoneBean.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				celPhoneBean.setCall(JOptionPane.showInputDialog("누구에게 전화를 거시겠습니까?"));
				JOptionPane.showMessageDialog(null, 
						celPhoneBean.toString());
				return;
					
			case "3" :
				//누구에게 문자 보냅니까?
				/*
				 [스마트폰]이기 때문에 [이동] 상태에서 [아이폰] 으로 [홍기동] 에게
				 [안녕] 이라고 문자를 보냄
				 * */
				
				iPhoneBean = new IphoneBean();

				iPhoneBean.setCall(JOptionPane.showInputDialog("누구에게 문자를 보냅니까?"));
				iPhoneBean.setData(JOptionPane.showInputDialog("대화내용 입력"));
				JOptionPane.showMessageDialog(null, iPhoneBean.toString());
				
				
				return;
			}
		}
	}
}
