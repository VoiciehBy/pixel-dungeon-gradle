package com.watabou.pixeldungeon.actors.hero;

import com.watabou.utils.Bundle;

public class HeroName {//VRB
    private static final String NAME = "name";
    public String title = "Max";
    public HeroGender gender = HeroGender.NONE;

    public HeroName() {
    }

    public HeroName(String title) {
        this.title = title;
    }

    public HeroName(String title, HeroGender gender) {
        this.title = title;
        this.gender = gender;
    }

    public static HeroName restoreInBundle(Bundle bundle) {
        String value = bundle.getString(NAME);
        if (value.length() > 0)
            return valueOf(value);
        else
            new HeroName("Unnamed");

        return value.length() > 0 ? valueOf(value) : new HeroName("Unnamed");
    }

    private static HeroName valueOf(String value) {
        return new HeroName();
    }

    public void storeInBundle(Bundle bundle) {
        bundle.put(NAME, toString());
    }

    public String title() {
        return title;
    }

    public HeroGender getGender() {
        return gender;
    }

}
