package piggyBankApp;

public class Dimes extends TheMoney
{
    private int dimes;
    
    public Dimes(int dimes)
    {
        this.dimes = dimes;
    }

    public Dimes()
    {
        this.dimes = this.dimes + 1;
    }


    public double getValue()
    {
        return dimes * 0.10;
    }

    public String getName()
    {
        String plural = dimes > 1 ? "s":"";
        return this.dimes + " Dime" + plural;
    }

}
