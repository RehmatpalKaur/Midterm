import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt user to enter their name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Prompt user to choose their favorite genre
        System.out.print("Choose your favorite genre (enter the number): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice. Exiting...");
            return;
        }
        String userGenre = genres[choice - 1];

        // Create UserProfile object
        UserProfile userProfile = new UserProfile(userName, userGenre);

        // Display message
        System.out.println("User profile created successfully for " + userProfile.getUserID() +
                " with favorite genre " + userProfile.getGenre());

        scanner.close();
    }
}