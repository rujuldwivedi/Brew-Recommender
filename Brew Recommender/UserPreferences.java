import java.util.List;

public class UserPreferences
{
    private String tasteProfile;
    private List<String> availableGear;
    private int maxTime;

    public UserPreferences(String tasteProfile, List<String> availableGear, int maxTime)
    {
        this.tasteProfile = tasteProfile;
        this.availableGear = availableGear;
        this.maxTime = maxTime;
    }

    public String getTasteProfile()
    {
        return tasteProfile;
    }

    public List<String> getAvailableGear()
    {
        return availableGear;
    }

    public int getMaxTime()
    {
        return maxTime;
    }
}
