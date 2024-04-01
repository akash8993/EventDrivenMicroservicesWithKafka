package com.akash.basedomains.dto;

/*Class to transfer data between producer and consumer using apache kafka*/

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String message;
    private String status;
    private Order order;
}
