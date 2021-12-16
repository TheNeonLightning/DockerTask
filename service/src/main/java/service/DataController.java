package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
class DataController {
    @GetMapping("/generate/{input}")
    Double getData(@PathVariable Long input) {
        return generateData(input);
    }

    private static double generateData(double input) {
        return input / System.currentTimeMillis();
    }
}