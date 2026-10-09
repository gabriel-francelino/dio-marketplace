package dio.marketplace.registration.infrastructure.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class CustomerEventHandler {
    private static final Logger logger = LoggerFactory.getLogger(CustomerEventHandler.class);

    @HandleAfterCreate
    public void handleCustomerCreated(Object customer) {
        logger.warn("Customer created: {}", customer.toString());
    }

    @HandleAfterSave
    public void handleCustomerUpdated(Object customer) {
        logger.warn("Customer updated: {}", customer.toString());
    }

    @HandleAfterDelete
    public void handleCustomerDeleted(Object customer) {
        logger.warn("Customer deleted: {}", customer.toString());
    }
}
