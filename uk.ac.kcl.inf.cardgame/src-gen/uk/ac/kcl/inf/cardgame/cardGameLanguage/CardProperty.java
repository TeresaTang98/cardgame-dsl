/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardProperty#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardProperty()
 * @model
 * @generated
 */
public interface CardProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(CardPropertyType)
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardProperty_Type()
   * @model
   * @generated
   */
  CardPropertyType getType();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardProperty#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(CardPropertyType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#getCardProperty_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.CardProperty#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // CardProperty
