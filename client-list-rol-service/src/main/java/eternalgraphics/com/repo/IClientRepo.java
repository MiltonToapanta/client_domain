package eternalgraphics.com.repo;

import java.util.List;

import eternalgraphics.com.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;

public interface IClientRepo extends JpaRepository<Client, Integer> {
    List<Client> findAll(Sort sort);
}
