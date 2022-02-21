public class Main {
    public static void main(String[] args){
        //test
        int arr[] = {1,2,3,4};
        int rcv[] = reverseArray(arr);
        for(int i=0; i<rcv.length; i++){
            System.out.println(rcv[i]);
        }
    }

    //reverse array without cloning
    public static int[] reverseArray(int array[]){
        int temp = 0;
        for(int i=0; i<array.length/2; i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        return array;
    }
}
