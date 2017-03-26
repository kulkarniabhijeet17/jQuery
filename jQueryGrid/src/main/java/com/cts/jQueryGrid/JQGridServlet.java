package com.cts.jQueryGrid;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JQGridServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			if (request.getParameter("action").equals("fetchData")) {
				response.setContentType("text/xml;charset=UTF-8");

				String status = request.getParameter("status");

				String rows = request.getParameter("rows");
				String page = request.getParameter("page");

				int totalPages = 0;
				int totalCount = 15;

				if (totalCount > 0) {
					if (totalCount % Integer.parseInt(rows) == 0) {
						totalPages = totalCount / Integer.parseInt(rows);
					} else {
						totalPages = (totalCount / Integer.parseInt(rows)) + 1;
					}

				} else {
					totalPages = 0;
				}
				out.print("<?xml version='1.0' encoding='utf-8'?>\n");
				out.print("<rows>");
				out.print("<page>" + request.getParameter("page") + "</page>");

				out.print("<total>" + totalPages + "</total>");
				out.print("<records>" + 15 + "</records>");
				int srNo = 1;

				for (int i = 0; i < 15; i++) {
					out.print("<row id='" + i + "'>");
					out.print("<cell>" + srNo + "</cell>");
					out.print("<cell>Taher</cell>");
					out.print("<cell>8th</cell>");
					out.print("<cell>25</cell>");
					out.print("<cell><![CDATA[<a href='ViewStd.jsp'>View</a>]]></cell>");
					out.print("</row>");
					srNo++;
				}
				out.print("</rows>");
			}

		} finally {
			out.close();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}
}