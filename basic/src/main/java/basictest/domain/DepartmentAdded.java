package basictest.domain;

import basictest.domain.*;
import basictest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DepartmentAdded extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdded(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdded() {
        super();
    }
}
