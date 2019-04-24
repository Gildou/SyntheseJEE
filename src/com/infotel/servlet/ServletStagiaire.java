package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;
import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletStagiaire
 */
@WebServlet("/ServletStagiaire")
public class ServletStagiaire extends HttpServlet {
	private Iservices service = new ServicesImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletStagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom;
		String prenom;
		int age;
		int id;
		int fPromo;
		if (request.getParameter("nom") != null) {

			age = Integer.parseInt(request.getParameter("age"));
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			fPromo = Integer.parseInt(request.getParameter("fPromo"));
			
			
			// 2- envoyer à la couche service
			Stagiaire s = new Stagiaire();
			s.setAge(age);
			s.setNom(nom);	
			s.setPrenom(prenom);
			s.setfPromo(fPromo);
			
			request.getParameter("ajouter");
			service.ajouterStagiaire(s);
			
			

		}

		// 3 - Preparation a l'envoi à JSP
		request.setAttribute("Stagiaires", service.findAllStagiaire());

		// 4 - Envoi a la JSP
		request.getRequestDispatcher("Stagiaire.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
