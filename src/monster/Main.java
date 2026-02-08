/** Project: Lab 2
 * Purpose Details: Using Abstraction, Inheritance, Polymorphism: Monsters
 * Course: IST 242
 * Author: Krish Trivedi
 * Date Developed: 2/2/2026
 * Last Date Changed:2/8/26
 * Rev:

 */

package monster;

public class Main {
    public static void main(String[] args) {

        Air air = new Air("Aang", 4.5, 177.7, Color.BLUE, 13, 89.4, 736.5, 99, "Yes");
        System.out.println("Name: " + air.getName());
        System.out.println("Height: " + air.getHeight());
        System.out.println("Weight: " + air.getWeight());
        System.out.println("Skin Color: " + air.getSkinColor());
        System.out.println("Age: " + air.getAge());
        System.out.println("Health: " + air.getHealth());
        System.out.print("Special Power: ");
        air.specialPower();
        System.out.println("Highest Altitude: " + air.getHighestAltitude() + " meters");
        System.out.println("Gust of Wind Speed in MPH: " + air.getGustWindSpeed());
        System.out.println("Ability to control wind direction: " + air.getWindDirControl());
        System.out.println();


        Earth earth = new Earth("Toph", 4.2, 203.4, Color.GREEN, 15, 100.0, "Iron", 89, 98);
        System.out.println("Name: " + earth.getName());
        System.out.println("Height: " + earth.getHeight());
        System.out.println("Weight: " + earth.getWeight());
        System.out.println("Skin Color: " + earth.getSkinColor());
        System.out.print("Special Power: ");
        earth.specialPower();
        System.out.println("Age: " + earth.getAge());
        System.out.println("Health: " + earth.getHealth());
        System.out.println("Preferred Mineral Composition: " + earth.getMineralComposition());
        System.out.println("Tremor Sense: " + earth.getTremorSense() + "%");
        System.out.println("Earth Manipulation Strength: " + earth.getEarthManipulationStrength() + "%");
        System.out.println();

        Fire fire = new Fire("Zuko", 5.10, 238.7, Color.RED, 19,96.4,2023.1, "Yes", "No");
        System.out.println("Name: " + fire.getName());
        System.out.println("Height: " + fire.getHeight());
        System.out.println("Weight: " + fire.getWeight());
        System.out.println("Skin Color: " + fire.getSkinColor());
        System.out.print("Special Power: ");
        fire.specialPower();
        System.out.println("Age: " + fire.getAge());
        System.out.println("Health: " + fire.getHealth());
        System.out.println("Flame Temperature: " + fire.getFlameTemp() + " Celsius");
        System.out.println("Explosion Control: "+ fire.getExplosionControl());
        System.out.println("Fire Resistance: " + fire.getFireResistance());
        System.out.println();

        Water water = new Water("Katara", 4.9, 252.2, Color.BLUE,18, 99.4,99,100,87);
        System.out.println("Name: " + water.getName());
        System.out.println("Height: " + water.getHeight());
        System.out.println("Weight: " + water.getWeight());
        System.out.println("Skin Color: " + water.getSkinColor());
        System.out.print("Special Power: ");
        water.specialPower();
        System.out.println("Age: " + water.getAge());
        System.out.println("Health: " + water.getHealth());
        System.out.println("Fluidity Skill: " + water.getFluiditySkill() + "%");
        System.out.println("Hydration Level: " + water.getHydrationLevel() + "%");
        System.out.println("Tidal Force: " + water.getTidalForce() + "%");
        System.out.println();




    }
}
