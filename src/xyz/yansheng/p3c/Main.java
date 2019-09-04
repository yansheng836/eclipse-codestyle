package xyz.yansheng.p3c;

/**
 * @author yansheng
 * @date 2019/09/04
 */
public class Main {

    /**
     * @param args 参数
     */
    public static void main(String[] args) {
        String name = "苹果";
        String taste = "甜的";
        Fruit fruit = new Fruit(name, taste);
        System.out.println(fruit.toString());

        Lemon lemon = new Lemon("柠檬");
        System.out.println(lemon.toString());

    }

}
