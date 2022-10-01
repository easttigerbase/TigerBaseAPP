package io.tigerbase.app.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="board")
@NoArgsConstructor
@Getter
@Setter
public class Board {

    @Id
    int id;
    String data;

}
