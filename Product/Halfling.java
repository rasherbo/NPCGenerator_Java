import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Halfling implements Race
{
    private String race = "Halfling";
    private int speed = 25;
    private int maxAge = 160;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();


    public Halfling(int level) throws FileNotFoundException
    {
        Random random = new Random();
        Scanner read = new Scanner(new File("HalflingTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        abilityScores.add("Dex2");
        int num = random.nextInt(2);
        if(num == 0)
        {
            subrace = "LightFoot";
            abilityScores.add("Cha1");
            traits.add("Naturally Stealthy: You can attempt to hide when obscured by a creature that is larger than you.");
        }
        else if(num == 1)
        {
            subrace = "Stout";
            abilityScores.add("Con1");
            traits.add("Stout Resilience: Advantage on saving throws against poison, and you have resistance to poison damage.");
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
