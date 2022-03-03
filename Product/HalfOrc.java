import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class HalfOrc implements Race
{
    private String race = "Half-Orc";
    private int speed = 30;
    private int maxAge = 75;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public HalfOrc(int level) throws FileNotFoundException
    {
        Random random = new Random();

        Scanner read = new Scanner(new File("HalfOrcTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        proficiencies.add("Intimidation");
        abilityScores.add("Str2");
        abilityScores.add("Con1");
    }

    public ArrayList<String> getTraits()
    {
        return traits;
    }

    public ArrayList<String> getProficiencies()
    {
        return proficiencies;
    }

    public ArrayList<String> getAbilityScores()
    {
        return abilityScores;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getAge()
    {
        Random random = new Random();
        return random.nextInt(maxAge) + 1;
    }

    public String getSubRace()
    {
        return subrace;
    }

    public String getRace()
    {
        return race;
    }
}