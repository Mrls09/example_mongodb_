package mrls.mongodb_.service.brand;

import com.mongodb.MongoException;
import mrls.mongodb_.model.brand.Brand;
import mrls.mongodb_.model.brand.BrandRepository;
import mrls.mongodb_.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository repository;
    @Transactional(readOnly = true)
    public Response<List<Brand>> getAll(){
        return new Response<>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }
    @Transactional(rollbackFor = {MongoException.class})
    public Response<Brand> save(Brand brand){
        return new Response<>(
                this.repository.save(brand),
                false,
                200,
                "OK"
        );
    }
}
