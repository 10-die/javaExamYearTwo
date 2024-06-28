public class Driver 
{
    public static void main(String[] args) 
    {
        NumberSwapper numberSwapper = new NumberSwapper(5, 3);
        System.out.println(numberSwapper.toString());
        numberSwapper.switchVariables();
        System.out.println(numberSwapper.toString());
    }
}
