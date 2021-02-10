package com.simba.deeplynested;

import java.util.List;

public class DeeplyNestedCode {

    private final List<MappedField> persistenceFields;

    public DeeplyNestedCode(List<MappedField> persistenceFields) {
        this.persistenceFields = persistenceFields;
    }

    public MappedField getMappedField(final String storedName) {
        for (final MappedField mf: persistenceFields) {
            for (final String n: mf.getLoadNames()) {
                if (storedName.equals(n)) {
                    return mf;
                }
            }
        }
        return null;
    }
}
