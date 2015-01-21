package main;

import game.SokobanConfiguration;
import game.SokobanGame;
import gameframework.base.ObservableValue;
import gameframework.game.Game;
import gameframework.game.GameConfiguration;
import gameframework.game.GameData;
import gameframework.gui.GameWindow;
import levels.EndLevel;
import levels.Level1;
import levels.Level2;
import levels.Level3;
import levels.Level4;
import levels.Level5;

public class Main {

	public static void main(String[] args) {
		GameConfiguration gameConfiguration = new SokobanConfiguration();
		GameData gamedata = new GameData(gameConfiguration);
		Game game = new SokobanGame(gamedata);

		ObservableValue<Integer> score = new ObservableValue<Integer>(5);
		ObservableValue<Integer> life = new ObservableValue<Integer>(5);
		GameWindow gameWindow = new GameWindow("SokoBlob (by DREAMTEAM)",
				gamedata.getCanvas(), gameConfiguration, score, life);
		gamedata.addLevel(new Level1(gamedata));
		gamedata.addLevel(new Level2(gamedata));
		gamedata.addLevel(new Level3(gamedata));
		gamedata.addLevel(new Level4(gamedata));
		gamedata.addLevel(new Level5(gamedata));
		gamedata.addLevel(new EndLevel(gamedata));

		gameWindow.createGUI();
		game.start();

	}
}
