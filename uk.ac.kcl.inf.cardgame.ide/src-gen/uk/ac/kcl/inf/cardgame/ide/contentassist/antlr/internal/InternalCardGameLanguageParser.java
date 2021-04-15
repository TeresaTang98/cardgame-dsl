package uk.ac.kcl.inf.cardgame.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.cardgame.services.CardGameLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCardGameLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'isBiggerThan'", "'isSmallerThan'", "'isEqualTo'", "'Player'", "'Computer'", "'Game'", "'HoleCardNumber'", "'('", "')'", "'Properties'", "'{'", "'}'", "','", "'GameRule'", "'Card'", "':'", "'SingleRule'", "'No.'", "'level'", "'EqualRule'", "'ComparedCardsNum'", "'ComparedItem'"
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

    	public void setGrammarAccess(CardGameLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCardGame"
    // InternalCardGameLanguage.g:53:1: entryRuleCardGame : ruleCardGame EOF ;
    public final void entryRuleCardGame() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:54:1: ( ruleCardGame EOF )
            // InternalCardGameLanguage.g:55:1: ruleCardGame EOF
            {
             before(grammarAccess.getCardGameRule()); 
            pushFollow(FOLLOW_1);
            ruleCardGame();

            state._fsp--;

             after(grammarAccess.getCardGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardGame"


    // $ANTLR start "ruleCardGame"
    // InternalCardGameLanguage.g:62:1: ruleCardGame : ( ( rule__CardGame__Group__0 ) ) ;
    public final void ruleCardGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:66:2: ( ( ( rule__CardGame__Group__0 ) ) )
            // InternalCardGameLanguage.g:67:2: ( ( rule__CardGame__Group__0 ) )
            {
            // InternalCardGameLanguage.g:67:2: ( ( rule__CardGame__Group__0 ) )
            // InternalCardGameLanguage.g:68:3: ( rule__CardGame__Group__0 )
            {
             before(grammarAccess.getCardGameAccess().getGroup()); 
            // InternalCardGameLanguage.g:69:3: ( rule__CardGame__Group__0 )
            // InternalCardGameLanguage.g:69:4: rule__CardGame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardGame"


    // $ANTLR start "entryRuleCard"
    // InternalCardGameLanguage.g:78:1: entryRuleCard : ruleCard EOF ;
    public final void entryRuleCard() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:79:1: ( ruleCard EOF )
            // InternalCardGameLanguage.g:80:1: ruleCard EOF
            {
             before(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalCardGameLanguage.g:87:1: ruleCard : ( ( rule__Card__Group__0 ) ) ;
    public final void ruleCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:91:2: ( ( ( rule__Card__Group__0 ) ) )
            // InternalCardGameLanguage.g:92:2: ( ( rule__Card__Group__0 ) )
            {
            // InternalCardGameLanguage.g:92:2: ( ( rule__Card__Group__0 ) )
            // InternalCardGameLanguage.g:93:3: ( rule__Card__Group__0 )
            {
             before(grammarAccess.getCardAccess().getGroup()); 
            // InternalCardGameLanguage.g:94:3: ( rule__Card__Group__0 )
            // InternalCardGameLanguage.g:94:4: rule__Card__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleCardProperty"
    // InternalCardGameLanguage.g:103:1: entryRuleCardProperty : ruleCardProperty EOF ;
    public final void entryRuleCardProperty() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:104:1: ( ruleCardProperty EOF )
            // InternalCardGameLanguage.g:105:1: ruleCardProperty EOF
            {
             before(grammarAccess.getCardPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleCardProperty();

            state._fsp--;

             after(grammarAccess.getCardPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardProperty"


    // $ANTLR start "ruleCardProperty"
    // InternalCardGameLanguage.g:112:1: ruleCardProperty : ( ( rule__CardProperty__Group__0 ) ) ;
    public final void ruleCardProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:116:2: ( ( ( rule__CardProperty__Group__0 ) ) )
            // InternalCardGameLanguage.g:117:2: ( ( rule__CardProperty__Group__0 ) )
            {
            // InternalCardGameLanguage.g:117:2: ( ( rule__CardProperty__Group__0 ) )
            // InternalCardGameLanguage.g:118:3: ( rule__CardProperty__Group__0 )
            {
             before(grammarAccess.getCardPropertyAccess().getGroup()); 
            // InternalCardGameLanguage.g:119:3: ( rule__CardProperty__Group__0 )
            // InternalCardGameLanguage.g:119:4: rule__CardProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CardProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardProperty"


    // $ANTLR start "entryRuleCardPropertyType"
    // InternalCardGameLanguage.g:128:1: entryRuleCardPropertyType : ruleCardPropertyType EOF ;
    public final void entryRuleCardPropertyType() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:129:1: ( ruleCardPropertyType EOF )
            // InternalCardGameLanguage.g:130:1: ruleCardPropertyType EOF
            {
             before(grammarAccess.getCardPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCardPropertyType();

            state._fsp--;

             after(grammarAccess.getCardPropertyTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardPropertyType"


    // $ANTLR start "ruleCardPropertyType"
    // InternalCardGameLanguage.g:137:1: ruleCardPropertyType : ( ( rule__CardPropertyType__NameAssignment ) ) ;
    public final void ruleCardPropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:141:2: ( ( ( rule__CardPropertyType__NameAssignment ) ) )
            // InternalCardGameLanguage.g:142:2: ( ( rule__CardPropertyType__NameAssignment ) )
            {
            // InternalCardGameLanguage.g:142:2: ( ( rule__CardPropertyType__NameAssignment ) )
            // InternalCardGameLanguage.g:143:3: ( rule__CardPropertyType__NameAssignment )
            {
             before(grammarAccess.getCardPropertyTypeAccess().getNameAssignment()); 
            // InternalCardGameLanguage.g:144:3: ( rule__CardPropertyType__NameAssignment )
            // InternalCardGameLanguage.g:144:4: rule__CardPropertyType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CardPropertyType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCardPropertyTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardPropertyType"


    // $ANTLR start "entryRuleGameRule"
    // InternalCardGameLanguage.g:153:1: entryRuleGameRule : ruleGameRule EOF ;
    public final void entryRuleGameRule() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:154:1: ( ruleGameRule EOF )
            // InternalCardGameLanguage.g:155:1: ruleGameRule EOF
            {
             before(grammarAccess.getGameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleGameRule();

            state._fsp--;

             after(grammarAccess.getGameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameRule"


    // $ANTLR start "ruleGameRule"
    // InternalCardGameLanguage.g:162:1: ruleGameRule : ( ( rule__GameRule__Alternatives ) ) ;
    public final void ruleGameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:166:2: ( ( ( rule__GameRule__Alternatives ) ) )
            // InternalCardGameLanguage.g:167:2: ( ( rule__GameRule__Alternatives ) )
            {
            // InternalCardGameLanguage.g:167:2: ( ( rule__GameRule__Alternatives ) )
            // InternalCardGameLanguage.g:168:3: ( rule__GameRule__Alternatives )
            {
             before(grammarAccess.getGameRuleAccess().getAlternatives()); 
            // InternalCardGameLanguage.g:169:3: ( rule__GameRule__Alternatives )
            // InternalCardGameLanguage.g:169:4: rule__GameRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GameRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGameRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameRule"


    // $ANTLR start "entryRuleSingleRule"
    // InternalCardGameLanguage.g:178:1: entryRuleSingleRule : ruleSingleRule EOF ;
    public final void entryRuleSingleRule() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:179:1: ( ruleSingleRule EOF )
            // InternalCardGameLanguage.g:180:1: ruleSingleRule EOF
            {
             before(grammarAccess.getSingleRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleRule();

            state._fsp--;

             after(grammarAccess.getSingleRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleRule"


    // $ANTLR start "ruleSingleRule"
    // InternalCardGameLanguage.g:187:1: ruleSingleRule : ( ( rule__SingleRule__Group__0 ) ) ;
    public final void ruleSingleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:191:2: ( ( ( rule__SingleRule__Group__0 ) ) )
            // InternalCardGameLanguage.g:192:2: ( ( rule__SingleRule__Group__0 ) )
            {
            // InternalCardGameLanguage.g:192:2: ( ( rule__SingleRule__Group__0 ) )
            // InternalCardGameLanguage.g:193:3: ( rule__SingleRule__Group__0 )
            {
             before(grammarAccess.getSingleRuleAccess().getGroup()); 
            // InternalCardGameLanguage.g:194:3: ( rule__SingleRule__Group__0 )
            // InternalCardGameLanguage.g:194:4: rule__SingleRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleRule"


    // $ANTLR start "entryRuleEqualRule"
    // InternalCardGameLanguage.g:203:1: entryRuleEqualRule : ruleEqualRule EOF ;
    public final void entryRuleEqualRule() throws RecognitionException {
        try {
            // InternalCardGameLanguage.g:204:1: ( ruleEqualRule EOF )
            // InternalCardGameLanguage.g:205:1: ruleEqualRule EOF
            {
             before(grammarAccess.getEqualRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualRule();

            state._fsp--;

             after(grammarAccess.getEqualRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualRule"


    // $ANTLR start "ruleEqualRule"
    // InternalCardGameLanguage.g:212:1: ruleEqualRule : ( ( rule__EqualRule__Group__0 ) ) ;
    public final void ruleEqualRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:216:2: ( ( ( rule__EqualRule__Group__0 ) ) )
            // InternalCardGameLanguage.g:217:2: ( ( rule__EqualRule__Group__0 ) )
            {
            // InternalCardGameLanguage.g:217:2: ( ( rule__EqualRule__Group__0 ) )
            // InternalCardGameLanguage.g:218:3: ( rule__EqualRule__Group__0 )
            {
             before(grammarAccess.getEqualRuleAccess().getGroup()); 
            // InternalCardGameLanguage.g:219:3: ( rule__EqualRule__Group__0 )
            // InternalCardGameLanguage.g:219:4: rule__EqualRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualRule"


    // $ANTLR start "ruleExpressionKeyword"
    // InternalCardGameLanguage.g:228:1: ruleExpressionKeyword : ( ( rule__ExpressionKeyword__Alternatives ) ) ;
    public final void ruleExpressionKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:232:1: ( ( ( rule__ExpressionKeyword__Alternatives ) ) )
            // InternalCardGameLanguage.g:233:2: ( ( rule__ExpressionKeyword__Alternatives ) )
            {
            // InternalCardGameLanguage.g:233:2: ( ( rule__ExpressionKeyword__Alternatives ) )
            // InternalCardGameLanguage.g:234:3: ( rule__ExpressionKeyword__Alternatives )
            {
             before(grammarAccess.getExpressionKeywordAccess().getAlternatives()); 
            // InternalCardGameLanguage.g:235:3: ( rule__ExpressionKeyword__Alternatives )
            // InternalCardGameLanguage.g:235:4: rule__ExpressionKeyword__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionKeyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionKeywordAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionKeyword"


    // $ANTLR start "rulePlayerRole"
    // InternalCardGameLanguage.g:244:1: rulePlayerRole : ( ( rule__PlayerRole__Alternatives ) ) ;
    public final void rulePlayerRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:248:1: ( ( ( rule__PlayerRole__Alternatives ) ) )
            // InternalCardGameLanguage.g:249:2: ( ( rule__PlayerRole__Alternatives ) )
            {
            // InternalCardGameLanguage.g:249:2: ( ( rule__PlayerRole__Alternatives ) )
            // InternalCardGameLanguage.g:250:3: ( rule__PlayerRole__Alternatives )
            {
             before(grammarAccess.getPlayerRoleAccess().getAlternatives()); 
            // InternalCardGameLanguage.g:251:3: ( rule__PlayerRole__Alternatives )
            // InternalCardGameLanguage.g:251:4: rule__PlayerRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlayerRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlayerRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerRole"


    // $ANTLR start "rule__GameRule__Alternatives"
    // InternalCardGameLanguage.g:259:1: rule__GameRule__Alternatives : ( ( ruleSingleRule ) | ( ruleEqualRule ) );
    public final void rule__GameRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:263:1: ( ( ruleSingleRule ) | ( ruleEqualRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCardGameLanguage.g:264:2: ( ruleSingleRule )
                    {
                    // InternalCardGameLanguage.g:264:2: ( ruleSingleRule )
                    // InternalCardGameLanguage.g:265:3: ruleSingleRule
                    {
                     before(grammarAccess.getGameRuleAccess().getSingleRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleRule();

                    state._fsp--;

                     after(grammarAccess.getGameRuleAccess().getSingleRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:270:2: ( ruleEqualRule )
                    {
                    // InternalCardGameLanguage.g:270:2: ( ruleEqualRule )
                    // InternalCardGameLanguage.g:271:3: ruleEqualRule
                    {
                     before(grammarAccess.getGameRuleAccess().getEqualRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualRule();

                    state._fsp--;

                     after(grammarAccess.getGameRuleAccess().getEqualRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameRule__Alternatives"


    // $ANTLR start "rule__ExpressionKeyword__Alternatives"
    // InternalCardGameLanguage.g:280:1: rule__ExpressionKeyword__Alternatives : ( ( ( 'isBiggerThan' ) ) | ( ( 'isSmallerThan' ) ) | ( ( 'isEqualTo' ) ) );
    public final void rule__ExpressionKeyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:284:1: ( ( ( 'isBiggerThan' ) ) | ( ( 'isSmallerThan' ) ) | ( ( 'isEqualTo' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCardGameLanguage.g:285:2: ( ( 'isBiggerThan' ) )
                    {
                    // InternalCardGameLanguage.g:285:2: ( ( 'isBiggerThan' ) )
                    // InternalCardGameLanguage.g:286:3: ( 'isBiggerThan' )
                    {
                     before(grammarAccess.getExpressionKeywordAccess().getIsBiggerThanEnumLiteralDeclaration_0()); 
                    // InternalCardGameLanguage.g:287:3: ( 'isBiggerThan' )
                    // InternalCardGameLanguage.g:287:4: 'isBiggerThan'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getExpressionKeywordAccess().getIsBiggerThanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:291:2: ( ( 'isSmallerThan' ) )
                    {
                    // InternalCardGameLanguage.g:291:2: ( ( 'isSmallerThan' ) )
                    // InternalCardGameLanguage.g:292:3: ( 'isSmallerThan' )
                    {
                     before(grammarAccess.getExpressionKeywordAccess().getIsSmallerThanEnumLiteralDeclaration_1()); 
                    // InternalCardGameLanguage.g:293:3: ( 'isSmallerThan' )
                    // InternalCardGameLanguage.g:293:4: 'isSmallerThan'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getExpressionKeywordAccess().getIsSmallerThanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCardGameLanguage.g:297:2: ( ( 'isEqualTo' ) )
                    {
                    // InternalCardGameLanguage.g:297:2: ( ( 'isEqualTo' ) )
                    // InternalCardGameLanguage.g:298:3: ( 'isEqualTo' )
                    {
                     before(grammarAccess.getExpressionKeywordAccess().getIsEqualToEnumLiteralDeclaration_2()); 
                    // InternalCardGameLanguage.g:299:3: ( 'isEqualTo' )
                    // InternalCardGameLanguage.g:299:4: 'isEqualTo'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getExpressionKeywordAccess().getIsEqualToEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionKeyword__Alternatives"


    // $ANTLR start "rule__PlayerRole__Alternatives"
    // InternalCardGameLanguage.g:307:1: rule__PlayerRole__Alternatives : ( ( ( 'Player' ) ) | ( ( 'Computer' ) ) );
    public final void rule__PlayerRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:311:1: ( ( ( 'Player' ) ) | ( ( 'Computer' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCardGameLanguage.g:312:2: ( ( 'Player' ) )
                    {
                    // InternalCardGameLanguage.g:312:2: ( ( 'Player' ) )
                    // InternalCardGameLanguage.g:313:3: ( 'Player' )
                    {
                     before(grammarAccess.getPlayerRoleAccess().getPlayerEnumLiteralDeclaration_0()); 
                    // InternalCardGameLanguage.g:314:3: ( 'Player' )
                    // InternalCardGameLanguage.g:314:4: 'Player'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerRoleAccess().getPlayerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCardGameLanguage.g:318:2: ( ( 'Computer' ) )
                    {
                    // InternalCardGameLanguage.g:318:2: ( ( 'Computer' ) )
                    // InternalCardGameLanguage.g:319:3: ( 'Computer' )
                    {
                     before(grammarAccess.getPlayerRoleAccess().getComputerEnumLiteralDeclaration_1()); 
                    // InternalCardGameLanguage.g:320:3: ( 'Computer' )
                    // InternalCardGameLanguage.g:320:4: 'Computer'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerRoleAccess().getComputerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerRole__Alternatives"


    // $ANTLR start "rule__CardGame__Group__0"
    // InternalCardGameLanguage.g:328:1: rule__CardGame__Group__0 : rule__CardGame__Group__0__Impl rule__CardGame__Group__1 ;
    public final void rule__CardGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:332:1: ( rule__CardGame__Group__0__Impl rule__CardGame__Group__1 )
            // InternalCardGameLanguage.g:333:2: rule__CardGame__Group__0__Impl rule__CardGame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CardGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__0"


    // $ANTLR start "rule__CardGame__Group__0__Impl"
    // InternalCardGameLanguage.g:340:1: rule__CardGame__Group__0__Impl : ( 'Game' ) ;
    public final void rule__CardGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:344:1: ( ( 'Game' ) )
            // InternalCardGameLanguage.g:345:1: ( 'Game' )
            {
            // InternalCardGameLanguage.g:345:1: ( 'Game' )
            // InternalCardGameLanguage.g:346:2: 'Game'
            {
             before(grammarAccess.getCardGameAccess().getGameKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__0__Impl"


    // $ANTLR start "rule__CardGame__Group__1"
    // InternalCardGameLanguage.g:355:1: rule__CardGame__Group__1 : rule__CardGame__Group__1__Impl rule__CardGame__Group__2 ;
    public final void rule__CardGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:359:1: ( rule__CardGame__Group__1__Impl rule__CardGame__Group__2 )
            // InternalCardGameLanguage.g:360:2: rule__CardGame__Group__1__Impl rule__CardGame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CardGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__1"


    // $ANTLR start "rule__CardGame__Group__1__Impl"
    // InternalCardGameLanguage.g:367:1: rule__CardGame__Group__1__Impl : ( ( rule__CardGame__NameAssignment_1 ) ) ;
    public final void rule__CardGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:371:1: ( ( ( rule__CardGame__NameAssignment_1 ) ) )
            // InternalCardGameLanguage.g:372:1: ( ( rule__CardGame__NameAssignment_1 ) )
            {
            // InternalCardGameLanguage.g:372:1: ( ( rule__CardGame__NameAssignment_1 ) )
            // InternalCardGameLanguage.g:373:2: ( rule__CardGame__NameAssignment_1 )
            {
             before(grammarAccess.getCardGameAccess().getNameAssignment_1()); 
            // InternalCardGameLanguage.g:374:2: ( rule__CardGame__NameAssignment_1 )
            // InternalCardGameLanguage.g:374:3: rule__CardGame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__1__Impl"


    // $ANTLR start "rule__CardGame__Group__2"
    // InternalCardGameLanguage.g:382:1: rule__CardGame__Group__2 : rule__CardGame__Group__2__Impl rule__CardGame__Group__3 ;
    public final void rule__CardGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:386:1: ( rule__CardGame__Group__2__Impl rule__CardGame__Group__3 )
            // InternalCardGameLanguage.g:387:2: rule__CardGame__Group__2__Impl rule__CardGame__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CardGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__2"


    // $ANTLR start "rule__CardGame__Group__2__Impl"
    // InternalCardGameLanguage.g:394:1: rule__CardGame__Group__2__Impl : ( ( rule__CardGame__Group_2__0 )? ) ;
    public final void rule__CardGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:398:1: ( ( ( rule__CardGame__Group_2__0 )? ) )
            // InternalCardGameLanguage.g:399:1: ( ( rule__CardGame__Group_2__0 )? )
            {
            // InternalCardGameLanguage.g:399:1: ( ( rule__CardGame__Group_2__0 )? )
            // InternalCardGameLanguage.g:400:2: ( rule__CardGame__Group_2__0 )?
            {
             before(grammarAccess.getCardGameAccess().getGroup_2()); 
            // InternalCardGameLanguage.g:401:2: ( rule__CardGame__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCardGameLanguage.g:401:3: rule__CardGame__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardGame__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardGameAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__2__Impl"


    // $ANTLR start "rule__CardGame__Group__3"
    // InternalCardGameLanguage.g:409:1: rule__CardGame__Group__3 : rule__CardGame__Group__3__Impl rule__CardGame__Group__4 ;
    public final void rule__CardGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:413:1: ( rule__CardGame__Group__3__Impl rule__CardGame__Group__4 )
            // InternalCardGameLanguage.g:414:2: rule__CardGame__Group__3__Impl rule__CardGame__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__CardGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__3"


    // $ANTLR start "rule__CardGame__Group__3__Impl"
    // InternalCardGameLanguage.g:421:1: rule__CardGame__Group__3__Impl : ( ( rule__CardGame__CardsAssignment_3 )* ) ;
    public final void rule__CardGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:425:1: ( ( ( rule__CardGame__CardsAssignment_3 )* ) )
            // InternalCardGameLanguage.g:426:1: ( ( rule__CardGame__CardsAssignment_3 )* )
            {
            // InternalCardGameLanguage.g:426:1: ( ( rule__CardGame__CardsAssignment_3 )* )
            // InternalCardGameLanguage.g:427:2: ( rule__CardGame__CardsAssignment_3 )*
            {
             before(grammarAccess.getCardGameAccess().getCardsAssignment_3()); 
            // InternalCardGameLanguage.g:428:2: ( rule__CardGame__CardsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCardGameLanguage.g:428:3: rule__CardGame__CardsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CardGame__CardsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCardGameAccess().getCardsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__3__Impl"


    // $ANTLR start "rule__CardGame__Group__4"
    // InternalCardGameLanguage.g:436:1: rule__CardGame__Group__4 : rule__CardGame__Group__4__Impl rule__CardGame__Group__5 ;
    public final void rule__CardGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:440:1: ( rule__CardGame__Group__4__Impl rule__CardGame__Group__5 )
            // InternalCardGameLanguage.g:441:2: rule__CardGame__Group__4__Impl rule__CardGame__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CardGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__4"


    // $ANTLR start "rule__CardGame__Group__4__Impl"
    // InternalCardGameLanguage.g:448:1: rule__CardGame__Group__4__Impl : ( 'HoleCardNumber' ) ;
    public final void rule__CardGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:452:1: ( ( 'HoleCardNumber' ) )
            // InternalCardGameLanguage.g:453:1: ( 'HoleCardNumber' )
            {
            // InternalCardGameLanguage.g:453:1: ( 'HoleCardNumber' )
            // InternalCardGameLanguage.g:454:2: 'HoleCardNumber'
            {
             before(grammarAccess.getCardGameAccess().getHoleCardNumberKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getHoleCardNumberKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__4__Impl"


    // $ANTLR start "rule__CardGame__Group__5"
    // InternalCardGameLanguage.g:463:1: rule__CardGame__Group__5 : rule__CardGame__Group__5__Impl rule__CardGame__Group__6 ;
    public final void rule__CardGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:467:1: ( rule__CardGame__Group__5__Impl rule__CardGame__Group__6 )
            // InternalCardGameLanguage.g:468:2: rule__CardGame__Group__5__Impl rule__CardGame__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__CardGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__5"


    // $ANTLR start "rule__CardGame__Group__5__Impl"
    // InternalCardGameLanguage.g:475:1: rule__CardGame__Group__5__Impl : ( '(' ) ;
    public final void rule__CardGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:479:1: ( ( '(' ) )
            // InternalCardGameLanguage.g:480:1: ( '(' )
            {
            // InternalCardGameLanguage.g:480:1: ( '(' )
            // InternalCardGameLanguage.g:481:2: '('
            {
             before(grammarAccess.getCardGameAccess().getLeftParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__5__Impl"


    // $ANTLR start "rule__CardGame__Group__6"
    // InternalCardGameLanguage.g:490:1: rule__CardGame__Group__6 : rule__CardGame__Group__6__Impl rule__CardGame__Group__7 ;
    public final void rule__CardGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:494:1: ( rule__CardGame__Group__6__Impl rule__CardGame__Group__7 )
            // InternalCardGameLanguage.g:495:2: rule__CardGame__Group__6__Impl rule__CardGame__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__CardGame__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__6"


    // $ANTLR start "rule__CardGame__Group__6__Impl"
    // InternalCardGameLanguage.g:502:1: rule__CardGame__Group__6__Impl : ( ( rule__CardGame__NumberAssignment_6 ) ) ;
    public final void rule__CardGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:506:1: ( ( ( rule__CardGame__NumberAssignment_6 ) ) )
            // InternalCardGameLanguage.g:507:1: ( ( rule__CardGame__NumberAssignment_6 ) )
            {
            // InternalCardGameLanguage.g:507:1: ( ( rule__CardGame__NumberAssignment_6 ) )
            // InternalCardGameLanguage.g:508:2: ( rule__CardGame__NumberAssignment_6 )
            {
             before(grammarAccess.getCardGameAccess().getNumberAssignment_6()); 
            // InternalCardGameLanguage.g:509:2: ( rule__CardGame__NumberAssignment_6 )
            // InternalCardGameLanguage.g:509:3: rule__CardGame__NumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__NumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__6__Impl"


    // $ANTLR start "rule__CardGame__Group__7"
    // InternalCardGameLanguage.g:517:1: rule__CardGame__Group__7 : rule__CardGame__Group__7__Impl rule__CardGame__Group__8 ;
    public final void rule__CardGame__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:521:1: ( rule__CardGame__Group__7__Impl rule__CardGame__Group__8 )
            // InternalCardGameLanguage.g:522:2: rule__CardGame__Group__7__Impl rule__CardGame__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__CardGame__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__7"


    // $ANTLR start "rule__CardGame__Group__7__Impl"
    // InternalCardGameLanguage.g:529:1: rule__CardGame__Group__7__Impl : ( ')' ) ;
    public final void rule__CardGame__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:533:1: ( ( ')' ) )
            // InternalCardGameLanguage.g:534:1: ( ')' )
            {
            // InternalCardGameLanguage.g:534:1: ( ')' )
            // InternalCardGameLanguage.g:535:2: ')'
            {
             before(grammarAccess.getCardGameAccess().getRightParenthesisKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__7__Impl"


    // $ANTLR start "rule__CardGame__Group__8"
    // InternalCardGameLanguage.g:544:1: rule__CardGame__Group__8 : rule__CardGame__Group__8__Impl ;
    public final void rule__CardGame__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:548:1: ( rule__CardGame__Group__8__Impl )
            // InternalCardGameLanguage.g:549:2: rule__CardGame__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__8"


    // $ANTLR start "rule__CardGame__Group__8__Impl"
    // InternalCardGameLanguage.g:555:1: rule__CardGame__Group__8__Impl : ( ( rule__CardGame__Group_8__0 )? ) ;
    public final void rule__CardGame__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:559:1: ( ( ( rule__CardGame__Group_8__0 )? ) )
            // InternalCardGameLanguage.g:560:1: ( ( rule__CardGame__Group_8__0 )? )
            {
            // InternalCardGameLanguage.g:560:1: ( ( rule__CardGame__Group_8__0 )? )
            // InternalCardGameLanguage.g:561:2: ( rule__CardGame__Group_8__0 )?
            {
             before(grammarAccess.getCardGameAccess().getGroup_8()); 
            // InternalCardGameLanguage.g:562:2: ( rule__CardGame__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCardGameLanguage.g:562:3: rule__CardGame__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardGame__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardGameAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group__8__Impl"


    // $ANTLR start "rule__CardGame__Group_2__0"
    // InternalCardGameLanguage.g:571:1: rule__CardGame__Group_2__0 : rule__CardGame__Group_2__0__Impl rule__CardGame__Group_2__1 ;
    public final void rule__CardGame__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:575:1: ( rule__CardGame__Group_2__0__Impl rule__CardGame__Group_2__1 )
            // InternalCardGameLanguage.g:576:2: rule__CardGame__Group_2__0__Impl rule__CardGame__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__CardGame__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__0"


    // $ANTLR start "rule__CardGame__Group_2__0__Impl"
    // InternalCardGameLanguage.g:583:1: rule__CardGame__Group_2__0__Impl : ( 'Properties' ) ;
    public final void rule__CardGame__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:587:1: ( ( 'Properties' ) )
            // InternalCardGameLanguage.g:588:1: ( 'Properties' )
            {
            // InternalCardGameLanguage.g:588:1: ( 'Properties' )
            // InternalCardGameLanguage.g:589:2: 'Properties'
            {
             before(grammarAccess.getCardGameAccess().getPropertiesKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getPropertiesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__0__Impl"


    // $ANTLR start "rule__CardGame__Group_2__1"
    // InternalCardGameLanguage.g:598:1: rule__CardGame__Group_2__1 : rule__CardGame__Group_2__1__Impl rule__CardGame__Group_2__2 ;
    public final void rule__CardGame__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:602:1: ( rule__CardGame__Group_2__1__Impl rule__CardGame__Group_2__2 )
            // InternalCardGameLanguage.g:603:2: rule__CardGame__Group_2__1__Impl rule__CardGame__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__CardGame__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__1"


    // $ANTLR start "rule__CardGame__Group_2__1__Impl"
    // InternalCardGameLanguage.g:610:1: rule__CardGame__Group_2__1__Impl : ( '{' ) ;
    public final void rule__CardGame__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:614:1: ( ( '{' ) )
            // InternalCardGameLanguage.g:615:1: ( '{' )
            {
            // InternalCardGameLanguage.g:615:1: ( '{' )
            // InternalCardGameLanguage.g:616:2: '{'
            {
             before(grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__1__Impl"


    // $ANTLR start "rule__CardGame__Group_2__2"
    // InternalCardGameLanguage.g:625:1: rule__CardGame__Group_2__2 : rule__CardGame__Group_2__2__Impl rule__CardGame__Group_2__3 ;
    public final void rule__CardGame__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:629:1: ( rule__CardGame__Group_2__2__Impl rule__CardGame__Group_2__3 )
            // InternalCardGameLanguage.g:630:2: rule__CardGame__Group_2__2__Impl rule__CardGame__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__CardGame__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__2"


    // $ANTLR start "rule__CardGame__Group_2__2__Impl"
    // InternalCardGameLanguage.g:637:1: rule__CardGame__Group_2__2__Impl : ( ( rule__CardGame__CardpropertytypesAssignment_2_2 ) ) ;
    public final void rule__CardGame__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:641:1: ( ( ( rule__CardGame__CardpropertytypesAssignment_2_2 ) ) )
            // InternalCardGameLanguage.g:642:1: ( ( rule__CardGame__CardpropertytypesAssignment_2_2 ) )
            {
            // InternalCardGameLanguage.g:642:1: ( ( rule__CardGame__CardpropertytypesAssignment_2_2 ) )
            // InternalCardGameLanguage.g:643:2: ( rule__CardGame__CardpropertytypesAssignment_2_2 )
            {
             before(grammarAccess.getCardGameAccess().getCardpropertytypesAssignment_2_2()); 
            // InternalCardGameLanguage.g:644:2: ( rule__CardGame__CardpropertytypesAssignment_2_2 )
            // InternalCardGameLanguage.g:644:3: rule__CardGame__CardpropertytypesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__CardpropertytypesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getCardpropertytypesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__2__Impl"


    // $ANTLR start "rule__CardGame__Group_2__3"
    // InternalCardGameLanguage.g:652:1: rule__CardGame__Group_2__3 : rule__CardGame__Group_2__3__Impl rule__CardGame__Group_2__4 ;
    public final void rule__CardGame__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:656:1: ( rule__CardGame__Group_2__3__Impl rule__CardGame__Group_2__4 )
            // InternalCardGameLanguage.g:657:2: rule__CardGame__Group_2__3__Impl rule__CardGame__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__CardGame__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__3"


    // $ANTLR start "rule__CardGame__Group_2__3__Impl"
    // InternalCardGameLanguage.g:664:1: rule__CardGame__Group_2__3__Impl : ( ( rule__CardGame__Group_2_3__0 )* ) ;
    public final void rule__CardGame__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:668:1: ( ( ( rule__CardGame__Group_2_3__0 )* ) )
            // InternalCardGameLanguage.g:669:1: ( ( rule__CardGame__Group_2_3__0 )* )
            {
            // InternalCardGameLanguage.g:669:1: ( ( rule__CardGame__Group_2_3__0 )* )
            // InternalCardGameLanguage.g:670:2: ( rule__CardGame__Group_2_3__0 )*
            {
             before(grammarAccess.getCardGameAccess().getGroup_2_3()); 
            // InternalCardGameLanguage.g:671:2: ( rule__CardGame__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCardGameLanguage.g:671:3: rule__CardGame__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CardGame__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCardGameAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__3__Impl"


    // $ANTLR start "rule__CardGame__Group_2__4"
    // InternalCardGameLanguage.g:679:1: rule__CardGame__Group_2__4 : rule__CardGame__Group_2__4__Impl ;
    public final void rule__CardGame__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:683:1: ( rule__CardGame__Group_2__4__Impl )
            // InternalCardGameLanguage.g:684:2: rule__CardGame__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__4"


    // $ANTLR start "rule__CardGame__Group_2__4__Impl"
    // InternalCardGameLanguage.g:690:1: rule__CardGame__Group_2__4__Impl : ( '}' ) ;
    public final void rule__CardGame__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:694:1: ( ( '}' ) )
            // InternalCardGameLanguage.g:695:1: ( '}' )
            {
            // InternalCardGameLanguage.g:695:1: ( '}' )
            // InternalCardGameLanguage.g:696:2: '}'
            {
             before(grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2__4__Impl"


    // $ANTLR start "rule__CardGame__Group_2_3__0"
    // InternalCardGameLanguage.g:706:1: rule__CardGame__Group_2_3__0 : rule__CardGame__Group_2_3__0__Impl rule__CardGame__Group_2_3__1 ;
    public final void rule__CardGame__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:710:1: ( rule__CardGame__Group_2_3__0__Impl rule__CardGame__Group_2_3__1 )
            // InternalCardGameLanguage.g:711:2: rule__CardGame__Group_2_3__0__Impl rule__CardGame__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CardGame__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2_3__0"


    // $ANTLR start "rule__CardGame__Group_2_3__0__Impl"
    // InternalCardGameLanguage.g:718:1: rule__CardGame__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__CardGame__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:722:1: ( ( ',' ) )
            // InternalCardGameLanguage.g:723:1: ( ',' )
            {
            // InternalCardGameLanguage.g:723:1: ( ',' )
            // InternalCardGameLanguage.g:724:2: ','
            {
             before(grammarAccess.getCardGameAccess().getCommaKeyword_2_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2_3__0__Impl"


    // $ANTLR start "rule__CardGame__Group_2_3__1"
    // InternalCardGameLanguage.g:733:1: rule__CardGame__Group_2_3__1 : rule__CardGame__Group_2_3__1__Impl ;
    public final void rule__CardGame__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:737:1: ( rule__CardGame__Group_2_3__1__Impl )
            // InternalCardGameLanguage.g:738:2: rule__CardGame__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2_3__1"


    // $ANTLR start "rule__CardGame__Group_2_3__1__Impl"
    // InternalCardGameLanguage.g:744:1: rule__CardGame__Group_2_3__1__Impl : ( ( rule__CardGame__CardpropertytypesAssignment_2_3_1 ) ) ;
    public final void rule__CardGame__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:748:1: ( ( ( rule__CardGame__CardpropertytypesAssignment_2_3_1 ) ) )
            // InternalCardGameLanguage.g:749:1: ( ( rule__CardGame__CardpropertytypesAssignment_2_3_1 ) )
            {
            // InternalCardGameLanguage.g:749:1: ( ( rule__CardGame__CardpropertytypesAssignment_2_3_1 ) )
            // InternalCardGameLanguage.g:750:2: ( rule__CardGame__CardpropertytypesAssignment_2_3_1 )
            {
             before(grammarAccess.getCardGameAccess().getCardpropertytypesAssignment_2_3_1()); 
            // InternalCardGameLanguage.g:751:2: ( rule__CardGame__CardpropertytypesAssignment_2_3_1 )
            // InternalCardGameLanguage.g:751:3: rule__CardGame__CardpropertytypesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__CardpropertytypesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getCardpropertytypesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_2_3__1__Impl"


    // $ANTLR start "rule__CardGame__Group_8__0"
    // InternalCardGameLanguage.g:760:1: rule__CardGame__Group_8__0 : rule__CardGame__Group_8__0__Impl rule__CardGame__Group_8__1 ;
    public final void rule__CardGame__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:764:1: ( rule__CardGame__Group_8__0__Impl rule__CardGame__Group_8__1 )
            // InternalCardGameLanguage.g:765:2: rule__CardGame__Group_8__0__Impl rule__CardGame__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__CardGame__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__0"


    // $ANTLR start "rule__CardGame__Group_8__0__Impl"
    // InternalCardGameLanguage.g:772:1: rule__CardGame__Group_8__0__Impl : ( 'GameRule' ) ;
    public final void rule__CardGame__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:776:1: ( ( 'GameRule' ) )
            // InternalCardGameLanguage.g:777:1: ( 'GameRule' )
            {
            // InternalCardGameLanguage.g:777:1: ( 'GameRule' )
            // InternalCardGameLanguage.g:778:2: 'GameRule'
            {
             before(grammarAccess.getCardGameAccess().getGameRuleKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getGameRuleKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__0__Impl"


    // $ANTLR start "rule__CardGame__Group_8__1"
    // InternalCardGameLanguage.g:787:1: rule__CardGame__Group_8__1 : rule__CardGame__Group_8__1__Impl rule__CardGame__Group_8__2 ;
    public final void rule__CardGame__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:791:1: ( rule__CardGame__Group_8__1__Impl rule__CardGame__Group_8__2 )
            // InternalCardGameLanguage.g:792:2: rule__CardGame__Group_8__1__Impl rule__CardGame__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__CardGame__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__1"


    // $ANTLR start "rule__CardGame__Group_8__1__Impl"
    // InternalCardGameLanguage.g:799:1: rule__CardGame__Group_8__1__Impl : ( '{' ) ;
    public final void rule__CardGame__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:803:1: ( ( '{' ) )
            // InternalCardGameLanguage.g:804:1: ( '{' )
            {
            // InternalCardGameLanguage.g:804:1: ( '{' )
            // InternalCardGameLanguage.g:805:2: '{'
            {
             before(grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__1__Impl"


    // $ANTLR start "rule__CardGame__Group_8__2"
    // InternalCardGameLanguage.g:814:1: rule__CardGame__Group_8__2 : rule__CardGame__Group_8__2__Impl rule__CardGame__Group_8__3 ;
    public final void rule__CardGame__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:818:1: ( rule__CardGame__Group_8__2__Impl rule__CardGame__Group_8__3 )
            // InternalCardGameLanguage.g:819:2: rule__CardGame__Group_8__2__Impl rule__CardGame__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__CardGame__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__2"


    // $ANTLR start "rule__CardGame__Group_8__2__Impl"
    // InternalCardGameLanguage.g:826:1: rule__CardGame__Group_8__2__Impl : ( ( rule__CardGame__RuleAssignment_8_2 ) ) ;
    public final void rule__CardGame__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:830:1: ( ( ( rule__CardGame__RuleAssignment_8_2 ) ) )
            // InternalCardGameLanguage.g:831:1: ( ( rule__CardGame__RuleAssignment_8_2 ) )
            {
            // InternalCardGameLanguage.g:831:1: ( ( rule__CardGame__RuleAssignment_8_2 ) )
            // InternalCardGameLanguage.g:832:2: ( rule__CardGame__RuleAssignment_8_2 )
            {
             before(grammarAccess.getCardGameAccess().getRuleAssignment_8_2()); 
            // InternalCardGameLanguage.g:833:2: ( rule__CardGame__RuleAssignment_8_2 )
            // InternalCardGameLanguage.g:833:3: rule__CardGame__RuleAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__RuleAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getRuleAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__2__Impl"


    // $ANTLR start "rule__CardGame__Group_8__3"
    // InternalCardGameLanguage.g:841:1: rule__CardGame__Group_8__3 : rule__CardGame__Group_8__3__Impl rule__CardGame__Group_8__4 ;
    public final void rule__CardGame__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:845:1: ( rule__CardGame__Group_8__3__Impl rule__CardGame__Group_8__4 )
            // InternalCardGameLanguage.g:846:2: rule__CardGame__Group_8__3__Impl rule__CardGame__Group_8__4
            {
            pushFollow(FOLLOW_11);
            rule__CardGame__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__3"


    // $ANTLR start "rule__CardGame__Group_8__3__Impl"
    // InternalCardGameLanguage.g:853:1: rule__CardGame__Group_8__3__Impl : ( ( rule__CardGame__Group_8_3__0 )* ) ;
    public final void rule__CardGame__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:857:1: ( ( ( rule__CardGame__Group_8_3__0 )* ) )
            // InternalCardGameLanguage.g:858:1: ( ( rule__CardGame__Group_8_3__0 )* )
            {
            // InternalCardGameLanguage.g:858:1: ( ( rule__CardGame__Group_8_3__0 )* )
            // InternalCardGameLanguage.g:859:2: ( rule__CardGame__Group_8_3__0 )*
            {
             before(grammarAccess.getCardGameAccess().getGroup_8_3()); 
            // InternalCardGameLanguage.g:860:2: ( rule__CardGame__Group_8_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCardGameLanguage.g:860:3: rule__CardGame__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CardGame__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCardGameAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__3__Impl"


    // $ANTLR start "rule__CardGame__Group_8__4"
    // InternalCardGameLanguage.g:868:1: rule__CardGame__Group_8__4 : rule__CardGame__Group_8__4__Impl ;
    public final void rule__CardGame__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:872:1: ( rule__CardGame__Group_8__4__Impl )
            // InternalCardGameLanguage.g:873:2: rule__CardGame__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__4"


    // $ANTLR start "rule__CardGame__Group_8__4__Impl"
    // InternalCardGameLanguage.g:879:1: rule__CardGame__Group_8__4__Impl : ( '}' ) ;
    public final void rule__CardGame__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:883:1: ( ( '}' ) )
            // InternalCardGameLanguage.g:884:1: ( '}' )
            {
            // InternalCardGameLanguage.g:884:1: ( '}' )
            // InternalCardGameLanguage.g:885:2: '}'
            {
             before(grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8__4__Impl"


    // $ANTLR start "rule__CardGame__Group_8_3__0"
    // InternalCardGameLanguage.g:895:1: rule__CardGame__Group_8_3__0 : rule__CardGame__Group_8_3__0__Impl rule__CardGame__Group_8_3__1 ;
    public final void rule__CardGame__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:899:1: ( rule__CardGame__Group_8_3__0__Impl rule__CardGame__Group_8_3__1 )
            // InternalCardGameLanguage.g:900:2: rule__CardGame__Group_8_3__0__Impl rule__CardGame__Group_8_3__1
            {
            pushFollow(FOLLOW_13);
            rule__CardGame__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8_3__0"


    // $ANTLR start "rule__CardGame__Group_8_3__0__Impl"
    // InternalCardGameLanguage.g:907:1: rule__CardGame__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__CardGame__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:911:1: ( ( ',' ) )
            // InternalCardGameLanguage.g:912:1: ( ',' )
            {
            // InternalCardGameLanguage.g:912:1: ( ',' )
            // InternalCardGameLanguage.g:913:2: ','
            {
             before(grammarAccess.getCardGameAccess().getCommaKeyword_8_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8_3__0__Impl"


    // $ANTLR start "rule__CardGame__Group_8_3__1"
    // InternalCardGameLanguage.g:922:1: rule__CardGame__Group_8_3__1 : rule__CardGame__Group_8_3__1__Impl ;
    public final void rule__CardGame__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:926:1: ( rule__CardGame__Group_8_3__1__Impl )
            // InternalCardGameLanguage.g:927:2: rule__CardGame__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8_3__1"


    // $ANTLR start "rule__CardGame__Group_8_3__1__Impl"
    // InternalCardGameLanguage.g:933:1: rule__CardGame__Group_8_3__1__Impl : ( ( rule__CardGame__RuleAssignment_8_3_1 ) ) ;
    public final void rule__CardGame__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:937:1: ( ( ( rule__CardGame__RuleAssignment_8_3_1 ) ) )
            // InternalCardGameLanguage.g:938:1: ( ( rule__CardGame__RuleAssignment_8_3_1 ) )
            {
            // InternalCardGameLanguage.g:938:1: ( ( rule__CardGame__RuleAssignment_8_3_1 ) )
            // InternalCardGameLanguage.g:939:2: ( rule__CardGame__RuleAssignment_8_3_1 )
            {
             before(grammarAccess.getCardGameAccess().getRuleAssignment_8_3_1()); 
            // InternalCardGameLanguage.g:940:2: ( rule__CardGame__RuleAssignment_8_3_1 )
            // InternalCardGameLanguage.g:940:3: rule__CardGame__RuleAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CardGame__RuleAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCardGameAccess().getRuleAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__Group_8_3__1__Impl"


    // $ANTLR start "rule__Card__Group__0"
    // InternalCardGameLanguage.g:949:1: rule__Card__Group__0 : rule__Card__Group__0__Impl rule__Card__Group__1 ;
    public final void rule__Card__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:953:1: ( rule__Card__Group__0__Impl rule__Card__Group__1 )
            // InternalCardGameLanguage.g:954:2: rule__Card__Group__0__Impl rule__Card__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0"


    // $ANTLR start "rule__Card__Group__0__Impl"
    // InternalCardGameLanguage.g:961:1: rule__Card__Group__0__Impl : ( 'Card' ) ;
    public final void rule__Card__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:965:1: ( ( 'Card' ) )
            // InternalCardGameLanguage.g:966:1: ( 'Card' )
            {
            // InternalCardGameLanguage.g:966:1: ( 'Card' )
            // InternalCardGameLanguage.g:967:2: 'Card'
            {
             before(grammarAccess.getCardAccess().getCardKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0__Impl"


    // $ANTLR start "rule__Card__Group__1"
    // InternalCardGameLanguage.g:976:1: rule__Card__Group__1 : rule__Card__Group__1__Impl rule__Card__Group__2 ;
    public final void rule__Card__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:980:1: ( rule__Card__Group__1__Impl rule__Card__Group__2 )
            // InternalCardGameLanguage.g:981:2: rule__Card__Group__1__Impl rule__Card__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Card__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1"


    // $ANTLR start "rule__Card__Group__1__Impl"
    // InternalCardGameLanguage.g:988:1: rule__Card__Group__1__Impl : ( ( rule__Card__NameAssignment_1 ) ) ;
    public final void rule__Card__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:992:1: ( ( ( rule__Card__NameAssignment_1 ) ) )
            // InternalCardGameLanguage.g:993:1: ( ( rule__Card__NameAssignment_1 ) )
            {
            // InternalCardGameLanguage.g:993:1: ( ( rule__Card__NameAssignment_1 ) )
            // InternalCardGameLanguage.g:994:2: ( rule__Card__NameAssignment_1 )
            {
             before(grammarAccess.getCardAccess().getNameAssignment_1()); 
            // InternalCardGameLanguage.g:995:2: ( rule__Card__NameAssignment_1 )
            // InternalCardGameLanguage.g:995:3: rule__Card__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Card__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1__Impl"


    // $ANTLR start "rule__Card__Group__2"
    // InternalCardGameLanguage.g:1003:1: rule__Card__Group__2 : rule__Card__Group__2__Impl rule__Card__Group__3 ;
    public final void rule__Card__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1007:1: ( rule__Card__Group__2__Impl rule__Card__Group__3 )
            // InternalCardGameLanguage.g:1008:2: rule__Card__Group__2__Impl rule__Card__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2"


    // $ANTLR start "rule__Card__Group__2__Impl"
    // InternalCardGameLanguage.g:1015:1: rule__Card__Group__2__Impl : ( '{' ) ;
    public final void rule__Card__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1019:1: ( ( '{' ) )
            // InternalCardGameLanguage.g:1020:1: ( '{' )
            {
            // InternalCardGameLanguage.g:1020:1: ( '{' )
            // InternalCardGameLanguage.g:1021:2: '{'
            {
             before(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2__Impl"


    // $ANTLR start "rule__Card__Group__3"
    // InternalCardGameLanguage.g:1030:1: rule__Card__Group__3 : rule__Card__Group__3__Impl rule__Card__Group__4 ;
    public final void rule__Card__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1034:1: ( rule__Card__Group__3__Impl rule__Card__Group__4 )
            // InternalCardGameLanguage.g:1035:2: rule__Card__Group__3__Impl rule__Card__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Card__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3"


    // $ANTLR start "rule__Card__Group__3__Impl"
    // InternalCardGameLanguage.g:1042:1: rule__Card__Group__3__Impl : ( ( rule__Card__DefinitionAssignment_3 ) ) ;
    public final void rule__Card__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1046:1: ( ( ( rule__Card__DefinitionAssignment_3 ) ) )
            // InternalCardGameLanguage.g:1047:1: ( ( rule__Card__DefinitionAssignment_3 ) )
            {
            // InternalCardGameLanguage.g:1047:1: ( ( rule__Card__DefinitionAssignment_3 ) )
            // InternalCardGameLanguage.g:1048:2: ( rule__Card__DefinitionAssignment_3 )
            {
             before(grammarAccess.getCardAccess().getDefinitionAssignment_3()); 
            // InternalCardGameLanguage.g:1049:2: ( rule__Card__DefinitionAssignment_3 )
            // InternalCardGameLanguage.g:1049:3: rule__Card__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Card__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3__Impl"


    // $ANTLR start "rule__Card__Group__4"
    // InternalCardGameLanguage.g:1057:1: rule__Card__Group__4 : rule__Card__Group__4__Impl rule__Card__Group__5 ;
    public final void rule__Card__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1061:1: ( rule__Card__Group__4__Impl rule__Card__Group__5 )
            // InternalCardGameLanguage.g:1062:2: rule__Card__Group__4__Impl rule__Card__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Card__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4"


    // $ANTLR start "rule__Card__Group__4__Impl"
    // InternalCardGameLanguage.g:1069:1: rule__Card__Group__4__Impl : ( ( rule__Card__Group_4__0 )* ) ;
    public final void rule__Card__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1073:1: ( ( ( rule__Card__Group_4__0 )* ) )
            // InternalCardGameLanguage.g:1074:1: ( ( rule__Card__Group_4__0 )* )
            {
            // InternalCardGameLanguage.g:1074:1: ( ( rule__Card__Group_4__0 )* )
            // InternalCardGameLanguage.g:1075:2: ( rule__Card__Group_4__0 )*
            {
             before(grammarAccess.getCardAccess().getGroup_4()); 
            // InternalCardGameLanguage.g:1076:2: ( rule__Card__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCardGameLanguage.g:1076:3: rule__Card__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Card__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCardAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4__Impl"


    // $ANTLR start "rule__Card__Group__5"
    // InternalCardGameLanguage.g:1084:1: rule__Card__Group__5 : rule__Card__Group__5__Impl ;
    public final void rule__Card__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1088:1: ( rule__Card__Group__5__Impl )
            // InternalCardGameLanguage.g:1089:2: rule__Card__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5"


    // $ANTLR start "rule__Card__Group__5__Impl"
    // InternalCardGameLanguage.g:1095:1: rule__Card__Group__5__Impl : ( ( '}' )? ) ;
    public final void rule__Card__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1099:1: ( ( ( '}' )? ) )
            // InternalCardGameLanguage.g:1100:1: ( ( '}' )? )
            {
            // InternalCardGameLanguage.g:1100:1: ( ( '}' )? )
            // InternalCardGameLanguage.g:1101:2: ( '}' )?
            {
             before(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_5()); 
            // InternalCardGameLanguage.g:1102:2: ( '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCardGameLanguage.g:1102:3: '}'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5__Impl"


    // $ANTLR start "rule__Card__Group_4__0"
    // InternalCardGameLanguage.g:1111:1: rule__Card__Group_4__0 : rule__Card__Group_4__0__Impl rule__Card__Group_4__1 ;
    public final void rule__Card__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1115:1: ( rule__Card__Group_4__0__Impl rule__Card__Group_4__1 )
            // InternalCardGameLanguage.g:1116:2: rule__Card__Group_4__0__Impl rule__Card__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_4__0"


    // $ANTLR start "rule__Card__Group_4__0__Impl"
    // InternalCardGameLanguage.g:1123:1: rule__Card__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Card__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1127:1: ( ( ',' ) )
            // InternalCardGameLanguage.g:1128:1: ( ',' )
            {
            // InternalCardGameLanguage.g:1128:1: ( ',' )
            // InternalCardGameLanguage.g:1129:2: ','
            {
             before(grammarAccess.getCardAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_4__0__Impl"


    // $ANTLR start "rule__Card__Group_4__1"
    // InternalCardGameLanguage.g:1138:1: rule__Card__Group_4__1 : rule__Card__Group_4__1__Impl ;
    public final void rule__Card__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1142:1: ( rule__Card__Group_4__1__Impl )
            // InternalCardGameLanguage.g:1143:2: rule__Card__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_4__1"


    // $ANTLR start "rule__Card__Group_4__1__Impl"
    // InternalCardGameLanguage.g:1149:1: rule__Card__Group_4__1__Impl : ( ( rule__Card__DefinitionAssignment_4_1 ) ) ;
    public final void rule__Card__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1153:1: ( ( ( rule__Card__DefinitionAssignment_4_1 ) ) )
            // InternalCardGameLanguage.g:1154:1: ( ( rule__Card__DefinitionAssignment_4_1 ) )
            {
            // InternalCardGameLanguage.g:1154:1: ( ( rule__Card__DefinitionAssignment_4_1 ) )
            // InternalCardGameLanguage.g:1155:2: ( rule__Card__DefinitionAssignment_4_1 )
            {
             before(grammarAccess.getCardAccess().getDefinitionAssignment_4_1()); 
            // InternalCardGameLanguage.g:1156:2: ( rule__Card__DefinitionAssignment_4_1 )
            // InternalCardGameLanguage.g:1156:3: rule__Card__DefinitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Card__DefinitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getDefinitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_4__1__Impl"


    // $ANTLR start "rule__CardProperty__Group__0"
    // InternalCardGameLanguage.g:1165:1: rule__CardProperty__Group__0 : rule__CardProperty__Group__0__Impl rule__CardProperty__Group__1 ;
    public final void rule__CardProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1169:1: ( rule__CardProperty__Group__0__Impl rule__CardProperty__Group__1 )
            // InternalCardGameLanguage.g:1170:2: rule__CardProperty__Group__0__Impl rule__CardProperty__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CardProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group__0"


    // $ANTLR start "rule__CardProperty__Group__0__Impl"
    // InternalCardGameLanguage.g:1177:1: rule__CardProperty__Group__0__Impl : ( ( rule__CardProperty__TypeAssignment_0 ) ) ;
    public final void rule__CardProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1181:1: ( ( ( rule__CardProperty__TypeAssignment_0 ) ) )
            // InternalCardGameLanguage.g:1182:1: ( ( rule__CardProperty__TypeAssignment_0 ) )
            {
            // InternalCardGameLanguage.g:1182:1: ( ( rule__CardProperty__TypeAssignment_0 ) )
            // InternalCardGameLanguage.g:1183:2: ( rule__CardProperty__TypeAssignment_0 )
            {
             before(grammarAccess.getCardPropertyAccess().getTypeAssignment_0()); 
            // InternalCardGameLanguage.g:1184:2: ( rule__CardProperty__TypeAssignment_0 )
            // InternalCardGameLanguage.g:1184:3: rule__CardProperty__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CardProperty__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardPropertyAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group__0__Impl"


    // $ANTLR start "rule__CardProperty__Group__1"
    // InternalCardGameLanguage.g:1192:1: rule__CardProperty__Group__1 : rule__CardProperty__Group__1__Impl ;
    public final void rule__CardProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1196:1: ( rule__CardProperty__Group__1__Impl )
            // InternalCardGameLanguage.g:1197:2: rule__CardProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardProperty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group__1"


    // $ANTLR start "rule__CardProperty__Group__1__Impl"
    // InternalCardGameLanguage.g:1203:1: rule__CardProperty__Group__1__Impl : ( ( rule__CardProperty__Group_1__0 )? ) ;
    public final void rule__CardProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1207:1: ( ( ( rule__CardProperty__Group_1__0 )? ) )
            // InternalCardGameLanguage.g:1208:1: ( ( rule__CardProperty__Group_1__0 )? )
            {
            // InternalCardGameLanguage.g:1208:1: ( ( rule__CardProperty__Group_1__0 )? )
            // InternalCardGameLanguage.g:1209:2: ( rule__CardProperty__Group_1__0 )?
            {
             before(grammarAccess.getCardPropertyAccess().getGroup_1()); 
            // InternalCardGameLanguage.g:1210:2: ( rule__CardProperty__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCardGameLanguage.g:1210:3: rule__CardProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CardProperty__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardPropertyAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group__1__Impl"


    // $ANTLR start "rule__CardProperty__Group_1__0"
    // InternalCardGameLanguage.g:1219:1: rule__CardProperty__Group_1__0 : rule__CardProperty__Group_1__0__Impl rule__CardProperty__Group_1__1 ;
    public final void rule__CardProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1223:1: ( rule__CardProperty__Group_1__0__Impl rule__CardProperty__Group_1__1 )
            // InternalCardGameLanguage.g:1224:2: rule__CardProperty__Group_1__0__Impl rule__CardProperty__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__CardProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group_1__0"


    // $ANTLR start "rule__CardProperty__Group_1__0__Impl"
    // InternalCardGameLanguage.g:1231:1: rule__CardProperty__Group_1__0__Impl : ( ':' ) ;
    public final void rule__CardProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1235:1: ( ( ':' ) )
            // InternalCardGameLanguage.g:1236:1: ( ':' )
            {
            // InternalCardGameLanguage.g:1236:1: ( ':' )
            // InternalCardGameLanguage.g:1237:2: ':'
            {
             before(grammarAccess.getCardPropertyAccess().getColonKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardPropertyAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group_1__0__Impl"


    // $ANTLR start "rule__CardProperty__Group_1__1"
    // InternalCardGameLanguage.g:1246:1: rule__CardProperty__Group_1__1 : rule__CardProperty__Group_1__1__Impl ;
    public final void rule__CardProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1250:1: ( rule__CardProperty__Group_1__1__Impl )
            // InternalCardGameLanguage.g:1251:2: rule__CardProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardProperty__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group_1__1"


    // $ANTLR start "rule__CardProperty__Group_1__1__Impl"
    // InternalCardGameLanguage.g:1257:1: rule__CardProperty__Group_1__1__Impl : ( ( rule__CardProperty__ValueAssignment_1_1 ) ) ;
    public final void rule__CardProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1261:1: ( ( ( rule__CardProperty__ValueAssignment_1_1 ) ) )
            // InternalCardGameLanguage.g:1262:1: ( ( rule__CardProperty__ValueAssignment_1_1 ) )
            {
            // InternalCardGameLanguage.g:1262:1: ( ( rule__CardProperty__ValueAssignment_1_1 ) )
            // InternalCardGameLanguage.g:1263:2: ( rule__CardProperty__ValueAssignment_1_1 )
            {
             before(grammarAccess.getCardPropertyAccess().getValueAssignment_1_1()); 
            // InternalCardGameLanguage.g:1264:2: ( rule__CardProperty__ValueAssignment_1_1 )
            // InternalCardGameLanguage.g:1264:3: rule__CardProperty__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CardProperty__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCardPropertyAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__Group_1__1__Impl"


    // $ANTLR start "rule__SingleRule__Group__0"
    // InternalCardGameLanguage.g:1273:1: rule__SingleRule__Group__0 : rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 ;
    public final void rule__SingleRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1277:1: ( rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1 )
            // InternalCardGameLanguage.g:1278:2: rule__SingleRule__Group__0__Impl rule__SingleRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SingleRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__0"


    // $ANTLR start "rule__SingleRule__Group__0__Impl"
    // InternalCardGameLanguage.g:1285:1: rule__SingleRule__Group__0__Impl : ( 'SingleRule' ) ;
    public final void rule__SingleRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1289:1: ( ( 'SingleRule' ) )
            // InternalCardGameLanguage.g:1290:1: ( 'SingleRule' )
            {
            // InternalCardGameLanguage.g:1290:1: ( 'SingleRule' )
            // InternalCardGameLanguage.g:1291:2: 'SingleRule'
            {
             before(grammarAccess.getSingleRuleAccess().getSingleRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getSingleRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__0__Impl"


    // $ANTLR start "rule__SingleRule__Group__1"
    // InternalCardGameLanguage.g:1300:1: rule__SingleRule__Group__1 : rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 ;
    public final void rule__SingleRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1304:1: ( rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2 )
            // InternalCardGameLanguage.g:1305:2: rule__SingleRule__Group__1__Impl rule__SingleRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SingleRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__1"


    // $ANTLR start "rule__SingleRule__Group__1__Impl"
    // InternalCardGameLanguage.g:1312:1: rule__SingleRule__Group__1__Impl : ( ( rule__SingleRule__NameAssignment_1 ) ) ;
    public final void rule__SingleRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1316:1: ( ( ( rule__SingleRule__NameAssignment_1 ) ) )
            // InternalCardGameLanguage.g:1317:1: ( ( rule__SingleRule__NameAssignment_1 ) )
            {
            // InternalCardGameLanguage.g:1317:1: ( ( rule__SingleRule__NameAssignment_1 ) )
            // InternalCardGameLanguage.g:1318:2: ( rule__SingleRule__NameAssignment_1 )
            {
             before(grammarAccess.getSingleRuleAccess().getNameAssignment_1()); 
            // InternalCardGameLanguage.g:1319:2: ( rule__SingleRule__NameAssignment_1 )
            // InternalCardGameLanguage.g:1319:3: rule__SingleRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__1__Impl"


    // $ANTLR start "rule__SingleRule__Group__2"
    // InternalCardGameLanguage.g:1327:1: rule__SingleRule__Group__2 : rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 ;
    public final void rule__SingleRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1331:1: ( rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3 )
            // InternalCardGameLanguage.g:1332:2: rule__SingleRule__Group__2__Impl rule__SingleRule__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SingleRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__2"


    // $ANTLR start "rule__SingleRule__Group__2__Impl"
    // InternalCardGameLanguage.g:1339:1: rule__SingleRule__Group__2__Impl : ( '{' ) ;
    public final void rule__SingleRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1343:1: ( ( '{' ) )
            // InternalCardGameLanguage.g:1344:1: ( '{' )
            {
            // InternalCardGameLanguage.g:1344:1: ( '{' )
            // InternalCardGameLanguage.g:1345:2: '{'
            {
             before(grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__2__Impl"


    // $ANTLR start "rule__SingleRule__Group__3"
    // InternalCardGameLanguage.g:1354:1: rule__SingleRule__Group__3 : rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 ;
    public final void rule__SingleRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1358:1: ( rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4 )
            // InternalCardGameLanguage.g:1359:2: rule__SingleRule__Group__3__Impl rule__SingleRule__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SingleRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__3"


    // $ANTLR start "rule__SingleRule__Group__3__Impl"
    // InternalCardGameLanguage.g:1366:1: rule__SingleRule__Group__3__Impl : ( ( rule__SingleRule__Role1Assignment_3 ) ) ;
    public final void rule__SingleRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1370:1: ( ( ( rule__SingleRule__Role1Assignment_3 ) ) )
            // InternalCardGameLanguage.g:1371:1: ( ( rule__SingleRule__Role1Assignment_3 ) )
            {
            // InternalCardGameLanguage.g:1371:1: ( ( rule__SingleRule__Role1Assignment_3 ) )
            // InternalCardGameLanguage.g:1372:2: ( rule__SingleRule__Role1Assignment_3 )
            {
             before(grammarAccess.getSingleRuleAccess().getRole1Assignment_3()); 
            // InternalCardGameLanguage.g:1373:2: ( rule__SingleRule__Role1Assignment_3 )
            // InternalCardGameLanguage.g:1373:3: rule__SingleRule__Role1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__Role1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getRole1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__3__Impl"


    // $ANTLR start "rule__SingleRule__Group__4"
    // InternalCardGameLanguage.g:1381:1: rule__SingleRule__Group__4 : rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5 ;
    public final void rule__SingleRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1385:1: ( rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5 )
            // InternalCardGameLanguage.g:1386:2: rule__SingleRule__Group__4__Impl rule__SingleRule__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SingleRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__4"


    // $ANTLR start "rule__SingleRule__Group__4__Impl"
    // InternalCardGameLanguage.g:1393:1: rule__SingleRule__Group__4__Impl : ( 'No.' ) ;
    public final void rule__SingleRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1397:1: ( ( 'No.' ) )
            // InternalCardGameLanguage.g:1398:1: ( 'No.' )
            {
            // InternalCardGameLanguage.g:1398:1: ( 'No.' )
            // InternalCardGameLanguage.g:1399:2: 'No.'
            {
             before(grammarAccess.getSingleRuleAccess().getNoKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getNoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__4__Impl"


    // $ANTLR start "rule__SingleRule__Group__5"
    // InternalCardGameLanguage.g:1408:1: rule__SingleRule__Group__5 : rule__SingleRule__Group__5__Impl rule__SingleRule__Group__6 ;
    public final void rule__SingleRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1412:1: ( rule__SingleRule__Group__5__Impl rule__SingleRule__Group__6 )
            // InternalCardGameLanguage.g:1413:2: rule__SingleRule__Group__5__Impl rule__SingleRule__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__SingleRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__5"


    // $ANTLR start "rule__SingleRule__Group__5__Impl"
    // InternalCardGameLanguage.g:1420:1: rule__SingleRule__Group__5__Impl : ( ( rule__SingleRule__Number1Assignment_5 ) ) ;
    public final void rule__SingleRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1424:1: ( ( ( rule__SingleRule__Number1Assignment_5 ) ) )
            // InternalCardGameLanguage.g:1425:1: ( ( rule__SingleRule__Number1Assignment_5 ) )
            {
            // InternalCardGameLanguage.g:1425:1: ( ( rule__SingleRule__Number1Assignment_5 ) )
            // InternalCardGameLanguage.g:1426:2: ( rule__SingleRule__Number1Assignment_5 )
            {
             before(grammarAccess.getSingleRuleAccess().getNumber1Assignment_5()); 
            // InternalCardGameLanguage.g:1427:2: ( rule__SingleRule__Number1Assignment_5 )
            // InternalCardGameLanguage.g:1427:3: rule__SingleRule__Number1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__Number1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getNumber1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__5__Impl"


    // $ANTLR start "rule__SingleRule__Group__6"
    // InternalCardGameLanguage.g:1435:1: rule__SingleRule__Group__6 : rule__SingleRule__Group__6__Impl rule__SingleRule__Group__7 ;
    public final void rule__SingleRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1439:1: ( rule__SingleRule__Group__6__Impl rule__SingleRule__Group__7 )
            // InternalCardGameLanguage.g:1440:2: rule__SingleRule__Group__6__Impl rule__SingleRule__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__SingleRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__6"


    // $ANTLR start "rule__SingleRule__Group__6__Impl"
    // InternalCardGameLanguage.g:1447:1: rule__SingleRule__Group__6__Impl : ( ( rule__SingleRule__ItemAssignment_6 ) ) ;
    public final void rule__SingleRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1451:1: ( ( ( rule__SingleRule__ItemAssignment_6 ) ) )
            // InternalCardGameLanguage.g:1452:1: ( ( rule__SingleRule__ItemAssignment_6 ) )
            {
            // InternalCardGameLanguage.g:1452:1: ( ( rule__SingleRule__ItemAssignment_6 ) )
            // InternalCardGameLanguage.g:1453:2: ( rule__SingleRule__ItemAssignment_6 )
            {
             before(grammarAccess.getSingleRuleAccess().getItemAssignment_6()); 
            // InternalCardGameLanguage.g:1454:2: ( rule__SingleRule__ItemAssignment_6 )
            // InternalCardGameLanguage.g:1454:3: rule__SingleRule__ItemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__ItemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getItemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__6__Impl"


    // $ANTLR start "rule__SingleRule__Group__7"
    // InternalCardGameLanguage.g:1462:1: rule__SingleRule__Group__7 : rule__SingleRule__Group__7__Impl rule__SingleRule__Group__8 ;
    public final void rule__SingleRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1466:1: ( rule__SingleRule__Group__7__Impl rule__SingleRule__Group__8 )
            // InternalCardGameLanguage.g:1467:2: rule__SingleRule__Group__7__Impl rule__SingleRule__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__SingleRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__7"


    // $ANTLR start "rule__SingleRule__Group__7__Impl"
    // InternalCardGameLanguage.g:1474:1: rule__SingleRule__Group__7__Impl : ( ( rule__SingleRule__KeywordAssignment_7 ) ) ;
    public final void rule__SingleRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1478:1: ( ( ( rule__SingleRule__KeywordAssignment_7 ) ) )
            // InternalCardGameLanguage.g:1479:1: ( ( rule__SingleRule__KeywordAssignment_7 ) )
            {
            // InternalCardGameLanguage.g:1479:1: ( ( rule__SingleRule__KeywordAssignment_7 ) )
            // InternalCardGameLanguage.g:1480:2: ( rule__SingleRule__KeywordAssignment_7 )
            {
             before(grammarAccess.getSingleRuleAccess().getKeywordAssignment_7()); 
            // InternalCardGameLanguage.g:1481:2: ( rule__SingleRule__KeywordAssignment_7 )
            // InternalCardGameLanguage.g:1481:3: rule__SingleRule__KeywordAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__KeywordAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getKeywordAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__7__Impl"


    // $ANTLR start "rule__SingleRule__Group__8"
    // InternalCardGameLanguage.g:1489:1: rule__SingleRule__Group__8 : rule__SingleRule__Group__8__Impl rule__SingleRule__Group__9 ;
    public final void rule__SingleRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1493:1: ( rule__SingleRule__Group__8__Impl rule__SingleRule__Group__9 )
            // InternalCardGameLanguage.g:1494:2: rule__SingleRule__Group__8__Impl rule__SingleRule__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__SingleRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__8"


    // $ANTLR start "rule__SingleRule__Group__8__Impl"
    // InternalCardGameLanguage.g:1501:1: rule__SingleRule__Group__8__Impl : ( ( rule__SingleRule__Role2Assignment_8 ) ) ;
    public final void rule__SingleRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1505:1: ( ( ( rule__SingleRule__Role2Assignment_8 ) ) )
            // InternalCardGameLanguage.g:1506:1: ( ( rule__SingleRule__Role2Assignment_8 ) )
            {
            // InternalCardGameLanguage.g:1506:1: ( ( rule__SingleRule__Role2Assignment_8 ) )
            // InternalCardGameLanguage.g:1507:2: ( rule__SingleRule__Role2Assignment_8 )
            {
             before(grammarAccess.getSingleRuleAccess().getRole2Assignment_8()); 
            // InternalCardGameLanguage.g:1508:2: ( rule__SingleRule__Role2Assignment_8 )
            // InternalCardGameLanguage.g:1508:3: rule__SingleRule__Role2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__Role2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getRole2Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__8__Impl"


    // $ANTLR start "rule__SingleRule__Group__9"
    // InternalCardGameLanguage.g:1516:1: rule__SingleRule__Group__9 : rule__SingleRule__Group__9__Impl rule__SingleRule__Group__10 ;
    public final void rule__SingleRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1520:1: ( rule__SingleRule__Group__9__Impl rule__SingleRule__Group__10 )
            // InternalCardGameLanguage.g:1521:2: rule__SingleRule__Group__9__Impl rule__SingleRule__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__SingleRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__9"


    // $ANTLR start "rule__SingleRule__Group__9__Impl"
    // InternalCardGameLanguage.g:1528:1: rule__SingleRule__Group__9__Impl : ( 'No.' ) ;
    public final void rule__SingleRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1532:1: ( ( 'No.' ) )
            // InternalCardGameLanguage.g:1533:1: ( 'No.' )
            {
            // InternalCardGameLanguage.g:1533:1: ( 'No.' )
            // InternalCardGameLanguage.g:1534:2: 'No.'
            {
             before(grammarAccess.getSingleRuleAccess().getNoKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getNoKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__9__Impl"


    // $ANTLR start "rule__SingleRule__Group__10"
    // InternalCardGameLanguage.g:1543:1: rule__SingleRule__Group__10 : rule__SingleRule__Group__10__Impl rule__SingleRule__Group__11 ;
    public final void rule__SingleRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1547:1: ( rule__SingleRule__Group__10__Impl rule__SingleRule__Group__11 )
            // InternalCardGameLanguage.g:1548:2: rule__SingleRule__Group__10__Impl rule__SingleRule__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__SingleRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__10"


    // $ANTLR start "rule__SingleRule__Group__10__Impl"
    // InternalCardGameLanguage.g:1555:1: rule__SingleRule__Group__10__Impl : ( ( rule__SingleRule__Number2Assignment_10 )? ) ;
    public final void rule__SingleRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1559:1: ( ( ( rule__SingleRule__Number2Assignment_10 )? ) )
            // InternalCardGameLanguage.g:1560:1: ( ( rule__SingleRule__Number2Assignment_10 )? )
            {
            // InternalCardGameLanguage.g:1560:1: ( ( rule__SingleRule__Number2Assignment_10 )? )
            // InternalCardGameLanguage.g:1561:2: ( rule__SingleRule__Number2Assignment_10 )?
            {
             before(grammarAccess.getSingleRuleAccess().getNumber2Assignment_10()); 
            // InternalCardGameLanguage.g:1562:2: ( rule__SingleRule__Number2Assignment_10 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCardGameLanguage.g:1562:3: rule__SingleRule__Number2Assignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleRule__Number2Assignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleRuleAccess().getNumber2Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__10__Impl"


    // $ANTLR start "rule__SingleRule__Group__11"
    // InternalCardGameLanguage.g:1570:1: rule__SingleRule__Group__11 : rule__SingleRule__Group__11__Impl rule__SingleRule__Group__12 ;
    public final void rule__SingleRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1574:1: ( rule__SingleRule__Group__11__Impl rule__SingleRule__Group__12 )
            // InternalCardGameLanguage.g:1575:2: rule__SingleRule__Group__11__Impl rule__SingleRule__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__SingleRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__11"


    // $ANTLR start "rule__SingleRule__Group__11__Impl"
    // InternalCardGameLanguage.g:1582:1: rule__SingleRule__Group__11__Impl : ( 'level' ) ;
    public final void rule__SingleRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1586:1: ( ( 'level' ) )
            // InternalCardGameLanguage.g:1587:1: ( 'level' )
            {
            // InternalCardGameLanguage.g:1587:1: ( 'level' )
            // InternalCardGameLanguage.g:1588:2: 'level'
            {
             before(grammarAccess.getSingleRuleAccess().getLevelKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getLevelKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__11__Impl"


    // $ANTLR start "rule__SingleRule__Group__12"
    // InternalCardGameLanguage.g:1597:1: rule__SingleRule__Group__12 : rule__SingleRule__Group__12__Impl rule__SingleRule__Group__13 ;
    public final void rule__SingleRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1601:1: ( rule__SingleRule__Group__12__Impl rule__SingleRule__Group__13 )
            // InternalCardGameLanguage.g:1602:2: rule__SingleRule__Group__12__Impl rule__SingleRule__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__SingleRule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__12"


    // $ANTLR start "rule__SingleRule__Group__12__Impl"
    // InternalCardGameLanguage.g:1609:1: rule__SingleRule__Group__12__Impl : ( ( rule__SingleRule__LevelAssignment_12 ) ) ;
    public final void rule__SingleRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1613:1: ( ( ( rule__SingleRule__LevelAssignment_12 ) ) )
            // InternalCardGameLanguage.g:1614:1: ( ( rule__SingleRule__LevelAssignment_12 ) )
            {
            // InternalCardGameLanguage.g:1614:1: ( ( rule__SingleRule__LevelAssignment_12 ) )
            // InternalCardGameLanguage.g:1615:2: ( rule__SingleRule__LevelAssignment_12 )
            {
             before(grammarAccess.getSingleRuleAccess().getLevelAssignment_12()); 
            // InternalCardGameLanguage.g:1616:2: ( rule__SingleRule__LevelAssignment_12 )
            // InternalCardGameLanguage.g:1616:3: rule__SingleRule__LevelAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__LevelAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSingleRuleAccess().getLevelAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__12__Impl"


    // $ANTLR start "rule__SingleRule__Group__13"
    // InternalCardGameLanguage.g:1624:1: rule__SingleRule__Group__13 : rule__SingleRule__Group__13__Impl ;
    public final void rule__SingleRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1628:1: ( rule__SingleRule__Group__13__Impl )
            // InternalCardGameLanguage.g:1629:2: rule__SingleRule__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleRule__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__13"


    // $ANTLR start "rule__SingleRule__Group__13__Impl"
    // InternalCardGameLanguage.g:1635:1: rule__SingleRule__Group__13__Impl : ( '}' ) ;
    public final void rule__SingleRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1639:1: ( ( '}' ) )
            // InternalCardGameLanguage.g:1640:1: ( '}' )
            {
            // InternalCardGameLanguage.g:1640:1: ( '}' )
            // InternalCardGameLanguage.g:1641:2: '}'
            {
             before(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Group__13__Impl"


    // $ANTLR start "rule__EqualRule__Group__0"
    // InternalCardGameLanguage.g:1651:1: rule__EqualRule__Group__0 : rule__EqualRule__Group__0__Impl rule__EqualRule__Group__1 ;
    public final void rule__EqualRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1655:1: ( rule__EqualRule__Group__0__Impl rule__EqualRule__Group__1 )
            // InternalCardGameLanguage.g:1656:2: rule__EqualRule__Group__0__Impl rule__EqualRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EqualRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__0"


    // $ANTLR start "rule__EqualRule__Group__0__Impl"
    // InternalCardGameLanguage.g:1663:1: rule__EqualRule__Group__0__Impl : ( 'EqualRule' ) ;
    public final void rule__EqualRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1667:1: ( ( 'EqualRule' ) )
            // InternalCardGameLanguage.g:1668:1: ( 'EqualRule' )
            {
            // InternalCardGameLanguage.g:1668:1: ( 'EqualRule' )
            // InternalCardGameLanguage.g:1669:2: 'EqualRule'
            {
             before(grammarAccess.getEqualRuleAccess().getEqualRuleKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getEqualRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__0__Impl"


    // $ANTLR start "rule__EqualRule__Group__1"
    // InternalCardGameLanguage.g:1678:1: rule__EqualRule__Group__1 : rule__EqualRule__Group__1__Impl rule__EqualRule__Group__2 ;
    public final void rule__EqualRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1682:1: ( rule__EqualRule__Group__1__Impl rule__EqualRule__Group__2 )
            // InternalCardGameLanguage.g:1683:2: rule__EqualRule__Group__1__Impl rule__EqualRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EqualRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__1"


    // $ANTLR start "rule__EqualRule__Group__1__Impl"
    // InternalCardGameLanguage.g:1690:1: rule__EqualRule__Group__1__Impl : ( ( rule__EqualRule__NameAssignment_1 ) ) ;
    public final void rule__EqualRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1694:1: ( ( ( rule__EqualRule__NameAssignment_1 ) ) )
            // InternalCardGameLanguage.g:1695:1: ( ( rule__EqualRule__NameAssignment_1 ) )
            {
            // InternalCardGameLanguage.g:1695:1: ( ( rule__EqualRule__NameAssignment_1 ) )
            // InternalCardGameLanguage.g:1696:2: ( rule__EqualRule__NameAssignment_1 )
            {
             before(grammarAccess.getEqualRuleAccess().getNameAssignment_1()); 
            // InternalCardGameLanguage.g:1697:2: ( rule__EqualRule__NameAssignment_1 )
            // InternalCardGameLanguage.g:1697:3: rule__EqualRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__1__Impl"


    // $ANTLR start "rule__EqualRule__Group__2"
    // InternalCardGameLanguage.g:1705:1: rule__EqualRule__Group__2 : rule__EqualRule__Group__2__Impl rule__EqualRule__Group__3 ;
    public final void rule__EqualRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1709:1: ( rule__EqualRule__Group__2__Impl rule__EqualRule__Group__3 )
            // InternalCardGameLanguage.g:1710:2: rule__EqualRule__Group__2__Impl rule__EqualRule__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__EqualRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__2"


    // $ANTLR start "rule__EqualRule__Group__2__Impl"
    // InternalCardGameLanguage.g:1717:1: rule__EqualRule__Group__2__Impl : ( '{' ) ;
    public final void rule__EqualRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1721:1: ( ( '{' ) )
            // InternalCardGameLanguage.g:1722:1: ( '{' )
            {
            // InternalCardGameLanguage.g:1722:1: ( '{' )
            // InternalCardGameLanguage.g:1723:2: '{'
            {
             before(grammarAccess.getEqualRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__2__Impl"


    // $ANTLR start "rule__EqualRule__Group__3"
    // InternalCardGameLanguage.g:1732:1: rule__EqualRule__Group__3 : rule__EqualRule__Group__3__Impl rule__EqualRule__Group__4 ;
    public final void rule__EqualRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1736:1: ( rule__EqualRule__Group__3__Impl rule__EqualRule__Group__4 )
            // InternalCardGameLanguage.g:1737:2: rule__EqualRule__Group__3__Impl rule__EqualRule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__EqualRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__3"


    // $ANTLR start "rule__EqualRule__Group__3__Impl"
    // InternalCardGameLanguage.g:1744:1: rule__EqualRule__Group__3__Impl : ( 'ComparedCardsNum' ) ;
    public final void rule__EqualRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1748:1: ( ( 'ComparedCardsNum' ) )
            // InternalCardGameLanguage.g:1749:1: ( 'ComparedCardsNum' )
            {
            // InternalCardGameLanguage.g:1749:1: ( 'ComparedCardsNum' )
            // InternalCardGameLanguage.g:1750:2: 'ComparedCardsNum'
            {
             before(grammarAccess.getEqualRuleAccess().getComparedCardsNumKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getComparedCardsNumKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__3__Impl"


    // $ANTLR start "rule__EqualRule__Group__4"
    // InternalCardGameLanguage.g:1759:1: rule__EqualRule__Group__4 : rule__EqualRule__Group__4__Impl rule__EqualRule__Group__5 ;
    public final void rule__EqualRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1763:1: ( rule__EqualRule__Group__4__Impl rule__EqualRule__Group__5 )
            // InternalCardGameLanguage.g:1764:2: rule__EqualRule__Group__4__Impl rule__EqualRule__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__EqualRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__4"


    // $ANTLR start "rule__EqualRule__Group__4__Impl"
    // InternalCardGameLanguage.g:1771:1: rule__EqualRule__Group__4__Impl : ( ( rule__EqualRule__NumberAssignment_4 ) ) ;
    public final void rule__EqualRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1775:1: ( ( ( rule__EqualRule__NumberAssignment_4 ) ) )
            // InternalCardGameLanguage.g:1776:1: ( ( rule__EqualRule__NumberAssignment_4 ) )
            {
            // InternalCardGameLanguage.g:1776:1: ( ( rule__EqualRule__NumberAssignment_4 ) )
            // InternalCardGameLanguage.g:1777:2: ( rule__EqualRule__NumberAssignment_4 )
            {
             before(grammarAccess.getEqualRuleAccess().getNumberAssignment_4()); 
            // InternalCardGameLanguage.g:1778:2: ( rule__EqualRule__NumberAssignment_4 )
            // InternalCardGameLanguage.g:1778:3: rule__EqualRule__NumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__NumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEqualRuleAccess().getNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__4__Impl"


    // $ANTLR start "rule__EqualRule__Group__5"
    // InternalCardGameLanguage.g:1786:1: rule__EqualRule__Group__5 : rule__EqualRule__Group__5__Impl rule__EqualRule__Group__6 ;
    public final void rule__EqualRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1790:1: ( rule__EqualRule__Group__5__Impl rule__EqualRule__Group__6 )
            // InternalCardGameLanguage.g:1791:2: rule__EqualRule__Group__5__Impl rule__EqualRule__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__EqualRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__5"


    // $ANTLR start "rule__EqualRule__Group__5__Impl"
    // InternalCardGameLanguage.g:1798:1: rule__EqualRule__Group__5__Impl : ( 'ComparedItem' ) ;
    public final void rule__EqualRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1802:1: ( ( 'ComparedItem' ) )
            // InternalCardGameLanguage.g:1803:1: ( 'ComparedItem' )
            {
            // InternalCardGameLanguage.g:1803:1: ( 'ComparedItem' )
            // InternalCardGameLanguage.g:1804:2: 'ComparedItem'
            {
             before(grammarAccess.getEqualRuleAccess().getComparedItemKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getComparedItemKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__5__Impl"


    // $ANTLR start "rule__EqualRule__Group__6"
    // InternalCardGameLanguage.g:1813:1: rule__EqualRule__Group__6 : rule__EqualRule__Group__6__Impl rule__EqualRule__Group__7 ;
    public final void rule__EqualRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1817:1: ( rule__EqualRule__Group__6__Impl rule__EqualRule__Group__7 )
            // InternalCardGameLanguage.g:1818:2: rule__EqualRule__Group__6__Impl rule__EqualRule__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__EqualRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__6"


    // $ANTLR start "rule__EqualRule__Group__6__Impl"
    // InternalCardGameLanguage.g:1825:1: rule__EqualRule__Group__6__Impl : ( ( rule__EqualRule__ItemAssignment_6 ) ) ;
    public final void rule__EqualRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1829:1: ( ( ( rule__EqualRule__ItemAssignment_6 ) ) )
            // InternalCardGameLanguage.g:1830:1: ( ( rule__EqualRule__ItemAssignment_6 ) )
            {
            // InternalCardGameLanguage.g:1830:1: ( ( rule__EqualRule__ItemAssignment_6 ) )
            // InternalCardGameLanguage.g:1831:2: ( rule__EqualRule__ItemAssignment_6 )
            {
             before(grammarAccess.getEqualRuleAccess().getItemAssignment_6()); 
            // InternalCardGameLanguage.g:1832:2: ( rule__EqualRule__ItemAssignment_6 )
            // InternalCardGameLanguage.g:1832:3: rule__EqualRule__ItemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__ItemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEqualRuleAccess().getItemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__6__Impl"


    // $ANTLR start "rule__EqualRule__Group__7"
    // InternalCardGameLanguage.g:1840:1: rule__EqualRule__Group__7 : rule__EqualRule__Group__7__Impl rule__EqualRule__Group__8 ;
    public final void rule__EqualRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1844:1: ( rule__EqualRule__Group__7__Impl rule__EqualRule__Group__8 )
            // InternalCardGameLanguage.g:1845:2: rule__EqualRule__Group__7__Impl rule__EqualRule__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__EqualRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__7"


    // $ANTLR start "rule__EqualRule__Group__7__Impl"
    // InternalCardGameLanguage.g:1852:1: rule__EqualRule__Group__7__Impl : ( 'level' ) ;
    public final void rule__EqualRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1856:1: ( ( 'level' ) )
            // InternalCardGameLanguage.g:1857:1: ( 'level' )
            {
            // InternalCardGameLanguage.g:1857:1: ( 'level' )
            // InternalCardGameLanguage.g:1858:2: 'level'
            {
             before(grammarAccess.getEqualRuleAccess().getLevelKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getLevelKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__7__Impl"


    // $ANTLR start "rule__EqualRule__Group__8"
    // InternalCardGameLanguage.g:1867:1: rule__EqualRule__Group__8 : rule__EqualRule__Group__8__Impl rule__EqualRule__Group__9 ;
    public final void rule__EqualRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1871:1: ( rule__EqualRule__Group__8__Impl rule__EqualRule__Group__9 )
            // InternalCardGameLanguage.g:1872:2: rule__EqualRule__Group__8__Impl rule__EqualRule__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__EqualRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__8"


    // $ANTLR start "rule__EqualRule__Group__8__Impl"
    // InternalCardGameLanguage.g:1879:1: rule__EqualRule__Group__8__Impl : ( ( rule__EqualRule__LevelAssignment_8 ) ) ;
    public final void rule__EqualRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1883:1: ( ( ( rule__EqualRule__LevelAssignment_8 ) ) )
            // InternalCardGameLanguage.g:1884:1: ( ( rule__EqualRule__LevelAssignment_8 ) )
            {
            // InternalCardGameLanguage.g:1884:1: ( ( rule__EqualRule__LevelAssignment_8 ) )
            // InternalCardGameLanguage.g:1885:2: ( rule__EqualRule__LevelAssignment_8 )
            {
             before(grammarAccess.getEqualRuleAccess().getLevelAssignment_8()); 
            // InternalCardGameLanguage.g:1886:2: ( rule__EqualRule__LevelAssignment_8 )
            // InternalCardGameLanguage.g:1886:3: rule__EqualRule__LevelAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__LevelAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEqualRuleAccess().getLevelAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__8__Impl"


    // $ANTLR start "rule__EqualRule__Group__9"
    // InternalCardGameLanguage.g:1894:1: rule__EqualRule__Group__9 : rule__EqualRule__Group__9__Impl ;
    public final void rule__EqualRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1898:1: ( rule__EqualRule__Group__9__Impl )
            // InternalCardGameLanguage.g:1899:2: rule__EqualRule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualRule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__9"


    // $ANTLR start "rule__EqualRule__Group__9__Impl"
    // InternalCardGameLanguage.g:1905:1: rule__EqualRule__Group__9__Impl : ( '}' ) ;
    public final void rule__EqualRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1909:1: ( ( '}' ) )
            // InternalCardGameLanguage.g:1910:1: ( '}' )
            {
            // InternalCardGameLanguage.g:1910:1: ( '}' )
            // InternalCardGameLanguage.g:1911:2: '}'
            {
             before(grammarAccess.getEqualRuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__Group__9__Impl"


    // $ANTLR start "rule__CardGame__NameAssignment_1"
    // InternalCardGameLanguage.g:1921:1: rule__CardGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CardGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1925:1: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:1926:2: ( RULE_ID )
            {
            // InternalCardGameLanguage.g:1926:2: ( RULE_ID )
            // InternalCardGameLanguage.g:1927:3: RULE_ID
            {
             before(grammarAccess.getCardGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__NameAssignment_1"


    // $ANTLR start "rule__CardGame__CardpropertytypesAssignment_2_2"
    // InternalCardGameLanguage.g:1936:1: rule__CardGame__CardpropertytypesAssignment_2_2 : ( ruleCardPropertyType ) ;
    public final void rule__CardGame__CardpropertytypesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1940:1: ( ( ruleCardPropertyType ) )
            // InternalCardGameLanguage.g:1941:2: ( ruleCardPropertyType )
            {
            // InternalCardGameLanguage.g:1941:2: ( ruleCardPropertyType )
            // InternalCardGameLanguage.g:1942:3: ruleCardPropertyType
            {
             before(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardPropertyType();

            state._fsp--;

             after(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__CardpropertytypesAssignment_2_2"


    // $ANTLR start "rule__CardGame__CardpropertytypesAssignment_2_3_1"
    // InternalCardGameLanguage.g:1951:1: rule__CardGame__CardpropertytypesAssignment_2_3_1 : ( ruleCardPropertyType ) ;
    public final void rule__CardGame__CardpropertytypesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1955:1: ( ( ruleCardPropertyType ) )
            // InternalCardGameLanguage.g:1956:2: ( ruleCardPropertyType )
            {
            // InternalCardGameLanguage.g:1956:2: ( ruleCardPropertyType )
            // InternalCardGameLanguage.g:1957:3: ruleCardPropertyType
            {
             before(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardPropertyType();

            state._fsp--;

             after(grammarAccess.getCardGameAccess().getCardpropertytypesCardPropertyTypeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__CardpropertytypesAssignment_2_3_1"


    // $ANTLR start "rule__CardGame__CardsAssignment_3"
    // InternalCardGameLanguage.g:1966:1: rule__CardGame__CardsAssignment_3 : ( ruleCard ) ;
    public final void rule__CardGame__CardsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1970:1: ( ( ruleCard ) )
            // InternalCardGameLanguage.g:1971:2: ( ruleCard )
            {
            // InternalCardGameLanguage.g:1971:2: ( ruleCard )
            // InternalCardGameLanguage.g:1972:3: ruleCard
            {
             before(grammarAccess.getCardGameAccess().getCardsCardParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardGameAccess().getCardsCardParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__CardsAssignment_3"


    // $ANTLR start "rule__CardGame__NumberAssignment_6"
    // InternalCardGameLanguage.g:1981:1: rule__CardGame__NumberAssignment_6 : ( RULE_INT ) ;
    public final void rule__CardGame__NumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:1985:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:1986:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:1986:2: ( RULE_INT )
            // InternalCardGameLanguage.g:1987:3: RULE_INT
            {
             before(grammarAccess.getCardGameAccess().getNumberINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardGameAccess().getNumberINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__NumberAssignment_6"


    // $ANTLR start "rule__CardGame__RuleAssignment_8_2"
    // InternalCardGameLanguage.g:1996:1: rule__CardGame__RuleAssignment_8_2 : ( ruleGameRule ) ;
    public final void rule__CardGame__RuleAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2000:1: ( ( ruleGameRule ) )
            // InternalCardGameLanguage.g:2001:2: ( ruleGameRule )
            {
            // InternalCardGameLanguage.g:2001:2: ( ruleGameRule )
            // InternalCardGameLanguage.g:2002:3: ruleGameRule
            {
             before(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGameRule();

            state._fsp--;

             after(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__RuleAssignment_8_2"


    // $ANTLR start "rule__CardGame__RuleAssignment_8_3_1"
    // InternalCardGameLanguage.g:2011:1: rule__CardGame__RuleAssignment_8_3_1 : ( ruleGameRule ) ;
    public final void rule__CardGame__RuleAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2015:1: ( ( ruleGameRule ) )
            // InternalCardGameLanguage.g:2016:2: ( ruleGameRule )
            {
            // InternalCardGameLanguage.g:2016:2: ( ruleGameRule )
            // InternalCardGameLanguage.g:2017:3: ruleGameRule
            {
             before(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGameRule();

            state._fsp--;

             after(grammarAccess.getCardGameAccess().getRuleGameRuleParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardGame__RuleAssignment_8_3_1"


    // $ANTLR start "rule__Card__NameAssignment_1"
    // InternalCardGameLanguage.g:2026:1: rule__Card__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Card__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2030:1: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2031:2: ( RULE_ID )
            {
            // InternalCardGameLanguage.g:2031:2: ( RULE_ID )
            // InternalCardGameLanguage.g:2032:3: RULE_ID
            {
             before(grammarAccess.getCardAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__NameAssignment_1"


    // $ANTLR start "rule__Card__DefinitionAssignment_3"
    // InternalCardGameLanguage.g:2041:1: rule__Card__DefinitionAssignment_3 : ( ruleCardProperty ) ;
    public final void rule__Card__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2045:1: ( ( ruleCardProperty ) )
            // InternalCardGameLanguage.g:2046:2: ( ruleCardProperty )
            {
            // InternalCardGameLanguage.g:2046:2: ( ruleCardProperty )
            // InternalCardGameLanguage.g:2047:3: ruleCardProperty
            {
             before(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCardProperty();

            state._fsp--;

             after(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__DefinitionAssignment_3"


    // $ANTLR start "rule__Card__DefinitionAssignment_4_1"
    // InternalCardGameLanguage.g:2056:1: rule__Card__DefinitionAssignment_4_1 : ( ruleCardProperty ) ;
    public final void rule__Card__DefinitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2060:1: ( ( ruleCardProperty ) )
            // InternalCardGameLanguage.g:2061:2: ( ruleCardProperty )
            {
            // InternalCardGameLanguage.g:2061:2: ( ruleCardProperty )
            // InternalCardGameLanguage.g:2062:3: ruleCardProperty
            {
             before(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardProperty();

            state._fsp--;

             after(grammarAccess.getCardAccess().getDefinitionCardPropertyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__DefinitionAssignment_4_1"


    // $ANTLR start "rule__CardProperty__TypeAssignment_0"
    // InternalCardGameLanguage.g:2071:1: rule__CardProperty__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CardProperty__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2075:1: ( ( ( RULE_ID ) ) )
            // InternalCardGameLanguage.g:2076:2: ( ( RULE_ID ) )
            {
            // InternalCardGameLanguage.g:2076:2: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2077:3: ( RULE_ID )
            {
             before(grammarAccess.getCardPropertyAccess().getTypeCardPropertyTypeCrossReference_0_0()); 
            // InternalCardGameLanguage.g:2078:3: ( RULE_ID )
            // InternalCardGameLanguage.g:2079:4: RULE_ID
            {
             before(grammarAccess.getCardPropertyAccess().getTypeCardPropertyTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCardPropertyAccess().getTypeCardPropertyTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCardPropertyAccess().getTypeCardPropertyTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__TypeAssignment_0"


    // $ANTLR start "rule__CardProperty__ValueAssignment_1_1"
    // InternalCardGameLanguage.g:2090:1: rule__CardProperty__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CardProperty__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2094:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2095:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2095:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2096:3: RULE_INT
            {
             before(grammarAccess.getCardPropertyAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardPropertyAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardProperty__ValueAssignment_1_1"


    // $ANTLR start "rule__CardPropertyType__NameAssignment"
    // InternalCardGameLanguage.g:2105:1: rule__CardPropertyType__NameAssignment : ( RULE_ID ) ;
    public final void rule__CardPropertyType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2109:1: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2110:2: ( RULE_ID )
            {
            // InternalCardGameLanguage.g:2110:2: ( RULE_ID )
            // InternalCardGameLanguage.g:2111:3: RULE_ID
            {
             before(grammarAccess.getCardPropertyTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCardPropertyTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardPropertyType__NameAssignment"


    // $ANTLR start "rule__SingleRule__NameAssignment_1"
    // InternalCardGameLanguage.g:2120:1: rule__SingleRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2124:1: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2125:2: ( RULE_ID )
            {
            // InternalCardGameLanguage.g:2125:2: ( RULE_ID )
            // InternalCardGameLanguage.g:2126:3: RULE_ID
            {
             before(grammarAccess.getSingleRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__NameAssignment_1"


    // $ANTLR start "rule__SingleRule__Role1Assignment_3"
    // InternalCardGameLanguage.g:2135:1: rule__SingleRule__Role1Assignment_3 : ( rulePlayerRole ) ;
    public final void rule__SingleRule__Role1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2139:1: ( ( rulePlayerRole ) )
            // InternalCardGameLanguage.g:2140:2: ( rulePlayerRole )
            {
            // InternalCardGameLanguage.g:2140:2: ( rulePlayerRole )
            // InternalCardGameLanguage.g:2141:3: rulePlayerRole
            {
             before(grammarAccess.getSingleRuleAccess().getRole1PlayerRoleEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerRole();

            state._fsp--;

             after(grammarAccess.getSingleRuleAccess().getRole1PlayerRoleEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Role1Assignment_3"


    // $ANTLR start "rule__SingleRule__Number1Assignment_5"
    // InternalCardGameLanguage.g:2150:1: rule__SingleRule__Number1Assignment_5 : ( RULE_INT ) ;
    public final void rule__SingleRule__Number1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2154:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2155:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2155:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2156:3: RULE_INT
            {
             before(grammarAccess.getSingleRuleAccess().getNumber1INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getNumber1INTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Number1Assignment_5"


    // $ANTLR start "rule__SingleRule__ItemAssignment_6"
    // InternalCardGameLanguage.g:2165:1: rule__SingleRule__ItemAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SingleRule__ItemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2169:1: ( ( ( RULE_ID ) ) )
            // InternalCardGameLanguage.g:2170:2: ( ( RULE_ID ) )
            {
            // InternalCardGameLanguage.g:2170:2: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2171:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleRuleAccess().getItemCardPropertyTypeCrossReference_6_0()); 
            // InternalCardGameLanguage.g:2172:3: ( RULE_ID )
            // InternalCardGameLanguage.g:2173:4: RULE_ID
            {
             before(grammarAccess.getSingleRuleAccess().getItemCardPropertyTypeIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getItemCardPropertyTypeIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSingleRuleAccess().getItemCardPropertyTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__ItemAssignment_6"


    // $ANTLR start "rule__SingleRule__KeywordAssignment_7"
    // InternalCardGameLanguage.g:2184:1: rule__SingleRule__KeywordAssignment_7 : ( ruleExpressionKeyword ) ;
    public final void rule__SingleRule__KeywordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2188:1: ( ( ruleExpressionKeyword ) )
            // InternalCardGameLanguage.g:2189:2: ( ruleExpressionKeyword )
            {
            // InternalCardGameLanguage.g:2189:2: ( ruleExpressionKeyword )
            // InternalCardGameLanguage.g:2190:3: ruleExpressionKeyword
            {
             before(grammarAccess.getSingleRuleAccess().getKeywordExpressionKeywordEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionKeyword();

            state._fsp--;

             after(grammarAccess.getSingleRuleAccess().getKeywordExpressionKeywordEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__KeywordAssignment_7"


    // $ANTLR start "rule__SingleRule__Role2Assignment_8"
    // InternalCardGameLanguage.g:2199:1: rule__SingleRule__Role2Assignment_8 : ( rulePlayerRole ) ;
    public final void rule__SingleRule__Role2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2203:1: ( ( rulePlayerRole ) )
            // InternalCardGameLanguage.g:2204:2: ( rulePlayerRole )
            {
            // InternalCardGameLanguage.g:2204:2: ( rulePlayerRole )
            // InternalCardGameLanguage.g:2205:3: rulePlayerRole
            {
             before(grammarAccess.getSingleRuleAccess().getRole2PlayerRoleEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerRole();

            state._fsp--;

             after(grammarAccess.getSingleRuleAccess().getRole2PlayerRoleEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Role2Assignment_8"


    // $ANTLR start "rule__SingleRule__Number2Assignment_10"
    // InternalCardGameLanguage.g:2214:1: rule__SingleRule__Number2Assignment_10 : ( RULE_INT ) ;
    public final void rule__SingleRule__Number2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2218:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2219:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2219:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2220:3: RULE_INT
            {
             before(grammarAccess.getSingleRuleAccess().getNumber2INTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getNumber2INTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__Number2Assignment_10"


    // $ANTLR start "rule__SingleRule__LevelAssignment_12"
    // InternalCardGameLanguage.g:2229:1: rule__SingleRule__LevelAssignment_12 : ( RULE_INT ) ;
    public final void rule__SingleRule__LevelAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2233:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2234:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2234:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2235:3: RULE_INT
            {
             before(grammarAccess.getSingleRuleAccess().getLevelINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleRuleAccess().getLevelINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleRule__LevelAssignment_12"


    // $ANTLR start "rule__EqualRule__NameAssignment_1"
    // InternalCardGameLanguage.g:2244:1: rule__EqualRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqualRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2248:1: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2249:2: ( RULE_ID )
            {
            // InternalCardGameLanguage.g:2249:2: ( RULE_ID )
            // InternalCardGameLanguage.g:2250:3: RULE_ID
            {
             before(grammarAccess.getEqualRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__NameAssignment_1"


    // $ANTLR start "rule__EqualRule__NumberAssignment_4"
    // InternalCardGameLanguage.g:2259:1: rule__EqualRule__NumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__EqualRule__NumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2263:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2264:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2264:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2265:3: RULE_INT
            {
             before(grammarAccess.getEqualRuleAccess().getNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getNumberINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__NumberAssignment_4"


    // $ANTLR start "rule__EqualRule__ItemAssignment_6"
    // InternalCardGameLanguage.g:2274:1: rule__EqualRule__ItemAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__EqualRule__ItemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2278:1: ( ( ( RULE_ID ) ) )
            // InternalCardGameLanguage.g:2279:2: ( ( RULE_ID ) )
            {
            // InternalCardGameLanguage.g:2279:2: ( ( RULE_ID ) )
            // InternalCardGameLanguage.g:2280:3: ( RULE_ID )
            {
             before(grammarAccess.getEqualRuleAccess().getItemCardPropertyTypeCrossReference_6_0()); 
            // InternalCardGameLanguage.g:2281:3: ( RULE_ID )
            // InternalCardGameLanguage.g:2282:4: RULE_ID
            {
             before(grammarAccess.getEqualRuleAccess().getItemCardPropertyTypeIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getItemCardPropertyTypeIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getEqualRuleAccess().getItemCardPropertyTypeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__ItemAssignment_6"


    // $ANTLR start "rule__EqualRule__LevelAssignment_8"
    // InternalCardGameLanguage.g:2293:1: rule__EqualRule__LevelAssignment_8 : ( RULE_INT ) ;
    public final void rule__EqualRule__LevelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCardGameLanguage.g:2297:1: ( ( RULE_INT ) )
            // InternalCardGameLanguage.g:2298:2: ( RULE_INT )
            {
            // InternalCardGameLanguage.g:2298:2: ( RULE_INT )
            // InternalCardGameLanguage.g:2299:3: RULE_INT
            {
             before(grammarAccess.getEqualRuleAccess().getLevelINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEqualRuleAccess().getLevelINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualRule__LevelAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002120000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}