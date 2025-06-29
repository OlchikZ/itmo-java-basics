package itmo.java.basics.lessons.lesson7.extra;

import itmo.java.basics.lessons.lesson7.extra.dao.Document;
import itmo.java.basics.lessons.lesson7.extra.service.DocumentService;
import itmo.java.basics.lessons.lesson7.extra.service.impl.DocumentServiceImpl;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentServiceImpl();

        System.out.println(documentService.create(10, "pdf", false));
        System.out.println(documentService.create(15, "docx", true));
        System.out.println(documentService.read(1L));

        Document document = new Document(255, "book", false);
        document.setId(2L);
        System.out.println(documentService.update(document));

        documentService.delete(1L);
        documentService.delete(999L);

        System.out.println("\n [All document] \n");
        for (Document doc : documentService.getDocuments()) {
            System.out.println(doc);
        }

    }
}