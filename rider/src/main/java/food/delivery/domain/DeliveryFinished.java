package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long storeId;
    private Long menuId;
    private String address;
    private Integer qty;
    private String status;
    private Long riderId;

    public DeliveryFinished(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryFinished(){
        super();
    }
}
