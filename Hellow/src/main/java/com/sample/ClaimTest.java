package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.DroolsTest.Message;

public class ClaimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
           Claim claim = new Claim();
           claim.setClaimID("1");
           claim.setClaimType("837P");
     
            kSession.insert(claim);
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
	
	public static class Claim
	{
		private   String claimType;
		
		private  String claimID;

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

		
		
	}
	
	  

}
