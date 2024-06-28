public class NumberSwapper 
{
    // variables
    private int x;
    private int y;

    // default constructor
    public NumberSwapper()
    {

    }

    // parameterized constructor
    public NumberSwapper(int x, int y)
    {
        setX(x);
        setY(y);
    }

    // mutator method
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    // accessor method
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }

    // calculate the difference between x and y
    public int getDifference()
    {
        return this.x - this.y;
    }

    // switch the x and y variables simultaneously
    public void switchVariables()
    {
        this.x = this.x + this.y;
        this.y = this.x - this.y;
        this.x = this.x - this.y;
    }

    // toString method
    public String toString()
    {
        return "x = " + getX() + "\ny = " + getY();
    }
}
