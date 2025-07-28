import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Brew Recommender!");

        System.out.print("Enter your taste preference (e.g., strong, smooth, fruity, clean, intense): ");
        String taste = scanner.nextLine().trim();

        System.out.println("Enter the gear you have (comma-separated, e.g., French Press,AeroPress,V60): ");
        String gearInput = scanner.nextLine().trim();

        List<String> gearList = Arrays.asList(gearInput.split("\\s*,\\s*"));

        System.out.print("Enter the maximum time you can spend brewing (in minutes): ");

        int maxTime = scanner.nextInt();

        scanner.nextLine();

        UserPreferences preferences = new UserPreferences(taste, gearList, maxTime);
        List<BrewMethod> allMethods = BrewDatabase.getBrewMethods();
        List<BrewMethod> results = RecommenderEngine.recommend(preferences, allMethods);

        System.out.println("\n Recommended Brew Methods for You:\n");

        if(results.isEmpty()) 
        System.out.println("Sorry, no suitable brews found. Try relaxing your constraints.");

        else
        results.forEach(method -> System.out.println("- " + method));

        scanner.close();
    }
}
