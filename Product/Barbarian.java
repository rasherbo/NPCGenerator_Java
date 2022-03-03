import java.util.*;



public class Barbarian implements Class
{
    public static final int hitDice = 12;
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private HashMap<String, String> features = new HashMap<String, String>();

    public Barbarian(int level)
    {
        proficiencies.add("Medium Armor");
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Shields");
        proficiencies.add("Saving Throws: Strength, Constitution");
        String prof = randomProficiency();
        proficiencies.add(prof);
        String prof2 = randomProficiency();
        while(prof.equals(prof2))
        {
            prof2 = randomProficiency();
        }
        proficiencies.add(prof2);
        levelFeatures(features, level);
    }

    public int getHP(int level)
    {
        Random rand = new Random();
        int hp = hitDice;
        for(int i = 1; i < level; i++)
        {
            hp += rand.nextInt(hitDice) + 1;
        }
        return hp;
    }

    public String randomProficiency()
    {
        Random random = new Random();
        int num = random.nextInt(6);
        if(num == 0)
        {
            return "Animal Handling";
        } else if(num == 1)
        {
            return "Athletics";
        } else if (num == 2)
        {
            return "Intimidation";
        } else if(num == 3)
        {
            return "Nature";  
        } else if(num == 4)
        {
            return "Perception";
        } else
        {
            return "Survival";
        }
    }

    public ArrayList<String> getProficiencies()
    {
        return proficiencies;
    }

    public String getClasss()
    {
        return "Barbarian";
    }

    public HashMap<String, String> getFeatures()
    {
        return features;
    }

    public void levelFeatures(HashMap<String, String> features, int level)
    {
        if(level == 1)
        {
            one(features);
        } else if(level == 2)
        {
            two(features);
        }else if(level == 3)
        {
            three(features);
        }else if(level == 4)
        {
            four(features);
        }else if(level == 5)
        {
            five(features);
        }else if(level == 6)
        {
            six(features);
        }else if(level == 7)
        {
            seven(features);
        }else if(level == 8)
        {
            eight(features);
        }else if(level == 9)
        {
            nine(features);
        }else if(level == 10)
        {
            ten(features);
        }else if(level == 11)
        {
            eleven(features);
        }else if(level == 12)
        {
            twelve(features);
        }else if(level == 13)
        {
            thirteen(features);
        }else if(level == 14)
        {
            fourteen(features);
        }else if(level == 15)
        {
            fifteen(features);
        }else if(level == 16)
        {
            sixteen(features);
        }else if(level == 17)
        {
            seventeen(features);
        }else if(level == 18)
        {
            eighteen(features);
        }else if(level == 19)
        {
            nineteen(features);
        }else if(level == 20)
        {
            twenty(features);
        }
    }

