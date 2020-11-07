public class Droid {
    // Instance Fields
    int batteryLevel;
    String name;

    // Constructor method
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // toString method
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    // performTask method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(name + "'s battery level is currently: " + batteryLevel);
    }

    // Main method
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        Droid happy = new Droid("Happy");

        System.out.println(codey);
        System.out.println(happy);

        codey.energyReport();
        happy.energyReport();

        codey.performTask("Take out the trash");
        codey.performTask("Wash the dishes");
        codey.performTask("Make the bed");
        codey.performTask("Dust");

        happy.performTask("Play the piano");
        happy.performTask("Water the garden");


        codey.energyReport();
        happy.energyReport();
    }

}