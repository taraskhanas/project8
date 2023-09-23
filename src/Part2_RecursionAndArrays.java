public class Part2_RecursionAndArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0);
        System.out.println();
        System.out.println(arraySum(array, 0));
        System.out.println(arrayContains(array, 2, 0));
    }

    public static void printArray(int[] array, int i){
        if(i < array.length) {
            System.out.printf("%d ", array[i]);
            printArray(array, i + 1);
        }
    }

    public static int arraySum(int[] array, int i){
        if (i == array.length) {
            return 0;
        }
        int sum = array[i];
        return sum + arraySum(array, i + 1);
    }

    public static int arrayContains(int[] array,int value, int i){
        if (i == array.length) {
            return 0;
        }
        int count;
        if(array[i] == value) {
            count = 1;
        }
        else {
            count = 0;
        }
        return count + arrayContains(array, value, i + 1);
    }
}
