package monster;

public class Fire extends Monster {

    public Fire(String name, double height, String skinColor, double weight, String power) {
        super(name, height, skinColor, weight, power);
    }

    @Override
    public void specialPower(){
        System.out.println(SpecialPowers.LIGHTNING_BLAST);
    }
}
