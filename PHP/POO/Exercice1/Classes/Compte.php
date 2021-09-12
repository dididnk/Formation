<?php

/**
 *  class Compte bancaire
 */
abstract class Compte
{
    // Propriétés
    
    /**
     * variable titulaire [nom du propritaire du compte]
     *
     * @var string
     */
    private string $titulaire;
    /**
     * variable solde [le solde d compte]
     *
     * @var float
     */
    protected float $solde;

    //Méthodes
    
    /**
     * constructeur
     *
     * @param string $nom : nom du titulaire
     * @param float $montant : solde de compte
     * @return void
     */
    public function __construct(string $nom, float $montant = 100)
    {
        // on attribue le nom à la propriété titulaire
        $this->titulaire = $nom;
        // on attribue le nom à la propriété solde
        $this->solde = $montant;
    }

    // Accesseurs : Getter
    
    /**
     * Getter de Titulaire : Retourne la valeur du Titulaire du compte
     * @param void
     * @return string
     */
    public function getTitulaire(): string
    {
        return $this->titulaire;
    }
    
    /**
     * Getter de Solde : Retourne le solde du compte
     * @param void
     * @return float
     */
    public function getSolde(): float
    {
        return $this->solde;
    }
    
    // Constructeurs : Setter

    /**
     * Modifie le nom du Titulaire et retourne l'objet
     *
     * @param string $nom : Nom du titulaire
     * @return Compte compte bancaire
     */
    public function setTitulaire(string $nom): self
    {
        // On vérifie si on a un Titulaire
        if ($nom != "" && is_string($nom)) {
            $this->titulaire = $nom;
        }else{
            echo "Nom du titulaire invalide veillez saisir uniquement des lettres.".'<br/>';
        }
        return $this;
    }
    
    /**
     * Modifie le solde du compte et retourne l'objet
     *
     * @param float $montant : Montant de solde
     * @return Compte compte bancaire
     */
    public function setSolde(float $montant): self
    {
        if($montant >= 0)
        {
            $this->solde = $montant;
        }else{
            echo "Solde invalide veillez saisir un nombre.".'<br/>';
        }
        return $this;
    }
    
    /**
     * deposer une somme dans le compte
     *
     * @param float $montant
     * @return void
     */
    public function deposer(float $montant): void
    {
        if($montant > 0)
        {
            $this->solde += $montant;
        }
    }
    /**
     * consulter le solde de compte
     *
     * @return string
     */
    public function voirSolde(): string
    {
        if($this->solde <= 0)
        {
            return "Votre solde est vide.".'<br/>';
        }
        return "Le solde de votre compte est $this->solde euros.".'<br/>';
    }
    /**
     * retirer une somme du solde du compte
     *
     * @param float $montant : somme à retirer
     * @return void
     */
    public function retirer(float $montant): void
    {
        if ($montant > 0 && $this->solde >= $montant) {
            $this->solde -= $montant;
        }else{
            echo "Montant invalide ou solde incuffisant".'<br/>';
        }
    }
}