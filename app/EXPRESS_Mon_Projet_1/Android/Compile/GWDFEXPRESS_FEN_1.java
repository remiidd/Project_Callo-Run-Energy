/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_1
 * Date : 19/09/2016 15:02:13
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_mon_projet.wdgen;


import com.masociete.express_mon_projet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_1 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_1
////////////////////////////////////////////////////////////////////////////

/**
 * ImageCallo
 */
class GWDImageCallo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_1.ImageCallo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821588398980968680l);

super.setChecksum("919079643");

super.setNom("ImageCallo");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(34, 17);

super.setTailleInitiale(150, 111);

super.setValeurInitiale("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\Logo_Callo.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(false, 300, true, false);

super.setAnimationInitiale(false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDImageCallo mWD_ImageCallo;

/**
 * BPBTactive
 */
class GWDBPBTactive extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_1.BPBTactive
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821590258706631787l);

super.setChecksum("923902191");

super.setNom("BPBTactive");

super.setType(4);

super.setLibelle("Bluetooh");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(74, 202);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de BPBTactive
 */
public void init()
{
super.init();

// SI BTEtat() = btDésactivé ALORS          // Si le module Bluetooh de l'appareil est inactif
if(WDAPIBluetooth.btEtat().opEgal(4))
{
// 	BPBTactive = "Activer"                   // TExte à l'intérieur du bouton = "Activer"
this.setValeur("Activer");

}
else
{
// 	BPBTactive = "Désactiver"				  // TExte à l'intérieur du Bouton = "Désactiver"
this.setValeur("Désactiver");

}

}



/**
 * Traitement: Clic sur BPBTactive
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Sablier(Vrai)                            // Affiche le sablier
WDAPIDivers.sablier(true);

// Si BTETat() = btDésactivé Alors														// Si le module bluetooh de l'appareil est inactif
if(WDAPIBluetooth.btEtat().opEgal(4))
{
// 	BTActive(Vrai)																	// activation du module bluetooh
WDAPIBluetooth.btActive(true);

// 	TANTQUE btEtat() = btActivationEnCours OU btEtat() = btDésactivé				// on attend l'activationj
while((WDAPIBluetooth.btEtat().opEgal(2) | WDAPIBluetooth.btEtat().opEgal(4)))
{
}

}
else
{
// 	BTActive(Faux)															     	// on désactive le module bluetooh
WDAPIBluetooth.btActive(false);

// 	TANTQUE btEtat() = btDésactivationEnCours OU BTEtat() = btActif					// on attend la désactivation
while((WDAPIBluetooth.btEtat().opEgal(3) | WDAPIBluetooth.btEtat().opEgal(1)))
{
}

}

// 	Sablier(Faux)																	// désactivé le sablier
WDAPIDivers.sablier(false);

// 	Actualise()																		// lance la fontion Actualise = actualisation des informations
fWD_actualise();

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBPBTactive mWD_BPBTactive;

/**
 * BPactualiser
 */
class GWDBPactualiser extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_1.BPactualiser
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821594051166717594l);

super.setChecksum("927866513");

super.setNom("BPactualiser");

super.setType(4);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(74, 423);

super.setTailleInitiale(48, 60);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\actualiser.png", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BPactualiser
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Actualise()       // lance la fonction Actualise
fWD_actualise();

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBPactualiser mWD_BPactualiser;

/**
 * INT_Visibilité
 */
class GWDINT_Visibilite extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_1.INT_Visibilité
////////////////////////////////////////////////////////////////////////////

/**
 * INT_Visibilité_Option_0
 */
class GWDINT_Visibilite_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_1.INT_Visibilité.INT_Visibilité_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Visible");

super.setHauteurOption(0);

