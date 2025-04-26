public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Знаходить максимальне значення в масиві")
    @Author(firstName = "Іван", lastName = "Петренко")
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;

            }

        }

        return max;

    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Знаходить мінімальне значення в масиві")
    @Author(firstName = "Олена", lastName = "Коваленко")
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;

            }

        }
        return min;

    }

}