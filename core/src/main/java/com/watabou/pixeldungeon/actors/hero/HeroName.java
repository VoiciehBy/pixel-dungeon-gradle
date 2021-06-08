package com.watabou.pixeldungeon.actors.hero;

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

    public String title() {
        return title;
    }

    public HeroGender getGender() {
        return gender;
    }

}