super.setStyleLibelleOption(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_Visibilite_Option_0 mWD_INT_Visibilite_Option_0 = new GWDINT_Visibilite_Option_0();
/**
 * Initialise tous les champs de EXPRESS_FEN_1.INT_Visibilité
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_1.INT_Visibilité
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_Visibilite_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,196,42);
super.setQuid(2821598041208386373l);

super.setChecksum("944918693");

super.setNom("INT_Visibilité");

super.setType(5);

super.setLibelle("Interrupteur");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(155, 202);

super.setTailleInitiale(42, 196);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

super.setCadreInterne(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

super.setParamAnimationChamp(18, 19, 300);
super.setParamAnimationChamp(19, 20, 300);

super.setImageCoche("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_CBox.png?E12_A6_Radio", 6);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_Visibilite mWD_INT_Visibilite;

/**
 * BPenvoyerTrame
 */
class GWDBPenvoyerTrame extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_1.BPenvoyerTrame
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821600390588614977l);

super.setChecksum("978036476");

super.setNom("BPenvoyerTrame");

super.setType(4);

super.setLibelle("Send");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(753, 438);

super.setTailleInitiale(48, 146);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreSurvol(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setStyleCadreEnfonce(2, 0x343434, 0x484848, 0x0, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBPenvoyerTrame mWD_BPenvoyerTrame;

/**
 * SaisieTrame
 */
class GWDSaisieTrame extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_1.SaisieTrame
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,107,44);
super.setRectCompPrincipal(107,2,305,44);
super.setQuid(2821600510852183980l);

super.setChecksum("982520307");

super.setNom("SaisieTrame");

super.setType(20001);

super.setLibelle("Saisir Trame:");

super.setMenuContextuelSysteme();

super.setNote("");

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(753, 22);

super.setTailleInitiale(48, 414);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0), -2);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

super.setCadreInterne9Images(0xFFFFFFFF, "##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,4,2,4,1,4,1}, new int[] {8, 8, 8, 8}, 3, 5);

super.setStyleSaisie(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0));

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSaisieTrame mWD_SaisieTrame;

/**
 * ZR_Périphériques
 */
class GWDZR_Peripheriques extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de EXPRESS_FEN_1.ZR_Périphériques
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_ID
 */
class GWDATT_ID extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_1.ZR_Périphériques.ATT_ID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_ID");

super.setChampAssocie(mWD_LIB_ID);

super.setProprieteAssocie(EWDPropriete.PROP_LIBELLE);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_1.ZR_Périphériques.ATT_ID

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_ID mWD_ATT_ID = new GWDATT_ID();

/**
 * ATT_MAC
 */
class GWDATT_MAC extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_1.ZR_Périphériques.ATT_MAC
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_MAC");

super.setChampAssocie(mWD_LIB_MAC);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_1.ZR_Périphériques.ATT_MAC

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_MAC mWD_ATT_MAC = new GWDATT_MAC();

/**
 * ATT_NOM
 */
class GWDATT_NOM extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_FEN_1.ZR_Périphériques.ATT_NOM
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NOM");

super.setChampAssocie(mWD_LIB_device);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_1.ZR_Périphériques.ATT_NOM

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NOM mWD_ATT_NOM = new GWDATT_NOM();

/**
 * LIB_ID
 */
class GWDLIB_ID extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_FEN_1.ZR_Périphériques.LIB_ID
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821610681420077611l);

super.setChecksum("1067859834");

super.setNom("LIB_ID");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(2, 27);

super.setTailleInitiale(22, 109);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ID mWD_LIB_ID = new GWDLIB_ID();

/**
 * LIB_MAC
 */
class GWDLIB_MAC extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_FEN_1.ZR_Périphériques.LIB_MAC
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2824198811145419830l);

super.setChecksum("681104233");

super.setNom("LIB_MAC");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(2, 309);

super.setTailleInitiale(21, 116);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_MAC mWD_LIB_MAC = new GWDLIB_MAC();

/**
 * LIB_device
 */
class GWDLIB_device extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de EXPRESS_FEN_1.ZR_Périphériques.LIB_device
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2824198849800723914l);

super.setChecksum("681702662");

super.setNom("LIB_device");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(2, 111);

