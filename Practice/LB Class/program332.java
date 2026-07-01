import java.util.Scanner;

class program332 
{
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iMask = 0x08000000;
        iNo = iMask ^ iNo ;

        System.out.println("Updated number is :"+iNo);

    }
    
}
