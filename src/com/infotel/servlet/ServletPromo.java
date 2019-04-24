package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Promo;

import com.infotel.services.Iservices;
import com.infotel.services.ServicesImpl;

/**
 * Servlet implementation class ServletPromo
 */
@WebServlet("/ServletPromo")
public class ServletPromo extends HttpServlet {
	private Iservices service = new ServicesImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPromo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom;
		int effectif;
		int id;
		if (request.getParameter("nomPromo") != null) {

			effectif = Integer.parseInt(request.getParameter("effectif"));
			nom = request.getParameter("nomPromo");
			
			// 2- envoyer à la couche service
			Promo p = new Promo();
			p.setEffectif(effectif);
			p.setNomPromo(nom);
			

			request.getParameter("ajouter");
			service.ajouterPromo(p);

		}

		// 3 - Preparation a l'envoi à JSP
		request.setAttribute("Promos", service.findAllPromo());

		// 4 - Envoi a la JSP
		request.getRequestDispatcher("Promo.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
