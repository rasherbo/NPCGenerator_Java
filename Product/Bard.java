import java.util.*;

public class Bard implements Class
{
    public static final int hitDice = 8;
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private HashMap<String, String> features = new HashMap<String, String>();

    public Bard(int level)
    {
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Hand Crossbows");
        proficiencies.add("Lonswords");
        proficiencies.add("Rapiers");
        proficiencies.add("Shortswords");
        proficiencies.add("Saving Throws: Dexterity, Charisma");
        String prof = randomProficiency();
        proficiencies.add(prof);
        String prof2 = randomProficiency();
        while(prof.equals(prof2))
        {
            prof2 = randomProficiency();
        }
        String inst = randomInstrument();
        proficiencies.add(inst);
        String inst2 = randomInstrument();
        while(inst.equals(inst2))
        {
            inst2 = randomInstrument();
        }
        proficiencies.add(inst2);
        String inst3 = randomInstrument();
        while(inst3.equals(inst) || inst3.equals(inst2))
        {
            inst3 = randomInstrument();
        }
        proficiencies.add(inst3);
        levelFeatures(features, level);
    }

    public String randomInstrument()
    {
        Random rand = new Random();
        int num = rand.nextInt(10);
        if(num == 0)
        {
            return "Bagpipes";
        } else if(num == 1)
        {
            return "Drum";
        } else if(num == 2)
        {
            return "Dulcimer";
        } else if(num == 3)
        {
            return "Flute";
        } else if(num == 4)
        {
            return "Lute";
        } else if(num == 5)
        {
            return "Lyre";
        } else if(num == 6)
        {
            return "Horn";
        } else if(num == 7)
        {
            return "Pan Flute";
        } else if(num == 8)
        {
            return "Shawm";
        } else
        {
            return "Viol";
        }
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

    public ArrayList<String> getProficiencies()
    {
        return proficiencies;
    }

    public String getClasss()
    {
        return "Bard";
    }

    public HashMap<String, String> getFeatures()
    {
        return features;
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
        } else if(num == 6)
        {
            return "Insight";
        } else if(num == 7)
        {
            return "Intimidation";
        } else if(num == 8)
        {
            return "Investigation";
        } else if(num == 9)
        {
            return "Medicine";
        } else if(num == 10)
        {
            return "Nature";
        } else if(num == 11)
        {
            return "Perception";
        } else if(num == 12)
        {
            return "Performance";
        } else if(num == 13)
        {
            return "Persuasion";
        } else if(num == 14)
        {
            return "Religion";
        } else if(num == 15)
        {
            return "Sleight of Hand";
        } else if(num == 16)
        {
            return "Stealth";
        } else
        {
            return "Survival";
        }
    }

