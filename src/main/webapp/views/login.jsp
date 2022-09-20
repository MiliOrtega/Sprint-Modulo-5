<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validacion</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />

</head>
<body>
<header>


</header>

<section>
	  
      <h2 class="text-center text-md-left pl-md-4">Iniciar Sesion</h2>
      <p class="text-center px-4">
         Debe autenticarse para ingresar al sistema
      </p> 
    
        
    <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
       <form method="post" action="Validacion">
          <div class="form-group">
            INGRESE NOMBRE DE USUARIO:
			<input type="text" name="usuario">
          </div>
          <div class="form-group">
            INGRESE CLAVE:
		<input type="password" name="clave"> 
          </div>
          <%@ include file = "button.jsp" %>
          
          
          
        </form>
      </div>
    </div>
  </div>  
            
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