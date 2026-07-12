package ru.otus.java.basic.homeworks.homework14;

public class MainApplication {
    public static void main(String[] args) {
        String[][] stringMatrix = {
                {"10", "20", "30"},
                {"40", "50", "60"},
                {"70", "80", "90"}
        };
    }

    private static void sumConvertedInts(String[][] arr) {

        if (arr == null || arr.length != 4) {
            throw new AppArraySizeException("Ошибка: Массив должен иметь ровно 4 строки.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length != 4) {
                throw new AppArraySizeException("Ошибка: Длина строки " + i + " не равна 4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (AppArrayDataException e) {
                    System.out.println(e + " в ячейке" + arr[i][j]);
                }
            }
        }
        System.out.println(sum + " сумма всеъ элементов");
    }
}
