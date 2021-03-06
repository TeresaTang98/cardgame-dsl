/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardPropertyType;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.GameRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.GameRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.GameRuleImpl#getItem <em>Item</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.cardgame.cardGameLanguage.impl.GameRuleImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameRuleImpl extends MinimalEObjectImpl.Container implements GameRule
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
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected CardPropertyType item;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GameRuleImpl()
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
    return CardGameLanguagePackage.Literals.GAME_RULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CardGameLanguagePackage.GAME_RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CardPropertyType getItem()
  {
    if (item != null && item.eIsProxy())
    {
      InternalEObject oldItem = (InternalEObject)item;
      item = (CardPropertyType)eResolveProxy(oldItem);
      if (item != oldItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CardGameLanguagePackage.GAME_RULE__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardPropertyType basicGetItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItem(CardPropertyType newItem)
  {
    CardPropertyType oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardGameLanguagePackage.GAME_RULE__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLevel(int newLevel)
  {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardGameLanguagePackage.GAME_RULE__LEVEL, oldLevel, level));
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
      case CardGameLanguagePackage.GAME_RULE__NAME:
        return getName();
      case CardGameLanguagePackage.GAME_RULE__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
      case CardGameLanguagePackage.GAME_RULE__LEVEL:
        return getLevel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CardGameLanguagePackage.GAME_RULE__NAME:
        setName((String)newValue);
        return;
      case CardGameLanguagePackage.GAME_RULE__ITEM:
        setItem((CardPropertyType)newValue);
        return;
      case CardGameLanguagePackage.GAME_RULE__LEVEL:
        setLevel((Integer)newValue);
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
      case CardGameLanguagePackage.GAME_RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CardGameLanguagePackage.GAME_RULE__ITEM:
        setItem((CardPropertyType)null);
        return;
      case CardGameLanguagePackage.GAME_RULE__LEVEL:
        setLevel(LEVEL_EDEFAULT);
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
      case CardGameLanguagePackage.GAME_RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CardGameLanguagePackage.GAME_RULE__ITEM:
        return item != null;
      case CardGameLanguagePackage.GAME_RULE__LEVEL:
        return level != LEVEL_EDEFAULT;
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
    result.append(", level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //GameRuleImpl
