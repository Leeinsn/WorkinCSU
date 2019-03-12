/**
 * Author: samsung
 * Date: 03/12/2019
 * Email: sn_leeho@foxmail.com
 **/
class Person{
    String firstName;
    String lastName;
    public void display(){

    }
}
class Englishmen extends Person{
    public Englishmen(String lastName,String firstName){
        super.firstName=firstName;
        super.lastName=lastName;
    }

    @Override
    public void display() {
        System.out.println(firstName+"."+lastName);
    }
}
class Chinese extends Person{
    public Chinese(String lastName,String firstName){
        super.firstName=firstName;
        super.lastName=lastName;
    }

    @Override
    public void display() {
        System.out.println(lastName+""+firstName);
    }
}
public class PersonTest {
    public static void main(String[] args){
        Chinese man1=new Chinese("欧阳","明日");
        man1.display();
        Englishmen man2=new Englishmen("Ouyang","Mingri");
        man2.display();
    }
}
