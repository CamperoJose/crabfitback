package api;

import jakarta.ws.rs.*;

@Path("test")
public class Test {
    @GET
    public String test(){
        return "Hola SIUU";
    }


}
