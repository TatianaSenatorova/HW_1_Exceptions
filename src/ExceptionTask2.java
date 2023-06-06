//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен частному элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя. Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTask2{
    public static void main(String[] args) {
        int[] array1 = { 4, 5, 6, 7};
        int[] array2 = {3, 3, 2, 0};
        System.out.println("Первый массив " + Arrays.toString(array1));
        System.out.println("Второй массив " + Arrays.toString(array2));
        System.out.println("Разница " + difference(array1, array2));
        System.out.println("Частное" + divide(array1, array2));
    }

    public static ArrayList<Integer> difference(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();

        if (a1.length < 1 || a2.length < 1) {
            throw new RuntimeException("один или оба массива пусты");
        }
        if (a1.length != a2.length) {
            throw new RuntimeException("Длинны массивов не равны");
        }
        for (int i = 0; i < a1.length ; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }

    public static ArrayList<Float> divide(int[] a1, int[] a2) {
        ArrayList<Float> res = new ArrayList<>();

        if (a1.length < 1 || a2.length < 1) {
            throw new RuntimeException("один или оба массива пусты");
        }
        if (a1.length != a2.length) {
            throw new RuntimeException("Длинны массивов не равны");
        }
        for (int i = 0; i < a1.length; i++) {
            if (a2[i] != 0) {
                res.add((float) (a1[i] / a2[i]));
            } else {
                throw new RuntimeException("Деление на ноль");
            }
        }
        return res;
    }
}
