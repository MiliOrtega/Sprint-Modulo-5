<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ListarUsuarios</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />

</head>
<body>


<%@ include file ="navbar.jsp" %>


<section>
      <h2 class="text-center text-md-left pl-md-4">Listar Usuarios</h2>
      <p class="text-center px-4">
        Aqui podra encontrar el listado completo de Usuarios
      </p>
    </section>
  <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
 <table class ="table">
 <thead>
 	<tr>
 	<th> Id </th>
 	<th> Nombre</th>
 	<th> Apellido </th>
 	<th> Rut </th>
 	<th> TipoUsuario </th>
 	<th> Acciones</th>
 	
 
 	</tr>
 <tbody>
 	<c:forEach var="c" items="${usuario}">
 		<tr>
 		<td><c:out value="${c.getId()}"></c:out></td>
 		<td><c:out value="${c.getNombre()}"></c:out></td>
 		<td><c:out value="${c.getApellido()}"></c:out></td>
 		<td><c:out value="${c.getRut()}"></c:out></td>
 		<td><c:out value="${c.getTipoUsuario()}"></c:out></td>
 		<td><a href="${pageContext.request.contextPath}/EditarUsuarios?id=${c.getId()}">Editar</a></td>
 		<td><a href="${pageContext.request.contextPath}/EditarUsuarios?id=${c.getId()}">Eliminar</a></td>
 		<td>
        
         </td>
 		
 		</tr>
 	</c:forEach>
 
 	</tbody>  
 </table> 
 
 </div>
    </div>
  </div>  
 
 
  <%@ include file ="footer.jsp" %>
  
     
 <script
    src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"
  ></script>

  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"
  ></script>
</body>
</html>