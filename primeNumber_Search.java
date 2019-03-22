import java.util.Scanner;
//Copyright@Leeinsn
//2019/3/3 18:12
public class primeNumber_Search {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入一个大于0的数");
        int num=reader.nextInt();
        while(num<=0){
            System.out.println("您的输入不在范围内，请输入大于0的数");
            num=reader.nextInt();
        }
        int k=1;
        if(num==1){
            System.out.println(num+"内没有质数");
        System.out.println("共计0个");
        }
        else{
            if(num==2) {
            System.out.println(num + "以内的质数有" + num);
            System.out.println("共计1个");
        }
            else{
                System.out.println(num+"以内的质数有:");
                System.out.print("2 ");
                int j;
                for(j=3;j<=num;j++){
                int i;
                for(i=2;i<=j-1;++i){
                    if(j%i==0)break;
                }
                if(i==j){
                    System.out.print(j+" ");
                    k++;}
            }
            System.out.println();
            System.out.println("共计"+k+"个");
        }
    }
    }
}
