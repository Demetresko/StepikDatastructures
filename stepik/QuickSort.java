package stepik;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import static jdk.nashorn.internal.objects.NativeString.search;

class QuickSort {

    static int pivot;
    static int quantity;
    static int [] begins;
    static int [] ends;

    static  ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println( );
        Scanner scanner = new Scanner(System.in);
        String numberOfSection = scanner.nextLine();
        String[]  temp = numberOfSection.split(" ");
        int number = Integer.parseInt(temp[0]); // количество отрезков
        quantity = Integer.parseInt(temp[1]); // количество точек


        begins = new int[number + 1]; // начало отрезков
        ends = new int[number + 1];   // конец отрезков

        for (int i = 0; i < number; i++) {
            String otrezok = scanner.nextLine();
            String[] string = otrezok.split(" ");
            String begin = string[0];
            String end = string[1];
            begins[i]=Integer.parseInt(begin);
            ends[i]=Integer.parseInt(end);

        }

        String[] tochki = scanner.nextLine().split(" ");

        for (int i = 0; i < quantity; i++) {
            pivot = Integer.parseInt(tochki[i]);

            int [] temp1 = Arrays.copyOf(begins , begins.length);
            int [] temp2 = Arrays.copyOf(ends   ,   ends.length);

            temp1[begins.length - 1 ]= pivot; // точка которая дана
            temp2[ends.length - 1]     = pivot; // в начало и в конец

            Arrays.sort(temp1);
            Arrays.sort(temp2);


            int a = searchLast(  temp1, pivot) ;  // количесвто левых границ не больше нашей координаты
            int b =  searchFirst(temp2 , pivot) ;// количесвто правых границ меньше нашей координаты
            result.add(a- b);
        }

        for (int i = 0; i < quantity ; i++) {
            System.out.print( result.get(i) +" ");
        }

    }


    static int searchFirst(int[] a, int x){ // первая встреча
      int l = -1;
      int r = a.length;
       // a[l] < x
        //  a[r] >= x
        while( r > l + 1){
          int m = (l + r) >> 1;
          if ( a[m] < x)
              l = m;
          else
              r = m;
        }

        if ( r < a.length && a[r] == x)
            return r ;
        else
            return -1;
    }


    static int searchLast(int[] e, int x) { // последняя встреча
        // a[l] <= x
        // a[r] > x
        int l = -1;
        int r = e.length;

        while( r > l + 1){
            int m = (l + r) >> 1;
            if ( e[m] <= x)
                l = m;
            else
                r = m;
        }

        if ( l >= 0 && e[l] == x)
            return l ;
        else
            return -1;

    }



//    static void qsort (int b, int e)
//    {
//        int l = b, r = e;
//        int piv = arr.get(l+(r-l)/3);
//        // Опорным элементом для примера возьмём средний
//
//        while (l <= r)
//        {
//            while (arr.get(l) < piv)
//                l++;
//            while (arr.get(r) > piv)
//                r--;
//            if (l <= r)
//            {
//                int temp = arr.get(l);
//                arr.set(l,arr.get(r));
//                arr.set(r,temp);
//                l++;
//                r--;
//            }
//                //swap (arr[l++], arr[r--]);
//        }
//        if (b < r)
//            qsort (b, r);
//        if (e > l)
//            qsort (l, e);
//    }    /* ----- end of function qsort ----- */



}
