package javaPrograms;// ... existing code ...
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Practice {
    public static void main(String[] args) throws IOException {

        //If json file is given as reponse and asked to get the fields from response json file to validate
        String path = Files.readString(Path.of("src/test/java/pojo/response.json"));
        JsonPath jp = new JsonPath(path);
        List<Map<String,Object>> latList = new ArrayList<>();
        String lat = "";

        latList = jp.getList("findAll { it.address.geo.lat.toDouble() > 0 }");

//        for (int i=0; i<=jp.getList("").size()-1; i++){
//            if (Double.parseDouble(jp.getString("["+i+"].address.geo.lat")) >0){
//                lat = jp.getString("["+i+"].address.geo.lat");
//                latList.add(Double.parseDouble(lat));
//            }
//        }

        System.out.println(latList);



//        ObjectMapper mapper = new ObjectMapper();
//        CallRequestPOJO callRequestPOJO = mapper.readValue(new File("src/test/java/pojo/callRequest.json"), CallRequestPOJO.class);
//
//        Map<String, Object> formParams = new HashMap<>();
//        formParams.put("From",callRequestPOJO.getFrom());
//        formParams.put("CallerID",callRequestPOJO.getCallerId());
//        formParams.put("StatusCallback",callRequestPOJO.getStatusCallback());
//        formParams.put("To",callRequestPOJO.getTo());
//        formParams.put("Record",callRequestPOJO.isRecord());
//        formParams.put("StatusCallbackContentType",callRequestPOJO.getStatusCallbackContentType());






//        Response res = given().auth().preemptive().basic("","")
//                .contentType("multipart/form-data")
//                .formParams(formParams)
//                .log().all()
//                .when()
//                .post("/v1/Accounts/{sid}/Calls/connect", "ACCOUNT_SID")
//                .then()
//                .statusCode(200)
//                .extract()
//                .response();
//        System.out.println("Response ---> "+res.asPrettyString());


//        //If the json is given in the json file and have created the POJO class to it
//        ObjectMapper mapper = new ObjectMapper();
//        ResponsePojo res = mapper.readValue(new File("src/test/java/pojo/response.json"), ResponsePojo.class);
//        res.getUser().get(0).getAddress();
//
//
//
//
//
//
//
//        String jsonContent = ResponseBody.getResponse(); // Assuming ResponseBody class has this method
//        Gson gson = new Gson();
//
//        // Since ResponseBody.getResponse() starts with an array "[", we map it to a List<User>
//        Type userListType = new TypeToken<List<User>>(){}.getType();
//        List<User> users = gson.fromJson(jsonContent,userListType);
//
//        // Printing details to verify
//        System.out.println("Number of users -> "+users.size());
//        ArrayList al = new ArrayList();
//        if (!users.isEmpty()){
//            for (User user: users){
//                int lat = (int)Double.parseDouble(user.getAddress().getGeo().getLat());
//                if (lat>0){
//                    al.add(gson.toJson(user));
////                    System.out.println(gson.toJson(user));
//                }
//            }
//        }
//        System.out.println(al);

        String customerResponse = Files.readString(Path.of("src/test/CustomerDetails.json"));

        JsonPath jsonPath = new JsonPath(customerResponse);
        List<String> address = jsonPath.getList("contact.names");
        System.out.println(address);
        Map<String,Object> addressObject = jsonPath.getMap("address");
        System.out.println(addressObject);
        System.out.println(addressObject.get("addressLine1"));

        String userRespString = Files.readString(Path.of("src/test/java/pojo/response.json"));
        JsonPath userRespJson = new JsonPath(userRespString);
        System.out.println(userRespJson.getList("$")); // to get the complete list which it is starting from
    }
}