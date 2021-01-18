package southwind.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import southwind.entity.Student;

import java.util.Collection;

@Controller
@RequestMapping("/rest")
public class RestController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/findAll")
    @ResponseBody
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/findAll",Collection.class).getBody();
       // return restTemplate.getForObject();
    }
    @ResponseBody
    @RequestMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id") int id) {
        return restTemplate.getForEntity("http://localhost:8010/findbyid/{id}",Student.class,id).getBody();
    }
    @ResponseBody
    @RequestMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/save",student,null).getBody();
    }

}
