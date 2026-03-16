class Government{

	int ministries;
	int departments;
	int ministers;
	int policiesCount;
	int schemes;
	int budgets;
	int laws;
	int parliamentMembers;
	int stateGovernments;
	int localBodies;
	int publicServices;
	int projects;
	int welfarePrograms;
	int infrastructure;
	int security;
	int diplomacy;
	int economy;
	int taxes;
	int developmentPlans;
	int reforms;

	Policy policy;

	public void displayGovernmentDetails(){

		this.policy.displayPolicyDetails();

		System.out.println("Ministries: "+ministries);
		System.out.println("Departments: "+departments);
		System.out.println("Ministers: "+ministers);
		System.out.println("Policies Count: "+policiesCount);
		System.out.println("Schemes: "+schemes);
		System.out.println("Budgets: "+budgets);
		System.out.println("Laws: "+laws);
		System.out.println("Parliament Members: "+parliamentMembers);
		System.out.println("State Governments: "+stateGovernments);
		System.out.println("Local Bodies: "+localBodies);
		System.out.println("Public Services: "+publicServices);
		System.out.println("Projects: "+projects);
		System.out.println("Welfare Programs: "+welfarePrograms);
		System.out.println("Infrastructure: "+infrastructure);
		System.out.println("Security: "+security);
		System.out.println("Diplomacy: "+diplomacy);
		System.out.println("Economy: "+economy);
		System.out.println("Taxes: "+taxes);
		System.out.println("Development Plans: "+developmentPlans);
		System.out.println("Reforms: "+reforms);

	}
}