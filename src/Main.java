public class Main
{
    public static void main(String[] args)
        {
        long x = 0, y, z, counter = 1;
        while(x < 1)
            {
            x = 1;
            y = 2;
            do
                {
                System.out.println("position: "+counter+" -> "+x);
                z = x+y;
                x = y;
                y = z;
                counter++;
                } while(x < 2000000000);
            }
        }
}


