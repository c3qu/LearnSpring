package top.tantalum.pdfserve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping(path="/org")
public class MainController {
    @Autowired
    private OrganizationRepository organizationRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewOrg(@RequestParam String name,@RequestParam Integer father_id){
        Organization org=new Organization();
        org.setName(name);
        org.setFather_id(father_id);
        organizationRepository.save(org);
        return "Saved";
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<Organization> getAll() {
        return organizationRepository.findAll();
    } 
}
