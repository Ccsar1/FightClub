
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;



public class ManejadorArchivo {
        public static void guardarUsuario(List<User> usuario, String nombreArchivo) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo,true))) {
                for (int i=0; i < usuario.size(); i++) {
                    User user= usuario.get(i);
                    String linea = String.format("%s,%s,%s,%s", user.getName(), user.getNick(), user.getPassword(), user.getRegister_number());
                    if (i<usuario.size()-1){
                        linea+= ",";
                    }
                    writer.write(linea);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static List<User> cargarUsuarios(String nombreArchivo) {
            List<User> users = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] data = linea.split(",");
                    String name = data[0];
                    String nick = data[1];
                    String password = data[2];
                    String register_number = data[3];
                    users.add(new User(name,nick,password,register_number));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return users;
        }
    }


