package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
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
}


