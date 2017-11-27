public class main1 {
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int a=sc.nextInt();
        if(a>=3&&a<=5)
        {
            System.out.println("春天");
        }
        else{
            if(a>=6&&a<=8)
            {
                System.out.println("夏天");
            }
            else{
                if(a>=9&&a<=11)
                {
                    System.out.println("秋天");
                }
                else{
                    System.out.println("冬天");
                }
            }

        }

    }
}
