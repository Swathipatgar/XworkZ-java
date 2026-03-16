class GovernmentRunner{

	public static void main(String[] args){

		Government gov = new Government();

		gov.ministries = 1;
		gov.departments = 2;
		gov.ministers = 3;
		gov.policiesCount = 4;
		gov.schemes = 5;
		gov.budgets = 6;
		gov.laws = 7;
		gov.parliamentMembers = 8;
		gov.stateGovernments = 9;
		gov.localBodies = 10;
		gov.publicServices = 11;
		gov.projects = 12;
		gov.welfarePrograms = 13;
		gov.infrastructure = 14;
		gov.security = 15;
		gov.diplomacy = 16;
		gov.economy = 17;
		gov.taxes = 18;
		gov.developmentPlans = 19;
		gov.reforms = 20;

		Policy policy = new Policy();

		policy.educationPolicy = 1;
		policy.healthPolicy = 2;
		policy.taxPolicy = 3;
		policy.agriculturePolicy = 4;
		policy.industrialPolicy = 5;
		policy.tradePolicy = 6;
		policy.defencePolicy = 7;
		policy.employmentPolicy = 8;
		policy.environmentPolicy = 9;
		policy.transportPolicy = 10;
		policy.digitalPolicy = 11;
		policy.tourismPolicy = 12;
		policy.housingPolicy = 13;
		policy.waterPolicy = 14;
		policy.energyPolicy = 15;
		policy.womenSafetyPolicy = 16;
		policy.childWelfarePolicy = 17;
		policy.seniorCitizenPolicy = 18;
		policy.startupPolicy = 19;
		policy.innovationPolicy = 20;

		gov.policy = policy;

		gov.displayGovernmentDetails();
	}
}