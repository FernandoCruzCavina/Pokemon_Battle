package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Ampharos extends Pokemon{

    Moves voltSwitch = new Moves("Volt Switch", 70, "Special", "Electric", 100, 40, new ImageIcon(getClass().getResource("/images/attribute/120px-ElectricIC_LA.png")));
    Moves chargeBean = new Moves("Charge Bean",90, "Special", "Electric", 50, 20,  new ImageIcon(getClass().getResource("/images/attribute/120px-ElectricIC_LA.png")));
    Moves bulldoze = new Moves("Bulldoze", 60, "Physical", "Ground", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-GroundIC_LA.png")));
    Moves outrage = new Moves("Outrage", 120, "Physical", "Dragon", 90, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-DragonIC_LA.png")));

    public Ampharos() {        
        Moves attacks[] = {bulldoze, outrage, voltSwitch, chargeBean};
        setAttacks(attacks);
        
        setName("Ampharos");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/ampharos.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconAmpharos.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Electric_icon_SV.png")));
        
        // Stats
        setHP(384);
        setAttack(273);
        setDefense(295);
        setSpeed(229);
        
        //Atributos
        setAttribute("Electric");
    }
       
}
