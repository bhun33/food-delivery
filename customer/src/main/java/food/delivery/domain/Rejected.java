package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long storeId;
    private Long menuId;
    private Integer qty;
    private String address;
    private String status;
}


