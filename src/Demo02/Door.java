package Demo02;

/**
 * @author huxiaomei
 * @date 2021/4/29 11:12
 */
public interface Door {
    String des = "是个门，注意安全";
    //方法的声明 （签名）
    public void open();

    public void close();

    public default void test01(){
        System.out.println("接口中的默认测试方法");
    }
    public static void test02(){
        System.out.println("接口中的静态方法");
    }

}
