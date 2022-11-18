package io.tigerbase.app.object;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document(collection="board")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Board {
    @Id String id;
    List<Object> content;
    List<String> chip;
    String type;
    String title;
}
