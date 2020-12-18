/**
 * All rights Reserved, Designed By www.rongdasoft.com
 *
 * @version V1.0
 * @Title: Test.java
 * @author: zhangyq
 * @date: 2020/12/18
 * @Copyright: 2020/12/18 www.rongdasoft.com Inc. All rights reserved.
 */
package com.zhangyq.learn;

import com.zhangyq.learn.config.AppConfig;
import com.zhangyq.learn.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Test
 * @author zhangyq
 * @date 2020/12/18
 */
public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


		UserService userService = (UserService) context.getBean("userService");

		userService.getUser();

	}
}
