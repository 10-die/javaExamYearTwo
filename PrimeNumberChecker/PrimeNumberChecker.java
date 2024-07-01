package javaExamYearTwo.PrimeNumberChecker;

public class PrimeNumberChecker
{
    // variables, declared
    private boolean isPrime;
    private int number = 0;
    private boolean binary;

    // paramaterised constructor
    public PrimeNumberChecker()
    {
        
    }

    //
    public boolean primeNumberTest(int number)
    {
        calculator(number);
        
        if (this.isPrime == true) 
        {
            binary = true;
        }
        else
        if(this.isPrime == false) 
        {
            binary = false;
        }
        return binary;
    }

    //
    public void isThisPrime(boolean binary)
    {
        this.isPrime = binary;
    }

    public void calculator(int number)
    {
        this.number = number % 2;
        if(this.number == 1)
        {
            isThisPrime(true);
        }
        else
        if(this.number == 0)
        {
            isThisPrime(false);
        }
    }
}
// 1, 3, 5, 7, 11, 13, 17, 19, 21
// 1, 2, 3, 4, 5, 