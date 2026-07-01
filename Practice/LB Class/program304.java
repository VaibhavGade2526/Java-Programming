import java.util.*;
class program304 
{
    public static void main(String A[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int Ans = 0;
         Scanner sobj = new Scanner(System.in);
         
         System.out.println("Enter first Number :");
         iNo1 = sobj.nextInt();

         System.out.println("Enter second Number:");
         iNo2 = sobj.nextInt();

         Ans = iNo1 & iNo2 ;

         System.out.println("Result is : "+Ans);
    }
    
}
