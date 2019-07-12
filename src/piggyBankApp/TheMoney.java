package piggyBankApp;

public abstract class TheMoney
{
	public abstract String getName();
	
    public abstract double getValue();

    @Override
    public String toString(){
        return getName();
    }
}