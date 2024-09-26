package Poderes;

import javax.swing.ImageIcon;
/**
 *
 * @author samuel
 */
public class Moves {
    private ImageIcon sprite;
    private String name;
    private int power;
    private String type;
    private String attribute;
    private int accuracy;
    private int cost;

    public Moves(String name, int power, String type, String atribute, int accuracy, int cost, ImageIcon sprite) {
        this.name = name;
        this.power = power;
        this.attribute = atribute;
        this.type = type;
        this.accuracy = accuracy;
        this.cost = cost;
        this.sprite = sprite;
    }

    public ImageIcon getSprite(){
        return sprite;
    }
    
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getCost() {
        return cost;
    }

    public String getAttribute() {
        return attribute;
    }   
}
