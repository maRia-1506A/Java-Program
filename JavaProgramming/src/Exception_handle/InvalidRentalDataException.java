package Exception_handle;

public class InvalidRentalDataException extends RuntimeException {
    // constractor
    InvalidRentalDataException(String str) {
        super(str);
    }
}