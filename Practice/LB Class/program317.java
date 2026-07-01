import java.util.Scanner;

class program317 
{
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0;
        int iAns = 0;
        int iPos = 0;

       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter Number :");
       iNo = sobj.nextInt();

       System.out.println("Enter the postion :");
       iPos = sobj.nextInt();

       iMask = iMask << (iPos - 1);

       iAns = iNo & iMask;

       if(iAns == iMask)
       {
        System.out.println("Bit is ON");
       }
       else
       {
        System.out.println("Bit is OFF");
       }
        
    }
    
}
