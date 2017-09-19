package com.anthem.tat.ruleservice;

import org.joda.time.LocalDate;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.anthem.tat.model.Claim;

public class DroolTest {
	 public static final void main(String[] args) {
	        try {
	            // load up the knowledge base
		        KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession kSession = kContainer.newKieSession("ksession-rules");
	        	
	        	
	            // go !
	        	Claim claim1 = new Claim();
	           claim1.setServiceType("IP");
	           claim1.setReceivedDate(new LocalDate("2017-01-03"));
	           claim1.setStartDate(new LocalDate("2017-01-02"));
	           claim1.setEndDate(new LocalDate("2017-01-02"));
	           
	           Claim claim2 = new Claim();
	           claim2.setServiceType("OP");
	           claim2.setReceivedDate(new LocalDate("2017-01-03"));
	           claim2.setStartDate(new LocalDate("2017-01-02"));
	           claim2.setEndDate(new LocalDate("2017-01-02"));
	           
	         
	            kSession.insert(claim1);
	           // kSession.insert(claim2);
	           kSession.fireAllRules();
	          
	        
	       
	        } catch (Throwable t) {
	            t.printStackTrace();
	        }
	        
	        
	       
	        try {
	            // load up the knowledge base
		        KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession kSession = kContainer.newKieSession("ksession-rules");

	           
	        } catch (Throwable t) {
	            t.printStackTrace();
	        }
	    }
	        
	    }
	 
	


