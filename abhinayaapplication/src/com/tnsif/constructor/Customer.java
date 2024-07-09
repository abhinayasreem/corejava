package com.tnsif.constructor;

public class Customer {
	private String cname ;
	private int cid;
	private String caddress;
	public Customer() {
	
	//default constructor
	}
	public Customer(String name,int id,String address)

	{
		this.cname=cname;
		this.cid=cid;
		this.caddress=caddress;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return the caddress
	 */
	public String getCaddress() {
		return caddress;
	}
	/**
	 * @param caddress the caddress to set
	 */
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

		
		
	
public String toString() {
	return "Customer [cname=" +cname+ ",cid="+cid+",caddress="+caddress+"]";
	
}
	
}
 