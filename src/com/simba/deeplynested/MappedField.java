package com.simba.deeplynested;

import java.util.Arrays;
import java.util.List;

public class MappedField {

    private final String name;

    public MappedField(String name) {
        this.name = name;
    }

    public List<String> getLoadNames() {
        return Arrays.asList("omar", "nakhil", "ghazlane", "said", "ahmed");
    }

    public String getName() {
        return name;
    }
}
