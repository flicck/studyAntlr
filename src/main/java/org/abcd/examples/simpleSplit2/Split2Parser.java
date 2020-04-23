// Generated from D:/ideaProject/openSourceProject/studyAntlr/src/main/java/org/abcd/examples/simpleSplit2\Split2.g4 by ANTLR 4.8
package org.abcd.examples.simpleSplit2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Split2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STR1=1, STR2=2, STR3=3;
	public static final int
		RULE_stat = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "expr"
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

	@Override
	public String getGrammarFileName() { return "Split2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Split2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Split2Visitor ) return ((Split2Visitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR1) | (1L << STR2) | (1L << STR3))) != 0)) {
				{
				{
				setState(4);
				expr();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Str3Context extends ExprContext {
		public TerminalNode STR3() { return getToken(Split2Parser.STR3, 0); }
		public Str3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).enterStr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).exitStr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Split2Visitor ) return ((Split2Visitor<? extends T>)visitor).visitStr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Str1Context extends ExprContext {
		public TerminalNode STR1() { return getToken(Split2Parser.STR1, 0); }
		public Str1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).enterStr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).exitStr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Split2Visitor ) return ((Split2Visitor<? extends T>)visitor).visitStr1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Str2Context extends ExprContext {
		public TerminalNode STR2() { return getToken(Split2Parser.STR2, 0); }
		public Str2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).enterStr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Split2Listener ) ((Split2Listener)listener).exitStr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Split2Visitor ) return ((Split2Visitor<? extends T>)visitor).visitStr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR1:
				_localctx = new Str1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(STR1);
				}
				break;
			case STR2:
				_localctx = new Str2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(STR2);
				}
				break;
			case STR3:
				_localctx = new Str3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(STR3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\22\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\5\3\20\n\3\3\3\2\2\4\2"+
		"\4\2\2\2\22\2\t\3\2\2\2\4\17\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2"+
		"\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\t\3\2\2\2\f\20\7\3\2\2\r\20"+
		"\7\4\2\2\16\20\7\5\2\2\17\f\3\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\5\3"+
		"\2\2\2\4\t\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}