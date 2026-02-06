package monster;

public class Water extends Monster {

    public Water(String name, double height, String skinColor, double weight, String power) {
        super(name, height, skinColor, weight, power);
    }

    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.LIQUID_BENDING);
    }
}
