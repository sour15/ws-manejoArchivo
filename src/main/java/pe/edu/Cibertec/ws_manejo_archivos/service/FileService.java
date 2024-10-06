package pe.edu.Cibertec.ws_manejo_archivos.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@Slf4j
public class FileService {
    private final String FILE_PATH="data_prueba.txt";

    public void crearArchivoEscribir() throws IOException{
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)){
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("Desarrollo de servicios web 2");
        }
    }
    public  void abrirLeerArchivos() throws IOException{
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)){
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            String nombreCurso = dataInputStream.readUTF();
            log.info(nombreCurso);

        }
    }

}
