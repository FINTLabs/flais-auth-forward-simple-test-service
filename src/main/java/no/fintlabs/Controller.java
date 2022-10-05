package no.fintlabs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@Slf4j
@RestController
public class Controller {



    @GetMapping()
    public Mono<Map<String, String>> auth(@RequestHeader Map<String, String> headers) {

        return Mono.just(headers);
    }




}
