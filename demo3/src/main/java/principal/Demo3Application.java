package principal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
@Controller()
public class Demo3Application {
	@GetMapping("/")
	public String espacioDeBienvenida() { 
		return "index";
	}

	@GetMapping("/formulario.html")
	public String segundaVista() { 
		return "formulario";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
		
	}

}
