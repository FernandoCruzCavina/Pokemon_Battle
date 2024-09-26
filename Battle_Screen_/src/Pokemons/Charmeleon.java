/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author samuel
 */
public class Charmeleon extends Pokemon{
    
    Moves ember = new Moves("Ember", 90, "Special", "Fire", 100, 20, new ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png")));
    Moves fireFang = new Moves("Fire Fang", 65, "Physical", "Fire", 95, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png")));
    Moves slash = new Moves("Slash", 70,"Physical", "Normal", 80, 0, new ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png")));
    Moves fireSpin = new Moves("Fire Spin", 120, "Special", "Fire", 100, 30, new ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png")));
    
    public Charmeleon() {        
        Moves attacks[] = {slash, fireFang, ember, fireSpin};
        setAttacks(attacks);
        
        setName("Charmeleon");
        
        //images
        setSprite(new ImageIcon(getClass().getResource("/images/pokemon/charmeleon.png")));
        setIcon(new ImageIcon(getClass().getResource("/images/icon/iconCharmeleon.png")));
        setAttributeIcon(new ImageIcon(getClass().getResource("/images/attribute/Fire_icon_SV.png")));
        
        // Stats
        setHP(248);
        setAttack(317);
        setDefense(256);
        setSpeed(377);
        
        //Atributos
        setAttribute("Fire");
    }
    
    
}
