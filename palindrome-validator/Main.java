public class Main {
    public static void main(String[] args){
        //test
        String word = "level";
        System.out.println(isPalindrome(word));
    }

    //palindrome validator
    public static boolean isPalindrome(String input){
        boolean output = true;
        for(int i=0; i<input.length();i++){
            if(!(input.charAt(i)==input.charAt(input.length()-1-i)))
                output=false;
        }
        return output;
    }
}
