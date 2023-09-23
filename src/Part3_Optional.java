public class Part3_Optional {
    public static void main(String[] args) {
        String str = "Hello";
        printString(str);
        System.out.println();
        printReverseString(str);
        System.out.println();
        System.out.println(getReverseString("String"));

    }

    public static void printString(String str){
        if (str.isEmpty()) {
            return;
        }
        System.out.println(str.charAt(0));
        printString(str.substring(1));
    }
    public static void printReverseString(String str){
        if (str.isEmpty()) {
            return;
        }
        System.out.println(str.charAt(str.length() - 1));
        printReverseString(str.substring(0, str.length() - 1));
    }
    public static String getReverseString(String str){
        if (str.isEmpty()) {
            return "";
        }
        System.out.print(str.charAt(str.length() - 1));
        return getReverseString(str.substring(0, str.length() - 1));
    }
}
