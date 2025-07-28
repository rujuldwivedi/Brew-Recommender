import java.util.ArrayList;
import java.util.List;

public class BrewDatabase
{

    public static List<BrewMethod> getBrewMethods()
    {
        List<BrewMethod> methods = new ArrayList<>();

        methods.add(new BrewMethod("French Press", "strong", "French Press", 5));
        methods.add(new BrewMethod("AeroPress", "smooth", "AeroPress", 3));
        methods.add(new BrewMethod("V60 Pour Over", "clean", "V60", 4));
        methods.add(new BrewMethod("Moka Pot", "strong", "Moka Pot", 5));
        methods.add(new BrewMethod("Cold Brew", "fruity", "Jar or Cold Brew Maker", 720));
        methods.add(new BrewMethod("Espresso", "intense", "Espresso Machine", 2));
        methods.add(new BrewMethod("Chemex", "clean", "Chemex", 6));

        return methods;
    }
}
