package ObjectOrientedProgramming.Java.Karel.Data;

public record LoginRequest(String username, String password) {
    // Ini adalah compact constructor tanpa tanda (). dan akan terus muncul setiap memanggil constructor.
    public LoginRequest{
        System.out.println("This is your login page");
    }

    // Ini adalah constructor overloading.
    public LoginRequest(String username){
        this(username, "26November2003"); // Harus memanggil constructor utamanya.
    }

    public LoginRequest(){
        this("", "");
    }
}
