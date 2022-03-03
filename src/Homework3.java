public class Homework3 {
    public static void main(String[] args) {

//Задание 1
        int[] mass1 = {1, 0, 1, 1, 1, 1, 1, 0};

        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (mass1[i] - 1) * -1;

            System.out.println(mass1[i]);
        }

//Задание 2
        int[] mass2 = new int[100];

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = i + 1;
            System.out.println(mass2[i]);
        }

//Задание 3
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) {
                mass3[i] = mass3[i] * 2;
            }
            System.out.println(mass3[i]);
        }

//Задание 4
        int[][] mass4 = new int[10][10];
        System.out.print(mass4);
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0; j < mass4[i].length; j++) {
                mass4[i][j] = 1;
                System.out.println(mass4);
            }

        }
    }

    //Задание 5
    static public int[] array(int len, int initialValue) {
        len = 10;
        initialValue = 3;
        int[] mass5 = new int[len];
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = initialValue;
        }
        return mass5;
    }
}

