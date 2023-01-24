<%@page import="org.codehaus.jackson.JsonNode" %> 
<%@page import="org.codehaus.jackson.map.objectMapper" %>
<%@page import="org.springframework.http.ResponseEntity" %> 
<%@page import="org.springframework.web.client.RestTemplate" %>
<%@page language="java" %>

<html>
<body>
<h2>REST Client</h2>

	<%
	    String catId request.getParameter("catId"); 
	    
	    String url ="http://localhost/category/" + catId;

		RestTemplate client = new RestTemplate(); 
		
		ResponseEntity<string> responseEntity = client.getForEntity (url, String.class);

		ObjectMapper mapper = new ObjectMapper(); 
		
		JsonNode root = mapper.readTree(responseEntity.getBody()); 
		
		int categoryId = root.path("categoryId").asInt();

		String categoryName = root.path("categoryName").asText();

		String categoryDescription = root.path("categoryDescription").asText();
		
		String categoryImage= root.path("categoryImageUrl").asText();

	%>

				ID: <%=categoryId %><br/>

				Name: <%= categoryName %><br/>

				Description: <%= categoryDescription%><br/> 
				
				Image:<%= categoryImage%><br/>

	
	
</body>
</html>
