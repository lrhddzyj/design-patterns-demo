package com.lrh.bridge;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/15 15:46
 */
public class Client {

	public static void main(String[] args) {
		Sender textSender = new TextSender();
		Sender pdfSender = new PdfSender();
		Sender htmlSender = new HtmlSender();
		FileServer htmlServer = new HtmlFileServer(htmlSender);
		FileServer pdfFileServer = new PdfFileServer(pdfSender);

		File htmlFile = new HtmlFile("<html>", "a.html");
		File pdfFile = new PdfFile("AA", "B.pdf");
		htmlServer.sendFile(htmlFile);
//		htmlServer.sendFile(pdfFile);
		System.out.println("---------------");
		pdfFileServer.sendFile(pdfFile);
	}
}
