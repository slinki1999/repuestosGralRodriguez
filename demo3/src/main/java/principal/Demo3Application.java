package principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import modeloDelProducto.repuestoParaAuto;



@SpringBootApplication
@Controller()
public class Demo3Application {

	

	@GetMapping("/")
	public String espacioDeBienvenida() { 
		return "principal/index";
	}
	@GetMapping("/repuesto")
    public repuestoParaAuto mostrar() {
        repuestoParaAuto r1 = new repuestoParaAuto();
        r1.setIdRepuesto("001");
        r1.setNombre("Filtro de aceite");
        r1.setDescripcion("Filtro de aceite para motores a gasolina");
        r1.setTipo("Filtro");
        r1.setMarca("Bosch");
        r1.setModelo("34567");
        r1.setAño(2022);
        r1.setCompatibilidad("Toyota Corolla 2015-2020, Honda Civic 2016-2021");
        r1.setPrecio(25.99);
        r1.setStock(50);
        r1.setPeso("0.5 kg");
        r1.setDimensiones("10 cm x 5 cm x 5cm");
        r1.setMaterial("Carton y goma");
        return r1;
    }
	
	public static void main(String[] args) {
		
		SpringApplication.run(Demo3Application.class, args);
		
	}

}
