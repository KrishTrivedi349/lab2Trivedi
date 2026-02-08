/** Project: Lab 2
 * Purpose Details: Water Monster and its special power
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/8/26
 * Rev:

 */


package monster;

public class Water extends Monster {

    private int fluiditySkill;
    private int hydrationLevel;
    private int tidalForce;
    /**
     *
     * Creates the constructor for the class Water
     *
     * @param name This is the name of the water monster
     * @param height This is the height of the water monster
     * @param weight This is the weight of the water monster
     * @param skinColor This is the skin color of water monster
     */
    public Water(String name, double height, double weight, Color skinColor, int age, double health, int fluiditySkill, int hydrationLevel, int tidalForce) {
        super(name, height, weight, skinColor, age, health);
        this.fluiditySkill = fluiditySkill;
        this.hydrationLevel = hydrationLevel;
        this.tidalForce = tidalForce;

    }

    public int getFluiditySkill() {
        return fluiditySkill;
    }

    public void setFluiditySkill(int fluiditySkill) {
        this.fluiditySkill = fluiditySkill;
    }

    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public void setHydrationLevel(int hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }

    public int getTidalForce() {
        return tidalForce;
    }

    public void setTidalForce(int tidalForce) {
        this.tidalForce = tidalForce;
    }

    /**
     * Overrides the empty method in Monsters class to put in the special power of a water monster
     */
    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.BLOOD_BENDING);
    }
}
