<?php

/**
 *  class Comptes bancaire
 */
class Comptes
{
    // Propriétés
    /**
     * variable utilisateur [nom du propritaire du compte]
     *
     * @var string
     */
    public $utilisateur;
    /**
     * variable solde [le solde d compte]
     *
     * @var [type]
     */
    public $solde;

    //Méthodes
    /**
     * constructeur
     *
     * @param string $nom : nom de l'utilisateur
     * @param float/integer $montant : solde de compte
     */
    public function __construct(string $nom, float $montant = 100)
    {
        $this->utilisateur = $nom;
        $this->solde = $montant;
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
            return "Votre solde est vide.";
        }
        return "Le solde de votre compte est $this->solde euros.";
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
            echo "Montant invalide ou solde incuffisant";
        }
    }
}