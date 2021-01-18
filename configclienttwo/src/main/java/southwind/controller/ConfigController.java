package southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value("${server.port}")
    private String port;
    @Value("${config.info}")
    private String configinfo;
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "port: " + this.port + "configinfo" + this.configinfo;
    }
}
