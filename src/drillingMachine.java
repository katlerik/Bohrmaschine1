public class drillingMachine {



    private int watt, age;
    private String name;
    private double price;
    private boolean broken;



    public drillingMachine(){
        this.watt = (int)(Math.random()*1200 + 800);
        this.age = (int)(Math.random()*10+0);
        this.name = "Adolf";
        this.price = (int)(Math.random()*450 + 50);
        this.broken =broken;


    }


    public int getWatt() {
        return watt;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBroken() {
        return broken;

    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
