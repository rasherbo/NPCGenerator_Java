import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Human implements Race
{
    private String race = "Human";
    private int speed = 30;
    private int maxAge = 100;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();


    public Human(int level) 
    {
        Random random = new Random();
        int num = random.nextInt(7);
        if(num == 0 )
        {
            traits.add("Languages: Common and Draconic.");
        } else if(num == 1) {
            traits.add("Languages: Common and Infernal.");
        } else if(num == 2) {
            traits.add("Languages: Common and Elvish.");
        } else if(num == 3) {
            traits.add("Languages: Common and Halfing.");
        } else if(num == 4) {
            traits.add("Languages: Common and Dwarvish.");
        } else if(num == 5) {
            traits.add("Languages: Common and Orc.");
        } else if(num == 6) {
            traits.add("Languages: Common and Gnomish.");
        }
        abilityScores.add("Str1");
        abilityScores.add("Dex1");
        abilityScores.add("Con1");
        abilityScores.add("Int1");
        abilityScores.add("Wis1");
        abilityScores.add("Cha1");
        subrace = "human";
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
