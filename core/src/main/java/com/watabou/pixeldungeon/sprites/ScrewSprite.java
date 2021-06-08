package com.watabou.pixeldungeon.sprites;

import com.watabou.noosa.TextureFilm;
import com.watabou.noosa.particles.PixelParticle;
import com.watabou.pixeldungeon.Assets;

public class ScrewSprite extends MobSprite{

        private PixelParticle coin;

        public ScrewSprite() {
            super();

            texture(Assets.SCREW);
            TextureFilm film = new TextureFilm(texture,14,14);

            idle = new Animation(10,true);
            idle.frames(film,0);

            die = new Animation(20,false);
            die.frames(film,0);

            run = idle.clone();
            attack = idle.clone();

            idle();
        }

        @Override
        public void onComplete( Animation anim ) {
            super.onComplete( anim );
        }
}
