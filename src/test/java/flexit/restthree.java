package flexit;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;

    public class restthree {
        String username = "sponsoruser@flexitedu.com";
        String password = "micr0s0ft_";
        String baseUrl = "https://FlexitEdu.iposbi.com";

        @Test
        public void submitForm() {
            RestAssured.baseURI = baseUrl;
            given().urlEncodingEnabled(true)
                    .param("username", username)
                    .param("password", password)
                    .param("grant_type", "password")
                    .param("client_id", "flexitedu_webapp")
                    .param("client_secret", "c12edcdb-35c4-4a0d-9fe3-caf4174fe57c")
                    .param("scope", "openid profile email roles offline_access")
                    .header("Accept", ContentType.URLENC.getAcceptHeader())
                    .post("/api/auth/token")
                    .then().statusCode(200);
        }


    }
