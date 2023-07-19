package the.alley.db;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

//import com.darkness.db.mapDB;

public interface MapRepo extends CrudRepository<MapDB, Integer> {
	 MapDB findByName(String name);

	// Optional<mapDB> findById(Integer intValue);
}