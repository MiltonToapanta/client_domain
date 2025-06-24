package milton.com.service.impl;

import eternalgraphics.com.model.Client;
import milton.com.repo.IClientRepo;
import milton.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepo clientRepo;

    @Override
    public Client findByEmail(String email) {
        return clientRepo.findByEmail(email);
    }
}
