/**
 * 
 */
package learn.tech;

import org.apache.commons.lang3.*;
/**
 * @author nikunja
 *
 */
public class Application {
	
	public String greet(String name) {
		String message = "";
		if(StringUtils.isNotBlank(name)) {
			message = "Hi, "+name.trim();
		}
		return message;
	}
	
	public Application(){
		System.out.println("Application java initialized.");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Application class.");
		
		Application apl = new Application();
		
		String greet_message = apl.greet("John");
		System.out.println(greet_message);
	}

}
