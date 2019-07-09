package core;
// Generated from Turtle.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, KW_BASE=27, KW_PREFIX=28, NumericLiteral=29, BooleanLiteral=30, 
		BadLiteral=31, String=32, BlankNode=33, CHARS=34, WS=35, COMMENT=36, PN_PREFIX=37, 
		IRIREF=38, PNAME_NS=39, PrefixedName=40, PNAME_LN=41, BAD_PNAME_LN_STARTS_WITH_DOT=42, 
		BAD_PNAME_LN_ENDS_WITH_DOT=43, BLANK_NODE_LABEL=44, LANGTAG=45, BAD_LANGTAG_AS_NUMBER=46, 
		INTEGER=47, DECIMAL=48, DOUBLE=49, EXPONENT=50, STRING_LITERAL_LONG_SINGLE_QUOTE=51, 
		STRING_LITERAL_LONG_QUOTE=52, STRING_LITERAL_QUOTE=53, STRING_LITERAL_SINGLE_QUOTE=54, 
		BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR=55, BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR=56, 
		BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR=57, BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR=58, 
		BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES=59, BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE=60, 
		BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE=61, BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE=62, 
		BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE=63, BAD_UCHAR=64, ECHAR=65, 
		ANON_WS=66, ANON=67, PN_CHARS_BASE=68, PN_CHARS_U=69, PN_CHARS=70, PN_LOCAL=71, 
		BAD_PN_LOCAL_STARTS_WITH_PERCENT=72, BAD_PN_LOCAL_CONTAINS_PERCENT=73, 
		BAD_PN_LOCAL_STARTS_WITH_TILDE=74, PN_LOCAL_BAD_WITH_DASH=75, PLX=76, 
		PERCENT=77, HEX=78, NONHEX=79, PN_LOCAL_ESC=80, BAD_IRIREF_WITH_SPACE=81, 
		BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS=82, BAD_IRIREF_WITH_PARENTHESES=83, 
		BAD_STRING_LITERAL_SINGLE_QUOTE=84, BAD_STRING_LITERAL_QUOTE=85, BAD_STRING_LITERAL_LONG_SINGLE_QUOTE=86, 
		BAD_STRING_LITERAL_LONG_QUOTE=87, BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY=88, 
		BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY=89, ILLEGAL_ESCAPE=90;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_directive = 2, RULE_errors = 3, 
		RULE_graphLabel = 4, RULE_unkonwnDecl = 5, RULE_prefixID = 6, RULE_base = 7, 
		RULE_sparqlBase = 8, RULE_sparqlPrefix = 9, RULE_triple = 10, RULE_predicateObjectList = 11, 
		RULE_objectList = 12, RULE_verb = 13, RULE_subject = 14, RULE_predicate = 15, 
		RULE_object = 16, RULE_literal = 17, RULE_blankNodePropertyList = 18, 
		RULE_badBlankNodePropertyList = 19, RULE_collection = 20, RULE_rdfLiteral = 21, 
		RULE_iri = 22;
	public static final String[] ruleNames = {
		"start", "statement", "directive", "errors", "graphLabel", "unkonwnDecl", 
		"prefixID", "base", "sparqlBase", "sparqlPrefix", "triple", "predicateObjectList", 
		"objectList", "verb", "subject", "predicate", "object", "literal", "blankNodePropertyList", 
		"badBlankNodePropertyList", "collection", "rdfLiteral", "iri"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "','", "';'", "'='", "'<='", "'=>'", "'^'", "'@forAll'", 
		"'@forSome'", "'a'", "'@a'", "'@keywords'", "'@prefix'", "':'", "'@base'", 
		"'@BASE'", "'is'", "'of'", "'A'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"'^^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "KW_BASE", "KW_PREFIX", "NumericLiteral", "BooleanLiteral", 
		"BadLiteral", "String", "BlankNode", "CHARS", "WS", "COMMENT", "PN_PREFIX", 
		"IRIREF", "PNAME_NS", "PrefixedName", "PNAME_LN", "BAD_PNAME_LN_STARTS_WITH_DOT", 
		"BAD_PNAME_LN_ENDS_WITH_DOT", "BLANK_NODE_LABEL", "LANGTAG", "BAD_LANGTAG_AS_NUMBER", 
		"INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
		"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
		"BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR", "BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR", 
		"BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR", "BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR", 
		"BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES", "BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE", 
		"BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE", "BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE", 
		"BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE", "BAD_UCHAR", "ECHAR", 
		"ANON_WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_LOCAL", 
		"BAD_PN_LOCAL_STARTS_WITH_PERCENT", "BAD_PN_LOCAL_CONTAINS_PERCENT", "BAD_PN_LOCAL_STARTS_WITH_TILDE", 
		"PN_LOCAL_BAD_WITH_DASH", "PLX", "PERCENT", "HEX", "NONHEX", "PN_LOCAL_ESC", 
		"BAD_IRIREF_WITH_SPACE", "BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS", "BAD_IRIREF_WITH_PARENTHESES", 
		"BAD_STRING_LITERAL_SINGLE_QUOTE", "BAD_STRING_LITERAL_QUOTE", "BAD_STRING_LITERAL_LONG_SINGLE_QUOTE", 
		"BAD_STRING_LITERAL_LONG_QUOTE", "BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY", 
		"BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY", "ILLEGAL_ESCAPE"
	};
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
	public String getGrammarFileName() { return "Turtle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 // add members to check Namespace declaration
	public List<String> symbols = new ArrayList<String>();
	boolean isExistNS(String in ) { // custom constructor
		boolean foundNS = false ; 
			if(symbols.contains(in.split(":")[0]+':')) foundNS=true;
		return foundNS;
	}

	public TurtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TurtleParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << KW_BASE) | (1L << KW_PREFIX) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << String) | (1L << BlankNode) | (1L << CHARS) | (1L << PN_PREFIX) | (1L << IRIREF) | (1L << PNAME_NS) | (1L << PrefixedName) | (1L << BAD_PNAME_LN_STARTS_WITH_DOT) | (1L << BAD_PNAME_LN_ENDS_WITH_DOT) | (1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES) | (1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PN_LOCAL_BAD_WITH_DASH - 75)) | (1L << (BAD_IRIREF_WITH_SPACE - 75)) | (1L << (BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS - 75)) | (1L << (BAD_IRIREF_WITH_PARENTHESES - 75)) | (1L << (BAD_STRING_LITERAL_SINGLE_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_SINGLE_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY - 75)) | (1L << (BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY - 75)))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public List<TerminalNode> IRIREF() { return getTokens(TurtleParser.IRIREF); }
		public TerminalNode IRIREF(int i) {
			return getToken(TurtleParser.IRIREF, i);
		}
		public GraphLabelContext graphLabel() {
			return getRuleContext(GraphLabelContext.class,0);
		}
		public TripleContext triple() {
			return getRuleContext(TripleContext.class,0);
		}
		public ErrorsContext errors() {
			return getRuleContext(ErrorsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				directive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(IRIREF);
				setState(56);
				match(IRIREF);
				setState(57);
				match(IRIREF);
				setState(58);
				graphLabel();
				setState(59);
				match(T__0);
				notifyErrorListeners("Turtle is not NQOUDS");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				triple();
				setState(63);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				triple();
				notifyErrorListeners("Missing '.' at the end of a triple");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				triple();
				setState(69);
				match(T__1);
				notifyErrorListeners("Bad end of a triple with ','");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				triple();
				setState(73);
				match(T__2);
				notifyErrorListeners("Bad end of a triple with ';'");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				triple();
				setState(78); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					match(T__0);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				notifyErrorListeners("Too many DOT");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				errors();
				}
				break;
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

	public static class DirectiveContext extends ParserRuleContext {
		public SparqlPrefixContext sparqlPrefix() {
			return getRuleContext(SparqlPrefixContext.class,0);
		}
		public SparqlBaseContext sparqlBase() {
			return getRuleContext(SparqlBaseContext.class,0);
		}
		public PrefixIDContext prefixID() {
			return getRuleContext(PrefixIDContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public UnkonwnDeclContext unkonwnDecl() {
			return getRuleContext(UnkonwnDeclContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				sparqlPrefix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				sparqlBase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				prefixID();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				base();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				unkonwnDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				sparqlPrefix();
				setState(98);
				match(T__0);
				notifyErrorListeners("Extraneous '.' at the end of SPARQL prefix directive");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				sparqlBase();
				setState(102);
				match(T__0);
				notifyErrorListeners("Extraneous '.' at the end of SPARQL base directive");
				}
				break;
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

	public static class ErrorsContext extends ParserRuleContext {
		public List<IriContext> iri() {
			return getRuleContexts(IriContext.class);
		}
		public IriContext iri(int i) {
			return getRuleContext(IriContext.class,i);
		}
		public TripleContext triple() {
			return getRuleContext(TripleContext.class,0);
		}
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
		}
		public ErrorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterErrors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitErrors(this);
		}
	}

	public final ErrorsContext errors() throws RecognitionException {
		ErrorsContext _localctx = new ErrorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_errors);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				iri();
				setState(108);
				match(T__3);
				setState(109);
				iri();
				setState(110);
				match(T__0);
				notifyErrorListeners("'=' sign cannot be used in Turtle");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				iri();
				setState(114);
				match(T__4);
				setState(115);
				iri();
				setState(116);
				match(T__0);
				notifyErrorListeners("'<=' symbol cannot be used in Turtle");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				iri();
				setState(120);
				match(T__5);
				setState(121);
				iri();
				setState(122);
				match(T__0);
				notifyErrorListeners("'=>' symbol cannot be used in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						iri();
						setState(126);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(130); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(132);
						iri();
						setState(133);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(139);
				triple();
				setState(140);
				match(T__0);
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(143);
						iri();
						setState(144);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						iri();
						setState(151);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(157);
				triple();
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				iri();
				setState(161);
				match(T__6);
				setState(162);
				triple();
				setState(163);
				match(T__0);
				notifyErrorListeners("N3 paths cannot be used in Turtle");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				match(T__7);
				setState(167);
				iri();
				setState(168);
				match(T__0);
				notifyErrorListeners(" '@forAll' cannot be used in Turtle ");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(T__8);
				setState(172);
				iri();
				setState(173);
				match(T__0);
				notifyErrorListeners(" '@forSome' cannot be used in Turtle ");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9 || _la==CHARS) {
					{
					{
					setState(176);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(T__10);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9 || _la==CHARS) {
					{
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==CHARS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__0);
				notifyErrorListeners(" '@a' cannot be used in Turtle ");
				}
				break;
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

	public static class GraphLabelContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode BLANK_NODE_LABEL() { return getToken(TurtleParser.BLANK_NODE_LABEL, 0); }
		public GraphLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterGraphLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitGraphLabel(this);
		}
	}

	public final GraphLabelContext graphLabel() throws RecognitionException {
		GraphLabelContext _localctx = new GraphLabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_graphLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==IRIREF || _la==BLANK_NODE_LABEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnkonwnDeclContext extends ParserRuleContext {
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
		}
		public UnkonwnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unkonwnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterUnkonwnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitUnkonwnDecl(this);
		}
	}

	public final UnkonwnDeclContext unkonwnDecl() throws RecognitionException {
		UnkonwnDeclContext _localctx = new UnkonwnDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unkonwnDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__11);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==CHARS) {
				{
				{
				setState(196);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==CHARS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__0);
			notifyErrorListeners("@keywords is unkown directive in Turtle");
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

	public static class PrefixIDContext extends ParserRuleContext {
		public Token IRIREF;
		public Token PNAME_NS;
		public List<TerminalNode> CHARS() { return getTokens(TurtleParser.CHARS); }
		public TerminalNode CHARS(int i) {
			return getToken(TurtleParser.CHARS, i);
		}
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPrefixID(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prefixID);
		int _la;
		try {
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__12);
				setState(206);
				match(CHARS);
				setState(207);
				match(T__0);
				setState(208);
				match(T__13);
				setState(209);
				match(IRIREF);
				setState(210);
				match(T__0);
				notifyErrorListeners("Prefix-label cannot end with '.' ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__12);
				setState(213);
				match(T__0);
				setState(214);
				match(CHARS);
				setState(215);
				match(T__13);
				setState(216);
				match(IRIREF);
				setState(217);
				match(T__0);
				notifyErrorListeners("Prefix-label cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__12);
				setState(220);
				match(T__13);
				setState(221);
				((PrefixIDContext)_localctx).IRIREF = match(IRIREF);
				setState(222);
				match(T__0);
				 symbols.add(":");
				 System.out.println(":" + (((PrefixIDContext)_localctx).IRIREF!=null?((PrefixIDContext)_localctx).IRIREF.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__12);
				setState(226);
				((PrefixIDContext)_localctx).PNAME_NS = match(PNAME_NS);
				setState(227);
				((PrefixIDContext)_localctx).IRIREF = match(IRIREF);
				setState(228);
				match(T__0);
				symbols.add((((PrefixIDContext)_localctx).PNAME_NS!=null?((PrefixIDContext)_localctx).PNAME_NS.getText():null));
				 System.out.println((((PrefixIDContext)_localctx).PNAME_NS!=null?((PrefixIDContext)_localctx).PNAME_NS.getText():null) + (((PrefixIDContext)_localctx).IRIREF!=null?((PrefixIDContext)_localctx).IRIREF.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(T__12);
				setState(232);
				match(PNAME_NS);
				setState(233);
				match(IRIREF);
				setState(235); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(237); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					match(T__0);
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				notifyErrorListeners("Too many DOT ");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(PNAME_NS);
				setState(246);
				match(IRIREF);
				setState(247);
				match(T__0);
				notifyErrorListeners("Missing Prefix keyword, use '@prefix'");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(T__12);
				setState(250);
				match(IRIREF);
				setState(251);
				match(T__0);
				notifyErrorListeners("Missing Prefix-label in Prefix directive");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				match(T__12);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHARS) {
					{
					{
					setState(254);
					match(CHARS);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(IRIREF);
				setState(261);
				match(T__0);
				notifyErrorListeners("Missing ':' in Prefix directive");
				}
				break;
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

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_base);
		int _la;
		try {
			int _alt;
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__14);
				setState(266);
				match(IRIREF);
				setState(267);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__14);
				setState(269);
				match(IRIREF);
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					match(T__0);
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				notifyErrorListeners("Too many DOT ");
				}
				break;
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

	public static class SparqlBaseContext extends ParserRuleContext {
		public TerminalNode KW_BASE() { return getToken(TurtleParser.KW_BASE, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSparqlBase(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sparqlBase);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(KW_BASE);
				setState(284);
				match(IRIREF);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__15);
				setState(286);
				match(IRIREF);
				setState(287);
				match(T__0);
				notifyErrorListeners("incorrect syntax form of base directive");
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

	public static class SparqlPrefixContext extends ParserRuleContext {
		public TerminalNode KW_PREFIX() { return getToken(TurtleParser.KW_PREFIX, 0); }
		public TerminalNode CHARS() { return getToken(TurtleParser.CHARS, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode PNAME_NS() { return getToken(TurtleParser.PNAME_NS, 0); }
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSparqlPrefix(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sparqlPrefix);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(KW_PREFIX);
				setState(292);
				match(CHARS);
				setState(293);
				match(T__0);
				setState(294);
				match(T__13);
				setState(295);
				match(IRIREF);
				notifyErrorListeners("Prefix-label cannot end with '.' ");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(KW_PREFIX);
				setState(298);
				match(T__0);
				setState(299);
				match(CHARS);
				setState(300);
				match(T__13);
				setState(301);
				match(IRIREF);
				notifyErrorListeners("Prefix-label cannot start with '.' ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(KW_PREFIX);
				setState(304);
				match(PNAME_NS);
				setState(305);
				match(IRIREF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(KW_PREFIX);
				setState(307);
				match(T__13);
				setState(308);
				match(IRIREF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(PNAME_NS);
				setState(310);
				match(IRIREF);
				notifyErrorListeners("Missing Prefix keyword, use 'PREFIX'");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(KW_PREFIX);
				setState(313);
				match(IRIREF);
				notifyErrorListeners("Missing Prefix-label in Prefix directive");
				}
				break;
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

	public static class TripleContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TripleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterTriple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitTriple(this);
		}
	}

	public final TripleContext triple() throws RecognitionException {
		TripleContext _localctx = new TripleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_triple);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				subject();
				setState(318);
				predicateObjectList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				blankNodePropertyList();
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(321);
					predicateObjectList();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				subject();
				setState(325);
				match(T__13);
				setState(326);
				object();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				subject();
				setState(329);
				verb();
				notifyErrorListeners("Object of a triple is missing");
				}
				break;
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

	public static class PredicateObjectListContext extends ParserRuleContext {
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ObjectListContext> objectList() {
			return getRuleContexts(ObjectListContext.class);
		}
		public ObjectListContext objectList(int i) {
			return getRuleContext(ObjectListContext.class,i);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPredicateObjectList(this);
		}
	}

	public final PredicateObjectListContext predicateObjectList() throws RecognitionException {
		PredicateObjectListContext _localctx = new PredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_predicateObjectList);
		int _la;
		try {
			int _alt;
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				verb();
				setState(335);
				objectList();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						match(T__2);
						setState(337);
						verb();
						setState(338);
						objectList();
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				verb();
				setState(346);
				objectList();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(347);
					match(T__2);
					setState(348);
					verb();
					setState(349);
					objectList();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(356);
						match(T__0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(359); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners("Too many dots ");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				verb();
				setState(364);
				objectList();
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(365);
						match(T__2);
						setState(366);
						verb();
						}
						} 
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				notifyErrorListeners("Object of a triple is missing");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				verb();
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(375);
						match(T__2);
						setState(376);
						verb();
						setState(377);
						objectList();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				notifyErrorListeners("Object of a triple is missing");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				verb();
				setState(387);
				objectList();
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						match(T__2);
						setState(389);
						verb();
						setState(390);
						objectList();
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(399); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(397);
						match(T__2);
						setState(398);
						verb();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(401); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						match(T__2);
						setState(404);
						verb();
						setState(405);
						objectList();
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				notifyErrorListeners("Object of a triple is missing");
				}
				break;
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

	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitObjectList(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			object();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(T__1);
					setState(418);
					object();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class VerbContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_verb);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				predicate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(T__16);
				setState(427);
				predicate();
				setState(428);
				match(T__17);
				notifyErrorListeners("'is .. of' pattern is not used in Turtle");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(T__18);
				notifyErrorListeners("'A' cannot be used as predicate, it should be replaced with 'a'");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(BooleanLiteral);
				notifyErrorListeners("Predicate cannot be a Boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(NumericLiteral);
				notifyErrorListeners("Predicate cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				literal();
				notifyErrorListeners("Predicate cannot be a literal");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(BlankNode);
				notifyErrorListeners("Predicate cannot be a blank node");
				}
				break;
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

	public static class SubjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TripleContext triple() {
			return getRuleContext(TripleContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subject);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				iri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(BlankNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(BlankNode);
				setState(447);
				match(T__0);
				notifyErrorListeners("Blank Node cannot be followed by '.'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(T__9);
				notifyErrorListeners("'a' cannot be used as a subject");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(BooleanLiteral);
				notifyErrorListeners("Subject cannot be a Boolean value");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(NumericLiteral);
				notifyErrorListeners("Subject cannot be a number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				rdfLiteral();
				notifyErrorListeners("Subject cannot be a string");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(458);
				collection();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				match(T__19);
				setState(460);
				triple();
				setState(461);
				match(T__0);
				setState(462);
				match(T__20);
				notifyErrorListeners("{ } pattern cannot be used in Turtle");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(465);
				match(T__19);
				setState(466);
				triple();
				setState(467);
				match(T__20);
				notifyErrorListeners("{ } pattern cannot be used in Turtle");
				}
				break;
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

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			iri();
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

	public static class ObjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BlankNode() { return getToken(TurtleParser.BlankNode, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public BadBlankNodePropertyListContext badBlankNodePropertyList() {
			return getRuleContext(BadBlankNodePropertyListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				iri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(BlankNode);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				collection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				blankNodePropertyList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				badBlankNodePropertyList();
				notifyErrorListeners("incorrect form of a blank node list");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				match(T__9);
				notifyErrorListeners("'a' cannot be used as an object");
				}
				break;
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

	public static class LiteralContext extends ParserRuleContext {
		public RdfLiteralContext rdfLiteral() {
			return getRuleContext(RdfLiteralContext.class,0);
		}
		public TerminalNode NumericLiteral() { return getToken(TurtleParser.NumericLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(TurtleParser.BooleanLiteral, 0); }
		public TerminalNode BadLiteral() { return getToken(TurtleParser.BadLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
			case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
			case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
			case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
			case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
			case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
			case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
			case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
			case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
			case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
			case BAD_STRING_LITERAL_SINGLE_QUOTE:
			case BAD_STRING_LITERAL_QUOTE:
			case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
			case BAD_STRING_LITERAL_LONG_QUOTE:
			case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
			case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				rdfLiteral();
				}
				break;
			case NumericLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(NumericLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(BooleanLiteral);
				}
				break;
			case BadLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(BadLiteral);
				notifyErrorListeners("incorrect form of a Literal");
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBlankNodePropertyList(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__21);
			setState(494);
			predicateObjectList();
			setState(495);
			match(T__22);
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

	public static class BadBlankNodePropertyListContext extends ParserRuleContext {
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BadBlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badBlankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterBadBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitBadBlankNodePropertyList(this);
		}
	}

	public final BadBlankNodePropertyListContext badBlankNodePropertyList() throws RecognitionException {
		BadBlankNodePropertyListContext _localctx = new BadBlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_badBlankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__21);
			setState(498);
			predicateObjectList();
			setState(499);
			match(T__0);
			setState(500);
			match(T__22);
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

	public static class CollectionContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__23);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__13) | (1L << T__21) | (1L << T__23) | (1L << NumericLiteral) | (1L << BooleanLiteral) | (1L << BadLiteral) | (1L << String) | (1L << BlankNode) | (1L << PN_PREFIX) | (1L << IRIREF) | (1L << PrefixedName) | (1L << BAD_PNAME_LN_STARTS_WITH_DOT) | (1L << BAD_PNAME_LN_ENDS_WITH_DOT) | (1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES) | (1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PN_LOCAL_BAD_WITH_DASH - 75)) | (1L << (BAD_IRIREF_WITH_SPACE - 75)) | (1L << (BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS - 75)) | (1L << (BAD_IRIREF_WITH_PARENTHESES - 75)) | (1L << (BAD_STRING_LITERAL_SINGLE_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_SINGLE_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_QUOTE - 75)) | (1L << (BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY - 75)) | (1L << (BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY - 75)))) != 0)) {
				{
				{
				setState(503);
				object();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(T__24);
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

	public static class RdfLiteralContext extends ParserRuleContext {
		public TerminalNode BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES, 0); }
		public TerminalNode LANGTAG() { return getToken(TurtleParser.LANGTAG, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public TerminalNode BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY, 0); }
		public TerminalNode String() { return getToken(TurtleParser.String, 0); }
		public TerminalNode BAD_LANGTAG_AS_NUMBER() { return getToken(TurtleParser.BAD_LANGTAG_AS_NUMBER, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_SINGLE_QUOTE() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_SINGLE_QUOTE, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_QUOTE() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_QUOTE, 0); }
		public TerminalNode BAD_STRING_LITERAL_SINGLE_QUOTE() { return getToken(TurtleParser.BAD_STRING_LITERAL_SINGLE_QUOTE, 0); }
		public TerminalNode BAD_STRING_LITERAL_QUOTE() { return getToken(TurtleParser.BAD_STRING_LITERAL_QUOTE, 0); }
		public TerminalNode BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR() { return getToken(TurtleParser.BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR, 0); }
		public TerminalNode BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR() { return getToken(TurtleParser.BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR, 0); }
		public TerminalNode BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE() { return getToken(TurtleParser.BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE, 0); }
		public TerminalNode BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE() { return getToken(TurtleParser.BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE, 0); }
		public TerminalNode BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE() { return getToken(TurtleParser.BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE, 0); }
		public RdfLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdfLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterRdfLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitRdfLiteral(this);
		}
	}

	public final RdfLiteralContext rdfLiteral() throws RecognitionException {
		RdfLiteralContext _localctx = new RdfLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rdfLiteral);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES);
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(512);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(513);
					match(T__25);
					setState(514);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect form of long literal with uncolsed qoutes");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY);
				setState(522);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(519);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(520);
					match(T__25);
					setState(521);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect form of long literal with 4 qoutes");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY);
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(526);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(527);
					match(T__25);
					setState(528);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect form of long literal with 4 qoutes");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				match(String);
				setState(533);
				match(BAD_LANGTAG_AS_NUMBER);
				notifyErrorListeners("Language tag cannot be a numeric value");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				match(String);
				setState(536);
				match(T__6);
				setState(537);
				iri();
				notifyErrorListeners("Missing '^' Character");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				match(String);
				setState(541);
				match(LANGTAG);
				setState(542);
				match(T__25);
				setState(543);
				iri();
				notifyErrorListeners("incorrect form of a Literal");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				match(String);
				setState(547);
				match(T__25);
				setState(548);
				iri();
				setState(549);
				match(LANGTAG);
				notifyErrorListeners("incorrect form of a Literal");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				_la = _input.LA(1);
				if ( !(_la==BAD_STRING_LITERAL_LONG_SINGLE_QUOTE || _la==BAD_STRING_LITERAL_LONG_QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(553);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(554);
					match(T__25);
					setState(555);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect quotes of a literal");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(559);
				match(BAD_STRING_LITERAL_SINGLE_QUOTE);
				setState(563);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(560);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(561);
					match(T__25);
					setState(562);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect quotes of a literal");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(566);
				match(BAD_STRING_LITERAL_QUOTE);
				setState(570);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(567);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(568);
					match(T__25);
					setState(569);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				notifyErrorListeners("incorrect quotes of a literal");
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(573);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Bad Unicode Characters, Only HEX Characters are allowed");
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(575);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE) | (1L << BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				notifyErrorListeners("Bad Literal Escape");
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(577);
				match(String);
				setState(581);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGTAG:
					{
					setState(578);
					match(LANGTAG);
					}
					break;
				case T__25:
					{
					setState(579);
					match(T__25);
					setState(580);
					iri();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case KW_BASE:
				case KW_PREFIX:
				case NumericLiteral:
				case BooleanLiteral:
				case BadLiteral:
				case String:
				case BlankNode:
				case CHARS:
				case PN_PREFIX:
				case IRIREF:
				case PNAME_NS:
				case PrefixedName:
				case BAD_PNAME_LN_STARTS_WITH_DOT:
				case BAD_PNAME_LN_ENDS_WITH_DOT:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_UCHAR:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_OPEN_QUOTES:
				case BAD_STRING_LITERAL_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_WITH_BAD_ESCAPE:
				case BAD_STRING_LITERAL_LONG_QUOTE_WITH_BAD_ESCAPE:
				case PN_LOCAL_BAD_WITH_DASH:
				case BAD_IRIREF_WITH_SPACE:
				case BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS:
				case BAD_IRIREF_WITH_PARENTHESES:
				case BAD_STRING_LITERAL_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_QUOTE:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE:
				case BAD_STRING_LITERAL_LONG_QUOTE_TOO_MANY:
				case BAD_STRING_LITERAL_LONG_SINGLE_QUOTE_TOO_MANY:
					break;
				default:
					break;
				}
				}
				break;
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

	public static class IriContext extends ParserRuleContext {
		public Token PrefixedName;
		public TerminalNode BAD_PN_LOCAL_STARTS_WITH_TILDE() { return getToken(TurtleParser.BAD_PN_LOCAL_STARTS_WITH_TILDE, 0); }
		public TerminalNode PN_LOCAL_BAD_WITH_DASH() { return getToken(TurtleParser.PN_LOCAL_BAD_WITH_DASH, 0); }
		public TerminalNode PrefixedName() { return getToken(TurtleParser.PrefixedName, 0); }
		public TerminalNode IRIREF() { return getToken(TurtleParser.IRIREF, 0); }
		public TerminalNode BAD_PN_LOCAL_STARTS_WITH_PERCENT() { return getToken(TurtleParser.BAD_PN_LOCAL_STARTS_WITH_PERCENT, 0); }
		public TerminalNode PN_PREFIX() { return getToken(TurtleParser.PN_PREFIX, 0); }
		public TerminalNode BAD_PNAME_LN_STARTS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_STARTS_WITH_DOT, 0); }
		public TerminalNode BAD_PNAME_LN_ENDS_WITH_DOT() { return getToken(TurtleParser.BAD_PNAME_LN_ENDS_WITH_DOT, 0); }
		public TerminalNode BAD_IRIREF_WITH_SPACE() { return getToken(TurtleParser.BAD_IRIREF_WITH_SPACE, 0); }
		public TerminalNode BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS() { return getToken(TurtleParser.BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS, 0); }
		public TerminalNode BAD_IRIREF_WITH_PARENTHESES() { return getToken(TurtleParser.BAD_IRIREF_WITH_PARENTHESES, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TurtleListener ) ((TurtleListener)listener).exitIri(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iri);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(T__13);
				setState(586);
				match(BAD_PN_LOCAL_STARTS_WITH_TILDE);
				notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '~'");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(PN_LOCAL_BAD_WITH_DASH);
				notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot start with dash");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				((IriContext)_localctx).PrefixedName = match(PrefixedName);
				if (!isExistNS((((IriContext)_localctx).PrefixedName!=null?((IriContext)_localctx).PrefixedName.getText():null))){ notifyErrorListeners((((IriContext)_localctx).PrefixedName!=null?((IriContext)_localctx).PrefixedName.getText():null).split(":")[0] +": prefix in " + (((IriContext)_localctx).PrefixedName!=null?((IriContext)_localctx).PrefixedName.getText():null) + " is undefined");}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				match(IRIREF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PN_PREFIX) {
					{
					setState(593);
					match(PN_PREFIX);
					}
				}

				setState(596);
				match(T__13);
				setState(597);
				match(BAD_PN_LOCAL_STARTS_WITH_PERCENT);
				notifyErrorListeners("Bad syntax of Prefixed IRI, the local prefix namespace cannot contain '%'");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				match(BAD_PNAME_LN_STARTS_WITH_DOT);
				notifyErrorListeners("incorrect form of Prefix-label, it cannot start with '.'");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(601);
				match(BAD_PNAME_LN_ENDS_WITH_DOT);
				notifyErrorListeners("incorrect form of Prefix-label, it cannot end with '.'");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(603);
				match(BAD_IRIREF_WITH_SPACE);
				notifyErrorListeners("Bad syntax of IRI, IRI cannot contain space or newline");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(605);
				match(BAD_IRIREF_WITH_MULTIPLE_ANGLE_BRACKETS);
				notifyErrorListeners("Bad syntax of IRI, Too many angle brackets in IRI");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(607);
				match(BAD_IRIREF_WITH_PARENTHESES);
				notifyErrorListeners("Bad syntax of IRI, IRI cannot contain unexpected characters");
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u0266\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3Q\n\3\r\3"+
		"\16\3R\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0083\n\5"+
		"\r\5\16\5\u0084\3\5\3\5\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\6\5\u0095\n\5\r\5\16\5\u0096\3\5\3\5\3\5\6\5\u009c\n\5"+
		"\r\5\16\5\u009d\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b4\n\5\f\5\16\5\u00b7\13\5\3\5\3\5\7"+
		"\5\u00bb\n\5\f\5\16\5\u00be\13\5\3\5\3\5\5\5\u00c2\n\5\3\6\3\6\3\7\3\7"+
		"\7\7\u00c8\n\7\f\7\16\7\u00cb\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00ee\n\b\r\b\16\b\u00ef\3\b\6\b\u00f3"+
		"\n\b\r\b\16\b\u00f4\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0102"+
		"\n\b\f\b\16\b\u0105\13\b\3\b\3\b\3\b\5\b\u010a\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\6\t\u0112\n\t\r\t\16\t\u0113\3\t\6\t\u0117\n\t\r\t\16\t\u0118\3\t"+
		"\5\t\u011c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0124\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013e\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0145\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014f\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0157\n\r\f\r\16\r\u015a\13\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0162\n\r\f\r\16\r\u0165\13\r\3\r\6\r\u0168\n\r\r\r\16\r\u0169"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0172\n\r\f\r\16\r\u0175\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u017e\n\r\f\r\16\r\u0181\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u018b\n\r\f\r\16\r\u018e\13\r\3\r\3\r\6\r\u0192\n\r\r"+
		"\r\16\r\u0193\3\r\3\r\3\r\3\r\7\r\u019a\n\r\f\r\16\r\u019d\13\r\3\r\3"+
		"\r\5\r\u01a1\n\r\3\16\3\16\3\16\7\16\u01a6\n\16\f\16\16\16\u01a9\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u01bd\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01d9\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01e7\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u01ee\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\7\26\u01fb\n\26\f\26\16\26\u01fe\13\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0206\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u020d\n\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0214\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u022f\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0236\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u023d\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0248\n\27\5\27\u024a\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u0255\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0264\n\30\3\30\2\2\31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\4\2\f\f$$\4\2((..\3"+
		"\2XY\3\29<\3\2>A\2\u02cf\2\63\3\2\2\2\4\\\3\2\2\2\6k\3\2\2\2\b\u00c1\3"+
		"\2\2\2\n\u00c3\3\2\2\2\f\u00c5\3\2\2\2\16\u0109\3\2\2\2\20\u011b\3\2\2"+
		"\2\22\u0123\3\2\2\2\24\u013d\3\2\2\2\26\u014e\3\2\2\2\30\u01a0\3\2\2\2"+
		"\32\u01a2\3\2\2\2\34\u01bc\3\2\2\2\36\u01d8\3\2\2\2 \u01da\3\2\2\2\"\u01e6"+
		"\3\2\2\2$\u01ed\3\2\2\2&\u01ef\3\2\2\2(\u01f3\3\2\2\2*\u01f8\3\2\2\2,"+
		"\u0249\3\2\2\2.\u0263\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2"+
		"\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2"+
		"\3\67\3\3\2\2\28]\5\6\4\29:\7(\2\2:;\7(\2\2;<\7(\2\2<=\5\n\6\2=>\7\3\2"+
		"\2>?\b\3\1\2?]\3\2\2\2@A\5\26\f\2AB\7\3\2\2B]\3\2\2\2CD\5\26\f\2DE\b\3"+
		"\1\2E]\3\2\2\2FG\5\26\f\2GH\7\4\2\2HI\b\3\1\2I]\3\2\2\2JK\5\26\f\2KL\7"+
		"\5\2\2LM\b\3\1\2M]\3\2\2\2NP\5\26\f\2OQ\7\3\2\2PO\3\2\2\2QR\3\2\2\2RP"+
		"\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\7\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2W"+
		"X\3\2\2\2XY\3\2\2\2YZ\b\3\1\2Z]\3\2\2\2[]\5\b\5\2\\8\3\2\2\2\\9\3\2\2"+
		"\2\\@\3\2\2\2\\C\3\2\2\2\\F\3\2\2\2\\J\3\2\2\2\\N\3\2\2\2\\[\3\2\2\2]"+
		"\5\3\2\2\2^l\5\24\13\2_l\5\22\n\2`l\5\16\b\2al\5\20\t\2bl\5\f\7\2cd\5"+
		"\24\13\2de\7\3\2\2ef\b\4\1\2fl\3\2\2\2gh\5\22\n\2hi\7\3\2\2ij\b\4\1\2"+
		"jl\3\2\2\2k^\3\2\2\2k_\3\2\2\2k`\3\2\2\2ka\3\2\2\2kb\3\2\2\2kc\3\2\2\2"+
		"kg\3\2\2\2l\7\3\2\2\2mn\5.\30\2no\7\6\2\2op\5.\30\2pq\7\3\2\2qr\b\5\1"+
		"\2r\u00c2\3\2\2\2st\5.\30\2tu\7\7\2\2uv\5.\30\2vw\7\3\2\2wx\b\5\1\2x\u00c2"+
		"\3\2\2\2yz\5.\30\2z{\7\b\2\2{|\5.\30\2|}\7\3\2\2}~\b\5\1\2~\u00c2\3\2"+
		"\2\2\177\u0080\5.\30\2\u0080\u0081\7\3\2\2\u0081\u0083\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0089\3\2\2\2\u0086\u0087\5.\30\2\u0087\u0088\7\3\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7"+
		"\3\2\2\u008f\u0090\b\5\1\2\u0090\u00c2\3\2\2\2\u0091\u0092\5.\30\2\u0092"+
		"\u0093\7\3\2\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009b\3\2\2\2\u0098"+
		"\u0099\5.\30\2\u0099\u009a\7\3\2\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\b\5\1\2\u00a1\u00c2\3"+
		"\2\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\26\f\2\u00a5"+
		"\u00a6\7\3\2\2\u00a6\u00a7\b\5\1\2\u00a7\u00c2\3\2\2\2\u00a8\u00a9\7\n"+
		"\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\b\5\1\2\u00ac"+
		"\u00c2\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5.\30\2\u00af\u00b0\7"+
		"\3\2\2\u00b0\u00b1\b\5\1\2\u00b1\u00c2\3\2\2\2\u00b2\u00b4\t\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\7\r\2\2\u00b9"+
		"\u00bb\t\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\3\2\2\u00c0\u00c2\b\5\1\2\u00c1m\3\2\2\2\u00c1s\3\2\2\2\u00c1"+
		"y\3\2\2\2\u00c1\u0082\3\2\2\2\u00c1\u0094\3\2\2\2\u00c1\u00a2\3\2\2\2"+
		"\u00c1\u00a8\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c2\t\3"+
		"\2\2\2\u00c3\u00c4\t\3\2\2\u00c4\13\3\2\2\2\u00c5\u00c9\7\16\2\2\u00c6"+
		"\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\3\2\2\u00cd\u00ce\b\7\1\2\u00ce\r\3\2\2\2\u00cf\u00d0\7\17\2"+
		"\2\u00d0\u00d1\7$\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\7\20\2\2\u00d3\u00d4"+
		"\7(\2\2\u00d4\u00d5\7\3\2\2\u00d5\u010a\b\b\1\2\u00d6\u00d7\7\17\2\2\u00d7"+
		"\u00d8\7\3\2\2\u00d8\u00d9\7$\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\7("+
		"\2\2\u00db\u00dc\7\3\2\2\u00dc\u010a\b\b\1\2\u00dd\u00de\7\17\2\2\u00de"+
		"\u00df\7\20\2\2\u00df\u00e0\7(\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2\b\b"+
		"\1\2\u00e2\u010a\b\b\1\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5\7)\2\2\u00e5"+
		"\u00e6\7(\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\b\b\1\2\u00e8\u010a\b\b"+
		"\1\2\u00e9\u00ea\7\17\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ed\7(\2\2\u00ec"+
		"\u00ee\7\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\7\3\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u010a\b\b\1\2\u00f7\u00f8\7)\2\2\u00f8"+
		"\u00f9\7(\2\2\u00f9\u00fa\7\3\2\2\u00fa\u010a\b\b\1\2\u00fb\u00fc\7\17"+
		"\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe\7\3\2\2\u00fe\u010a\b\b\1\2\u00ff"+
		"\u0103\7\17\2\2\u0100\u0102\7$\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\7(\2\2\u0107\u0108\7\3\2\2\u0108\u010a\b\b"+
		"\1\2\u0109\u00cf\3\2\2\2\u0109\u00d6\3\2\2\2\u0109\u00dd\3\2\2\2\u0109"+
		"\u00e3\3\2\2\2\u0109\u00e9\3\2\2\2\u0109\u00f7\3\2\2\2\u0109\u00fb\3\2"+
		"\2\2\u0109\u00ff\3\2\2\2\u010a\17\3\2\2\2\u010b\u010c\7\21\2\2\u010c\u010d"+
		"\7(\2\2\u010d\u011c\7\3\2\2\u010e\u010f\7\21\2\2\u010f\u0111\7(\2\2\u0110"+
		"\u0112\7\3\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117\7\3\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\b\t\1\2\u011b\u010b\3\2\2\2\u011b"+
		"\u010e\3\2\2\2\u011c\21\3\2\2\2\u011d\u011e\7\35\2\2\u011e\u0124\7(\2"+
		"\2\u011f\u0120\7\22\2\2\u0120\u0121\7(\2\2\u0121\u0122\7\3\2\2\u0122\u0124"+
		"\b\n\1\2\u0123\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0124\23\3\2\2\2\u0125"+
		"\u0126\7\36\2\2\u0126\u0127\7$\2\2\u0127\u0128\7\3\2\2\u0128\u0129\7\20"+
		"\2\2\u0129\u012a\7(\2\2\u012a\u013e\b\13\1\2\u012b\u012c\7\36\2\2\u012c"+
		"\u012d\7\3\2\2\u012d\u012e\7$\2\2\u012e\u012f\7\20\2\2\u012f\u0130\7("+
		"\2\2\u0130\u013e\b\13\1\2\u0131\u0132\7\36\2\2\u0132\u0133\7)\2\2\u0133"+
		"\u013e\7(\2\2\u0134\u0135\7\36\2\2\u0135\u0136\7\20\2\2\u0136\u013e\7"+
		"(\2\2\u0137\u0138\7)\2\2\u0138\u0139\7(\2\2\u0139\u013e\b\13\1\2\u013a"+
		"\u013b\7\36\2\2\u013b\u013c\7(\2\2\u013c\u013e\b\13\1\2\u013d\u0125\3"+
		"\2\2\2\u013d\u012b\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0134\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u013a\3\2\2\2\u013e\25\3\2\2\2\u013f\u0140\5\36\20"+
		"\2\u0140\u0141\5\30\r\2\u0141\u014f\3\2\2\2\u0142\u0144\5&\24\2\u0143"+
		"\u0145\5\30\r\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014f\3"+
		"\2\2\2\u0146\u0147\5\36\20\2\u0147\u0148\7\20\2\2\u0148\u0149\5\"\22\2"+
		"\u0149\u014f\3\2\2\2\u014a\u014b\5\36\20\2\u014b\u014c\5\34\17\2\u014c"+
		"\u014d\b\f\1\2\u014d\u014f\3\2\2\2\u014e\u013f\3\2\2\2\u014e\u0142\3\2"+
		"\2\2\u014e\u0146\3\2\2\2\u014e\u014a\3\2\2\2\u014f\27\3\2\2\2\u0150\u0151"+
		"\5\34\17\2\u0151\u0158\5\32\16\2\u0152\u0153\7\5\2\2\u0153\u0154\5\34"+
		"\17\2\u0154\u0155\5\32\16\2\u0155\u0157\3\2\2\2\u0156\u0152\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u01a1\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015c\5\34\17\2\u015c\u0163\5\32\16\2\u015d"+
		"\u015e\7\5\2\2\u015e\u015f\5\34\17\2\u015f\u0160\5\32\16\2\u0160\u0162"+
		"\3\2\2\2\u0161\u015d\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\7\3"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\r\1\2\u016c\u01a1\3\2"+
		"\2\2\u016d\u016e\5\34\17\2\u016e\u0173\5\32\16\2\u016f\u0170\7\5\2\2\u0170"+
		"\u0172\5\34\17\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\b\r\1\2\u0177\u01a1\3\2\2\2\u0178\u017f\5\34\17\2\u0179\u017a\7"+
		"\5\2\2\u017a\u017b\5\34\17\2\u017b\u017c\5\32\16\2\u017c\u017e\3\2\2\2"+
		"\u017d\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\b\r\1\2\u0183"+
		"\u01a1\3\2\2\2\u0184\u0185\5\34\17\2\u0185\u018c\5\32\16\2\u0186\u0187"+
		"\7\5\2\2\u0187\u0188\5\34\17\2\u0188\u0189\5\32\16\2\u0189\u018b\3\2\2"+
		"\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u0191\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\5\2\2\u0190"+
		"\u0192\5\34\17\2\u0191\u018f\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u019b\3\2\2\2\u0195\u0196\7\5\2\2\u0196"+
		"\u0197\5\34\17\2\u0197\u0198\5\32\16\2\u0198\u019a\3\2\2\2\u0199\u0195"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\b\r\1\2\u019f\u01a1\3\2"+
		"\2\2\u01a0\u0150\3\2\2\2\u01a0\u015b\3\2\2\2\u01a0\u016d\3\2\2\2\u01a0"+
		"\u0178\3\2\2\2\u01a0\u0184\3\2\2\2\u01a1\31\3\2\2\2\u01a2\u01a7\5\"\22"+
		"\2\u01a3\u01a4\7\4\2\2\u01a4\u01a6\5\"\22\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\33\3\2\2"+
		"\2\u01a9\u01a7\3\2\2\2\u01aa\u01bd\7\f\2\2\u01ab\u01bd\5 \21\2\u01ac\u01ad"+
		"\7\23\2\2\u01ad\u01ae\5 \21\2\u01ae\u01af\7\24\2\2\u01af\u01b0\b\17\1"+
		"\2\u01b0\u01bd\3\2\2\2\u01b1\u01b2\7\25\2\2\u01b2\u01bd\b\17\1\2\u01b3"+
		"\u01b4\7 \2\2\u01b4\u01bd\b\17\1\2\u01b5\u01b6\7\37\2\2\u01b6\u01bd\b"+
		"\17\1\2\u01b7\u01b8\5$\23\2\u01b8\u01b9\b\17\1\2\u01b9\u01bd\3\2\2\2\u01ba"+
		"\u01bb\7#\2\2\u01bb\u01bd\b\17\1\2\u01bc\u01aa\3\2\2\2\u01bc\u01ab\3\2"+
		"\2\2\u01bc\u01ac\3\2\2\2\u01bc\u01b1\3\2\2\2\u01bc\u01b3\3\2\2\2\u01bc"+
		"\u01b5\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\35\3\2\2"+
		"\2\u01be\u01d9\5.\30\2\u01bf\u01d9\7#\2\2\u01c0\u01c1\7#\2\2\u01c1\u01c2"+
		"\7\3\2\2\u01c2\u01d9\b\20\1\2\u01c3\u01c4\7\f\2\2\u01c4\u01d9\b\20\1\2"+
		"\u01c5\u01c6\7 \2\2\u01c6\u01d9\b\20\1\2\u01c7\u01c8\7\37\2\2\u01c8\u01d9"+
		"\b\20\1\2\u01c9\u01ca\5,\27\2\u01ca\u01cb\b\20\1\2\u01cb\u01d9\3\2\2\2"+
		"\u01cc\u01d9\5*\26\2\u01cd\u01ce\7\26\2\2\u01ce\u01cf\5\26\f\2\u01cf\u01d0"+
		"\7\3\2\2\u01d0\u01d1\7\27\2\2\u01d1\u01d2\b\20\1\2\u01d2\u01d9\3\2\2\2"+
		"\u01d3\u01d4\7\26\2\2\u01d4\u01d5\5\26\f\2\u01d5\u01d6\7\27\2\2\u01d6"+
		"\u01d7\b\20\1\2\u01d7\u01d9\3\2\2\2\u01d8\u01be\3\2\2\2\u01d8\u01bf\3"+
		"\2\2\2\u01d8\u01c0\3\2\2\2\u01d8\u01c3\3\2\2\2\u01d8\u01c5\3\2\2\2\u01d8"+
		"\u01c7\3\2\2\2\u01d8\u01c9\3\2\2\2\u01d8\u01cc\3\2\2\2\u01d8\u01cd\3\2"+
		"\2\2\u01d8\u01d3\3\2\2\2\u01d9\37\3\2\2\2\u01da\u01db\5.\30\2\u01db!\3"+
		"\2\2\2\u01dc\u01e7\5.\30\2\u01dd\u01e7\7#\2\2\u01de\u01e7\5*\26\2\u01df"+
		"\u01e7\5&\24\2\u01e0\u01e1\5(\25\2\u01e1\u01e2\b\22\1\2\u01e2\u01e7\3"+
		"\2\2\2\u01e3\u01e7\5$\23\2\u01e4\u01e5\7\f\2\2\u01e5\u01e7\b\22\1\2\u01e6"+
		"\u01dc\3\2\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01df\3\2"+
		"\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"#\3\2\2\2\u01e8\u01ee\5,\27\2\u01e9\u01ee\7\37\2\2\u01ea\u01ee\7 \2\2"+
		"\u01eb\u01ec\7!\2\2\u01ec\u01ee\b\23\1\2\u01ed\u01e8\3\2\2\2\u01ed\u01e9"+
		"\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee%\3\2\2\2\u01ef"+
		"\u01f0\7\30\2\2\u01f0\u01f1\5\30\r\2\u01f1\u01f2\7\31\2\2\u01f2\'\3\2"+
		"\2\2\u01f3\u01f4\7\30\2\2\u01f4\u01f5\5\30\r\2\u01f5\u01f6\7\3\2\2\u01f6"+
		"\u01f7\7\31\2\2\u01f7)\3\2\2\2\u01f8\u01fc\7\32\2\2\u01f9\u01fb\5\"\22"+
		"\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\33\2\2"+
		"\u0200+\3\2\2\2\u0201\u0205\7=\2\2\u0202\u0206\7/\2\2\u0203\u0204\7\34"+
		"\2\2\u0204\u0206\5.\30\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u024a\b\27\1\2\u0208\u020c\7"+
		"Z\2\2\u0209\u020d\7/\2\2\u020a\u020b\7\34\2\2\u020b\u020d\5.\30\2\u020c"+
		"\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u024a\b\27\1\2\u020f\u0213\7[\2\2\u0210\u0214\7/\2\2\u0211"+
		"\u0212\7\34\2\2\u0212\u0214\5.\30\2\u0213\u0210\3\2\2\2\u0213\u0211\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u024a\b\27\1\2\u0216"+
		"\u0217\7\"\2\2\u0217\u0218\7\60\2\2\u0218\u024a\b\27\1\2\u0219\u021a\7"+
		"\"\2\2\u021a\u021b\7\t\2\2\u021b\u021c\5.\30\2\u021c\u021d\b\27\1\2\u021d"+
		"\u024a\3\2\2\2\u021e\u021f\7\"\2\2\u021f\u0220\7/\2\2\u0220\u0221\7\34"+
		"\2\2\u0221\u0222\5.\30\2\u0222\u0223\b\27\1\2\u0223\u024a\3\2\2\2\u0224"+
		"\u0225\7\"\2\2\u0225\u0226\7\34\2\2\u0226\u0227\5.\30\2\u0227\u0228\7"+
		"/\2\2\u0228\u0229\b\27\1\2\u0229\u024a\3\2\2\2\u022a\u022e\t\4\2\2\u022b"+
		"\u022f\7/\2\2\u022c\u022d\7\34\2\2\u022d\u022f\5.\30\2\u022e\u022b\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u024a\b\27\1\2\u0231\u0235\7V\2\2\u0232\u0236\7/\2\2\u0233\u0234\7\34"+
		"\2\2\u0234\u0236\5.\30\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u024a\b\27\1\2\u0238\u023c\7"+
		"W\2\2\u0239\u023d\7/\2\2\u023a\u023b\7\34\2\2\u023b\u023d\5.\30\2\u023c"+
		"\u0239\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u024a\b\27\1\2\u023f\u0240\t\5\2\2\u0240\u024a\b\27\1\2\u0241"+
		"\u0242\t\6\2\2\u0242\u024a\b\27\1\2\u0243\u0247\7\"\2\2\u0244\u0248\7"+
		"/\2\2\u0245\u0246\7\34\2\2\u0246\u0248\5.\30\2\u0247\u0244\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0201\3\2"+
		"\2\2\u0249\u0208\3\2\2\2\u0249\u020f\3\2\2\2\u0249\u0216\3\2\2\2\u0249"+
		"\u0219\3\2\2\2\u0249\u021e\3\2\2\2\u0249\u0224\3\2\2\2\u0249\u022a\3\2"+
		"\2\2\u0249\u0231\3\2\2\2\u0249\u0238\3\2\2\2\u0249\u023f\3\2\2\2\u0249"+
		"\u0241\3\2\2\2\u0249\u0243\3\2\2\2\u024a-\3\2\2\2\u024b\u024c\7\20\2\2"+
		"\u024c\u024d\7L\2\2\u024d\u0264\b\30\1\2\u024e\u024f\7M\2\2\u024f\u0264"+
		"\b\30\1\2\u0250\u0251\7*\2\2\u0251\u0264\b\30\1\2\u0252\u0264\7(\2\2\u0253"+
		"\u0255\7\'\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0257\7\20\2\2\u0257\u0258\7J\2\2\u0258\u0264\b\30\1\2\u0259"+
		"\u025a\7,\2\2\u025a\u0264\b\30\1\2\u025b\u025c\7-\2\2\u025c\u0264\b\30"+
		"\1\2\u025d\u025e\7S\2\2\u025e\u0264\b\30\1\2\u025f\u0260\7T\2\2\u0260"+
		"\u0264\b\30\1\2\u0261\u0262\7U\2\2\u0262\u0264\b\30\1\2\u0263\u024b\3"+
		"\2\2\2\u0263\u024e\3\2\2\2\u0263\u0250\3\2\2\2\u0263\u0252\3\2\2\2\u0263"+
		"\u0254\3\2\2\2\u0263\u0259\3\2\2\2\u0263\u025b\3\2\2\2\u0263\u025d\3\2"+
		"\2\2\u0263\u025f\3\2\2\2\u0263\u0261\3\2\2\2\u0264/\3\2\2\2\63\63RW\\"+
		"k\u0084\u008b\u0096\u009d\u00b5\u00bc\u00c1\u00c9\u00ef\u00f4\u0103\u0109"+
		"\u0113\u0118\u011b\u0123\u013d\u0144\u014e\u0158\u0163\u0169\u0173\u017f"+
		"\u018c\u0193\u019b\u01a0\u01a7\u01bc\u01d8\u01e6\u01ed\u01fc\u0205\u020c"+
		"\u0213\u022e\u0235\u023c\u0247\u0249\u0254\u0263";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
