public class palindrome {
    public static boolean palindrome(String name){

        int length= name.length()-1;
        String newname = "";


        for(int i =length; i>=0; i--){
            newname += name.charAt(i);

        }
        if(name.equals(newname)){
            return true;
        }
        else {
            return false;
        }





    }
    public static void main(String[] args) {
        String name = "sudarshan";
        boolean result =  palindrome(name);
        if(result){
            System.out.println(name + " is a palindrome");
        }
        else{
            System.out.println(name + " is not a palindrome");
        }


    }
}
