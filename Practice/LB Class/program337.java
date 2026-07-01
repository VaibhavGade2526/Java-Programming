import java.util.Scanner;

class program337 
{
    public static void main(String[] A) 
    {
        int iNo = 0;
        int iMask = 0xfffffff7;;
        int iPos = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();
        
        iNo = iNo ^ iMask;

        System.out.println("Udpated Number I s: "+iNo);
        
    }
    
}
