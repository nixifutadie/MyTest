package quicksort;

import java.util.Arrays;

public class quickSort {

    public static int[] sort(int[] a,int L,int R){

        int i = L;
        int j = R;
        int index =  (L+R)/2;
       /* if ((L+R)%2!=0){
             index = (L+R)/2+1;
        }else {
            index = (L+R)/2;
        }*/
        int pivot = a[index];


        while (i<=j){

            while (pivot>a[i]){
                i++;
            }

            while (pivot<a[j]){
                j--;
            }

            if (i<=R){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }
        System.out.println(Arrays.toString(a));

        if (L<j){
            sort(a,L,j);
        }

        if (i<R){
            sort(a,i,R);
        }

        return a;
    }


    public static void main(String[] args) {
        int[] a = {1,4,5,67,2,7,8,6,9,44,4,67,3};
        int[] sort = sort(a, 0, 12);
        /*System.out.println(Arrays.toString(sort));*/
    }


}
