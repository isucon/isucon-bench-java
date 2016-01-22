package net.isucon.bench.example;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

import java.net.URI;
import java.net.URISyntaxException;

import net.isucon.bench.Scenario;
import net.isucon.bench.Parameter;
import net.isucon.bench.Session;

public class ExampleScenario extends Scenario {
    private static final String PARAMETER_CLASS = "net.isucon.bench.example.ExampleParameter";

    private static long DURATION_MILLIS = 30 * 1000;
    private static long HARD_TIMEOUT = 35 * 1000;

    // protected boolean complex()
    // protected Step[] steps()

    // public Result finishHook(Result result)

    @Override
    public String parameterClassName() {
        return PARAMETER_CLASS;
    }

    public ExampleScenario() {
        super(DURATION_MILLIS, HARD_TIMEOUT);
    }

    @Override
    protected void scenario(List<Session> originalSessions) {
        Session s = new Session(null);
        getAndCheck(s, "/", "GET INDEX OF SPECIFIED HOST", check -> {
                check.isStatus(200);
                check.respondUntil(25 * 1000);
            });
    }
}
