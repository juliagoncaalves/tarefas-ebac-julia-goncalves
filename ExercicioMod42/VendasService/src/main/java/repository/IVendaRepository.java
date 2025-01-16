package repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcelocbasilio.VendasService.domain.Venda;

@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

    Optional<Venda> findByCodigo(String codigo);
}
