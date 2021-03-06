/**
 * 
 */
package com.anthem.tat.web.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.web.domain.AuthorizationTATView;
import com.anthem.tat.web.domain.Member;
import com.anthem.tat.web.service.MemberService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author AF43847
 *
 */
@RestController
public class MemberRestController {

	private static Logger log = LoggerFactory.getLogger(MemberRestController.class);

	@Autowired
	MemberService memberService;

	@InitBinder
	public void initBinder(final WebDataBinder binder) {
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/listallmembers/", method = RequestMethod.GET)
	public ResponseEntity<List<Member>> listAllMembers() {
		List<Member> members = memberService.findAll();
		if (members.isEmpty()) {
			return new ResponseEntity<List<Member>>(HttpStatus.NO_CONTENT);
		}

		System.out.println("Members" + members.get(0).getFromdate());
		return new ResponseEntity<List<Member>>(members, HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<Member> findAll() {
		return memberService.findAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/searchmembers1/&memberid={memberid}&fromdate={fromdate}&enddate={todate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Member> searchMemberByDateCriteria(@PathVariable("memberid") int id,
			@PathVariable("fromdate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("todate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {
		// List<Member> members = memberService.findMemberBySearchCriteria(id,
		// fromDate, toDate);

		/*
		 * Member m = new Member(); m.setMemberid(1);
		 * m.setMembername("Prakash"); m.setPlans("Plan");
		 * 
		 * Member m1 = new Member(); m1.setMemberid(2);
		 * m1.setMembername("Pradeep"); m1.setPlans("Plan 2");
		 * 
		 * List<Member> members = new ArrayList<Member>(); members.add(m);
		 * members.add(m1);
		 */

		System.out.println("I am from searchMemberByDateCriteria ==>" + fromDate + " Todate=" + toDate);
		List<Member> members = memberService.findMemberByCriteria(fromDate, toDate);
		return members;

	}

	@CrossOrigin
	@RequestMapping(value = "/searchcriteria/&memberid={memberid}&fromdate={fromdate}&enddate={todate}&productline={productline}&plan={plan}&authcategory={authcategory}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<AuthorizationTATView> searchMemberByCriteria(@PathVariable("memberid") int id,
			@PathVariable("fromdate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@PathVariable("todate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
			@PathVariable("productline") String productline, @PathVariable("plan") String plan,
			@PathVariable("authcategory") String authCategory) {

		System.out.println("I am from searchMemberByDateCriteria ==>" + fromDate + " Todate=" + toDate + "Product line="
				+ productline + "plan=" + plan + "Auth category=" + authCategory);
		List<AuthorizationTATView> members = memberService.findMemberBySearchCriteria(fromDate, toDate, productline,
				plan, authCategory);
		return members;

	}

	@CrossOrigin
	@RequestMapping(value = "/getall/memberid/{memberid}", method = RequestMethod.GET)
	public List<Member> findMemberByID(@PathVariable("memberid") Long memberId) {
		return memberService.findMemberByCriteria(memberId);
	}

	/**
	 * This particular method gets the member id from the MemberDTO and do some
	 * db operations if the facts need to be rebuilt
	 * 
	 * @param memberdetails
	 * @return
	 */
	@CrossOrigin

	@RequestMapping(value = "/fetchAndProcess/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public MemberDTO[] fetchAndProcess(@RequestBody String memberdetails) {

		ObjectMapper mapper = new ObjectMapper();

		MemberDTO member = null;
		try {
			member = mapper.readValue(memberdetails, MemberDTO.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RestTemplate restTemplate = new RestTemplate();

		// <----------------------------------------------------------------> //

		/// Get the Member id , call the DB service and set the DTO member which
		/// sufficient facts.

		/// <---------------------------------------------------------------->//

		if (member != null) {

			log.info("Member details from UI" + member.toString());

			System.out.println("LOG fetchAndProcess");

			/*
			 * List<MemberDTO> response = (List<MemberDTO>) restTemplate
			 * .postForEntity("http://localhost:9080/process/member/", member,
			 * ArrayList.class).getBody();
			 */

			ResponseEntity<MemberDTO[]> responseEntity = restTemplate
					.postForEntity("http://localhost:9080/process/member/", member, MemberDTO[].class);

			System.out.println("fetchAndProcess==" + responseEntity.getBody());

			/*
			 * // Convert to DTO , remove unused values List<MemberDTO>
			 * convetedDTO = new ArrayList<MemberDTO>();
			 * 
			 * for (MemberDTO dto1 : responseEntity.getBody()) {
			 * System.out.println("dto" + dto1.toString());
			 * convetedDTO.add(dto1); }
			 * 
			 * List<MemberDTO> pojos = mapper.convertValue(convetedDTO, new
			 * TypeReference<List<MemberDTO>>() { });
			 * 
			 * for (MemberDTO dto1 : pojos) { System.out.println("----->" +
			 * dto1.getMemberid()); }
			 */

			return responseEntity.getBody();
		} else {
			return null;
		}

	}

	@CrossOrigin

	@RequestMapping(value = "/fetchAndProcess1/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public MemberDTO[] fetchAndProcess1(@RequestBody MemberDTO[] memberdetails) {

		ObjectMapper mapper = new ObjectMapper();

		List<MemberDTO[]> memberList = new ArrayList<MemberDTO[]>();
		/*
		 * try { member = mapper.readValue(memberdetails, MemberDTO.class); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<MemberDTO[]> responseEntity = null;

		// ResponseEntity<Class<MemberDTO[]>> t = new
		// ResponseEntity<>(MemberDTO[].class, HttpStatus.FOUND);

		System.out.println("Fetch==>" + memberdetails.toString() + "--" + memberdetails.length);

		for (MemberDTO member : memberdetails) {
			System.out.println("Hi --->" + member.getMemeFirstName());
			responseEntity = restTemplate.postForEntity("http://localhost:9080/process/member/", member,
					MemberDTO[].class);

			System.out.println("fetchAndProcess==" + responseEntity.getBody());

			memberList.add(responseEntity.getBody());

		}

		MemberDTO[] arr = new MemberDTO[memberList.size()];
		for (int i = 0; i < arr.length; i++) {
			MemberDTO[] fileFormatArray = memberList.get(i);
			MemberDTO firstElement = fileFormatArray[0];
			arr[i] = (MemberDTO) firstElement;
		}
		return arr;

	}

	/**
	 * This method will add elements to an array and return the resulting array
	 * 
	 * @param arr
	 * @param elements
	 * @return
	 */
	public static MemberDTO[] add(MemberDTO[] arr, MemberDTO... elements) {
		MemberDTO[] tempArr = new MemberDTO[arr.length + elements.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);

		for (int i = 0; i < elements.length; i++)
			tempArr[arr.length + i] = elements[i];
		return tempArr;

	}

}