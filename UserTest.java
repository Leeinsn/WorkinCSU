/**
 * Author: samsung
 * Date: 03/12/2019
 * Email: sn_leeho@foxmail.com
 **/
class User{
    private String username;
    private String password;
    private int age;
    private String gender;
    public User(){
        this("admin","123456",23,"男");
    }
    public User(String name,String pass,int a,String gen){
        username=name;
        password=pass;
        age=a;
        gender=gen;
    }
    public void info(){
        System.out.print("本用户的用户名为："+username+",密码为："+password+",年龄为："+age+",性别为："+gender);
    }
}
public class UserTest{
    public static  void main(String[] args){
        User person=new User();
        person.info();
    }
}