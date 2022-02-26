package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("/edureka")
	public String edureka() {
		return "edureka";
	}
	@PostMapping("/details")
	public String viewdetails(@RequestParam("cid") String cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap mp) {
		mp.put("cid", cid);
		mp.put("cname", cname);
		mp.put("cemail", cemail);
		return "viewCustomer";
		
	}
}
