package test2;

import java.util.ArrayList;

public class q2 {

    public static void merge(int[] arr, int left, int mid, int right){
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int l[] = new int[size1];
        int r[] = new int[size2];

        for(int i = 0; i < size1; i++){
            l[i] = arr[left + i];
        }
        for(int i = 0; i < size2; i++){
            r[i] = arr[mid + 1 + i];
        }
        int p1 = 0;
        int p2 = 0;
        int k = left;

        while(p1 < size1 && p2 < size2){
            if (l[p1] < r[p2]){
                arr[k] = l[p1];
                p1 += 1;

            }
            else{
                arr[k] = r[p2];
                p2 += 1;
            }
            k += 1;
        }

        while(p1 < size1){
            arr[k] = l[p1];
            p1 += 1;
            k += 1;
        }

        while(p2 < size2){
            arr[k] = r[p2];
            p2 += 1;
            k += 1;
        }
    }

    public static void mergetSort(int[] arr, int left, int right){
        if (left < right){

            int mid = (left + right) / 2;
            mergetSort(arr, left, mid);
            mergetSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
 
        }
    }

    public static void printList(int[] list){
        for (int ele : list){
            System.out.print(ele);
            System.out.print(',');
        }

        System.out.println();
    
    }
    public static void main(String[] args) {

        int[] arr = {1650, 1045, 1890, 1456, 2013, 2456,1458, 2548, 1254, 1462, 2365, 1456, 2165, 1457};

        System.out.println("Before Sorting: ");
        System.out.println("===============");
        printList(arr);
        System.out.println();

        mergetSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: ");
        System.out.println("===============");
        printList(arr);


        
    }
    
}
