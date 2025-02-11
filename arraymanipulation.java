public class arraymanipulation {
    public static void bubble_search(int arr[]){

     for(int i=0; i<arr.length-1;i++){
         int counter =0 ;
         for(int j =0; j<arr.length-1-i;j++){
             if(arr[j]<arr[j+1]){
                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]= temp;
                 counter ++;
              //   System.out.println("hi");
             }
         }
         if(counter==0){
             break;
         }

     }

 }

 public static void bubble(int arr[]){
     for(int i =0;i<arr.length;i++){
         System.out.print(arr[i]+ " ");
     }

 }

    public static void main(String[] args) {
        int arr[]= {4,5,558,55,56,54,122,5,5525,2};
 bubble_search(arr);
 bubble(arr);
    }
}