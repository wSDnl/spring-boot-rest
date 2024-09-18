package br.com.wssh;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UsuariosController {
	
	@RequestMapping(value = "/soma/{primeiro}/{segundo}" , method=RequestMethod.GET)
	public Double soma( 
				@PathVariable(value = "primeiro") String primeiro,
				@PathVariable(value = "segundo") String segundo
			) {
		
			return 1D;
			
	}	
}
