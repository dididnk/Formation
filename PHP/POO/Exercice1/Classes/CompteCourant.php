<?php
/**
 * Compte bancaire (hérite de compte)
 */
class CompteCourant extends Compte
{
    // Propriétés

    private $decouvert;
    /**
     * Constructeur de compte courant
     *
     * @param string $nom : nom du titulaire
     * @param float $montant : montant du solde à l'ouverture
     * @param integer $decouvert : découvert autorisé
     */
    public function __construct(string $nom, float $montant, int $decouvert)
    {
        // on transfert les informations à la classe parente
        parent::__construct($nom, $montant);
        $this->decouvert  =$decouvert;
    }    
    public function getDecouvert(): int
    {
        return $this->decouvert;
    }

    public function setDecouvert(int $montant): self
    {
        if ($montant >= 0) {
            $this->decouvert = $montant;
        }
        return $this;
    }

    public function retirer(float $montant): void
    {
        // On vérifie si le découvert permet de retirer
        {
            if ($montant > 0 && $this->solde - $montant >= -$this->decouvert) {
                $this->solde -= $montant;
            }else{
                echo "Solde insuffisant <br/>";
            }
        }
    }
}