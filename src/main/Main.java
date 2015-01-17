package main;


<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
import game.SokobanConfiguration;
import game.SokobanGame;
import gameframework.base.ObservableValue;
import gameframework.game.Game;
import gameframework.game.GameConfiguration;
import gameframework.game.GameData;
<<<<<<< HEAD
import gameframework.gui.GameStatusBarElement;
=======
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
import gameframework.gui.GameWindow;
import levels.Level1;

public class Main {

	public static void main(String[] args) {
		GameConfiguration gameConfiguration = new SokobanConfiguration();
		GameData gamedata = new GameData(gameConfiguration);
		Game game = new SokobanGame(gamedata);
		
<<<<<<< HEAD
		ArrayList<GameStatusBarElement> elements = new ArrayList<GameStatusBarElement>();
		elements.add(new GameStatusBarElement("Score:", new ObservableValue<Integer>(5)));
		elements.add(new GameStatusBarElement("Life:", new ObservableValue<Integer>(5)));
		GameWindow gameWindow = new GameWindow(gamedata.getCanvas(), gameConfiguration, elements);
=======
		ObservableValue<Integer> score = new ObservableValue<Integer>(5) ;
		ObservableValue<Integer> life = new ObservableValue<Integer>(5) ;
		GameWindow gameWindow = new GameWindow(gamedata.getCanvas(), gameConfiguration, score, life);
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
		gamedata.addLevel(new Level1(gamedata));
		
		gameWindow.createGUI();		
		game.start();
		
	}
}
