package test;


import java.util.List;

import com.ztkj.cw.dao.UserDaoImpl;
import com.ztkj.cw.po.User;

public class test {

	public static void main(String[] args) {
		UserDaoImpl userDaoImpl=new UserDaoImpl();
//		User user=userDaoImpl.login("admin", "admin");
//		if(user !=null) {
//			System.out.println("登陆成功");
//		}else {
//			System.out.println("登陆失败");
//		}

		List<User> users = userDaoImpl.getAllUser();
		for (User user : users) {
			System.out.println(user.toString());
		}
	}

}
