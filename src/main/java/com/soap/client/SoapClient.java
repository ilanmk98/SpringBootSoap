package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    private static final String TARGET_NAMESPACE_URL = "http://tempuri.org/";
    private static final String SERVICE_URL = "http://www.dneonline.com/calculator.asmx";


    /**
     *
     * @param numberA
     * @param numberB
     * @return AddResponse
     */
    public AddResponse getAddResponse(int numberA, int numberB){
        Add addRequest = new Add(numberA,numberB);
        SoapActionCallback soapActionCallback = new SoapActionCallback(TARGET_NAMESPACE_URL +"Add");
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(SERVICE_URL,addRequest,soapActionCallback);
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return SubtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA,int numberB){
        Subtract subtractRequest = new Subtract(numberA,numberB);
        SoapActionCallback soapActionCallback = new SoapActionCallback(TARGET_NAMESPACE_URL+"Subtract");
        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(SERVICE_URL,subtractRequest,soapActionCallback);
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return MultiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numberA,int numberB){
        Multiply multiplyRequest = new Multiply(numberA,numberB);
        SoapActionCallback soapActionCallback = new SoapActionCallback(TARGET_NAMESPACE_URL+"Multiply");
        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(SERVICE_URL,multiplyRequest,soapActionCallback);
    }

    /**
     *
     * @param numberA
     * @param numberB
     * @return DivideResponse
     */
    public DivideResponse getDivideResponse(int numberA,int numberB){
        Divide divideRequest = new Divide(numberA,numberB);
        SoapActionCallback soapActionCallback = new SoapActionCallback(TARGET_NAMESPACE_URL+"Divide");
        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(SERVICE_URL,divideRequest,soapActionCallback);
    }


}
