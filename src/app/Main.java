import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Тип повернення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.firstName() + " " + author.lastName());
                System.out.println("----------------------------");

            }

        }

        int[] numbers = {3, 5, 7, 2, 9};
        System.out.println("Максимальне число: " + ArrayUtils.findMax(numbers));
        System.out.println("Мінімальне число: " + ArrayUtils.findMin(numbers));

    }

}