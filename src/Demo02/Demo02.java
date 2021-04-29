package Demo02;

/**
 * @author huxiaomei
 * @date 2021/4/29 11:17
 */
public class Demo02 {
    public static void main(String[] args) {
        KeypadDoor keypadDoor = new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();
        keypadDoor.test01();
       //keypadDoor.test02();
        //Door.test01();
        Door.test02();

        PowerDoor powerDoor =new PowerDoor();
        powerDoor.open();
        powerDoor.close();
    }
}
