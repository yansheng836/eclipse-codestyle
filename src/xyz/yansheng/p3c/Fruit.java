package xyz.yansheng.p3c;

/**
 * @author yansheng
 * @date 2019/09/04
 */
public class Fruit {

    /**
     * 水果名
     */
    public String name = "水果名";
    /**
     * 水果的味道
     */
    public String taste = "水果的味道";

    /**
     * @param name 水果名
     * @param taste 水果的味道
     */
    public Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", taste=" + taste + "]";
    }

}
