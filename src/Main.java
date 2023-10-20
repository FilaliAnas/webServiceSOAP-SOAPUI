import webservice.Calculatrice;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Démarrage du serveur");

        Endpoint.publish("http://localhost:8080/",new Calculatrice());
    }
}