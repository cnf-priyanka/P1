package com.priya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DISTRICT")
public class District {
	@Id
	@Column(name="DISTRICT_ID")
	private Integer districtid;
	@Column(name="districtname")
	private String districtname;
	public Integer getDistrictid() {
		return districtid;
	}
	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	@Override
	public String toString() {
		return "District [districtid=" + districtid + ", districtname="
				+ districtname + "]";
	}
	
	}


