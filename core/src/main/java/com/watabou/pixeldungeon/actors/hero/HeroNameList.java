package com.watabou.pixeldungeon.actors.hero;

import com.watabou.utils.Random;

import java.util.ArrayList;

public class HeroNameList {
    private final ArrayList<HeroName> names;

    public HeroNameList() {
        names = new ArrayList<HeroName>();
        names.add(new HeroName("Adam",HeroGender.MALE));
        names.add(new HeroName("Hans",HeroGender.MALE));
        names.add(new HeroName("Achilles",HeroGender.MALE));
        names.add(new HeroName("Eve",HeroGender.FEMALE));
        names.add(new HeroName("Zoe",HeroGender.FEMALE));
        names.add(new HeroName("Thalia",HeroGender.FEMALE));
        names.add(new HeroName("Andre"));
        names.add(new HeroName());
    }

    public HeroName getRandomName(){
        int i = Random.Int(names.size());
        return names.get(i);
    }
}
