package piggyBankApp;

public class Nickels extends TheMoney
{
    private int nickels;
    
    public Nickels(int nickels){
        this.nickels = nickels;
      
    }

    public Nickels(){
        this.nickels = this.nickels + 1;
    }


    public double getValue(){
        return nickels * 0.05;
    }



    public String getName(){
        String plural = nickels > 1 ? "s":"";
        return this.nickels + " Nickel" + plural;
    }
}