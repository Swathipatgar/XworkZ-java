package com.xworkz.schemeapp.rbi;

public class HdfsBankImpl implements RbiRules {

    @Override
    public boolean kyc() {
        System.out.println("KYC verification completed");
        return true;
    }

    @Override
    public void fraudDetection() {
        System.out.println("Fraud detection system activated");
    }

    @Override
    public void minimumBalance() {
        System.out.println("Minimum balance should be maintained");
    }

    @Override
    public double monetaryPolicy() {
        System.out.println("Monetary policy applied");
        return 6.5;
    }

    @Override
    public void loanApproval() {
        System.out.println("Loan approved based on eligibility");
    }

    @Override
    public void digitalPaymentSecurity() {
        System.out.println("Digital payment security enabled");
    }
}