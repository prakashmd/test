/**
 * 
 */
package com.anthem.tat.DTO;

import java.util.Date;

/**
 * @author AF43847
 *
 */
public class UmvtStatusDTO {

	private static final long serialVersionUID = 1L;

	private String fkUmumRefId;
	private int umsvSeqNo;
	private int umvtSeqNo;
	private String ususId;
	private String umvtSts;
	private Date umvtStsDtm;
	private String umvtMctrReas;
	private int umvtLockToken;
	private String atxrSourceId;
	private Date lastModifiedDtm;

	public String getFkUmumRefId() {
		return fkUmumRefId;
	}

	public void setFkUmumRefId(String fkUmumRefId) {
		this.fkUmumRefId = fkUmumRefId;
	}

	public int getUmsvSeqNo() {
		return umsvSeqNo;
	}

	public void setUmsvSeqNo(int umsvSeqNo) {
		this.umsvSeqNo = umsvSeqNo;
	}

	public int getUmvtSeqNo() {
		return umvtSeqNo;
	}

	public void setUmvtSeqNo(int umvtSeqNo) {
		this.umvtSeqNo = umvtSeqNo;
	}

	public String getUsusId() {
		return ususId;
	}

	public void setUsusId(String ususId) {
		this.ususId = ususId;
	}

	public String getUmvtSts() {
		return umvtSts;
	}

	public void setUmvtSts(String umvtSts) {
		this.umvtSts = umvtSts;
	}

	public Date getUmvtStsDtm() {
		return umvtStsDtm;
	}

	public void setUmvtStsDtm(Date umvtStsDtm) {
		this.umvtStsDtm = umvtStsDtm;
	}

	public String getUmvtMctrReas() {
		return umvtMctrReas;
	}

	public void setUmvtMctrReas(String umvtMctrReas) {
		this.umvtMctrReas = umvtMctrReas;
	}

	public int getUmvtLockToken() {
		return umvtLockToken;
	}

	public void setUmvtLockToken(int umvtLockToken) {
		this.umvtLockToken = umvtLockToken;
	}

	public String getAtxrSourceId() {
		return atxrSourceId;
	}

	public void setAtxrSourceId(String atxrSourceId) {
		this.atxrSourceId = atxrSourceId;
	}

	public Date getLastModifiedDtm() {
		return lastModifiedDtm;
	}

	public void setLastModifiedDtm(Date lastModifiedDtm) {
		this.lastModifiedDtm = lastModifiedDtm;
	}

}
