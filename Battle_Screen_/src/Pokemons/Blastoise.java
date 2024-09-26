package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author samuel
 */
public class Blastoise extends Pokemon{
    
    Moves tackle = new Moves("Tackle", 40, "Physical","Normal", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves waterGun = new Moves("Water Gun", 40, "Special", "Water", 100, 20, new ImageIcon(getClass().getResource("/images/attribute/120px-WaterIC_LA.png")));
    Moves bite = new Moves("Bite", 40, "Physical", "Dark", 60, 0,  new ImageIcon(getClass().getResource("/images/attribute/120px-DarkIC_LA.png")));
    Moves hydroPump = new Moves("Hydro Pump", 40, "Special", "Water", 100, 40,  new ImageIcon(getClass().getResource("/images/attribute/120px-WaterIC_LA.png")));

    public Blastoise() {
        Moves attacks[] = {tackle, bite, waterGun, hydroPump};
        setAttacks(attacks);
        
        setName("Blastoise");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/blastoise.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconBlastoise.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Water_icon_SV.png")));
        
        // Stats
        setHP(362);
        setAttack(291);
        setDefense(328);
        setSpeed(280);
        
        //Atributos
        setAttribute("Water");
    }
    
    
}
