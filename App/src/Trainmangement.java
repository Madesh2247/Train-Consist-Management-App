import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class Trainmanagement{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Sort bogies by capacity
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("\nBogies sorted by capacity:");

        for (Bogie b : bogies) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }
    }
}