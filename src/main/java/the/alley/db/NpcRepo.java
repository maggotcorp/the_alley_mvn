package the.alley.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NpcRepo extends MongoRepository<NpcDB, Integer> {
    //List<NpcDB> findByName(String name);
    //NpcDB findByLocation(Integer location);
}