package remind.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import remind.Model.User;
import remind.Repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/gotojoin")
	public String goJoin(){
		System.out.println("회원가입폼으로");
		return "/users/join_form";
	}
	
	@PostMapping("/join")
	public String join(User user, Model model){
		System.out.println("회원가입처리");
		System.out.println(user);
		userRepository.save(user);
		model.addAttribute("users", user);
		return "/users/UserList";
	}
}
