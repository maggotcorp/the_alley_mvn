package the.alley.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ItemsRepo extends MongoRepository<ItemsDB, Integer> {
    //List<ItemsDB> findById(String id);

    //todo add custom query
    //@Query("SELECT * FROM items where name = :name")
    //Optional selectByName(@Param("name") String name);
}