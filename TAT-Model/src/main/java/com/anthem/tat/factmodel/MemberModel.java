package com.anthem.tat.factmodel;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MemberModel {

	private int memberid;

	private String membername;

	private String plans;
	@JsonIgnore
	private LocalDate fromdate;

	@JsonIgnore
	private LocalDate todate;

	private UmServices umServices;
	private String authType;

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getPlans() {
		return plans;
	}

	public void setPlans(String plans) {
		this.plans = plans;
	}

	public LocalDate getFromdate() {
		return fromdate;
	}

	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}

	public LocalDate getTodate() {
		return todate;
	}

	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}

	public UmServices getUmServices() {
		return umServices;
	}

	public void setUmServices(UmServices umServices) {
		this.umServices = umServices;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", membername=" + membername + ", plans=" + plans + ", fromdate="
				+ fromdate + ", todate=" + todate + ", umServices=" + umServices + ", authType=" + authType + "]";
	}

}
