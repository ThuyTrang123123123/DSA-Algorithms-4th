public class Main {
    public static void main(String[] args) {
        boolean[][] a = {
                {true, false, false, true},
                {false, false, false , true},
                {true, false, true, true}
        };

        int num_row = a.length;
        int num_col = a[0].length;
        // print column numbers
        System.out.print("  ");
        for (int i = 0; i < num_col; i++)
            System.out.print(i + " ");
        System.out.println();
        // print row numbers and row values
        for (int i = 0; i < num_row; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < num_col; j++) {
                if (a[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
