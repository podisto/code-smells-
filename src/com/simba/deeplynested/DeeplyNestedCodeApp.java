package com.simba.deeplynested;

import java.util.Arrays;
import java.util.List;

public class DeeplyNestedCodeApp {

    private static final List<MappedField> mappedFields = Arrays.asList(new MappedField("omar"), new MappedField("nakhil"), new MappedField("ghazlane"));

    public static void main(String[] args) {
        DeeplyNestedCode app = new DeeplyNestedCode(mappedFields);
        MappedField mf = app.getMappedField("omar");
        System.out.println(mf.getName());
    }
}
