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
		<h2>Inscrivez le nom de la Promo</h2>
		<form action="ServletPromo">
			<div class="form-group">
				<input type="hidden" name="id" value="${idPromo}" /> 
				<label for="email">Nom:</label>
				<input type="text" class="form-control" id="namePrm"
					placeholder="Entrer le nom de la promo" name="nomPromo" value="${nomPromo}">
			</div>
			

			<div class="form-group">
				<label for="pwd">Effectifs:</label> <input type="text"
					class="form-control" id="eff" placeholder="Entrer l'effectif de la promo"
					name="effectif" value="${effectif}">
			</div>


			<button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Envoyez</button>
			

		</form>


	</div>


	<div class="container">
		<h2>Promo Enregistrées</h2>
		<p>Ici sont réuni les noms des différentes promo</p>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>NOM</th>
					<th>EFFECTIF</th>
					
				</tr>
			</thead>
			<tbody>

				<c:if test="${! empty Promos }">


					<c:forEach items="${ Promos }" var="x">
						<tr>
							<td><c:out value="${ x.idPromo }" /></td>

							<td><c:out value="${ x.nomPromo }" /></td>

							<td><c:out value="${ x.effectif }" /></td>

							<td><a href="SupprimerPromo?idPromo=${x.idPromo}" />Supprimer</td>

							
						</tr>

					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>





</body>
</html>