/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.cardgame.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.cardgame.parser.antlr.internal.InternalCardGameLanguageParser;
import uk.ac.kcl.inf.cardgame.services.CardGameLanguageGrammarAccess;

public class CardGameLanguageParser extends AbstractAntlrParser {

	@Inject
	private CardGameLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCardGameLanguageParser createParser(XtextTokenStream stream) {
		return new InternalCardGameLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CardGame";
	}

	public CardGameLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CardGameLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}