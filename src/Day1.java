import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Day1 {
    public static void main(String[] args) throws Exception {
        String apiKey = "Coloque sua API Key aqui!";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
            .newBuilder()
            .uri(new URI("https://api.themoviedb.org/3/movie/550?api_key=" + apiKey))
            .GET()
            .build();
        
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());   
    }
}
