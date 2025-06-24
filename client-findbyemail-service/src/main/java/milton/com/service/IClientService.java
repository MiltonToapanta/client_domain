package milton.com.service;

import eternalgraphics.com.model.Client;

public interface IClientService {
    Client findByEmail(String email);
}
