package Demo;

/**
 * @author huxiaomei
 * @date 2021/4/29 10:18
 */
public class KeypadDoor extends Door {
    public void open(){
        System.out.println("按键盘输入密码开门");
    }
    public void close(){
        System.out.println("拉上即可关门");
    }
}
