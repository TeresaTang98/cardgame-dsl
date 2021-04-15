/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.cardgame.cardGameLanguage.Card;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardPropertyType;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.GameRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameImpl#getCardpropertytypes <em>Cardpropertytypes</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameImpl#getCards <em>Cards</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.CardGameImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardGameImpl extends MinimalEObjectImpl.Container implements CardGame
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCardpropertytypes() <em>Cardpropertytypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardpropertytypes()
   * @generated
   * @ordered
   */
  protected EList<CardPropertyType> cardpropertytypes;

  /**
   * The cached value of the '{@link #getCards() <em>Cards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCards()
   * @generated
   * @ordered
   */
  protected EList<Card> cards;

  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected int number = NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected EList<GameRule> rule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CardGameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CardGameLanguagePackage.Literals.CARD_GAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardGameLanguagePackage.CARD_GAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CardPropertyType> getCardpropertytypes()
  {
    if (cardpropertytypes == null)
    {
      cardpropertytypes = new EObjectContainmentEList<CardPropertyType>(CardPropertyType.class, this, CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES);
    }
    return cardpropertytypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Card> getCards()
  {
    if (cards == null)
    {
      cards = new EObjectContainmentEList<Card>(Card.class, this, CardGameLanguagePackage.CARD_GAME__CARDS);
    }
    return cards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber(int newNumber)
  {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardGameLanguagePackage.CARD_GAME__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GameRule> getRule()
  {
    if (rule == null)
    {
      rule = new EObjectContainmentEList<GameRule>(GameRule.class, this, CardGameLanguagePackage.CARD_GAME__RULE);
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES:
        return ((InternalEList<?>)getCardpropertytypes()).basicRemove(otherEnd, msgs);
      case CardGameLanguagePackage.CARD_GAME__CARDS:
        return ((InternalEList<?>)getCards()).basicRemove(otherEnd, msgs);
      case CardGameLanguagePackage.CARD_GAME__RULE:
        return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.CARD_GAME__NAME:
        return getName();
      case CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES:
        return getCardpropertytypes();
      case CardGameLanguagePackage.CARD_GAME__CARDS:
        return getCards();
      case CardGameLanguagePackage.CARD_GAME__NUMBER:
        return getNumber();
      case CardGameLanguagePackage.CARD_GAME__RULE:
        return getRule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.CARD_GAME__NAME:
        setName((String)newValue);
        return;
      case CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES:
        getCardpropertytypes().clear();
        getCardpropertytypes().addAll((Collection<? extends CardPropertyType>)newValue);
        return;
      case CardGameLanguagePackage.CARD_GAME__CARDS:
        getCards().clear();
        getCards().addAll((Collection<? extends Card>)newValue);
        return;
      case CardGameLanguagePackage.CARD_GAME__NUMBER:
        setNumber((Integer)newValue);
        return;
      case CardGameLanguagePackage.CARD_GAME__RULE:
        getRule().clear();
        getRule().addAll((Collection<? extends GameRule>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.CARD_GAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES:
        getCardpropertytypes().clear();
        return;
      case CardGameLanguagePackage.CARD_GAME__CARDS:
        getCards().clear();
        return;
      case CardGameLanguagePackage.CARD_GAME__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case CardGameLanguagePackage.CARD_GAME__RULE:
        getRule().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.CARD_GAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CardGameLanguagePackage.CARD_GAME__CARDPROPERTYTYPES:
        return cardpropertytypes != null && !cardpropertytypes.isEmpty();
      case CardGameLanguagePackage.CARD_GAME__CARDS:
        return cards != null && !cards.isEmpty();
      case CardGameLanguagePackage.CARD_GAME__NUMBER:
        return number != NUMBER_EDEFAULT;
      case CardGameLanguagePackage.CARD_GAME__RULE:
        return rule != null && !rule.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //CardGameImpl