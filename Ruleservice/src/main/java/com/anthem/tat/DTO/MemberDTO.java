package com.anthem.tat.DTO;

import java.util.Date;

import org.joda.time.LocalDate;

/**
 * @author AF43847
 *
 */
public class MemberDTO {

	private int memberid;
	private String umumRefId;
	private String memeFirstName;
	private String memeCk;

	private String membername;

	private String plans;

	private String fromdate;

	private String todate;
	private String expediteflag; // Y or N
	private String serviceline; // 1 0r 2
	private String type; // 'E','U'
	// private String extensionreq; // Y or N;
	// private String extensiondenied;
	private String meetexpedite;

	private String authType;
	private Date umsvReceivedDate; // Received date
	private LocalDate tatOrderDate; // Rece
	private LocalDate umsvToDate; // RHS

	private String umsvSeqNo;
	private String segrId;
	private String authcategory;
	private String IP;
	private String umsvrecddt;
	private String orddt;
	private String umsvtodt;
	private String umsvfromdt;
	private String umvtstsdtm;
	private String expeditereq;

	private String extRequested;
	private String extdenied;
	private String memberplan;
	private String productdesc;
	private String productlinedesc;
	private String pldsdesc;
	private String receveivedDate;
	private String searchdate;
	private String reasonlist;

	private UmvtStatusDTO umvtStatusDTO;

	public MemberDTO() {

	}

	public String getUmsvSeqNo() {
		return umsvSeqNo;
	}

	public void setUmsvSeqNo(String umsvSeqNo) {
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

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getUmsvrecddt() {
		return umsvrecddt;
	}

	public void setUmsvrecddt(String umsvrecddt) {
		this.umsvrecddt = umsvrecddt;
	}

	public String getOrddt() {
		return orddt;
	}

	public void setOrddt(String orddt) {
		this.orddt = orddt;
	}

	public String getUmsvtodt() {
		return umsvtodt;
	}

	public void setUmsvtodt(String umsvtodt) {
		this.umsvtodt = umsvtodt;
	}

	public String getUmsvfromdt() {
		return umsvfromdt;
	}

	public void setUmsvfromdt(String umsvfromdt) {
		this.umsvfromdt = umsvfromdt;
	}

	public String getUmvtstsdtm() {
		return umvtstsdtm;
	}

	public void setUmvtstsdtm(String umvtstsdtm) {
		this.umvtstsdtm = umvtstsdtm;
	}

	public String getExpeditereq() {
		return expeditereq;
	}

	public void setExpeditereq(String expeditereq) {
		this.expeditereq = expeditereq;
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

	public String getMemberplan() {
		return memberplan;
	}

	public void setMemberplan(String memberplan) {
		this.memberplan = memberplan;
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

	public String getReceveivedDate() {
		return receveivedDate;
	}

	public void setReceveivedDate(String receveivedDate) {
		this.receveivedDate = receveivedDate;
	}

	public String getSearchdate() {
		return searchdate;
	}

	public void setSearchdate(String searchdate) {
		this.searchdate = searchdate;
	}

	public String getMemeCk() {
		return memeCk;
	}

	public void setMemeCk(String memeCk) {
		this.memeCk = memeCk;
	}

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

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpediteflag() {
		return expediteflag;
	}

	public void setExpediteflag(String expediteflag) {
		this.expediteflag = expediteflag;
	}

	public String getServiceline() {
		return serviceline;
	}

	public void setServiceline(String serviceline) {
		this.serviceline = serviceline;
	}

	public String getMeetexpedite() {
		return meetexpedite;
	}

	public void setMeetexpedite(String meetexpedite) {
		this.meetexpedite = meetexpedite;
	}

	public Date getUmsvReceivedDate() {
		return umsvReceivedDate;
	}

	public void setUmsvReceivedDate(Date umsvReceivedDate) {
		this.umsvReceivedDate = umsvReceivedDate;
	}

	public LocalDate getTatOrderDate() {
		return tatOrderDate;
	}

	public void setTatOrderDate(LocalDate tatOrderDate) {
		this.tatOrderDate = tatOrderDate;
	}

	public LocalDate getUmsvToDate() {
		return umsvToDate;
	}

	public void setUmsvToDate(LocalDate umsvToDate) {
		this.umsvToDate = umsvToDate;
	}

	public String getUmumRefId() {
		return umumRefId;
	}

	public void setUmumRefId(String umumRefId) {
		this.umumRefId = umumRefId;
	}

	public String getMemeFirstName() {
		return memeFirstName;
	}

	public void setMemeFirstName(String memeFirstName) {
		this.memeFirstName = memeFirstName;
	}

	public String getReasonlist() {
		return reasonlist;
	}

	public void setReasonlist(String reasonlist) {
		this.reasonlist = reasonlist;
	}

	public UmvtStatusDTO getUmvtStatusDTO() {
		return umvtStatusDTO;
	}

	public void setUmvtStatusDTO(UmvtStatusDTO umvtStatusDTO) {
		this.umvtStatusDTO = umvtStatusDTO;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberid=" + memberid + ", umumRefId=" + umumRefId + ", memeFirstName=" + memeFirstName
				+ ", memeCk=" + memeCk + ", membername=" + membername + ", plans=" + plans + ", fromdate=" + fromdate
				+ ", todate=" + todate + ", expediteflag=" + expediteflag + ", serviceline=" + serviceline + ", type="
				+ type + ", meetexpedite=" + meetexpedite + ", authType=" + authType + ", umsvReceivedDate="
				+ umsvReceivedDate + ", tatOrderDate=" + tatOrderDate + ", umsvToDate=" + umsvToDate + ", umsvSeqNo="
				+ umsvSeqNo + ", segrId=" + segrId + ", authcategory=" + authcategory + ", IP=" + IP + ", umsvrecddt="
				+ umsvrecddt + ", orddt=" + orddt + ", umsvtodt=" + umsvtodt + ", umsvfromdt=" + umsvfromdt
				+ ", umvtstsdtm=" + umvtstsdtm + ", expeditereq=" + expeditereq + ", extRequested=" + extRequested
				+ ", extdenied=" + extdenied + ", memberplan=" + memberplan + ", productdesc=" + productdesc
				+ ", productlinedesc=" + productlinedesc + ", pldsdesc=" + pldsdesc + ", receveivedDate="
				+ receveivedDate + ", searchdate=" + searchdate + ", reasonlist=" + reasonlist + "]";
	}

}
