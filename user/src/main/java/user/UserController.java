package user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    @Value("${service.address}")
    private String serviceAddress;

    @RequestMapping("/use")
    public String doUse(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://" + serviceAddress + ":8080/generate/100";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        String result = response.getBody();
        model.addAttribute("result", result);
        return "result";
    }
}
