package mrls.mongodb_.controller.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mrls.mongodb_.model.computer.Computer;
import mrls.mongodb_.model.computer.Specs;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDto {
    private String uid;
    private String name;
    private int quantity;
    private String category;
    private Specs specs;
    private String description;
    public Computer getComputer(){
        return new Computer(
                getUid(),
                getName(),
                getQuantity(),
                getCategory(),
                getSpecs(),
                getDescription()
        );
    }
}
