public class BrewMethod
{
    private String name;
    private String tasteProfile;
    private String equipment;
    private int minTime;

    public BrewMethod(String name, String tasteProfile, String equipment, int minTime)
    {
        this.name = name;
        this.tasteProfile = tasteProfile;
        this.equipment = equipment;
        this.minTime = minTime;
    }

    public String getName()
    {
        return name;
    }

    public String getTasteProfile()
    {
        return tasteProfile;
    }

    public String getEquipment()
    {
        return equipment;
    }

    public int getMinTime()
    {
        return minTime;
    }

    @Override
    public String toString()
    {
        return name + " | Taste: " + tasteProfile + " | Gear: " + equipment + " | Time: " + minTime + " mins";
    }
}
