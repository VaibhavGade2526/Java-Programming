class program341 
{
    public static void main(String[] args) 
    {
        int iMask = 0xFFFFFFFF;

        System.out.printf("Before : %X\n",iMask);

        iMask = ~iMask;

        System.out.printf("After : %X",iMask);
        
    }
    
}
