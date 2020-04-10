// Generated from D:/ideaProject/openSourceProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit1\Split1.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Split1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STR1=1, STR2=2, STR3=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STR1", "STR2", "STR3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STR1", "STR2", "STR3"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Split1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Split1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5\36\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\6\2\13\n\2\r\2\16\2\f\3\2\3\2\3\3\6\3\22\n\3\r\3"+
		"\16\3\23\3\3\3\3\3\4\6\4\31\n\4\r\4\16\4\32\3\4\3\4\2\2\5\3\3\5\4\7\5"+
		"\3\2\6\6\2\f\f\17\17$$..\7\2\f\f\17\17$$..\u7703\u7703\b\2\f\f\17\17$"+
		"$..\u5e04\u5e04\u7703\u7703\4\2\u533c\u533c\u53c1\u53c1\2 \2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\3\n\3\2\2\2\5\21\3\2\2\2\7\30\3\2\2\2\t\13\n"+
		"\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16"+
		"\17\7\u7703\2\2\17\4\3\2\2\2\20\22\n\3\2\2\21\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\u5e04\2\2\26\6\3\2"+
		"\2\2\27\31\n\4\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\34\3\2\2\2\34\35\t\5\2\2\35\b\3\2\2\2\6\2\f\23\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}