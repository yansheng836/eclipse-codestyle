/**  
 * @Title Cat.java
 * @Package xyz.yansheng.mydoc
 * @Description TODO
 * @author yansheng
 * @date 2019-08-28 20:09:31
 * @version v1.0
 */
package xyz.yansheng.mydoc;

import java.util.logging.Logger;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author yansheng
 * @date 2019-08-28 20:09:31
 * @version v1.0 
 */
public class Cat extends Animal {

	/**
	 * @Title Cat
	 * @Description 构造函数
	 * @param name 猫的名字
	 */

	public Cat(String name) {
		super(name);
	}

	/**
	 * <p>Title: action</p>
	 * <p>Description: 注意这里使用日志进行输出</p>
	 * @see xyz.yansheng.mydoc.Animal#action()
	 */
	@Override
	public void action() {
		Logger log = Logger.getLogger(Cat.class.getName());
		log.info("猫叫：喵喵喵~~~~");
	}

}
