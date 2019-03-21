module no.ssb.lds.search.api {
    requires io.reactivex.rxjava2;
    requires org.reactivestreams;
    requires com.github.akarnokd.rxjava2jdk9interop;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires no.ssb.lds.persistence.api;

    exports no.ssb.lds.api.search;
}
