package com.cg.capstore.bean;



public class CSTransactions {
	private int p_id;
	private String p_type;
	private int o_number;
	private int t_id;
	private String t_type;
	private String t_amount;
	public CSTransactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CSTransactions(int p_id, String p_type, int o_number, int t_id, String t_type, String t_amount) {
		super();
		this.p_id = p_id;
		this.p_type = p_type;
		this.o_number = o_number;
		this.t_id = t_id;
		this.t_type = t_type;
		this.t_amount = t_amount;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public int getO_number() {
		return o_number;
	}
	public void setO_number(int o_number) {
		this.o_number = o_number;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public String getT_amount() {
		return t_amount;
	}
	public void setT_amount(String t_amount) {
		this.t_amount = t_amount;
	}
	@Override
	public String toString() {
		return "CSTransactions [p_id=" + p_id + ", p_type=" + p_type + ", o_number=" + o_number + ", t_id=" + t_id
				+ ", t_type=" + t_type + ", t_amount=" + t_amount + "]";
	}
	
	
	

}
