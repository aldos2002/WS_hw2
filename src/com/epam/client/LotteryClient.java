package com.epam.client;

import com.epam.ws.RandomNumberGenerator;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


/**
 * Created by Almas_Doskozhin
 * on 4/11/2016.
 */
public class LotteryClient {


    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9996/ws/random?wsdl");
        QName qname = new QName("http://ws.epam.com/", "RandomNumberGeneratorImplService");

        Service service = Service.create(url, qname);
        RandomNumberGenerator hello = service.getPort(RandomNumberGenerator.class);
        for(int i = 1; i < 7;i++) {
            System.out.println("Lottery drawing " + i +":");
            System.out.println(hello.randomNumber(1,49));
        }
    }
}
