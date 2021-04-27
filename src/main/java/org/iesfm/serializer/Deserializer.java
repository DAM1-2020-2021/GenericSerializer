package org.iesfm.serializer;

public interface Deserializer<T> {

    T deserialize(String value);
}
