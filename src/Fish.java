public class Fish {

    private String type;
    private double weight;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "Fish : "+"\ntype : "+getType()+"\nweight : "+getWeight()+"\ncolor : "+getColor();
    }
}
