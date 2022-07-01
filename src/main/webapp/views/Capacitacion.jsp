<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Capacitacion</title>

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
    
   <h2 class="text-center mb-4">Crear Capacitacion</h2>
    
    
    <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
       <FORM id =crearCapacitacion action="CrearCapacitacion" method="post">
          <div class="form-group">
            <label for="id">ID Capacitacion: </label>
            <input name="id" class="form-control"  type="text" required>
            
          </div>
          <div class="form-group">
            <label for="nombreCapacitacion">Nombre: </label>
            <input name="nombreCapacitacion" class="form-control" type="text" required>
             
          </div>        
         
          <div class="form-group">
            <label for="lugar">Lugar Capacitacion: </label>
            <input name="lugar" class="form-control" type="text" required>
            
          </div>
          <div class="form-group">
            <label for="hora">Hora Capacitacion: </label>
            <input name="hora" class="form-control" type="text" required>
            
          </div>
          
           <%@ include file = "button.jsp" %>
          
          
        </form>
      </div>
    </div>
  </div>  
            
 </section>
 <script type="src=js/jquery-3.4.1.min.js"></script>

<script>
 $(document).ready(function() {
  $("#crearCapacitacion").validate();
});
 
 
 </script>
 
 
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