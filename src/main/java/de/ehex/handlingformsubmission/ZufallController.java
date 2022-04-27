package de.ehex.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ZufallController {


    @GetMapping("/schaetzen")
    public String zufallform(Model model) {
        model.addAttribute("schaetzen", new Zufall());
        return "schaetzen";
    }
    @GetMapping("/zufallsspielneu")
    public String ZufallsSpielNeu(@ModelAttribute Zufall zufall, Model model) {
        zufall.resetZufallssZahl();
        model.addAttribute("schaetzen", new Zufall());
        return "schaetzen";
    }
    @PostMapping("/schaetzen")
    public String schätzenSubmit(@ModelAttribute Zufall zufall, Model model) {
        model.addAttribute("schaetzen", zufall);
        return "ergebniss";
    }

}