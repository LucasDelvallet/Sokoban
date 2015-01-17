package entities;

import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameData;
import gameframework.game.GameEntity;
import gameframework.motion.GameMovable;
import gameframework.motion.GameMovableDriverDefaultImpl;
<<<<<<< HEAD
import gameframework.motion.MoveStrategyDefaultImpl;
import gameframework.motion.MoveStrategyKeyboard;
import gameframework.motion.blocking.MoveBlocker;
=======
import gameframework.motion.overlapping.Overlappable;
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb

import java.awt.Graphics;
import java.awt.Rectangle;

<<<<<<< HEAD
public class Crate extends GameMovable implements Drawable, GameEntity, MoveBlocker{

	protected DrawableImage image;
	protected GameCanvas canvas;
	int x;
	int y;
=======
import motion.CrateGameMovableDriver;
import motion.MoveStrategyCrate;

public class Crate extends GameMovable implements Drawable, GameEntity, Overlappable{

	protected DrawableImage image;
	protected GameCanvas canvas;
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
	
	public Crate(GameData data, int x, int y) {
		super();
		
<<<<<<< HEAD
		MoveStrategyDefaultImpl keyboard = new MoveStrategyDefaultImpl();
		GameMovableDriverDefaultImpl moveDriver = new GameMovableDriverDefaultImpl();
		moveDriver.setStrategy(keyboard);
		moveDriver.setmoveBlockerChecker(data.getMoveBlockerChecker());
		setDriver(moveDriver);

		this.x = x;
		this.y = y;
=======
		MoveStrategyCrate moveStrategy = new MoveStrategyCrate();
		GameMovableDriverDefaultImpl moveDriver = new CrateGameMovableDriver();
		moveDriver.setStrategy(moveStrategy);
		moveDriver.setmoveBlockerChecker(data.getMoveBlockerChecker());
		setDriver(moveDriver);

		position.x = x;
		position.y = y;
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
		this.canvas = data.getCanvas();
		image = new DrawableImage("/images/crate.gif", canvas);

	}

	@Override
	public void draw(Graphics g) {
<<<<<<< HEAD
		canvas.drawImage(g, image.getImage(), x, y);
		// image.draw(g);

=======
		canvas.drawImage(g, image.getImage(), position.x, position.y);
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
	}

	@Override
	public Rectangle getBoundingBox() {
		Rectangle rectangle = new Rectangle(image.getWidth(), image.getHeight());
<<<<<<< HEAD
		rectangle.setLocation(x, y);
=======
		rectangle.setLocation(position.x, position.y);
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
		return rectangle;
	}

	@Override
	public void oneStepMoveAddedBehavior() {
<<<<<<< HEAD
		/*
		 * Point a = position ; a = position ; a.getX() ; position = position ;
		 * speedVector = speedVector ;
		 */
=======

>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
	}

}
