package itmo.java.basics.lessons.lesson7.extra.repository.impl;

import itmo.java.basics.lessons.lesson7.extra.dao.Document;
import itmo.java.basics.lessons.lesson7.extra.repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryImpl implements DocumentRepository {
    private List<Document> documents = new ArrayList<>();
    private static long id = 1;

    {
        Document csv = new Document(12, "csv", true);
        csv.setId(id++);
        this.documents.add(csv);
    }

    @Override
    public Document findById(Long id) {
        Document document = null;
        for (Document doc : documents) {
            if (doc.getId().equals(id)) {
                document = doc;
            }
        }

        return document;
    }

    @Override
    public void save(Document document) {
        Document doc = findById(document.getId());
        if (doc == null) {
            document.setId(id++);
        } else {
            delete(doc.getId());
        }

        this.documents.add(document);
    }

    @Override
    public void delete(Long id) {
        Document document = findById(id);
        if (document != null) {
            this.documents.remove(document);
        } else {
            System.err.printf("Document with id: %d is not found", id);
        }
    }

    @Override
    public List<Document> getDocuments() {
        return this.documents;
    }
}