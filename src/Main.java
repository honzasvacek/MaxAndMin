public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,5,8,9,0,5,99,6666,2,1,0,5,88,2};
        int result[] = MaxAndMin(arr);
        System.out.println("minimum is: " + result[0]);
        System.out.println("maximum is: " + result[1]);

    }
    public static int[] MaxAndMin(int arr[]){
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return new int[] {min, max};
    }
}