super.setTailleInitiale(21, 116);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_device mWD_LIB_device = new GWDLIB_device();
/**
 * Initialise tous les champs de EXPRESS_FEN_1.ZR_Périphériques
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_1.ZR_Périphériques
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_ID.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_ID);
mWD_ATT_MAC.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_MAC);
mWD_ATT_NOM.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NOM);
mWD_LIB_ID.initialiserObjet();
super.ajouterChamp("LIB_ID",mWD_LIB_ID);
mWD_LIB_MAC.initialiserObjet();
super.ajouterChamp("LIB_MAC",mWD_LIB_MAC);
mWD_LIB_device.initialiserObjet();
super.ajouterChamp("LIB_device",mWD_LIB_device);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,561,46);
super.setQuid(2821612184669073337l);

super.setChecksum("1078314622");

super.setNom("ZR_Périphériques");

super.setType(30);

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(320, 22);

super.setTailleInitiale(364, 562);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(4);

super.setModeAscenseur(2, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 1, 557, 46);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0xFFFFFF, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(2, 0xFFFFFFFF, 0xF1000000, 0xF2000000, 4, 4);

super.setStyleSeparateurVerticaux(true, 0x484848);

super.setStyleSeparateurHorizontaux(3, 0xFFFFFF);

super.setDessinerLigneVide(false);

super.setCadreCelluleSelection9Images("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloDark_Select.png?E5_3NP_4_4_4_4", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 1, 5);

super.setCouleurCellule(0x0, 0x282828, 0xFFFFFF, 0xCE9E29);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de ZR_Périphériques
 */
public void selectionLigne()
{
super.selectionLigne();

// CréationSocket(LIB_device,LIB_MAC)   // lance la procedure créationSocket
fWD_creationSocket(mWD_LIB_device,mWD_LIB_MAC);

}



// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Peripheriques mWD_ZR_Peripheriques;

/**
 * Libellé1
 */
class GWDLibelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de EXPRESS_FEN_1.Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2823942504675168415l);

super.setChecksum("679149238");

super.setNom("Libellé1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ci-dessous, l'écho de la carte ARDUINO:");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(803, 22);

super.setTailleInitiale(26, 351);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLibelle1 mWD_Libelle1;

/**
 * Bouton_Etat_Socket
 */
class GWDBouton_Etat_Socket extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de EXPRESS_FEN_1.Bouton_Etat_Socket
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2823942775259809503l);

super.setChecksum("680850741");

super.setNom("Bouton_Etat_Socket");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Etat Socket:");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(227, 143);

super.setTailleInitiale(21, 116);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBouton_Etat_Socket mWD_Bouton_Etat_Socket;

/**
 * Bouton_vide
 */
class GWDBouton_vide extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de EXPRESS_FEN_1.Bouton_vide
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2823943166103628557l);

super.setChecksum("682645950");

super.setNom("Bouton_vide");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("<<vide>>");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(227, 282);

super.setTailleInitiale(21, 116);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xC0C0C0, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBouton_vide mWD_Bouton_vide;

/**
 * TrameRecue
 */
class GWDTrameRecue extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de EXPRESS_FEN_1.TrameRecue
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2824197831891075139l);

super.setChecksum("679302802");

super.setNom("TrameRecue");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé:");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(831, 22);

super.setTailleInitiale(33, 389);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice("Droid Sans", -9.000000, 0), 3);

super.setCadreExterieur(1, 0xFFFFFFFF, 0x484848, 0x0, 4, 4);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTrameRecue mWD_TrameRecue;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de EXPRESS_FEN_1.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2821583992340547751l);

super.setChecksum("915101104");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(2, 2);

