<?php
/**
 * Compte avec taux d'interêt
 */
class CompteEpargne extends Compte
{
    /**
     * Taux d'interêt du compte
     *
     * @var int taux d'interêt
     */
    private int $taux_interets;
    
    /**
     * Construcetur du compte épargne
     *
     * @param string $nom : nom du titulaire du compte
     * @param float $montant : solde du compte à l'ouverture
     * @param integer $taux : taux d'interêt du compte
     */
    public function __construct(string $nom, float $montant, int $taux)
    {
        // Ontransfert es valeurs au constructeur parent
        parent::__construct($nom, $montant);
        $this->taux_interets = $taux;
    }
    
    /**
     * get taux interêt
     *
     * @return integer $taux_interets : Taux d'interêt du compte
     */
    public function getTauxInteret(): int
    {
        return $this->taux_interets;
    }

    /**
     * SET taux interêt
     *
     * @return self $taux_interets : Taux d'interêt du compte
     */
    public function setTauxInteret(int $taux_interets): self
    {
        if($taux_interets > 0){
            $this->taux_interets= $taux_interets;
        }
        return $this; 
    }
    /**
     * Versement d'interêt
     *
     * @return void
     */
    public function verserInteret(): void
    {
        $this->solde = $this->solde + ($this->solde * $this->taux_interets/100);
    }
}