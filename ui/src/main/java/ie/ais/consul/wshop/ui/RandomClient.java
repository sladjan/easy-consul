package ie.ais.consul.wshop.ui;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service")
interface RandomClient {

    @RequestMapping(method = RequestMethod.GET, value = "/randomint")
	Map<String, Integer> getInteger();

}
