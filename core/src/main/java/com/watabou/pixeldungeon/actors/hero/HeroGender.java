package com.watabou.pixeldungeon.actors.hero;

import com.watabou.utils.Bundle;

public enum HeroGender {
    MALE("male"), FEMALE("female"), NONE("genderless");

    private static final String GENDER = "gender";
    public String title;

    private HeroGender(String title) {
        this.title = title;
    }

    public static HeroGender restoreInBundle(Bundle bundle) {
        String value = bundle.getString(GENDER);
        return value.length() > 0 ? valueOf(value) : NONE;
    }

    public String title() {
        return title;
    }

    public void setGenderBonus(Hero hero)//VRB
    {
        switch (hero.heroGender) {
            case MALE:
                hero.STR += 5;
                break;
            case FEMALE:
                hero.HT += 5;
                hero.HP += 5;
                break;
            default:
                break;
        }
    }

    public void storeInBundle(Bundle bundle) {
        bundle.put(GENDER, toString());
    }
};
