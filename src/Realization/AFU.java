package Realization;

public  class AFU extends Person 
{
    private static String name = "ukrainska";
    private int functionOne;
    private double functionTwo;

    public AFU(int functionOne, double functionTwo) 
    {
        this.functionOne = functionOne;
        this.functionTwo = functionTwo;
        this.name = name;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public int getFunctionOne()
    {
        return functionOne;
    }

    @Override
    public double getFunctionTwo()
    {
        return functionTwo;
    }

    @Override
    public String toString() 
    {
        return "{"+functionOne+" "+functionTwo+"}";
    }
}