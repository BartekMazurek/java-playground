package J10_InputOutput;

import java.io.*;

class SerializableTest implements Serializable {
    public transient int id; // TRANSIENT WILL PREVENT TO WRITE PROPERTY VALUE INTO FILE

    public String name;

    public String value;

    public SerializableTest(
        int id,
        String name,
        String value
    ) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return "Name: " + this.name + ", value: " + this.value;
    }
}

public class J16_Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializableTest test1 = new SerializableTest(1, "Object1", "Value1");
        SerializableTest test2 = new SerializableTest(2, "Object2", "Value2");
        SerializableTest test3 = new SerializableTest(3, "Object3", "Value3");

        // WRITE OBJECTS INTO FILE
        ObjectOutputStream stream = new ObjectOutputStream(
            new FileOutputStream("java/test2.txt")
        );

        stream.writeObject(test1);
        stream.writeObject(test2);
        stream.writeObject(test3);

        stream.close();

        // READ OBJECTS FROM FILE
        ObjectInputStream input = new ObjectInputStream(
            new FileInputStream("java/test2.txt")
        );

        SerializableTest read1 = (SerializableTest) input.readObject();
        SerializableTest read2 = (SerializableTest) input.readObject();
        SerializableTest read3 = (SerializableTest) input.readObject();

        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);

        input.close();
    }
}
