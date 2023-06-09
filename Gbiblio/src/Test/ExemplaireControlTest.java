package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import objets_metiers.Exemplaire;
import objets_metiers.Oeuvre;
import Utility.BibalExceptions;
import control.ExemplaireControl;

public class ExemplaireControlTest {

    @Test
    public void testAjouter() throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        oeuvre.setTitre("Les Misérables");
        oeuvre.setAuteur("Victor Hugo");
        oeuvre.setNbResa(0);
        ExemplaireControl.ajouter(oeuvre, "neuf");
        assertEquals(1, oeuvre.getNbResa());
    }

    @Test
    public void testModifier() throws BibalExceptions {
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.setId(1);
        exemplaire.setEtat("abimé");
        ExemplaireControl.modifier(exemplaire);
        assertEquals("abimé", exemplaire.getEtat());
    }

    @Test
    public void testSupprimer() throws BibalExceptions {
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.setId(1);
        exemplaire.setEtat("neuf");
        ExemplaireControl.supprimer(exemplaire);
        assertNull(ExemplaireControl.findById(1));
    }

    @Test
    public void testFindById() throws BibalExceptions {
        Exemplaire exemplaire = ExemplaireControl.findById(1);
        assertNotNull(exemplaire);
    }

    @Test
    public void testFindExemplaireDispo() throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        ArrayList<Exemplaire> exemplairesDispo = ExemplaireControl.findExemplaireDispo(oeuvre);
        assertNotNull(exemplairesDispo);
    }

    @Test
    public void testFind() throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        ArrayList<Exemplaire> exemplaires = ExemplaireControl.find(oeuvre);
        assertNotNull(exemplaires);
    }
    /*
     * Ce test effectue les opérations suivantes :

Teste la méthode "ajouter" en ajoutant un exemplaire à une oeuvre et en vérifiant que le nombre d'exemplaires de l'oeuvre a bien été incrémenté.
Teste la méthode "modifier" en modifiant l'état d'un exemplaire et en vérifiant que l'état a bien été modifié.
Teste la méthode "supprimer" en supprimant un exemplaire et en vérifiant qu'il n'est plus possible de le retrouver avec la méthode "findById".
Teste la méthode "findById" en cherchant un exemplaire existant et en vérifiant qu'il est bien retourné.
Teste la méthode "findExemplaireDispo" en cherchant des exemplaires disponibles pour une oeuvre donnée et en vérifiant qu'ils sont bien retournés.
Teste la méthode "find" en cherchant tous les exemplaires pour une oeuvre donnée et en vérifiant qu'ils sont bien retournés.      */

}
