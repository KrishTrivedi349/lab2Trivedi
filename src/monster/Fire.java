/** Project: Lab 2
 * Purpose Details: Fire Monster and its special power
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/8/26
 * Rev:

 */

package monster;

public class Fire extends Monster {
    private double flameTemp;
    private String explosionControl;
    private String fireResistance;
    /**
     *
     * Creates the constructor for the class Fire
     *
     * @param name This is the name of the fire monster
     * @param height This is the height of the fire monster
     * @param weight This is the weight of the fire monster
     * @param skinColor This is the skin color of fire monster
     */
    public Fire(String name, double height, double weight, Color skinColor, int age, double health, double flameTemp, String explosionControl, String fireResistance) {
        super(name, height, weight, skinColor, age, health);
        this.flameTemp = flameTemp;
        this.explosionControl = explosionControl;
        this.fireResistance = fireResistance;
    }

    public double getFlameTemp() {
        return flameTemp;
    }

    public void setFlameTemp(double flameTemp) {
        this.flameTemp = flameTemp;
    }

    public String getExplosionControl() {
        return explosionControl;
    }

    public void setExplosionControl(String explosionControl) {
        this.explosionControl = explosionControl;
    }

    public String getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(String heatResistance) {
        this.fireResistance = heatResistance;
    }

    /**
     * Overrides the empty method in Monsters class to put in the special power of a fire monster
     */
    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.LIGHTNING_BLAST);
    }
}
