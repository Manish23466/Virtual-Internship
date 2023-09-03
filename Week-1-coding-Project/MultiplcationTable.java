public class MultiplcationTable {
    public static void main(String[] args) {
        int tableno = 10;

        for (int i = 1; i <= tableno; i++) {
            for (int j = 1; j <= tableno; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}