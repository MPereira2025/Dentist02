

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>
<h1>Alta Usuarios</h1>
<p>Este es el apartado para darle de alta a los usuarios</p>


<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                   placeholder="password">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rolUsu" name="rolUsu"
                   placeholder="Rol">
       
        
        <!---- va todo lo que respecta a horarios y usuarios --->
        
    </div>
    
   
    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Crear usuario
    </button>
    
</form>

<%@include file="components/bodyfinal.jsp"%>

