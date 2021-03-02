/**
 * 
 */
package com.example.restservice;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author anhquoc
 *
 */

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
}
