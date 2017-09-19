/**
 * 
 */
package com.anthem.Ruleservice.Ruleservice;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.anthem.RuleService;
import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.DTO.UmvtStatusDTO;

/**
 * @author AF43847
 *
 */
public class droolsTest {
	public static void main(String[] args) throws Exception {

		droolsTest dt = new droolsTest();

	}

	@Test
	public void testIfRetroReceivedonEndDate() { // Received date is on End date

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");

		memberDTO.setReceveivedDate("2016-01-04");
		memberDTO.setUmsvtodt("2016-01-04");

		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Retro IP", listofmember.get(0).getAuthType());

	}

	@Test
	public void testIfRetroReceivedAfterEndDate() { // Received date is After
													// End date

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");

		memberDTO.setReceveivedDate("2016-01-05");
		memberDTO.setUmsvtodt("2016-01-04");

		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Retro IP", listofmember.get(0).getAuthType());

	}

	@Test
	public void testIfPreserviceReceivedisLessThenEndDateSeqZero() { // Received
																		// date
		// is less then
		// End date sequence is 0

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("0");

		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();

		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP", listofmember.get(0).getAuthType());

	}

	@Test
	public void testIfPreserviceReceivedisLessThenEndDateSeqOne() { // Received
																	// date
		// is less then
		// End date sequence is 0

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");
		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();

		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);
		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP", listofmember.get(0).getAuthType());

	}

	@Test
	public void testIfConcurrent() { // Received
										// date
		// is less then
		// End date sequence is not 0 or 1 default to concurrent

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvtodt("2016-01-04");
		memberDTO.setUmsvSeqNo("10");
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Concurrent IP", listofmember.get(0).getAuthType());

	}

	@Test
	public void testIfConcurrentExtensionIP() { // Received
		// date
		// is less then
		// End date sequence is not 0 or 1 default to concurrent IP and
		// Extention denied =N and Extension requested =Y so concurrent
		// Extension
		// IP

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");
		memberDTO.setExtdenied("N");

		memberDTO.setExtRequested("Y");

		memberDTO.setReceveivedDate("2016-01-04");
		memberDTO.setUmsvtodt("2016-01-08");
		memberDTO.setUmsvSeqNo("10");
		// memberDTO.setAuthType("Concurrent IP");
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Concurrent Extension IP", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceExtensionIP() {
		// Received
		// date
		// is less then
		// End date sequence is 0 or 1 default to Preservice IP and
		// Extention denied =N and Extension requested =Y so Preservice
		// Extension
		// IP

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(1);
		memberDTO.setMembername("Prakash");
		memberDTO.setExtdenied("N");

		memberDTO.setExtRequested("Y");

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");

		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();

		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice Extension IP", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceExpediteIP() {

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(11);
		memberDTO.setMembername("Prakash1111111");
		memberDTO.setMeetexpedite("Y");

		memberDTO.setExpeditereq("Y");

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");

		// memberDTO.setAuthType("Concurrent IP");
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP Expedite", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceExtensionExpediteIP() {

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(111);
		memberDTO.setMembername("Prakash");
		memberDTO.setExtdenied("N");

		memberDTO.setExtRequested("Y");

		memberDTO.setMeetexpedite("Y");

		memberDTO.setExpeditereq("Y");

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");

		// memberDTO.setAuthType("Concurrent IP");
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP Extension Expedite", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceExtensionExpediteIPWhenNull() {

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(111);
		memberDTO.setMembername("Prakash");

		memberDTO.setExtRequested(null);

		memberDTO.setMeetexpedite(null);

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");

		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();
		umvtStatusDTO1.setUmvtMctrReas("CO16");
		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);
		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP Expedite", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceDeExpedite() { // it will be back to PRESERVICE

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(111);
		memberDTO.setMembername("Prakashfff");

		memberDTO.setExtRequested(null);

		memberDTO.setMeetexpedite(null);

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");
		memberDTO.setReasonlist("CO32"); // MODIFY THIS ......

		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();
		umvtStatusDTO1.setUmvtMctrReas("CO32");
		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);

		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP", listofmember.get(0).getAuthType());
	}

	@Test
	public void testIfPreserviceDeExpediteDTO() { // it will be back to
													// PRESERVICE

		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setMemberid(111);
		memberDTO.setMembername("Prakashfff");

		memberDTO.setExtRequested(null);

		memberDTO.setMeetexpedite(null);

		memberDTO.setReceveivedDate("2014-01-05");
		memberDTO.setUmsvfromdt("2016-01-04");
		memberDTO.setUmsvSeqNo("1");

		UmvtStatusDTO umvtStatusDTO1 = new UmvtStatusDTO();
		umvtStatusDTO1.setUmvtMctrReas("CO16");
		memberDTO.setUmvtStatusDTO(umvtStatusDTO1);

		UmvtStatusDTO umvtStatusDTO2 = new UmvtStatusDTO();

		// memberDTO.setReasonlist("CO32"); // MODIFY THIS ......

		RuleService rs = new RuleService();
		List<MemberDTO> listofmember = rs.processrules(memberDTO);
		assertEquals("Preservice IP Expedite", listofmember.get(0).getAuthType());
	}
}
