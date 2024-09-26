package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author Fernando
 */
public class Gengar extends Pokemon{

    Moves shadowBall = new Moves("Shadow Ball", 90, "Special", "Ghost", 100, 20, new ImageIcon(getClass().getResource("/images/attribute/120px-GhostIC_LA.png")));
    Moves psyshock = new Moves("Psyshock", 80, "Special", "Psychic", 100, 10, new ImageIcon(getClass().getResource("/images/attribute/120px-PsychicIC_LA.png")));
    Moves lick = new Moves("Lick", 35,"Physical", "Ghost", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-GhostIC_LA.png")));
    Moves poisonJab = new Moves("Poison Jab", 80, "Physical", "Poison", 100, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-PoisonIC_LA.png")));
    
    public Gengar() {
        Moves attacks[] = {poisonJab, psyshock, lick, shadowBall};
        setAttacks(attacks);
        
        setName("Gengar");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/gengar.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconGengar.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Ghost_icon_SV.png")));
        setAttributeIcon2(new ImageIcon(getClass().getResource("/images/attribute/Poison_icon_SV.png")));
        // Stats
        setHP(324);
        setAttack(251);
        setDefense(240);
        setSpeed(350);
        
        //Atributos
        setAttribute("Ghost");
        setAttribute2("Poison");
    }
   
}
