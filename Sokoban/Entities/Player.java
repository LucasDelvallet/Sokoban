package Entities;

import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameEntity;
import gameframework.motion.Movable;
import gameframework.motion.SpeedVector;
import gameframework.motion.overlapping.Overlappable;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Player implements Drawable, GameEntity, Movable, Overlappable {

	protected DrawableImage image;
	
	public Player(GameCanvas canvas) {
		image = new DrawableImage("/images/Locke.gif", canvas) ;
		setSpeedVector(new SpeedVector(new Point()));
	}

	@Override
	public Rectangle getBoundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpeedVector getSpeedVector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSpeedVector(SpeedVector m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oneStepMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		image.draw(g);
		
	}
	
}
