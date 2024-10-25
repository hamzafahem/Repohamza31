import com.example.jeeg3webservice.webService.CalculWebService;
import jakarta.xml.ws.Endpoint;


public class Server {
    public static void main(String[] args) {
        String url = "http://localhost:8088/";
        Endpoint.publish(url, new CalculWebService());
        System.out.println("Service web disponible à : " + url);
    }

}
//http://localhost:8080/CalculWebService?wsdl
//http://localhost:8088/?wsdl