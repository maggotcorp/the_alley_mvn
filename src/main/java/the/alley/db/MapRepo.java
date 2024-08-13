package the.alley.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MapRepo extends MongoRepository<MapDB, Integer> {
    //List<MapDB> findByName(String name);
}