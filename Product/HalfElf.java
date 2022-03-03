import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.File;
import java.io.FileNotFoundException;

public class HalfElf implements Race
{
    private String race = "Half-Elf";
    private int speed = 30;
    private int maxAge = 200;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();

    public HalfElf(int level) throws FileNotFoundException
    {
        Random random = new Random();
        Scanner read = new Scanner(new File("HalfElfTraits.txt"));
        while(read.hasNextLine())
        {
            traits.add(read.nextLine());
        }
        abilityScores.add("Cha2");
        abilityScores.add(randomScore());
        abilityScores.add(randomScore());
        String prof = randomProficiency();
        proficiencies.add(prof);
        String prof2 = "";
        while(prof.equals(prof2))
        {
            prof2 = randomProficiency();
        }
        proficiencies.add(prof2);
        int num = random.nextInt(7);
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

    public String randomScore()
    {
        Random random = new Random();
        int num = random.nextInt(6);
        if(num == 0)
        {
            return "Str1";
        } else if(num == 1)
        {
            return "Dex1";
        } else if (num == 2)
        {
            return "Con1";
        } else if(num == 3)
        {
            return "Int1";  
        } else if(num == 4)
        {
            return "Wis1";
        } else 
        {
            return "Cha1";
        }
    }

    public String randomProficiency()
    {
        Random random = new Random();
        int num = random.nextInt(18);
        if(num == 0)
        {
            return "Acrobatics";
        } else if(num == 1)
        {
            return "Animal Handling";
        } else if (num == 2)
        {
            return "Arcana";
        } else if(num == 3)
        {
            return "Athletics";  
        } else if(num == 4)
        {
            return "Deception";
        } else if(num == 5)
        {
            return "History";
        }else if(num == 6)
        {
            return "Insight";
        }else if(num == 7)
        {
            return "Intimidation";
        }else if(num == 8)
        {
            return "Investigation";
        }else if(num == 9)
        {
            return "Medicine";
        }else if(num == 10)
        {
            return "Nature";
        }else if(num == 11)
        {
            return "Perception";
        }else if(num == 12)
        {
            return "Performance";
        }else if(num == 13)
        {
            return "Persuasion";
        }else if(num == 14)
        {
            return "Religion";
        }else if(num == 15)
        {
            return "Sleight of Hand";
        }else if(num == 16)
        {
            return "Stealth";
        }else 
        {
            return "Survival";
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