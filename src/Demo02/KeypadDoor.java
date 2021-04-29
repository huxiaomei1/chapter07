package Demo02;

/**
 * @author huxiaomei
 * @date 2021/4/29 11:15
 */
public class KeypadDoor implements Door{


    @Override
    public void open() {
        System.out.println("键盘门打开");
    }

    @Override
    public void close() {
        System.out.println("键盘门关闭");

    }
}
