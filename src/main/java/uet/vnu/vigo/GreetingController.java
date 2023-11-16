package uet.vnu.vigo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

	@GetMapping()
	public String greeting() {
		return "Hello, Vigo!";
	}
}