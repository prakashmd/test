[condition][]The Type of claim is "{claimType}"=claim : Claim(serviceType == claimType);
[consequence][]Log "{message}"=System.out.println("{message} ");
[consequence][] updateclaimType as IP=claim.setServiceType("IP");update(claim);
