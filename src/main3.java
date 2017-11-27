public class main3 {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int max,min,num,i;
         max=-2147483648;
         min=2147483647;
         for(i=1;i<=10;i++) {
             num = sc.nextInt();
             if (num > max) {
                 max = num;
             }
             if (num < min) {
                 min = num;
             }
         }
             System.out.println(max + "is max number");
             System.out.println(min + "is min number");



    }
    }
