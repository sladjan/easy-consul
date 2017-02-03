package ie.ais.consul.wshop.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class Controller {

    @RequestMapping(value = "/randomint", method = RequestMethod.GET)
    public Map<String, Integer> integer() {
        Map<String, Integer> response = new HashMap<>(1);
        response.put("value", new Random().nextInt());
		System.out.println("value:: " + response.get("value"));
        return response;
    }

}
