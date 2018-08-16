package com.cg.capstore.bean;




public class Coupons {
	
	private int coupon_id;
	private int discount;
	private String expirydate;
	private int m_id;
	private int c_id;
	private String p_type;

	public Coupons() {
		super();
	}

	public Coupons(int coupon_id, int discount, String expirydate, int m_id, int c_id, String p_type) {
		super();
		this.coupon_id = coupon_id;
		this.discount = discount;
		this.expirydate = expirydate;
		this.m_id = m_id;
		this.c_id = c_id;
		this.p_type = p_type;
	}

	public int getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	@Override
	public String toString() {
		return "Coupons [coupon_id=" + coupon_id + ", discount=" + discount + ", expirydate=" + expirydate + ", m_id="
				+ m_id + ", c_id=" + c_id + ", p_type=" + p_type + "]";
	}

}
