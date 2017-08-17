package ImageCopier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.security.Timestamp;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;

/**
 * Created by rgimenez on 22/02/2017.
 */
/*
public class ImageCopier {
    public static void main(String args[]){
        //Creamos el servicio para vigilar.
        try {
            WatchService vigilante = FileSystems.getDefault().newWatchService();
            //Creamos la ruta
            Path directorio = Paths.get("C:\\Archive");
            //Vigilamos el directorio asignado para los eventos de crear o modificar.
            WatchKey key = directorio.register(vigilante,
                                                ENTRY_CREATE,
                                                ENTRY_MODIFY);
            while(true) {
                key = vigilante.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    if (kind == OVERFLOW) {
                        continue;
                    }
                    // The filename is the
                    // context of the event.
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path filename = ev.context();

                    // Verify that the new
                    //  file is a text file.
                    try {
                        // Resolve the filename against the directory.
                        // If the filename is "test" and the directory is "foo",
                        // the resolved name is "test/foo".
                        Path child = directorio.resolve(filename);
                        String ruta = child + "";
                        File origen = new File(ruta);
                        ruta = ruta.replaceFirst("^C:\\\\Archive\\\\*", "E:\\\\");
                        File destino = new File(ruta);
                        if(kind == ENTRY_MODIFY){
                            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                            ruta += ruta + timestamp;
                            kind = ENTRY_CREATE;
                        }
                        if (kind == ENTRY_CREATE) {
                            if (!destino.exists()) {
                                //destino.mkdirs();
                            }else {
                                FileInputStream in = new FileInputStream(origen);
                                FileOutputStream out = new FileOutputStream(destino);
                                int c;
                                while ((c = in.read()) != -1)
                                    out.write(c);

                                in.close();
                                out.close();
                            }
                        }
                    } catch(IOException e){
                            System.err.println("In/Out Error");
                            continue;
                    }
                }

                // Reset the key -- this step is critical if you want to
                // receive further watch events.  If the key is no longer valid,
                // the directory is inaccessible so exit the loop.
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        }catch (Exception e){
            System.err.println();
        }
    }
}
*/