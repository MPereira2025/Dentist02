<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimera.jsp"%>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Telefono"
                   placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Direccion"
                   placeholder="Direccion">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Fecha_nac"
                   placeholder="Fecha nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Especialidad"
                   placeholder="Especialidad">
        </div>
        
        <!---- va todo lo que respecta a horarios y usuarios --->
        
    </div>
    
   
    <a href="#" class="btn btn-primary btn-user btn-block">
        Crear odontologo
    </a>
    
</form>

<%@include file="components/bodyfinal.jsp" %>