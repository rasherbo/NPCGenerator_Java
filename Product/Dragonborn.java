import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Dragonborn implements Race
{
    private String race = "Dragonborn";
    private int speed = 30;
    private int maxAge = 80;
    private String subrace;
    private ArrayList<String> traits = new ArrayList<String>();
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private ArrayList<String> abilityScores = new ArrayList<String>();


    public Dragonborn(int level) 
    {
        Random random = new Random();
        traits.add("Languages: Common and Draconic");
        abilityScores.add("Str2");
        abilityScores.add("Cha1");
        int num = random.nextInt(10);
        if(num == 0)
        {
            subrace = "Black Dragon";
            traits.add("Damage Resistance: You have resistance to Acid Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
        }
        else if(num == 1)
        {
            subrace = "Blue Dragon";
            traits.add("Damage Resistance: You have resistance to Lightning Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");            
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 2)
        {
            subrace = "Bronze Dragon";
            traits.add("Damage Resistance: You have resistance to Lightning Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");            
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Lighting Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 3)
        {
            subrace = "Brass Dragon";
            traits.add("Damage Resistance: You have resistance to Fire Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Fire Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Fire Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Fire Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Fire Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
        } 
        else if(num == 4)
        {
            subrace = "Copper Dragon";
            traits.add("Damage Resistance: You have resistance to Acid Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Acid Damage, 5 by 30ft line (Dex Save, DC = 8 + Con + proficiency bonus). \n Can use after every rest.");
            }
        } 
        else if(num == 5)
        {
            subrace = "Gold Dragon";
            traits.add("Damage Resistance: You have resistance to Fire Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 6)
        {
            subrace = "Green Dragon";
            traits.add("Damage Resistance: You have resistance to Poison Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Poison Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Poison Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Poison Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Poison Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 7)
        {
            subrace = "Red Dragon";
            traits.add("Damage Resistance: You have resistance to Fire Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Fire Damage, 15ft cone (Dex Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 8)
        {
            subrace = "Silver Dragon";
            traits.add("Damage Resistance: You have resistance to Cold Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
        } 
        else if(num == 9)
        {
            subrace = "White Dragon";
            traits.add("Damage Resistance: You have resistance to Cold Damage.");
            if(level < 6)
            {
                traits.add("Breath Attack: 2d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 6 && level < 11)
            {
                traits.add("Breath Attack: 3d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if(level >= 11 && level < 16)
            {
                traits.add("Breath Attack: 4d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
            }
            else if( level >= 16)
            {
                traits.add("Breath Attack: 5d6 Cold Damage, 15ft cone (Con Save, DC = 8 + Con + proficiency bonus)). \n Can use after every rest.");
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
