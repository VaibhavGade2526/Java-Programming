class program326 
{
    public static void main(String[] A) 
    {
        int iMask = 0x80000000;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 32; iCnt++)
        {
            System.out.printf("%d: %X\n",iCnt,iMask);  
            iMask = iMask>>1;
        }
        
    }
    
}
