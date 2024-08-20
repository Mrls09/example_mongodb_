package mrls.mongodb_.model.computer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends MongoRepository<Computer,String> {
}
