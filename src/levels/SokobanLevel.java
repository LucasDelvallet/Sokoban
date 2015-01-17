<<<<<<< HEAD
package levels;

import gameframework.drawing.GameUniverseViewPortDefaultImpl;
import gameframework.game.GameData;
import gameframework.game.GameLevelDefaultImpl;

//Sert de mod�le de base
public class SokobanLevel extends GameLevelDefaultImpl {

	public SokobanLevel(GameData data) {
		super(data);
		gameBoard = new GameUniverseViewPortDefaultImpl(data);
	}

	@Override
	protected void init() {
		universe = this.data.getUniverse();
		gameBoard = new GameUniverseViewPortDefaultImpl(this.data);
	}

}
=======
package levels;

import gameframework.drawing.GameUniverseViewPortDefaultImpl;
import gameframework.game.GameData;
import gameframework.game.GameLevelDefaultImpl;

//Sert de mod�le de base
public class SokobanLevel extends GameLevelDefaultImpl {

	public SokobanLevel(GameData data) {
		super(data);
		gameBoard = new GameUniverseViewPortDefaultImpl(data);
	}

	@Override
	protected void init() {
		universe = this.data.getUniverse();
		gameBoard = new GameUniverseViewPortDefaultImpl(this.data);
	}

}
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
