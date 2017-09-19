/**
 * 
 */
package com.anthem.tat.rules.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anthem.RuleService;
import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.factmodel.MemberModel;

/**
 * @author AF43847
 *
 */
@RestController
public class RulesServiceRestController {

	// @CrossOrigin

	@RequestMapping(value = "/process/member/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MemberDTO>> process(@RequestBody MemberDTO memberdetails) {

		System.out.println("LOG /process/member/");
		String response = "You entered " + memberdetails.getMemberid();
		System.out.println("response==>" + response);

		System.out.println("response==>" + response + "memberdetails" + memberdetails.getMemberid() + "From Date="
				+ memberdetails.getFromdate() + "To Date=" + memberdetails.getTodate());

		// MOCKUP
		// TODO
		/*
		 * MemberModel member1 = new MemberModel();
		 * member1.setMemberid(memberdetails.getMemberid());
		 * member1.setMembername(memberdetails.getMembername()); UmServices
		 * umServices1 = new UmServices(); umServices1.setReceivedDate(new
		 * LocalDate(memberdetails.getFromdate())); // "2008-04-28"
		 * umServices1.setToDate(new LocalDate(memberdetails.getTodate())); //
		 * "2009-04-28" member1.setUmServices(umServices1);
		 * System.out.println("Members====>" + member1.toString());
		 */
		RuleService pm = new RuleService();

		List<MemberDTO> listofMembers = pm.processrules(memberdetails);

		/*
		 * System.out.println("Body--->" + r.getBody()); ObjectMapper mapper =
		 * new ObjectMapper(); try { JsonNode actualObj =
		 * mapper.readValue(r.getBody().toString(), JsonNode.class);
		 * System.out.println("sssssssssssssss" + actualObj); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * System.out.println("Body--->" + r.getBody());
		 */
		return new ResponseEntity<List<MemberDTO>>(listofMembers, HttpStatus.OK);
	}

	@RequestMapping(value = "/process1/member/", method = RequestMethod.POST)
	public @ResponseBody List<Object> findAllObjects(@RequestBody MemberDTO[] memberdetails) {

		for (MemberDTO m : memberdetails) {
			System.out.println("MemberID---->" + m.getMemberid());
		}

		return null;

	}

	// @CrossOrigin

	@RequestMapping(value = "/fireIPAuthRules/member/{member}", method = RequestMethod.GET)
	public List<MemberModel> fireIPAuthRules(MemberModel member) {
		return null;
	}

}
