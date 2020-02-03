public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr2D=new int[4][4];
        int value=5;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                arr2D[i][j]=value++;
            
            }            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(arr2D[i][j]+"\t");
            
            } 
            System.out.println("");   

        }
    }
}