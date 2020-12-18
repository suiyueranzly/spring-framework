/**
 * All rights Reserved, Designed By www.rongdasoft.com
 *
 * @version V1.0
 * @Title: UserServiceImpl.java
 * @author: zhangyq
 * @date: 2020/12/18
 * @Copyright: 2020/12/18 www.rongdasoft.com Inc. All rights reserved.
 */
package com.zhangyq.learn.service.impl;

import com.zhangyq.learn.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @author zhangyq
 * @date 2020/12/18
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public void getUser() {
		System.out.println("get user()");
	}
}
