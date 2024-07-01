package javaExamYearTwo.PrimeNumberChecker;

import java.util.Scanner;

public class NumberReader 
{
    //
    private int number;
    private Scanner scanner = new Scanner(System.in);
    private PrimeNumberChecker PNC = new PrimeNumberChecker();
    //
    public NumberReader()
    {
        begin();
    }

    public void begin()
    {
        setNumber();
        if (PNC.primeNumberTest(readNumber()) == true) 
        {
            System.out.println("Is Prime!\n");
        }
        else
        if(PNC.primeNumberTest(readNumber()) == false) 
        {
            System.out.println("Not Prime!\n");
        }
    }

    //
    public int readNumber()
    {
        return this.number;
    }

    //
    public void setNumber()
    {
        System.out.print("Prime number? -> ");
        this.number = scanner.nextInt();
    }
}
