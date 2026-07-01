import java.util.Scanner;

class program308
{
    public static void main(String[] A)
    {
      int iNo = 0;
      int iMask = 0x00000004;
      int iAns = 0;
      
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter Number :");
      iNo = sobj.nextInt();

      iAns = iNo & iMask;

      if(iAns == iMask)
      {
        System.out.println("3rd Bit is ON ");
      }
      else
      {
        System.out.println("#rd Bit is OFF");
      }

    }
    
}
