package com.xinlan.hellogame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstGame implements ApplicationListener {
	// 绘图用的SpriteBatch
	private SpriteBatch batch;
	private Texture texture;
	private float x,y;
	@Override
	public void create() {
		batch = new SpriteBatch(); // 实例化
		texture = new Texture(Gdx.files.internal("icon.png"));
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
		batch.draw(texture,x,y);
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
