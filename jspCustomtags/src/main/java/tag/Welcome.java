package tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport {

	public String msg;
	 public String getMsg() {
		 return msg;
	 }
	
	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out= pageContext.getOut();
			out.print("<h1>JSP" + msg + " Message<h1>");
		}catch(Exception e){
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
