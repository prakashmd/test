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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AF43847
 */
@Entity
@Table(name = "FAC_CMC_IDCD_DIAG_CD", catalog = "ODW", schema = "DW")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "FacCmcIdcdDiagCd.findAll", query = "SELECT f FROM FacCmcIdcdDiagCd f"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdId", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdId = :idcdId"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdEffDt", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdEffDt = :idcdEffDt"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdTermDt", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdTermDt = :idcdTermDt"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdDesc", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdDesc = :idcdDesc"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdIdRel", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdIdRel = :idcdIdRel"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdGenId1", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdGenId1 = :idcdGenId1"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdGenId2", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdGenId2 = :idcdGenId2"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdType", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdType = :idcdType"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByTpctMctrTcat", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.tpctMctrTcat = :tpctMctrTcat"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByMdcdIdM", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.mdcdIdM = :mdcdIdM"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByMdcdIdF", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.mdcdIdF = :mdcdIdF"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByWmdsSeqNo", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.wmdsSeqNo = :wmdsSeqNo"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdOplInd", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdOplInd = :idcdOplInd"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdAction", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdAction = :idcdAction"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByExcdId", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.excdId = :excdId"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByIdcdLockToken", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.idcdLockToken = :idcdLockToken"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByAtxrSourceId", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.atxrSourceId = :atxrSourceId"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findBySysLastUpdDtm", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.sysLastUpdDtm = :sysLastUpdDtm"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findBySysUsusId", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.sysUsusId = :sysUsusId"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findBySysDbuserId", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.sysDbuserId = :sysDbuserId"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByLastModifiedDtm", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.lastModifiedDtm = :lastModifiedDtm"),
		@NamedQuery(name = "FacCmcIdcdDiagCd.findByNoSelect", query = "SELECT f FROM FacCmcIdcdDiagCd f WHERE f.noSelect = :noSelect") })
