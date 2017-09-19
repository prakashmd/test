/**
 * 
 */
package com.anthem.tat.xom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.utility.CompareDate;

/**
 * @author AF43847
 *
 */
public class MemberFactshandlerClient {

	private ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();

	/**
	 * //call web service with MemberID and return list of members, set the
	 * required details to the POJO
	 * 
	 * @param memberID
	 * @return
	 */

	public List<MemberDTO> loadMemberFacts(Long memberID) {
		List<MemberDTO> members = null;

		return members;

	}

	/**
	 * @param memberID
	 */
	public static void getMembers(Long memberID) {
		final String uri = "http://localhost:8080/getall/memberid/{memberid}";
		Map<String, Long> vars = new HashMap<String, Long>();
		vars.put("memberid", memberID);

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class, vars);

		System.out.println(result);
	}

	/**
	 * @param m
	 * @return
	 */
	public boolean determineIfIPRetro(MemberDTO m) {
		boolean flag = false;
		// String authType = null;
		/*
		 * if (m.getUmServices().getReceivedDate() != null) {
		 * 
		 * if (CompareDate.isReceivedDateonAfterEndDate(m.getUmServices().
		 * getReceivedDate(), m.getUmServices().getToDate())) { flag = true; }
		 * 
		 * }
		 */

		// Expect a calculation to set the received date
		// TODO

		System.out.println("determineIfIPRetro" + m.getReceveivedDate() + "--" + m.getUmsvtodt());
		if (m.getUmsvtodt() != null) {

			if (CompareDate.isReceivedDateonAfterEndDate(m.getReceveivedDate(), m.getUmsvtodt())) {
				flag = true;
			}

		}

		return flag;

	}

	/**
	 * @param m
	 * @return
	 */
	public boolean determineIfIPPreService(MemberDTO m) {
		boolean flag = false;
		// String authType = null;
		/*
		 * if (m.getUmServices().getReceivedDate() != null) {
		 * 
		 * if (CompareDate.isReceivedDateonAfterEndDate(m.getUmServices().
		 * getReceivedDate(), m.getUmServices().getToDate())) { flag = true; }
		 * 
		 * }
		 */

		// Expect a calculation to set the received date if not handled in view
		// TODO

		System.out.println("determineIfIPPreService" + m.getReceveivedDate() + "--" + m.getUmsvfromdt());
		if (m.getUmsvfromdt() != null && m.getUmsvSeqNo() != null) {

			if (CompareDate.isReceivedDateLessthanEndDate(m.getReceveivedDate(), m.getUmsvfromdt())

					&& (m.getUmsvSeqNo().equalsIgnoreCase("0") || m.getUmsvSeqNo().equalsIgnoreCase("1"))) {
				flag = true;
			}

		}

		return flag;

	}

	/**
	 * @param m
	 */
	public void add(MemberDTO m) {
		members.add(m);
	}

	/**
	 * 
	 */
	/**
	 * @return list of members
	 */
	public List<MemberDTO> listofRetroIPMembers() {
		for (MemberDTO m : members) {
			System.out.println("List of  members==>" + m);
		}
		return members;

	}

	private String determineReceivedDate(String receivedDate, String orderDate) {

		String calculatedreceivedDate = null;
		// UMSV_RECD_DT is NULL
		if (receivedDate == null) {
			calculatedreceivedDate = orderDate;
		} else if (orderDate == null) {

			calculatedreceivedDate = receivedDate;
		} else if ((receivedDate != null && orderDate != null)) {
			calculatedreceivedDate = receivedDate;
		} else {
			calculatedreceivedDate = orderDate;

		}

		return calculatedreceivedDate;

	}

	public boolean checkUmvtReasonCodeExists(MemberDTO m, String... args) {
		// Loops member DTO
		boolean flag = false;
		for (String codes : args) {
			System.out.println("Code from DTO " + m.getUmvtStatusDTO().getUmvtMctrReas());
			System.out.println("I am from " + codes);
			if (codes.equalsIgnoreCase(m.getUmvtStatusDTO().getUmvtMctrReas())) {
				System.out.println("Condition met ");
				flag = true;
			}

		}

		return flag;
	}

}
