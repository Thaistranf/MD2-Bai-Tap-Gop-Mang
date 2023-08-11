import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các phần tử mảng 1:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập các phần tử mảng 2:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[11];
        for (int i = 0; i < 5; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < 6; i++) {
            arr2[arr.length + i] = arr1[i];
        }
        System.out.print("Result:\t");
        for (int x : arr2){
            System.out.print(x + "\t");
        }
    }
}