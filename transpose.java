import java.util.Scanner;

public class transpose {
    int[][] a = new int[3][3]; // Correctly initialize the 2D array

    void getdata() {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix (3x3):");
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt(); // Correctly read input
            }
        }
    }

    void trans() {
        int[][] b = new int[3][3]; // Create a new array for the transposed matrix
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[j][i] = a[i][j]; // Correctly transpose the matrix
            }
        }

        System.out.println("Transposed Matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " "); // Print the transposed matrix
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        transpose bb = new transpose(); // Correctly instantiate the class
        bb.getdata();
        bb.trans();
    }
}
