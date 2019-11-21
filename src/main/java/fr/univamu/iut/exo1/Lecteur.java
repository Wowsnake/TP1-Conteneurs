
package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;
import java.util.Collection;
import java.io.ObjectInputStream;
import java.io.FileInputStream;


public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {
        try {
            FileInputStream fis = new FileInputStream(fichier);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Conteneur obj=(Conteneur)ois.readObject();
            ArrayList<String> infocont = new ArrayList<String>();
            infocont.add(obj.toString());


            for (int i = 0; i < infocont.size(); i++) {
                System.out.println(infocont.get(i));
            }
            fis.close();
            ois.close();
        } catch ( Exception exception ) {
            System.err.println( "Cannot read objects from the stream" );
            exception.printStackTrace();
        }
        return null;
    }
}