package inheritancepolymorphism.toString;

public class SimpsonToString {

    private String name;
    private String weight;

    public SimpsonToString(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {
        SimpsonToString simpsonToString = new SimpsonToString("Homer", "240");
        System.out.println(simpsonToString);
    }

    @Override
    public String toString() {
        return "Simpson name: ".concat(this.name).concat(", weight: ").concat(weight);
    }
}
