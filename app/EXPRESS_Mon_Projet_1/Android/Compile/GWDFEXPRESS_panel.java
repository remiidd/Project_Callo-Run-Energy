/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Fenêtre
 * Classe Android : EXPRESS_panel
 * Date : 19/09/2016 15:02:13
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_mon_projet.wdgen;


import com.masociete.express_mon_projet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.potentiometre.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_panel extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_panel
////////////////////////////////////////////////////////////////////////////

/**
 * #EXPRESSVersion1
 */
class GWD_EXPRESSVersion1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_panel.#EXPRESSVersion1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2873199909131547345l);

super.setChecksum("1482170433");

super.setNom("#EXPRESSVersion1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(30, 200);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFF, 0xFFFFFF, creerPolice("Arial", -11.000000, 1), 3);

super.setCadreExterieur(1, 0xFFFFFF, 0xF1000000, 0xF3000000, 4, 4);

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
public GWD_EXPRESSVersion1 mWD__EXPRESSVersion1;

/**
 * Bouton1
 */
class GWDBouton1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_panel.Bouton1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2873199930609796626l);

super.setChecksum("1485583695");

super.setNom("Bouton1");

super.setType(4);

super.setLibelle("Start");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(208, 334);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2);

super.setStyleLibelleRepos(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreSurvol(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreEnfonce(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloLight_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Bouton1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Potentiomètre1 = 100
mWD_Potentiometre1.setValeur(100);

// Si SocketExiste(sNom) Alors
if(WDAPISocket.socketExiste(GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.getString()).getBoolean())
{
// 	SocketEcrit(sNom, "1")
WDAPISocket.socketEcrit(GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.getString(),new WDChaineU("1"));

}

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
public GWDBouton1 mWD_Bouton1;

/**
 * Bouton2
 */
class GWDBouton2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de EXPRESS_panel.Bouton2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2873199990739745902l);

super.setChecksum("1485990841");

super.setNom("Bouton2");

super.setType(4);

super.setLibelle("Stop");

super.setMenuContextuelSysteme();

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(208, 82);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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

super.setStyleLibelleRepos(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleSurvol(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleLibelleEnfonce(0x0, creerPolice("Droid Sans", -9.000000, 0));

super.setStyleCadreRepos(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreSurvol(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setStyleCadreEnfonce(2, 0xE6E6E6, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 6, 9);

super.setImageFond("##SYSTEM##C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ActivAndroid 4-HoloLight_Btn_Std.png?E5_3NP_9_6_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Bouton2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Potentiomètre1 = 0
mWD_Potentiometre1.setValeur(0);

// Si SocketExiste(sNom) Alors
if(WDAPISocket.socketExiste(GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.getString()).getBoolean())
{
// 	SocketEcrit(sNom, "0")
WDAPISocket.socketEcrit(GWDPEXPRESS_Mon_Projet.ms_Project.vWD_sNom.getString(),new WDChaineU("0"));

}

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
public GWDBouton2 mWD_Bouton2;

/**
 * Potentiomètre1
 */
class GWDPotentiometre1 extends WDPotentiometreNatif
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de EXPRESS_panel.Potentiomètre1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2873200076640291703l);

super.setChecksum("1487194390");

super.setNom("Potentiomètre1");

super.setType(12);

super.setLibelle("Potentiomètre");

super.setNote("");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(385, 82);

super.setTailleInitiale(60, 412);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setNumTab(3);

super.setPresenceLibelle(false);

super.setParamPotar(0, 100, 0, true);

super.setStyleLibelle(0x0, creerPolice("Droid Sans", -9.000000, 0), -1);

super.setCadreExterieur(1, 0xFFFFFFFF, 0xDDDDDD, 0x5D5D5D, 4, 4);

super.setPersistant(false);

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
public GWDPotentiometre1 mWD_Potentiometre1;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de EXPRESS_panel.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2873199302768544565l);

super.setChecksum("709556248");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(30, 200);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_panel.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * ActionBar
 */
class GWDActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_panel.ActionBar
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
 * Traitement: Déclarations globales de EXPRESS_panel
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// Potentiomètre1..BorneMax = 100
mWD_Potentiometre1.setBorneMax(new WDEntier(100));

// Potentiomètre1..BorneMin = 0
mWD_Potentiometre1.setBorneMin(new WDEntier(0));

}



// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre EXPRESS_panel
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD__EXPRESSVersion1 = new GWD_EXPRESSVersion1();
mWD_Bouton1 = new GWDBouton1();
mWD_Bouton2 = new GWDBouton2();
mWD_Potentiometre1 = new GWDPotentiometre1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_panel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2873199302768479029l);

super.setChecksum("719289353");

super.setNom("EXPRESS_panel");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(920, 600);

super.setTitre("panel");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 4, 0, 1);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_panel
////////////////////////////////////////////////////////////////////////////
mWD__EXPRESSVersion1.initialiserObjet();
super.ajouter("#EXPRESSVersion1", mWD__EXPRESSVersion1);
mWD_Bouton1.initialiserObjet();
super.ajouter("Bouton1", mWD_Bouton1);
mWD_Bouton2.initialiserObjet();
super.ajouter("Bouton2", mWD_Bouton2);
mWD_Potentiometre1.initialiserObjet();
super.ajouter("Potentiomètre1", mWD_Potentiometre1);
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
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEXPRESS_Mon_Projet.ms_Project.mWD_EXPRESS_panel;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "170 ActivAndroid 4-HoloLight";
}
}
