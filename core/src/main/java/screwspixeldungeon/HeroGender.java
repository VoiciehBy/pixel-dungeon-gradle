package screwspixeldungeon;

import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.utils.Bundle;

public enum HeroGender {
    MALE("male"),FEMALE("female"),NONE("genderless");
    private static final String GENDER = "gender";
    private final String title;

    private HeroGender(String title) {this.title = title;}

    public static HeroGender restoreInBundle(Bundle bundle){
        String value = bundle.getString(GENDER);
        return value.length() > 0 ? valueOf(value) : NONE;
    }

    public String title() { return title; }

    public void setGenderBonus(Hero hero){
        switch (hero.heroGender){
            case MALE:
                hero.STR += 5;
                break;
            case FEMALE:
                hero.HT += 5;
                hero.HP += 5;
                break;
        }
    }
    public void storeInBundle(Bundle bundle){bundle.put(GENDER,toString());}
}
