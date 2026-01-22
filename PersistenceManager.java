import java.io.*;
import com.google.gson.*;

public class PersistenceManager {

    public void saveCircuit(Circuit circuit, String filepath) {
        try (Writer writer = new FileWriter(filepath)) {
            Gson gson = new Gson();
            gson.toJson(circuit, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Circuit loadCircuit(String filepath) {
        try (Reader reader = new FileReader(filepath)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, Circuit.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
