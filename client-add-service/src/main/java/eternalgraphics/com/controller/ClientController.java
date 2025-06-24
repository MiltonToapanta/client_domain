package eternalgraphics.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.service.IClientService;

@Controller
@RequestMapping("/clients")  
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Client microservice is running...", HttpStatus.OK);
    }

    @PostMapping("/add")  
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client savedClient = clientService.save(client);  
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);  
    }
}
