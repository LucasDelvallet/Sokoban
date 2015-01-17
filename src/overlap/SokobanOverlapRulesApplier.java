package overlap;

import entities.Crate;
import entities.Player;
import gameframework.motion.SpeedVector;
import gameframework.motion.overlapping.OverlapRulesApplierDefaultImpl;

import java.awt.Point;

public class SokobanOverlapRulesApplier extends OverlapRulesApplierDefaultImpl {

	public void overlapRule(Crate crate, Player player) {
		Point position = (Point) crate.getPosition().clone();

		// Je fais bouger la caisse à la même vitesse que le joueur
		SpeedVector playerSpeed = player.getSpeedVector();
		crate.setSpeedVector(playerSpeed);
		crate.oneStepMove();

		// Si la caisse n'a pas bougé, c'est qu'elle est contre un mur, alors je
		// fait reculer le joueur d'un cran en arrière pour simuler un non
		// mouvement
		if (position.equals(crate.getPosition())) {
			player.setPosition(new Point(player.getPosition().x
					+ playerSpeed.getSpeed() * playerSpeed.getDirection().x
					* -1, player.getPosition().y + playerSpeed.getSpeed()
					* playerSpeed.getDirection().y * -1));
		}

		// Je reset la vitesse de la caisse pour éviter qu'elle glisse jusqu'à
		// l'infini... et l'au delà !
		crate.setSpeedVector(new SpeedVector(new Point(0, 0), 0));
	}

	public void overlapRule(Crate e1, Crate e2) {
		/* Quand 2 crate se rencontrent on stoppe le mouvement : à coder */
	}
}
