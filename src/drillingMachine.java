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
        this.broken =true;


    }






    public void becomeBroken(){
        this.broken=true;
    }

    public void repair(){
        if (this.broken == true){
            this.broken = false;
            this.price = price*0.5;
        }
    }

    public void aging(){
        this.age = age+1;
        if (this.age > 9 )
            this.broken=true;
    }
    public void reactOnHighDemand(){
        this.price = price*1.25;
    }

    public void showInfo(){
        System.out.println(this.name + "," + this.price+ "," + this.broken+ ","+ this.watt);
    }

    public void increasePrice(double amount){
        this.price=price+amount;
    }

    public void changePower(int watt){
        if (watt>0)
            this.watt= this.watt+watt;
            if (watt > 100)
                this.price=price*1.05;


        if (watt < 0)
            this.price=price*0.9;



    }
    public boolean increasePriceByPercentage(double percentage){
        if(percentage > 0.00){
            this.price = price + percentage*price/100;
        }

    }

    }




