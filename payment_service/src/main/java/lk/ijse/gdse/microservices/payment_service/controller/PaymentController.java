package lk.ijse.gdse.microservices.payment_service.controller;

import lk.ijse.gdse.microservices.payment_service.dto.PaymentDTO;
import lk.ijse.gdse.microservices.payment_service.dto.TicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @Autowired
    public RestTemplate restTemplate;

    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTicketDetails(@RequestBody PaymentDTO paymentDTO){
        System.out.println(paymentDTO);
        restTemplate.put("http://TICKET-SERVICE/api/v1/tickets/updateStatus",paymentDTO);
    }
}
