public class fibonacchi {
    public static void main(String[] args) {
        int n = 10;
        int [] f= new int[n];

        f[0]= 0;
        f[1]=1;

        for(int i=2 ; i<n; i++){
            f[i]= f[i-1]+ f[i-2];
        }

        for(int element : f){
            System.out.println(element);
        }

    }

}
