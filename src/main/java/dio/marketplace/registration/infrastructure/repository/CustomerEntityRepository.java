package dio.marketplace.registration.infrastructure.repository;

import dio.marketplace.registration.infrastructure.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerEntityRepository extends CrudRepository<Customer, UUID> {
}
