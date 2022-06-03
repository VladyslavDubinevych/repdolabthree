package Realization;

public class TEROBORONA extends Person
{
    private  String name = "lvivska";
    private int functionOne;
    private double functionTwo;

    public TEROBORONA(int functionOne, double functionTwo) 
    {
        this.functionOne = functionOne;
        this.functionTwo = functionTwo;
    }
    @Override
    
    public String toString() 
    {
        return "{"+functionOne+" "+functionTwo+"}";
    }
    
    @Override
    public int getFunctionOne() {
        return functionOne;
    }
    
    @Override
    public double getFunctionTwo()
    {
        return functionTwo;
    }
    
    @Override
    public String getName()
    {
        return name;
    }
}
