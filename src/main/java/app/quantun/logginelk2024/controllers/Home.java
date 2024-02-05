package app.quantun.logginelk2024.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class Home {

    @GetMapping("/home")
    public String home() {
        log.info("Hello from LogginELK2024");
        log.error("Error from LogginELK2024");
        return "Hello from LogginELK2024";
    }
}
