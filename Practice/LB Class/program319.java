class program319
{
    public static void main(String[] A) 
    {
        int iMask = 0x1;
        int iCnt = 0;

        System.out.printf("%X\n",iMask);  //1
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //2
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //4
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //8
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //16
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //32
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //1
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //1
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //1
        iMask = iMask<<1;

        System.out.printf("%X\n",iMask);  //1
        iMask = iMask<<1;

        
    }
    
}
