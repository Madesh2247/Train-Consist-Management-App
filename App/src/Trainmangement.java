import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search with Defensive Check
    public static boolean binarySearch(String[] bogieIds, String searchKey) {

        // ✅ Defensive Programming: Check empty state
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train consist.");
        }

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input bogie IDs
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }
        }

        // Sort before binary search
        Arrays.sort(bogieIds);

        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = binarySearch(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // ✅ Meaningful error message to user
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
