package com.anthem.tat.xom;

public class MemberUtil {

	/**
	 * This method will determine the service Type of the Member
	 * 
	 * @return Service Type
	 */
	public String getServiceType(String type) {
		String serviceType;
		if (type.equalsIgnoreCase("IP")) {
			serviceType = "IP";

		} else {
			serviceType = "OP";

		}

		return serviceType;

	}

}
