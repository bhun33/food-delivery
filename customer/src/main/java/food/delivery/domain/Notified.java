package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Notified extends AbstractEvent {

    private Long id;
    private Long storeId;
    private Long userId;
    private Long orderId;
    private Long riderId;
    private Integer qty;
    private String address;
    private String status;

    public Notified(Notification aggregate){
        super(aggregate);
    }
    public Notified(){
        super();
    }
}
