import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");
        // Объявите три массива:
        // 1.Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        // 2.Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        // 3.Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] first = new int[]{1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();

        double[] second = {1.57, 7.654, 9.986};
        for (int i = 0; i <= 2; i++) {
            System.out.print(second[i] + " ");
        }
        System.out.println();

        int[] third = new int[4];
        third[0] = 3;
        third[1] = 6;
        third[2] = 9;
        third[3] = 12;
        for (int i = 0; i <= 3; i++) {
            System.out.print(third[i] + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        int[] first = new int[]{1, 2, 3};
        {
            for (int i = 0; i < 3; i++) {
                if (first[i] != 3)
                    System.out.print(first[i] + ", ");
                else
                    System.out.print(first[i]);
            }
            System.out.println();
        }

        double[] second = {1.57, 7.654, 9.986};
        {
            System.out.println(Arrays.toString(second));
        }

        int[] third = new int[]{3, 6, 9, 12};
        {
            System.out.println(Arrays.toString(third));
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        //Если в задаче № 2 в консоль у вас вывелся результат:
        //1, 2, 3
        //1.57, 7.654, 9.986
        //// произвольные элементы третьего массива
        //то в этой задаче результат должен быть таким:
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// произвольные элементы третьего массива в обратном порядке
        int[] first = new int[]{1, 2, 3};
        {
            for (int i = first.length; i >= 0; i--) {
                System.out.println(Arrays.toString(first));
            }
        }

        double[] second = {1.57, 7.654, 9.986};
        {
            for (int i = second.length; i >= 0; i--) {
                System.out.println(Arrays.toString(second));
            }
        }
        int[] third = new int[]{3, 6, 9, 12};
        {
            for (int i = third.length; i >= 0; i--) {
                System.out.println(Arrays.toString(third));
            }
        }

    }


    public static void task4() {
        System.out.println("Task 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.
        int[] first = new int[]{1, 2, 3};
        for (int i = 0; i < 2; i++) {
            if (i % 2 == 0) {
                System.out.print(first[i]+1+" ");
            } else {
                System.out.println(first[i]);
            }
        }
    }
}
