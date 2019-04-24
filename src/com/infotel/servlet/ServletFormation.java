package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Formation;

import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletFormation
 */
@WebServlet("/ServletFormation")
public class ServletFormation extends HttpServlet {
	private Iservices service = new ServicesImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletFormation() {
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

		int id;
		if (request.getParameter("nomFormation") != null) {

			nom = request.getParameter("nomFormation");

			// 2- envoyer à la couche service
			Formation f = new Formation();

			f.setNomFormation(nom);

			request.getParameter("ajouter");
			service.ajouterFormation(f);

		}

		// 3 - Preparation a l'envoi à JSP
		request.setAttribute("Formations", service.findAllFormation());

		// 4 - Envoi a la JSP
		request.getRequestDispatcher("Formation.jsp").forward(request, response);
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
