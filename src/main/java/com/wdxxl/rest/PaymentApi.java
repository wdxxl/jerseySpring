package com.wdxxl.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.wdxxl.dao.TransactionDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/payment")
public class PaymentApi {

    @Autowired
    TransactionDao transactionDao;

    @GET
    @Path("/wdxxl")
    public Response savePayment() {
        String result = transactionDao.save();
        return Response.status(200).entity(result).build();
    }

}
