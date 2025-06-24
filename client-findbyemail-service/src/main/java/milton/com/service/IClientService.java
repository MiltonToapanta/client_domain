package milton.com.service;

import milton.com.model.Client;

public interface IClientService {
    Client findByEmail(String email);
}
