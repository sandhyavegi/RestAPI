package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Delete_Post {

@Test
public void test1(){
	RequestSpecification request=RestAssured.given();

request.head("Content-Type", "application/json");
JSONObject json=new JSONObject();
json.put("", "");

json.put("", "");
json.put("", "");
request.body(json.toJSONString());
Response response=request.post("url ");
int code=response.getStatusCode();

}

@Test

public void test2(){
	RequestSpecification request=RestAssured.given();

request.head("Content-Type", "application/json");


Response response=request.delete("url ");
int code=response.getStatusCode();

}


@Test

public void test3(){
	RequestSpecification request=RestAssured.given();

request.head("Content-Type", "application/json");
JSONObject json1=new JSONObject();
json1.put("", "");

json1.put("", "");
json1.put("", "");
request.body(json1.toJSONString());

Response response=request.put("url ");
int code=response.getStatusCode();

}







}
