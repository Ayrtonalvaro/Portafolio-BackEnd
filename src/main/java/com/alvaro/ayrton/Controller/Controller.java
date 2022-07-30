
package com.alvaro.ayrton.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    
    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre){
        return "hola mundo " + nombre;
    }
    @GetMapping("/chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido){
        return "chau " + nombre  + apellido;
    }
    
}
