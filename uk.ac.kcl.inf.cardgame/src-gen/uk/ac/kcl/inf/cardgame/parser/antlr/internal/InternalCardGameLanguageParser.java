package uk.ac.kcl.inf.cardgame.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.cardgame.services.CardGameLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCardGameLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Properties'", "'{'", "','", "'}'", "'HoleCardNumber'", "'('", "')'", "'GameRule'", "'Card'", "':'", "'SingleRule'", "'No.'", "'level'", "'EqualRule'", "'ComparedCardsNum'", "'ComparedItem'", "'isBiggerThan'", "'isSmallerThan'", "'isEqualTo'", "'Player'", "'Computer'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCardGameLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCardGameLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCardGameLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCardGameLanguage.g"; }



     	private CardGameLanguageGrammarAccess grammarAccess;

        public InternalCardGameLanguageParser(TokenStream input, CardGameLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CardGame";
       	}

       	@Override
       	protected CardGameLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCardGame"
    // InternalCardGameLanguage.g:65:1: entryRuleCardGame returns [EObject current=null] : iv_ruleCardGame= ruleCardGame EOF ;
    public final EObject entryRuleCardGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardGame = null;


        try {
            // InternalCardGameLanguage.g:65:49: (iv_ruleCardGame= ruleCardGame EOF )
            // InternalCardGameLanguage.g:66:2: iv_ruleCardGame= ruleCardGame EOF
            {
             newCompositeNode(grammarAccess.getCardGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardGame=ruleCardGame();

            state._fsp--;

             current =iv_ruleCardGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardGame"


    // $ANTLR start "ruleCardGame"
    // InternalCardGameLanguage.g:72:1: ruleCardGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )? ( (lv_cards_8_0= ruleCard ) )* otherlv_9= 'HoleCardNumber' otherlv_10= '(' ( (lv_number_11_0= RULE_INT ) ) otherlv_12= ')' (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleCardGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_number_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_cardpropertytypes_4_0 = null;

        EObject lv_cardpropertytypes_6_0 = null;

        EObject lv_cards_8_0 = null;

        EObject lv_rule_15_0 = null;

        EObject lv_rule_17_0 = null;



        	enterRule();

        try {
            // InternalCardGameLanguage.g:78:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )? ( (lv_cards_8_0= ruleCard ) )* otherlv_9= 'HoleCardNumber' otherlv_10= '(' ( (lv_number_11_0= RULE_INT ) ) otherlv_12= ')' (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )? ) )
            // InternalCardGameLanguage.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )? ( (lv_cards_8_0= ruleCard ) )* otherlv_9= 'HoleCardNumber' otherlv_10= '(' ( (lv_number_11_0= RULE_INT ) ) otherlv_12= ')' (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )? )
            {
            // InternalCardGameLanguage.g:79:2: (otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )? ( (lv_cards_8_0= ruleCard ) )* otherlv_9= 'HoleCardNumber' otherlv_10= '(' ( (lv_number_11_0= RULE_INT ) ) otherlv_12= ')' (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )? )
            // InternalCardGameLanguage.g:80:3: otherlv_0= 'Game' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )? ( (lv_cards_8_0= ruleCard ) )* otherlv_9= 'HoleCardNumber' otherlv_10= '(' ( (lv_number_11_0= RULE_INT ) ) otherlv_12= ')' (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardGameAccess().getGameKeyword_0());
            		
            // InternalCardGameLanguage.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCardGameLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalCardGameLanguage.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCardGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCardGameLanguage.g:102:3: (otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCardGameLanguage.g:103:4: otherlv_2= 'Properties' otherlv_3= '{' ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) ) (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCardGameAccess().getPropertiesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalCardGameLanguage.g:111:4: ( (lv_cardpropertytypes_4_0= ruleCardPropertyType ) )
                    // InternalCardGameLanguage.g:112:5: (lv_cardpropertytypes_4_0= ruleCardPropertyType )
                    {
                    // InternalCardGameLanguage.g:112:5: (lv_cardpropertytypes_4_0= ruleCardPropertyType )
                    // InternalCardGameLanguage.g:113:6: lv_cardpropertytypes_4_0= ruleCardPropertyType
                    {

                    						newCompositeNode(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_cardpropertytypes_4_0=ruleCardPropertyType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardGameRule());
                    						}
                    						add(
                    							current,
                    							"cardpropertytypes",
                    							lv_cardpropertytypes_4_0,
                    							"uk.ac.kcl.inf.cardgame.CardGameLanguage.CardPropertyType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCardGameLanguage.g:130:4: (otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCardGameLanguage.g:131:5: otherlv_5= ',' ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCardGameAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalCardGameLanguage.g:135:5: ( (lv_cardpropertytypes_6_0= ruleCardPropertyType ) )
                    	    // InternalCardGameLanguage.g:136:6: (lv_cardpropertytypes_6_0= ruleCardPropertyType )
                    	    {
                    	    // InternalCardGameLanguage.g:136:6: (lv_cardpropertytypes_6_0= ruleCardPropertyType )
                    	    // InternalCardGameLanguage.g:137:7: lv_cardpropertytypes_6_0= ruleCardPropertyType
                    	    {

                    	    							newCompositeNode(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_cardpropertytypes_6_0=ruleCardPropertyType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCardGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cardpropertytypes",
                    	    								lv_cardpropertytypes_6_0,
                    	    								"uk.ac.kcl.inf.cardgame.CardGameLanguage.CardPropertyType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalCardGameLanguage.g:160:3: ( (lv_cards_8_0= ruleCard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCardGameLanguage.g:161:4: (lv_cards_8_0= ruleCard )
            	    {
            	    // InternalCardGameLanguage.g:161:4: (lv_cards_8_0= ruleCard )
            	    // InternalCardGameLanguage.g:162:5: lv_cards_8_0= ruleCard
            	    {

            	    					newCompositeNode(grammarAccess.getCardGameAccess().getCardsCardParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_cards_8_0=ruleCard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCardGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cards",
            	    						lv_cards_8_0,
            	    						"uk.ac.kcl.inf.cardgame.CardGameLanguage.Card");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCardGameAccess().getHoleCardNumberKeyword_4());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getCardGameAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCardGameLanguage.g:187:3: ( (lv_number_11_0= RULE_INT ) )
            // InternalCardGameLanguage.g:188:4: (lv_number_11_0= RULE_INT )
            {
            // InternalCardGameLanguage.g:188:4: (lv_number_11_0= RULE_INT )
            // InternalCardGameLanguage.g:189:5: lv_number_11_0= RULE_INT
            {
            lv_number_11_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_number_11_0, grammarAccess.getCardGameAccess().getNumberINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getCardGameAccess().getRightParenthesisKeyword_7());
            		
            // InternalCardGameLanguage.g:209:3: (otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCardGameLanguage.g:210:4: otherlv_13= 'GameRule' otherlv_14= '{' ( (lv_rule_15_0= ruleGameRule ) ) (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getCardGameAccess().getGameRuleKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCardGameLanguage.g:218:4: ( (lv_rule_15_0= ruleGameRule ) )
                    // InternalCardGameLanguage.g:219:5: (lv_rule_15_0= ruleGameRule )
                    {
                    // InternalCardGameLanguage.g:219:5: (lv_rule_15_0= ruleGameRule )
                    // InternalCardGameLanguage.g:220:6: lv_rule_15_0= ruleGameRule
                    {

                    						newCompositeNode(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rule_15_0=ruleGameRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardGameRule());
                    						}
                    						add(
                    							current,
                    							"rule",
                    							lv_rule_15_0,
                    							"uk.ac.kcl.inf.cardgame.CardGameLanguage.GameRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCardGameLanguage.g:237:4: (otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCardGameLanguage.g:238:5: otherlv_16= ',' ( (lv_rule_17_0= ruleGameRule ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getCardGameAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCardGameLanguage.g:242:5: ( (lv_rule_17_0= ruleGameRule ) )
                    	    // InternalCardGameLanguage.g:243:6: (lv_rule_17_0= ruleGameRule )
                    	    {
                    	    // InternalCardGameLanguage.g:243:6: (lv_rule_17_0= ruleGameRule )
                    	    // InternalCardGameLanguage.g:244:7: lv_rule_17_0= ruleGameRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rule_17_0=ruleGameRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCardGameRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rule",
                    	    								lv_rule_17_0,
                    	    								"uk.ac.kcl.inf.cardgame.CardGameLanguage.GameRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardGame"


    // $ANTLR start "entryRuleCard"
    // InternalCardGameLanguage.g:271:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // InternalCardGameLanguage.g:271:45: (iv_ruleCard= ruleCard EOF )
            // InternalCardGameLanguage.g:272:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalCardGameLanguage.g:278:1: ruleCard returns [EObject current=null] : (otherlv_0= 'Card' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definition_3_0= ruleCardProperty ) ) (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )* (otherlv_6= '}' )? ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_definition_3_0 = null;

        EObject lv_definition_5_0 = null;



        	enterRule();

        try {
            // InternalCardGameLanguage.g:284:2: ( (otherlv_0= 'Card' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definition_3_0= ruleCardProperty ) ) (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )* (otherlv_6= '}' )? ) )
            // InternalCardGameLanguage.g:285:2: (otherlv_0= 'Card' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definition_3_0= ruleCardProperty ) ) (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )* (otherlv_6= '}' )? )
            {
            // InternalCardGameLanguage.g:285:2: (otherlv_0= 'Card' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definition_3_0= ruleCardProperty ) ) (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )* (otherlv_6= '}' )? )
            // InternalCardGameLanguage.g:286:3: otherlv_0= 'Card' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_definition_3_0= ruleCardProperty ) ) (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )* (otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardAccess().getCardKeyword_0());
            		
            // InternalCardGameLanguage.g:290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCardGameLanguage.g:291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:291:4: (lv_name_1_0= RULE_ID )
            // InternalCardGameLanguage.g:292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCardAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCardGameLanguage.g:312:3: ( (lv_definition_3_0= ruleCardProperty ) )
            // InternalCardGameLanguage.g:313:4: (lv_definition_3_0= ruleCardProperty )
            {
            // InternalCardGameLanguage.g:313:4: (lv_definition_3_0= ruleCardProperty )
            // InternalCardGameLanguage.g:314:5: lv_definition_3_0= ruleCardProperty
            {

            					newCompositeNode(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_definition_3_0=ruleCardProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardRule());
            					}
            					add(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"uk.ac.kcl.inf.cardgame.CardGameLanguage.CardProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCardGameLanguage.g:331:3: (otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCardGameLanguage.g:332:4: otherlv_4= ',' ( (lv_definition_5_0= ruleCardProperty ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCardAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCardGameLanguage.g:336:4: ( (lv_definition_5_0= ruleCardProperty ) )
            	    // InternalCardGameLanguage.g:337:5: (lv_definition_5_0= ruleCardProperty )
            	    {
            	    // InternalCardGameLanguage.g:337:5: (lv_definition_5_0= ruleCardProperty )
            	    // InternalCardGameLanguage.g:338:6: lv_definition_5_0= ruleCardProperty
            	    {

            	    						newCompositeNode(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_definition_5_0=ruleCardProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCardRule());
            	    						}
            	    						add(
            	    							current,
            	    							"definition",
            	    							lv_definition_5_0,
            	    							"uk.ac.kcl.inf.cardgame.CardGameLanguage.CardProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCardGameLanguage.g:356:3: (otherlv_6= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCardGameLanguage.g:357:4: otherlv_6= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleCardProperty"
    // InternalCardGameLanguage.g:366:1: entryRuleCardProperty returns [EObject current=null] : iv_ruleCardProperty= ruleCardProperty EOF ;
    public final EObject entryRuleCardProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardProperty = null;


        try {
            // InternalCardGameLanguage.g:366:53: (iv_ruleCardProperty= ruleCardProperty EOF )
            // InternalCardGameLanguage.g:367:2: iv_ruleCardProperty= ruleCardProperty EOF
            {
             newCompositeNode(grammarAccess.getCardPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardProperty=ruleCardProperty();

            state._fsp--;

             current =iv_ruleCardProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardProperty"


    // $ANTLR start "ruleCardProperty"
    // InternalCardGameLanguage.g:373:1: ruleCardProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCardProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCardGameLanguage.g:379:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )? ) )
            // InternalCardGameLanguage.g:380:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )? )
            {
            // InternalCardGameLanguage.g:380:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )? )
            // InternalCardGameLanguage.g:381:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )?
            {
            // InternalCardGameLanguage.g:381:3: ( (otherlv_0= RULE_ID ) )
            // InternalCardGameLanguage.g:382:4: (otherlv_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:382:4: (otherlv_0= RULE_ID )
            // InternalCardGameLanguage.g:383:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getCardPropertyAccess().getTypeCardPropertyTypeCrossReference_0_0());
            				

            }


            }

            // InternalCardGameLanguage.g:394:3: (otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCardGameLanguage.g:395:4: otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardPropertyAccess().getColonKeyword_1_0());
                    			
                    // InternalCardGameLanguage.g:399:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalCardGameLanguage.g:400:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalCardGameLanguage.g:400:5: (lv_value_2_0= RULE_INT )
                    // InternalCardGameLanguage.g:401:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getCardPropertyAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardProperty"


    // $ANTLR start "entryRuleCardPropertyType"
    // InternalCardGameLanguage.g:422:1: entryRuleCardPropertyType returns [EObject current=null] : iv_ruleCardPropertyType= ruleCardPropertyType EOF ;
    public final EObject entryRuleCardPropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardPropertyType = null;


        try {
            // InternalCardGameLanguage.g:422:57: (iv_ruleCardPropertyType= ruleCardPropertyType EOF )
            // InternalCardGameLanguage.g:423:2: iv_ruleCardPropertyType= ruleCardPropertyType EOF
            {
             newCompositeNode(grammarAccess.getCardPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardPropertyType=ruleCardPropertyType();

            state._fsp--;

             current =iv_ruleCardPropertyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardPropertyType"


    // $ANTLR start "ruleCardPropertyType"
    // InternalCardGameLanguage.g:429:1: ruleCardPropertyType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCardPropertyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCardGameLanguage.g:435:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCardGameLanguage.g:436:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCardGameLanguage.g:436:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCardGameLanguage.g:437:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:437:3: (lv_name_0_0= RULE_ID )
            // InternalCardGameLanguage.g:438:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCardPropertyTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCardPropertyTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardPropertyType"


    // $ANTLR start "entryRuleGameRule"
    // InternalCardGameLanguage.g:457:1: entryRuleGameRule returns [EObject current=null] : iv_ruleGameRule= ruleGameRule EOF ;
    public final EObject entryRuleGameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameRule = null;


        try {
            // InternalCardGameLanguage.g:457:49: (iv_ruleGameRule= ruleGameRule EOF )
            // InternalCardGameLanguage.g:458:2: iv_ruleGameRule= ruleGameRule EOF
            {
             newCompositeNode(grammarAccess.getGameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameRule=ruleGameRule();

            state._fsp--;

             current =iv_ruleGameRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameRule"


    // $ANTLR start "ruleGameRule"
    // InternalCardGameLanguage.g:464:1: ruleGameRule returns [EObject current=null] : (this_SingleRule_0= ruleSingleRule | this_EqualRule_1= ruleEqualRule ) ;
    public final EObject ruleGameRule() throws RecognitionException {
        EObject current = null;

        EObject this_SingleRule_0 = null;

        EObject this_EqualRule_1 = null;



        	enterRule();

        try {
            // InternalCardGameLanguage.g:470:2: ( (this_SingleRule_0= ruleSingleRule | this_EqualRule_1= ruleEqualRule ) )
            // InternalCardGameLanguage.g:471:2: (this_SingleRule_0= ruleSingleRule | this_EqualRule_1= ruleEqualRule )
            {
            // InternalCardGameLanguage.g:471:2: (this_SingleRule_0= ruleSingleRule | this_EqualRule_1= ruleEqualRule )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCardGameLanguage.g:472:3: this_SingleRule_0= ruleSingleRule
                    {

                    			newCompositeNode(grammarAccess.getGameRuleAccess().getSingleRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleRule_0=ruleSingleRule();

                    state._fsp--;


                    			current = this_SingleRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:481:3: this_EqualRule_1= ruleEqualRule
                    {

                    			newCompositeNode(grammarAccess.getGameRuleAccess().getEqualRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualRule_1=ruleEqualRule();

                    state._fsp--;


                    			current = this_EqualRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameRule"


    // $ANTLR start "entryRuleSingleRule"
    // InternalCardGameLanguage.g:493:1: entryRuleSingleRule returns [EObject current=null] : iv_ruleSingleRule= ruleSingleRule EOF ;
    public final EObject entryRuleSingleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRule = null;


        try {
            // InternalCardGameLanguage.g:493:51: (iv_ruleSingleRule= ruleSingleRule EOF )
            // InternalCardGameLanguage.g:494:2: iv_ruleSingleRule= ruleSingleRule EOF
            {
             newCompositeNode(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleRule=ruleSingleRule();

            state._fsp--;

             current =iv_ruleSingleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleRule"


    // $ANTLR start "ruleSingleRule"
    // InternalCardGameLanguage.g:500:1: ruleSingleRule returns [EObject current=null] : (otherlv_0= 'SingleRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role1_3_0= rulePlayerRole ) ) otherlv_4= 'No.' ( (lv_number1_5_0= RULE_INT ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_keyword_7_0= ruleExpressionKeyword ) ) ( (lv_role2_8_0= rulePlayerRole ) ) otherlv_9= 'No.' ( (lv_number2_10_0= RULE_INT ) )? otherlv_11= 'level' ( (lv_level_12_0= RULE_INT ) ) otherlv_13= '}' ) ;
    public final EObject ruleSingleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_number1_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token lv_number2_10_0=null;
        Token otherlv_11=null;
        Token lv_level_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_role1_3_0 = null;

        Enumerator lv_keyword_7_0 = null;

        Enumerator lv_role2_8_0 = null;



        	enterRule();

        try {
            // InternalCardGameLanguage.g:506:2: ( (otherlv_0= 'SingleRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role1_3_0= rulePlayerRole ) ) otherlv_4= 'No.' ( (lv_number1_5_0= RULE_INT ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_keyword_7_0= ruleExpressionKeyword ) ) ( (lv_role2_8_0= rulePlayerRole ) ) otherlv_9= 'No.' ( (lv_number2_10_0= RULE_INT ) )? otherlv_11= 'level' ( (lv_level_12_0= RULE_INT ) ) otherlv_13= '}' ) )
            // InternalCardGameLanguage.g:507:2: (otherlv_0= 'SingleRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role1_3_0= rulePlayerRole ) ) otherlv_4= 'No.' ( (lv_number1_5_0= RULE_INT ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_keyword_7_0= ruleExpressionKeyword ) ) ( (lv_role2_8_0= rulePlayerRole ) ) otherlv_9= 'No.' ( (lv_number2_10_0= RULE_INT ) )? otherlv_11= 'level' ( (lv_level_12_0= RULE_INT ) ) otherlv_13= '}' )
            {
            // InternalCardGameLanguage.g:507:2: (otherlv_0= 'SingleRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role1_3_0= rulePlayerRole ) ) otherlv_4= 'No.' ( (lv_number1_5_0= RULE_INT ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_keyword_7_0= ruleExpressionKeyword ) ) ( (lv_role2_8_0= rulePlayerRole ) ) otherlv_9= 'No.' ( (lv_number2_10_0= RULE_INT ) )? otherlv_11= 'level' ( (lv_level_12_0= RULE_INT ) ) otherlv_13= '}' )
            // InternalCardGameLanguage.g:508:3: otherlv_0= 'SingleRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_role1_3_0= rulePlayerRole ) ) otherlv_4= 'No.' ( (lv_number1_5_0= RULE_INT ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_keyword_7_0= ruleExpressionKeyword ) ) ( (lv_role2_8_0= rulePlayerRole ) ) otherlv_9= 'No.' ( (lv_number2_10_0= RULE_INT ) )? otherlv_11= 'level' ( (lv_level_12_0= RULE_INT ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleRuleAccess().getSingleRuleKeyword_0());
            		
            // InternalCardGameLanguage.g:512:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCardGameLanguage.g:513:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:513:4: (lv_name_1_0= RULE_ID )
            // InternalCardGameLanguage.g:514:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCardGameLanguage.g:534:3: ( (lv_role1_3_0= rulePlayerRole ) )
            // InternalCardGameLanguage.g:535:4: (lv_role1_3_0= rulePlayerRole )
            {
            // InternalCardGameLanguage.g:535:4: (lv_role1_3_0= rulePlayerRole )
            // InternalCardGameLanguage.g:536:5: lv_role1_3_0= rulePlayerRole
            {

            					newCompositeNode(grammarAccess.getSingleRuleAccess().getRole1PlayerRoleEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_role1_3_0=rulePlayerRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
            					}
            					set(
            						current,
            						"role1",
            						lv_role1_3_0,
            						"uk.ac.kcl.inf.cardgame.CardGameLanguage.PlayerRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSingleRuleAccess().getNoKeyword_4());
            		
            // InternalCardGameLanguage.g:557:3: ( (lv_number1_5_0= RULE_INT ) )
            // InternalCardGameLanguage.g:558:4: (lv_number1_5_0= RULE_INT )
            {
            // InternalCardGameLanguage.g:558:4: (lv_number1_5_0= RULE_INT )
            // InternalCardGameLanguage.g:559:5: lv_number1_5_0= RULE_INT
            {
            lv_number1_5_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_number1_5_0, grammarAccess.getSingleRuleAccess().getNumber1INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number1",
            						lv_number1_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCardGameLanguage.g:575:3: ( (otherlv_6= RULE_ID ) )
            // InternalCardGameLanguage.g:576:4: (otherlv_6= RULE_ID )
            {
            // InternalCardGameLanguage.g:576:4: (otherlv_6= RULE_ID )
            // InternalCardGameLanguage.g:577:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRuleRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getSingleRuleAccess().getItemCardPropertyTypeCrossReference_6_0());
            				

            }


            }

            // InternalCardGameLanguage.g:588:3: ( (lv_keyword_7_0= ruleExpressionKeyword ) )
            // InternalCardGameLanguage.g:589:4: (lv_keyword_7_0= ruleExpressionKeyword )
            {
            // InternalCardGameLanguage.g:589:4: (lv_keyword_7_0= ruleExpressionKeyword )
            // InternalCardGameLanguage.g:590:5: lv_keyword_7_0= ruleExpressionKeyword
            {

            					newCompositeNode(grammarAccess.getSingleRuleAccess().getKeywordExpressionKeywordEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_keyword_7_0=ruleExpressionKeyword();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
            					}
            					set(
            						current,
            						"keyword",
            						lv_keyword_7_0,
            						"uk.ac.kcl.inf.cardgame.CardGameLanguage.ExpressionKeyword");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCardGameLanguage.g:607:3: ( (lv_role2_8_0= rulePlayerRole ) )
            // InternalCardGameLanguage.g:608:4: (lv_role2_8_0= rulePlayerRole )
            {
            // InternalCardGameLanguage.g:608:4: (lv_role2_8_0= rulePlayerRole )
            // InternalCardGameLanguage.g:609:5: lv_role2_8_0= rulePlayerRole
            {

            					newCompositeNode(grammarAccess.getSingleRuleAccess().getRole2PlayerRoleEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_16);
            lv_role2_8_0=rulePlayerRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRuleRule());
            					}
            					set(
            						current,
            						"role2",
            						lv_role2_8_0,
            						"uk.ac.kcl.inf.cardgame.CardGameLanguage.PlayerRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getSingleRuleAccess().getNoKeyword_9());
            		
            // InternalCardGameLanguage.g:630:3: ( (lv_number2_10_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCardGameLanguage.g:631:4: (lv_number2_10_0= RULE_INT )
                    {
                    // InternalCardGameLanguage.g:631:4: (lv_number2_10_0= RULE_INT )
                    // InternalCardGameLanguage.g:632:5: lv_number2_10_0= RULE_INT
                    {
                    lv_number2_10_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    					newLeafNode(lv_number2_10_0, grammarAccess.getSingleRuleAccess().getNumber2INTTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number2",
                    						lv_number2_10_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getSingleRuleAccess().getLevelKeyword_11());
            		
            // InternalCardGameLanguage.g:652:3: ( (lv_level_12_0= RULE_INT ) )
            // InternalCardGameLanguage.g:653:4: (lv_level_12_0= RULE_INT )
            {
            // InternalCardGameLanguage.g:653:4: (lv_level_12_0= RULE_INT )
            // InternalCardGameLanguage.g:654:5: lv_level_12_0= RULE_INT
            {
            lv_level_12_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_level_12_0, grammarAccess.getSingleRuleAccess().getLevelINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleRule"


    // $ANTLR start "entryRuleEqualRule"
    // InternalCardGameLanguage.g:678:1: entryRuleEqualRule returns [EObject current=null] : iv_ruleEqualRule= ruleEqualRule EOF ;
    public final EObject entryRuleEqualRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualRule = null;


        try {
            // InternalCardGameLanguage.g:678:50: (iv_ruleEqualRule= ruleEqualRule EOF )
            // InternalCardGameLanguage.g:679:2: iv_ruleEqualRule= ruleEqualRule EOF
            {
             newCompositeNode(grammarAccess.getEqualRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualRule=ruleEqualRule();

            state._fsp--;

             current =iv_ruleEqualRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualRule"


    // $ANTLR start "ruleEqualRule"
    // InternalCardGameLanguage.g:685:1: ruleEqualRule returns [EObject current=null] : (otherlv_0= 'EqualRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ComparedCardsNum' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'ComparedItem' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'level' ( (lv_level_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleEqualRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_number_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_level_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalCardGameLanguage.g:691:2: ( (otherlv_0= 'EqualRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ComparedCardsNum' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'ComparedItem' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'level' ( (lv_level_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalCardGameLanguage.g:692:2: (otherlv_0= 'EqualRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ComparedCardsNum' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'ComparedItem' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'level' ( (lv_level_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalCardGameLanguage.g:692:2: (otherlv_0= 'EqualRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ComparedCardsNum' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'ComparedItem' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'level' ( (lv_level_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalCardGameLanguage.g:693:3: otherlv_0= 'EqualRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'ComparedCardsNum' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'ComparedItem' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'level' ( (lv_level_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualRuleAccess().getEqualRuleKeyword_0());
            		
            // InternalCardGameLanguage.g:697:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCardGameLanguage.g:698:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCardGameLanguage.g:698:4: (lv_name_1_0= RULE_ID )
            // InternalCardGameLanguage.g:699:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEqualRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getEqualRuleAccess().getComparedCardsNumKeyword_3());
            		
            // InternalCardGameLanguage.g:723:3: ( (lv_number_4_0= RULE_INT ) )
            // InternalCardGameLanguage.g:724:4: (lv_number_4_0= RULE_INT )
            {
            // InternalCardGameLanguage.g:724:4: (lv_number_4_0= RULE_INT )
            // InternalCardGameLanguage.g:725:5: lv_number_4_0= RULE_INT
            {
            lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_number_4_0, grammarAccess.getEqualRuleAccess().getNumberINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getEqualRuleAccess().getComparedItemKeyword_5());
            		
            // InternalCardGameLanguage.g:745:3: ( (otherlv_6= RULE_ID ) )
            // InternalCardGameLanguage.g:746:4: (otherlv_6= RULE_ID )
            {
            // InternalCardGameLanguage.g:746:4: (otherlv_6= RULE_ID )
            // InternalCardGameLanguage.g:747:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRuleRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_6, grammarAccess.getEqualRuleAccess().getItemCardPropertyTypeCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getEqualRuleAccess().getLevelKeyword_7());
            		
            // InternalCardGameLanguage.g:762:3: ( (lv_level_8_0= RULE_INT ) )
            // InternalCardGameLanguage.g:763:4: (lv_level_8_0= RULE_INT )
            {
            // InternalCardGameLanguage.g:763:4: (lv_level_8_0= RULE_INT )
            // InternalCardGameLanguage.g:764:5: lv_level_8_0= RULE_INT
            {
            lv_level_8_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_level_8_0, grammarAccess.getEqualRuleAccess().getLevelINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEqualRuleAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualRule"


    // $ANTLR start "ruleExpressionKeyword"
    // InternalCardGameLanguage.g:788:1: ruleExpressionKeyword returns [Enumerator current=null] : ( (enumLiteral_0= 'isBiggerThan' ) | (enumLiteral_1= 'isSmallerThan' ) | (enumLiteral_2= 'isEqualTo' ) ) ;
    public final Enumerator ruleExpressionKeyword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCardGameLanguage.g:794:2: ( ( (enumLiteral_0= 'isBiggerThan' ) | (enumLiteral_1= 'isSmallerThan' ) | (enumLiteral_2= 'isEqualTo' ) ) )
            // InternalCardGameLanguage.g:795:2: ( (enumLiteral_0= 'isBiggerThan' ) | (enumLiteral_1= 'isSmallerThan' ) | (enumLiteral_2= 'isEqualTo' ) )
            {
            // InternalCardGameLanguage.g:795:2: ( (enumLiteral_0= 'isBiggerThan' ) | (enumLiteral_1= 'isSmallerThan' ) | (enumLiteral_2= 'isEqualTo' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCardGameLanguage.g:796:3: (enumLiteral_0= 'isBiggerThan' )
                    {
                    // InternalCardGameLanguage.g:796:3: (enumLiteral_0= 'isBiggerThan' )
                    // InternalCardGameLanguage.g:797:4: enumLiteral_0= 'isBiggerThan'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getExpressionKeywordAccess().getIsBiggerThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExpressionKeywordAccess().getIsBiggerThanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:804:3: (enumLiteral_1= 'isSmallerThan' )
                    {
                    // InternalCardGameLanguage.g:804:3: (enumLiteral_1= 'isSmallerThan' )
                    // InternalCardGameLanguage.g:805:4: enumLiteral_1= 'isSmallerThan'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getExpressionKeywordAccess().getIsSmallerThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExpressionKeywordAccess().getIsSmallerThanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCardGameLanguage.g:812:3: (enumLiteral_2= 'isEqualTo' )
                    {
                    // InternalCardGameLanguage.g:812:3: (enumLiteral_2= 'isEqualTo' )
                    // InternalCardGameLanguage.g:813:4: enumLiteral_2= 'isEqualTo'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getExpressionKeywordAccess().getIsEqualToEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExpressionKeywordAccess().getIsEqualToEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionKeyword"


    // $ANTLR start "rulePlayerRole"
    // InternalCardGameLanguage.g:823:1: rulePlayerRole returns [Enumerator current=null] : ( (enumLiteral_0= 'Player' ) | (enumLiteral_1= 'Computer' ) ) ;
    public final Enumerator rulePlayerRole() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCardGameLanguage.g:829:2: ( ( (enumLiteral_0= 'Player' ) | (enumLiteral_1= 'Computer' ) ) )
            // InternalCardGameLanguage.g:830:2: ( (enumLiteral_0= 'Player' ) | (enumLiteral_1= 'Computer' ) )
            {
            // InternalCardGameLanguage.g:830:2: ( (enumLiteral_0= 'Player' ) | (enumLiteral_1= 'Computer' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCardGameLanguage.g:831:3: (enumLiteral_0= 'Player' )
                    {
                    // InternalCardGameLanguage.g:831:3: (enumLiteral_0= 'Player' )
                    // InternalCardGameLanguage.g:832:4: enumLiteral_0= 'Player'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPlayerRoleAccess().getPlayerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlayerRoleAccess().getPlayerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:839:3: (enumLiteral_1= 'Computer' )
                    {
                    // InternalCardGameLanguage.g:839:3: (enumLiteral_1= 'Computer' )
                    // InternalCardGameLanguage.g:840:4: enumLiteral_1= 'Computer'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPlayerRoleAccess().getComputerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlayerRoleAccess().getComputerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayerRole"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000111000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});

}