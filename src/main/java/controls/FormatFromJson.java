package controls;

import io.restassured.response.Response;
import methodsAPI.PetServices;
import models.Pet;

public class FormatFromJson {
    private Response response;

    public Pet fromJson(int id) {
        response = new PetServices().getPetByID(id);
        Pet newPet = response.as(Pet.class);
        return newPet;
    }
}