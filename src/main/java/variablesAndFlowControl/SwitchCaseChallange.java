package variablesAndFlowControl;

public class SwitchCaseChallange {
    public static void main(String[] args) {

        int formulaNumber = 10;

        String heisenbergFormula = "";

        switch (formulaNumber){
            case 1:
                    heisenbergFormula += "H";
            case 10:
                    heisenbergFormula += "Ne";
            case 30:
                    heisenbergFormula += "Zn";
            case 25:
                    heisenbergFormula += "Mn";
                    break;
            default:
                    heisenbergFormula += "He";
        }

        System.out.println(heisenbergFormula);

        String barneyBeerPreference = "Duff";

        switch (barneyBeerPreference){
            case "Guiness" :
                System.out.println("Barney prefers Guiness");
                break;
            case "Heineken" :
                System.out.println("Barney prefers Heineken");
                break;
            case "Duff" :
                System.out.println("Barney prefers Duff");
                break;
            default:
                System.out.println("Barney prefers some other beer!");
        }
    }
}
