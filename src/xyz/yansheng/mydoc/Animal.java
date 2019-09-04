/**  
 * @Title Animal.java
 * @Package xyz.yansheng.mydoc
 * @Description TODO
 * @author yansheng
 * @date 2019-08-28 20:08:23
 * @version v1.0
 */
package xyz.yansheng.mydoc;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author yansheng
 * @date 2019-08-28 20:08:23
 * @version v1.0 
 */
public class Animal {
	/**  
	 * @Fields name 
	 */
	public String name;

	/**
	 * @Title Animal
	 * @Description 动物类的构造方法
	 * @param name 动物名
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * @Title action
	 * @author yansheng
	 * @version v1.0
	 * @date 2019-06-19 01:05:00
	 * @Description 动物的行为   
	 * void 
	 */
	public void action() {
		System.out.println(name + " do someting.");

	}

}