package resourse;

import bl.PersonBL;
import entity.Person;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonBL personBL;

    @GET
    public List<Person> getAllPersons() {
        return personBL.getAllPersons();
    }

}
