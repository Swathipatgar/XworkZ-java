class Bangle {
    int bangleId;   
	
    Bangle() {
        System.out.println("Default Constructor Invoked");
    }

    Bangle(int bangleId) {
        this.bangleId = bangleId;
        System.out.println("Parameter Constructor Invoked");
    }
}