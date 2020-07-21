package com.soap.wsdl;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

import br.com.klayrocha.GetCustomerDetailRequest;
import br.com.klayrocha.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndpoint {
		
	public GetCustomerDetailResponse processCustomerDetailRequest(GetCustomerDetailRequest request) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		return response;
		
	}

}
