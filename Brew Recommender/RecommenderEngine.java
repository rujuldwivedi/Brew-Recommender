import java.util.ArrayList;
import java.util.List;

public class RecommenderEngine
{

    public static List<BrewMethod> recommend(UserPreferences preferences, List<BrewMethod> allMethods)
    {
        List<BrewMethod> recommendations = new ArrayList<>();

        for(BrewMethod method : allMethods)
        {
            boolean tasteMatch = method.getTasteProfile().equalsIgnoreCase(preferences.getTasteProfile());
            boolean gearMatch = preferences.getAvailableGear().stream().anyMatch(gear -> gear.equalsIgnoreCase(method.getEquipment()));
            boolean timeMatch = method.getMinTime() <= preferences.getMaxTime();

            if(tasteMatch && gearMatch && timeMatch)
            recommendations.add(method);
        }

        return recommendations;
    }
}
