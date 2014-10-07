package com.netflix.suro.sink.notice;

<<<<<<< HEAD
import com.netflix.util.Pair;
=======
>>>>>>> FETCH_HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogNotice implements Notice<String> {
    public static final String TYPE = "log";

    private static Logger log = LoggerFactory.getLogger(LogNotice.class);

    @Override
    public void init() {

    }

    @Override
    public boolean send(String message) {
        log.info(message);

        return true;
    }

    @Override
    public String recv() {
        return null;
    }

    @Override
<<<<<<< HEAD
    public Pair<String, String> peek() {
        return null;
    }

    @Override
    public void remove(String key) {

    }

    @Override
=======
>>>>>>> FETCH_HEAD
    public String getStat() {
        return null;
    }
}
