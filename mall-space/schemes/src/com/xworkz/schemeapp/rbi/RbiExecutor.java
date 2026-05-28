package com.xworkz.schemeapp.rbi;

public class RbiExecutor {

    public static void main(String[] args) {

        RbiRules rbi = new HdfsBankImpl();

        boolean status = rbi.kyc();
        System.out.println("KYC Status: " + status);
        rbi.fraudDetection();
        rbi.minimumBalance();

        double rate = rbi.monetaryPolicy();
        System.out.println("Monetary Policy Rate: " + rate);
        rbi.loanApproval();
        rbi.digitalPaymentSecurity();
    }
}