import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class Trainmanagementapp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100)); // varying capacity
        }

        // ---------------- LOOP METHOD ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM METHOD ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Results
        System.out.println("\nLoop Filtering Time (ns): " + loopTime);
        System.out.println("Stream Filtering Time (ns): " + streamTime);

        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}