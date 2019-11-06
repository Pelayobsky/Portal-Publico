package mx.movistar.col.lead.business.exception	;

public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = -8687522399498703564L;
	
	private Integer code;
	
	public BusinessException() {
		super();
	}

	public BusinessException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BusinessException(final String message, Integer code) {
		super(message);
		this.code = code;
	}
	
	public BusinessException(final String message) {
		super(message);
	}

	public BusinessException(final Throwable cause) {
		super(cause);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
