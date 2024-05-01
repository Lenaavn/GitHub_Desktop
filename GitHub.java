public class GitHub {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numero : numeros) {
            switch (numero) {
                case 1:
                    System.out.println("L");
                    break;
                case 2:
                    System.out.println("E");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("N");
                    break;
                case 5:
                    System.out.println("D");
                    break;
                case 6:
                    System.out.println("R");
                    break;
                case 7:
                    System.out.println("O");
                    break;
                default:
                    System.out.println(" ");
                    break;
            }
        }
    }
}
