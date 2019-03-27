package no.ssb.lds.api.search;

import java.util.List;

public class SearchResponse {

    private final long totalHits;
    private final List<SearchResult> results;
    private final long from;
    private final long size;

    public SearchResponse(long totalHits, List<SearchResult> results, long from, long size) {
        this.totalHits = totalHits;
        this.results = results;
        this.from = from;
        this.size = size;
    }

    /**
     * @return the total number of hits
     */
    public long getTotalHits() {
        return totalHits;
    }

    /**
     * @return the search result objects
     */
    public List<SearchResult> getResults() {
        return results;
    }

    /**
     * @return the given number of initial results to be skipped
     */
    public long getFrom() {
        return from;
    }

    /**
     * @return the given number of results to be returned
     */
    public long getSize() {
        return size;
    }
}
