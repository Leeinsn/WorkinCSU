import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Author: samsung
 * Date: 03/11/2019
 * Email: sn_leeho@foxmail.com
 **/
class isHave{
    public boolean isHave(String str,int n){
        boolean P=false;
        boolean A=false;
        boolean T=false;
        for(int i=0;i<=n;i++){
            if('P'==str.charAt(i))P=true;
            if('A'==str.charAt(i))A=true;
            if('T'==str.charAt(i))T=true;
            if(str.charAt(i)!='P'&&str.charAt(i)!='A'&&str.charAt(i)!='T'){
                P=false;
                break;
            }
        }
        return P&A&T;
    }
}
public class Patest_1003 {
    public static void main(String[] args)throws IOException {
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        String[] vocab=new String[num];
        boolean[] YN=new boolean[num];
        for(int i=0;i<=num-1;i++){
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            vocab[i]=buf.readLine();
            isHave my=new isHave();
            for(int k=0;k<=vocab[i].length()-1;k++){
                YN[i]=my.isHave(vocab[i],vocab[i].length()-1);
            }
        }
        for(int i=0;i<=YN.length-1;i++){
            if(YN[i]==true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
