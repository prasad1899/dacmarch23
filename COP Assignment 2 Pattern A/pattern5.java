public class pattern5
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        
        System.out.println();
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}