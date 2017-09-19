package com.anthem.tat.factmodel;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.joda.time.LocalDate;

/**
 * @author AF43847
 *This is the Final POJO to persist
 */
public class Utilization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7453898519752383467L;
	String plan; //
	String memberID; //
	String memberName;
	String market;
	String countyMarket;
	String  productLine;//medicare medicaid
	String productDesc;
	String subProductDesc;
	String planDesc;
	Long authNumber;
	Long serviceLine;
	Long refID;
	Long sequenNumber;
	String reviewType; //Initial Extension (if seqno in 0,1 Initial if 0 Extension else unknown)
	String authCategory; //Inpatient for IP query
	LocalDateTime initialStatuDT; // Initial status date time;
	String tatCalculationType; // Default 'NCQA'
	LocalDate fromDate;
	LocalDate toDate;
	//TODO
	//UMSV_INPUT_USID TODO ; 
	String roomCode;
	String roomType;
	String bedType;
	String bedTypeMin;
	String bedTypeMax;
	String reqLOS;//Check
	String authLOS;//check
	String serviceProviderID;
	String serviceProviderName;
	String primaryReviewerID;
	String secondaryReviewerID;
	LocalDate uMUMInputDt; //date
	String oONIndicator;//check
	String tatScreenEntry;//check
	String expediateReq;//check
	String meetExpediate;
	LocalDate reqAdmitDate;
	LocalDate actualAdmitDate;
	LocalDate authorizedAdmitDate;
	LocalDate expectedDischargeDate;
	LocalDate  actualDischargeDate;
	String placeofService;
	LocalDate memberWrittenDate;
	LocalDate memberVerbalDate;
	LocalDate provWrittenDate;
	LocalDate provVerbalDate;
	String provVerbalZone;
	LocalDate reopenDate;
	String reopenZone;
	String extensionZone;
	String notifName;
	String memWritZoneNotif;
	String memVerbalZoneNotif;
	String provWritZoneNotif;
	String provVerbZoneNotif;
	LocalDate receivedDate; // calculation Line 292 in Medicaid IP query
	LocalDate tatExpedDate; //calculation;
	LocalDate memberWrittenDateCalculated; // calculation
	LocalDate provVerbalDateCalculated; //// calculation
	LocalDate provWrittenDateCalculated ;//// calculation
	LocalDate memberVerbalDateCalculated;
	String reopenedDecision;
	String reopendedReason;
	String reopenDateCalculated;
	String extensionReq;
	String extensionDenied;
	LocalDate extensionDateCalculation;
	LocalDate memWritDateNotification;
	LocalDate provVerbDateNotification;
	LocalDate provWritDateNotification;
	LocalDate memVerbDateNotification;
	private String type;
	private String  requestMethod;
	private String icd10;
	private String icd10touse;
	private String icdDesc;
	private String diagnosis;
	private String bhFlag;
	private LocalDate receivedDateActual;
	private LocalDate serviceRecdDate;
	private LocalDate memberBirthDate;
	private LocalDate ageFlag;
	private String uminDrg;
	private boolean isDRGFacility;
	private String tatExtCreatedby;
	private String tatExtUpdatedBy;
	private LocalDate tatExtCreatedDate;
	private LocalDate tatExtUpdatedDate;
	private String obsOrLevCareDenial;
	
	private String umsv_MCTR_LDNY; //check;
	private String ipOBS;
	private LocalDate nextReviewDate;
	private String orthonetFlag;
	
	
		
	
	
	
	
	
	
	

	
}
