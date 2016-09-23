/**
 * Code généré par WinDev Mobile Express - NE PAS MODIFIER !
 * Objet WinDev Mobile Express : Projet
 * Classe Android : EXPRESS_Mon_Projet
 * Date : 19/09/2016 15:02:13
 * Version de wdjava.dll  : 20.0.141.0
 */


package com.masociete.express_mon_projet.wdgen;


import com.masociete.express_mon_projet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEXPRESS_Mon_Projet extends WDProjet
{
/**
 * Accès au projet: EXPRESS_Mon_Projet
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEXPRESS_Mon_Projet.ms_Project
 */
public static GWDPEXPRESS_Mon_Projet ms_Project;

 // EXPRESS_FEN_1
public GWDFEXPRESS_FEN_1 mWD_EXPRESS_FEN_1 = new GWDFEXPRESS_FEN_1();
 // accesseur de EXPRESS_FEN_1
public GWDFEXPRESS_FEN_1 getEXPRESS_FEN_1()
{
mWD_EXPRESS_FEN_1.verifierOuverte();
return mWD_EXPRESS_FEN_1;
}

 // EXPRESS_panel
public GWDFEXPRESS_panel mWD_EXPRESS_panel = new GWDFEXPRESS_panel();
 // accesseur de EXPRESS_panel
public GWDFEXPRESS_panel getEXPRESS_panel()
{
mWD_EXPRESS_panel.verifierOuverte();
return mWD_EXPRESS_panel;
}


 // Constructeur de la classe GWDPEXPRESS_Mon_Projet
public GWDPEXPRESS_Mon_Projet()
{
ajouterFenetre("EXPRESS_FEN_1", mWD_EXPRESS_FEN_1);
ajouterFenetre("EXPRESS_panel", mWD_EXPRESS_panel);

}

// Code de déclaration de EXPRESS_Mon_Projet
public void initProjet()
{
// sIdentifiant est une chaîne
vWD_sIdentifiant= new WDChaineU();

super.ajouterVariableGlobale("sIdentifiant",vWD_sIdentifiant);



// sAdresseMAC est une chaîne
vWD_sAdresseMAC= new WDChaineU();

super.ajouterVariableGlobale("sAdresseMAC",vWD_sAdresseMAC);



// sNom est une chaîne
vWD_sNom= new WDChaineU();

super.ajouterVariableGlobale("sNom",vWD_sNom);



// OuvreFenêtreMobile(EXPRESS_FEN_1)
WDAPIFenetre.ouvreFille(GWDPEXPRESS_Mon_Projet.ms_Project.mWD_EXPRESS_FEN_1);

}




////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_sIdentifiant = WDVarNonAllouee.ref;
static public WDObjet vWD_sAdresseMAC = WDVarNonAllouee.ref;
static public WDObjet vWD_sNom = WDVarNonAllouee.ref;
static
{
// Allocation de l'objet global
GWDPEXPRESS_Mon_Projet.ms_Project = new GWDPEXPRESS_Mon_Projet();

// Définition des langues du projet
GWDPEXPRESS_Mon_Projet.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1);
GWDPEXPRESS_Mon_Projet.ms_Project.setNomAnalyseProjet("express_mon_projet");
GWDPEXPRESS_Mon_Projet.ms_Project.setModeGestionFichier(true);
GWDPEXPRESS_Mon_Projet.ms_Project.setCreationAutomatiqueFichierDonnees(true);
GWDPEXPRESS_Mon_Projet.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.2.0";}
public String getNomAPK(){ return "EXPRESS_Application Android";}
public int getIdNomApplication(){return com.masociete.express_mon_projet.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.express_mon_projet";}
public int getIdIconeApplication(){ return com.masociete.express_mon_projet.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 480;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 640;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return false;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ACTIVANDROID 4-HOLOLIGHT_SLD_CURSOR.PNG",com.masociete.express_mon_projet.R.drawable.activandroid_4_hololight_sld_cursor_13+23, "");
super.ajouterFichierAssocie("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ACTIVANDROID 4-HOLOLIGHT_SLD_BCKGRD.PNG",com.masociete.express_mon_projet.R.drawable.activandroid_4_hololight_sld_bckgrd_12+23, "");
super.ajouterFichierAssocie("C:\\Users\\G116-xx\\Desktop\\EXPRESS_Mon_Projet_1 - Copie\\ACTIVANDROID 4-HOLOLIGHT_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_mon_projet.R.drawable.activandroid_4_hololight_btn_std_11_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\LOGO_CALLO.PNG",com.masociete.express_mon_projet.R.drawable.logo_callo_10+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\BG_HYBRID_REPORT_BODY.PNG",com.masociete.express_mon_projet.R.drawable.bg_hybrid_report_body_9+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTUALISER.PNG",com.masociete.express_mon_projet.R.drawable.actualiser_8+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTIVANDROID 4-HOLODARK_SELECT.PNG?E5_3NP_4_4_4_4",com.masociete.express_mon_projet.R.drawable.activandroid_4_holodark_select_7_np3_4_4_4_4_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTIVANDROID 4-HOLODARK_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.express_mon_projet.R.drawable.activandroid_4_holodark_edt_6_np3_8_8_8_8_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTIVANDROID 4-HOLODARK_CBOX.PNG?E12_A6_Radio",com.masociete.express_mon_projet.R.drawable.activandroid_4_holodark_cbox_5_selector_anim+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTIVANDROID 4-HOLODARK_BTN_STD.PNG?E5_3NP_9_6_10_10",com.masociete.express_mon_projet.R.drawable.activandroid_4_holodark_btn_std_4_np3_9_6_10_10_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\G116-XX\\DESKTOP\\EXPRESS_MON_PROJET_1 - COPIE\\ACTIVANDROID 4-HOLODARK_BREAK.PNG",com.masociete.express_mon_projet.R.drawable.activandroid_4_holodark_break_3+23, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPEXPRESS_Mon_Projet_InitProjet( String [] args)
{
GWDPEXPRESS_Mon_Projet.ms_Project.initialiserProjet("EXPRESS_Mon_Projet", "EXPRESS_Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPEXPRESS_Mon_Projet_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPEXPRESS_Mon_Projet.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPEXPRESS_Mon_Projet_InitProjet(null);
}
public void run()
{

GWDPEXPRESS_Mon_Projet.ms_Project.lancerProjet("EXPRESS_FEN_1");
}
}
}
