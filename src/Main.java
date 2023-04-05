

public class Main {
    public static void main(String[] args) {
// 1. Какие есть способы создания объекта String? Где он создается?
// 2. Дайте определение классу в Java.
//        Задача:
//    Дан массив строк, необходимо удалить из него все дубли,
//    оставшиеся строки объединить в одну в порядке следования в массиве.
//
//        String string = "строка";
//        String string1 = new String("строка");
////        String string1 = "строка";
//        System.out.println(string == string1);
//
//        Course javaInt = new Course("Java Intense", 20);
//        javaInt.printName();
    

    String[] strings = {"I", "need", "some", "some", "sleep", "some", "I"};
        String unitedString = "";
        for (int string = 0; string < strings.length; string++) {
            for (int indexString = string + 1; indexString < strings.length; indexString++) {
                if (strings[string].equals(strings[indexString])) {
                    strings[indexString] = strings[indexString].replace(strings[indexString], "");
                }
            }
            if (!strings[string].isBlank()) {
                unitedString+= strings[string] + " ";
            }

//            unitedString = unitedString + strings[string] + " ";
        }
        System.out.println(unitedString);

    }
}