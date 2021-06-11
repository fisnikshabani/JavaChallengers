package oop.constructors;

//invoking constructors with the keyword THIS
public class BatMobile {

    String versionName;
    int modelYear;

    public BatMobile(String versionName, int modelYear) {
        this.versionName = versionName;
        this.modelYear = modelYear;
    }

    public BatMobile() {
        this ("Batman Forever", 1995);
    }

    public static void main(String[] args) {

        BatMobile batmanForever = new BatMobile();
        batmanForever.printBatMobileDescription();

        BatMobile batmanArkhamKnight = new BatMobile("Arkham Knight", 2014);
        batmanArkhamKnight.printBatMobileDescription();

    }

    void printBatMobileDescription(){
        System.out.println("Version name: " + this.versionName + " Model year: " + this.modelYear);
    }
}
