package repository.Impl.driver;

import domain.Driver.Driver;
import repository.IRepository;

import java.util.Set;

public interface DriverRepository extends IRepository<Driver, String> {
    Set<Driver> getAll();
}
