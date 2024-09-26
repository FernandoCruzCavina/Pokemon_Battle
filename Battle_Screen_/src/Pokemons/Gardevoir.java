package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Gardevoir extends Pokemon{

    Moves psyshock = new Moves("Psyshock", 80, "Special", "Psychic", 100, 10, new ImageIcon(getClass().getResource("/images/attribute/120px-PsychicIC_LA.png")));
    Moves headbutt = new Moves("Headbutt", 70, "Physical", "Normal",100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves moonblast = new Moves("Moonblast", 95, "Special", "Fairy", 100, 25, new ImageIcon(getClass().getResource("/images/attribute/120px-FairyIC_LA.png")));
    Moves zenHeadbutt = new Moves("Zen Headbutt", 80,"Physical", "Psychic", 90, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-PsychicIC_LA.png")));
    
    public Gardevoir() {
        
        Moves attacks[] = {zenHeadbutt, headbutt, moonblast, psyshock};
        setAttacks(attacks);
        
        setName("Gardevoir");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/gardevoir.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGardevoir.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Psychic_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Fairy_icon_SV.png")));
        
        // Stats
        setHP(340);
        setAttack(251);
        setDefense(251);
        setSpeed(284);
        
        //Atributos
        setAttribute("Psychic");
        setAttribute2("Fairy");
    }


}
