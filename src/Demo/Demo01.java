package Demo;

/**
 * @author huxiaomei
 * @date 2021/4/29 10:22
 */
public class Demo01 {
    public static void main(String[] args) {
        KeypadDoor keypadDoor = new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();

        PowerDoor powerDoor = new PowerDoor();
        powerDoor.open();
        powerDoor.close();


        Door door = new Door(){
            @Override
            public void open() {
                System.out.println("临时实现的开门方法");
            }

            @Override
            public void close() {
                System.out.println("临时实现关门方法");
            }
        };

        door.open();
        door.close();
    }
}
