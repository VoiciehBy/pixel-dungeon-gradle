package com.watabou.pixeldungeon.actors.hero;

import com.watabou.utils.Bundle;

public enum HeroGender {
    MALE("male"),FEMALE("female");

    public String gender;

    private HeroGender(String gender) {
        this.gender = gender;
    }

    public String gender() {
        return gender;
    }

    private static final String GENDER	= "gender";

    public void storeInBundle( Bundle bundle ) {
        bundle.put( GENDER, toString() );
    }

    public static HeroGender restoreInBundle( Bundle bundle ) {
        String value = bundle.getString( GENDER );
        return value.length() > 0 ? valueOf( value ) : MALE;
    }
};
