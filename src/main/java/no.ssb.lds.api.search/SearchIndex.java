package no.ssb.lds.api.search;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import no.ssb.lds.api.persistence.json.JsonDocument;

/**
 * Common interface for all search index operations
 */
public interface SearchIndex {

    /**
     * Creates or updates the index with the given Json information
     * @param document a json-document representing the entity
     */
    Completable createOrOverwrite(JsonDocument document);

    /**
     * Deletes a given entity from the index
     * @param document a json-document representing the entity
     */
    Completable delete(JsonDocument document);

    /**
     * Searches the index for the given text.
     *
     * @param text the text to search for
     * @param from the number of initial results that should be skipped, defaults to 0
     * @param size the number of results that should be returned
     *
     * @return a stream of search result objects
     */
    Flowable<SearchResult> search(String text, Integer from, Integer size);
}
