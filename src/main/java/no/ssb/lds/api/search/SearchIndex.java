package no.ssb.lds.api.search;

import io.reactivex.Completable;
import io.reactivex.Single;
import no.ssb.lds.api.persistence.json.JsonDocument;

import java.util.Collection;
import java.util.List;

/**
 * Common interface for all search index operations
 */
public interface SearchIndex {

    /**
     * Creates or updates the index with the given json document
     * @param document a json-document representing the entity
     */
    Completable createOrOverwrite(JsonDocument document);

    /**
     * Creates or updates the index with the given collection of json documents
     * @param documents a list json-document representing the entities
     */
    Completable createOrOverwrite(Collection<JsonDocument> documents);

    /**
     * Deletes a given entity from the index
     * @param document a json-document representing the entity
     */
    Completable delete(JsonDocument document);

    /**
     * Deletes all documents from the index.
     */
    Completable deleteAll();

    /**
     * Searches the index for the given text.
     *
     * @param query query that is passed directly to the search index implementation
     * @param typeFilter list of entity types that should be filtered. The search should narrow results to only these
     *                   types
     * @param from the number of initial results that should be skipped, defaults to 0
     * @param size the number of results that should be returned
     *
     * @return search response object
     */
    Single<SearchResponse> search(String query, List<String> typeFilter, long from, long size);
}
