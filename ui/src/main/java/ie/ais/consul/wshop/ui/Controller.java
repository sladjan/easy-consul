package ie.ais.consul.wshop.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private RandomClient randomService;

    @RequestMapping("/randomint")
    public Integer showRandomInteger() {
		Map<String, Integer> response = randomService.getInteger();
        int val = response.get("value");
		System.out.println("value:: " + val);
		return val;
    }

}
