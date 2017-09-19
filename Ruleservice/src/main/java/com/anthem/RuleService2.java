package com.anthem;

import java.util.List;

import org.joda.time.LocalDate;
import org.kie.api.KieServices;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Match;

import com.anthem.tat.DTO.MemberDTO;
import com.anthem.tat.factmodel.MemberModel;
import com.anthem.tat.factmodel.UmServices;
import com.anthem.tat.xom.MemberFactshandlerClient;

public class RuleService2 {

	public static void main(String[] args) throws Exception {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");

		// Condition 1 Member is not Retro
		MemberModel member1 = new MemberModel();
		member1.setMemberid(1);
		member1.setMembername("Prakash");
		UmServices umServices1 = new UmServices();
		umServices1.setReceivedDate(new LocalDate("2010-04-28"));
		umServices1.setToDate(new LocalDate("2009-04-28"));
		member1.setUmServices(umServices1);
		kSession.insert(member1);

		// Condition 2 Member is Retro
		MemberModel member2 = new MemberModel();
		member2.setMemberid(2);
		member2.setMembername("John");
		UmServices umServices2 = new UmServices();
		umServices2.setReceivedDate(new LocalDate("2009-04-28"));
		umServices2.setToDate(new LocalDate("2010-04-28"));
		member2.setUmServices(umServices2);
		kSession.insert(member2);

		MemberFactshandlerClient memberservice = new MemberFactshandlerClient();
		kSession.setGlobal("memberservice", memberservice);

		kSession.startProcess("Tat.AuthType");
		kSession.fireAllRules();

	}

	public KieSession getSession() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		return kSession;

	}

	public List<MemberModel> Processrules(List<MemberModel> m) {

		// set the facts and call the rules

		return null;

	}

	/**
	 * @param member
	 */
	public List<MemberDTO> Processrules(MemberModel member) {
		KieSession kSession = getSession();

		kSession.insert(member);

		MemberFactshandlerClient memberservice = new MemberFactshandlerClient();
		kSession.setGlobal("memberservice", memberservice);
		AgendaEventListener agendaEventListener = new TrackingAgendaEventListener();
		kSession.addEventListener(agendaEventListener);
		kSession.startProcess("Tat.AuthType");
		kSession.fireAllRules();

		List<Match> activations = ((TrackingAgendaEventListener) agendaEventListener).getMatchList();
		System.out.println("Hi--->" + activations);
		return memberservice.listofRetroIPMembers();

	}

}