/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.cardgame;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CardGameLanguageStandaloneSetup extends CardGameLanguageStandaloneSetupGenerated {

	public static void doSetup() {
		new CardGameLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}