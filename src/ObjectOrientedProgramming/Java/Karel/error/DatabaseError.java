package ObjectOrientedProgramming.Java.Karel.error;

@Deprecated
public class DatabaseError extends Error{

    public DatabaseError(String massage){
        super(massage);
    }

    @Override // Ini adalah annotation
    public String getMessage() {
        return super.getMessage();
    }
}
