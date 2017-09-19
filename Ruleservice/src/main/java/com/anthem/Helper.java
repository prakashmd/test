/**
 * 
 */
package com.anthem;

import org.drools.core.spi.KnowledgeHelper;

public class Helper {

	public static void log(final KnowledgeHelper drools, final String message) {
		System.out.println(message);
		System.out.println("\nrule triggered: " + drools.getRule().getName());
		System.out.println(drools.getFactHandle(message));
	}

}