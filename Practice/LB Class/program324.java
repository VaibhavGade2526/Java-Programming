class program324 
{
    public static void main(String[] A) 
    {
        int iMask = 1;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 32; iCnt++)
        {
            System.out.printf("%d: %X\n",iCnt,iMask);  
            iMask = iMask<<1;
        }
        
    }
    
}
