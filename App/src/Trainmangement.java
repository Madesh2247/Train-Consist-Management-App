import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Binary Search
    public static boolean binarySearch(String[] bogieIds, String searchKey) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return false; // Not found
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

        // Ensure sorted data (important precondition)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found using Binary Search.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}
