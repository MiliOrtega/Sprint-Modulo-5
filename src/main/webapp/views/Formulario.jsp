<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Contacto</title>

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
    
   <h2 class="text-center mb-4">Formulario de Contacto</h2>
   
    
    <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
       <form action="Contacto" method="post">
          <div class="form-group">
            <label for="name">Nombre y apellido: </label>
            <input name="nombres" class="form-control">
          </div>
          <div class="form-group">
            <label for="mail">Correo Electrónico</label>
            <input type="email" name="mail" class="form-control">
          </div>
          <div class="form-group">
            <label for="msj"> Escribe tu Mensaje</label>
            <textarea name="msj" class="form-control" rows="3"></textarea>
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