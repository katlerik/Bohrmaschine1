import sun.security.x509.OtherName;

public class main {
    public static void main(String[] args) {
        drillingMachine d1= new drillingMachine();
        d1.setBroken(true);
        if (d1.isBroken() == true)
            d1.setBroken(false);
            d1.setPrice(d1.getPrice() * 0.5);
        d1.setAge(d1.getAge()+1);
        if (d1.getAge() > 9 )
            d1.setBroken(true);
        d1.setPrice(d1.getPrice() * 1.25);




        drillingMachine d2= new drillingMachine();
        d2.setBroken(true);
        if (d2.isBroken() == true)
            d2.setBroken(false);
        d2.setPrice(d2.getPrice() * 1.25);
        d2.setAge(d2.getAge()+1);
        if (d2.getAge() > 9 )
            d2.setBroken(true);


        drillingMachine d3= new drillingMachine();
        d3.setBroken(true);
        if (d3.isBroken() == true)
            d3.setBroken(false);
        d3.setPrice(d3.getPrice() * 1.25);
        d3.setAge(d3.getAge()+1);
        if (d3.getAge() > 9 )
            d3.setBroken(true);
        System.out.println(d1.getName() + "," + d1.getPrice()+ "," + d1.isBroken());
        System.out.println(d2.getName() + "," + d2.getPrice() + "," + d2.isBroken());
        System.out.println(d3.getName() + "," + d3.getPrice() + "," + d3.isBroken());


    }
}
