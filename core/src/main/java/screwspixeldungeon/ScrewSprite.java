package screwspixeldungeon;

import com.watabou.noosa.MovieClip;
import com.watabou.noosa.TextureFilm;
import com.watabou.pixeldungeon.Assets;
import com.watabou.pixeldungeon.sprites.MobSprite;

public class ScrewSprite extends MobSprite {

    public ScrewSprite(){
        super();

        texture(Assets.SCREW);
        TextureFilm textureFilm = new TextureFilm(texture,14,16);

        idle = new MovieClip.Animation(10,true);
        idle.frames(textureFilm,0);

        die = new MovieClip.Animation(20,false);
        die.frames(textureFilm,0);

        run = idle.clone();
        attack = idle.clone();

        idle();
    }
@Override
    public void onComplete(Animation animation){super.onComplete(animation);}
}
