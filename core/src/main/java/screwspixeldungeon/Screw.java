package screwspixeldungeon;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.mobs.npcs.NPC;

public class Screw extends NPC {
    {
        name = "Screw";
        spriteClass = ScrewSprite.class;
    }

    @Override
    public void interact() {
        sprite.turnTo(pos, Dungeon.hero.pos);
    }

    @Override
    public String description() {
        return super.description();
    }
}