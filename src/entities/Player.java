package entities;

import gameframework.drawing.Drawable;
import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameData;
import gameframework.game.GameEntity;
import gameframework.motion.GameMovable;
import gameframework.motion.GameMovableDriverDefaultImpl;
import gameframework.motion.MoveStrategyKeyboard;
<<<<<<< HEAD
=======
import gameframework.motion.overlapping.Overlappable;
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb

import java.awt.Graphics;
import java.awt.Rectangle;

<<<<<<< HEAD
public class Player extends GameMovable implements Drawable, GameEntity {
=======
public class Player extends GameMovable implements Drawable, GameEntity, Overlappable {
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb

	protected DrawableImage image;
	protected GameCanvas canvas;

	public Player(GameData data, int x, int y) {
		super();
		MoveStrategyKeyboard keyboard = new MoveStrategyKeyboard();
		GameMovableDriverDefaultImpl moveDriver = new GameMovableDriverDefaultImpl();
		moveDriver.setStrategy(keyboard);
		moveDriver.setmoveBlockerChecker(data.getMoveBlockerChecker());
		setDriver(moveDriver);

		position.x = x;
		position.y = y;
		this.canvas = data.getCanvas();
		image = new DrawableImage("/images/man1.gif", canvas);
		this.canvas.addKeyListener(keyboard);

	}

	@Override
	public void draw(Graphics g) {
		canvas.drawImage(g, image.getImage(), position.x, position.y);
	}

	@Override
	public Rectangle getBoundingBox() {
		Rectangle rectangle = new Rectangle(image.getWidth() - 5, image.getHeight() - 5);
		rectangle.setLocation(position.x, position.y);
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
