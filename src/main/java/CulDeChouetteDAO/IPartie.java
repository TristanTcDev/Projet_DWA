/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CulDeChouetteDAO;

import POJO.Partie;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public interface IPartie {
    /**
     * Ajoute un joueur à la base de données
     * @param partie La partie
     * @return L'id du joueur attribué par la BDD
     */
    public int ajouterPartie(Partie partie);
    /**
     * Modifie un joueur à la base de données (modification du pseudo par exemple)
     * @param partie La partie
     * @return L'id de la partie attribué par la BDD
     */
    public int modifierPartie(Partie partie);
    /**
     * Supprime un joueur de la base de données
     * @param idPartie l'identifiant de la partie
     * @return Vrai si supression ok, sinon Faux
     */
    public boolean supprimerPartie(int idPartie);
    /**
     * Recherche un joueur avec l'id
     * @param idPartie l'identifiant de la partie
     * @return La partie si elle existe, sinon null
     */
    public Partie rechercherPartieParId(int idPartie);
    /**
     * Recherche tous les joueurs existants dans la base de données
     * @return La liste des parties
     */
    public ArrayList<Partie> rechercherToutesLesParties();
}
