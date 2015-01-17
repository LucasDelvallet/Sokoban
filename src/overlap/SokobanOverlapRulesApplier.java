package overlap;

import entities.Crate;
import entities.Player;
import gameframework.motion.SpeedVector;
import gameframework.motion.overlapping.OverlapRulesApplierDefaultImpl;

import java.awt.Point;

public class SokobanOverlapRulesApplier extends OverlapRulesApplierDefaultImpl{
	
	public void overlapRule(Crate e1, Player e2){
		Point position = (Point) e1.getPosition().clone();	
		
		//Je fais bouger la caisse a la m�me vitesse que le joueur
		SpeedVector playerSpeed = e2.getSpeedVector() ;
		e1.setSpeedVector(playerSpeed);
		e1.oneStepMove();
		
		//Si la caisse n'a pas boug�, c'est qu'elle est contre un mur
		//Alors je fait reculer le joueur d'un cran en arri�re pour simuler un non mouvement
		if(position.equals(e1.getPosition())){
			e2.setPosition(new Point(e2.getPosition().x + playerSpeed.getSpeed()*playerSpeed.getDirection().x*-1,
					e2.getPosition().y + playerSpeed.getSpeed()*playerSpeed.getDirection().y*-1));
		}
		
		//Je reset la vitesse de la caisse pour �viter qu'elle glisse jusqu'a l'infini... et l'au del� !
		e1.setSpeedVector(new SpeedVector(new Point(0,0),0));
	}
	
	public void overlapRule(Crate e1, Crate e2){
		/* Lorsque deux caisse s'overlappent. Il faut soit :
		 * Qu'elle pousse l'autre
		 * Ou qu'elles s'arretent 
		 * 
		 * Y'a plus qu'a cod� :)
		 * 
		 * Faites attention, la vitesse de la caisse en mouvement a �t� r�initialis�
		 * a cause de la m�thode ci dessus.*/
	}
}
