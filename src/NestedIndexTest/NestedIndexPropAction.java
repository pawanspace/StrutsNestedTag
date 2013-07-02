package NestedIndexTest;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class NestedIndexPropAction extends DispatchAction{

	public ActionForward open(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		NestedIndexPropActionForm nestedForm = new NestedIndexPropActionForm();
		Line line = new Line();
		line.setInches(Arrays.asList(new Inch(), new Inch()));
		nestedForm.setLines(Arrays.asList(line));
		request.setAttribute("nestedForm", nestedForm);
		return mapping.findForward("success");
	}
	public ActionForward save(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		NestedIndexPropActionForm nestedForm = (NestedIndexPropActionForm) form;
		System.out.println(nestedForm.getLines().get(0).getInches().size());
		return mapping.findForward("success");
	}
}