super.setTailleInitiale(30, 200);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_1.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de EXPRESS_FEN_1
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  Actualise ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_actualise()
{
initExecProcLocale("Actualise");


try
{
// SI BTEtat() = btDésactivé ALORS                   // si le module bluetooh de l'appareil est désactivé
if(WDAPIBluetooth.btEtat().opEgal(4))
{
// 	BPBTactive = "Activer"						  // on change le texte du bouton
mWD_BPBTactive.setValeur("Activer");

// 	INT_Visibilité..Couleur = GrisFoncé			 // on change la couleur du texte de l'interrupteur
mWD_INT_Visibilite.setCouleur(8421504);

// 	INT_Visibilité = Faux					     // l'interrupteur est basculéen position "absence"
mWD_INT_Visibilite.setValeur(false);

// 	ZoneRépétéeSupprimeTout(ZR_Périphériques)    // On vide la zr où sont listées les périphériques
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Peripheriques);

}
else
{
// 	BPBTactive = "Désactiver"
mWD_BPBTactive.setValeur("Désactiver");

// 	INT_Visibilité..Couleur = RougeFoncé
mWD_INT_Visibilite.setCouleur(128);

// 	INT_Visibilité = BTEstVisible()			// COmme le module Bluetooh est actif = Vrai, on impute l'état à l'interrupteur
mWD_INT_Visibilite.setValeur(WDAPIBluetooth.btEstVisible());

// 	AffichePériphériques()
fWD_affichePeripheriques();

}

}
finally
{
finExecProcLocale();
}

}


//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  AffichePériphériques ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_affichePeripheriques()
{
initExecProcLocale("AffichePériphériques");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sChaineTmp= new WDChaineU();

WDObjet vWD_sListePeriphs= new WDChaineU();



// sChaineTmp est une chaîne


// sListePériphs est une chaîne


// SI BTEtat() = btActif ALORS
if(WDAPIBluetooth.btEtat().opEgal(1))
{
// 	sListePériphs = BTListePériphérique()
vWD_sListePeriphs.setValeur(WDAPIBluetooth.btListePeripherique());

// 	ZoneRépétéeSupprimeTout(ZR_Périphériques)
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Peripheriques);

// 	SI sListePériphs <> "" ALORS
if(vWD_sListePeriphs.opDiff(""))
{
// 		POUR TOUTE CHAINE sChaineTmp DE sListePériphs SEPAREE PAR RC
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursSousChaine.pourTout(vWD_sChaineTmp, vWD_sListePeriphs.getString(), "\r\n", 0x2);
while(parcours1.testParcours())
{
// 			sIdentifiant = ExtraitChaîne(sChaineTmp,1,TAB)
GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sIdentifiant.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),1,new WDChaineU("\t")));

// 			sAdresseMAC = ExtraitChaîne(sChaineTmp,2,TAB)
GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sAdresseMAC.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),2,new WDChaineU("\t")));

// 			sNom = ExtraitChaîne(sChaineTmp,3,TAB)
GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.setValeur(WDAPIChaine.extraitChaine(parcours1.getVariableParcours(),3,new WDChaineU("\t")));

// 			SI sNOM <> "" ALORS
if(GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.opDiff(""))
{
// 				ZoneRépétéeAjoute(ZR_Périphériques,sChaineTmp)
WDAPIZoneRepetee.zoneRepeteeAjoute(mWD_ZR_Peripheriques,parcours1.getVariableParcours().getString());

}

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


}
else
{
// 	Info("Aucun périphérique disponible")
WDAPIDialogue.info("Aucun périphérique disponible");

}

}

}
finally
{
finExecProcLocale();
}

}


