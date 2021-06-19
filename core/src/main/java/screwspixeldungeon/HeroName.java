package screwspixeldungeon;

public class HeroName {
    private static final String NAME = "name";
    private String title = "Max";
    private HeroGender gender = HeroGender.NONE;

    public HeroName() {}
    public HeroName(String title){this.title = title;}
    public HeroName(String title, HeroGender gender) {
        this.title = title;
        this.gender = gender;
    }

    public String title(){return title;}
    public HeroGender gender(){return gender;}
}
