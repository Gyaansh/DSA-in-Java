public class pattern {

    public static void main(){

        //Hollow square/Rectangle
        // * * * * *
        // *       *
        // *       *
        // * * * * *
    //     int h=5 , w = 4;
    //     for (int i = 0; i < h; i++) {
    //         for (int j = 0; j < w; j++) {
    //             if ((i==0 || i==h-1) || ((j==0) || j==w-1)) {
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }


    //       *
    //     * *
    //   * * *
    // * * * *

    // int h = 4;
    // for (int i = 0; i < h; i++) {
    //     for (int j = 0; j < h-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 0; j <= i; j++) {
    //         System.out.print(" *");
    //     }
    //     System.out.println();
    // }
    

    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2 
    //1
    // int h = 7;
    // for (int i = 0; i <= h; i++) {
    //     for (int j = 1; j <= h-i; j++) {
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }

    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14

    // int h = 5 , c=1;
    // for (int i = 0; i <= h; i++) {
    //     for (int j = 0; j <= i; j++) {
    //         System.out.print(c + " ");
    //         c++;
    //     }
    //     System.out.println();
    // }
    

    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    // int h=5;
    // for (int i = 1; i <= h; i++) {
    //     for (int j = 1; j <= i; j++) {
    //         if ((i+j)%2==0) System.out.print("1 ");
    //         else System.out.print("0 ");
    //     }
    //     System.out.println();
    // }


    // BUTTERFLY PATTERN
    // *             *
    // * *         * *
    // * * *     * * *
    // * * * * * * * *
    // * * * * * * * *
    // * * *     * * *
    // * *         * *
    // *             *
    // int h = 4;
    // for (int i = 1; i <= h; i++) {
    //     for (int j = 0; j < i; j++) {
    //         System.out.print(" *");
    //     }
    //     for (int j = 0; j <= (h*(h-i)); j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 0; j < i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for (int i = h; i >= 1; i--) {
    //     for (int j = 0; j <= i-1; j++) {
    //         System.out.print(" *");
    //     }
    //     for (int j = (h*(h-i)); j > 0; j--) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 0; j <= i-1; j++) {
    //         System.out.print(" *");
    //     }
    //     System.out.println();
    // }

    //         * * * * 
    //       * * * * 
    //     * * * * 
    //   * * * * 
    // * * * * 
    // int h = 5;
    // for (int i = 0; i < h; i++) {
    //     for (int j = 1; j <= h-i; j++) {
    //         System.out.print(" ");
    //     }
    //     for (int j = 0; j < 4; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }


    //         * * * * 
    //       *     * 
    //     *     * 
    //   *     * 
    // * * * * 

    int h = 5;
    for (int i = 0; i < h; i++) {
        for (int j = 1; j <= h-i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 4; j++) {
            if (((i==0) || (i==h-1)) || ((j==0) || (j==3)))
            System.out.print("* ");
            else System.out.print("  ");
        }
        System.out.println();
    }
    
    }
}