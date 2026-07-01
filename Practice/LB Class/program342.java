class program342 
{
    // 0  1  1 0  0  0  0  0  0
    // 0  1  0 0  0  0  0  0  0
    public static void main(String[] A) 
    {
        int iMask = 0xFFFFFFBF;
        System.out.printf("Before : %X\n",iMask);

        iMask = ~iMask;

        System.out.printf("After : %X\n",iMask);
        
    }
    
}
