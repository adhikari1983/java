package class18.inheritance.protectedexplain;

public class TV {
    protected int size;
    private String make;
    private String model;

}

class SamsungTv extends TV {

}

class TVTester {
    public static void main(String[] args) {
        SamsungTv samsung = new SamsungTv();
        samsung.size = 70;
    }
}