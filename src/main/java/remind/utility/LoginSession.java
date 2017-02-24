package remind.utility;

import javax.servlet.http.HttpSession;

public class LoginSession {
	 public static final String SESSION_USER_KEY="LoingUser";
	 
	 public static Boolean isLogin(HttpSession session){
		 Object logined = session.getAttribute(SESSION_USER_KEY);
		 if(logined==null){
			 return false;
		 }
		 return true;
	 }
}
