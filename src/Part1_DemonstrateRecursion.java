import org.w3c.dom.ls.LSOutput;

public class Part1_DemonstrateRecursion {
    public static void main(String[] args) {
        countdown(9, 1);
        System.out.println("");
        countup(9);

    }

    public static void countup(int n){
        if(n > 0){
            System.out.printf("%d ", n);
            countup(n - 1);
        }
    }

    public static void countdown(int n, int i){
        if(i <= n){
            System.out.printf("%d ", i);
            countdown(n,i + 1);
        }
    }
}
