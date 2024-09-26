package Pokemons;

import Poderes.Moves;
import javax.swing.ImageIcon;

/**
 *
 * @author samuel
 */
public class Pokemon {
    private ImageIcon sprite;
    private ImageIcon icon;
    private ImageIcon attributeIcon;
    private ImageIcon attributeIcon2;
    private String name;
    private String Attribute;
    private String Attribute2;
    private int HP;
    private int currentHP;
    private int attack;
    private int defense;
    private int speed;
    private int level = 100;
    private int mana;
    private final int dodge = 30;
    
    private Moves[] attacks = new Moves[4];
    
    public Pokemon() {
        
    }
    
    public ImageIcon getSprite() {
        return sprite;
    }

    public void setSprite(ImageIcon sprite) {
        this.sprite = sprite;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public ImageIcon getAttributeIcon() {
        return attributeIcon;
    }

    public void setAttributeIcon(ImageIcon attributeIcon) {
        this.attributeIcon = attributeIcon;
    }

    public ImageIcon getAttributeIcon2() {
        return attributeIcon2;
    }

    public void setAttributeIcon2(ImageIcon attributeIcon2) {
        this.attributeIcon2 = attributeIcon2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return Attribute;
    }

    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    public String getAttribute2() {
        return Attribute2;
    }

    public void setAttribute2(String Attribute2) {
        this.Attribute2 = Attribute2;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public Moves[] getAttacks() {
        return attacks;
    }

    public void setAttacks(Moves[] attacks) {
        this.attacks = attacks;
    }
    
    public int attack(Pokemon enemy, Moves move){
        int damage = (int) (Math.floor(Math.floor(Math.floor(2 * level / 5 + 2) * attack * move.getPower() / enemy.defense) / 50) + 2);

        return damage;
    }
    
    public int defense(){
        return dodge; 
    }   
}
