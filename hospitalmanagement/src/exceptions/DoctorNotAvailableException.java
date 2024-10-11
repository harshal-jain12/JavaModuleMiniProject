package exceptions;
//custom exception: DcoctorNotAvailableException
public class DoctorNotAvailableException extends Exception {
    public DoctorNotAvailableException(String message) {
        super(message);
    }
}