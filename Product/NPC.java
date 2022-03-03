import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.File;
import java.io.FileNotFoundException;

public class NPC
{
    private Race race;
    private Class classs;
    private int hitPoints;
    private int armourClass;
    private int passivePerception;
    private int age = 0;
    private int level;
    private String name;
    private String voicePrompt;
    private HashMap<String, Integer> abilityScores = new HashMap<String, Integer>();

    public NPC(boolean vp, boolean rrace, boolean rclass, boolean rlevel, boolean rage, boolean rname, String level) 
    {
        Random rand = new Random();

        if(rlevel)
        {
            this.level = rand.nextInt(20) + 1;
        }
        else
        {
            this.level = Integer.parseInt(level);
        }

        if(vp) 
        {
            try
            {
                Scanner read = new Scanner(new File("VoicePrompts.txt"));
                for(int i = 0; i < rand.nextInt(30) + 1; i++)
                {
                    voicePrompt = read.nextLine();
                }
                read.close();
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Why");
            }
        }

        if(rrace)
        {
            randomizeRace(this.level, rage);
            getAbilityScores();
        }

        if(rclass)
        {
            randomizeClass(this.level);
        }

        if(rname)
        {
            try
            {
                Scanner read = new Scanner(new File("Names.txt"));
                for(int i = 0; i < rand.nextInt(121) + 1; i++)
                {
                    this.name = read.nextLine();
                }
                read.close();
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Why");
            }
        }
    }

    public void getAbilityScores()
    {
        Random rand = new Random();

        abilityScores.put("Str", rand.nextInt(16) + 3);
        abilityScores.put("Dex", rand.nextInt(16) + 3);
        abilityScores.put("Con", rand.nextInt(16) + 3);
        abilityScores.put("Int", rand.nextInt(16) + 3);
        abilityScores.put("Wis", rand.nextInt(16) + 3);
        abilityScores.put("Cha", rand.nextInt(16) + 3);

        for (int i = 0; i < race.getAbilityScores().size(); i++)
        {
            abilityScores.replace(race.getAbilityScores().get(i).substring(0,3), abilityScores.get(race.getAbilityScores().get(i).substring(0,3)) + Integer.parseInt(race.getAbilityScores().get(i).substring(3)));
        }

        setArmourClass();
    }

    public void randomizeClass(int level)
    {
        Random rand = new Random();
        int num = rand.nextInt(3);

        if(num == 0)
        {
            this.classs = new Barbarian(level);
            this.hitPoints = classs.getHP(level);
        } 
        else if(num == 1)
        {
            this.classs = new Bard(level);
            this.hitPoints = classs.getHP(level);
        }
        else if(num == 2)
        {
            this.classs = new Cleric(level);
            this.hitPoints = classs.getHP(level);
        }
        /* --For Future Additions--
        else if(num == 3)
        {
            //this.classs = new Druid(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 4)
        {
            //this.classs = new Fighter(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 5)
        {
            //this.classs = new Monk(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 6)
        {
            //this.classs = new Paladin(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 7)
        {
            //this.classs = new Ranger(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 8)
        {
            //this.classs = new Rogue(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 9)
        {
            //this.classs = new Sorcerer(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 10)
        {
            //this.classs = new Warlock(level);
            //this.hitPoints = classs.getHP(level);
        }
        else if(num == 11)
        {
            //this.classs = new Wizard(level);
            //this.hitPoints = classs.getHP(level);
        }
        */
        
    }

