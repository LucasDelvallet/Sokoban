package Entities;

import gameframework.drawing.DrawableImage;
import gameframework.drawing.GameCanvas;
import gameframework.game.GameData;
import gameframework.motion.GameMovableDriverDefaultImpl;
import gameframework.motion.overlapping.Overlappable;
import motion.CrateGameMovableDriver;
import motion.MoveStrategyCrate;

public class Crate extends SokobanMovable implements Overlappable {
	
	protected DrawableImage image;
	protected GameCanvas canvas;
	
	
	public Crate(GameData data, int x, int y) {
		super(data, x, y, "/images/crate.gif");
		
		MoveStrategyCrate moveStrategy = new MoveStrategyCrate();
		GameMovableDriverDefaultImpl moveDriver = new CrateGameMovableDriver();
		moveDriver.setStrategy(moveStrategy);
		moveDriver.setmoveBlockerChecker(data.getMoveBlockerChecker());
		setDriver(moveDriver);
	}

	@Override
	public void oneStepMoveAddedBehavior() {
		
	}

}
