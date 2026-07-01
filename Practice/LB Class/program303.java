import java.util.*;
class program303 
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iNo = sobj.nextInt();

        while (iNo != 0) 
        {
          iDigit = iNo%2;
          System.out.println(iDigit);
          iNo = iNo/10;
        } 
        System.out.println();
    
    }  
}
