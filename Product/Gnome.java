import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Gnome implements Race
{
    private String race = "Gnome";
    private int speed = 25;
    private int maxAge = 500;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public Gnome(int level) throws FileNotFoundException
    {
        Random random = new Random();
        Scanner read = new Scanner(new File("GnomeTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        abilityScores.add("Int2");
        int num = random.nextInt(2);
        if(num == 0)
        {
            subrace = "Forest Gnome";
            abilityScores.add("Dex1");
            traits.add("Natural Illusionist: You know the minor illusion cantrip, cast with Intelligence.");
            traits.add("Speak with Small Beasts: Can communicate simple ideas with small or smaller beasts through sounds and gestures.");
        }
        else if(num == 1)
        {
            subrace = "Rock Gnome";
            abilityScores.add("Con1");
            traits.add("Artificer's Lore: You have expertise in history checks related to magic items.");
            proficiencies.add("Tinker's Tools");
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