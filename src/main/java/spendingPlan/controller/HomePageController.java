package spendingPlan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@RequestMapping("/")
    String home() {
        return "Futrue Home of : Keller Spending Plan Application";
    }
}
