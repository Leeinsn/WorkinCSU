import java.util.Scanner;
//此程序为求(-1)^(n-1)*1/n!
public class mathSum_1 {
    public static void main(String[] args){
        System.out.println("请输入n的值：");
        Scanner var=new Scanner(System.in);
        int n=var.nextInt(); //n为全局变量
        int[] array=new int[n];
        for(int i=0;i<=n-1;i=i+2){
            array[i]=1;
        }
        for(int i=1;i<=n-1;i=i+2){
            array[i]=(-1);
        }//先求出前半部分，即-1次方的值
        double[] stair=new double[n];
        for(int m=0;m<=n-1;m++){
            stair[m]=1;
        }
        for(int k=1;k<=n;k++) {
            for (int j = 1; j <= k; j++) {
                stair[k-1]=stair[k-1]*j;
            }
        }
        for(int m=0;m<=n-1;m++){
            stair[m]=1/stair[m];
        }
        double[] sum=new double[n];
        for(int m=0;m<=n-1;m++){
            sum[m]=array[m]*stair[m];
        }
        for(int m=1;m<=n-1;m++){
            sum[0]=sum[0]+sum[m];
        }
        System.out.println("(-1)^(n-1)*1/n!迭代后的值为："+sum[0]);
        }
    }

