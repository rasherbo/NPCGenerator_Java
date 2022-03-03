import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Tiefling implements Race
{
    private String race = "Tiefling";
    private int speed = 30;
    private int maxAge = 120;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public Tiefling(int level) throws FileNotFoundException
    {
        Random random = new Random();

        Scanner read = new Scanner(new File("TieflingTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        abilityScores.add("Cha2");
        abilityScores.add("Int1");

        if(level < 3)
        {
            traits.add("Infernal Legacy: You know the Thaumaturgy cantrip.");
        }
        else if(level >= 3 && level < 5)
        {
            traits.add("Infernal Legacy: You know the Thaumaturgy cantrip and can cast Hellish Rebuke as a 2nd level spell once per day using charisma.");
        }
        else if(level >= 5)
        {
            traits.add("Infernal Legacy: You know the Thaumaturgy cantrip and can cast Hellish Rebuke as a 2nd level spell and darkness spell once per day using charisma.");
        }
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