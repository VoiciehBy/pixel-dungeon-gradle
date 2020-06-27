package com.watabou.pixeldungeon.actors.hero;

import com.watabou.utils.Bundle;

import java.util.Random;

public enum HeroGender {
    MALE("male"),FEMALE("female"),NONE("genderless");

    public String title;

    private HeroGender(String title) {
        this.title = title;
    }

    public String title() {
        return title;
    }

    private static final String GENDER	= "gender";

    public int randomValue()
    {
        Random r = new Random();
        int v = r.nextInt(2);
        return  v;
    }

    public void setGenderBonus(Hero hero)
    {
        if (hero.heroGender == HeroGender.MALE)//VRB
            hero.STR = hero.STARTING_STR + 1;
        else if(hero.heroGender == HeroGender.FEMALE){
            hero.lvl += 1;
            hero.HT += 5;
            hero.HP += 5;
            hero.attackSkill += 1;
            hero.defenseSkill += 1;
            hero.STR = hero.STARTING_STR;
        }//VRB

        else
            hero.STR = hero.STARTING_STR;
    }

    public void storeInBundle( Bundle bundle ) {
        bundle.put( GENDER, toString() );
    }

    public static HeroGender restoreInBundle( Bundle bundle ) {
        String value = bundle.getString( GENDER );
        return value.length() > 0 ? valueOf( value ) : NONE;
    }
};
