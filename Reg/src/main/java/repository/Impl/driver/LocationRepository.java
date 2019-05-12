package repository.Impl.driver;

import domain.Location.Location;
import repository.IRepository;

import java.util.Set;


public interface LocationRepository extends IRepository<Location, Integer>{
    Set<Location> getAll();

}
