/**
 * Author: samsung
 * Date: 03/12/2019
 * Email: sn_leeho@foxmail.com
 **/
interface Usb{
    String work();
    public void show();
}
class UsbMouse implements Usb{
    String state;
    public String work(){
        state="鼠标开始工作了！你可以移动鼠标了！";
        return state;
    }
    public void show(){
        System.out.println(state);
    }
}
class UsbKeyboard implements Usb{
    String state;
    public String work(){
        state="键盘开始工作了！你可以敲字了！";
        return state;
    }
    public void show(){
        System.out.println(state);
    }
}
public class UsbTest {
    public static void main(String[] args){
        Usb mouse=new UsbMouse();
        mouse.work();
        mouse.show();
        Usb keyboard=new UsbKeyboard();
        keyboard.work();
        keyboard.show();
    }
}
