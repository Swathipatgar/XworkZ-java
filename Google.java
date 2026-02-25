class Google {

    void login(String gmail, String password) {
        System.out.println("Google Login using Gmail & Password");
    }

    void login(String phoneNumber, int otp) {
        System.out.println("Google Login using Phone & OTP");
    }

    void login(String gmail, String password, boolean twoStepVerification) {
        System.out.println("Google Login with 2-Step Verification");
    }
}