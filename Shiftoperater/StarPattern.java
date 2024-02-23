public class StarPattern {

    public static void main(String[] args) {

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

        }



    }
}
