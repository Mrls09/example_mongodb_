package mrls.mongodb_.model.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Specs {
    private String processor;
    private String ram;
    private String storage;
    private String graphics;
}
