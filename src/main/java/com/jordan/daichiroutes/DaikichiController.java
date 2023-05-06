package com.jordan.daichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/m/travel/{city}")
	public String showDestination(@PathVariable("city") String city) {
		return "Congratulation! You will soon travel to " + city;
	}
	
	@RequestMapping("/m/loto/{num}")
	public String showDestination(@PathVariable("num") Integer num) {
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labour but now is a great time to spend time family and friends.";
		}
	}
}
