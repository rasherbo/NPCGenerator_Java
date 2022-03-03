import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Dwarf implements Race
{
    private String race = "Dwarf";
    private int speed = 25;
    private int maxAge = 350;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public Dwarf(int level) throws FileNotFoundException
    {
        Random random = new Random();

        Scanner read = new Scanner(new File("DwarfTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        proficiencies.add("Battleaxe");
        proficiencies.add("Handaxe");
        proficiencies.add("Throwing Hammer");
        proficiencies.add("Warhammer");
        int num = random.nextInt(3) + 1;
        if(num == 1)
        {
            proficiencies.add("Smith's Tools");
        } else if(num == 2)
        {
            proficiencies.add("Brewer's Supplies");
        } else
        {
            proficiencies.add("Mason's Tools");
        }
        num = random.nextInt(2);
        if (num == 0)
        {
            abilityScores.add("Wis1");
            subrace = "Hill Dwarf";
        }
        else
        {
            proficiencies.add("Light Armor");
            proficiencies.add("Medium Armor");
            abilityScores.add("Str2");
            subrace = "Mountain Dwarf";
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