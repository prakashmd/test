/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anthem.tat.web.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author AF43847
 */
@Entity
@Table(name = "Authorizationumvtstatus", catalog = "Operationalanalytics", schema = "Utilmgmtvw")

public class AuthorizationUmvtStatus implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id

	@Basic(optional = false)
	@Column(name = "FK_UMUM_REF_ID")
	private String fkUmumRefId;
	@Basic(optional = false)
	@Column(name = "UMSV_SEQ_NO")
	private int umsvSeqNo;
	@Basic(optional = false)
	@Column(name = "UMVT_SEQ_NO")
	private int umvtSeqNo;
	@Basic(optional = false)
	@Column(name = "USUS_ID")
	private String ususId;
	@Basic(optional = false)
	@Column(name = "UMVT_STS")
	private String umvtSts;
	@Basic(optional = false)
	@Column(name = "UMVT_STS_DTM")
	@Temporal(TemporalType.DATE)
	private Date umvtStsDtm;
	@Basic(optional = false)
	@Column(name = "UMVT_MCTR_REAS")
	private String umvtMctrReas;
	@Basic(optional = false)
	@Column(name = "UMVT_LOCK_TOKEN")
	private int umvtLockToken;
	@Column(name = "ATXR_SOURCE_ID")
	private String atxrSourceId;
	@Basic(optional = false)
	@Column(name = "LAST_MODIFIED_DTM")
	@Temporal(TemporalType.DATE)
	private Date lastModifiedDtm;

	public AuthorizationUmvtStatus() {
	}

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "FK_UMUM_REF_ID", nullable = false, insertable = false, updatable = false) })
	private AuthorizationTATView authorizationTATView;

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

	@Override
	public String toString() {
		return "AuthorizationUmvtStatus [umumRefId=" + fkUmumRefId + ", umsvSeqNo=" + umsvSeqNo + ", umvtSeqNo="
				+ umvtSeqNo + ", ususId=" + ususId + ", umvtSts=" + umvtSts + ", umvtStsDtm=" + umvtStsDtm
				+ ", umvtMctrReas=" + umvtMctrReas + ", umvtLockToken=" + umvtLockToken + ", atxrSourceId="
				+ atxrSourceId + ", lastModifiedDtm=" + lastModifiedDtm + ", authorizationTATView=" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atxrSourceId == null) ? 0 : atxrSourceId.hashCode());

		result = prime * result + ((lastModifiedDtm == null) ? 0 : lastModifiedDtm.hashCode());
		result = prime * result + umsvSeqNo;
		result = prime * result + ((fkUmumRefId == null) ? 0 : fkUmumRefId.hashCode());
		result = prime * result + umvtLockToken;
		result = prime * result + ((umvtMctrReas == null) ? 0 : umvtMctrReas.hashCode());
		result = prime * result + umvtSeqNo;
		result = prime * result + ((umvtSts == null) ? 0 : umvtSts.hashCode());
		result = prime * result + ((umvtStsDtm == null) ? 0 : umvtStsDtm.hashCode());
		result = prime * result + ((ususId == null) ? 0 : ususId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorizationUmvtStatus other = (AuthorizationUmvtStatus) obj;
		if (atxrSourceId == null) {
			if (other.atxrSourceId != null)
				return false;
		} else if (!atxrSourceId.equals(other.atxrSourceId))
			return false;

		if (lastModifiedDtm == null) {
			if (other.lastModifiedDtm != null)
				return false;
		} else if (!lastModifiedDtm.equals(other.lastModifiedDtm))
			return false;
		if (umsvSeqNo != other.umsvSeqNo)
			return false;
		if (fkUmumRefId == null) {
			if (other.fkUmumRefId != null)
				return false;
		} else if (!fkUmumRefId.equals(other.fkUmumRefId))
			return false;
		if (umvtLockToken != other.umvtLockToken)
			return false;
		if (umvtMctrReas == null) {
			if (other.umvtMctrReas != null)
				return false;
		} else if (!umvtMctrReas.equals(other.umvtMctrReas))
			return false;
		if (umvtSeqNo != other.umvtSeqNo)
			return false;
		if (umvtSts == null) {
			if (other.umvtSts != null)
				return false;
		} else if (!umvtSts.equals(other.umvtSts))
			return false;
		if (umvtStsDtm == null) {
			if (other.umvtStsDtm != null)
				return false;
		} else if (!umvtStsDtm.equals(other.umvtStsDtm))
			return false;
		if (ususId == null) {
			if (other.ususId != null)
				return false;
		} else if (!ususId.equals(other.ususId))
			return false;
		return true;
	}

}
