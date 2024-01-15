public class Main3 {
    public static void main(String[] args) {


        for (int j = 1; j < 20; j++) {
            int n = j;
            int sum = 0;
            int n1 = n;
            int count = 0;
            System.out.println("n="+n+"时 ");
            for (int i = 0;  i<30; i++) {
                while (true) {
                    int a = n%10;
                    sum += a*a;
                    n /= 10;
                    if (n == 0){break;}
                }
                System.out.print(sum+" ");
                if (sum==n1*n1){
                    count++;
                }
//            if (sum==1){break;}
//            if (count==2){break;}
                n = sum;
                sum=0;
            }
            System.out.println();
        }


    }

}
