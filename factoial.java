public class factoial {

    public static int facto(int n ){
        if(n==0){
            return 1;
        }

        int factoriall= n * facto(n-1);
        return factoriall;
    }



    public static void main(String[] args) {
        int  n = 5;
        System.out.println(facto(n) );

    }
}
