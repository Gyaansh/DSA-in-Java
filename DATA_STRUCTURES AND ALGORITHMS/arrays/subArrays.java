//With sum
public class subArrays {

    public static void subArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.print("\tSum = "+sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5};
        int[] arr = new int[5];
        arr = new int[] {1,2,3,4,5};
        subArray(arr);
    }
}
//without sum
// public class subArrays {

//     public static void subArrays(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 for (int k = i; k < j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         subArrays(arr);
//     }
// }
