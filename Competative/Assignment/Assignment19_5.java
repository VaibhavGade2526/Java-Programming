// Assignment 19 :- Q5
// write a programto calcullate the power of a number using loops

class Logic 
{
    void CalculatePower(int base, int exp)
    {
        int iCnt = 0;
        int iAns = 1;
        for(iCnt = 1;iCnt<=exp;iCnt++)
        {
            iAns = iAns*base;
        }

        System.out.println(iAns);

    }
}
class Assignment19_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2, 5);

    }
}
