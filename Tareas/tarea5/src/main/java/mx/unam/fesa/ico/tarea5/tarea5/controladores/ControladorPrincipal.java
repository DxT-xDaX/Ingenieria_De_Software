package mx.unam.fesa.ico.tarea5.tarea5.controladores;

import mx.unam.fesa.ico.tarea5.tarea5.modelo.Juguete;
import mx.unam.fesa.ico.tarea5.tarea5.modelo.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Tienda")
public class ControladorPrincipal {
    @GetMapping("/Mascota")
    public String mostarMascota(Model model){
        Mascota masc= new Mascota("Perrito", "Cachorrito",
                "https://cdn.shopify.com/s/files/1/0268/6861/files/Dog_Breeds_d405d8cc-bddf-4428-8359-5ea0afe46fa3_480x480.jpg?v=1656165310"
        );
        model.addAttribute("mascota",masc);

        return "pagina1";
    }

    @GetMapping("/Juguetes")
    public String mostarJuguete(Model model){
        Juguete ju= new Juguete("Hueso para perro", 160.0f,
                "https://down-mx.img.susercontent.com/file/mx-11134201-7qukw-lgsu9i3bccbt0e"
        );
        model.addAttribute("ju",ju);

        return "pagina2";
    }
}
