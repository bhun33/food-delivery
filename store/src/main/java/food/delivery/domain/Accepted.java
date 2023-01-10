package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long storeId;
    private Long menuId;
    private Integer qty;
    private String address;
    private String status;

    public Accepted(Store aggregate){
        super(aggregate);
    }
    public Accepted(){
        super();
    }
}
