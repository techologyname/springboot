package com.xj.pojo;
	/*收货地址表*/
public class Receiver_address {
	private Integer id;
    private long user_id;
    private String receive_name;
    private String three_address;
    private String other_address;
    private String tel;
    private String address_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getReceive_name() {
		return receive_name;
	}
	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}
	public String getThree_address() {
		return three_address;
	}
	public void setThree_address(String three_address) {
		this.three_address = three_address;
	}
	public String getOther_address() {
		return other_address;
	}
	public void setOther_address(String other_address) {
		this.other_address = other_address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
    
	
	
}
