/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage
 * @generated
 */
public interface CardGameLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CardGameLanguageFactory eINSTANCE = uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Card Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Card Game</em>'.
   * @generated
   */
  CardGame createCardGame();

  /**
   * Returns a new object of class '<em>Card</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Card</em>'.
   * @generated
   */
  Card createCard();

  /**
   * Returns a new object of class '<em>Card Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Card Property</em>'.
   * @generated
   */
  CardProperty createCardProperty();

  /**
   * Returns a new object of class '<em>Card Property Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Card Property Type</em>'.
   * @generated
   */
  CardPropertyType createCardPropertyType();

  /**
   * Returns a new object of class '<em>Game Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game Rule</em>'.
   * @generated
   */
  GameRule createGameRule();

  /**
   * Returns a new object of class '<em>Single Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Rule</em>'.
   * @generated
   */
  SingleRule createSingleRule();

  /**
   * Returns a new object of class '<em>Equal Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal Rule</em>'.
   * @generated
   */
  EqualRule createEqualRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CardGameLanguagePackage getCardGameLanguagePackage();

} //CardGameLanguageFactory
