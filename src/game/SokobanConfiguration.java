package game;

<<<<<<< HEAD
import gameframework.drawing.GameCanvas;
import gameframework.drawing.GameCanvasDefaultImpl;
import gameframework.game.GameConfiguration;
=======
import gameframework.game.GameConfiguration;
import gameframework.motion.overlapping.OverlapRulesApplier;
import overlap.SokobanOverlapRulesApplier;
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb

public class SokobanConfiguration extends GameConfiguration {
		public SokobanConfiguration(){
			super(20,20,16,1);
		}
		
		@Override
<<<<<<< HEAD
		public GameCanvas createCanvas(){
			return new GameCanvasDefaultImpl();
=======
		public OverlapRulesApplier createOverlapRulesApplier(){
			return new SokobanOverlapRulesApplier();
>>>>>>> f63abaec637205b3f2967c14ddf9be4e4b9bd6cb
		}
		
}