    public void one(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  2 cantrips and 4 spells known.  2 1st Level spell slots.");
        }
        if(!features.containsKey("Bardic Inspiration"))
        {
            features.put("Bardic Inspiration", "Every long rest, charisma modifier times, as a bonus action you can give 1 creatures within 60ft a 1d6 inspiration die.");
        }

    }

    public void two(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  2 cantrips and 5 spells known.  3 1st Level spell slots.");
        }
        features.put("Jack of All Trades", "Can add half of your proficiency bonus rounded down to any ability check that doesn't have proficiency.");
        if(!features.containsKey("Song of Rest"))
        {
            features.put("Song of Rest", "You can use soothing music to heal your allies, if any of them regain hit points after a short rest they gain an extra 1d6 hit points.");
        }
        levelFeatures(features, 1);
    }

    public void three(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  2 cantrips and 6 spells known.  4 1st Level and 2 2nd Level spell slots.");
        }
        if(!features.containsKey("Bard College"))
        {
            features.put("Bard College", "");
            int num = rand.nextInt(1);
            if(num == 0)
            {
                int count = 0;
                while(count < 3)
                {
                    String prof = randomProficiency();
                    while(proficiencies.contains(prof))
                    {
                        prof = randomProficiency();
                    }
                    proficiencies.add(prof);
                    count++;
                }

                features.put("Cutting Words", "You may use and roll a bardic inspiration die to subtract from a creature's ability, damage, or attack roll within 60ft.");
            } else if(num == 1)
            {
                proficiencies.add("Martial Weapons");
                proficiencies.add("Medium Armor");
                proficiencies.add("Shields");
                features.put("Combat Inspiration", "If a creature has one of your bardic inspiration dices, it can roll it to add to damage or their AC if being attacked.");
            }
        }
        if(!features.containsKey("Expertise"))
        {
            int count = 0;
            String expertise = "";
            while(count < 2)
            {
                String prof = randomProficiency();
                while(!proficiencies.contains(prof))
                {
                    prof = randomProficiency();
                }
                expertise += prof + " ";
                count++;
            }
            features.put("Expertise", expertise);
        }
        levelFeatures(features, 2);
    }

    public void four(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 7 spells known.  4 1st Level and 3 2nd Level spell slots.");
        }
        levelFeatures(features, 3);
    }

    public void five(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 8 spells known.  4 1st Level, 3 2nd Level, and 2 3rd Level spell slots.");
        }
        if(!features.containsKey("Bardic Inspiration"))
        {
            features.put("Bardic Inspiration", "Every long or short rest, charisma modifier times, as a bonus action you can give 1 creatures within 60ft a 1d8 inspiration die.");
        }
        levelFeatures(features, 4);
    }

    public void six(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 9 spells known.  4 1st Level, 3 2nd Level, and 3 3rd Level spell slots.");
        }
        features.put("Countercharm", "As an action you can start a performance that ends on your next turn, during this time all friendly creatures within 30ft have advantage on saving throws against being frightened or charmed.");
        if(!features.containsKey("Bard College"))
        {
            features.put("Bard College", "");
            int num = rand.nextInt(1);
            if(num == 0)
            {
                int count = 0;
                while(count < 3)
                {
                    String prof = randomProficiency();
                    while(proficiencies.contains(prof))
                    {
                        prof = randomProficiency();
                    }
                    proficiencies.add(prof);
                    count++;
                }
                features.put("Cutting Words", "You may use and roll a bardic inspiration die to subtract from a creature's ability, damage, or attack roll within 60ft.");
                features.put("Additional Magical Secrets", "You learn two extra spells of a level you can cast from any class.");
            } else if(num == 1)
            {
                proficiencies.add("Martial Weapons");
                proficiencies.add("Medium Armor");
                proficiencies.add("Shields");
                features.put("Combat Inspiration", "If a creature has one of your bardic inspiration dices, it can roll it to add to damage or their AC if being attacked.");
                features.put("Extra Attack", "When you take the attack action, you can make two attacks.");
            }
        }
        levelFeatures(features, 5);
    }
    
    public void seven(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 10 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, and 1 4th Level spell slots.");
        }
        levelFeatures(features, 6);
    }

    public void eight(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 11 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, and 2 4th Level spell slots.");
        }
        levelFeatures(features, 7);
    }

    public void nine(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  3 cantrips and 12 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, and 1 5th Level spell slots.");
        }
        if(!features.containsKey("Song of Rest"))
        {
            features.put("Song of Rest", "You can use soothing music to heal your allies, if any of them regain hit points after a short rest they gain an extra 1d8 hit points.");
        }
        levelFeatures(features, 8);
    }

    public void ten(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 14 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, and 2 5th Level spell slots.");
        }
        if(!features.containsKey("Bardic Inspiration"))
        {
            features.put("Bardic Inspiration", "Every long or short rest, charisma modifier times, as a bonus action you can give 1 creatures within 60ft a 1d10 inspiration die.");
        }
        if(!features.containsKey("Expertise"))
        {
            int count = 0;
            String expertise = "";
            while(count < 3)
            {
                String prof = randomProficiency();
                while(!proficiencies.contains(prof))
                {
                    prof = randomProficiency();
                }
                expertise += prof + " ";
                count++;
            }
            features.put("Expertise", expertise);
        }
        if(!features.containsKey("Magical Secrets"))
        {
            features.put("Magical Secrets", "2 spells from any class, counts towards your spells known.");
        }
        levelFeatures(features, 9);
    }

    public void eleven(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 15 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, and 1 6th Level spell slots.");
        }
        levelFeatures(features, 10);
    }
    
    public void twelve(HashMap<String, String> features)
    {
        levelFeatures(features, 11);
    }

    public void thirteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 16 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, and 1 7th Level spell slots.");
        }
        if(!features.containsKey("Song of Rest"))
        {
            features.put("Song of Rest", "You can use soothing music to heal your allies, if any of them regain hit points after a short rest they gain an extra 1d10 hit points.");
        }
        levelFeatures(features, 12);
    }

    public void fourteen(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Magical Secrets"))
        {
            features.put("Magical Secrets", "4 spells from any class, counts towards your spells known.");
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 18 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, and 1 7th Level spell slots.");
        }
        if(!features.containsKey("Bard College"))
        {
            features.put("Bard College", "");
            int num = rand.nextInt(1);
            if(num == 0)
            {
                int count = 0;
                while(count < 3)
                {
                    String prof = randomProficiency();
                    while(proficiencies.contains(prof))
                    {
                        prof = randomProficiency();
                    }
                    proficiencies.add(prof);
                    count++;
                }
                features.put("Cutting Words", "You may use and roll a bardic inspiration die to subtract from a creature's ability, damage, or attack roll within 60ft.");
                features.put("Additional Magical Secrets", "You learn two extra spells of a level you can cast from any class.");
                features.put("Peerless Skill", "Can expend a use of a Bardic Inspiration to roll it and add it to an ability check.");
            } else if(num == 1)
            {
                proficiencies.add("Martial Weapons");
                proficiencies.add("Medium Armor");
                proficiencies.add("Shields");
                features.put("Combat Inspiration", "If a creature has one of your bardic inspiration dices, it can roll it to add to damage or their AC if being attacked.");
                features.put("Extra Attack", "When you take the attack action, you can make two attacks.");
                features.put("Battle Magic", "If you use your action to cast a bard spell, you can make one weapon attack as a bomus action.");
            }
        }
        levelFeatures(features, 13);
    }

    public void fifteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Bardic Inspiration"))
        {
            features.put("Bardic Inspiration", "Every long or short rest, charisma modifier times, as a bonus action you can give 1 creatures within 60ft a 1d12 inspiration die.");
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 19 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, 1 7th Level, and 1 8th Level spell slots.");
        }
        levelFeatures(features, 14);
    }

    public void sixteen(HashMap<String, String> features)
    {
        levelFeatures(features, 15);
    }

    public void seventeen(HashMap<String, String> features)
    {
        if(!features.containsKey("Song of Rest"))
        {
            features.put("Song of Rest", "You can use soothing music to heal your allies, if any of them regain hit points after a short rest they gain an extra 1d12 hit points.");
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 20 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, 1 7th Level, 1 8th Level, 1 9th Level spell slots.");
        }
        levelFeatures(features, 16);
    }

    public void eighteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Magical Secrets"))
        {
            features.put("Magical Secrets", "6 spells from any class, counts towards your spells known.");
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 22 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 3 5th Level, 1 6th Level, 1 7th Level, 1 8th Level, 1 9th Level spell slots.");
        }
        levelFeatures(features, 17);
    }

    public void nineteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 22 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 3 5th Level, 2 6th Level, 1 7th Level, 1 8th Level, 1 9th Level spell slots.");
        }
        levelFeatures(features, 18);
    }

    public void twenty(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Charisma (Spell save DC: 8 + proficiency bonus + Charisma modifier)(Spell Attack Modifier: Proficiency bonus + Charisma modifier).  4 cantrips and 22 spells known.  4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 3 5th Level, 2 6th Level, 2 7th Level, 1 8th Level, 1 9th Level spell slots.");
        }
        features.put("Superior Inspiration", "Every time you roll initiative and have no Bardic Inspiration left you gain one use.");
        levelFeatures(features, 19);
    }

}