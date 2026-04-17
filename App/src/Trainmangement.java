import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = scanner.nextLine();
        }

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        scanner.close();
    }
}
