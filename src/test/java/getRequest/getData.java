package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getData {

@Test
public void testResponsecode(){
	Response res=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");


int code=res.statusCode();
System.out.println(code);
Assert.assertEquals(code,200);
}
@Test
public void testResponsedata(){
	Response res=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
String data=res.toString();
System.out.println("Data is  "+data);
	System.out.println(res.getTime());
}	
}
