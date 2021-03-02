/**
 * 
 */
package com.example.restservice;

/**
 * @author anhquoc
 *
 */
public class Greeting {
	private final long id;
	private final String content;
	// constructor
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
}
