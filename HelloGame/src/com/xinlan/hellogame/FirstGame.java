package com.xinlan.hellogame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class FirstGame implements ApplicationListener {
	// 绘图用的SpriteBatch
	private SpriteBatch batch;
	private Texture texture;
	private TextureRegion region;
	private float x, y;
	private Sprite spirte;
	private float angle;
	@Override
	public void create() {
		batch = new SpriteBatch(); // 实例化
		texture = new Texture(Gdx.files.internal("girl.png"));
		region = new TextureRegion(texture, 0, 0, 100, 100);
		spirte = new Sprite(texture,100,100,50,50);
		spirte.setPosition(300, 200);
	}

	@Override
	public void dispose() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // 清屏
		batch.begin();
		batch.draw(region, 0, 0);
		batch.draw(texture, 200, 200);
		spirte.draw(batch);
		batch.end();
		spirte.rotate(1);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void resume() {

	}
}// end class
