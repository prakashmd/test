/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anthem.tat.web.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AF43847 Prakash
 */
@Entity
@Table(name = "AuthorizationTATDev", catalog = "Operationalanalytics", schema = "Utilmgmtvw")
@XmlRootElement
/*
 * @NamedQueries({ @NamedQuery(name = "AuthorizationTATView.findAll", query =
 * "SELECT a FROM AuthorizationTATView a"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByUmumRefId", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.umumRefId = :umumRefId"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByUmsvSeqNo", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.umsvSeqNo = :umsvSeqNo"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByMemeCk", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.memeCk = :memeCk"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findBySegrId", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.segrId = :segrId"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByAuthCategory", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.authCategory = :authCategory"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByUmsvRecdDt", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.umsvRecdDt = :umsvRecdDt"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByOrdDt", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.ordDt = :ordDt"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByUmsvToDt", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.umsvToDt = :umsvToDt"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByUmvtStsDtm", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.umvtStsDtm = :umvtStsDtm"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByExpediteReq", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.expediteReq = :expediteReq"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByMeetExpedite", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.meetExpedite = :meetExpedite"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByExtRequested", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.extRequested = :extRequested"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByExtDenied", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.extDenied = :extDenied"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByProductDesc", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.productDesc = :productDesc"),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByProductLineDesc", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.productLineDesc = :productLineDesc"
 * ),
 * 
 * @NamedQuery(name = "AuthorizationTATView.findByPldsDesc", query =
 * "SELECT a FROM AuthorizationTATView a WHERE a.pldsDesc = :pldsDesc") })
 */public class AuthorizationTATView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "UMUM_REF_ID", nullable = false, length = 9)
	private String umumRefId;
	@Basic(optional = false)
	@Column(name = "MEME_CK", nullable = false)
	private long memeCk;
	@Basic(optional = false)
	@Column(name = "MEME_FIRST_NAME", nullable = false)
	private String memeFirstName;

	@Basic(optional = false)
	@Column(name = "UMSV_SEQ_NO", nullable = false)
	private int umsvSeqNo;

	@Basic(optional = false)
	@Column(name = "SEGR_ID", nullable = false, length = 4)
	private String segrId;
	@Basic(optional = false)
	@Column(nullable = false, length = 2)
	private String authcategory;
	@Basic(optional = false)
	@Column(name = "UMSV_RECD_DT", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date umsvrecddt;
	@Column(name = "ORD_DT")
	@Temporal(TemporalType.DATE)
	private Date orddt;
	@Basic(optional = false)
	@Column(name = "UMSV_TO_DT", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date umsvtodt;

	@Basic(optional = false)
	@Column(name = "UMSV_FROM_DT", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date umsvfromdt;
	@Basic(optional = false)
	@Column(name = "UMVT_STS_DTM", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date umvtstsdtm;
	@Column(name = "EXPEDITE_REQ", length = 1)
	private String expeditereq;
	@Column(name = "MEET_EXPEDITE", length = 1)
	private String meetexpedite;
	@Column(name = "EXT_REQUESTED", length = 1)
	private String extRequested;
	@Column(name = "EXT_DENIED", length = 1)
	private String extdenied;
	@Column(name = "MEMBER_PLAN")
	private String memberplan;
	@Column(name = "PRODUCT_DESC", length = 100)
	private String productdesc;
	@Column(name = "PRODUCT_LINE_DESC", length = 11)
	private String productlinedesc;
	@Column(name = "PLDS_DESC", length = 70)
	private String pldsdesc;

	@Column(name = "REASONLIST", length = 500)

	private String reasonlist;

	@Transient
	@Temporal(TemporalType.DATE)
	private Date receveivedDate;

	@Column(name = "Searchdate")
	@Temporal(TemporalType.DATE)
	private Date searchdate;

	// @OneToMany
	// @JoinTable(name = "authorizationumvtstatus", joinColumns =
	// @JoinColumn(name = "FK_UMUM_REF_ID"))
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "authorizationTATView")
	private Set<AuthorizationUmvtStatus> authorizationUmvtStatus;

	public AuthorizationTATView() {
	}

	public long getMemeCk() {
		return memeCk;
	}

	public Set<AuthorizationUmvtStatus> getAuthorizationUmvtStatus() {
		return authorizationUmvtStatus;
	}

	public void setAuthorizationUmvtStatus(Set<AuthorizationUmvtStatus> authorizationUmvtStatus) {
		this.authorizationUmvtStatus = authorizationUmvtStatus;
	}

	public void setMemeCk(long memeCk) {
		this.memeCk = memeCk;
	}

	public String getUmumRefId() {
		return umumRefId;
	}

	public void setUmumRefId(String umumRefId) {
		this.umumRefId = umumRefId;
	}

	public int getUmsvSeqNo() {
		return umsvSeqNo;
	}

	public void setUmsvSeqNo(int umsvSeqNo) {
		this.umsvSeqNo = umsvSeqNo;
	}

	public String getSegrId() {
		return segrId;
	}

	public void setSegrId(String segrId) {
		this.segrId = segrId;
	}

	public String getAuthcategory() {
		return authcategory;
	}

	public void setAuthcategory(String authcategory) {
		this.authcategory = authcategory;
	}

	public Date getUmsvrecddt() {
		return umsvrecddt;
	}

	public void setUmsvrecddt(Date umsvrecddt) {
		this.umsvrecddt = umsvrecddt;
	}

	public Date getOrddt() {
		return orddt;
	}

	public void setOrddt(Date orddt) {
		this.orddt = orddt;
	}

	public Date getUmsvtodt() {
		return umsvtodt;
	}

	public void setUmsvtodt(Date umsvtodt) {
		this.umsvtodt = umsvtodt;
	}

	public Date getUmvtstsdtm() {
		return umvtstsdtm;
	}

	public void setUmvtstsdtm(Date umvtstsdtm) {
		this.umvtstsdtm = umvtstsdtm;
	}

	public String getExpeditereq() {
		return expeditereq;
	}

	public void setExpeditereq(String expeditereq) {
		this.expeditereq = expeditereq;
	}

	public String getMeetexpedite() {
		return meetexpedite;
	}

	public void setMeetexpedite(String meetexpedite) {
		this.meetexpedite = meetexpedite;
	}

	public String getExtRequested() {
		return extRequested;
	}

	public void setExtRequested(String extRequested) {
		this.extRequested = extRequested;
	}

	public String getExtdenied() {
		return extdenied;
	}

	public void setExtdenied(String extdenied) {
		this.extdenied = extdenied;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public String getProductlinedesc() {
		return productlinedesc;
	}

	public void setProductlinedesc(String productlinedesc) {
		this.productlinedesc = productlinedesc;
	}

	public String getPldsdesc() {
		return pldsdesc;
	}

	public void setPldsdesc(String pldsdesc) {
		this.pldsdesc = pldsdesc;
	}

	public String getMemberplan() {
		return memberplan;
	}

	public void setMemberplan(String memberplan) {
		this.memberplan = memberplan;
	}

	public Date getReceveivedDate() {
		if (getOrddt() == null) {
			this.receveivedDate = getUmsvrecddt();

		} else {
			this.receveivedDate = getOrddt();
		}

		return receveivedDate;
	}

	// Doing the logic here
	public void setReceveivedDate(Date receveivedDate) {

		this.receveivedDate = receveivedDate;

	}

	public String getMemeFirstName() {
		return memeFirstName;
	}

	public void setMemeFirstName(String memeFirstName) {
		this.memeFirstName = memeFirstName;
	}

	public Date getSearchdate() {
		return searchdate;
	}

	public void setSearchdate(Date searchdate) {
		this.searchdate = searchdate;
	}

	public Date getUmsvfromdt() {
		return umsvfromdt;
	}

	public void setUmsvfromdt(Date umsvfromdt) {
		this.umsvfromdt = umsvfromdt;
	}

	public String getReasonlist() {

		/*
		 * StringBuffer reasoncodeList = new StringBuffer(); for
		 * (AuthorizationUmvtStatus authstatus : getAuthorizationUmvtStatus()) {
		 * reasoncodeList.append(authstatus.getUmvtMctrReas());
		 * System.out.println("List ::-->+authstatus.getUmvtMctrReas()==" +
		 * authstatus.getUmvtMctrReas()); }
		 * System.out.println("List ::-->reasoncodeList==" + reasoncodeList);
		 * return reasoncodeList.toString();
		 */

		return reasonlist;
	}

	public void setReasonlist(String reasonlist) {
		this.reasonlist = reasonlist;
	}

	/*
	 * public String getReasonlist1() { return reasonlist1; }
	 * 
	 * public void setReasonlist1(String reasonlist1) { this.reasonlist1 =
	 * reasonlist1; }
	 */

	@Override
	public String toString() {
		return "AuthorizationTATView [umumRefId=" + umumRefId + ", memeCk=" + memeCk + ", memeFirstName="
				+ memeFirstName + ", umsvSeqNo=" + umsvSeqNo + ", segrId=" + segrId + ", authcategory=" + authcategory
				+ ", umsvrecddt=" + umsvrecddt + ", orddt=" + orddt + ", umsvtodt=" + umsvtodt + ", umsvfromdt="
				+ umsvfromdt + ", umvtstsdtm=" + umvtstsdtm + ", expeditereq=" + expeditereq + ", meetexpedite="
				+ meetexpedite + ", extRequested=" + extRequested + ", extdenied=" + extdenied + ", memberplan="
				+ memberplan + ", productdesc=" + productdesc + ", productlinedesc=" + productlinedesc + ", pldsdesc="
				+ pldsdesc + ", reasonlist=" + reasonlist + ", receveivedDate=" + receveivedDate + ", searchdate="
				+ searchdate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authcategory == null) ? 0 : authcategory.hashCode());
		result = prime * result + ((expeditereq == null) ? 0 : expeditereq.hashCode());
		result = prime * result + ((extRequested == null) ? 0 : extRequested.hashCode());
		result = prime * result + ((extdenied == null) ? 0 : extdenied.hashCode());
		result = prime * result + ((meetexpedite == null) ? 0 : meetexpedite.hashCode());
		result = prime * result + ((memberplan == null) ? 0 : memberplan.hashCode());
		result = prime * result + (int) (memeCk ^ (memeCk >>> 32));
		result = prime * result + ((memeFirstName == null) ? 0 : memeFirstName.hashCode());
		result = prime * result + ((orddt == null) ? 0 : orddt.hashCode());
		result = prime * result + ((pldsdesc == null) ? 0 : pldsdesc.hashCode());
		result = prime * result + ((productdesc == null) ? 0 : productdesc.hashCode());
		result = prime * result + ((productlinedesc == null) ? 0 : productlinedesc.hashCode());
		result = prime * result + ((reasonlist == null) ? 0 : reasonlist.hashCode());
		result = prime * result + ((receveivedDate == null) ? 0 : receveivedDate.hashCode());
		result = prime * result + ((searchdate == null) ? 0 : searchdate.hashCode());
		result = prime * result + ((segrId == null) ? 0 : segrId.hashCode());
		result = prime * result + umsvSeqNo;
		result = prime * result + ((umsvfromdt == null) ? 0 : umsvfromdt.hashCode());
		result = prime * result + ((umsvrecddt == null) ? 0 : umsvrecddt.hashCode());
		result = prime * result + ((umsvtodt == null) ? 0 : umsvtodt.hashCode());
		result = prime * result + ((umumRefId == null) ? 0 : umumRefId.hashCode());
		result = prime * result + ((umvtstsdtm == null) ? 0 : umvtstsdtm.hashCode());
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
		AuthorizationTATView other = (AuthorizationTATView) obj;
		if (authcategory == null) {
			if (other.authcategory != null)
				return false;
		} else if (!authcategory.equals(other.authcategory))
			return false;
		if (expeditereq == null) {
			if (other.expeditereq != null)
				return false;
		} else if (!expeditereq.equals(other.expeditereq))
			return false;
		if (extRequested == null) {
			if (other.extRequested != null)
				return false;
		} else if (!extRequested.equals(other.extRequested))
			return false;
		if (extdenied == null) {
			if (other.extdenied != null)
				return false;
		} else if (!extdenied.equals(other.extdenied))
			return false;
		if (meetexpedite == null) {
			if (other.meetexpedite != null)
				return false;
		} else if (!meetexpedite.equals(other.meetexpedite))
			return false;
		if (memberplan == null) {
			if (other.memberplan != null)
				return false;
		} else if (!memberplan.equals(other.memberplan))
			return false;
		if (memeCk != other.memeCk)
			return false;
		if (memeFirstName == null) {
			if (other.memeFirstName != null)
				return false;
		} else if (!memeFirstName.equals(other.memeFirstName))
			return false;
		if (orddt == null) {
			if (other.orddt != null)
				return false;
		} else if (!orddt.equals(other.orddt))
			return false;
		if (pldsdesc == null) {
			if (other.pldsdesc != null)
				return false;
		} else if (!pldsdesc.equals(other.pldsdesc))
			return false;
		if (productdesc == null) {
			if (other.productdesc != null)
				return false;
		} else if (!productdesc.equals(other.productdesc))
			return false;
		if (productlinedesc == null) {
			if (other.productlinedesc != null)
				return false;
		} else if (!productlinedesc.equals(other.productlinedesc))
			return false;
		if (reasonlist == null) {
			if (other.reasonlist != null)
				return false;
		} else if (!reasonlist.equals(other.reasonlist))
			return false;
		if (receveivedDate == null) {
			if (other.receveivedDate != null)
				return false;
		} else if (!receveivedDate.equals(other.receveivedDate))
			return false;
		if (searchdate == null) {
			if (other.searchdate != null)
				return false;
		} else if (!searchdate.equals(other.searchdate))
			return false;
		if (segrId == null) {
			if (other.segrId != null)
				return false;
		} else if (!segrId.equals(other.segrId))
			return false;
		if (umsvSeqNo != other.umsvSeqNo)
			return false;
		if (umsvfromdt == null) {
			if (other.umsvfromdt != null)
				return false;
		} else if (!umsvfromdt.equals(other.umsvfromdt))
			return false;
		if (umsvrecddt == null) {
			if (other.umsvrecddt != null)
				return false;
		} else if (!umsvrecddt.equals(other.umsvrecddt))
			return false;
		if (umsvtodt == null) {
			if (other.umsvtodt != null)
				return false;
		} else if (!umsvtodt.equals(other.umsvtodt))
			return false;
		if (umumRefId == null) {
			if (other.umumRefId != null)
				return false;
		} else if (!umumRefId.equals(other.umumRefId))
			return false;
		if (umvtstsdtm == null) {
			if (other.umvtstsdtm != null)
				return false;
		} else if (!umvtstsdtm.equals(other.umvtstsdtm))
			return false;
		return true;
	}

}
