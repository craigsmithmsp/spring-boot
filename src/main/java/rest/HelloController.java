package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
@RestController
public class HelloController {
    @Autowired
    PricingRepository pricingRepo;

    @RequestMapping("/")
    public List<Pricing> index() {
        List<Pricing> pricings = new ArrayList<>();
        for (Pricing p : pricingRepo.findAll()) {
            pricings.add(p);
        }
        return pricings;
    }
}
