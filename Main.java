package HomeWork_2;

public class Main {
    static void AboutMe(String name, int age, String prof) {
        System.out.println("Я " + name + ", " + "мне " + age + " года. " + prof);
    }



    static void variable_types(){
        byte first = 127;
        short second = 32767;
        int third  = -2147483648;
        long fourth = 1;
        float fifth = 1.65f;
        double sixth = 9.99d;
        boolean seventh = true;
        char eighth = 13;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
        System.out.println(eighth);
    }

    public static void main(String[] args) {
        AboutMe("Хилькович Евгений", 33, " Пока что я джуниор тестировщик.");
        variable_types();

    }
}