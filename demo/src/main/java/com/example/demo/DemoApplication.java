package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	public class HelloController
	{
		@RequestMapping("/")
		public String hello() {
			return "<div style='position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);'><hr style='border: 1px solid purple; width: 50%;'><h1 style='color: purple; font-family: Arial;'>¡Hola Mundo!</h1><hr style='border: 1px solid purple; width: 50%;'></div>";
		}


	}

}
