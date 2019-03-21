package no.ssb.lds.api.search;

import java.util.Map;
import java.util.Set;

/**
 * Common interface for Java's SPI to set up different search engine providers.
 */
public interface SearchIndexProvider {

    /**
     * Returns a unique ID of the search engine provider
     */
    String getProviderId();

    /**
     * Returns a list of configuration keys that is used by the search engine provider
     */
    Set<String> configurationKeys();

    /**
     * Creates and initializes the search engine with the given configuration
     */
    SearchIndex getSearchIndex(Map<String, String> configuration);

}
