package org.iesfm.generic.serializer;

import org.iesfm.generic.Animal;
import org.iesfm.serializer.AnimalSerializer;
import org.iesfm.serializer.Deserializer;
import org.iesfm.serializer.Serializer;
import org.junit.Assert;
import org.junit.Test;

public class AnimalSerializerTest {

    @Test
    public void animalSerializeTest() {
        Serializer<Animal> animalSerializer = new AnimalSerializer();

        Animal animal = new Animal("red", 10, "cat");

        String expected = "color:red,age:10,specie:cat";
        String actual = animalSerializer.serialize(animal);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalDeserializeTest() {
        Deserializer<Animal> animalDeserializer = new AnimalSerializer();

        String animal = "color:red,age:10,specie:cat";

        Animal expected = new Animal("red", 10, "cat");
        Animal actual = animalDeserializer.deserialize(animal);

        Assert.assertEquals(expected, actual);
    }
}
