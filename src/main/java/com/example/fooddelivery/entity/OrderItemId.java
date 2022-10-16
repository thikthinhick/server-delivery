package com.example.fooddelivery.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class OrderItemId implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private Long menuItemId;
}
