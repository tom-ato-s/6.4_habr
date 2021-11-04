// Пример из заданий https://habr.com/ru/post/440436/

//программа как фильтр, который меняет входное значение,
//только с помощью интерфейса Funtion меняет входной массив и отдает измененный


import java.util.function.Function;

public class Funtion_6_4 {


    public static void main(String[] args) {
        Integer[] square = new Integer[100];
        fill(square, integer -> integer * integer);
    }

    public static <T> void fill(T[] objects, Function<Integer, ? extends T> funtion){
        for(int i = 0; i < objects.length; i++) {
            objects[i] = funtion.apply(i);
        }
    }
}
