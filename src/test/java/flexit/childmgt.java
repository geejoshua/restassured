package flexit;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class childmgt {
    public static void main(String[] args) {
            String username = "sponsoruser@flexitedu.com";
            String password = "micr0s0ft_";
            String baseUrl = "https://FlexitEdu.iposbi.com";

            RestAssured.baseURI = baseUrl;
            RequestSpecification request = RestAssured.given();
            String myBody = "" + "{ \"username\":\"" + username + "\", " + "\"password\":\"" + password + "\", " + "\"grant_type\":\"" + "password" + "\", " + "\"client_id\":\"" + "flexitedu_webapp" + "\", " + "\"client_secret\":\"" + "c12edcdb-35c4-4a0d-9fe3-caf4174fe57c" + "\", \" + \"\"scope\":\"" + "openid profile email roles offline_access" + "\"}";
            //Step - 1
            //Test will start from generating Token for Authorization
            request.header("Content-Type", "application/x-www-form-urlencoded");
           Response response = request.body(myBody).post("/api/auth/token");
           System.out.println(response.getStatusCode());
        Assert.assertEquals(200,response.getStatusCode());

            String jsonString = response.asString();
            Assert.assertTrue(jsonString.contains("access_token"));

            //This token will be used in later requests
            //String token = JsonPath.from(jsonString).get("access_token");

            }
    }