public void fWD_creationSocket( WDObjet vWD_nomReseau , WDObjet vWD_macReseau )
{
initExecProcLocale("CréationSocket");


try
{
vWD_nomReseau = WDParametre.traiterParametre(vWD_nomReseau, 1, false, 16);

vWD_macReseau = WDParametre.traiterParametre(vWD_macReseau, 2, false, 16);


// Sablier(Vrai)     // affiche le sablier
WDAPIDivers.sablier(true);

// SI  SocketConnecteBluetooth(nomRéseau,"SerialPortServiceClass_UUID",macRéseau,5000) = Vrai 
if(WDAPISocketBT.socketConnecteBluetooth(vWD_nomReseau.getString(),"SerialPortServiceClass_UUID",vWD_macReseau.getString(),5000).opEgal(true))
{
// 	SocketChangeModeTransmission(nomRéseau,SocketSansMarqueurFin)   // si socket connecté, alors on change le mode de transmission
WDAPISocket.socketChangeModeTransmission(vWD_nomReseau.getString(),3);

// 	EXPRESS_FEN_1..Libellé="Socket Bluetooth Crée"   // mise à jour propriétés champs
GWDPEXPRESS_Mon_Projet.ms_Project.mWD_EXPRESS_FEN_1.setLibelle("Socket Bluetooth Crée");

// 	OuvreFenêtreMobile(EXPRESS_panel)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_Mon_Projet.ms_Project.mWD_EXPRESS_panel);

// 	sNom=nomRéseau
GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.setValeur(vWD_nomReseau);

// 	sAdresseMAC=macRéseau
GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sAdresseMAC.setValeur(vWD_macReseau);

}

// Sablier(Faux)  // Fin du sablier
WDAPIDivers.sablier(false);

}
finally
{
finExecProcLocale();
}

}



/**
 * ActionBar
 */
class GWDActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_1.ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ActionBar");

super.setNote("");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFF000001, 0xFF000001, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDActionBar mWD_ActionBar;

/**
 * Traitement: Déclarations globales de EXPRESS_FEN_1
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_FEN_1
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ImageCallo = new GWDImageCallo();
mWD_BPBTactive = new GWDBPBTactive();
mWD_BPactualiser = new GWDBPactualiser();
mWD_INT_Visibilite = new GWDINT_Visibilite();
mWD_BPenvoyerTrame = new GWDBPenvoyerTrame();
mWD_SaisieTrame = new GWDSaisieTrame();
mWD_ZR_Peripheriques = new GWDZR_Peripheriques();
mWD_Libelle1 = new GWDLibelle1();
mWD_Bouton_Etat_Socket = new GWDBouton_Etat_Socket();
mWD_Bouton_vide = new GWDBouton_vide();
mWD_TrameRecue = new GWDTrameRecue();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2821583992340482215l);

super.setChecksum("924834209");

super.setNom("EXPRESS_FEN_1");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0x0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(920, 600);

super.setTitre("FEN_1");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\BG_Hybrid_Report_Body.png", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_1
////////////////////////////////////////////////////////////////////////////
mWD_ImageCallo.initialiserObjet();
super.ajouter("ImageCallo", mWD_ImageCallo);
mWD_BPBTactive.initialiserObjet();
super.ajouter("BPBTactive", mWD_BPBTactive);
mWD_BPactualiser.initialiserObjet();
super.ajouter("BPactualiser", mWD_BPactualiser);
mWD_INT_Visibilite.initialiserObjet();
super.ajouter("INT_Visibilité", mWD_INT_Visibilite);
mWD_BPenvoyerTrame.initialiserObjet();
super.ajouter("BPenvoyerTrame", mWD_BPenvoyerTrame);
mWD_SaisieTrame.initialiserObjet();
super.ajouter("SaisieTrame", mWD_SaisieTrame);
mWD_ZR_Peripheriques.initialiserObjet();
super.ajouter("ZR_Périphériques", mWD_ZR_Peripheriques);
mWD_Libelle1.initialiserObjet();
super.ajouter("Libellé1", mWD_Libelle1);
mWD_Bouton_Etat_Socket.initialiserObjet();
super.ajouter("Bouton_Etat_Socket", mWD_Bouton_Etat_Socket);
mWD_Bouton_vide.initialiserObjet();
super.ajouter("Bouton_vide", mWD_Bouton_vide);
mWD_TrameRecue.initialiserObjet();
super.ajouter("TrameRecue", mWD_TrameRecue);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ActionBar);

super.terminerInitialisation();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return true;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEXPRESS_Mon_Projet.ms_Project.mWD_EXPRESS_FEN_1;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "170 ActivAndroid 4-HoloDark";
}
}
