import java.util.Scanner;

class program343 
{
    // Postion 3 & 7 
    public static void main(String[] A) 
    {
        int iMAsk= 0x00000044;
        int iNo = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        iResult = iNo ^ iMAsk;

        System.out.printf("Updated number : %d",iResult);
        
    }
    
}
