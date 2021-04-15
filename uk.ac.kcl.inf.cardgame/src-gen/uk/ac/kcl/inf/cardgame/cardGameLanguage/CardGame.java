/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getCardpropertytypes <em>Cardpropertytypes</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getCards <em>Cards</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getNumber <em>Number</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame()
 * @model
 * @generated
 */
public interface CardGame extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cardpropertytypes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardPropertyType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardpropertytypes</em>' containment reference list.
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame_Cardpropertytypes()
   * @model containment="true"
   * @generated
   */
  EList<CardPropertyType> getCardpropertytypes();

  /**
   * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.cardgame.cardGameLanguage.Card}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cards</em>' containment reference list.
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame_Cards()
   * @model containment="true"
   * @generated
   */
  EList<Card> getCards();

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.cardgame.cardGameLanguage.GameRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardGame_Rule()
   * @model containment="true"
   * @generated
   */
  EList<GameRule> getRule();

} // CardGame