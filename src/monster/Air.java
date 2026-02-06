package monster;

public class Air extends  Monster {


    public Air(String name, double height, String skinColor, double weight, String power) {
        super(name, height, skinColor, weight, power);
    }

    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.FLYING);
    }
}
