public class Main {
    public static void main(String[] args){
        //test
        String matrix[][] ={{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        System.out.println(isSymmetric(matrix));
    }

    //validates symmetric matrix
    public static boolean isSymmetric(String matrix[][]){
        boolean report = true;
        boolean h = true;
        boolean v = true;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                //horizontal similarities
                if(!(matrix[i][j].equals(matrix[i][matrix[0].length-1-j])))
                    h=false;
                //horizontal similarities
                if(!(matrix[i][j].equals(matrix[matrix.length-1-i][j])))
                    v=false;
            }
        }
        report= h || v;
        return report;
    }
}
