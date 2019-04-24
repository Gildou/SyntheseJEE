<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.css" rel="stylesheet">
<title>Formulaire stagiaire</title>
</head>
<body>
	<div class="container">
		<h2>Inscrivez le nom de la formation</h2>
		<form action="ServletFormation">
			<div class="form-group">
				<input type="hidden" name="id" value="${idFormation}" /> 
				<label for="email">Nom:</label>
				<input type="text" class="form-control" id="nameFor"
					placeholder="Entrer votre nom" name="nomFormation" value="${nomFormation}">
			</div>
			


			<button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Envoyez</button>
			

		</form>


	</div>


	<div class="container">
		<h2>Formation Disponibles</h2>
		<p>Ici sont réuni les formations auxquels les inscriptions sont ouvertes</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Id</th>
					
					<th>NOM</th>
					
				</tr>
			</thead>
			<tbody>

				<c:if test="${! empty Formations }">


					<c:forEach items="${ Formations }" var="x">
						<tr>
							<td><c:out value="${ x.idFormation }" /></td>

							<td><c:out value="${ x.nomFormation }" /></td>

							

							<td><a href="SupprimerFormation?idFormation=${x.idFormation}" />Supprimer</td>

							
						</tr>

					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>





</body>
</html>