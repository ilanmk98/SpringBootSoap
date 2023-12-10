package com.soap.controller;

import com.soap.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {
    @Autowired
    private SoapClient soapClient;

    @PostMapping("/sumar")
    public ResponseEntity<Integer> sumar(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getAddResponse(numberA, numberB).getAddResult());
    }

    @PostMapping("/restar")
    public ResponseEntity<Integer> restar(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getSubtractResponse(numberA, numberB).getSubtractResult());
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<Integer> multiplicar(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getMultiplyResponse(numberA, numberB).getMultiplyResult());
    }

    @PostMapping("/dividir")
    public ResponseEntity<Integer> dividir(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getDivideResponse(numberA, numberB).getDivideResult());
    }
}
