<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EditarUsuarios</title>

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
    
   <h2 class="text-center mb-4">Aqui Usted podra editar sus Datos:</h2>
    
    <main>
    <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
      
         
         <form action="${pageContext.request.contextPath}/EditarUsuarios" method="post" class="form">
				<div class="row">
					<div class="col">
						<label for="Id" class="form-label">Id</label>
					</div>
					<div class="col">
						<input class="form-control" id="Id" name="Id"
							type="number" readonly="readonly"
							value="${EditarUsuarios.getId()}">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="EditarUsuarios" class="form-label">Nombre</label>
					</div>
					<div class="col">
						<input class="form-control" id="nombre" name="nombre"
							value="${EditarUsuarios.getId()}" type="text">
					</div>
				</div>
				
				<div class="row">
					<div class="col">
						<label for="EditarUsuarios" class="form-label">Apellido</label>
					</div>
					<div class="col">
						<input class="form-control" id="apellido" name="apellido"
							value="${EditarUsuarios.getId()}" type="text">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="rut" class="form-label">Rut</label>
					</div>
					<div class="col">
						<input class="form-control" id="rut" name="rut"
							value="${EditarUsuarios.getId()}" type="text">
					</div>					
				</div>
				<div class="row">
					<div class="col">
						<label for="tipoUsuario" class="form-label">Tipo Usuario</label>
					</div>
					<div class="col">
						<input class="form-control" id="tipoUsuario" name="tipoUsuario"
							value="${EditarUsuarios.getId()}" type="text">
					</div>					
				</div>
				
				  <%@ include file = "button.jsp" %>
				
			</form>
		</div>
		</div>
		</div>

		</main>
	
         
           
            
       
        
         
        
         
         
          
          
      
          
          
       
    
  
 
            
 </section>
 

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