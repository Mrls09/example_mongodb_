package mrls.mongodb_.controller.computer;

import mrls.mongodb_.model.computer.Computer;
import mrls.mongodb_.service.computer.ComputerService;
import mrls.mongodb_.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/computer")
@RestController
@CrossOrigin(value = {"*"})
public class ComputerController {
    @Autowired
    private ComputerService service;
    @GetMapping("/")
    public ResponseEntity<Response<List<Computer>>> getAll(){
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }
    @PostMapping("/")
    public ResponseEntity<Response<Computer>> save(@RequestBody ComputerDto dto){
        return new ResponseEntity<>(
                this.service.insert(dto.getComputer()),
                HttpStatus.OK
        );
    }
}
