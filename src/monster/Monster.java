package monster;

public abstract class Monster {

    private String name;
    private double height;
    private String SkinColor;
    private double weight;
    private String power;

    public Monster(String name, double height, String skinColor, double weight, String power) {
        this.name = name;
        this.height = height;
        SkinColor = skinColor;
        this.weight = weight;
        this.power = power;
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


    public String getSkinColor() {
        return SkinColor;
    }

    public void setSkinColor(String skinColor) {
        this.SkinColor = skinColor;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void specialPower(){}
}
