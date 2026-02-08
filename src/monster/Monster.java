/** Project: Lab 2
 * Purpose Details: Same type of attributes of all Monsters combined
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/8/26
 * Rev:

 */

package monster;

public abstract class Monster {

    private String name;
    private double height;
    private Color skinColor;
    private double weight;
    private int age;
    private double health;


    public Monster(String name, double height, double weight, Color skinColor, int age, double health) {
        this.name = name;
        this.height = height;
        this.skinColor = skinColor;
        this.weight = weight;
        this.age = age;
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Color getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(Color skinColor) {
        this.skinColor = skinColor;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Empty abstract class method to help list the behavior of a monster in other classes
     */
    public void specialPower(){}
}
