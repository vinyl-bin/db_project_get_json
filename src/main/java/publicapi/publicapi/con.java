package publicapi.publicapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class con {
    @GetMapping("/index")
    public String page() {
        return "index";
    }
}
