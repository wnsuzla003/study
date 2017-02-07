package remind.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import remind.Model.Question;

@Controller
@RequestMapping("/question")
public class QnaController {
	
	@GetMapping("/gotoquestion")
	public String gotoquestion(){
		return "/question/question_form";
	}
	
	@PostMapping("/enter")
	public String getQ(Question question, Model model){
		model.addAttribute("question", question);
		return "/question/q_list";
	}
}