    public void randomizeRace(int level, boolean rage)
    {
        Random rand = new Random();
        int num = rand.nextInt(9);

        if(num == 0)
        {
            try 
            {
                this.race = new Dwarf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }   
            } catch(FileNotFoundException e) 
            {
                System.out.println("Why");
            }
        } 
        else if(num == 1)
        {
            try
            {
                this.race = new Tiefling(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(num == 2)
        {
            try
            {
                this.race = new Elf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(num == 3)
        {
            try
            {
                this.race = new Halfling(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(num == 4)
        {
            this.race = new Human(level);
            if(rage)
            {
                this.age = this.race.getAge();
            }
        }
        else if(num == 5)
        {
            this.race = new Dragonborn(level);
            if(rage)
            {
                this.age = this.race.getAge();
            }
        }
        else if(num == 6)
        {
            try
            {
                this.race = new Gnome(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(num == 7)
        {
            try
            {
                this.race = new HalfElf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(num == 8)
        {
            try
            {
                this.race = new HalfOrc(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
    }

    public void setRace(boolean rage, String race)
    {
        if(race.equals("Dwarf"))
        {
            try 
            {
                this.race = new Dwarf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }   
            } catch(FileNotFoundException e) 
            {
                System.out.println("Why");
            }
        } 
        else if(race.equals("Tiefling"))
        {
            try
            {
                this.race = new Tiefling(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(race.equals("Elf"))
        {
            try
            {
                this.race = new Elf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(race.equals("Halfling"))
        {
            try
            {
                this.race = new Halfling(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(race.equals("Human"))
        {
            this.race = new Human(level);
            if(rage)
            {
                this.age = this.race.getAge();
            }
        }
        else if(race.equals("Dragonborn"))
        {
            this.race = new Dragonborn(level);
            if(rage)
            {
                this.age = this.race.getAge();
            }
        }
        else if(race.equals("Gnome"))
        {
            try
            {
                this.race = new Gnome(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(race.equals("Half-Elf"))
        {
            try
            {
                this.race = new HalfElf(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        else if(race.equals("Half-Orc"))
        {
            try
            {
                this.race = new HalfOrc(level);
                if(rage)
                {
                    this.age = this.race.getAge();
                }
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Why");
            }
        }
        getAbilityScores();
    }

    public void setLevel(String level)
    {
        this.level = Integer.parseInt(level);
    }

    public void setClass(String classs)
    {
        if(classs.equals("Barbarian"))
        {
            this.classs = new Barbarian(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        } 
        else if(classs.equals("Bard"))
        {
            this.classs = new Bard(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Cleric"))
        {
            this.classs = new Cleric(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        /* --For Future Additions--
        else if(classs.equals("Druid"))
        {
            //this.classs = new Druid(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Fighter"))
        {
            //this.classs = new Fighter(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Monk"))
        {
            //this.classs = new Monk(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Paladin"))
        {
            //this.classs = new Paladin(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Ranger"))
        {
            //this.classs = new Ranger(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Rogue"))
        {
            //this.classs = new Rogue(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Sorcerer"))
        {
            //this.classs = new Sorcerer(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Warlock"))
        {
            //this.classs = new Warlock(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        else if(classs.equals("Wizard"))
        {
            //this.classs = new Wizard(level);
            this.hitPoints = this.classs.getHP(level) + (level * getModifier(abilityScores.get("Con")));
        }
        */
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setArmourClass()
    {
        int dex = abilityScores.get("Dex");
        if(dex == 3)
        {
            this.armourClass = 6; 
        }
        else if(dex > 3 && dex < 6)
        {
            this.armourClass = 7;
        }
        else if(dex > 5 && dex < 8)
        {
            this.armourClass = 8;
        }
        else if(dex > 7 && dex < 10)
        {
            this.armourClass = 9;
        }
        else if(dex > 9 && dex < 12)
        {
            this.armourClass = 10;
        }
        else if(dex > 11 && dex < 14)
        {
            this.armourClass = 11;
        }
        else if(dex > 13 && dex < 16)
        {
            this.armourClass = 12;
        }
        else if(dex > 15 && dex < 18)
        {
            this.armourClass = 13;
        }
        else if(dex > 17 && dex < 20)
        {
            this.armourClass = 14;
        }
        else
        {
            this.armourClass = 15;
        }
    }

    public void setPassivePerception()
    {
        int wis = getModifier(abilityScores.get("Wis"));
        if(classs.getProficiencies().contains("Perception") || race.getProficiencies().contains("Perception"))
        {
            if(this.level < 5)
            {
                this.passivePerception = 12 + wis;
            }
            else if(this.level < 9)
            {
                this.passivePerception = 13 + wis;
            }
            else if(this.level < 13)
            {
                this.passivePerception = 14 + wis;
            }
            else if(this.level < 17)
            {
                this.passivePerception = 15 + wis;
            }
            else 
            {
                this.passivePerception = 16 + wis;
            }
        }
        else
        {
            this.passivePerception = 10 + wis;
        }
    }

    public int getModifier(int score)
    {
        if(score == 3)
        {
            return -4; 
        }
        else if(score > 3 && score < 6)
        {
            return -3;
        }
        else if(score > 5 && score < 8)
        {
            return -2;
        }
        else if(score > 7 && score < 10)
        {
            return -1;
        }
        else if(score > 9 && score < 12)
        {
            return 0;
        }
        else if(score > 11 && score < 14)
        {
            return 1;
        }
        else if(score > 13 && score < 16)
        {
            return 2;
        }
        else if(score > 15 && score < 18)
        {
            return 3;
        }
        else if(score > 17 && score < 20)
        {
            return 4;
        }
        else
        {
            return 5;
        }
    }

    public String getLayout1()
    {
        String LOne = this.name + "\n" + "Level: " + this.level + "\n" + this.race.getRace() + "\n" + this.classs.getClasss() + "\n" + "Age: " + this.age + "\n";
        if(voicePrompt != null)
        {
            LOne += "Voice Prompt: " + voicePrompt + "\n";
        }
        LOne += "____________________________________________________________" + "\n";
        return LOne;
    }

    public String getLayout2()
    {
        String LTwo = "Armour Class: " + this.armourClass + "\n" + "HP: " + this.hitPoints + "\n" + "Speed: " + race.getSpeed() + "\n" + "____________________________________________________________" + "\n";
        return LTwo;
    }

    public String getLayout3()
    {
        String LThree = "Str: " + abilityScores.get("Str") + " (" + getModifier(abilityScores.get("Str")) + ") ";
        LThree += "Dex: " + abilityScores.get("Dex") + " (" + getModifier(abilityScores.get("Dex")) + ") ";
        LThree += "Con: " + abilityScores.get("Con") + " (" + getModifier(abilityScores.get("Con")) + ") ";
        LThree += "Int: " + abilityScores.get("Int") + " (" + getModifier(abilityScores.get("Int")) + ") ";
        LThree += "Wis: " + abilityScores.get("Wis") + " (" + getModifier(abilityScores.get("Wis")) + ") ";
        LThree += "Cha: " + abilityScores.get("Cha") + " (" + getModifier(abilityScores.get("Cha")) + ") ";
        LThree += "____________________________________________________________" + "\n";
        return LThree;

    }

    public String getLayout4()
    {
        setPassivePerception();
        String LFour = "Passive Perception: " + this.passivePerception + "\n" + "Proficiencies: \n";
        for(int i = 0; i < race.getProficiencies().size(); i++)
        {
            LFour += race.getProficiencies().get(i) + "\n";
        }
        for(int i = 0; i < classs.getProficiencies().size(); i++)
        {
            LFour += classs.getProficiencies().get(i) + "\n";
        }
        LFour += "____________________________________________________________" + "\n";
        return LFour;
    }

    public String getLayout5()
    {
        String LFive = "";
        for(int i = 0; i < race.getTraits().size(); i++)
        {
            LFive += race.getTraits().get(i) + "\n";
        }
        LFive += "____________________________________________________________" + "\n";
        return LFive;
    }

    public String getLayout6()
    {
        String LSix = "";
        for(String feature : classs.getFeatures().keySet())
        {
            LSix += feature + ": " + classs.getFeatures().get(feature) + "\n";
        }
        LSix += "____________________________________________________________" + "\n";
        return LSix;
    }


}