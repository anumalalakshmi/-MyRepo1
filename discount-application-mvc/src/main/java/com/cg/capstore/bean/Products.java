package com.cg.capstore.bean;


public class Products {

	
	private int p_id;
	private String p_name;
	private String p_companyname;
	private float p_price;
	private String p_dateofmanufacturing;
	private String p_type;
	private int m_id;
	private String coupon_id;
	private int quantity;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int p_id, String p_name, String p_companyname, float p_price, String p_dateofmanufacturing,
			String p_type, int m_id, String coupon_id, int quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_companyname = p_companyname;
		this.p_price = p_price;
		this.p_dateofmanufacturing = p_dateofmanufacturing;
		this.p_type = p_type;
		this.m_id = m_id;
		this.coupon_id = coupon_id;
		this.quantity = quantity;
	}

	

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_companyname() {
		return p_companyname;
	}

	public void setP_companyname(String p_companyname) {
		this.p_companyname = p_companyname;
	}

	public float getP_price() {
		return p_price;
	}

	public void setP_price(float p_price) {
		this.p_price = p_price;
	}

	public String getP_dateofmanufacturing() {
		return p_dateofmanufacturing;
	}

	public void setP_dateofmanufacturing(String p_dateofmanufacturing) {
		this.p_dateofmanufacturing = p_dateofmanufacturing;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + p_id + ", p_name=" + p_name + ", p_companyname=" + p_companyname
				+ ", p_price=" + p_price + ", p_dateofmanufacturing=" + p_dateofmanufacturing + ", p_type=" + p_type
				+ ", m_id=" + m_id + ", coupon_id=" + coupon_id + ", quantity=" + quantity + "]";
	}

}
