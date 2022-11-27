package ObjectOrientedProgramming.Java.Karel.Application;

import ObjectOrientedProgramming.Java.Karel.Data.CreateUserRequest;
import ObjectOrientedProgramming.Java.Karel.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest createUserRequest = new CreateUserRequest();

        createUserRequest.setUsername("karel");
        createUserRequest.setPassword("Sagitarius");

        ValidationUtil.validationReflection(createUserRequest);

    }
}
