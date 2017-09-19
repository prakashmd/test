package com.anthem.tat.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author AF43847
 *
 */
@Entity
@Table(name = "Member", catalog = "Operationalanalytics", schema = "dbo")
// @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property =
// "data")

public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Member() {

	}

	@Id
	private int memberid;
	@Column(name = "Membername")
	private String membername;
	@Column(name = "Plans")
	String plans;

	@Column(name = "Fromdate")
	@Temporal(TemporalType.DATE)
	private Date fromdate;

	@Column(name = "Todate")
	@Temporal(TemporalType.DATE)
	private Date todate;

	@Column(name = "Expediteflag")
	private String expediteflag;
	@Column(name = "Type")
	private String type;
	@Column(name = "Meetexpedite")
	private String meetexpedite;
	@Column(name = "Extensionrequest")
	private String extentionreq;
	@Column(name = "Extensiondenied")
	private String extensiondenied;

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

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public String getExpediteflag() {
		return expediteflag;
	}

	public void setExpediteflag(String expediteflag) {
		this.expediteflag = expediteflag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMeetexpedite() {
		return meetexpedite;
	}

	public void setMeetexpedite(String meetexpedite) {
		this.meetexpedite = meetexpedite;
	}

	public String getExtentionreq() {
		return extentionreq;
	}

	public void setExtentionreq(String extentionreq) {
		this.extentionreq = extentionreq;
	}

	public String getExtensiondenied() {
		return extensiondenied;
	}

	public void setExtensiondenied(String extensiondenied) {
		this.extensiondenied = extensiondenied;
	}

	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", membername=" + membername + ", plans=" + plans + ", fromdate="
				+ fromdate + ", todate=" + todate + ", expediteflag=" + expediteflag + ", type=" + type
				+ ", meetexpedite=" + meetexpedite + ", extentionreq=" + extentionreq + ", extensiondenied="
				+ extensiondenied + "]";
	}

}
