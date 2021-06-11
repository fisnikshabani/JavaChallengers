package oop.constructors;

public class ResidentEvilNameChange {

    String name = "Nemesis";

    public ResidentEvilNameChange(String name) {
        name = name;
    }

    public static void main(String[] args) {

        ResidentEvilNameChange residentEvilNameChange = new ResidentEvilNameChange("Leon");

        System.out.println(residentEvilNameChange.name);

        residentEvilNameChange.changeName("Claire");
        System.out.println(residentEvilNameChange.name);
    }

    void changeName(String name){
        this.name = this.name;
    }
}
