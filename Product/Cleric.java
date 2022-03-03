import java.util.*;

public class Cleric implements Class
{
    public static final int hitDice = 8;
    private ArrayList<String> proficiencies = new ArrayList<String>();
    private HashMap<String, String> features = new HashMap<String, String>();

    public Cleric(int level)
    {
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Saving Throws: Wisdom, Charisma");
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
        int num = random.nextInt(5);
        if(num == 0)
        {
            return "History";
        } else if(num == 1)
        {
            return "Insight";
        } else if (num == 2)
        {
            return "Medicine";
        } else if(num == 3)
        {
            return "Persuasion";  
        } else 
        {
            return "Religion";
        }
    }

    public ArrayList<String> getProficiencies()
    {
        return proficiencies;
    }

    public String getClasss()
    {
        return "Cleric";
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

    public String randomLanguage()
    {
        Random rand  = new Random();
        int num = rand.nextInt(7);
        if(num == 0)
        {
            return "Draconic";
        } else if(num == 1)
        {
            return "Infernal";
        } else if(num == 2)
        {
            return "Elvish";
        } else if(num == 3)
        {
            return "Dwarvish";
        } else if(num == 4)
        {
            return "Orcish";
        } else if(num == 5)
        {
            return "Gnomish";
        } else
        {
            return "Halfling";
        }
    }

    public String randomP()
    {
        Random rand  = new Random();
        int num = rand.nextInt(4);
        if(num == 0)
        {
            return "Arcana";
        } else if(num == 1)
        {
            return "History";
        } else if (num == 2)
        {
            return "Religion";
        }else
        {
            return "Nature";
        }
    }

    public void one(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  3 cantrips and 2 1st Level spell slots.");
        }
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
            }
        }
    }

    public void two(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  3 cantrips and 3 1st Level spell slots.");
        }
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "Every long rest as an action, you can turn undead or create a perfect illusion of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "Every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
            }
        }
        levelFeatures(features, 1);
    }

    public void three(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  3 cantrips, 4 1st Level, and 2 2nd Level spell slots.");
        }
        levelFeatures(features, 2);
    }

    public void four(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, and 3 2nd Level spell slots.");
        }
        levelFeatures(features, 3);
    }

    public void five(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, 3 2nd Level, and 2 3rd Level spell slots.");
        }
        if(!features.containsKey("Destroy Undead"))
        {
            features.put("Destroy Undead", "When an undead fails its saving throw against Turn Undead it is instantly destroyed if it has a CR of 1/2 or lower.");
        }
        levelFeatures(features, 4);
    }

    public void six(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
                features.put("Read Thoughts", "As an action you can read the thoughts of a creatures within 60ft if they fail a wisdom saving throw for 1 minute.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
                features.put("Blessed Healer", "When you cast a healing spell of 1st Level or higher it restores 2 + spell level hit points to you as well.");
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
                features.put("Dampen Elements", "When you or a creature within 30ft takes acid, cold, fire, lightning, or thunder damage you can use your reaction to grant resistance to the creature for this instance.");
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
                features.put("Thunderbolt Strike", "When you deal thunder or lighting damage to a creature you can also push it up to 10ft away from you.");
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or create a perfect illusion of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
                features.put("Cloak of Shadows", "As an action you can turn invisible until your next turn.");
            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
                features.put("War God's Blessing", "When a creature within 30ft of you makes an attack roll you can use your reaction to give the creature +10 to the roll.");
            }
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, 3 2nd Level, and 3 3rd Level spell slots.");
        }
        levelFeatures(features, 5);
    }

    public void seven(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, and 1 4th Level spell slots.");
        }
        levelFeatures(features, 6);
    }

    public void eight(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Destroy Undead"))
        {
            features.put("Destroy Undead", "When an undead fails its saving throw against Turn Undead it is instantly destroyed if it has a CR of 1 or lower.");
        }
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
                features.put("Read Thoughts", "As an action you can read the thoughts of a creatures within 60ft if they fail a wisdom saving throw for 1 minute.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
                features.put("Blessed Healer", "When you cast a healing spell of 1st Level or higher it restores 2 + spell level hit points to you as well.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 radiant damage.");
                }
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
                features.put("Dampen Elements", "When you or a creature within 30ft takes acid, cold, fire, lightning, or thunder damage you can use your reaction to grant resistance to the creature for this instance.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 cold, fire, or lightning damage.");
                }
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
                features.put("Thunderbolt Strike", "When you deal thunder or lighting damage to a creature you can also push it up to 10ft away from you.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 thunder damage.");
                }
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or create a perfect illusion of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
                features.put("Cloak of Shadows", "As an action you can turn invisible until your next turn.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 poison damage.");
                }
            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
                features.put("War God's Blessing", "When a creature within 30ft of you makes an attack roll you can use your reaction to give the creature +10 to the roll.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 damage.");
                }
            }
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, and 2 4th Level spell slots.");
        }
        levelFeatures(features, 7);
    }

    public void nine(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  4 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, and 1 5th Level spell slots.");
        }
        levelFeatures(features, 8);
    }

    public void ten(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, and 2 5th Level spell slots.");
        }
        if(features.containsKey("Divine Intervention"))
        {
            features.put("Divine Intervention", "As an action you can implore your deity's aid.  Describe the assistance you seek, then roll a percentile die.  If the number is equal to or less than your cleric level the deity intervenes.  Can use after every long rest, but if the deity intervenes cannot use again for 7 days.");
        }
        levelFeatures(features, 9);
    }

    public void eleven(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, and 1 6th Level spell slots.");
        }
        if(!features.containsKey("Destroy Undead"))
        {
            features.put("Destroy Undead", "When an undead fails its saving throw against Turn Undead it is instantly destroyed if it has a CR of 2 or lower.");
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
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, and 1 7th Level spell slots.");
        }
        levelFeatures(features, 12);
    }

    public void fourteen(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Destroy Undead"))
        {
            features.put("Destroy Undead", "When an undead fails its saving throw against Turn Undead it is instantly destroyed if it has a CR of 3 or lower.");
        }
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
                features.put("Read Thoughts", "As an action you can read the thoughts of a creatures within 60ft if they fail a wisdom saving throw for 1 minute.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
                features.put("Blessed Healer", "When you cast a healing spell of 1st Level or higher it restores 2 + spell level hit points to you as well.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 2d8 radiant damage.");
                }
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
                features.put("Dampen Elements", "When you or a creature within 30ft takes acid, cold, fire, lightning, or thunder damage you can use your reaction to grant resistance to the creature for this instance.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 2d8 cold, fire, or lightning damage.");
                }
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
                features.put("Thunderbolt Strike", "When you deal thunder or lighting damage to a creature you can also push it up to 10ft away from you.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 2d8 thunder damage.");
                }
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or create a perfect illusion of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
                features.put("Cloak of Shadows", "As an action you can turn invisible until your next turn.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 2d8 poison damage.");
                }
            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
                features.put("War God's Blessing", "When a creature within 30ft of you makes an attack roll you can use your reaction to give the creature +10 to the roll.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 2d8 damage.");
                }
            }
        }
        levelFeatures(features, 13);
    }

    public void fifteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, 1 7th Level, and 1 8th Level spell slots.");
        }
        levelFeatures(features, 14);
    }

    public void sixteen(HashMap<String, String> features)
    {
        levelFeatures(features, 15);
    }

    public void seventeen(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 2 5th Level, 1 6th Level, 1 7th Level, 1 8th Level, and 1 9th Level spell slots.");
        }
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
                features.put("Read Thoughts", "As an action you can read the thoughts of a creatures within 60ft if they fail a wisdom saving throw for 1 minute.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
                features.put("Visions of the Past", "Every short or long rest, you can spend at least 1 minute in mediation and prayer to receive glimpses of recent events surrounding 1 object or yuor immediate surroundings.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
                features.put("Blessed Healer", "When you cast a healing spell of 1st Level or higher it restores 2 + spell level hit points to you as well.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 radiant damage.");
                }
                features.put("Supreme Healing", "Instead of rolling the dice for the number of hit points restored by a spell, you restore the macimum number for each die.");
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
                features.put("Corona of Light", "As an action, you can activate an aura of sunlight that emits 60ft of bright light and 30ft dim light. Enemies in the bright light have disadvantage on saving throws against spells that deal fire or radiant damage.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
                features.put("Dampen Elements", "When you or a creature within 30ft takes acid, cold, fire, lightning, or thunder damage you can use your reaction to grant resistance to the creature for this instance.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 cold, fire, or lightning damage.");
                }
                features.put("Master of Nature", "When creatures are charmed by your charm animals and plants feature, you can use your bonus action to verbally command them.");
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
                features.put("Thunderbolt Strike", "When you deal thunder or lighting damage to a creature you can also push it up to 10ft away from you.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 thunder damage.");
                }
                features.put("Stormborn", "You have a flying speed equal to your current walking speed when you are not indoors or underground.");
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or create up to 4 perfect illusions of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
                features.put("Cloak of Shadows", "As an action you can turn invisible until your next turn.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 poison damage.");
                }

            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "2 times every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
                features.put("War God's Blessing", "When a creature within 30ft of you makes an attack roll you can use your reaction to give the creature +10 to the roll.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 damage.");
                }
                features.put("Avatar of Battle", "You have reistance to bludgeoning, piercing, and slashing damage from non magical weapons");
            }
        }
        if(!features.containsKey("Destroy Undead"))
        {
            features.put("Destroy Undead", "When an undead fails its saving throw against Turn Undead it is instantly destroyed if it has a CR of 4 or lower.");
        }
        levelFeatures(features, 16);
    }

    public void eighteen(HashMap<String, String> features)
    {
        Random rand = new Random();
        if(!features.containsKey("Divine Domain"))
        {
            int num = rand.nextInt(7);
            if(num == 0)
            {
                features.put("Divine Domain", "Knowledge");
                String lang = randomLanguage();
                String lang2 = randomLanguage();
                while(lang.equals(lang2))
                {
                    lang2 = randomLanguage();
                }
                features.put("Languages", lang + " and " + lang2);
                String prof = randomP();
                proficiencies.add(prof);
                String prof2 = randomP();
                while(proficiencies.contains(prof2))
                {
                    prof2 = randomP();
                }
                proficiencies.add(prof2);
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or choose a tool or ability and have proficiency with it for 10 minutes.");
                features.put("Read Thoughts", "As an action you can read the thoughts of a creatures within 60ft if they fail a wisdom saving throw for 1 minute.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
                features.put("Visions of the Past", "Every short or long rest, you can spend at least 1 minute in mediation and prayer to receive glimpses of recent events surrounding 1 object or yuor immediate surroundings.");
            } else if(num == 1)
            {
                features.put("Divine Domain", "Life");
                proficiencies.add("Heavy Armor");
                features.put("Disciple of Life", "When you cast a healing spell of 1st or higher the creature regains extra hit points equal to 2 + spell's level.");
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or restore a number of hit points equal to 5 times your cleric level to any number of creatures within 30ft up to half of their hit point maximum.");
                features.put("Blessed Healer", "When you cast a healing spell of 1st Level or higher it restores 2 + spell level hit points to you as well.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 radiant damage.");
                }
                features.put("Supreme Healing", "Instead of rolling the dice for the number of hit points restored by a spell, you restore the macimum number for each die.");
            } else if(num == 2)
            {
                features.put("Divine Domain", "Light");
                features.put("Bonus Cantrip", "You know the Light cantrip.");
                features.put("Warding Flare", "Every long rest Wisdom modifier times, you can use your reaction to impose disadvantage on an attack roll of a creature within 30ft.");
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or dispell any magical darkness and deal 2d10 + cleric level damage on a successful Con save within 30ft.");
                features.put("Potent Spellcasting", "You can add your Wis modifier to any damage dealt by a Cleric cantrip.");
                features.put("Corona of Light", "As an action, you can activate an aura of sunlight that emits 60ft of bright light and 30ft dim light. Enemies in the bright light have disadvantage on saving throws against spells that deal fire or radiant damage.");
            } else if(num == 3)
            {
                features.put("Divine Domain", "Nature");
                proficiencies.add("Heavy Armor");
                features.put("Acolyte of Nature", "You know 1 druid cantrip");
                int numm = rand.nextInt(3);
                if(numm == 0)
                {
                    proficiencies.add("Animal Handling");
                } else if(numm == 1)
                {
                    proficiencies.add("Nature");
                } else if(numm == 2)
                {
                    proficiencies.add("Survival");
                }
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or charm any beast or plant creature within 30ft on a failed wisdom saving throw for 1 minute.");
                features.put("Dampen Elements", "When you or a creature within 30ft takes acid, cold, fire, lightning, or thunder damage you can use your reaction to grant resistance to the creature for this instance.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 cold, fire, or lightning damage.");
                }
                features.put("Master of Nature", "When creatures are charmed by your charm animals and plants feature, you can use your bonus action to verbally command them.");
            } else if(num == 4)
            {
                features.put("Divine Domain", "Tempest");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("Wrath of the Storm", "Every long rest Wisdom modifier times, you can use your reaction to make a creature within 5ft to make a Dex saving throw, on a failed save they take 2d8 lightning damage half as much on a success.");
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or when you roll thunder or lighting damage you can choose instead of rolling to deal max damage.");
                features.put("Thunderbolt Strike", "When you deal thunder or lighting damage to a creature you can also push it up to 10ft away from you.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 thunder damage.");
                }
                features.put("Stormborn", "You have a flying speed equal to your current walking speed when you are not indoors or underground.");
            } else if(num == 5)
            {
                features.put("Divine Domain", "Trickery");
                features.put("Blessing of the Trickster", "You can use your action to give a willing creature advantege on stealth checks for an hour.");
                if(!features.containsKey("Channel Divinity"))
                {
                    features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or create up to 4 perfect illusions of yourself within 30ft for 1 minute, as a bonus action you can move the illusion up to 30ft within 120ft of you.");
                }
                features.put("Cloak of Shadows", "As an action you can turn invisible until your next turn.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 poison damage.");
                }

            } else if(num == 6)
            {
                features.put("Divine Domain", "War");
                proficiencies.add("Heavy Armor");
                proficiencies.add("Martial Weapons");
                features.put("War Priest", "Every long rest Wisdom modifier times, if you take the attack action you can make a weapon attack as a bonus action.");
                features.put("Channel Divinity", "3 times every long rest as an action, you can turn undead or gain a +10 to an attack roll.");
                features.put("War God's Blessing", "When a creature within 30ft of you makes an attack roll you can use your reaction to give the creature +10 to the roll.");
                if(features.containsKey("Divine Strike"))
                {
                    features.put("Divine Strike", "Once on each turn, when you hit with a weapon attack you can deal an extra 1d8 damage.");
                }
                features.put("Avatar of Battle", "You have reistance to bludgeoning, piercing, and slashing damage from non magical weapons");
            }
        }
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 3 5th Level, 1 6th Level, 1 7th Level, 1 8th Level, and 1 9th Level spell slots.");
        }
        levelFeatures(features, 17);
    }

    public void nineteen(HashMap<String, String> features)
    {
        if(!features.containsKey("Spellcasting"))
        {
            features.put("Spellcasting", "Wisdom (Spell save DC: 8 + proficiency bonus + Wisdom modifier)(Spell Attack Modifier: Proficiency bonus + Wisdom modifier).  5 cantrips, 4 1st Level, 3 2nd Level, 3 3rd Level, 3 4th Level, 3 5th Level, 2 6th Level, 1 7th Level, 1 8th Level, and 1 9th Level spell slots.");
        }
        levelFeatures(features, 18);
    }

    public void twenty(HashMap<String, String> features)
    {
        if(!features.containsKey("Divine Intervention"))
        {
            features.put("Divine Intervention", "As an action you can implore your deity's aid.  Describe the assistance you seek, when the deity intervenes you cannot use again for 7 days.");
        }
        levelFeatures(features, 19);
    }
}
