package remind.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import remind.Model.Question;
import remind.Repository.QnaRepository;

@Controller
@RequestMapping("/question")
public class QnaController {
	
	@Autowired
	QnaRepository qnaRepository;
	
	@GetMapping("/gotoquestion")
	public String gotoquestion(){
		return "/question/question_form";
	}
	
	
	
	@PostMapping("")
	public String getQ(Question question, Model model){
		qnaRepository.save(question);
		model.addAttribute("question", question);
		return "redirect:/";
	}
	
}
