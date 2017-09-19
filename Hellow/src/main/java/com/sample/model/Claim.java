package com.sample.model;

import java.util.Date;

/**
 * @author AF43847
 *Model class to Populate claim details
 */
public class Claim {
	private final String EXPEDITE_RESULT="EXPEDITE";
	private   String claimType;
	private  String claimID;
	private String serviceType;
	private Date receivedDate; //
	private boolean isRetro;
	private boolean isPreservice;
	private boolean isConcurrent;
	private boolean extensionRequest;
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimID() {
		return claimID;
	}
	public void setClaimID(String claimID) {
		this.claimID = claimID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public boolean isRetro() {
		return isRetro;
	}
	public void setRetro(boolean isRetro) {
		this.isRetro = isRetro;
	}
	public boolean isPreservice() {
		return isPreservice;
	}
	public void setPreservice(boolean isPreservice) {
		this.isPreservice = isPreservice;
	}
	public boolean isConcurrent() {
		return isConcurrent;
	}
	public void setConcurrent(boolean isConcurrent) {
		this.isConcurrent = isConcurrent;
	}
	public boolean isExtensionRequest() {
		return extensionRequest;
	}
	public void setExtensionRequest(boolean extensionRequest) {
		this.extensionRequest = extensionRequest;
	}
	

}
