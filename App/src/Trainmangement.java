import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Linear Search
    public static boolean linearSearch(String[] bogieIds, String searchKey) {
        for (int i = 0; i < bogieIds.length; i++) {
            // Compare using equals()
            if (bogieIds[i].equals(searchKey)) {
                return true; // Match found → early termination
            }
        }
        return false; // No match found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found in the consist.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}
