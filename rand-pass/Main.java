public class Main {
    public static void main(String[] args){
        //test
        System.out.println(genRandPass(8));
    }

    //generate random password
    //receives max length of the password
    public static String genRandPass(int limit){
        String password = "";
        for(int i=0; i<limit; i++){
            int index = (int)(33+Math.random()*(94));
            password+=(char)index;
        }
        return password;
    }
}
