

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>
<h1>Edicion Usuarios</h1>
<p>Este es el apartado para editar  a los usuarios</p>

<% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>
<form class="user" action="SvEditar" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                   placeholder="Nombre" value="<%=usu.getNombreUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="password" name="password"
                   placeholder="password" value="<%=usu.getPasswordUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rolUsu" name="rolUsu"
                   placeholder="Rol" value="<%=usu.getRol()%>">
       
        
        <!---- va todo lo que respecta a horarios y usuarios --->
        
    </div>
    
   
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificacion
    </button>
    
</form>

<%@include file="components/bodyfinal.jsp"%>
