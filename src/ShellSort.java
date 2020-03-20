

public class ShellSort {
    public static void main(String[] args) {
        //create and fill array
        int[] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        //sort
        int d = arr.length/2;
        while (d>0) {
            for (int i = 0; i < arr.length-d; i++) {
                int j = i;
                while(j>=0 && arr[j]>arr[j+d]) {
                    int temp = arr[j];
                    arr[j] = arr[j+d];
                    arr[j+d] = temp;
                    j--;
                }
            }
            d = d/2;
        }

        //print sorted array
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
