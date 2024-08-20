package mrls.mongodb_.model.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("computer")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Computer {
    @Id
    private String uid;
    private String name;
    private int quantity;
    private String category;
    private Specs specs;
    private String description;
}
