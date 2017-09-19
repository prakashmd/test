package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.ClaimTest.Claim;

/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-process");
			// go !
			Claim claim = new Claim();
			claim.setClaimID("1");
			claim.setClaimType("837P");

			kSession.insert(claim);

			// start a new process instance
			kSession.startProcess("com.sample.bpmn.hello");
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
