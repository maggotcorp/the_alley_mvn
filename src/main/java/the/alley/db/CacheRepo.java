package the.alley.db;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CacheRepo extends MongoRepository<CacheDB, Integer> {
    CacheDB findById(int intValue);
}