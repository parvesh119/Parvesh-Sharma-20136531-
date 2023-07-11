package com;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;

@Entity
public class Customer {

	@Id
	private int cid;
    private String cname;
    private String place;
    private String PAN;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String PAN) {
		this.PAN = PAN;
	}
}
