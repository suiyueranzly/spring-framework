/**
 * All rights Reserved, Designed By www.rongdasoft.com
 *
 * @version V1.0
 * @Title: B.java
 * @author: zhangyq
 * @date: 2020/12/18
 * @Copyright: 2020/12/18 www.rongdasoft.com Inc. All rights reserved.
 */
package com.zhangyq.learn.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: B
 * @author zhangyq
 * @date 2020/12/18
 */
@Component
public class B {
	@Autowired
	private A a;
}
