package piggyBankApp;

public class Quarter extends TheMoney
{
    
    private int quarter;
    
    public Quarter(int quarter)
    {
        this.quarter = quarter;
    }

    public Quarter()
    {
        this.quarter = this.quarter + 1;
    }
	
    public double getValue(){
        return quarter * 0.25;
    }
	
    public String getName()
    {
        String plural = quarter > 1 ? "s":"";
        return this.quarter + " Quarter" + plural;
    }

}