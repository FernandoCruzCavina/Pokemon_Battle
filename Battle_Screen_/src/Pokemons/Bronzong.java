package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Bronzong extends Pokemon{

    Moves psywave = new Moves("Psywave", 100, "Special", "Psychic", 100, 50, new ImageIcon(getClass().getResource("/images/attribute/120px-PsychicIC_LA.png")));
    Moves ironhead = new Moves("Iron Head", 80, "Physical","Steel", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-SteelIC_LA.png")));
    Moves flashCannon = new Moves("Flash Cannon", 80, "Special", "Steel", 100, 10, new ImageIcon(getClass().getResource("/images/attribute/120px-SteelIC_LA.png")));
    Moves zenHeadbutt = new Moves("Zen Headbutt", 80,"Physical", "Psychic", 90, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-PsychicIC_LA.png")));

    public Bronzong() {
        
        Moves attacks[] = {zenHeadbutt, ironhead, flashCannon, psywave};
        setAttacks(attacks);
        
        setName("Bronzong");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/bronzong.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconBronzong.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Psychic_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Steel_icon_SV.png")));
        // Stats
        setHP(624);
        setAttack(149);
        setDefense(126);
        setSpeed(102);
        
        //Atributos
        setAttribute("Steel");
        setAttribute2("Psychic");
    }
    
}
