package Method;

import Realization.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main
{
    public static void main(String [] args)
    {
        AFU afu1=new AFU(40, 34.69);
        TEROBORONA ter1=new TEROBORONA(56, 97);
        AFU afu2=new AFU(20, 64.69);
        TEROBORONA ter2=new TEROBORONA(76, 97);
        AFU afu3=new AFU(41, 54.69);
        TEROBORONA ter3=new TEROBORONA(26, 1007);

        Person[] masiv= {afu1,ter1,afu2,ter2,afu3,ter3};

        Manager Admin=new Manager(masiv);
        Admin.sortArraybyfunctionOne();
        Admin.printArray();
        Admin.sortArraybyfunctionTwo();
        Admin.printArray();
        Admin.sortArraybyfunctionOneR();
        Admin.printArray();
        Admin.sortArraybyfunctionTwoR();
        Admin.printArray();
        Admin.findUsingEnhancedForLoop(1007);
    }
}
