public class Parrot {
    private String name;
    private String type;
    private double weight;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge() {
        if (getAge()<=0){
            System.out.println("Wrong age ! ");
        }
    }
    @Override
    public String toString(){
        return"Parrot : "+"\ntype : "+getType()+"\nname : "+getName()+"\nweight : "+getWeight()+"\ncolor : "+getColor()+"\nage : "+getAge();
    }
}
