package com.example.courseapiStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.example") /*Do this if you are creating controller and services in different packages else Controller will give
					             404 as it cant scan through whole project components(classes) without this annotation command */


@SpringBootApplication //annotation to tell this is starting point of springboot app
public class CourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args); //start this app(create servlet container and host app within)
		                                                       //StringApplication is a STATIC class calling STATIC method .run
															    //Creates Application context,perform class path scan
		                                                        //Starts Tomcat server
	}

}
