package the.alley.db;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserDB, Integer> {
    public UserDB findByName(String name);
}