package eternalgraphics.com.service.impl;

import eternalgraphics.com.model.Client;
import eternalgraphics.com.repo.IClientRepo;
import eternalgraphics.com.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepo clientRepo;

    @Override
    public List<Client> findAll() {
        // Ordena los clientes por la fecha de nacimiento (dob)
        return clientRepo.findAll(Sort.by(Sort.Order.asc("dob")));
    }

    @Override
    public Client findById(Integer idClient) {
        return clientRepo.findById(idClient).orElse(null);
    }
}
