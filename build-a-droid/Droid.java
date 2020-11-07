public class Droid {
    // Instance Fields
    int batteryLevel;
    String name;

    // Constructor methods
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // Main method
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");

        System.out.println(codey.name);
    }

}