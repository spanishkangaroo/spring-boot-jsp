package es.sexycoding.jspjstlexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.sexycoding.jspjstlexample.entity.Issue;
import es.sexycoding.jspjstlexample.repository.IssueRepository;

@Controller
public class IssueController {
	
	@Autowired
	private IssueRepository issueRepository;
	
	@GetMapping("/issues")
	public String getIssues(Model model) {
        model.addAttribute("issues", issueRepository.findAll());
        return "issues";
    }
	
	@GetMapping("/issue")
	public String getIssue(Model model) {
        model.addAttribute("issue", issueRepository.findById(1L).get());
        return "issue";
    }
	
	@PostMapping("/issue")
	public String postIssue(Model model, @ModelAttribute Issue issue) {
        Issue savedIssue = issueRepository.save(issue);
        model.addAttribute("issue", savedIssue);
        return "updated-issue";
    }
}
