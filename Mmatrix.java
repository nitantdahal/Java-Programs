public class Mmatrix {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2},{2,3}};
        int[][] mat2 = {{3,4},{4,2}};
        int[][] mat3 = new int[2][2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];                    
                }
            }
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
