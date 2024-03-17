package project.stub;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class TanyaController {

    @PostMapping("/ruchka1")
    public String ruchka1(@RequestBody JsonNode request, @RequestHeader("header") String header) {
        System.out.println(header);

        try {
            String country = request.get("Country").asText();
            System.out.println("Country: " + country);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "response";
    }

    @GetMapping("/ruchka2")
    public String ruchka2(@RequestHeader("header") String header) {
        System.out.println(header);
        String response = "ruchka2";
        return response;
    }
}