package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyDemoyt;

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }

    }

    @Override
    public void update(float dt) {
        handleInput();


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0 , 0, FlappyDemoyt.WIDTH, FlappyDemoyt.HEIGHT);
        sb.draw(playBtn, (FlappyDemoyt.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyDemoyt.HEIGHT / 2);
        sb.end();


    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
