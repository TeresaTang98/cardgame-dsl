/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.cardGameLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.cardgame.cardGameLanguage.Card;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGame;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguageFactory;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardProperty;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.CardPropertyType;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.EqualRule;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.ExpressionKeyword;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.GameRule;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.PlayerRole;
import uk.ac.kcl.inf.cardgame.cardGameLanguage.SingleRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardGameLanguagePackageImpl extends EPackageImpl implements CardGameLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardGameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardPropertyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum expressionKeywordEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum playerRoleEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.cardgame.cardGameLanguage.CardGameLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CardGameLanguagePackageImpl()
  {
    super(eNS_URI, CardGameLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link CardGameLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CardGameLanguagePackage init()
  {
    if (isInited) return (CardGameLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(CardGameLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredCardGameLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    CardGameLanguagePackageImpl theCardGameLanguagePackage = registeredCardGameLanguagePackage instanceof CardGameLanguagePackageImpl ? (CardGameLanguagePackageImpl)registeredCardGameLanguagePackage : new CardGameLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theCardGameLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theCardGameLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCardGameLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CardGameLanguagePackage.eNS_URI, theCardGameLanguagePackage);
    return theCardGameLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCardGame()
  {
    return cardGameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardGame_Name()
  {
    return (EAttribute)cardGameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCardGame_Cardpropertytypes()
  {
    return (EReference)cardGameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCardGame_Cards()
  {
    return (EReference)cardGameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardGame_Number()
  {
    return (EAttribute)cardGameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCardGame_Rule()
  {
    return (EReference)cardGameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCard()
  {
    return cardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCard_Name()
  {
    return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCard_Definition()
  {
    return (EReference)cardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCardProperty()
  {
    return cardPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCardProperty_Type()
  {
    return (EReference)cardPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardProperty_Value()
  {
    return (EAttribute)cardPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCardPropertyType()
  {
    return cardPropertyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardPropertyType_Name()
  {
    return (EAttribute)cardPropertyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGameRule()
  {
    return gameRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGameRule_Name()
  {
    return (EAttribute)gameRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGameRule_Item()
  {
    return (EReference)gameRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGameRule_Level()
  {
    return (EAttribute)gameRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSingleRule()
  {
    return singleRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSingleRule_Role1()
  {
    return (EAttribute)singleRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSingleRule_Number1()
  {
    return (EAttribute)singleRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSingleRule_Keyword()
  {
    return (EAttribute)singleRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSingleRule_Role2()
  {
    return (EAttribute)singleRuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSingleRule_Number2()
  {
    return (EAttribute)singleRuleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEqualRule()
  {
    return equalRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEqualRule_Number()
  {
    return (EAttribute)equalRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getExpressionKeyword()
  {
    return expressionKeywordEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getPlayerRole()
  {
    return playerRoleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CardGameLanguageFactory getCardGameLanguageFactory()
  {
    return (CardGameLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cardGameEClass = createEClass(CARD_GAME);
    createEAttribute(cardGameEClass, CARD_GAME__NAME);
    createEReference(cardGameEClass, CARD_GAME__CARDPROPERTYTYPES);
    createEReference(cardGameEClass, CARD_GAME__CARDS);
    createEAttribute(cardGameEClass, CARD_GAME__NUMBER);
    createEReference(cardGameEClass, CARD_GAME__RULE);

    cardEClass = createEClass(CARD);
    createEAttribute(cardEClass, CARD__NAME);
    createEReference(cardEClass, CARD__DEFINITION);

    cardPropertyEClass = createEClass(CARD_PROPERTY);
    createEReference(cardPropertyEClass, CARD_PROPERTY__TYPE);
    createEAttribute(cardPropertyEClass, CARD_PROPERTY__VALUE);

    cardPropertyTypeEClass = createEClass(CARD_PROPERTY_TYPE);
    createEAttribute(cardPropertyTypeEClass, CARD_PROPERTY_TYPE__NAME);

    gameRuleEClass = createEClass(GAME_RULE);
    createEAttribute(gameRuleEClass, GAME_RULE__NAME);
    createEReference(gameRuleEClass, GAME_RULE__ITEM);
    createEAttribute(gameRuleEClass, GAME_RULE__LEVEL);

    singleRuleEClass = createEClass(SINGLE_RULE);
    createEAttribute(singleRuleEClass, SINGLE_RULE__ROLE1);
    createEAttribute(singleRuleEClass, SINGLE_RULE__NUMBER1);
    createEAttribute(singleRuleEClass, SINGLE_RULE__KEYWORD);
    createEAttribute(singleRuleEClass, SINGLE_RULE__ROLE2);
    createEAttribute(singleRuleEClass, SINGLE_RULE__NUMBER2);

    equalRuleEClass = createEClass(EQUAL_RULE);
    createEAttribute(equalRuleEClass, EQUAL_RULE__NUMBER);

    // Create enums
    expressionKeywordEEnum = createEEnum(EXPRESSION_KEYWORD);
    playerRoleEEnum = createEEnum(PLAYER_ROLE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    singleRuleEClass.getESuperTypes().add(this.getGameRule());
    equalRuleEClass.getESuperTypes().add(this.getGameRule());

    // Initialize classes and features; add operations and parameters
    initEClass(cardGameEClass, CardGame.class, "CardGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardGame_Name(), ecorePackage.getEString(), "name", null, 0, 1, CardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCardGame_Cardpropertytypes(), this.getCardPropertyType(), null, "cardpropertytypes", null, 0, -1, CardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCardGame_Cards(), this.getCard(), null, "cards", null, 0, -1, CardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardGame_Number(), ecorePackage.getEInt(), "number", null, 0, 1, CardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCardGame_Rule(), this.getGameRule(), null, "rule", null, 0, -1, CardGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCard_Name(), ecorePackage.getEString(), "name", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCard_Definition(), this.getCardProperty(), null, "definition", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardPropertyEClass, CardProperty.class, "CardProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCardProperty_Type(), this.getCardPropertyType(), null, "type", null, 0, 1, CardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardProperty_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardPropertyTypeEClass, CardPropertyType.class, "CardPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardPropertyType_Name(), ecorePackage.getEString(), "name", null, 0, 1, CardPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gameRuleEClass, GameRule.class, "GameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGameRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGameRule_Item(), this.getCardPropertyType(), null, "item", null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGameRule_Level(), ecorePackage.getEInt(), "level", null, 0, 1, GameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleRuleEClass, SingleRule.class, "SingleRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleRule_Role1(), this.getPlayerRole(), "role1", null, 0, 1, SingleRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleRule_Number1(), ecorePackage.getEInt(), "number1", null, 0, 1, SingleRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleRule_Keyword(), this.getExpressionKeyword(), "keyword", null, 0, 1, SingleRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleRule_Role2(), this.getPlayerRole(), "role2", null, 0, 1, SingleRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleRule_Number2(), ecorePackage.getEInt(), "number2", null, 0, 1, SingleRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalRuleEClass, EqualRule.class, "EqualRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEqualRule_Number(), ecorePackage.getEInt(), "number", null, 0, 1, EqualRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(expressionKeywordEEnum, ExpressionKeyword.class, "ExpressionKeyword");
    addEEnumLiteral(expressionKeywordEEnum, ExpressionKeyword.IS_BIGGER_THAN);
    addEEnumLiteral(expressionKeywordEEnum, ExpressionKeyword.IS_SMALLER_THAN);
    addEEnumLiteral(expressionKeywordEEnum, ExpressionKeyword.IS_EQUAL_TO);

    initEEnum(playerRoleEEnum, PlayerRole.class, "PlayerRole");
    addEEnumLiteral(playerRoleEEnum, PlayerRole.PLAYER);
    addEEnumLiteral(playerRoleEEnum, PlayerRole.COMPUTER);

    // Create resource
    createResource(eNS_URI);
  }

} //CardGameLanguagePackageImpl
