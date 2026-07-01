import java.util.Scanner;

class program345
{
    public static void main(String[] A) 
    {
        int iMask = 0x00400800;
        int iNo = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iResult = iNo ^ iMask;

        System.out.printf("Updated Number : %d",iResult);
        
        
    }
    
}
