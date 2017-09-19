package com.anthem.tat.factmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * @author AF43847 Prakash
 *Model class to Populate claim details
 *This is a Model to populate the Claim DB model from database.
 */
public class Claim {
	public static String EDITS="";
	private final String EXPEDITE_RESULT="EXPEDITE";
	private   String claimType;
	private  String claimID;
	private String serviceType;
	private LocalDate receivedDate; //
	private LocalDate endDate;
	private LocalDate startDate;
	private boolean isRetro;
	private boolean isPreservice;
	private boolean isConcurrent;
	private boolean extensionRequest;
	
	private List<String> authTypes = new ArrayList<String>();
	
	public List<String> getAuthTypes() {
		return authTypes;
	}
	public void setAuthTypes(List<String> authTypes) {
		this.authTypes = authTypes;
	}
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
	public LocalDate getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(LocalDate receivedDate) {
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
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EXPEDITE_RESULT == null) ? 0 : EXPEDITE_RESULT.hashCode());
		result = prime * result + ((claimID == null) ? 0 : claimID.hashCode());
		result = prime * result + ((claimType == null) ? 0 : claimType.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + (extensionRequest ? 1231 : 1237);
		result = prime * result + (isConcurrent ? 1231 : 1237);
		result = prime * result + (isPreservice ? 1231 : 1237);
		result = prime * result + (isRetro ? 1231 : 1237);
		result = prime * result + ((receivedDate == null) ? 0 : receivedDate.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Claim other = (Claim) obj;
		if (EXPEDITE_RESULT == null) {
			if (other.EXPEDITE_RESULT != null)
				return false;
		} else if (!EXPEDITE_RESULT.equals(other.EXPEDITE_RESULT))
			return false;
		if (claimID == null) {
			if (other.claimID != null)
				return false;
		} else if (!claimID.equals(other.claimID))
			return false;
		if (claimType == null) {
			if (other.claimType != null)
				return false;
		} else if (!claimType.equals(other.claimType))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (extensionRequest != other.extensionRequest)
			return false;
		if (isConcurrent != other.isConcurrent)
			return false;
		if (isPreservice != other.isPreservice)
			return false;
		if (isRetro != other.isRetro)
			return false;
		if (receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!receivedDate.equals(other.receivedDate))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Claim [EXPEDITE_RESULT=" + EXPEDITE_RESULT + ", claimType=" + claimType + ", claimID=" + claimID
				+ ", serviceType=" + serviceType + ", receivedDate=" + receivedDate + ", endDate=" + endDate
				+ ", startDate=" + startDate + ", isRetro=" + isRetro + ", isPreservice=" + isPreservice
				+ ", isConcurrent=" + isConcurrent + ", extensionRequest=" + extensionRequest + "]";
	}
	

}
