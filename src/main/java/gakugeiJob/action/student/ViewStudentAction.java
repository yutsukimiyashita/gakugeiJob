package gakugeiJob.action.student;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;

public class ViewStudentAction {


	@Execute(validator = false)
	@StudentAuth
    public String index(){
        return "index.jsp";
	}
}
