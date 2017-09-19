package com.anthem.tat.DTO;

public class MemberDTO {

	private int memberid;

	private String membername;
	private String umumRefId;
	private String memeCk;
	private String memeFirstName;
	private String plans;
	// @JsonSerialize(using = CustomDateSerializer.class)
	// @JsonIgnore
	private String fromdate; // This can be String far now

	private String todate;
	private String productLine;
	private String plan;
	private String authcategory;

	private String umsvSeqNo;
	private String segrId;

	private String IP;
	private String umsvrecddt;
	private String orddt;
	private String umsvtodt;
	private String umsvfromdt;
	private String umvtstsdtm;
	private String expeditereq;
	private String meetexpedite;
	private String extRequested;
	private String extdenied;
	private String memberplan;
	private String productdesc;
	private String productlinedesc;
	private String pldsdesc;
	private String receveivedDate;
	private String searchdate;

	private String authType;
	private String reasonlist;

	private UmvtStatusDTO umvtStatusDTO;

	public MemberDTO() {

	}

	public String getMemeCk() {
		return memeCk;
	}

	public void setMemeCk(String memeCk) {
		this.memeCk = memeCk;
	}

	public String getMemeFirstName() {
		return memeFirstName;
	}

	public void setMemeFirstName(String memeFirstName) {
		this.memeFirstName = memeFirstName;
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

	public String getUmsvfromdt() {
		return umsvfromdt;
	}

	public void setUmsvfromdt(String umsvfromdt) {
		this.umsvfromdt = umsvfromdt;
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

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getAuthcategory() {
		return authcategory;
	}

	public void setAuthcategory(String authcategory) {
		this.authcategory = authcategory;
	}

	public String getUmumRefId() {
		return umumRefId;
	}

	public void setUmumRefId(String umumRefId) {
		this.umumRefId = umumRefId;
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
		return "MemberDTO [memberid=" + memberid + ", membername=" + membername + ", umumRefId=" + umumRefId
				+ ", memeCk=" + memeCk + ", memeFirstName=" + memeFirstName + ", plans=" + plans + ", fromdate="
				+ fromdate + ", todate=" + todate + ", productLine=" + productLine + ", plan=" + plan
				+ ", authcategory=" + authcategory + ", umsvSeqNo=" + umsvSeqNo + ", segrId=" + segrId + ", IP=" + IP
				+ ", umsvrecddt=" + umsvrecddt + ", orddt=" + orddt + ", umsvtodt=" + umsvtodt + ", umsvfromdt="
				+ umsvfromdt + ", umvtstsdtm=" + umvtstsdtm + ", expeditereq=" + expeditereq + ", meetexpedite="
				+ meetexpedite + ", extRequested=" + extRequested + ", extdenied=" + extdenied + ", memberplan="
				+ memberplan + ", productdesc=" + productdesc + ", productlinedesc=" + productlinedesc + ", pldsdesc="
				+ pldsdesc + ", receveivedDate=" + receveivedDate + ", searchdate=" + searchdate + ", authType="
				+ authType + ", reasonlist=" + reasonlist + "]";
	}

}
