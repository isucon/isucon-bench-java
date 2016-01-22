package net.isucon.bench.example;

import java.util.List;
import java.util.Collections;

import net.isucon.bench.Parameter;

import com.fasterxml.jackson.databind.JsonNode;

public class ExampleParameter extends Parameter {
    private static String[] KEYS = new String[]{};
    private static String[] OBJECT_KEYS = new String[]{};

    public String[] keys() {
        return KEYS;
    }

    public String[] objects() {
        return OBJECT_KEYS;
    }

    public void put(String name, String value) {
        // actually don't store anything
    }

    public void putObject(String name, JsonNode node) {
        // actually don't store anything
    }

    public static List<Parameter> dummyParameters(String className) throws ClassNotFoundException {
        if (className.equals("net.isucon.bench.example.ExampleParameter")) {
            return Collections.emptyList();
        }
        throw new ClassNotFoundException();
    }
}
