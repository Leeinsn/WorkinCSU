/**
 * Author: samsung
 * Date: 03/06/2019
 * Email: sn_leeho@focmail.com
 **/
public class $redBall_Sort {
    public static void main(String[] args){
        int[] ball=new int[30];
        for(int i=0;i<=ball.length-1;i++){
            ball[i]=i+1;
        }
        int i=0,circle=13,total=30,cal=0;
        System.out.println("红球摆放的顺序应该是：");
        do{
            i=i+(circle-1);  //根据顺序来输出第十三个
            if(i>=total){    //当第i个大于总数时，i的值减去总数
                i=i-total;
            }
            System.out.print("  "+ball[i]); //打印出第i个球的数
            for(int j=i;j<total-1;j++){
                ball[j]=ball[j+1];  //输出的i以后的数都向前移一位
            }
            total--;
            cal++;
        }while(cal<=14);
    }
}
