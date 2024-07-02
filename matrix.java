import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Determinan");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        
        

        if(choice != 4){
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int column = scanner.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    
        System.out.println("Masukkan elemen-elemen matriks pertama:"); 
        int[][] matrix1 = MatrixOperations.readMatrix(scanner, rows, column);
        System.out.println("Masukkan elemen-elemen matriks kedua:");
        int[][] matrix2 = MatrixOperations.readMatrix(scanner, rows, column);
        System.out.println("Matriks pertama:");
        MatrixOperations.printMatrix(matrix1);
        System.out.println("Matriks kedua:");
        MatrixOperations.printMatrix(matrix2);

        int[][] result;
        int hasil;
        switch (choice) {
            case 1:
                result = MatrixOperations.addMatrices(matrix1, matrix2);
                System.out.println("Hasil penjumlahan matriks:");
                MatrixOperations.printMatrix(result);
                break;
            case 2:
                result = MatrixOperations.subtractMatrices(matrix1, matrix2);
                System.out.println("Hasil pengurangan matriks:");
                MatrixOperations.printMatrix(result);
                break;
            case 3:
                result = MatrixOperations.multiplyMatrices(matrix1, matrix2);
                System.out.println("Hasil perkalian matriks:");
                MatrixOperations.printMatrix(result);
                break;
            case 4:
                
            default:
                System.out.println("Pilihan tidak valid.");
            }
        }else {
            System.out.print("Masukkan jumlah baris matriks: ");
            int rows = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            int column = scanner.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Masukkan elemen-elemen matriks pertama:"); 
            int[][] matrix = MatrixOperations.readMatrix(scanner, rows, column);
            System.out.println("matriks : ");
            MatrixOperations.printMatrix(matrix);
            int hasil = MatrixOperations.determinan(matrix);
            System.out.println("Determinan matriks adalah: " + hasil);
                
        }
        scanner.close();
    }
}
