package com.anthem;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.Match;

import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.xom.MemberFactshandlerClient;

public class RuleService {

	public static void main(String[] args) throws Exception {
		RuleService rs = new RuleService();
		rs.test();
	}

	public KieSession getSession() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		return kSession;

	}

	public List<MemberDTO> Processrules(List<MemberDTO> m) {

		// set the facts and call the rules

		return null;

	}

	/**
	 * @param member
	 */
	public List<MemberDTO> processrules(MemberDTO member) {
		KieSession kSession = getSession();

		kSession.insert(member);

		MemberFactshandlerClient memberservice = new MemberFactshandlerClient();
		kSession.setGlobal("memberservice", memberservice);
		TrackingAgendaEventListener agendaEventListener = new TrackingAgendaEventListener();
		kSession.addEventListener(agendaEventListener);

		Agenda agenda = kSession.getAgenda();
		agenda.getAgendaGroup("Expedite").setFocus();
		agenda.getAgendaGroup("Extension").setFocus(); // activation of agenda
		// goes like queue here
		// Extension executes
		// second
		agenda.getAgendaGroup("AuthType").setFocus(); // activation of agenda
		// goes like queue here
		// AuthType executes
		// First

		kSession.startProcess("Tat.AuthType");
		kSession.fireAllRules();

		List<Match> activations = ((TrackingAgendaEventListener) agendaEventListener).getMatchList();
		System.out.println("List of activations--->" + activations);

		String match = ((TrackingAgendaEventListener) agendaEventListener).matchsToString();
		System.out.println("List of  matched Rules--->" + match);

		return memberservice.listofRetroIPMembers();

	}

	/*
	 * public void testRules() {
	 * 
	 * KieServices ks = KieServices.Factory.get(); KieContainer kContainer =
	 * ks.getKieClasspathContainer(); KieSession kSession =
	 * kContainer.newKieSession("ksession-rules");
	 * 
	 * // Condition 1 Member is not Retro MemberDTO member1 = new MemberDTO();
	 * member1.setMemberid(1); member1.setMembername("Prakash");
	 * 
	 * member1.setFromdate("2010-04-28"); member1.setTodate("2009-04-28");
	 * 
	 * kSession.insert(member1);
	 * 
	 * // Condition 2 Member is Retro MemberDTO member2 = new MemberDTO();
	 * member2.setMemberid(2); member2.setMembername("John");
	 * 
	 * member2.setFromdate("2009-04-28"); member2.setTodate("2010-04-28");
	 * 
	 * kSession.insert(member2);
	 * 
	 * MemberFactshandlerClient memberservice = new MemberFactshandlerClient();
	 * kSession.setGlobal("memberservice", memberservice);
	 * 
	 * kSession.startProcess("Tat.AuthType"); kSession.fireAllRules(); }
	 */

	public void test() {
		ArrayList<String> listString = new ArrayList<String>();

		for (int i = 0; i < 1000000; i++) {
			listString.add("String" + i);

		}

		/*
		 * long startTime = System.currentTimeMillis();
		 * 
		 * System.out.println("Starting " + startTime); for (String a :
		 * listString) { System.out.println("List vaa" + a); }
		 * 
		 * long endTime = System.currentTimeMillis();
		 * 
		 * System.out.println("End " + endTime); long totalTime = endTime -
		 * startTime;
		 * 
		 * System.out.println("Total Time" + totalTime);
		 */

		long startTime1 = System.currentTimeMillis();

		listString.stream().forEach(s -> System.out.println("forEach: " + s));
		long endTime1 = System.currentTimeMillis();

		long totalTime1 = endTime1 - startTime1;

		System.out.println("Total Time" + totalTime1);

	}

}