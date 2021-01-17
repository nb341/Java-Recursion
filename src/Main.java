public class Main {
    public static void main( String [] args){

         int [] A = {1, 2, 3, 4,99,  5, 6, 7, 8};
//         int r = A.length;
//        System.out.println(binarySearch(A, 0, r-1, 20 ));

       //  printSymbol(5, "$");

      // System.out.println(sumSquares(3));

      //  System.out.println(sumDigits(5132));
        System.out.println(power(2,30));

    }

    public static int binarySearch(int [] A, int l, int r, int val){

        if(r>=l){
            int m = l + (r-l)/2;
            if(A[m]==val)
                return m;
            if(A[m]>val)
                return binarySearch(A, l, m-1, val);
            //if value in right sub array
            return binarySearch(A, m+1, r, val);

        }
        return -1;
    }
    public static void printSymbol(int x, String s){
        if(x==0) return;
        System.out.print(s);
        printSymbol(x-1, s);
    }

    public static int sumSquares(int x){
        if(x==0) return 0;
        return (x*x)+sumSquares(x-1);
    }

    public static int sumDigits(int x){
        if(x%10==0) return 0;
        return sumDigits(x/10) + (x%10);
    }

    public static int sumValues(int A[], int i){
        if(i==A.length) return 0;
        return A[i] + sumValues(A, i+1);
    }

    public static int sumOdd(int A[], int i){
        if(i==A.length) return 0;
       return A[i]%2!=0 ?  A[i] + sumOdd(A, i+1) : sumOdd(A, i+1);
    }

    public static String binary(int x){
        if(x/2==0 && x%2==0) return "";
        return binary(x/2) + x%2;
    }
    public static void printReverse(int x){
        if(x==0) return;
        System.out.print(x%10);
        printReverse(x/10);
    }

    static int numberDigits(int x){
        if(x%10==0) return 0;
        return 1 + numberDigits(x/10);
    }

    static int largest(int [] A, int i){
         if(i==A.length) return Integer.MIN_VALUE;
         return Math.max(A[i], largest(A, i+1));
    }

    static int power(int base, int exp){
        if(exp==0) return 1;
        return base*power(base, exp-1);
    }
}
