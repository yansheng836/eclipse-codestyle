/**  
 * @Title Main.java
 * @Package xyz.yansheng.mydoc
 * @Description TODO
 * @author yansheng
 * @date 2019-08-28 20:10:23
 * @version v1.0
 */
package xyz.yansheng.mydoc;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author yansheng
 * @date 2019-08-28 20:10:23
 * @version v1.0 
 */
public class Main {
	/**
	 * @Title main
	 * @author yansheng
	 * @version v1.0
	 * @date 2019-06-19 01:09:41
	 * @Description 测试的主类
	 * @param args   
	 * void 
	 * @see  Animal Cat
	 */
	public static void main(String[] args) {
		Animal animal = new Animal("动物");
		animal.action();

		Cat cat = new Cat("小花");
		cat.action();

	}

}