package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Noivern extends Pokemon{

    Moves hurricane = new Moves("Hurricane", 110, "Special", "Flying",80, 20, new ImageIcon(getClass().getResource("/images/attribute/120px-FlyingIC_LA.png")));
    Moves uTurn = new Moves("U-turn", 70, "Physical", "Bug", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-BugIC_LA.png")));
    Moves hyperBean = new Moves("Hyper Bean", 150, "Special", "Normal", 80, 50, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves aerialAce = new Moves("Aerial Ace", 60, "Physical", "Flying", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-FlyingIC_LA.png")));
    
    
    public Noivern() {        
        Moves attacks[] = {aerialAce, uTurn, hyperBean, hurricane};
        setAttacks(attacks);
        
        setName("Noivern");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/noivern.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconNoivern.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Flying_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Dragon_icon_SV.png")));
        
        // Stats
        setHP(374);
        setAttack(262);
        setDefense(284);
        setSpeed(379);
        
        //Atributos
        setAttribute("Flying");
        setAttribute2("Dragon");
    }

   
}
