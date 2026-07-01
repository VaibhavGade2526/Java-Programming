import java.util.Scanner;

class program305
{
    public static void main(String A[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second Number :");
        iNo2 = sobj.nextInt();

        iAns = iNo1 & iNo2;

        System.out.println("AND is : "+iAns);

        iAns = iNo1 | iNo2;

        System.out.println("OR is :"+iAns);

        iAns = iNo1 ^ iNo2 ;

        System.out.println("XOR is :"+iAns);

    }
    
}
