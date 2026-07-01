import java.util.Scanner;

class program330 
{
   public static void main(String[] A) 
   {
    int iNo = 0;
    int iMask = 0;

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number :");
    iNo = sobj.nextInt();

    iMask = 0x00000008;

    iNo = iNo ^ iMask;

    System.out.println("Updated number  : %d"+iNo);
    
   }
    
}
