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
		<h2>Inscrivez le nom du stagiaire</h2>
		<form action="ServletStagiaire">
			<div class="form-group">
				<input type="hidden" name="id" value="${idStagiaire}" /> 
				<label for="email">Nom:</label>
				<input type="text" class="form-control" id="lastname"
					placeholder="Entrer votre nom" name="nom" value="${nom}">
			</div>
			<div class="form-group">
				<label for="pwd">Prenom:</label> <input type="text"
					class="form-control" id="firstname"
					placeholder="Entrer votre prenom" name="prenom" value="${prenom}">
			</div>

			<div class="form-group">
				<label for="pwd">Age:</label> <input type="text"
					class="form-control" id="age" placeholder="Entrer votre age"
					name="age" value="${age}">
			</div>
			
			<div class="form-group">
				<label for="pwd">Promo:</label> <input type="text"
					class="form-control" id="fPromo" placeholder="Quelle promo?"
					name="fPromo" value="${fPromo}">
			</div>


			<button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Envoyez</button>
			

		</form>


	</div>


	<div class="container">
		<h2>Stagiaires Inscris</h2>
		<p>Ici sont réuni les noms des stagiaires en demande d'inscription</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>PRENOM</th>
					<th>NOM</th>
					<th>AGE</th>
					<th>PROMO</th>
				</tr>
			</thead>
			<tbody>

				<c:if test="${! empty Stagiaires }">


					<c:forEach items="${ Stagiaires }" var="x">
						<tr>
							<td><c:out value="${ x.idStagiaire }" /></td>

							<td><c:out value="${ x.nom }" /></td>

							<td><c:out value="${ x.prenom }" /></td>

							<td><c:out value="${ x.age }" /></td>
							
							<td><c:out value="${ x.fPromo }" /></td>

							<td><a href="SupprimerStagiaire?idStagiaire=${x.idStagiaire}" />Supprimer</td>

							
						</tr>

					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>





</body>
</html>