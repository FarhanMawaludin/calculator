import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Determinan");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        int rows = 0;
        int columns = 0;

        // Hanya minta input matriks jika pilihan adalah 1, 2, atau 3
        if (choice == 1 || choice == 2 || choice == 3) {
            System.out.print("Masukkan jumlah baris matriks: ");
            rows = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            columns = scanner.nextInt();

            System.out.println("Masukkan elemen-elemen matriks pertama:");
            matrix1 = MatrixOperations.readMatrix(scanner, rows, columns);
            System.out.println("Masukkan elemen-elemen matriks kedua:");
            matrix2 = MatrixOperations.readMatrix(scanner, rows, columns);
        }
        

        int[][] result;
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
                System.out.print("Masukkan jumlah baris matriks: ");
                rows = scanner.nextInt();
                System.out.print("Masukkan jumlah kolom matriks: ");
                columns = scanner.nextInt();

                System.out.println("Masukkan elemen-elemen matriks:");
                int[][] matrix = MatrixOperations.readMatrix(scanner, rows, columns);
                System.out.println("Matriks:");
                MatrixOperations.printMatrix(matrix);
                
                int determinan = MatrixOperations.determinan(matrix);
                if(matrix.length == 2){
                System.out.println("Determinan matriks adalah: " + determinan);
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
