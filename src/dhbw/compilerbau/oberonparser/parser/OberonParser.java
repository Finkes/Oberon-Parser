// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-29 00:19:59
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "CHARACTER", 
		"CHARCONST", "COMMENT", "DECLARE", "DIGIT", "FORMAL_PARAMETERS", "HEX_DIGIT", 
		"ID", "IDENT", "INTEGER", "LETTER", "PROCEDURE", "PROCEDURE_BODY", "REAL", 
		"SCALE_FACTOR", "STRING", "TYPE_DECL", "WS", "'#'", "'&'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'.'", "'..'", "'/'", "':'", "':='", "';'", 
		"'<'", "'<='", "'='", "'>'", "'>='", "'ABS'", "'ARRAY'", "'ASH'", "'BEGIN'", 
		"'CAP'", "'CONST'", "'COPY'", "'DEC'", "'DIV'", "'DO'", "'ELSE'", "'ELSIF'", 
		"'END'", "'EXCL'", "'EXIT'", "'HALT'", "'IF'", "'IMPORT'", "'IN'", "'INC'", 
		"'INCL'", "'IS'", "'LEN'", "'LOOP'", "'MAX'", "'MIN'", "'MOD'", "'MODULE'", 
		"'NEW'", "'NIL'", "'ODD'", "'OF'", "'OR'", "'POINTER TO'", "'PROCEDURE'", 
		"'RECORD'", "'REPEAT'", "'RETURN'", "'SIZE'", "'THEN'", "'TYPE'", "'UNTIL'", 
		"'VAR'", "'WHILE'", "'WITH'", "'['", "']'", "'^'", "'case'", "'{'", "'|'", 
		"'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int CHARACTER=6;
	public static final int CHARCONST=7;
	public static final int COMMENT=8;
	public static final int DECLARE=9;
	public static final int DIGIT=10;
	public static final int FORMAL_PARAMETERS=11;
	public static final int HEX_DIGIT=12;
	public static final int ID=13;
	public static final int IDENT=14;
	public static final int INTEGER=15;
	public static final int LETTER=16;
	public static final int PROCEDURE=17;
	public static final int PROCEDURE_BODY=18;
	public static final int REAL=19;
	public static final int SCALE_FACTOR=20;
	public static final int STRING=21;
	public static final int TYPE_DECL=22;
	public static final int WS=23;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OberonParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OberonParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return OberonParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g"; }


	public static class abs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "abs"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:1: abs : 'ABS' ^ '(' ! number ')' !;
	public final OberonParser.abs_return abs() throws RecognitionException {
		OberonParser.abs_return retval = new OberonParser.abs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token char_literal2=null;
		Token char_literal4=null;
		ParserRuleReturnScope number3 =null;

		Object string_literal1_tree=null;
		Object char_literal2_tree=null;
		Object char_literal4_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:23: ( 'ABS' ^ '(' ! number ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:25: 'ABS' ^ '(' ! number ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,43,FOLLOW_43_in_abs89); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			root_0 = (Object)adaptor.becomeRoot(string_literal1_tree, root_0);

			char_literal2=(Token)match(input,26,FOLLOW_26_in_abs92); 
			pushFollow(FOLLOW_number_in_abs95);
			number3=number();
			state._fsp--;

			adaptor.addChild(root_0, number3.getTree());

			char_literal4=(Token)match(input,27,FOLLOW_27_in_abs97); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abs"


	public static class odd_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "odd"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:1: odd : 'ODD' ^ '(' ! INTEGER ')' !;
	public final OberonParser.odd_return odd() throws RecognitionException {
		OberonParser.odd_return retval = new OberonParser.odd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token char_literal6=null;
		Token INTEGER7=null;
		Token char_literal8=null;

		Object string_literal5_tree=null;
		Object char_literal6_tree=null;
		Object INTEGER7_tree=null;
		Object char_literal8_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:23: ( 'ODD' ^ '(' ! INTEGER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:25: 'ODD' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal5=(Token)match(input,73,FOLLOW_73_in_odd123); 
			string_literal5_tree = (Object)adaptor.create(string_literal5);
			root_0 = (Object)adaptor.becomeRoot(string_literal5_tree, root_0);

			char_literal6=(Token)match(input,26,FOLLOW_26_in_odd126); 
			INTEGER7=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_odd129); 
			INTEGER7_tree = (Object)adaptor.create(INTEGER7);
			adaptor.addChild(root_0, INTEGER7_tree);

			char_literal8=(Token)match(input,27,FOLLOW_27_in_odd131); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "odd"


	public static class cap_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cap"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:1: cap : 'CAP' ^ '(' ! CHARACTER ')' !;
	public final OberonParser.cap_return cap() throws RecognitionException {
		OberonParser.cap_return retval = new OberonParser.cap_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token char_literal10=null;
		Token CHARACTER11=null;
		Token char_literal12=null;

		Object string_literal9_tree=null;
		Object char_literal10_tree=null;
		Object CHARACTER11_tree=null;
		Object char_literal12_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:23: ( 'CAP' ^ '(' ! CHARACTER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:25: 'CAP' ^ '(' ! CHARACTER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal9=(Token)match(input,47,FOLLOW_47_in_cap173); 
			string_literal9_tree = (Object)adaptor.create(string_literal9);
			root_0 = (Object)adaptor.becomeRoot(string_literal9_tree, root_0);

			char_literal10=(Token)match(input,26,FOLLOW_26_in_cap176); 
			CHARACTER11=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_cap179); 
			CHARACTER11_tree = (Object)adaptor.create(CHARACTER11);
			adaptor.addChild(root_0, CHARACTER11_tree);

			char_literal12=(Token)match(input,27,FOLLOW_27_in_cap181); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cap"


	public static class ash_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ash"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:1: ash : 'ASH' ^ '(' ! INTEGER ')' !;
	public final OberonParser.ash_return ash() throws RecognitionException {
		OberonParser.ash_return retval = new OberonParser.ash_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;
		Token char_literal14=null;
		Token INTEGER15=null;
		Token char_literal16=null;

		Object string_literal13_tree=null;
		Object char_literal14_tree=null;
		Object INTEGER15_tree=null;
		Object char_literal16_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:23: ( 'ASH' ^ '(' ! INTEGER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:25: 'ASH' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,45,FOLLOW_45_in_ash207); 
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			root_0 = (Object)adaptor.becomeRoot(string_literal13_tree, root_0);

			char_literal14=(Token)match(input,26,FOLLOW_26_in_ash210); 
			INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_ash213); 
			INTEGER15_tree = (Object)adaptor.create(INTEGER15);
			adaptor.addChild(root_0, INTEGER15_tree);

			char_literal16=(Token)match(input,27,FOLLOW_27_in_ash215); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ash"


	public static class len_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "len"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:1: len : 'LEN' ^ '(' ! qualident ( ',' INTEGER )? ')' !;
	public final OberonParser.len_return len() throws RecognitionException {
		OberonParser.len_return retval = new OberonParser.len_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal17=null;
		Token char_literal18=null;
		Token char_literal20=null;
		Token INTEGER21=null;
		Token char_literal22=null;
		ParserRuleReturnScope qualident19 =null;

		Object string_literal17_tree=null;
		Object char_literal18_tree=null;
		Object char_literal20_tree=null;
		Object INTEGER21_tree=null;
		Object char_literal22_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:23: ( 'LEN' ^ '(' ! qualident ( ',' INTEGER )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:25: 'LEN' ^ '(' ! qualident ( ',' INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal17=(Token)match(input,65,FOLLOW_65_in_len241); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);

			char_literal18=(Token)match(input,26,FOLLOW_26_in_len244); 
			pushFollow(FOLLOW_qualident_in_len247);
			qualident19=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident19.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:47: ( ',' INTEGER )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==30) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:48: ',' INTEGER
					{
					char_literal20=(Token)match(input,30,FOLLOW_30_in_len250); 
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);

					INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_len252); 
					INTEGER21_tree = (Object)adaptor.create(INTEGER21);
					adaptor.addChild(root_0, INTEGER21_tree);

					}
					break;

			}

			char_literal22=(Token)match(input,27,FOLLOW_27_in_len256); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "len"


	public static class maxMin_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "maxMin"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:1: maxMin : ( ( 'MAX' ^| 'MIN' ^) '(' ! qualident | set ')' !);
	public final OberonParser.maxMin_return maxMin() throws RecognitionException {
		OberonParser.maxMin_return retval = new OberonParser.maxMin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token string_literal24=null;
		Token char_literal25=null;
		Token char_literal28=null;
		ParserRuleReturnScope qualident26 =null;
		ParserRuleReturnScope set27 =null;

		Object string_literal23_tree=null;
		Object string_literal24_tree=null;
		Object char_literal25_tree=null;
		Object char_literal28_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:23: ( ( 'MAX' ^| 'MIN' ^) '(' ! qualident | set ')' !)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= 67 && LA3_0 <= 68)) ) {
				alt3=1;
			}
			else if ( (LA3_0==92) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:25: ( 'MAX' ^| 'MIN' ^) '(' ! qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:25: ( 'MAX' ^| 'MIN' ^)
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==67) ) {
						alt2=1;
					}
					else if ( (LA2_0==68) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:26: 'MAX' ^
							{
							string_literal23=(Token)match(input,67,FOLLOW_67_in_maxMin280); 
							string_literal23_tree = (Object)adaptor.create(string_literal23);
							root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

							}
							break;
						case 2 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:33: 'MIN' ^
							{
							string_literal24=(Token)match(input,68,FOLLOW_68_in_maxMin283); 
							string_literal24_tree = (Object)adaptor.create(string_literal24);
							root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);

							}
							break;

					}

					char_literal25=(Token)match(input,26,FOLLOW_26_in_maxMin287); 
					pushFollow(FOLLOW_qualident_in_maxMin290);
					qualident26=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident26.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:56: set ')' !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_maxMin292);
					set27=set();
					state._fsp--;

					adaptor.addChild(root_0, set27.getTree());

					char_literal28=(Token)match(input,27,FOLLOW_27_in_maxMin294); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "maxMin"


	public static class size_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "size"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:1: size : 'SIZE' ^ '(' ! qualident ')' !;
	public final OberonParser.size_return size() throws RecognitionException {
		OberonParser.size_return retval = new OberonParser.size_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		ParserRuleReturnScope qualident31 =null;

		Object string_literal29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:23: ( 'SIZE' ^ '(' ! qualident ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:25: 'SIZE' ^ '(' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal29=(Token)match(input,81,FOLLOW_81_in_size320); 
			string_literal29_tree = (Object)adaptor.create(string_literal29);
			root_0 = (Object)adaptor.becomeRoot(string_literal29_tree, root_0);

			char_literal30=(Token)match(input,26,FOLLOW_26_in_size323); 
			pushFollow(FOLLOW_qualident_in_size326);
			qualident31=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident31.getTree());

			char_literal32=(Token)match(input,27,FOLLOW_27_in_size328); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "size"


	public static class inc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inc"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:1: inc : 'INC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !;
	public final OberonParser.inc_return inc() throws RecognitionException {
		OberonParser.inc_return retval = new OberonParser.inc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token char_literal34=null;
		Token INTEGER35=null;
		Token char_literal36=null;
		Token INTEGER37=null;
		Token char_literal38=null;

		Object string_literal33_tree=null;
		Object char_literal34_tree=null;
		Object INTEGER35_tree=null;
		Object char_literal36_tree=null;
		Object INTEGER37_tree=null;
		Object char_literal38_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:23: ( 'INC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:25: 'INC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal33=(Token)match(input,62,FOLLOW_62_in_inc355); 
			string_literal33_tree = (Object)adaptor.create(string_literal33);
			root_0 = (Object)adaptor.becomeRoot(string_literal33_tree, root_0);

			char_literal34=(Token)match(input,26,FOLLOW_26_in_inc358); 
			INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc361); 
			INTEGER35_tree = (Object)adaptor.create(INTEGER35);
			adaptor.addChild(root_0, INTEGER35_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:45: ( ',' ! INTEGER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==30) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:46: ',' ! INTEGER
					{
					char_literal36=(Token)match(input,30,FOLLOW_30_in_inc364); 
					INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc367); 
					INTEGER37_tree = (Object)adaptor.create(INTEGER37);
					adaptor.addChild(root_0, INTEGER37_tree);

					}
					break;

			}

			char_literal38=(Token)match(input,27,FOLLOW_27_in_inc371); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inc"


	public static class dec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dec"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:1: dec : 'DEC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !;
	public final OberonParser.dec_return dec() throws RecognitionException {
		OberonParser.dec_return retval = new OberonParser.dec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		Token char_literal40=null;
		Token INTEGER41=null;
		Token char_literal42=null;
		Token INTEGER43=null;
		Token char_literal44=null;

		Object string_literal39_tree=null;
		Object char_literal40_tree=null;
		Object INTEGER41_tree=null;
		Object char_literal42_tree=null;
		Object INTEGER43_tree=null;
		Object char_literal44_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:23: ( 'DEC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:25: 'DEC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal39=(Token)match(input,50,FOLLOW_50_in_dec397); 
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			root_0 = (Object)adaptor.becomeRoot(string_literal39_tree, root_0);

			char_literal40=(Token)match(input,26,FOLLOW_26_in_dec400); 
			INTEGER41=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec403); 
			INTEGER41_tree = (Object)adaptor.create(INTEGER41);
			adaptor.addChild(root_0, INTEGER41_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:45: ( ',' ! INTEGER )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==30) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:46: ',' ! INTEGER
					{
					char_literal42=(Token)match(input,30,FOLLOW_30_in_dec406); 
					INTEGER43=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec409); 
					INTEGER43_tree = (Object)adaptor.create(INTEGER43);
					adaptor.addChild(root_0, INTEGER43_tree);

					}
					break;

			}

			char_literal44=(Token)match(input,27,FOLLOW_27_in_dec413); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dec"


	public static class incl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incl"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:1: incl : 'INCL' ^ '(' ! set ',' ! INTEGER ')' !;
	public final OberonParser.incl_return incl() throws RecognitionException {
		OberonParser.incl_return retval = new OberonParser.incl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		Token char_literal46=null;
		Token char_literal48=null;
		Token INTEGER49=null;
		Token char_literal50=null;
		ParserRuleReturnScope set47 =null;

		Object string_literal45_tree=null;
		Object char_literal46_tree=null;
		Object char_literal48_tree=null;
		Object INTEGER49_tree=null;
		Object char_literal50_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:23: ( 'INCL' ^ '(' ! set ',' ! INTEGER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:25: 'INCL' ^ '(' ! set ',' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal45=(Token)match(input,63,FOLLOW_63_in_incl438); 
			string_literal45_tree = (Object)adaptor.create(string_literal45);
			root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);

			char_literal46=(Token)match(input,26,FOLLOW_26_in_incl441); 
			pushFollow(FOLLOW_set_in_incl444);
			set47=set();
			state._fsp--;

			adaptor.addChild(root_0, set47.getTree());

			char_literal48=(Token)match(input,30,FOLLOW_30_in_incl446); 
			INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_incl449); 
			INTEGER49_tree = (Object)adaptor.create(INTEGER49);
			adaptor.addChild(root_0, INTEGER49_tree);

			char_literal50=(Token)match(input,27,FOLLOW_27_in_incl451); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "incl"


	public static class excl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "excl"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:1: excl : 'EXCL' ^ '(' ! set ',' ! INTEGER ')' !;
	public final OberonParser.excl_return excl() throws RecognitionException {
		OberonParser.excl_return retval = new OberonParser.excl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token INTEGER55=null;
		Token char_literal56=null;
		ParserRuleReturnScope set53 =null;

		Object string_literal51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object INTEGER55_tree=null;
		Object char_literal56_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:23: ( 'EXCL' ^ '(' ! set ',' ! INTEGER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:25: 'EXCL' ^ '(' ! set ',' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal51=(Token)match(input,56,FOLLOW_56_in_excl476); 
			string_literal51_tree = (Object)adaptor.create(string_literal51);
			root_0 = (Object)adaptor.becomeRoot(string_literal51_tree, root_0);

			char_literal52=(Token)match(input,26,FOLLOW_26_in_excl479); 
			pushFollow(FOLLOW_set_in_excl482);
			set53=set();
			state._fsp--;

			adaptor.addChild(root_0, set53.getTree());

			char_literal54=(Token)match(input,30,FOLLOW_30_in_excl484); 
			INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_excl487); 
			INTEGER55_tree = (Object)adaptor.create(INTEGER55);
			adaptor.addChild(root_0, INTEGER55_tree);

			char_literal56=(Token)match(input,27,FOLLOW_27_in_excl489); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "excl"


	public static class copy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "copy"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:1: copy : 'COPY' ^ '(' ! qualident ',' ! qualident ')' !;
	public final OberonParser.copy_return copy() throws RecognitionException {
		OberonParser.copy_return retval = new OberonParser.copy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope qualident59 =null;
		ParserRuleReturnScope qualident61 =null;

		Object string_literal57_tree=null;
		Object char_literal58_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:23: ( 'COPY' ^ '(' ! qualident ',' ! qualident ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:25: 'COPY' ^ '(' ! qualident ',' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,49,FOLLOW_49_in_copy514); 
			string_literal57_tree = (Object)adaptor.create(string_literal57);
			root_0 = (Object)adaptor.becomeRoot(string_literal57_tree, root_0);

			char_literal58=(Token)match(input,26,FOLLOW_26_in_copy517); 
			pushFollow(FOLLOW_qualident_in_copy520);
			qualident59=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident59.getTree());

			char_literal60=(Token)match(input,30,FOLLOW_30_in_copy522); 
			pushFollow(FOLLOW_qualident_in_copy525);
			qualident61=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident61.getTree());

			char_literal62=(Token)match(input,27,FOLLOW_27_in_copy527); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "copy"


	public static class neW_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "neW"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:1: neW : 'NEW' ^ '(' ! qualident ')' !;
	public final OberonParser.neW_return neW() throws RecognitionException {
		OberonParser.neW_return retval = new OberonParser.neW_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope qualident65 =null;

		Object string_literal63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:23: ( 'NEW' ^ '(' ! qualident ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:25: 'NEW' ^ '(' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal63=(Token)match(input,71,FOLLOW_71_in_neW553); 
			string_literal63_tree = (Object)adaptor.create(string_literal63);
			root_0 = (Object)adaptor.becomeRoot(string_literal63_tree, root_0);

			char_literal64=(Token)match(input,26,FOLLOW_26_in_neW556); 
			pushFollow(FOLLOW_qualident_in_neW559);
			qualident65=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident65.getTree());

			char_literal66=(Token)match(input,27,FOLLOW_27_in_neW561); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "neW"


	public static class halt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "halt"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:1: halt : 'HALT' ^ '(' ! INTEGER ')' !;
	public final OberonParser.halt_return halt() throws RecognitionException {
		OberonParser.halt_return retval = new OberonParser.halt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal67=null;
		Token char_literal68=null;
		Token INTEGER69=null;
		Token char_literal70=null;

		Object string_literal67_tree=null;
		Object char_literal68_tree=null;
		Object INTEGER69_tree=null;
		Object char_literal70_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:23: ( 'HALT' ^ '(' ! INTEGER ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:25: 'HALT' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal67=(Token)match(input,58,FOLLOW_58_in_halt587); 
			string_literal67_tree = (Object)adaptor.create(string_literal67);
			root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);

			char_literal68=(Token)match(input,26,FOLLOW_26_in_halt590); 
			INTEGER69=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_halt593); 
			INTEGER69_tree = (Object)adaptor.create(INTEGER69);
			adaptor.addChild(root_0, INTEGER69_tree);

			char_literal70=(Token)match(input,27,FOLLOW_27_in_halt595); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "halt"


	public static class predefined_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predefined"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:1: predefined : ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt ) ;
	public final OberonParser.predefined_return predefined() throws RecognitionException {
		OberonParser.predefined_return retval = new OberonParser.predefined_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope abs71 =null;
		ParserRuleReturnScope odd72 =null;
		ParserRuleReturnScope cap73 =null;
		ParserRuleReturnScope ash74 =null;
		ParserRuleReturnScope len75 =null;
		ParserRuleReturnScope maxMin76 =null;
		ParserRuleReturnScope size77 =null;
		ParserRuleReturnScope inc78 =null;
		ParserRuleReturnScope dec79 =null;
		ParserRuleReturnScope incl80 =null;
		ParserRuleReturnScope excl81 =null;
		ParserRuleReturnScope copy82 =null;
		ParserRuleReturnScope neW83 =null;
		ParserRuleReturnScope halt84 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:23: ( ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:25: ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt )
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:25: ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt )
			int alt6=14;
			switch ( input.LA(1) ) {
			case 43:
				{
				alt6=1;
				}
				break;
			case 73:
				{
				alt6=2;
				}
				break;
			case 47:
				{
				alt6=3;
				}
				break;
			case 45:
				{
				alt6=4;
				}
				break;
			case 65:
				{
				alt6=5;
				}
				break;
			case 67:
			case 68:
			case 92:
				{
				alt6=6;
				}
				break;
			case 81:
				{
				alt6=7;
				}
				break;
			case 62:
				{
				alt6=8;
				}
				break;
			case 50:
				{
				alt6=9;
				}
				break;
			case 63:
				{
				alt6=10;
				}
				break;
			case 56:
				{
				alt6=11;
				}
				break;
			case 49:
				{
				alt6=12;
				}
				break;
			case 71:
				{
				alt6=13;
				}
				break;
			case 58:
				{
				alt6=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:26: abs
					{
					pushFollow(FOLLOW_abs_in_predefined616);
					abs71=abs();
					state._fsp--;

					adaptor.addChild(root_0, abs71.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:30: odd
					{
					pushFollow(FOLLOW_odd_in_predefined618);
					odd72=odd();
					state._fsp--;

					adaptor.addChild(root_0, odd72.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:34: cap
					{
					pushFollow(FOLLOW_cap_in_predefined620);
					cap73=cap();
					state._fsp--;

					adaptor.addChild(root_0, cap73.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:38: ash
					{
					pushFollow(FOLLOW_ash_in_predefined622);
					ash74=ash();
					state._fsp--;

					adaptor.addChild(root_0, ash74.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:42: len
					{
					pushFollow(FOLLOW_len_in_predefined624);
					len75=len();
					state._fsp--;

					adaptor.addChild(root_0, len75.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:46: maxMin
					{
					pushFollow(FOLLOW_maxMin_in_predefined626);
					maxMin76=maxMin();
					state._fsp--;

					adaptor.addChild(root_0, maxMin76.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:53: size
					{
					pushFollow(FOLLOW_size_in_predefined628);
					size77=size();
					state._fsp--;

					adaptor.addChild(root_0, size77.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:58: inc
					{
					pushFollow(FOLLOW_inc_in_predefined630);
					inc78=inc();
					state._fsp--;

					adaptor.addChild(root_0, inc78.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:62: dec
					{
					pushFollow(FOLLOW_dec_in_predefined632);
					dec79=dec();
					state._fsp--;

					adaptor.addChild(root_0, dec79.getTree());

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:66: incl
					{
					pushFollow(FOLLOW_incl_in_predefined634);
					incl80=incl();
					state._fsp--;

					adaptor.addChild(root_0, incl80.getTree());

					}
					break;
				case 11 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:71: excl
					{
					pushFollow(FOLLOW_excl_in_predefined636);
					excl81=excl();
					state._fsp--;

					adaptor.addChild(root_0, excl81.getTree());

					}
					break;
				case 12 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:76: copy
					{
					pushFollow(FOLLOW_copy_in_predefined638);
					copy82=copy();
					state._fsp--;

					adaptor.addChild(root_0, copy82.getTree());

					}
					break;
				case 13 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:81: neW
					{
					pushFollow(FOLLOW_neW_in_predefined640);
					neW83=neW();
					state._fsp--;

					adaptor.addChild(root_0, neW83.getTree());

					}
					break;
				case 14 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:85: halt
					{
					pushFollow(FOLLOW_halt_in_predefined642);
					halt84=halt();
					state._fsp--;

					adaptor.addChild(root_0, halt84.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predefined"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:36:1: number : ( INTEGER | REAL );
	public final OberonParser.number_return number() throws RecognitionException {
		OberonParser.number_return retval = new OberonParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set85=null;

		Object set85_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:36:23: ( INTEGER | REAL )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set85=input.LT(1);
			if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set85));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"


	public static class identdef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identdef"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:1: identdef : IDENT ( '*' )? ;
	public final OberonParser.identdef_return identdef() throws RecognitionException {
		OberonParser.identdef_return retval = new OberonParser.identdef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT86=null;
		Token char_literal87=null;

		Object IDENT86_tree=null;
		Object char_literal87_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:23: ( IDENT ( '*' )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:25: IDENT ( '*' )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT86=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef694); 
			IDENT86_tree = (Object)adaptor.create(IDENT86);
			adaptor.addChild(root_0, IDENT86_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:31: ( '*' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==28) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:31: '*'
					{
					char_literal87=(Token)match(input,28,FOLLOW_28_in_identdef696); 
					char_literal87_tree = (Object)adaptor.create(char_literal87);
					adaptor.addChild(root_0, char_literal87_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identdef"


	public static class constantDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:1: constantDeclaration : identdef '=' constExpression -> ^( '=' identdef constExpression ) ;
	public final OberonParser.constantDeclaration_return constantDeclaration() throws RecognitionException {
		OberonParser.constantDeclaration_return retval = new OberonParser.constantDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal89=null;
		ParserRuleReturnScope identdef88 =null;
		ParserRuleReturnScope constExpression90 =null;

		Object char_literal89_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:23: ( identdef '=' constExpression -> ^( '=' identdef constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:25: identdef '=' constExpression
			{
			pushFollow(FOLLOW_identdef_in_constantDeclaration707);
			identdef88=identdef();
			state._fsp--;

			stream_identdef.add(identdef88.getTree());
			char_literal89=(Token)match(input,40,FOLLOW_40_in_constantDeclaration709);  
			stream_40.add(char_literal89);

			pushFollow(FOLLOW_constExpression_in_constantDeclaration711);
			constExpression90=constExpression();
			state._fsp--;

			stream_constExpression.add(constExpression90.getTree());
			// AST REWRITE
			// elements: constExpression, identdef, 40
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:59: -> ^( '=' identdef constExpression )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:62: ^( '=' identdef constExpression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_40.nextNode(), root_1);
				adaptor.addChild(root_1, stream_identdef.nextTree());
				adaptor.addChild(root_1, stream_constExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantDeclaration"


	public static class constExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constExpression"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:42:1: constExpression : expression ;
	public final OberonParser.constExpression_return constExpression() throws RecognitionException {
		OberonParser.constExpression_return retval = new OberonParser.constExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression91 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:42:23: ( expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:42:25: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constExpression741);
			expression91=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression91.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constExpression"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:1: typeDeclaration : identdef '=' type -> ^( TYPE_DECL identdef type ) ;
	public final OberonParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		OberonParser.typeDeclaration_return retval = new OberonParser.typeDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal93=null;
		ParserRuleReturnScope identdef92 =null;
		ParserRuleReturnScope type94 =null;

		Object char_literal93_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:23: ( identdef '=' type -> ^( TYPE_DECL identdef type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:25: identdef '=' type
			{
			pushFollow(FOLLOW_identdef_in_typeDeclaration755);
			identdef92=identdef();
			state._fsp--;

			stream_identdef.add(identdef92.getTree());
			char_literal93=(Token)match(input,40,FOLLOW_40_in_typeDeclaration757);  
			stream_40.add(char_literal93);

			pushFollow(FOLLOW_type_in_typeDeclaration759);
			type94=type();
			state._fsp--;

			stream_type.add(type94.getTree());
			// AST REWRITE
			// elements: identdef, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:59: -> ^( TYPE_DECL identdef type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:62: ^( TYPE_DECL identdef type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);
				adaptor.addChild(root_1, stream_identdef.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:1: type : ( qualident | arrayType | recordType | pointerType | procedureType );
	public final OberonParser.type_return type() throws RecognitionException {
		OberonParser.type_return retval = new OberonParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident95 =null;
		ParserRuleReturnScope arrayType96 =null;
		ParserRuleReturnScope recordType97 =null;
		ParserRuleReturnScope pointerType98 =null;
		ParserRuleReturnScope procedureType99 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:23: ( qualident | arrayType | recordType | pointerType | procedureType )
			int alt8=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt8=1;
				}
				break;
			case 44:
				{
				alt8=2;
				}
				break;
			case 78:
				{
				alt8=3;
				}
				break;
			case 76:
				{
				alt8=4;
				}
				break;
			case 77:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:25: qualident
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualident_in_type811);
					qualident95=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident95.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:37: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type815);
					arrayType96=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType96.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:49: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type819);
					recordType97=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType97.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:62: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type823);
					pointerType98=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType98.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:76: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type827);
					procedureType99=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType99.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class arrayType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:1: arrayType : 'ARRAY' length ( ',' length )* 'OF' type ;
	public final OberonParser.arrayType_return arrayType() throws RecognitionException {
		OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal100=null;
		Token char_literal102=null;
		Token string_literal104=null;
		ParserRuleReturnScope length101 =null;
		ParserRuleReturnScope length103 =null;
		ParserRuleReturnScope type105 =null;

		Object string_literal100_tree=null;
		Object char_literal102_tree=null;
		Object string_literal104_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:23: ( 'ARRAY' length ( ',' length )* 'OF' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:25: 'ARRAY' length ( ',' length )* 'OF' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal100=(Token)match(input,44,FOLLOW_44_in_arrayType847); 
			string_literal100_tree = (Object)adaptor.create(string_literal100);
			adaptor.addChild(root_0, string_literal100_tree);

			pushFollow(FOLLOW_length_in_arrayType849);
			length101=length();
			state._fsp--;

			adaptor.addChild(root_0, length101.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:40: ( ',' length )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==30) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:41: ',' length
					{
					char_literal102=(Token)match(input,30,FOLLOW_30_in_arrayType852); 
					char_literal102_tree = (Object)adaptor.create(char_literal102);
					adaptor.addChild(root_0, char_literal102_tree);

					pushFollow(FOLLOW_length_in_arrayType854);
					length103=length();
					state._fsp--;

					adaptor.addChild(root_0, length103.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			string_literal104=(Token)match(input,74,FOLLOW_74_in_arrayType858); 
			string_literal104_tree = (Object)adaptor.create(string_literal104);
			adaptor.addChild(root_0, string_literal104_tree);

			pushFollow(FOLLOW_type_in_arrayType860);
			type105=type();
			state._fsp--;

			adaptor.addChild(root_0, type105.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class length_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "length"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:1: length : constExpression ;
	public final OberonParser.length_return length() throws RecognitionException {
		OberonParser.length_return retval = new OberonParser.length_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constExpression106 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:23: ( constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:25: constExpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_length883);
			constExpression106=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression106.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "length"


	public static class recordType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "recordType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:1: recordType : 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' -> ^( 'RECORD' ( baseType )? fieldListSequence ) ;
	public final OberonParser.recordType_return recordType() throws RecognitionException {
		OberonParser.recordType_return retval = new OberonParser.recordType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		Token string_literal112=null;
		ParserRuleReturnScope baseType109 =null;
		ParserRuleReturnScope fieldListSequence111 =null;

		Object string_literal107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		Object string_literal112_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
		RewriteRuleSubtreeStream stream_fieldListSequence=new RewriteRuleSubtreeStream(adaptor,"rule fieldListSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:23: ( 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' -> ^( 'RECORD' ( baseType )? fieldListSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:25: 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END'
			{
			string_literal107=(Token)match(input,78,FOLLOW_78_in_recordType902);  
			stream_78.add(string_literal107);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:34: ( '(' baseType ')' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==26) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:35: '(' baseType ')'
					{
					char_literal108=(Token)match(input,26,FOLLOW_26_in_recordType905);  
					stream_26.add(char_literal108);

					pushFollow(FOLLOW_baseType_in_recordType907);
					baseType109=baseType();
					state._fsp--;

					stream_baseType.add(baseType109.getTree());
					char_literal110=(Token)match(input,27,FOLLOW_27_in_recordType909);  
					stream_27.add(char_literal110);

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType913);
			fieldListSequence111=fieldListSequence();
			state._fsp--;

			stream_fieldListSequence.add(fieldListSequence111.getTree());
			string_literal112=(Token)match(input,55,FOLLOW_55_in_recordType915);  
			stream_55.add(string_literal112);

			// AST REWRITE
			// elements: fieldListSequence, 78, baseType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:78: -> ^( 'RECORD' ( baseType )? fieldListSequence )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:81: ^( 'RECORD' ( baseType )? fieldListSequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_78.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:92: ( baseType )?
				if ( stream_baseType.hasNext() ) {
					adaptor.addChild(root_1, stream_baseType.nextTree());
				}
				stream_baseType.reset();

				adaptor.addChild(root_1, stream_fieldListSequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordType"


	public static class baseType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "baseType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:54:1: baseType : qualident ;
	public final OberonParser.baseType_return baseType() throws RecognitionException {
		OberonParser.baseType_return retval = new OberonParser.baseType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident113 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:54:23: ( qualident )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:54:25: qualident
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_baseType947);
			qualident113=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident113.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseType"


	public static class fieldListSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldListSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:1: fieldListSequence : fieldList ( ';' ! fieldList )* ;
	public final OberonParser.fieldListSequence_return fieldListSequence() throws RecognitionException {
		OberonParser.fieldListSequence_return retval = new OberonParser.fieldListSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope fieldList114 =null;
		ParserRuleReturnScope fieldList116 =null;

		Object char_literal115_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:23: ( fieldList ( ';' ! fieldList )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:25: fieldList ( ';' ! fieldList )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fieldList_in_fieldListSequence959);
			fieldList114=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList114.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:35: ( ';' ! fieldList )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==37) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:36: ';' ! fieldList
					{
					char_literal115=(Token)match(input,37,FOLLOW_37_in_fieldListSequence962); 
					pushFollow(FOLLOW_fieldList_in_fieldListSequence965);
					fieldList116=fieldList();
					state._fsp--;

					adaptor.addChild(root_0, fieldList116.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldListSequence"


	public static class fieldList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:1: fieldList : ( identList ':' ^ type )? ;
	public final OberonParser.fieldList_return fieldList() throws RecognitionException {
		OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope identList117 =null;
		ParserRuleReturnScope type119 =null;

		Object char_literal118_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:23: ( ( identList ':' ^ type )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:25: ( identList ':' ^ type )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:25: ( identList ':' ^ type )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:26: identList ':' ^ type
					{
					pushFollow(FOLLOW_identList_in_fieldList989);
					identList117=identList();
					state._fsp--;

					adaptor.addChild(root_0, identList117.getTree());

					char_literal118=(Token)match(input,35,FOLLOW_35_in_fieldList991); 
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					root_0 = (Object)adaptor.becomeRoot(char_literal118_tree, root_0);

					pushFollow(FOLLOW_type_in_fieldList994);
					type119=type();
					state._fsp--;

					adaptor.addChild(root_0, type119.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldList"


	public static class identList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:1: identList : identdef ( ',' identdef )* ;
	public final OberonParser.identList_return identList() throws RecognitionException {
		OberonParser.identList_return retval = new OberonParser.identList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope identdef120 =null;
		ParserRuleReturnScope identdef122 =null;

		Object char_literal121_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:23: ( identdef ( ',' identdef )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:25: identdef ( ',' identdef )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_identList1016);
			identdef120=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef120.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:34: ( ',' identdef )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==30) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:35: ',' identdef
					{
					char_literal121=(Token)match(input,30,FOLLOW_30_in_identList1019); 
					char_literal121_tree = (Object)adaptor.create(char_literal121);
					adaptor.addChild(root_0, char_literal121_tree);

					pushFollow(FOLLOW_identdef_in_identList1021);
					identdef122=identdef();
					state._fsp--;

					adaptor.addChild(root_0, identdef122.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identList"


	public static class pointerType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pointerType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:1: pointerType : 'POINTER TO' ^ type ;
	public final OberonParser.pointerType_return pointerType() throws RecognitionException {
		OberonParser.pointerType_return retval = new OberonParser.pointerType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal123=null;
		ParserRuleReturnScope type124 =null;

		Object string_literal123_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:23: ( 'POINTER TO' ^ type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:25: 'POINTER TO' ^ type
			{
			root_0 = (Object)adaptor.nil();


			string_literal123=(Token)match(input,76,FOLLOW_76_in_pointerType1041); 
			string_literal123_tree = (Object)adaptor.create(string_literal123);
			root_0 = (Object)adaptor.becomeRoot(string_literal123_tree, root_0);

			pushFollow(FOLLOW_type_in_pointerType1044);
			type124=type();
			state._fsp--;

			adaptor.addChild(root_0, type124.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pointerType"


	public static class procedureType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:1: procedureType : 'PROCEDURE' ^ ( formalParameters )? ;
	public final OberonParser.procedureType_return procedureType() throws RecognitionException {
		OberonParser.procedureType_return retval = new OberonParser.procedureType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal125=null;
		ParserRuleReturnScope formalParameters126 =null;

		Object string_literal125_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:23: ( 'PROCEDURE' ^ ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:25: 'PROCEDURE' ^ ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal125=(Token)match(input,77,FOLLOW_77_in_procedureType1060); 
			string_literal125_tree = (Object)adaptor.create(string_literal125);
			root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:38: ( formalParameters )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==26) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:38: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureType1063);
					formalParameters126=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters126.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureType"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:1: variableDeclaration : identList ':' type -> ^( DECLARE identList type ) ;
	public final OberonParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		OberonParser.variableDeclaration_return retval = new OberonParser.variableDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal128=null;
		ParserRuleReturnScope identList127 =null;
		ParserRuleReturnScope type129 =null;

		Object char_literal128_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:23: ( identList ':' type -> ^( DECLARE identList type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:25: identList ':' type
			{
			pushFollow(FOLLOW_identList_in_variableDeclaration1074);
			identList127=identList();
			state._fsp--;

			stream_identList.add(identList127.getTree());
			char_literal128=(Token)match(input,35,FOLLOW_35_in_variableDeclaration1076);  
			stream_35.add(char_literal128);

			pushFollow(FOLLOW_type_in_variableDeclaration1078);
			type129=type();
			state._fsp--;

			stream_type.add(type129.getTree());
			// AST REWRITE
			// elements: type, identList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:44: -> ^( DECLARE identList type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:47: ^( DECLARE identList type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARE, "DECLARE"), root_1);
				adaptor.addChild(root_1, stream_identList.nextTree());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class qualident_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualident"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:1: qualident : ( options {greedy=true; } : IDENT '.' )? IDENT -> ^( ID ( IDENT )* ) ;
	public final OberonParser.qualident_return qualident() throws RecognitionException {
		OberonParser.qualident_return retval = new OberonParser.qualident_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT130=null;
		Token char_literal131=null;
		Token IDENT132=null;

		Object IDENT130_tree=null;
		Object char_literal131_tree=null;
		Object IDENT132_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:23: ( ( options {greedy=true; } : IDENT '.' )? IDENT -> ^( ID ( IDENT )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:25: ( options {greedy=true; } : IDENT '.' )? IDENT
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:25: ( options {greedy=true; } : IDENT '.' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==IDENT) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==32) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==IDENT) ) {
						alt15=1;
					}
				}
			}
			switch (alt15) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:49: IDENT '.'
					{
					IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1117);  
					stream_IDENT.add(IDENT130);

					char_literal131=(Token)match(input,32,FOLLOW_32_in_qualident1119);  
					stream_32.add(char_literal131);

					}
					break;

			}

			IDENT132=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1123);  
			stream_IDENT.add(IDENT132);

			// AST REWRITE
			// elements: IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:67: -> ^( ID ( IDENT )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:70: ^( ID ( IDENT )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:75: ( IDENT )*
				while ( stream_IDENT.hasNext() ) {
					adaptor.addChild(root_1, stream_IDENT.nextNode());
				}
				stream_IDENT.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualident"


	public static class designator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "designator"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:1: designator : qualident ( '.' IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )* ;
	public final OberonParser.designator_return designator() throws RecognitionException {
		OberonParser.designator_return retval = new OberonParser.designator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal134=null;
		Token IDENT135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		Token char_literal139=null;
		Token char_literal141=null;
		Token char_literal142=null;
		ParserRuleReturnScope qualident133 =null;
		ParserRuleReturnScope expList137 =null;
		ParserRuleReturnScope qualident140 =null;

		Object char_literal134_tree=null;
		Object IDENT135_tree=null;
		Object char_literal136_tree=null;
		Object char_literal138_tree=null;
		Object char_literal139_tree=null;
		Object char_literal141_tree=null;
		Object char_literal142_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:23: ( qualident ( '.' IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:25: qualident ( '.' IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_designator1151);
			qualident133=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident133.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:35: ( '.' IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )*
			loop16:
			while (true) {
				int alt16=5;
				switch ( input.LA(1) ) {
				case 26:
					{
					int LA16_1 = input.LA(2);
					if ( (LA16_1==IDENT) ) {
						int LA16_6 = input.LA(3);
						if ( (LA16_6==32) ) {
							int LA16_7 = input.LA(4);
							if ( (LA16_7==IDENT) ) {
								int LA16_9 = input.LA(5);
								if ( (LA16_9==27) ) {
									alt16=3;
								}

							}

						}
						else if ( (LA16_6==27) ) {
							alt16=3;
						}

					}

					}
					break;
				case 32:
					{
					alt16=1;
					}
					break;
				case 88:
					{
					alt16=2;
					}
					break;
				case 90:
					{
					alt16=4;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:36: '.' IDENT
					{
					char_literal134=(Token)match(input,32,FOLLOW_32_in_designator1154); 
					char_literal134_tree = (Object)adaptor.create(char_literal134);
					adaptor.addChild(root_0, char_literal134_tree);

					IDENT135=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator1156); 
					IDENT135_tree = (Object)adaptor.create(IDENT135);
					adaptor.addChild(root_0, IDENT135_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:48: '[' ! expList ']' !
					{
					char_literal136=(Token)match(input,88,FOLLOW_88_in_designator1160); 
					pushFollow(FOLLOW_expList_in_designator1163);
					expList137=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList137.getTree());

					char_literal138=(Token)match(input,89,FOLLOW_89_in_designator1165); 
					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:68: '(' ! qualident ')' !
					{
					char_literal139=(Token)match(input,26,FOLLOW_26_in_designator1170); 
					pushFollow(FOLLOW_qualident_in_designator1173);
					qualident140=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident140.getTree());

					char_literal141=(Token)match(input,27,FOLLOW_27_in_designator1175); 
					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:90: '^'
					{
					char_literal142=(Token)match(input,90,FOLLOW_90_in_designator1180); 
					char_literal142_tree = (Object)adaptor.create(char_literal142);
					adaptor.addChild(root_0, char_literal142_tree);

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "designator"


	public static class expList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:72:1: expList : expression ( ',' expression )* ;
	public final OberonParser.expList_return expList() throws RecognitionException {
		OberonParser.expList_return retval = new OberonParser.expList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope expression145 =null;

		Object char_literal144_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:72:23: ( expression ( ',' expression )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:72:25: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expList1204);
			expression143=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression143.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:72:36: ( ',' expression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==30) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:72:37: ',' expression
					{
					char_literal144=(Token)match(input,30,FOLLOW_30_in_expList1207); 
					char_literal144_tree = (Object)adaptor.create(char_literal144);
					adaptor.addChild(root_0, char_literal144_tree);

					pushFollow(FOLLOW_expression_in_expList1209);
					expression145=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression145.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:1: expression : simpleExpression ( relation ^ simpleExpression )? ;
	public final OberonParser.expression_return expression() throws RecognitionException {
		OberonParser.expression_return retval = new OberonParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleExpression146 =null;
		ParserRuleReturnScope relation147 =null;
		ParserRuleReturnScope simpleExpression148 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:23: ( simpleExpression ( relation ^ simpleExpression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:25: simpleExpression ( relation ^ simpleExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleExpression_in_expression1230);
			simpleExpression146=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression146.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:42: ( relation ^ simpleExpression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==24||(LA18_0 >= 38 && LA18_0 <= 42)||LA18_0==61||LA18_0==64) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:43: relation ^ simpleExpression
					{
					pushFollow(FOLLOW_relation_in_expression1233);
					relation147=relation();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(relation147.getTree(), root_0);
					pushFollow(FOLLOW_simpleExpression_in_expression1236);
					simpleExpression148=simpleExpression();
					state._fsp--;

					adaptor.addChild(root_0, simpleExpression148.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class relation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:76:1: relation : ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' );
	public final OberonParser.relation_return relation() throws RecognitionException {
		OberonParser.relation_return retval = new OberonParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set149=null;

		Object set149_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:76:23: ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set149=input.LT(1);
			if ( input.LA(1)==24||(input.LA(1) >= 38 && input.LA(1) <= 42)||input.LA(1)==61||input.LA(1)==64 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set149));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class simpleExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleExpression"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:1: simpleExpression : ( '+' | '-' )? term ( addOperator ^ term )* ;
	public final OberonParser.simpleExpression_return simpleExpression() throws RecognitionException {
		OberonParser.simpleExpression_return retval = new OberonParser.simpleExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set150=null;
		ParserRuleReturnScope term151 =null;
		ParserRuleReturnScope addOperator152 =null;
		ParserRuleReturnScope term153 =null;

		Object set150_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:23: ( ( '+' | '-' )? term ( addOperator ^ term )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:25: ( '+' | '-' )? term ( addOperator ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:25: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==29||LA19_0==31) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					set150=input.LT(1);
					if ( input.LA(1)==29||input.LA(1)==31 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set150));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_term_in_simpleExpression1295);
			term151=term();
			state._fsp--;

			adaptor.addChild(root_0, term151.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:41: ( addOperator ^ term )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==29||LA20_0==31||LA20_0==75) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:78:42: addOperator ^ term
					{
					pushFollow(FOLLOW_addOperator_in_simpleExpression1298);
					addOperator152=addOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addOperator152.getTree(), root_0);
					pushFollow(FOLLOW_term_in_simpleExpression1301);
					term153=term();
					state._fsp--;

					adaptor.addChild(root_0, term153.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleExpression"


	public static class addOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addOperator"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:80:1: addOperator : ( '+' | '-' | 'OR' );
	public final OberonParser.addOperator_return addOperator() throws RecognitionException {
		OberonParser.addOperator_return retval = new OberonParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set154=null;

		Object set154_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:80:23: ( '+' | '-' | 'OR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set154=input.LT(1);
			if ( input.LA(1)==29||input.LA(1)==31||input.LA(1)==75 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set154));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addOperator"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:82:1: term : factor ( mulOperator ^ factor )* ;
	public final OberonParser.term_return term() throws RecognitionException {
		OberonParser.term_return retval = new OberonParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor155 =null;
		ParserRuleReturnScope mulOperator156 =null;
		ParserRuleReturnScope factor157 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:82:23: ( factor ( mulOperator ^ factor )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:82:25: factor ( mulOperator ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term1354);
			factor155=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor155.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:82:32: ( mulOperator ^ factor )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==25||LA21_0==28||LA21_0==34||LA21_0==51||LA21_0==69) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:82:33: mulOperator ^ factor
					{
					pushFollow(FOLLOW_mulOperator_in_term1357);
					mulOperator156=mulOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(mulOperator156.getTree(), root_0);
					pushFollow(FOLLOW_factor_in_term1360);
					factor157=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor157.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class mulOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulOperator"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:84:1: mulOperator : ( '*' | '/' | 'DIV' | 'MOD' | '&' );
	public final OberonParser.mulOperator_return mulOperator() throws RecognitionException {
		OberonParser.mulOperator_return retval = new OberonParser.mulOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set158=null;

		Object set158_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:84:23: ( '*' | '/' | 'DIV' | 'MOD' | '&' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set158=input.LT(1);
			if ( input.LA(1)==25||input.LA(1)==28||input.LA(1)==34||input.LA(1)==51||input.LA(1)==69 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set158));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulOperator"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:1: factor : ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' ! expression ^ ')' !| '~' factor );
	public final OberonParser.factor_return factor() throws RecognitionException {
		OberonParser.factor_return retval = new OberonParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARCONST160=null;
		Token STRING161=null;
		Token string_literal162=null;
		Token char_literal166=null;
		Token char_literal168=null;
		Token char_literal169=null;
		ParserRuleReturnScope number159 =null;
		ParserRuleReturnScope set163 =null;
		ParserRuleReturnScope designator164 =null;
		ParserRuleReturnScope actualParameters165 =null;
		ParserRuleReturnScope expression167 =null;
		ParserRuleReturnScope factor170 =null;

		Object CHARCONST160_tree=null;
		Object STRING161_tree=null;
		Object string_literal162_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		Object char_literal169_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:23: ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' ! expression ^ ')' !| '~' factor )
			int alt23=8;
			switch ( input.LA(1) ) {
			case INTEGER:
			case REAL:
				{
				alt23=1;
				}
				break;
			case CHARCONST:
				{
				alt23=2;
				}
				break;
			case STRING:
				{
				alt23=3;
				}
				break;
			case 72:
				{
				alt23=4;
				}
				break;
			case 92:
				{
				alt23=5;
				}
				break;
			case IDENT:
				{
				alt23=6;
				}
				break;
			case 26:
				{
				alt23=7;
				}
				break;
			case 95:
				{
				alt23=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:25: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor1411);
					number159=number();
					state._fsp--;

					adaptor.addChild(root_0, number159.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:34: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST160=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor1415); 
					CHARCONST160_tree = (Object)adaptor.create(CHARCONST160);
					adaptor.addChild(root_0, CHARCONST160_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:46: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING161=(Token)match(input,STRING,FOLLOW_STRING_in_factor1419); 
					STRING161_tree = (Object)adaptor.create(STRING161);
					adaptor.addChild(root_0, STRING161_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:55: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal162=(Token)match(input,72,FOLLOW_72_in_factor1423); 
					string_literal162_tree = (Object)adaptor.create(string_literal162);
					adaptor.addChild(root_0, string_literal162_tree);

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:63: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor1427);
					set163=set();
					state._fsp--;

					adaptor.addChild(root_0, set163.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:69: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor1431);
					designator164=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator164.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:80: ( actualParameters )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==26) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:80: actualParameters
							{
							pushFollow(FOLLOW_actualParameters_in_factor1433);
							actualParameters165=actualParameters();
							state._fsp--;

							adaptor.addChild(root_0, actualParameters165.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:100: '(' ! expression ^ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal166=(Token)match(input,26,FOLLOW_26_in_factor1438); 
					pushFollow(FOLLOW_expression_in_factor1441);
					expression167=expression();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(expression167.getTree(), root_0);
					char_literal168=(Token)match(input,27,FOLLOW_27_in_factor1444); 
					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:124: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal169=(Token)match(input,95,FOLLOW_95_in_factor1449); 
					char_literal169_tree = (Object)adaptor.create(char_literal169);
					adaptor.addChild(root_0, char_literal169_tree);

					pushFollow(FOLLOW_factor_in_factor1451);
					factor170=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor170.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class set_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "set"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:1: set : '{' ( element ( ',' element )* )? '}' ;
	public final OberonParser.set_return set() throws RecognitionException {
		OberonParser.set_return retval = new OberonParser.set_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		Token char_literal173=null;
		Token char_literal175=null;
		ParserRuleReturnScope element172 =null;
		ParserRuleReturnScope element174 =null;

		Object char_literal171_tree=null;
		Object char_literal173_tree=null;
		Object char_literal175_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:23: ( '{' ( element ( ',' element )* )? '}' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:25: '{' ( element ( ',' element )* )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal171=(Token)match(input,92,FOLLOW_92_in_set1477); 
			char_literal171_tree = (Object)adaptor.create(char_literal171);
			adaptor.addChild(root_0, char_literal171_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:29: ( element ( ',' element )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==CHARCONST||(LA25_0 >= IDENT && LA25_0 <= INTEGER)||LA25_0==REAL||LA25_0==STRING||LA25_0==26||LA25_0==29||LA25_0==31||LA25_0==72||LA25_0==92||LA25_0==95) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:30: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set1480);
					element172=element();
					state._fsp--;

					adaptor.addChild(root_0, element172.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:38: ( ',' element )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==30) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:39: ',' element
							{
							char_literal173=(Token)match(input,30,FOLLOW_30_in_set1483); 
							char_literal173_tree = (Object)adaptor.create(char_literal173);
							adaptor.addChild(root_0, char_literal173_tree);

							pushFollow(FOLLOW_element_in_set1485);
							element174=element();
							state._fsp--;

							adaptor.addChild(root_0, element174.getTree());

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			char_literal175=(Token)match(input,94,FOLLOW_94_in_set1492); 
			char_literal175_tree = (Object)adaptor.create(char_literal175);
			adaptor.addChild(root_0, char_literal175_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set"


	public static class element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "element"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:1: element : expression ( '..' expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal177=null;
		ParserRuleReturnScope expression176 =null;
		ParserRuleReturnScope expression178 =null;

		Object string_literal177_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:23: ( expression ( '..' expression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:25: expression ( '..' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element1514);
			expression176=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression176.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:36: ( '..' expression )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==33) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:38: '..' expression
					{
					string_literal177=(Token)match(input,33,FOLLOW_33_in_element1518); 
					string_literal177_tree = (Object)adaptor.create(string_literal177);
					adaptor.addChild(root_0, string_literal177_tree);

					pushFollow(FOLLOW_expression_in_element1520);
					expression178=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression178.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class actualParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actualParameters"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:1: actualParameters : '(' ! ( expList )? ')' !;
	public final OberonParser.actualParameters_return actualParameters() throws RecognitionException {
		OberonParser.actualParameters_return retval = new OberonParser.actualParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal179=null;
		Token char_literal181=null;
		ParserRuleReturnScope expList180 =null;

		Object char_literal179_tree=null;
		Object char_literal181_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:23: ( '(' ! ( expList )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:25: '(' ! ( expList )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal179=(Token)match(input,26,FOLLOW_26_in_actualParameters1535); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:30: ( expList )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==CHARCONST||(LA27_0 >= IDENT && LA27_0 <= INTEGER)||LA27_0==REAL||LA27_0==STRING||LA27_0==26||LA27_0==29||LA27_0==31||LA27_0==72||LA27_0==92||LA27_0==95) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:30: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters1538);
					expList180=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList180.getTree());

					}
					break;

			}

			char_literal181=(Token)match(input,27,FOLLOW_27_in_actualParameters1541); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualParameters"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:1: statement : ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? ;
	public final OberonParser.statement_return statement() throws RecognitionException {
		OberonParser.statement_return retval = new OberonParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal190=null;
		Token string_literal191=null;
		ParserRuleReturnScope predefined182 =null;
		ParserRuleReturnScope statement2183 =null;
		ParserRuleReturnScope ifStatement184 =null;
		ParserRuleReturnScope caseStatement185 =null;
		ParserRuleReturnScope whileStatement186 =null;
		ParserRuleReturnScope repeatStatement187 =null;
		ParserRuleReturnScope loopStatement188 =null;
		ParserRuleReturnScope withStatement189 =null;
		ParserRuleReturnScope expression192 =null;

		Object string_literal190_tree=null;
		Object string_literal191_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:23: ( ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:26: ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:26: ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			int alt29=11;
			switch ( input.LA(1) ) {
				case 43:
				case 45:
				case 47:
				case 49:
				case 50:
				case 56:
				case 58:
				case 62:
				case 63:
				case 65:
				case 67:
				case 68:
				case 71:
				case 73:
				case 81:
				case 92:
					{
					alt29=1;
					}
					break;
				case IDENT:
					{
					alt29=2;
					}
					break;
				case 59:
					{
					alt29=3;
					}
					break;
				case 91:
					{
					alt29=4;
					}
					break;
				case 86:
					{
					alt29=5;
					}
					break;
				case 79:
					{
					alt29=6;
					}
					break;
				case 66:
					{
					alt29=7;
					}
					break;
				case 87:
					{
					alt29=8;
					}
					break;
				case 57:
					{
					alt29=9;
					}
					break;
				case 80:
					{
					alt29=10;
					}
					break;
			}
			switch (alt29) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:27: predefined
					{
					pushFollow(FOLLOW_predefined_in_statement1564);
					predefined182=predefined();
					state._fsp--;

					adaptor.addChild(root_0, predefined182.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:38: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement1566);
					statement2183=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement2183.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:49: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement1568);
					ifStatement184=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement184.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:61: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement1570);
					caseStatement185=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement185.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:75: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement1572);
					whileStatement186=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement186.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:90: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement1574);
					repeatStatement187=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement187.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:106: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement1576);
					loopStatement188=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement188.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:120: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement1578);
					withStatement189=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement189.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:135: 'EXIT'
					{
					string_literal190=(Token)match(input,57,FOLLOW_57_in_statement1581); 
					string_literal190_tree = (Object)adaptor.create(string_literal190);
					adaptor.addChild(root_0, string_literal190_tree);

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:144: 'RETURN' ( expression )?
					{
					string_literal191=(Token)match(input,80,FOLLOW_80_in_statement1585); 
					string_literal191_tree = (Object)adaptor.create(string_literal191);
					adaptor.addChild(root_0, string_literal191_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:153: ( expression )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==CHARCONST||(LA28_0 >= IDENT && LA28_0 <= INTEGER)||LA28_0==REAL||LA28_0==STRING||LA28_0==26||LA28_0==29||LA28_0==31||LA28_0==72||LA28_0==92||LA28_0==95) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:153: expression
							{
							pushFollow(FOLLOW_expression_in_statement1587);
							expression192=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression192.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class statement2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement2"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:1: statement2 : designator ( ( ':=' expression ) | procedureCall ) -> ^( ASSIGN designator ( expression )? ( procedureCall )? ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal194=null;
		ParserRuleReturnScope designator193 =null;
		ParserRuleReturnScope expression195 =null;
		ParserRuleReturnScope procedureCall196 =null;

		Object string_literal194_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_designator=new RewriteRuleSubtreeStream(adaptor,"rule designator");
		RewriteRuleSubtreeStream stream_procedureCall=new RewriteRuleSubtreeStream(adaptor,"rule procedureCall");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:23: ( designator ( ( ':=' expression ) | procedureCall ) -> ^( ASSIGN designator ( expression )? ( procedureCall )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:25: designator ( ( ':=' expression ) | procedureCall )
			{
			pushFollow(FOLLOW_designator_in_statement21610);
			designator193=designator();
			state._fsp--;

			stream_designator.add(designator193.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:37: ( ( ':=' expression ) | procedureCall )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==36) ) {
				alt30=1;
			}
			else if ( (LA30_0==26||LA30_0==37||(LA30_0 >= 53 && LA30_0 <= 55)||LA30_0==84||LA30_0==93) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:38: ( ':=' expression )
					{
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:38: ( ':=' expression )
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:39: ':=' expression
					{
					string_literal194=(Token)match(input,36,FOLLOW_36_in_statement21615);  
					stream_36.add(string_literal194);

					pushFollow(FOLLOW_expression_in_statement21617);
					expression195=expression();
					state._fsp--;

					stream_expression.add(expression195.getTree());
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:58: procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement21622);
					procedureCall196=procedureCall();
					state._fsp--;

					stream_procedureCall.add(procedureCall196.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: designator, expression, procedureCall
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:73: -> ^( ASSIGN designator ( expression )? ( procedureCall )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:76: ^( ASSIGN designator ( expression )? ( procedureCall )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_designator.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:96: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:108: ( procedureCall )?
				if ( stream_procedureCall.hasNext() ) {
					adaptor.addChild(root_1, stream_procedureCall.nextTree());
				}
				stream_procedureCall.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement2"


	public static class procedureCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureCall"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:1: procedureCall : ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualParameters197 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:23: ( ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:26: ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:26: ( actualParameters )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==26) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:26: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall1656);
					actualParameters197=actualParameters();
					state._fsp--;

					adaptor.addChild(root_0, actualParameters197.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureCall"


	public static class statementSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statementSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:1: statementSequence : statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal199=null;
		ParserRuleReturnScope statement198 =null;
		ParserRuleReturnScope statement200 =null;

		Object char_literal199_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:23: ( statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:25: statement ( ';' statement )*
			{
			pushFollow(FOLLOW_statement_in_statementSequence1669);
			statement198=statement();
			state._fsp--;

			stream_statement.add(statement198.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:35: ( ';' statement )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==37) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:37: ';' statement
					{
					char_literal199=(Token)match(input,37,FOLLOW_37_in_statementSequence1673);  
					stream_37.add(char_literal199);

					pushFollow(FOLLOW_statement_in_statementSequence1675);
					statement200=statement();
					state._fsp--;

					stream_statement.add(statement200.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: statement, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:54: -> ^( BLOCK statement ( statement )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:57: ^( BLOCK statement ( statement )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_statement.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:75: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statementSequence"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:1: ifStatement : 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? ) ;
	public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
		OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal201=null;
		Token string_literal203=null;
		Token string_literal204=null;
		Token string_literal206=null;
		Token string_literal207=null;
		Token string_literal208=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope s3 =null;
		ParserRuleReturnScope expression202 =null;
		ParserRuleReturnScope expression205 =null;

		Object string_literal201_tree=null;
		Object string_literal203_tree=null;
		Object string_literal204_tree=null;
		Object string_literal206_tree=null;
		Object string_literal207_tree=null;
		Object string_literal208_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:23: ( 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:25: 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END'
			{
			string_literal201=(Token)match(input,59,FOLLOW_59_in_ifStatement1710);  
			stream_59.add(string_literal201);

			pushFollow(FOLLOW_expression_in_ifStatement1712);
			expression202=expression();
			state._fsp--;

			stream_expression.add(expression202.getTree());
			string_literal203=(Token)match(input,82,FOLLOW_82_in_ifStatement1714);  
			stream_82.add(string_literal203);

			pushFollow(FOLLOW_statementSequence_in_ifStatement1718);
			s1=statementSequence();
			state._fsp--;

			stream_statementSequence.add(s1.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:69: ( 'ELSIF' expression 'THEN' s2= statementSequence )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==54) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:70: 'ELSIF' expression 'THEN' s2= statementSequence
					{
					string_literal204=(Token)match(input,54,FOLLOW_54_in_ifStatement1721);  
					stream_54.add(string_literal204);

					pushFollow(FOLLOW_expression_in_ifStatement1723);
					expression205=expression();
					state._fsp--;

					stream_expression.add(expression205.getTree());
					string_literal206=(Token)match(input,82,FOLLOW_82_in_ifStatement1725);  
					stream_82.add(string_literal206);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1729);
					s2=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s2.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:119: ( 'ELSE' s3= statementSequence )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==53) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:120: 'ELSE' s3= statementSequence
					{
					string_literal207=(Token)match(input,53,FOLLOW_53_in_ifStatement1734);  
					stream_53.add(string_literal207);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1738);
					s3=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s3.getTree());
					}
					break;

			}

			string_literal208=(Token)match(input,55,FOLLOW_55_in_ifStatement1742);  
			stream_55.add(string_literal208);

			// AST REWRITE
			// elements: s3, 59, 54, expression, 53, s1, s2, expression
			// token labels: 
			// rule labels: retval, s2, s1, s3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);
			RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);
			RewriteRuleSubtreeStream stream_s3=new RewriteRuleSubtreeStream(adaptor,"rule s3",s3!=null?s3.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:23: -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:26: ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:33: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:46: ( $s1)?
				if ( stream_s1.hasNext() ) {
					adaptor.addChild(root_1, stream_s1.nextTree());
				}
				stream_s1.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:50: ( ^( 'ELSIF' ( expression )? ( $s2)? ) )*
				while ( stream_54.hasNext() ) {
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:50: ^( 'ELSIF' ( expression )? ( $s2)? )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_54.nextNode(), root_2);
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:60: ( expression )?
					if ( stream_expression.hasNext() ) {
						adaptor.addChild(root_2, stream_expression.nextTree());
					}
					stream_expression.reset();

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:74: ( $s2)?
					if ( stream_s2.hasNext() ) {
						adaptor.addChild(root_2, stream_s2.nextTree());
					}
					stream_s2.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_54.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:80: ( 'ELSE' ( $s3)? )?
				if ( stream_s3.hasNext()||stream_53.hasNext() ) {
					adaptor.addChild(root_1, stream_53.nextNode());
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:89: ( $s3)?
					if ( stream_s3.hasNext() ) {
						adaptor.addChild(root_1, stream_s3.nextTree());
					}
					stream_s3.reset();

				}
				stream_s3.reset();
				stream_53.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class caseStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) ;
	public final OberonParser.caseStatement_return caseStatement() throws RecognitionException {
		OberonParser.caseStatement_return retval = new OberonParser.caseStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal209=null;
		Token string_literal211=null;
		Token char_literal213=null;
		Token string_literal215=null;
		Token string_literal217=null;
		ParserRuleReturnScope expression210 =null;
		ParserRuleReturnScope casE212 =null;
		ParserRuleReturnScope casE214 =null;
		ParserRuleReturnScope statementSequence216 =null;

		Object string_literal209_tree=null;
		Object string_literal211_tree=null;
		Object char_literal213_tree=null;
		Object string_literal215_tree=null;
		Object string_literal217_tree=null;
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_casE=new RewriteRuleSubtreeStream(adaptor,"rule casE");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:25: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			string_literal209=(Token)match(input,91,FOLLOW_91_in_caseStatement1819);  
			stream_91.add(string_literal209);

			pushFollow(FOLLOW_expression_in_caseStatement1821);
			expression210=expression();
			state._fsp--;

			stream_expression.add(expression210.getTree());
			string_literal211=(Token)match(input,74,FOLLOW_74_in_caseStatement1823);  
			stream_74.add(string_literal211);

			pushFollow(FOLLOW_casE_in_caseStatement1825);
			casE212=casE();
			state._fsp--;

			stream_casE.add(casE212.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:53: ( '|' casE )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==93) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:54: '|' casE
					{
					char_literal213=(Token)match(input,93,FOLLOW_93_in_caseStatement1828);  
					stream_93.add(char_literal213);

					pushFollow(FOLLOW_casE_in_caseStatement1830);
					casE214=casE();
					state._fsp--;

					stream_casE.add(casE214.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:65: ( 'ELSE' statementSequence )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==53) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:66: 'ELSE' statementSequence
					{
					string_literal215=(Token)match(input,53,FOLLOW_53_in_caseStatement1835);  
					stream_53.add(string_literal215);

					pushFollow(FOLLOW_statementSequence_in_caseStatement1837);
					statementSequence216=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence216.getTree());
					}
					break;

			}

			string_literal217=(Token)match(input,55,FOLLOW_55_in_caseStatement1841);  
			stream_55.add(string_literal217);

			// AST REWRITE
			// elements: 74, 91, 53, casE, casE, statementSequence, 93, expression, 55
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:23: -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:106:26: ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_91.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_74.nextNode());
				adaptor.addChild(root_1, stream_casE.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:106:56: ( '|' casE )*
				while ( stream_casE.hasNext()||stream_93.hasNext() ) {
					adaptor.addChild(root_1, stream_93.nextNode());
					adaptor.addChild(root_1, stream_casE.nextTree());
				}
				stream_casE.reset();
				stream_93.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:106:68: ( 'ELSE' statementSequence )?
				if ( stream_53.hasNext()||stream_statementSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_53.nextNode());
					adaptor.addChild(root_1, stream_statementSequence.nextTree());
				}
				stream_53.reset();
				stream_statementSequence.reset();

				adaptor.addChild(root_1, stream_55.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseStatement"


	public static class casE_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "casE"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:108:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal219=null;
		ParserRuleReturnScope caseLabelList218 =null;
		ParserRuleReturnScope statementSequence220 =null;

		Object char_literal219_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:108:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:108:25: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:108:25: ( caseLabelList ':' statementSequence )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CHARCONST||(LA37_0 >= IDENT && LA37_0 <= INTEGER)||LA37_0==REAL||LA37_0==STRING||LA37_0==26||LA37_0==29||LA37_0==31||LA37_0==72||LA37_0==92||LA37_0==95) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:108:26: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE1918);
					caseLabelList218=caseLabelList();
					state._fsp--;

					adaptor.addChild(root_0, caseLabelList218.getTree());

					char_literal219=(Token)match(input,35,FOLLOW_35_in_casE1920); 
					char_literal219_tree = (Object)adaptor.create(char_literal219);
					adaptor.addChild(root_0, char_literal219_tree);

					pushFollow(FOLLOW_statementSequence_in_casE1922);
					statementSequence220=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence220.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "casE"


	public static class caseLabelList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabelList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal222=null;
		ParserRuleReturnScope caseLabels221 =null;
		ParserRuleReturnScope caseLabels223 =null;

		Object char_literal222_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:25: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList1940);
			caseLabels221=caseLabels();
			state._fsp--;

			adaptor.addChild(root_0, caseLabels221.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:36: ( ',' caseLabels )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==30) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:37: ',' caseLabels
					{
					char_literal222=(Token)match(input,30,FOLLOW_30_in_caseLabelList1943); 
					char_literal222_tree = (Object)adaptor.create(char_literal222);
					adaptor.addChild(root_0, char_literal222_tree);

					pushFollow(FOLLOW_caseLabels_in_caseLabelList1945);
					caseLabels223=caseLabels();
					state._fsp--;

					adaptor.addChild(root_0, caseLabels223.getTree());

					}
					break;

				default :
					break loop38;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseLabelList"


	public static class caseLabels_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseLabels"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal225=null;
		ParserRuleReturnScope constExpression224 =null;
		ParserRuleReturnScope constExpression226 =null;

		Object string_literal225_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:25: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels1966);
			constExpression224=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression224.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:41: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:42: '..' constExpression
			{
			string_literal225=(Token)match(input,33,FOLLOW_33_in_caseLabels1969); 
			string_literal225_tree = (Object)adaptor.create(string_literal225);
			adaptor.addChild(root_0, string_literal225_tree);

			pushFollow(FOLLOW_constExpression_in_caseLabels1971);
			constExpression226=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression226.getTree());

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseLabels"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) ;
	public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
		OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal227=null;
		Token string_literal229=null;
		Token string_literal231=null;
		ParserRuleReturnScope expression228 =null;
		ParserRuleReturnScope statementSequence230 =null;

		Object string_literal227_tree=null;
		Object string_literal229_tree=null;
		Object string_literal231_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:23: ( 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:25: 'WHILE' expression 'DO' statementSequence 'END'
			{
			string_literal227=(Token)match(input,86,FOLLOW_86_in_whileStatement1987);  
			stream_86.add(string_literal227);

			pushFollow(FOLLOW_expression_in_whileStatement1989);
			expression228=expression();
			state._fsp--;

			stream_expression.add(expression228.getTree());
			string_literal229=(Token)match(input,52,FOLLOW_52_in_whileStatement1991);  
			stream_52.add(string_literal229);

			pushFollow(FOLLOW_statementSequence_in_whileStatement1993);
			statementSequence230=statementSequence();
			state._fsp--;

			stream_statementSequence.add(statementSequence230.getTree());
			string_literal231=(Token)match(input,55,FOLLOW_55_in_whileStatement1995);  
			stream_55.add(string_literal231);

			// AST REWRITE
			// elements: statementSequence, 86, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:73: -> ^( 'WHILE' expression statementSequence )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:76: ^( 'WHILE' expression statementSequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_86.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_statementSequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class repeatStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "repeatStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:1: repeatStatement : 'REPEAT' ^ statementSequence 'UNTIL' ! expression ;
	public final OberonParser.repeatStatement_return repeatStatement() throws RecognitionException {
		OberonParser.repeatStatement_return retval = new OberonParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal232=null;
		Token string_literal234=null;
		ParserRuleReturnScope statementSequence233 =null;
		ParserRuleReturnScope expression235 =null;

		Object string_literal232_tree=null;
		Object string_literal234_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:23: ( 'REPEAT' ^ statementSequence 'UNTIL' ! expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:25: 'REPEAT' ^ statementSequence 'UNTIL' ! expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal232=(Token)match(input,79,FOLLOW_79_in_repeatStatement2019); 
			string_literal232_tree = (Object)adaptor.create(string_literal232);
			root_0 = (Object)adaptor.becomeRoot(string_literal232_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_repeatStatement2022);
			statementSequence233=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence233.getTree());

			string_literal234=(Token)match(input,84,FOLLOW_84_in_repeatStatement2024); 
			pushFollow(FOLLOW_expression_in_repeatStatement2027);
			expression235=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression235.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "repeatStatement"


	public static class loopStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loopStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:1: loopStatement : 'LOOP' ^ statementSequence 'END' !;
	public final OberonParser.loopStatement_return loopStatement() throws RecognitionException {
		OberonParser.loopStatement_return retval = new OberonParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal236=null;
		Token string_literal238=null;
		ParserRuleReturnScope statementSequence237 =null;

		Object string_literal236_tree=null;
		Object string_literal238_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:23: ( 'LOOP' ^ statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:25: 'LOOP' ^ statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal236=(Token)match(input,66,FOLLOW_66_in_loopStatement2043); 
			string_literal236_tree = (Object)adaptor.create(string_literal236);
			root_0 = (Object)adaptor.becomeRoot(string_literal236_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_loopStatement2046);
			statementSequence237=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence237.getTree());

			string_literal238=(Token)match(input,55,FOLLOW_55_in_loopStatement2048); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loopStatement"


	public static class withStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "withStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:1: withStatement : 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !;
	public final OberonParser.withStatement_return withStatement() throws RecognitionException {
		OberonParser.withStatement_return retval = new OberonParser.withStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal239=null;
		Token char_literal241=null;
		Token string_literal243=null;
		Token string_literal245=null;
		ParserRuleReturnScope qualident240 =null;
		ParserRuleReturnScope qualident242 =null;
		ParserRuleReturnScope statementSequence244 =null;

		Object string_literal239_tree=null;
		Object char_literal241_tree=null;
		Object string_literal243_tree=null;
		Object string_literal245_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:23: ( 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:25: 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal239=(Token)match(input,87,FOLLOW_87_in_withStatement2065); 
			string_literal239_tree = (Object)adaptor.create(string_literal239);
			root_0 = (Object)adaptor.becomeRoot(string_literal239_tree, root_0);

			pushFollow(FOLLOW_qualident_in_withStatement2068);
			qualident240=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident240.getTree());

			char_literal241=(Token)match(input,35,FOLLOW_35_in_withStatement2070); 
			char_literal241_tree = (Object)adaptor.create(char_literal241);
			adaptor.addChild(root_0, char_literal241_tree);

			pushFollow(FOLLOW_qualident_in_withStatement2072);
			qualident242=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident242.getTree());

			string_literal243=(Token)match(input,52,FOLLOW_52_in_withStatement2074); 
			pushFollow(FOLLOW_statementSequence_in_withStatement2077);
			statementSequence244=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence244.getTree());

			string_literal245=(Token)match(input,55,FOLLOW_55_in_withStatement2079); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "withStatement"


	public static class procedureDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) ;
	public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
		OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal247=null;
		Token IDENT249=null;
		ParserRuleReturnScope procedureHeading246 =null;
		ParserRuleReturnScope procedureBody248 =null;

		Object char_literal247_tree=null;
		Object IDENT249_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
		RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:23: ( procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:25: procedureHeading ';' procedureBody IDENT
			{
			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration2089);
			procedureHeading246=procedureHeading();
			state._fsp--;

			stream_procedureHeading.add(procedureHeading246.getTree());
			char_literal247=(Token)match(input,37,FOLLOW_37_in_procedureDeclaration2091);  
			stream_37.add(char_literal247);

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration2093);
			procedureBody248=procedureBody();
			state._fsp--;

			stream_procedureBody.add(procedureBody248.getTree());
			IDENT249=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration2095);  
			stream_IDENT.add(IDENT249);

			// AST REWRITE
			// elements: procedureBody, procedureHeading
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 122:81: -> ^( PROCEDURE procedureHeading procedureBody )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:84: ^( PROCEDURE procedureHeading procedureBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);
				adaptor.addChild(root_1, stream_procedureHeading.nextTree());
				adaptor.addChild(root_1, stream_procedureBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureDeclaration"


	public static class procedureHeading_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureHeading"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:1: procedureHeading : 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? ;
	public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
		OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal250=null;
		Token char_literal251=null;
		ParserRuleReturnScope identdef252 =null;
		ParserRuleReturnScope formalParameters253 =null;

		Object string_literal250_tree=null;
		Object char_literal251_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:23: ( 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:25: 'PROCEDURE' ( '*' )? identdef ( formalParameters )?
			{
			string_literal250=(Token)match(input,77,FOLLOW_77_in_procedureHeading2135);  
			stream_77.add(string_literal250);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:37: ( '*' )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==28) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:37: '*'
					{
					char_literal251=(Token)match(input,28,FOLLOW_28_in_procedureHeading2137);  
					stream_28.add(char_literal251);

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading2140);
			identdef252=identdef();
			state._fsp--;

			stream_identdef.add(identdef252.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:51: ( formalParameters )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==26) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:51: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading2142);
					formalParameters253=formalParameters();
					state._fsp--;

					stream_formalParameters.add(formalParameters253.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: formalParameters, identdef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:69: -> identdef ( formalParameters )?
			{
				adaptor.addChild(root_0, stream_identdef.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:81: ( formalParameters )?
				if ( stream_formalParameters.hasNext() ) {
					adaptor.addChild(root_0, stream_formalParameters.nextTree());
				}
				stream_formalParameters.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureHeading"


	public static class procedureBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureBody"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) ;
	public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
		OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal255=null;
		Token string_literal257=null;
		ParserRuleReturnScope declarationSequence254 =null;
		ParserRuleReturnScope statementSequence256 =null;

		Object string_literal255_tree=null;
		Object string_literal257_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
		RewriteRuleSubtreeStream stream_declarationSequence=new RewriteRuleSubtreeStream(adaptor,"rule declarationSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:25: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			pushFollow(FOLLOW_declarationSequence_in_procedureBody2166);
			declarationSequence254=declarationSequence();
			state._fsp--;

			stream_declarationSequence.add(declarationSequence254.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:45: ( 'BEGIN' statementSequence )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==46) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:46: 'BEGIN' statementSequence
					{
					string_literal255=(Token)match(input,46,FOLLOW_46_in_procedureBody2169);  
					stream_46.add(string_literal255);

					pushFollow(FOLLOW_statementSequence_in_procedureBody2171);
					statementSequence256=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence256.getTree());
					}
					break;

			}

			string_literal257=(Token)match(input,55,FOLLOW_55_in_procedureBody2175);  
			stream_55.add(string_literal257);

			// AST REWRITE
			// elements: statementSequence, declarationSequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:82: -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:85: ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:102: ( declarationSequence )?
				if ( stream_declarationSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_declarationSequence.nextTree());
				}
				stream_declarationSequence.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:124: ( statementSequence )?
				if ( stream_statementSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_statementSequence.nextTree());
				}
				stream_statementSequence.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procedureBody"


	public static class forwardDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forwardDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
	public final OberonParser.forwardDeclaration_return forwardDeclaration() throws RecognitionException {
		OberonParser.forwardDeclaration_return retval = new OberonParser.forwardDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal258=null;
		Token char_literal259=null;
		ParserRuleReturnScope identdef260 =null;
		ParserRuleReturnScope formalParameters261 =null;

		Object string_literal258_tree=null;
		Object char_literal259_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:25: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal258=(Token)match(input,77,FOLLOW_77_in_forwardDeclaration2202); 
			string_literal258_tree = (Object)adaptor.create(string_literal258);
			adaptor.addChild(root_0, string_literal258_tree);

			char_literal259=(Token)match(input,90,FOLLOW_90_in_forwardDeclaration2204); 
			char_literal259_tree = (Object)adaptor.create(char_literal259);
			adaptor.addChild(root_0, char_literal259_tree);

			pushFollow(FOLLOW_identdef_in_forwardDeclaration2206);
			identdef260=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef260.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:50: ( formalParameters )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==26) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:50: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration2208);
					formalParameters261=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters261.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forwardDeclaration"


	public static class declarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:1: declarationSequence : ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* ;
	public final OberonParser.declarationSequence_return declarationSequence() throws RecognitionException {
		OberonParser.declarationSequence_return retval = new OberonParser.declarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal266=null;
		Token char_literal268=null;
		ParserRuleReturnScope constdeclarationSequence262 =null;
		ParserRuleReturnScope typedeclarationSequence263 =null;
		ParserRuleReturnScope vardeclarationSequence264 =null;
		ParserRuleReturnScope procedureDeclaration265 =null;
		ParserRuleReturnScope forwardDeclaration267 =null;

		Object char_literal266_tree=null;
		Object char_literal268_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:24: ( ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:26: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:26: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )*
			loop43:
			while (true) {
				int alt43=4;
				switch ( input.LA(1) ) {
				case 48:
					{
					alt43=1;
					}
					break;
				case 83:
					{
					alt43=2;
					}
					break;
				case 85:
					{
					alt43=3;
					}
					break;
				}
				switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:27: constdeclarationSequence
					{
					pushFollow(FOLLOW_constdeclarationSequence_in_declarationSequence2221);
					constdeclarationSequence262=constdeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, constdeclarationSequence262.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:54: typedeclarationSequence
					{
					pushFollow(FOLLOW_typedeclarationSequence_in_declarationSequence2225);
					typedeclarationSequence263=typedeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, typedeclarationSequence263.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:79: vardeclarationSequence
					{
					pushFollow(FOLLOW_vardeclarationSequence_in_declarationSequence2228);
					vardeclarationSequence264=vardeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, vardeclarationSequence264.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:106: ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			loop44:
			while (true) {
				int alt44=3;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==77) ) {
					int LA44_2 = input.LA(2);
					if ( (LA44_2==90) ) {
						alt44=2;
					}
					else if ( (LA44_2==IDENT||LA44_2==28) ) {
						alt44=1;
					}

				}

				switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:107: procedureDeclaration ';' !
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence2235);
					procedureDeclaration265=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration265.getTree());

					char_literal266=(Token)match(input,37,FOLLOW_37_in_declarationSequence2237); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:135: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence2242);
					forwardDeclaration267=forwardDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, forwardDeclaration267.getTree());

					char_literal268=(Token)match(input,37,FOLLOW_37_in_declarationSequence2244); 
					char_literal268_tree = (Object)adaptor.create(char_literal268);
					adaptor.addChild(root_0, char_literal268_tree);

					}
					break;

				default :
					break loop44;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarationSequence"


	public static class constdeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constdeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:1: constdeclarationSequence : 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) ;
	public final OberonParser.constdeclarationSequence_return constdeclarationSequence() throws RecognitionException {
		OberonParser.constdeclarationSequence_return retval = new OberonParser.constdeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal269=null;
		Token char_literal271=null;
		ParserRuleReturnScope constantDeclaration270 =null;

		Object string_literal269_tree=null;
		Object char_literal271_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:26: ( 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:28: 'CONST' ( constantDeclaration ';' )*
			{
			string_literal269=(Token)match(input,48,FOLLOW_48_in_constdeclarationSequence2254);  
			stream_48.add(string_literal269);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:36: ( constantDeclaration ';' )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==IDENT) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:37: constantDeclaration ';'
					{
					pushFollow(FOLLOW_constantDeclaration_in_constdeclarationSequence2257);
					constantDeclaration270=constantDeclaration();
					state._fsp--;

					stream_constantDeclaration.add(constantDeclaration270.getTree());
					char_literal271=(Token)match(input,37,FOLLOW_37_in_constdeclarationSequence2259);  
					stream_37.add(char_literal271);

					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: constantDeclaration, 48
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 132:69: -> ^( 'CONST' ( constantDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:72: ^( 'CONST' ( constantDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:132:82: ( constantDeclaration )*
				while ( stream_constantDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_constantDeclaration.nextTree());
				}
				stream_constantDeclaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constdeclarationSequence"


	public static class typedeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:1: typedeclarationSequence : 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) ;
	public final OberonParser.typedeclarationSequence_return typedeclarationSequence() throws RecognitionException {
		OberonParser.typedeclarationSequence_return retval = new OberonParser.typedeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal272=null;
		Token char_literal274=null;
		ParserRuleReturnScope typeDeclaration273 =null;

		Object string_literal272_tree=null;
		Object char_literal274_tree=null;
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:25: ( 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:27: 'TYPE' ( typeDeclaration ';' )*
			{
			string_literal272=(Token)match(input,83,FOLLOW_83_in_typedeclarationSequence2287);  
			stream_83.add(string_literal272);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:34: ( typeDeclaration ';' )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==IDENT) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:36: typeDeclaration ';'
					{
					pushFollow(FOLLOW_typeDeclaration_in_typedeclarationSequence2291);
					typeDeclaration273=typeDeclaration();
					state._fsp--;

					stream_typeDeclaration.add(typeDeclaration273.getTree());
					char_literal274=(Token)match(input,37,FOLLOW_37_in_typedeclarationSequence2293);  
					stream_37.add(char_literal274);

					}
					break;

				default :
					break loop46;
				}
			}

			// AST REWRITE
			// elements: 83, typeDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:69: -> ^( 'TYPE' ( typeDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:72: ^( 'TYPE' ( typeDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_83.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:81: ( typeDeclaration )*
				while ( stream_typeDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_typeDeclaration.nextTree());
				}
				stream_typeDeclaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedeclarationSequence"


	public static class vardeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:1: vardeclarationSequence : 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) ;
	public final OberonParser.vardeclarationSequence_return vardeclarationSequence() throws RecognitionException {
		OberonParser.vardeclarationSequence_return retval = new OberonParser.vardeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal275=null;
		Token char_literal277=null;
		ParserRuleReturnScope variableDeclaration276 =null;

		Object string_literal275_tree=null;
		Object char_literal277_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:24: ( 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:27: 'VAR' ( variableDeclaration ';' )*
			{
			string_literal275=(Token)match(input,85,FOLLOW_85_in_vardeclarationSequence2328);  
			stream_85.add(string_literal275);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:33: ( variableDeclaration ';' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==IDENT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:34: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_vardeclarationSequence2331);
					variableDeclaration276=variableDeclaration();
					state._fsp--;

					stream_variableDeclaration.add(variableDeclaration276.getTree());
					char_literal277=(Token)match(input,37,FOLLOW_37_in_vardeclarationSequence2333);  
					stream_37.add(char_literal277);

					}
					break;

				default :
					break loop47;
				}
			}

			// AST REWRITE
			// elements: variableDeclaration, 85
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 136:69: -> ^( 'VAR' ( variableDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:72: ^( 'VAR' ( variableDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_85.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:80: ( variableDeclaration )*
				while ( stream_variableDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_variableDeclaration.nextTree());
				}
				stream_variableDeclaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vardeclarationSequence"


	public static class formalParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( FORMAL_PARAMETERS ( fpSection )* ( qualident )? ) ;
	public final OberonParser.formalParameters_return formalParameters() throws RecognitionException {
		OberonParser.formalParameters_return retval = new OberonParser.formalParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal278=null;
		Token char_literal280=null;
		Token char_literal282=null;
		Token char_literal283=null;
		ParserRuleReturnScope fpSection279 =null;
		ParserRuleReturnScope fpSection281 =null;
		ParserRuleReturnScope qualident284 =null;

		Object char_literal278_tree=null;
		Object char_literal280_tree=null;
		Object char_literal282_tree=null;
		Object char_literal283_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
		RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( FORMAL_PARAMETERS ( fpSection )* ( qualident )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:25: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			char_literal278=(Token)match(input,26,FOLLOW_26_in_formalParameters2370);  
			stream_26.add(char_literal278);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:29: ( fpSection ( ';' fpSection )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==IDENT||LA49_0==85) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:30: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters2373);
					fpSection279=fpSection();
					state._fsp--;

					stream_fpSection.add(fpSection279.getTree());
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:40: ( ';' fpSection )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==37) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:41: ';' fpSection
							{
							char_literal280=(Token)match(input,37,FOLLOW_37_in_formalParameters2376);  
							stream_37.add(char_literal280);

							pushFollow(FOLLOW_fpSection_in_formalParameters2378);
							fpSection281=fpSection();
							state._fsp--;

							stream_fpSection.add(fpSection281.getTree());
							}
							break;

						default :
							break loop48;
						}
					}

					}
					break;

			}

			char_literal282=(Token)match(input,27,FOLLOW_27_in_formalParameters2384);  
			stream_27.add(char_literal282);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:63: ( ':' qualident )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==35) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:64: ':' qualident
					{
					char_literal283=(Token)match(input,35,FOLLOW_35_in_formalParameters2387);  
					stream_35.add(char_literal283);

					pushFollow(FOLLOW_qualident_in_formalParameters2389);
					qualident284=qualident();
					state._fsp--;

					stream_qualident.add(qualident284.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: qualident, fpSection
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:80: -> ^( FORMAL_PARAMETERS ( fpSection )* ( qualident )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:83: ^( FORMAL_PARAMETERS ( fpSection )* ( qualident )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMAL_PARAMETERS, "FORMAL_PARAMETERS"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:103: ( fpSection )*
				while ( stream_fpSection.hasNext() ) {
					adaptor.addChild(root_1, stream_fpSection.nextTree());
				}
				stream_fpSection.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:114: ( qualident )?
				if ( stream_qualident.hasNext() ) {
					adaptor.addChild(root_1, stream_qualident.nextTree());
				}
				stream_qualident.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class fpSection_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fpSection"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType ;
	public final OberonParser.fpSection_return fpSection() throws RecognitionException {
		OberonParser.fpSection_return retval = new OberonParser.fpSection_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal285=null;
		Token IDENT286=null;
		Token char_literal287=null;
		Token IDENT288=null;
		Token char_literal289=null;
		ParserRuleReturnScope formalType290 =null;

		Object string_literal285_tree=null;
		Object IDENT286_tree=null;
		Object char_literal287_tree=null;
		Object IDENT288_tree=null;
		Object char_literal289_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:25: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:25: ( 'VAR' )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==85) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:25: 'VAR'
					{
					string_literal285=(Token)match(input,85,FOLLOW_85_in_fpSection2423); 
					string_literal285_tree = (Object)adaptor.create(string_literal285);
					adaptor.addChild(root_0, string_literal285_tree);

					}
					break;

			}

			IDENT286=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection2426); 
			IDENT286_tree = (Object)adaptor.create(IDENT286);
			adaptor.addChild(root_0, IDENT286_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:38: ( ',' IDENT )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==30) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:39: ',' IDENT
					{
					char_literal287=(Token)match(input,30,FOLLOW_30_in_fpSection2429); 
					char_literal287_tree = (Object)adaptor.create(char_literal287);
					adaptor.addChild(root_0, char_literal287_tree);

					IDENT288=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection2431); 
					IDENT288_tree = (Object)adaptor.create(IDENT288);
					adaptor.addChild(root_0, IDENT288_tree);

					}
					break;

				default :
					break loop52;
				}
			}

			char_literal289=(Token)match(input,35,FOLLOW_35_in_fpSection2436); 
			char_literal289_tree = (Object)adaptor.create(char_literal289);
			adaptor.addChild(root_0, char_literal289_tree);

			pushFollow(FOLLOW_formalType_in_fpSection2438);
			formalType290=formalType();
			state._fsp--;

			adaptor.addChild(root_0, formalType290.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fpSection"


	public static class formalType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:1: formalType : ( ( 'ARRAY' 'OF' )* qualident | procedureType );
	public final OberonParser.formalType_return formalType() throws RecognitionException {
		OberonParser.formalType_return retval = new OberonParser.formalType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal291=null;
		Token string_literal292=null;
		ParserRuleReturnScope qualident293 =null;
		ParserRuleReturnScope procedureType294 =null;

		Object string_literal291_tree=null;
		Object string_literal292_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:23: ( ( 'ARRAY' 'OF' )* qualident | procedureType )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==IDENT||LA54_0==44) ) {
				alt54=1;
			}
			else if ( (LA54_0==77) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:25: ( 'ARRAY' 'OF' )* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:25: ( 'ARRAY' 'OF' )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==44) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:26: 'ARRAY' 'OF'
							{
							string_literal291=(Token)match(input,44,FOLLOW_44_in_formalType2458); 
							string_literal291_tree = (Object)adaptor.create(string_literal291);
							adaptor.addChild(root_0, string_literal291_tree);

							string_literal292=(Token)match(input,74,FOLLOW_74_in_formalType2460); 
							string_literal292_tree = (Object)adaptor.create(string_literal292);
							adaptor.addChild(root_0, string_literal292_tree);

							}
							break;

						default :
							break loop53;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType2464);
					qualident293=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident293.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:53: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType2468);
					procedureType294=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType294.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalType"


	public static class module_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "module"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:1: module : 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !;
	public final OberonParser.module_return module() throws RecognitionException {
		OberonParser.module_return retval = new OberonParser.module_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal295=null;
		Token IDENT296=null;
		Token char_literal297=null;
		Token string_literal300=null;
		Token string_literal302=null;
		Token IDENT303=null;
		Token char_literal304=null;
		Token EOF305=null;
		ParserRuleReturnScope importList298 =null;
		ParserRuleReturnScope declarationSequence299 =null;
		ParserRuleReturnScope statementSequence301 =null;

		Object string_literal295_tree=null;
		Object IDENT296_tree=null;
		Object char_literal297_tree=null;
		Object string_literal300_tree=null;
		Object string_literal302_tree=null;
		Object IDENT303_tree=null;
		Object char_literal304_tree=null;
		Object EOF305_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:23: ( 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:25: 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !
			{
			root_0 = (Object)adaptor.nil();


			string_literal295=(Token)match(input,70,FOLLOW_70_in_module2491); 
			string_literal295_tree = (Object)adaptor.create(string_literal295);
			root_0 = (Object)adaptor.becomeRoot(string_literal295_tree, root_0);

			IDENT296=(Token)match(input,IDENT,FOLLOW_IDENT_in_module2494); 
			IDENT296_tree = (Object)adaptor.create(IDENT296);
			adaptor.addChild(root_0, IDENT296_tree);

			char_literal297=(Token)match(input,37,FOLLOW_37_in_module2496); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:46: ( importList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==60) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:46: importList
					{
					pushFollow(FOLLOW_importList_in_module2499);
					importList298=importList();
					state._fsp--;

					adaptor.addChild(root_0, importList298.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module2502);
			declarationSequence299=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence299.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:78: ( 'BEGIN' ! statementSequence )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==46) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:145:79: 'BEGIN' ! statementSequence
					{
					string_literal300=(Token)match(input,46,FOLLOW_46_in_module2505); 
					pushFollow(FOLLOW_statementSequence_in_module2508);
					statementSequence301=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence301.getTree());

					}
					break;

			}

			string_literal302=(Token)match(input,55,FOLLOW_55_in_module2512); 
			IDENT303=(Token)match(input,IDENT,FOLLOW_IDENT_in_module2515); 
			char_literal304=(Token)match(input,32,FOLLOW_32_in_module2518); 
			EOF305=(Token)match(input,EOF,FOLLOW_EOF_in_module2521); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "module"


	public static class importList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) ;
	public final OberonParser.importList_return importList() throws RecognitionException {
		OberonParser.importList_return retval = new OberonParser.importList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal306=null;
		Token char_literal308=null;
		Token char_literal310=null;
		ParserRuleReturnScope importDeclaration307 =null;
		ParserRuleReturnScope importDeclaration309 =null;

		Object string_literal306_tree=null;
		Object char_literal308_tree=null;
		Object char_literal310_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_importDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule importDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:25: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			string_literal306=(Token)match(input,60,FOLLOW_60_in_importList2541);  
			stream_60.add(string_literal306);

			pushFollow(FOLLOW_importDeclaration_in_importList2543);
			importDeclaration307=importDeclaration();
			state._fsp--;

			stream_importDeclaration.add(importDeclaration307.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:52: ( ',' importDeclaration )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==30) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:53: ',' importDeclaration
					{
					char_literal308=(Token)match(input,30,FOLLOW_30_in_importList2546);  
					stream_30.add(char_literal308);

					pushFollow(FOLLOW_importDeclaration_in_importList2548);
					importDeclaration309=importDeclaration();
					state._fsp--;

					stream_importDeclaration.add(importDeclaration309.getTree());
					}
					break;

				default :
					break loop57;
				}
			}

			char_literal310=(Token)match(input,37,FOLLOW_37_in_importList2552);  
			stream_37.add(char_literal310);

			// AST REWRITE
			// elements: 60, importDeclaration, importDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 147:85: -> ^( 'IMPORT' importDeclaration ( importDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:88: ^( 'IMPORT' importDeclaration ( importDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_60.nextNode(), root_1);
				adaptor.addChild(root_1, stream_importDeclaration.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:117: ( importDeclaration )*
				while ( stream_importDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_importDeclaration.nextTree());
				}
				stream_importDeclaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "importList"


	public static class importDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:1: importDeclaration : IDENT ( ':=' IDENT )? -> ^( ':=' IDENT ( IDENT )? ) ;
	public final OberonParser.importDeclaration_return importDeclaration() throws RecognitionException {
		OberonParser.importDeclaration_return retval = new OberonParser.importDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT311=null;
		Token string_literal312=null;
		Token IDENT313=null;

		Object IDENT311_tree=null;
		Object string_literal312_tree=null;
		Object IDENT313_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:23: ( IDENT ( ':=' IDENT )? -> ^( ':=' IDENT ( IDENT )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:26: IDENT ( ':=' IDENT )?
			{
			IDENT311=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration2585);  
			stream_IDENT.add(IDENT311);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:32: ( ':=' IDENT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==36) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:33: ':=' IDENT
					{
					string_literal312=(Token)match(input,36,FOLLOW_36_in_importDeclaration2588);  
					stream_36.add(string_literal312);

					IDENT313=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration2590);  
					stream_IDENT.add(IDENT313);

					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, 36, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:85: -> ^( ':=' IDENT ( IDENT )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:88: ^( ':=' IDENT ( IDENT )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:102: ( IDENT )?
				if ( stream_IDENT.hasNext() ) {
					adaptor.addChild(root_1, stream_IDENT.nextNode());
				}
				stream_IDENT.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "importDeclaration"

	// Delegated rules



	public static final BitSet FOLLOW_43_in_abs89 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_abs92 = new BitSet(new long[]{0x0000000000088000L});
	public static final BitSet FOLLOW_number_in_abs95 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_abs97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_odd123 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_odd126 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_odd129 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_odd131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_cap173 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_cap176 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CHARACTER_in_cap179 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_cap181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_ash207 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_ash210 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_ash213 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_ash215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_len241 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_len244 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_len247 = new BitSet(new long[]{0x0000000048000000L});
	public static final BitSet FOLLOW_30_in_len250 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_len252 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_len256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_maxMin280 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_68_in_maxMin283 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_maxMin287 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_maxMin290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_maxMin292 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_maxMin294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_size320 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_size323 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_size326 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_size328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_inc355 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_inc358 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_inc361 = new BitSet(new long[]{0x0000000048000000L});
	public static final BitSet FOLLOW_30_in_inc364 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_inc367 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_inc371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_dec397 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_dec400 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_dec403 = new BitSet(new long[]{0x0000000048000000L});
	public static final BitSet FOLLOW_30_in_dec406 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_dec409 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_dec413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_incl438 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_incl441 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_set_in_incl444 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_incl446 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_incl449 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_incl451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_excl476 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_excl479 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_set_in_excl482 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_excl484 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_excl487 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_excl489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_copy514 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_copy517 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_copy520 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_copy522 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_copy525 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_copy527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_neW553 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_neW556 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_neW559 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_neW561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_halt587 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_halt590 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_INTEGER_in_halt593 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_halt595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abs_in_predefined616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_odd_in_predefined618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cap_in_predefined620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ash_in_predefined622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_len_in_predefined624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maxMin_in_predefined626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_predefined628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inc_in_predefined630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec_in_predefined632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incl_in_predefined634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_excl_in_predefined636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copy_in_predefined638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_neW_in_predefined640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_in_predefined642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identdef694 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_identdef696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration707 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_constantDeclaration709 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_constExpression_in_constantDeclaration711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constExpression741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_typeDeclaration755 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_typeDeclaration757 = new BitSet(new long[]{0x0000100000004000L,0x0000000000007000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_type811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_type827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_arrayType847 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_length_in_arrayType849 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_30_in_arrayType852 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_length_in_arrayType854 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_arrayType858 = new BitSet(new long[]{0x0000100000004000L,0x0000000000007000L});
	public static final BitSet FOLLOW_type_in_arrayType860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constExpression_in_length883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_recordType902 = new BitSet(new long[]{0x0000002004004000L});
	public static final BitSet FOLLOW_26_in_recordType905 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_baseType_in_recordType907 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_recordType909 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_fieldListSequence_in_recordType913 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_recordType915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_baseType947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence959 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_fieldListSequence962 = new BitSet(new long[]{0x0000002000004000L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence965 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_identList_in_fieldList989 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_fieldList991 = new BitSet(new long[]{0x0000100000004000L,0x0000000000007000L});
	public static final BitSet FOLLOW_type_in_fieldList994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_identList1016 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_identList1019 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identdef_in_identList1021 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_76_in_pointerType1041 = new BitSet(new long[]{0x0000100000004000L,0x0000000000007000L});
	public static final BitSet FOLLOW_type_in_pointerType1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_procedureType1060 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureType1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identList_in_variableDeclaration1074 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_variableDeclaration1076 = new BitSet(new long[]{0x0000100000004000L,0x0000000000007000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualident1117 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_qualident1119 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_qualident1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_designator1151 = new BitSet(new long[]{0x0000000104000002L,0x0000000005000000L});
	public static final BitSet FOLLOW_32_in_designator1154 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_designator1156 = new BitSet(new long[]{0x0000000104000002L,0x0000000005000000L});
	public static final BitSet FOLLOW_88_in_designator1160 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expList_in_designator1163 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_designator1165 = new BitSet(new long[]{0x0000000104000002L,0x0000000005000000L});
	public static final BitSet FOLLOW_26_in_designator1170 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_designator1173 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_designator1175 = new BitSet(new long[]{0x0000000104000002L,0x0000000005000000L});
	public static final BitSet FOLLOW_90_in_designator1180 = new BitSet(new long[]{0x0000000104000002L,0x0000000005000000L});
	public static final BitSet FOLLOW_expression_in_expList1204 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_expList1207 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_expList1209 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1230 = new BitSet(new long[]{0x200007C001000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_relation_in_expression1233 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression1295 = new BitSet(new long[]{0x00000000A0000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression1298 = new BitSet(new long[]{0x000000000428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_term_in_simpleExpression1301 = new BitSet(new long[]{0x00000000A0000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_factor_in_term1354 = new BitSet(new long[]{0x0008000412000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_mulOperator_in_term1357 = new BitSet(new long[]{0x000000000428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_factor_in_term1360 = new BitSet(new long[]{0x0008000412000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_number_in_factor1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_factor1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor1431 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_actualParameters_in_factor1433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_factor1438 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_factor1441 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_factor1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_factor1449 = new BitSet(new long[]{0x000000000428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_factor_in_factor1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_set1477 = new BitSet(new long[]{0x00000000A428C080L,0x00000000D0000100L});
	public static final BitSet FOLLOW_element_in_set1480 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_set1483 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_element_in_set1485 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_set1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element1514 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_element1518 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_element1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_actualParameters1535 = new BitSet(new long[]{0x00000000AC28C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expList_in_actualParameters1538 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_actualParameters1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predefined_in_statement1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement2_in_statement1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_statement1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_statement1585 = new BitSet(new long[]{0x00000000A428C082L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_statement1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement21610 = new BitSet(new long[]{0x0000001004000000L});
	public static final BitSet FOLLOW_36_in_statement21615 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_statement21617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement21622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall1656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence1669 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_statementSequence1673 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statement_in_statementSequence1675 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_59_in_ifStatement1710 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_ifStatement1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ifStatement1714 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1718 = new BitSet(new long[]{0x00E0000000000000L});
	public static final BitSet FOLLOW_54_in_ifStatement1721 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_ifStatement1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ifStatement1725 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1729 = new BitSet(new long[]{0x00E0000000000000L});
	public static final BitSet FOLLOW_53_in_ifStatement1734 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1738 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_ifStatement1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_caseStatement1819 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_caseStatement1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_caseStatement1823 = new BitSet(new long[]{0x00A00000A428C080L,0x00000000B0000100L});
	public static final BitSet FOLLOW_casE_in_caseStatement1825 = new BitSet(new long[]{0x00A0000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_caseStatement1828 = new BitSet(new long[]{0x00A00000A428C080L,0x00000000B0000100L});
	public static final BitSet FOLLOW_casE_in_caseStatement1830 = new BitSet(new long[]{0x00A0000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_53_in_caseStatement1835 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement1837 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_caseStatement1841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE1918 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_casE1920 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_casE1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1940 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_caseLabelList1943 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1945 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1966 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_caseLabels1969 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_whileStatement1987 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_whileStatement1989 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_whileStatement1991 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement1993 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_whileStatement1995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_repeatStatement2019 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement2022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_repeatStatement2024 = new BitSet(new long[]{0x00000000A428C080L,0x0000000090000100L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_loopStatement2043 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement2046 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_loopStatement2048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_withStatement2065 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2068 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_withStatement2070 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2072 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_withStatement2074 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_withStatement2077 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_withStatement2079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration2089 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_procedureDeclaration2091 = new BitSet(new long[]{0x0081400000000000L,0x0000000000282000L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration2093 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration2095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_procedureHeading2135 = new BitSet(new long[]{0x0000000010004000L});
	public static final BitSet FOLLOW_28_in_procedureHeading2137 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading2140 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading2142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody2166 = new BitSet(new long[]{0x0080400000000000L});
	public static final BitSet FOLLOW_46_in_procedureBody2169 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody2171 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_procedureBody2175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_forwardDeclaration2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_forwardDeclaration2204 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration2206 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constdeclarationSequence_in_declarationSequence2221 = new BitSet(new long[]{0x0001000000000002L,0x0000000000282000L});
	public static final BitSet FOLLOW_typedeclarationSequence_in_declarationSequence2225 = new BitSet(new long[]{0x0001000000000002L,0x0000000000282000L});
	public static final BitSet FOLLOW_vardeclarationSequence_in_declarationSequence2228 = new BitSet(new long[]{0x0001000000000002L,0x0000000000282000L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence2235 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declarationSequence2237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence2242 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declarationSequence2244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_48_in_constdeclarationSequence2254 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_constantDeclaration_in_constdeclarationSequence2257 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_constdeclarationSequence2259 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_83_in_typedeclarationSequence2287 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typedeclarationSequence2291 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_typedeclarationSequence2293 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_85_in_vardeclarationSequence2328 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_variableDeclaration_in_vardeclarationSequence2331 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_vardeclarationSequence2333 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_26_in_formalParameters2370 = new BitSet(new long[]{0x0000000008004000L,0x0000000000200000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters2373 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_37_in_formalParameters2376 = new BitSet(new long[]{0x0000000000004000L,0x0000000000200000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters2378 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_27_in_formalParameters2384 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_formalParameters2387 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_qualident_in_formalParameters2389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_fpSection2423 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection2426 = new BitSet(new long[]{0x0000000840000000L});
	public static final BitSet FOLLOW_30_in_fpSection2429 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection2431 = new BitSet(new long[]{0x0000000840000000L});
	public static final BitSet FOLLOW_35_in_fpSection2436 = new BitSet(new long[]{0x0000100000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_formalType_in_fpSection2438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_formalType2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_formalType2460 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_qualident_in_formalType2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType2468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_module2491 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_module2494 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_module2496 = new BitSet(new long[]{0x1081400000000000L,0x0000000000282000L});
	public static final BitSet FOLLOW_importList_in_module2499 = new BitSet(new long[]{0x0081400000000000L,0x0000000000282000L});
	public static final BitSet FOLLOW_declarationSequence_in_module2502 = new BitSet(new long[]{0x0080400000000000L});
	public static final BitSet FOLLOW_46_in_module2505 = new BitSet(new long[]{0xCF06A82000004000L,0x0000000018C3829EL});
	public static final BitSet FOLLOW_statementSequence_in_module2508 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_module2512 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_module2515 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_module2518 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module2521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_importList2541 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList2543 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_importList2546 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList2548 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_37_in_importList2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration2585 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_importDeclaration2588 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration2590 = new BitSet(new long[]{0x0000000000000002L});
}
