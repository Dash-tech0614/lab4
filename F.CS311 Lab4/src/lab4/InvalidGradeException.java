package lab4;

public class InvalidGradeException extends Exception {
	public InvalidGradeException() {
        super();
    }

    public InvalidGradeException(String message) {
        super(message);
    }
    public InvalidGradeException(float  point) {
        super(point + "is invalid");
    }


    public InvalidGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradeException(Throwable cause) {
        super(cause);
        
    }
}
