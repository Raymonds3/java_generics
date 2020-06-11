public class GenericClass<T> {
    private T type;

    public GenericClass(T type) {
        this.type = type;
    }

    public static <T> void ArrayContent(T[] type) {
     for (T i : type) {
         System.out.println(i);
     }
        System.out.println();
    }

    public static void main(String[] Args){
        Integer[] intArray = { 12, 324, 6, 7900 };
        String[] stringArray = { "Raymond", "Thabo", "Siya", "John", "Skhumba" };

        System.out.println("Integer Array Contains:");
        ArrayContent(intArray);

        System.out.println("String Array Contains:");
        ArrayContent(stringArray);

        GenericClass<String> string = new GenericClass<String>("Test");
        System.out.println(string.type);

        GenericClass<Integer> number = new GenericClass<Integer>(1000);
        System.out.println(number.type);
    }
}
