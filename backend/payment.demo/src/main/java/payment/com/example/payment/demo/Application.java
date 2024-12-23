package payment.com.example.payment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Imported
import payment.com.example.payment.demo.Tutorial.Tutorial;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Tutorial.reverseString();
		// longestWord();
		// swapTwoNum();
		// removeDuplicateString();
		// checkPalindrome();();
		// getMaximamNum();
		// getMinimumNum();
		// System.out.println(fibonacci(6));
		SpringApplication.run(Application.class, args);
	}


}


