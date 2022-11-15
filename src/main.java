

public class main {
    public static void main(String[] args) {
        drillingMachine d1= new drillingMachine();
        d1.becomeBroken();
        d1.repair();
        d1.aging();
        d1.reactOnHighDemand();
        d1.increasePrice(200000000);
        d1.changePower(-200);


        drillingMachine d2= new drillingMachine();
        d2.becomeBroken();
        d2.repair();
        d2.aging();
        d2.reactOnHighDemand();
        d2.increasePrice(123456);
        d2.changePower(200);

        drillingMachine d3= new drillingMachine();
        d3.becomeBroken();
        d3.repair();
        d3.aging();
        d3.reactOnHighDemand();
        d3.increasePrice(88);
        d3.changePower(7000);



        d1.showInfo();
        d2.showInfo();
        d3.showInfo();

    }
}
