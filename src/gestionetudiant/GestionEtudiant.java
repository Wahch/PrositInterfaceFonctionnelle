/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author Wahch
 */
public interface GestionEtudiant {
 public void afficherEtudiants(List<Etudiant> etudiants , consumer<Etudiant> consumer);

    /**
     *
     * @param etudiants
     * @param predicate
     * @param cons
     */
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants , Predicate<Etudiant> predicate , consumer<Etudiant> cons );
    public String afficherNomEtudiant(List<Etudiant> etudiants , Function<Etudiant,String> f); 
    public Etudiant creeEtudiant(Supplier<Etudiant> supp);
    public Stream convertListStream(List<Etudiant> I); 
    
    
}
