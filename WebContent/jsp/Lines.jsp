 <%@ page contentType="text/html"%>
<%@ taglib prefix="html" uri="/WEB-INF/tld/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/tld/struts-bean.tld"%>
<%@ taglib prefix="logic" uri="/WEB-INF/tld/struts-logic.tld"%>
<%@ taglib prefix="nested" uri="/WEB-INF/tld/struts-nested.tld"%>


<html>
<head>
	<title>This is demo for nested tags</title>
</head>
 <body>
 <nested:form action="/save.do?method=save">
  	     <h2>Indexed Property Example</h2>
 			
  	      <nested:iterate id="lineDto" property="lines" name="nestedForm" indexId="idx">
             Name: <nested:text name="lineDto" property="name"  indexed="true"/>
             Town: <nested:text name="lineDto" property="town" indexed="true"/>
          		<nested:iterate id="inch" property="inches" name="lineDto" indexId="j">
          		 	Inch: <nested:text property="length" indexed="true"></nested:text>
          		</nested:iterate>	
          </nested:iterate>
       <nested:submit value="save" />
    </nested:form>
    </body>
 </html>