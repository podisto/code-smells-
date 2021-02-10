package com.simba.deeplynested;

import java.util.List;

public class DeeplyNestedCode {

    private final List<MappedField> persistenceFields;

    public DeeplyNestedCode(List<MappedField> persistenceFields) {
        this.persistenceFields = persistenceFields;
    }

    public MappedField getMappedField(final String storedName) {
        for (final MappedField mf: persistenceFields) {
            if (mf.hasName(storedName)) {
                return mf;
            }
        }
        return null;
    }
}
