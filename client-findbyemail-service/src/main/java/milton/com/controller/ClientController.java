package milton.com.controller;

import milton.com.model.Client;
import milton.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/health")
    public ResponseEntity<String> checkService() {
        return new ResponseEntity<>("Client microservice is running...", HttpStatus.OK);
    }

    // Buscar cliente por email
    @GetMapping("/findByEmail")
    public ResponseEntity<Client> findClientByEmail(@RequestParam String email) {
        Client client = clientService.findByEmail(email);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
