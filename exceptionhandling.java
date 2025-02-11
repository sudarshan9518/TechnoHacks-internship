public class exceptionhandling {
    public static void exetion(){
        for(int i =10 , j=1; i>=0; i--, j++){
            try
            {
            int result = i/0;
            System.out.println(j+" = "+ result);}
            catch (Exception e) {

                System.out.println("not possible to divide by 0");
                break;
            }



        }
    }
    public static void main(String[] args) {
        exetion();


    }
}
