package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Author author = ctx.getBean(Author.class);
		/*applicationContext.xml如增加第二類author2會無法分辨要get author或author2的錯誤
		 * 		<bean id="author2"
	                  scope="singleton"
	                  class="com.study.spring.case01.Author"></bean>
		 * */
		Author author1 = (Author)ctx.getBean("author1");
		Author author2 = (Author)ctx.getBean("author2");
		Author author3 = (Author)ctx.getBean("author3");
		System.out.println(author1);
		System.out.println(author2);
		System.out.println(author3);
	}

}
