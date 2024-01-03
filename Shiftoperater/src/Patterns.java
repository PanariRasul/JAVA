public class Patterns {
    public static void main(String[] args) {
        System.out.println("Wriete code for following Patterns using loops");
        System.out.println("==============================================================");

        /*
                * * * *
                * * * *
                * * * *
                * * * *
        */

        for(int j=1;j<=4; j++){
            for(int i=1;i<=4;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==========================================================================");
        /*
                    1 2 3 4
                    2 3 4 5
                    3 4 5 6
                    4 5 6 7

        */

        for(int p=1;p<=4;p++)
        {
            for(int r=0;r<=3;r++)
            {
                System.out.print(p+r+" ");
            }
            System.out.println();
        }

        System.out.println("=============================================================================");
        /*
                1 2 3 4
                2 3 4 1
                3 4 1 2
                4 1 2 3

        */


        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                int c=b+a-1;
                if(c>4)
                     c=c-4;
                System.out.print(c+" ");


            }
            System.out.println();
        }

        System.out.println("=================================================================================");

        /*
              e

      d==>       1 2 3 4
              1  * * * *
              2  *     *
              3  *     *
              4  * * * *

        */


        for(int d=1;d<=4;d++)
        {
            for (int e=1;e<=4;e++)
            {
                if(d==1 || d==4 || e==1 || e==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

//            String a ="My name is Jake.";
//            Boolean var;
//            var = a.startsWith("Jake");
//            System.out.println(var);
        }

    }
}
