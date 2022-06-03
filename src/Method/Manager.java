package Method;

import Realization.Person;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Manager 
{
    Person[] arr;
    
    public Manager(Person[] admins)
    {
        this.arr=admins;
    }

    public Person[] getAdmins()
    {
        return arr;
    } 

    Comparator functionTwoComparator = Comparator.comparing(Person::getFunctionTwo);
    Comparator functionOneComparator = Comparator.comparing(Person::getFunctionOne);
    
    public Person[] sortArraybyfunctionTwo()
    {
        Arrays.sort(getAdmins(), functionTwoComparator);
        return arr;
    }

    public Person[] sortArraybyfunctionOne()
    {
        Arrays.sort(getAdmins(), functionOneComparator);
        return arr;
    }

    public Person[] sortArraybyfunctionTwoR()
    {
        Arrays.sort(getAdmins(), functionTwoComparator.reversed());
        return arr;
    }

    public Person[] sortArraybyfunctionOneR()
    {
        Arrays.sort(getAdmins(), functionOneComparator.reversed());
        return arr;
    }

    public Person findUsingEnhancedForLoop(double toFind )
    {
        for (Person searcher : getAdmins())
        {
            if (searcher.getFunctionTwo() == toFind)
            {
                System.out.println(searcher.toString());
            }
            return null;
        }
        return null;
    }

    public void printArray()
    {
        for (int i = 0; i < getAdmins().length; i++)
        {
            System.out.println(getAdmins()[i].toString());
        }
        System.out.println();
    }
}
