package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Venusaur extends Pokemon{

    Moves sludgeBomb = new Moves("Sludge Bomb", 90, "Special", "Poison", 100, 10, new ImageIcon(getClass().getResource("/images/attribute/120px-PoisonIC_LA.png")));
    Moves earthquake = new Moves("Earthquake", 100, "Physical", "Ground", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-GroundIC_LA.png")));
    Moves gigaDrain = new Moves("Giga Drain", 75, "Special", "Grass", 100, 20, new ImageIcon(getClass().getResource("/images/attribute/120px-GrassIC_LA.png")));
    Moves furyCutter = new Moves("Fury Cutter", 40, "Physical", "Bug", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-BugIC_LA.png")));
    
    public Venusaur() {        
        Moves attacks[] = {furyCutter, earthquake, gigaDrain, sludgeBomb};
        setAttacks(attacks);
        
        setName("Venusaur");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/venusaur.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconVenusaur.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Grass_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Poison_icon_SV.png")));
        
        // Stats
        setHP(364);
        setAttack(289);
        setDefense(291);
        setSpeed(284);
        
        //Atributos
        setAttribute("Grass");
        setAttribute2("Poison");
    }

}
