package the.alley.db;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//for NPC generation
@Data
@Document("npc")
public class NpcDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Integer attack;
    private Integer defense;
    private Integer location;
    private Integer hp;

}