package the.alley.db;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//item table
@Data
@Document("cache")
public class CacheDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mapName;
    private String currentRoomStatus;
}