package monster;

public class Earth extends  Monster {

    public Earth(String name, double height, String skinColor, double weight, String power) {
        super(name, height, skinColor, weight, power);
    }

    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.METAL_BENDING);
    }
}
