package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Blissey extends Pokemon{

    Moves hyperBean = new Moves("Hyper Bean", 150, "Special", "Normal", 90, 50,new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves doubleEdge = new Moves("Double-Edge", 120, "Physical", "Normal", 50, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves blizzard = new Moves("Blizzard", 110, "Special", "Ice", 80, 40, new ImageIcon(getClass().getResource("/images/attribute/120px-IceIC_LA.png")));
    Moves retaliate = new Moves("Retaliate", 70, "Physical", "Normal", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    
    public Blissey() {
        
        Moves attacks[] = {retaliate, doubleEdge, blizzard, hyperBean};
        setAttacks(attacks);
        
        setName("Blissey");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/blissey.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconBlissey.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Normal_icon_SV.png")));
        
        // Stats
        setHP(714);
        setAttack(130);
        setDefense(130);
        setSpeed(229);
        
        //Atributos
        setAttribute("Normal");
    }
    
}
