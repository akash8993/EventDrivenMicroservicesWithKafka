package com.akash.basedomains.dto;

/*Class to transfer data between producer and consumer using apache kafka*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String message;
    private String status;
    private Order order;
}
