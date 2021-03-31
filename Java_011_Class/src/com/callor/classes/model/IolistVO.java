package com.callor.classes.model;
/*
 * 1. 매입매출 관리 프로젝트를 시작
 * 2. 매입매출 프로젝트에서 사용할 VO클래스 설계
 * 3. 매입 : 회사에서 판매를 목적으로 물품을 구입
 * 4. 매출 : 회사에서 상품을 고객에게 판매
 * 5. 매입매출 관리를 위해
 * 		상품이름, 거래일자, 거래처, 매입매출구분, 수량, 매입단가, 매출단가
 * 		데이터가 필요
 * 6. 수량, 매입단가, 매출단가는 곱셈연산이 필요
 * 7. 적절한 데이터 type을 선정하여 클래스 만들기
 */
public class IolistVO {

	private String sname;
	private Integer date;
	private String account;
	private Integer bought;
	private Integer sold;
	private Integer num;
	private Integer bprice;
	private Integer sprice;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getBought() {
		return bought;
	}
	public void setBought(Integer bought) {
		this.bought = bought;
	}
	public Integer getSold() {
		return sold;
	}
	public void setSold(Integer sold) {
		this.sold = sold;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getBprice() {
		return bprice;
	}
	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}
	public Integer getSprice() {
		return sprice;
	}
	public void setSprice(Integer sprice) {
		this.sprice = sprice;
	}
	
	
}
