
package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Greninja extends Pokemon{

    Moves hydroPump = new Moves("Hydro Pump", 110, "Special", "Water", 80, 20,  new ImageIcon(getClass().getResource("/images/attribute/120px-WaterIC_LA.png")));
    Moves darkPulse = new Moves("dark Pulse", 80, "Special", "Dark", 100, 10, new ImageIcon(getClass().getResource("/images/attribute/120px-DarkIC_LA.png")));
    Moves gunkShot = new Moves("Gunk Shot", 100, "Physical", "Poison", 70, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-PoisonIC_LA.png")));
    Moves nightSlash = new Moves("Night Slash", 70, "Physical", "Dark", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-DarkIC_LA.png")));
    
    public Greninja() {
        
        Moves attacks[] = {nightSlash, gunkShot, darkPulse, hydroPump};
        setAttacks(attacks);
        
        setName("Greninja");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/Greninja.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGreninja.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Water_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Dark_icon_SV.png")));
        // Stats
        setHP(320);
        setAttack(249);
        setDefense(236);
        setSpeed(284);
        
        //Atributos
        setAttribute("Water");
        setAttribute2("Dark");
        
        
    }
    
}
