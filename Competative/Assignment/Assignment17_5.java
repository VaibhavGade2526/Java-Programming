// Assignment 17 :- Q5
//write a program to print the mutiplication table of a number

class Logic
{
    void Multipiation(int num)
    {
        int iMutli =1;
        int iCnt = 0;
        for(iCnt=1;iCnt<=10;iCnt++)
        {
            iMutli = iCnt*num;

            System.out.println(iMutli);
        }
    }
}

class Assignment17_5 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.Multipiation(5);

    }
    
}