public class FacCmcIdcdDiagCd implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ROWID")
	String rowid;

	@Basic(optional = false)
	@Column(name = "IDCD_ID", nullable = false, length = 10)
	private String idcdId;
	@Basic(optional = false)
	@Column(name = "IDCD_EFF_DT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date idcdEffDt;
	@Basic(optional = false)
	@Column(name = "IDCD_TERM_DT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date idcdTermDt;
	@Basic(optional = false)
	@Column(name = "IDCD_DESC", nullable = false, length = 228)
	private String idcdDesc;
	@Basic(optional = false)
	@Column(name = "IDCD_ID_REL", nullable = false, length = 10)
	private String idcdIdRel;
	@Basic(optional = false)
	@Column(name = "IDCD_GEN_ID_1", nullable = false, length = 12)
	private String idcdGenId1;
	@Basic(optional = false)
	@Column(name = "IDCD_GEN_ID_2", nullable = false, length = 12)
	private String idcdGenId2;
	@Basic(optional = false)
	@Column(name = "IDCD_TYPE", nullable = false, length = 1)
	private String idcdType;
	@Basic(optional = false)
	@Column(name = "TPCT_MCTR_TCAT", nullable = false, length = 1)
	private String tpctMctrTcat;
	@Basic(optional = false)
	@Column(name = "MDCD_ID_M", nullable = false, length = 2)
	private String mdcdIdM;
	@Basic(optional = false)
	@Column(name = "MDCD_ID_F", nullable = false, length = 2)
	private String mdcdIdF;
	@Basic(optional = false)
	@Column(name = "WMDS_SEQ_NO", nullable = false)
	private int wmdsSeqNo;
	@Basic(optional = false)
	@Column(name = "IDCD_OPL_IND", nullable = false, length = 1)
	private String idcdOplInd;
	@Basic(optional = false)
	@Column(name = "IDCD_ACTION", nullable = false, length = 1)
	private String idcdAction;
	@Basic(optional = false)
	@Column(name = "EXCD_ID", nullable = false, length = 3)
	private String excdId;
	@Basic(optional = false)
	@Column(name = "IDCD_LOCK_TOKEN", nullable = false)
	private int idcdLockToken;
	@Basic(optional = false)
	@Column(name = "ATXR_SOURCE_ID", nullable = false, length = 23)
	private String atxrSourceId;
	@Column(name = "SYS_LAST_UPD_DTM")
	@Temporal(TemporalType.TIMESTAMP)
	private Date sysLastUpdDtm;
	@Column(name = "SYS_USUS_ID", length = 48)
	private String sysUsusId;
	@Column(name = "SYS_DBUSER_ID", length = 48)
	private String sysDbuserId;
	@Basic(optional = false)
	@Column(name = "LAST_MODIFIED_DTM", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDtm;
	private Integer noSelect;

	public FacCmcIdcdDiagCd() {
	}

	public String getRowid() {
		return rowid;
	}

	public void setRowid(String rowid) {
		this.rowid = rowid;
	}

	public String getIdcdId() {
		return idcdId;
	}

	public void setIdcdId(String idcdId) {
		this.idcdId = idcdId;
	}

	public Date getIdcdEffDt() {
		return idcdEffDt;
	}

	public void setIdcdEffDt(Date idcdEffDt) {
		this.idcdEffDt = idcdEffDt;
	}

	public Date getIdcdTermDt() {
		return idcdTermDt;
	}

	public void setIdcdTermDt(Date idcdTermDt) {
		this.idcdTermDt = idcdTermDt;
	}

	public String getIdcdDesc() {
		return idcdDesc;
	}

	public void setIdcdDesc(String idcdDesc) {
		this.idcdDesc = idcdDesc;
	}

	public String getIdcdIdRel() {
		return idcdIdRel;
	}

	public void setIdcdIdRel(String idcdIdRel) {
		this.idcdIdRel = idcdIdRel;
	}

	public String getIdcdGenId1() {
		return idcdGenId1;
	}

	public void setIdcdGenId1(String idcdGenId1) {
		this.idcdGenId1 = idcdGenId1;
	}

	public String getIdcdGenId2() {
		return idcdGenId2;
	}

	public void setIdcdGenId2(String idcdGenId2) {
		this.idcdGenId2 = idcdGenId2;
	}

	public String getIdcdType() {
		return idcdType;
	}

	public void setIdcdType(String idcdType) {
		this.idcdType = idcdType;
	}

	public String getTpctMctrTcat() {
		return tpctMctrTcat;
	}

	public void setTpctMctrTcat(String tpctMctrTcat) {
		this.tpctMctrTcat = tpctMctrTcat;
	}

	public String getMdcdIdM() {
		return mdcdIdM;
	}

	public void setMdcdIdM(String mdcdIdM) {
		this.mdcdIdM = mdcdIdM;
	}

	public String getMdcdIdF() {
		return mdcdIdF;
	}

	public void setMdcdIdF(String mdcdIdF) {
		this.mdcdIdF = mdcdIdF;
	}

	public int getWmdsSeqNo() {
		return wmdsSeqNo;
	}

	public void setWmdsSeqNo(int wmdsSeqNo) {
		this.wmdsSeqNo = wmdsSeqNo;
	}

	public String getIdcdOplInd() {
		return idcdOplInd;
	}

	public void setIdcdOplInd(String idcdOplInd) {
		this.idcdOplInd = idcdOplInd;
	}

	public String getIdcdAction() {
		return idcdAction;
	}

	public void setIdcdAction(String idcdAction) {
		this.idcdAction = idcdAction;
	}

	public String getExcdId() {
		return excdId;
	}

	public void setExcdId(String excdId) {
		this.excdId = excdId;
	}

	public int getIdcdLockToken() {
		return idcdLockToken;
	}

	public void setIdcdLockToken(int idcdLockToken) {
		this.idcdLockToken = idcdLockToken;
	}

	public String getAtxrSourceId() {
		return atxrSourceId;
	}

	public void setAtxrSourceId(String atxrSourceId) {
		this.atxrSourceId = atxrSourceId;
	}

	public Date getSysLastUpdDtm() {
		return sysLastUpdDtm;
	}

	public void setSysLastUpdDtm(Date sysLastUpdDtm) {
		this.sysLastUpdDtm = sysLastUpdDtm;
	}

	public String getSysUsusId() {
		return sysUsusId;
	}

	public void setSysUsusId(String sysUsusId) {
		this.sysUsusId = sysUsusId;
	}

	public String getSysDbuserId() {
		return sysDbuserId;
	}

	public void setSysDbuserId(String sysDbuserId) {
		this.sysDbuserId = sysDbuserId;
	}

	public Date getLastModifiedDtm() {
		return lastModifiedDtm;
	}

	public void setLastModifiedDtm(Date lastModifiedDtm) {
		this.lastModifiedDtm = lastModifiedDtm;
	}

	public Integer getNoSelect() {
		return noSelect;
	}

	public void setNoSelect(Integer noSelect) {
		this.noSelect = noSelect;
	}

}
