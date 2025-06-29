package itmo.java.basics.lessons.lesson7.extra.repository;

import itmo.java.basics.lessons.lesson7.extra.dao.Document;

import java.util.List;

public interface DocumentRepository { // CRUD
    Document findById(Long id);

    void save(Document document);

    void delete(Long id);

    List<Document> getDocuments();
}