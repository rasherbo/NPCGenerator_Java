import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Elf implements Race
{
    private String race = "Elf";
    private int speed = 30;
    private int maxAge = 750;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public Elf(int level) throws FileNotFoundException
    {
        Random random = new Random();
        Scanner read = new Scanner(new File("ElfTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        proficiencies.add("Perception");
        abilityScores.add("Dex2");
        int num = random.nextInt(3);
        if(num == 0)
        {
            subrace = "High Elf";
            abilityScores.add("Int1");
            proficiencies.add("Longsword");
            proficiencies.add("Shortsword");
            proficiencies.add("Longbow");
            proficiencies.add("Shortbow");
            traits.add("Extra Cantrip: 1 cantrip of your choice from the Wizard spell list, cast with Intelligence.");
            num = random.nextInt(7);
            if(num == 0 )
            {
                traits.add("Extra Language: Draconic.");
            } else if(num == 1) {
                traits.add("Extra Language: Infernal.");
            } else if(num == 2) {
                traits.add("Extra Language: Elvish.");
            } else if(num == 3) {
                traits.add("Extra Language: Halfing.");
            } else if(num == 4) {
                traits.add("Extra Language: Dwarvish.");
            } else if(num == 5) {
                traits.add("Extra Language: Orc.");
            } else if(num == 6) {
                traits.add("Extra Language: Gnomish.");
            }
        }
        else if(num == 1)
        {
            subrace = "Wood Elf";
            abilityScores.add("Wis1");
            proficiencies.add("Longsword");
            proficiencies.add("Shortsword");
            proficiencies.add("Longbow");
            proficiencies.add("Shortbow");
            speed = 35;
            traits.add("Mask of the Wild: Can hide in nature, despite partial obscurity.");
        } 
        else
        {
            subrace = "Drow";
            abilityScores.add("Cha1");
            proficiencies.add("Rapier");
            proficiencies.add("Crosssbow");
            proficiencies.add("Shortbow");
            traits.add("Superior Darkvision: Radius is increased to 120ft.");
            if(level < 3)
            {
                traits.add("Drow Magic: You know the dancing lights cantrip.");
            }
            else if(level >= 3 && level < 5)
            {
                traits.add("Drow Magic: You know the dancing lights cantrip and can cast the faerie fire spell once per day using charisma.");
            }
            else if(level >= 5)
            {
                traits.add("Drow Magic: You know the dancing lights cantrip and can cast the faerie fire spell and darkness spell once per day using charisma.");
            }
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