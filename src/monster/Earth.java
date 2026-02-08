/** Project: Lab 2
 * Purpose Details: Earth Monster and its special power
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/8/26
 * Rev:

*/

package monster;

public class Earth extends  Monster {

    private String mineralComposition;
    private int tremorSense;
    private int earthManipulationStrength;


    /**
     *
     * Creates the constructor for the class Earth
     *
     * @param name This is the name of the earth monster
     * @param height This is the height of the earth monster
     * @param weight This is the weight of the earth monster
     * @param skinColor This is the skin color of earth monster
     * @p
     */
    public Earth(String name, double height, double weight, Color skinColor, int age, double health, String mineralComposition, int tremorSense, int earthManipulationStrength) {
        super(name, height, weight, skinColor, age, health);
        this.mineralComposition = mineralComposition;
        this.tremorSense = tremorSense;
        this.earthManipulationStrength = earthManipulationStrength;
    }

    public String getMineralComposition() {
        return mineralComposition;
    }

    public void setMineralComposition(String mineralComposition) {
        this.mineralComposition = mineralComposition;
    }

    public int getTremorSense() {
        return tremorSense;
    }

    public void setTremorSense(int tremorSense) {
        this.tremorSense = tremorSense;
    }

    public int getEarthManipulationStrength() {
        return earthManipulationStrength;
    }

    public void setEarthManipulationStrength(int earthManipulationStrength) {
        this.earthManipulationStrength = earthManipulationStrength;
    }

    /**
     * Overrides the empty method in Monsters class to put in the special power of an earth monster
     */
    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.METAL_BENDING);
    }
}
