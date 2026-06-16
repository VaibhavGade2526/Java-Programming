// Assignment 18 :- Q2
// write a program to Display the grade of a student based on marks

class Logic
{
     void DisplayGrade(int num)
     {
        if(num >= 90)
        {
            System.out.println("A Grade");
        }
        else if(num>=80)
        {
            System.out.println("B Grade");
        }
        else if (num>=75) 
        {
           System.out.println("C Grade");   
        }
        else if(num>=45)
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("Fail");
        }
          
     }
}

class Assignment19_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(96);
        
    }
    
}

