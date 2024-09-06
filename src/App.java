public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("age programme");
        int age = 45;
            if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }

             System.out.println("Press space to exit.");

             if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
            }
            else if (age >= 65)
            {
                 System.out.println("You are retired.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }  
            if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
                if (age >= 15)
                    {
                     System.out.println("You can drive a moped.");
                    }
            }
            else if (age >= 65)
            {
                 System.out.println("You are retired.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }

            if (age == 18)
            {System.out.println("you can drive a car");}
            else
        {System.out.println("you can not drive");}

        if (age< 130 && age%10==0)
        {System.out.println("anniversary party");}
        else
        {System.out.println("sorry");}

        if(age==100)
    {
        for(int i=0;i<3;i++)
    {System.out.println("congratulations!");}
    }
if (age>40 && age<50)
{System.out.println("happy mid-life");}
    }
}
