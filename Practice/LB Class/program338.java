import java.util.Scanner;

class program338 
{
    // poistion 13
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0xffffefff;
        int iPos = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iNo = iNo ^ iMask;

        System.out.println("Updated number :"+iNo);
    }
    
}
