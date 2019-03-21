package no.ssb.lds.api.search;

import no.ssb.lds.api.persistence.DocumentKey;

public class SearchResult {

    private final DocumentKey documentKey;

    public SearchResult(DocumentKey documentKey) {
        this.documentKey = documentKey;
    }

    public DocumentKey getDocumentKey() {
        return documentKey;
    }
}
