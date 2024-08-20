package mrls.mongodb_.service.computer;

import com.mongodb.MongoException;
import mrls.mongodb_.model.computer.Computer;
import mrls.mongodb_.model.computer.ComputerRepository;
import mrls.mongodb_.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository repository;

    @Transactional(readOnly = true)
    public Response<List<Computer>> getAll(){
        return new Response<>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }
    @Transactional(rollbackFor = {MongoException.class})
    public Response<Computer> insert(Computer computer){
        return new Response<>(
                this.repository.save(computer),
                false,
                200,
                "OK"
        );
    }
}