    public void one(HashMap<String, String> features)
    {
        if(!features.containsKey("Rage") || features.isEmpty())
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +2 bonus to strength-based attacks. Lasts one minute, can use 2 times before long rest.");
        }
        features.put("Unarmored Defense", "Armor Class is 10 + Dex + Con without armor.");
    }

    public void two(HashMap<String, String> features)
    {
        features.put("Reckless Attack", "Can attack recklessly and gain advantage on strength attack, but attack rolls against you gain advantage until your next turn.");
        features.put("Danger Sense", "Advantage on Dex saves against things you can see.");
        levelFeatures(features, 1);
    }

    public void three(HashMap<String, String> features)
    {
        if(!features.containsKey("Primal Path"))
        {
            Random rand = new Random();
            int num = rand.nextInt(2);
            features.put("Primal Path", "");
            if(num == 0)
            {
                
                features.put("Frenzy", "During your rage you can go into a frenzy and make one melee attack as a bonus action, take one point of exhaustion when your rage ends.");
            }
            else if(num == 1)
            {
                features.put("Spirit Seeker",  "Can cast Beast Sense and Speak with animals as a ritual.");
                int num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Totem Spirit", "You embody the spirit of a Bear and while raging you have resistance to all damage except psychic.");
                }
                else if(num2 == 1)
                {
                    features.put("Totem Spirit", "You embody the spirit of an Eagle and while raging without wearing any armour creatures have disadvantage on opportunity attacks against you and you may dash as a bonus action.");
                }
                else
                {
                    features.put("Totem Spirit", "You embody the spirit of a Wolf and while raging your friends have advantage on melee attacks against hostile creatures within 5 feet of you.");
                }
            }
        }
        levelFeatures(features, 2);
    }

    public void four(HashMap<String, String> features)
    {
        levelFeatures(features, 3);
    }

    public void five(HashMap<String, String> features)
    {
        features.put("Extra Attack", "");
        features.put("Fast Movement", "Your speed increases by 10ft when not wearing armour.");
        levelFeatures(features, 4);
    }

    public void six(HashMap<String, String> features)
    {
        if(!features.containsKey("Primal Path"))
        {
            Random rand = new Random();
            int num = rand.nextInt(2);
            features.put("Primal Path", "");
            if(num == 0)
            {
                features.put("Frenzy", "During your rage you can go into a frenzy and make one melee attack as a bonus action, take one point of exhaustion when your rage ends.");
                features.put("Mindless Rage", "You can not be charmed or frightened while raging.");
            }
            else if(num == 1)
            {
                features.put("Spirit Seeker", "Can cast Beast Sense and Speak with animals as a ritual.");
                int num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Totem Spirit", "You embody the spirit of a Bear and while raging you have resistance to all damage except psychic.");
                }
                else if(num2 == 1)
                {
                    features.put("Totem Spirit", "You embody the spirit of an Eagle and while raging without wearing any armour creatures have disadvantage on opportunity attacks against you and you may dash as a bonus action.");
                }
                else
                {
                    features.put("Totem Spirit", "You embody the spirit of a Wolf and while raging your friends have advantage on melee attacks against hostile creatures within 5 feet of you.");
                }

                num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Aspect of the Beast", "Your carrying capacity doubles and you have advantage on all strength checks to push, pull, lift, or break objects.");
                }
                else if(num2 == 1)
                {
                    features.put("Aspect of the Beast", "You can see clearly up to 1 mile away and dim light does not impose disadvantage on your perception checks.");
                }
                else
                {
                    features.put("Aspect of the Beast", "You can track other creatures at a fast pace and can move steathily at a normal pace.");
                }
            }
        }
        if(!features.containsKey("Rage") || features.isEmpty())
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +2 bonus to strength-based attacks. Lasts one minute, can use 3 times before long rest.");
        }
        levelFeatures(features, 5);
    }

    public void seven(HashMap<String, String> features)
    {
        features.put("Feral Instinct", "You have advantage on all intiative rolls and if you are surprised you cana ct normally on your turn if you enter into a rage.");
        levelFeatures(features, 6);
    }

    public void eight(HashMap<String, String> features)
    {
        levelFeatures(features, 7);
    }

    public void nine(HashMap<String, String> features)
    {
        if(!features.containsKey("Brutal Critical"))
        {
            features.put("Brutal Critical", "When determining damage for a melee critical hit add an extra weapon damage die.");
        }
        if(!features.containsKey("Rage"))
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +3 bonus to strength-based attacks. Lasts one minute, can use 4 times before long rest.");
        }
        levelFeatures(features, 8);
    }

    public void ten(HashMap<String, String> features)
    {
        if(!features.containsKey("Primal Path"))
        {
            Random rand = new Random();
            int num = rand.nextInt(2);
            features.put("Primal Path", "");
            if(num == 0)
            {
                features.put("Frenzy", "During your rage you can go into a frenzy and make one melee attack as a bonus action, take one point of exhaustion when your rage ends.");
                features.put("Mindless Rage", "You can not be charmed or frightened while raging.");
                features.put("Intimidating Presence", "Every 24 hours you may frighten someone you can see up to 30ft away from you. The creature must make a Wis save (DC: 8 + proficiency bonus + charisma), if they fail they are frightened until the end of your next turn or until they are out of sight or more than 60ft away from you.");
            }
            else if(num == 1)
            {
                features.put("Spirit Seeker", "Can cast Beast Sense and Speak with animals as a ritual.");
                int num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Totem Spirit", "You embody the spirit of a Bear and while raging you have resistance to all damage except psychic.");
                }
                else if(num2 == 1)
                {
                    features.put("Totem Spirit", "You embody the spirit of an Eagle and while raging without wearing any armour creatures have disadvantage on opportunity attacks against you and you may dash as a bonus action.");
                }
                else
                {
                    features.put("Totem Spirit", "You embody the spirit of a Wolf and while raging your friends have advantage on melee attacks against hostile creatures within 5 feet of you.");
                }

                num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Aspect of the Beast", "Your carrying capacity doubles and you have advantage on all strength checks to push, pull, lift, or break objects.");
                }
                else if(num2 == 1)
                {
                    features.put("Aspect of the Beast", "You can see clearly up to 1 mile away and dim light does not impose disadvantage on your perception checks.");
                }
                else
                {
                    features.put("Aspect of the Beast", "You can track other creatures at a fast pace and can move steathily at a normal pace.");
                }
                features.put("Spirit Walker", "You can cast commune with nature as a ritual.");
            }
        }
        levelFeatures(features, 9);
    }

    public void eleven(HashMap<String, String> features)
    {
        features.put("Relentless Rage", "If you drop to 0 hitpoints while in a rage you may roll a DC 10 Con check and drop to 1 hit point instead.  DC increases by 5 every use, resets to 10 every long rest.");
        levelFeatures(features, 10);
    }

    public void twelve(HashMap<String, String> features)
    {
        if(!features.containsKey("Rage"))
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +3 bonus to strength-based attacks. Lasts one minute, can use 5 times before long rest.");
        }
        levelFeatures(features, 11);
    }

    public void thirteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Brutal Critical"))
        {
            features.put("Brutal Critical", "When determining damage for a melee critical hit add two extra weapon damage die.");
        }
        levelFeatures(features, 12);
    }

    public void fourteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Primal Path"))
        {
            Random rand = new Random();
            int num = rand.nextInt(2);
            features.put("Primal Path", "");
            if(num == 0)
            {
                features.put("Frenzy", "During your rage you can go into a frenzy and make one melee attack as a bonus action, take one point of exhaustion when your rage ends.");
                features.put("Mindless Rage", "You can not be charmed or frightened while raging.");
                features.put("Intimidating Presence", "Every 24 hours you may frighten someone you can see up to 30ft away from you. The creature must make a Wis save (DC: 8 + proficiency bonus + charisma), if they fail they are frightened until the end of your next turn or until they are out of sight or more than 60ft away from you.");
                features.put("Retaliation", "When you take damage from a creaure 5ft away you can use your reaction to make a melee weapon attack against them.");
            }
            else if(num == 1)
            {
                features.put("Spirit Seeker", "Can cast Beast Sense and Speak with animals as a ritual.");
                int num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Totem Spirit", "You embody the spirit of a Bear and while raging you have resistance to all damage except psychic.");
                }
                else if(num2 == 1)
                {
                    features.put("Totem Spirit", "You embody the spirit of an Eagle and while raging without wearing any armour creatures have disadvantage on opportunity attacks against you and you may dash as a bonus action.");
                }
                else
                {
                    features.put("Totem Spirit", "You embody the spirit of a Wolf and while raging your friends have advantage on melee attacks against hostile creatures within 5 feet of you.");
                }

                num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Aspect of the Beast", "Your carrying capacity doubles and you have advantage on all strength checks to push, pull, lift, or break objects.");
                }
                else if(num2 == 1)
                {
                    features.put("Aspect of the Beast", "You can see clearly up to 1 mile away and dim light does not impose disadvantage on your perception checks.");
                }
                else
                {
                    features.put("Aspect of the Beast", "You can track other creatures at a fast pace and can move steathily at a normal pace.");
                }
                features.put("Spirit Walker", "You can cast commune with nature as a ritual.");

                num2 = rand.nextInt(3);
                if(num2 == 0)
                {
                    features.put("Totemic Attunement", "While raging any hostile creature within 5ft of you has disadvantage on attacks against other creatures.");
                }
                else if(num2 == 1)
                {
                    features.put("Totemic Attunement", "While you are raging you have a flying speed equal to your walking speed, though this is only in short bursts and if you end your turn in the air you fall.");
                }
                else
                {
                    features.put("Totemic Attunement", "While you are raging you can knock a Large or smaller creature prone with a melee weapon attack.");
                }
            }
        }
        levelFeatures(features, 13);
    }

    public void fifteen(HashMap<String, String> features)
    {
        features.put("Persistant Rage", "Your rage only ends if you fall unconcious or choose to end it.");
        levelFeatures(features, 14);
    }

    public void sixteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Rage"))
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +4 bonus to strength-based attacks. Lasts one minute, can use 5 times before long rest.");
        }
        levelFeatures(features, 15);
    }

    public void seventeen(HashMap<String, String> features)
    {
        if(!features.containsKey("Brutal Critical"))
        {
            features.put("Brutal Critical", "When determining damage for a melee critical hit add three extra weapon damage die.");
        }
        if(!features.containsKey("Rage"))
        {
            features.put("Rage", "Advantage on Strength checks and saving throws.  Resistance to bludgeoning, piercing, and slashing damage. +4 bonus to strength-based attacks. Lasts one minute, can use 6 times before long rest.");
        }
        levelFeatures(features, 16);
    }

    public void eighteen(HashMap<String, String> features)
    {
        features.put("Indomitable Might", "If your strength check is lower than your strength score you can use your strength score instead.");
        levelFeatures(features, 17);
    }

    public void nineteen(HashMap<String, String> features)
    {
        levelFeatures(features, 18);
    }

    public void twenty(HashMap<String, String> features)
    {
        levelFeatures(features, 19);
    }
}