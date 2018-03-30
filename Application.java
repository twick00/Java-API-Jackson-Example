package api.igdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        String gameId = "1943";
        HttpHeaders headers = new HttpHeaders();
        headers.set("user-key","##APIKEY-GOES-HERE");
        HttpEntity entity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Games[]> response = restTemplate.exchange("https://api-2445582011268.apicast.io/games/"+gameId+"/?fields=name&limit=1",HttpMethod.GET, entity, Games[].class);
        Games[] games = response.getBody();
        
        log.info(games[0].toString());
    }
}
