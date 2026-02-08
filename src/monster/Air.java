/** Project: Lab 2
 * Purpose Details: Air Monster and its special power
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/7/26
 * Rev:

 */

package monster;

public class Air extends  Monster {

    /**
     * The highest Altitude achieved by the air monster
     */
    private double highestAltitude;
    /**
     * The gust of wind speed in MPH the air monster can blast
     */
    private int gustWindSpeed;
    /**
     * Ability to control wind direction by the air monster
     */
    private String windDirControl;

    /**
     *
     * Creates the constructor for the class Air
     *
     * @param name This is the name of the air monster
     * @param height This is the height of the air monster
     * @param weight This is the weight of the air monster
     * @param skinColor This is the skin color of the air monster
     * @param age This is the age of the air monster
     * @param health This is the health of the air monster
     * @param highestAltitude This is the highest altitude the air monster can reach
     * @param gustWindSpeed This is the gust of wind speed in MPH the air monster can blast
     * @param windDirControl This is stating that if the air monster can control wind direction
     */
    public Air(String name, double height, double weight, Color skinColor, int age, double health, double highestAltitude, int gustWindSpeed, String windDirControl) {
        super(name, height, weight, skinColor, age, health);
        this.highestAltitude = highestAltitude;
        this.gustWindSpeed = gustWindSpeed;
        this.windDirControl = windDirControl;
    }

    /**
     *
     * Gets the highest altitude
     *
     * @return the highest altitude
     */
    public double getHighestAltitude() {
        return highestAltitude;
    }

    /**
     *
     * Sets to the highest altitude
     *
     * @param highestAltitude This is the highest altitude
     */
    public void setHighestAltitude(double highestAltitude) {
        this.highestAltitude = highestAltitude;
    }

    /**
     *
     * Gets the gust wind speed
     *
     * @return The gust wind speed
     */
    public int getGustWindSpeed() {
        return gustWindSpeed;
    }

    /**
     *
     * Sets the gust wind speed
     *
     * @param gustWindSpeed This is the gust wind speed
     */
    public void setGustWindSpeed(int gustWindSpeed) {
        this.gustWindSpeed = gustWindSpeed;
    }

    /**
     *
     * Gets the wind direction control
     *
     * @return The wind direction control
     */
    public String getWindDirControl() {
        return windDirControl;
    }

    /**
     *
     * Sets the wind direction control
     *
     * @param windDirControl This is the direction control
     */
    public void setWindDirControl(String windDirControl) {
        this.windDirControl = windDirControl;
    }

    /**
     * Overrides the empty method in Monsters class to put in the special power of an air monster
     */
    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.FLYING);
    }
}
