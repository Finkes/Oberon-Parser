// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-06-02 09:39:16
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
		"CHARCONST", "COMMENT", "DECLARE", "DIGIT", "F_PARAM", "F_PARAMS", "HEX_DIGIT", 
		"ID", "IDENT", "IMPORT_DECL", "INTEGER", "LENGTH", "LETTER", "PROCEDURE", 
		"PROCEDURE_BODY", "REAL", "SCALE_FACTOR", "STRING", "TYPE_DECL", "WS", 
		"'#'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'..'", 
		"'/'", "':'", "':='", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'ABS'", 
		"'ARRAY'", "'ASH'", "'BEGIN'", "'CAP'", "'CONST'", "'COPY'", "'DEC'", 
		"'DIV'", "'DO'", "'ELSE'", "'ELSIF'", "'END'", "'EXCL'", "'EXIT'", "'HALT'", 
		"'IF'", "'IMPORT'", "'IN'", "'INC'", "'INCL'", "'IS'", "'LEN'", "'LOOP'", 
		"'MAX'", "'MIN'", "'MOD'", "'MODULE'", "'NEW'", "'NIL'", "'ODD'", "'OF'", 
		"'OR'", "'POINTER TO'", "'PROCEDURE'", "'RECORD'", "'REPEAT'", "'RETURN'", 
		"'SIZE'", "'THEN'", "'TYPE'", "'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", 
		"'['", "']'", "'^'", "'case'", "'{'", "'|'", "'}'", "'~'"
	};
	public static final int EOF=-1;
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
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int CHARACTER=6;
	public static final int CHARCONST=7;
	public static final int COMMENT=8;
	public static final int DECLARE=9;
	public static final int DIGIT=10;
	public static final int F_PARAM=11;
	public static final int F_PARAMS=12;
	public static final int HEX_DIGIT=13;
	public static final int ID=14;
	public static final int IDENT=15;
	public static final int IMPORT_DECL=16;
	public static final int INTEGER=17;
	public static final int LENGTH=18;
	public static final int LETTER=19;
	public static final int PROCEDURE=20;
	public static final int PROCEDURE_BODY=21;
	public static final int REAL=22;
	public static final int SCALE_FACTOR=23;
	public static final int STRING=24;
	public static final int TYPE_DECL=25;
	public static final int WS=26;

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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:29: 'ABS' ^ '(' ! number ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,46,FOLLOW_46_in_abs99); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			root_0 = (Object)adaptor.becomeRoot(string_literal1_tree, root_0);

			char_literal2=(Token)match(input,29,FOLLOW_29_in_abs102); 
			pushFollow(FOLLOW_number_in_abs105);
			number3=number();
			state._fsp--;

			adaptor.addChild(root_0, number3.getTree());

			char_literal4=(Token)match(input,30,FOLLOW_30_in_abs107); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:29: 'ODD' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal5=(Token)match(input,76,FOLLOW_76_in_odd137); 
			string_literal5_tree = (Object)adaptor.create(string_literal5);
			root_0 = (Object)adaptor.becomeRoot(string_literal5_tree, root_0);

			char_literal6=(Token)match(input,29,FOLLOW_29_in_odd140); 
			INTEGER7=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_odd143); 
			INTEGER7_tree = (Object)adaptor.create(INTEGER7);
			adaptor.addChild(root_0, INTEGER7_tree);

			char_literal8=(Token)match(input,30,FOLLOW_30_in_odd145); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:29: 'CAP' ^ '(' ! CHARACTER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal9=(Token)match(input,50,FOLLOW_50_in_cap191); 
			string_literal9_tree = (Object)adaptor.create(string_literal9);
			root_0 = (Object)adaptor.becomeRoot(string_literal9_tree, root_0);

			char_literal10=(Token)match(input,29,FOLLOW_29_in_cap194); 
			CHARACTER11=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_cap197); 
			CHARACTER11_tree = (Object)adaptor.create(CHARACTER11);
			adaptor.addChild(root_0, CHARACTER11_tree);

			char_literal12=(Token)match(input,30,FOLLOW_30_in_cap199); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:29: 'ASH' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,48,FOLLOW_48_in_ash229); 
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			root_0 = (Object)adaptor.becomeRoot(string_literal13_tree, root_0);

			char_literal14=(Token)match(input,29,FOLLOW_29_in_ash232); 
			INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_ash235); 
			INTEGER15_tree = (Object)adaptor.create(INTEGER15);
			adaptor.addChild(root_0, INTEGER15_tree);

			char_literal16=(Token)match(input,30,FOLLOW_30_in_ash237); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:29: 'LEN' ^ '(' ! qualident ( ',' INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal17=(Token)match(input,68,FOLLOW_68_in_len267); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);

			char_literal18=(Token)match(input,29,FOLLOW_29_in_len270); 
			pushFollow(FOLLOW_qualident_in_len273);
			qualident19=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident19.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:51: ( ',' INTEGER )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==33) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:52: ',' INTEGER
					{
					char_literal20=(Token)match(input,33,FOLLOW_33_in_len276); 
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);

					INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_len278); 
					INTEGER21_tree = (Object)adaptor.create(INTEGER21);
					adaptor.addChild(root_0, INTEGER21_tree);

					}
					break;

			}

			char_literal22=(Token)match(input,30,FOLLOW_30_in_len282); 
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
			if ( ((LA3_0 >= 70 && LA3_0 <= 71)) ) {
				alt3=1;
			}
			else if ( (LA3_0==95) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:29: ( 'MAX' ^| 'MIN' ^) '(' ! qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:29: ( 'MAX' ^| 'MIN' ^)
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==70) ) {
						alt2=1;
					}
					else if ( (LA2_0==71) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:30: 'MAX' ^
							{
							string_literal23=(Token)match(input,70,FOLLOW_70_in_maxMin310); 
							string_literal23_tree = (Object)adaptor.create(string_literal23);
							root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

							}
							break;
						case 2 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:37: 'MIN' ^
							{
							string_literal24=(Token)match(input,71,FOLLOW_71_in_maxMin313); 
							string_literal24_tree = (Object)adaptor.create(string_literal24);
							root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);

							}
							break;

					}

					char_literal25=(Token)match(input,29,FOLLOW_29_in_maxMin317); 
					pushFollow(FOLLOW_qualident_in_maxMin320);
					qualident26=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident26.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:60: set ')' !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_maxMin322);
					set27=set();
					state._fsp--;

					adaptor.addChild(root_0, set27.getTree());

					char_literal28=(Token)match(input,30,FOLLOW_30_in_maxMin324); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:29: 'SIZE' ^ '(' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal29=(Token)match(input,84,FOLLOW_84_in_size354); 
			string_literal29_tree = (Object)adaptor.create(string_literal29);
			root_0 = (Object)adaptor.becomeRoot(string_literal29_tree, root_0);

			char_literal30=(Token)match(input,29,FOLLOW_29_in_size357); 
			pushFollow(FOLLOW_qualident_in_size360);
			qualident31=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident31.getTree());

			char_literal32=(Token)match(input,30,FOLLOW_30_in_size362); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:29: 'INC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal33=(Token)match(input,65,FOLLOW_65_in_inc393); 
			string_literal33_tree = (Object)adaptor.create(string_literal33);
			root_0 = (Object)adaptor.becomeRoot(string_literal33_tree, root_0);

			char_literal34=(Token)match(input,29,FOLLOW_29_in_inc396); 
			INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc399); 
			INTEGER35_tree = (Object)adaptor.create(INTEGER35);
			adaptor.addChild(root_0, INTEGER35_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:49: ( ',' ! INTEGER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==33) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:50: ',' ! INTEGER
					{
					char_literal36=(Token)match(input,33,FOLLOW_33_in_inc402); 
					INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc405); 
					INTEGER37_tree = (Object)adaptor.create(INTEGER37);
					adaptor.addChild(root_0, INTEGER37_tree);

					}
					break;

			}

			char_literal38=(Token)match(input,30,FOLLOW_30_in_inc409); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:29: 'DEC' ^ '(' ! INTEGER ( ',' ! INTEGER )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal39=(Token)match(input,53,FOLLOW_53_in_dec439); 
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			root_0 = (Object)adaptor.becomeRoot(string_literal39_tree, root_0);

			char_literal40=(Token)match(input,29,FOLLOW_29_in_dec442); 
			INTEGER41=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec445); 
			INTEGER41_tree = (Object)adaptor.create(INTEGER41);
			adaptor.addChild(root_0, INTEGER41_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:49: ( ',' ! INTEGER )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==33) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:50: ',' ! INTEGER
					{
					char_literal42=(Token)match(input,33,FOLLOW_33_in_dec448); 
					INTEGER43=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec451); 
					INTEGER43_tree = (Object)adaptor.create(INTEGER43);
					adaptor.addChild(root_0, INTEGER43_tree);

					}
					break;

			}

			char_literal44=(Token)match(input,30,FOLLOW_30_in_dec455); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:29: 'INCL' ^ '(' ! set ',' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal45=(Token)match(input,66,FOLLOW_66_in_incl484); 
			string_literal45_tree = (Object)adaptor.create(string_literal45);
			root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);

			char_literal46=(Token)match(input,29,FOLLOW_29_in_incl487); 
			pushFollow(FOLLOW_set_in_incl490);
			set47=set();
			state._fsp--;

			adaptor.addChild(root_0, set47.getTree());

			char_literal48=(Token)match(input,33,FOLLOW_33_in_incl492); 
			INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_incl495); 
			INTEGER49_tree = (Object)adaptor.create(INTEGER49);
			adaptor.addChild(root_0, INTEGER49_tree);

			char_literal50=(Token)match(input,30,FOLLOW_30_in_incl497); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:29: 'EXCL' ^ '(' ! set ',' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal51=(Token)match(input,59,FOLLOW_59_in_excl526); 
			string_literal51_tree = (Object)adaptor.create(string_literal51);
			root_0 = (Object)adaptor.becomeRoot(string_literal51_tree, root_0);

			char_literal52=(Token)match(input,29,FOLLOW_29_in_excl529); 
			pushFollow(FOLLOW_set_in_excl532);
			set53=set();
			state._fsp--;

			adaptor.addChild(root_0, set53.getTree());

			char_literal54=(Token)match(input,33,FOLLOW_33_in_excl534); 
			INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_excl537); 
			INTEGER55_tree = (Object)adaptor.create(INTEGER55);
			adaptor.addChild(root_0, INTEGER55_tree);

			char_literal56=(Token)match(input,30,FOLLOW_30_in_excl539); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:29: 'COPY' ^ '(' ! qualident ',' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,52,FOLLOW_52_in_copy568); 
			string_literal57_tree = (Object)adaptor.create(string_literal57);
			root_0 = (Object)adaptor.becomeRoot(string_literal57_tree, root_0);

			char_literal58=(Token)match(input,29,FOLLOW_29_in_copy571); 
			pushFollow(FOLLOW_qualident_in_copy574);
			qualident59=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident59.getTree());

			char_literal60=(Token)match(input,33,FOLLOW_33_in_copy576); 
			pushFollow(FOLLOW_qualident_in_copy579);
			qualident61=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident61.getTree());

			char_literal62=(Token)match(input,30,FOLLOW_30_in_copy581); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:29: 'NEW' ^ '(' ! qualident ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal63=(Token)match(input,74,FOLLOW_74_in_neW611); 
			string_literal63_tree = (Object)adaptor.create(string_literal63);
			root_0 = (Object)adaptor.becomeRoot(string_literal63_tree, root_0);

			char_literal64=(Token)match(input,29,FOLLOW_29_in_neW614); 
			pushFollow(FOLLOW_qualident_in_neW617);
			qualident65=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident65.getTree());

			char_literal66=(Token)match(input,30,FOLLOW_30_in_neW619); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:29: 'HALT' ^ '(' ! INTEGER ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal67=(Token)match(input,61,FOLLOW_61_in_halt649); 
			string_literal67_tree = (Object)adaptor.create(string_literal67);
			root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);

			char_literal68=(Token)match(input,29,FOLLOW_29_in_halt652); 
			INTEGER69=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_halt655); 
			INTEGER69_tree = (Object)adaptor.create(INTEGER69);
			adaptor.addChild(root_0, INTEGER69_tree);

			char_literal70=(Token)match(input,30,FOLLOW_30_in_halt657); 
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:29: ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt )
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:29: ( abs | odd | cap | ash | len | maxMin | size | inc | dec | incl | excl | copy | neW | halt )
			int alt6=14;
			switch ( input.LA(1) ) {
			case 46:
				{
				alt6=1;
				}
				break;
			case 76:
				{
				alt6=2;
				}
				break;
			case 50:
				{
				alt6=3;
				}
				break;
			case 48:
				{
				alt6=4;
				}
				break;
			case 68:
				{
				alt6=5;
				}
				break;
			case 70:
			case 71:
			case 95:
				{
				alt6=6;
				}
				break;
			case 84:
				{
				alt6=7;
				}
				break;
			case 65:
				{
				alt6=8;
				}
				break;
			case 53:
				{
				alt6=9;
				}
				break;
			case 66:
				{
				alt6=10;
				}
				break;
			case 59:
				{
				alt6=11;
				}
				break;
			case 52:
				{
				alt6=12;
				}
				break;
			case 74:
				{
				alt6=13;
				}
				break;
			case 61:
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:30: abs
					{
					pushFollow(FOLLOW_abs_in_predefined682);
					abs71=abs();
					state._fsp--;

					adaptor.addChild(root_0, abs71.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:34: odd
					{
					pushFollow(FOLLOW_odd_in_predefined684);
					odd72=odd();
					state._fsp--;

					adaptor.addChild(root_0, odd72.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:38: cap
					{
					pushFollow(FOLLOW_cap_in_predefined686);
					cap73=cap();
					state._fsp--;

					adaptor.addChild(root_0, cap73.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:42: ash
					{
					pushFollow(FOLLOW_ash_in_predefined688);
					ash74=ash();
					state._fsp--;

					adaptor.addChild(root_0, ash74.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:46: len
					{
					pushFollow(FOLLOW_len_in_predefined690);
					len75=len();
					state._fsp--;

					adaptor.addChild(root_0, len75.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:50: maxMin
					{
					pushFollow(FOLLOW_maxMin_in_predefined692);
					maxMin76=maxMin();
					state._fsp--;

					adaptor.addChild(root_0, maxMin76.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:57: size
					{
					pushFollow(FOLLOW_size_in_predefined694);
					size77=size();
					state._fsp--;

					adaptor.addChild(root_0, size77.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:62: inc
					{
					pushFollow(FOLLOW_inc_in_predefined696);
					inc78=inc();
					state._fsp--;

					adaptor.addChild(root_0, inc78.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:66: dec
					{
					pushFollow(FOLLOW_dec_in_predefined698);
					dec79=dec();
					state._fsp--;

					adaptor.addChild(root_0, dec79.getTree());

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:70: incl
					{
					pushFollow(FOLLOW_incl_in_predefined700);
					incl80=incl();
					state._fsp--;

					adaptor.addChild(root_0, incl80.getTree());

					}
					break;
				case 11 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:75: excl
					{
					pushFollow(FOLLOW_excl_in_predefined702);
					excl81=excl();
					state._fsp--;

					adaptor.addChild(root_0, excl81.getTree());

					}
					break;
				case 12 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:80: copy
					{
					pushFollow(FOLLOW_copy_in_predefined704);
					copy82=copy();
					state._fsp--;

					adaptor.addChild(root_0, copy82.getTree());

					}
					break;
				case 13 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:85: neW
					{
					pushFollow(FOLLOW_neW_in_predefined706);
					neW83=neW();
					state._fsp--;

					adaptor.addChild(root_0, neW83.getTree());

					}
					break;
				case 14 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:89: halt
					{
					pushFollow(FOLLOW_halt_in_predefined708);
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:29: IDENT ( '*' )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT86=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef768); 
			IDENT86_tree = (Object)adaptor.create(IDENT86);
			adaptor.addChild(root_0, IDENT86_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:35: ( '*' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==31) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:35: '*'
					{
					char_literal87=(Token)match(input,31,FOLLOW_31_in_identdef770); 
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
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:23: ( identdef '=' constExpression -> ^( '=' identdef constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:29: identdef '=' constExpression
			{
			pushFollow(FOLLOW_identdef_in_constantDeclaration785);
			identdef88=identdef();
			state._fsp--;

			stream_identdef.add(identdef88.getTree());
			char_literal89=(Token)match(input,43,FOLLOW_43_in_constantDeclaration787);  
			stream_43.add(char_literal89);

			pushFollow(FOLLOW_constExpression_in_constantDeclaration789);
			constExpression90=constExpression();
			state._fsp--;

			stream_constExpression.add(constExpression90.getTree());
			// AST REWRITE
			// elements: constExpression, identdef, 43
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 41:29: -> ^( '=' identdef constExpression )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:32: ^( '=' identdef constExpression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_43.nextNode(), root_1);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:1: constExpression : expression ;
	public final OberonParser.constExpression_return constExpression() throws RecognitionException {
		OberonParser.constExpression_return retval = new OberonParser.constExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression91 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:23: ( expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:29: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constExpression852);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:1: typeDeclaration : identdef '=' type -> ^( TYPE_DECL identdef type ) ;
	public final OberonParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		OberonParser.typeDeclaration_return retval = new OberonParser.typeDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal93=null;
		ParserRuleReturnScope identdef92 =null;
		ParserRuleReturnScope type94 =null;

		Object char_literal93_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:23: ( identdef '=' type -> ^( TYPE_DECL identdef type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:29: identdef '=' type
			{
			pushFollow(FOLLOW_identdef_in_typeDeclaration870);
			identdef92=identdef();
			state._fsp--;

			stream_identdef.add(identdef92.getTree());
			char_literal93=(Token)match(input,43,FOLLOW_43_in_typeDeclaration872);  
			stream_43.add(char_literal93);

			pushFollow(FOLLOW_type_in_typeDeclaration874);
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
			// 46:29: -> ^( TYPE_DECL identdef type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:32: ^( TYPE_DECL identdef type )
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:1: type : ( qualident | arrayType | recordType | pointerType | procedureType );
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:23: ( qualident | arrayType | recordType | pointerType | procedureType )
			int alt8=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt8=1;
				}
				break;
			case 47:
				{
				alt8=2;
				}
				break;
			case 81:
				{
				alt8=3;
				}
				break;
			case 79:
				{
				alt8=4;
				}
				break;
			case 80:
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:29: qualident
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualident_in_type959);
					qualident95=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident95.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:41: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type963);
					arrayType96=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType96.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:53: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type967);
					recordType97=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType97.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:66: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type971);
					pointerType98=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType98.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:80: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type975);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:1: arrayType : 'ARRAY' length ( ',' length )* 'OF' type -> ^( 'ARRAY' ^( LENGTH ( length )* ) type ) ;
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
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_length=new RewriteRuleSubtreeStream(adaptor,"rule length");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:23: ( 'ARRAY' length ( ',' length )* 'OF' type -> ^( 'ARRAY' ^( LENGTH ( length )* ) type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:29: 'ARRAY' length ( ',' length )* 'OF' type
			{
			string_literal100=(Token)match(input,47,FOLLOW_47_in_arrayType999);  
			stream_47.add(string_literal100);

			pushFollow(FOLLOW_length_in_arrayType1001);
			length101=length();
			state._fsp--;

			stream_length.add(length101.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:44: ( ',' length )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==33) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:45: ',' length
					{
					char_literal102=(Token)match(input,33,FOLLOW_33_in_arrayType1004);  
					stream_33.add(char_literal102);

					pushFollow(FOLLOW_length_in_arrayType1006);
					length103=length();
					state._fsp--;

					stream_length.add(length103.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			string_literal104=(Token)match(input,77,FOLLOW_77_in_arrayType1010);  
			stream_77.add(string_literal104);

			pushFollow(FOLLOW_type_in_arrayType1012);
			type105=type();
			state._fsp--;

			stream_type.add(type105.getTree());
			// AST REWRITE
			// elements: 47, length, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:29: -> ^( 'ARRAY' ^( LENGTH ( length )* ) type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:32: ^( 'ARRAY' ^( LENGTH ( length )* ) type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_47.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:42: ^( LENGTH ( length )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LENGTH, "LENGTH"), root_2);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:51: ( length )*
				while ( stream_length.hasNext() ) {
					adaptor.addChild(root_2, stream_length.nextTree());
				}
				stream_length.reset();

				adaptor.addChild(root_1, root_2);
				}

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
	// $ANTLR end "arrayType"


	public static class length_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "length"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:1: length : constExpression ;
	public final OberonParser.length_return length() throws RecognitionException {
		OberonParser.length_return retval = new OberonParser.length_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constExpression106 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:23: ( constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:29: constExpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_length1084);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:1: recordType : 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' -> ^( 'RECORD' ( baseType )? fieldListSequence ) ;
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
		RewriteRuleSubtreeStream stream_fieldListSequence=new RewriteRuleSubtreeStream(adaptor,"rule fieldListSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:23: ( 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' -> ^( 'RECORD' ( baseType )? fieldListSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:29: 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END'
			{
			string_literal107=(Token)match(input,81,FOLLOW_81_in_recordType1107);  
			stream_81.add(string_literal107);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:38: ( '(' baseType ')' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==29) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:39: '(' baseType ')'
					{
					char_literal108=(Token)match(input,29,FOLLOW_29_in_recordType1110);  
					stream_29.add(char_literal108);

					pushFollow(FOLLOW_baseType_in_recordType1112);
					baseType109=baseType();
					state._fsp--;

					stream_baseType.add(baseType109.getTree());
					char_literal110=(Token)match(input,30,FOLLOW_30_in_recordType1114);  
					stream_30.add(char_literal110);

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType1118);
			fieldListSequence111=fieldListSequence();
			state._fsp--;

			stream_fieldListSequence.add(fieldListSequence111.getTree());
			string_literal112=(Token)match(input,58,FOLLOW_58_in_recordType1120);  
			stream_58.add(string_literal112);

			// AST REWRITE
			// elements: baseType, fieldListSequence, 81
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:29: -> ^( 'RECORD' ( baseType )? fieldListSequence )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:32: ^( 'RECORD' ( baseType )? fieldListSequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_81.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:43: ( baseType )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:1: baseType : qualident ;
	public final OberonParser.baseType_return baseType() throws RecognitionException {
		OberonParser.baseType_return retval = new OberonParser.baseType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident113 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:23: ( qualident )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:29: qualident
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_baseType1185);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:1: fieldListSequence : fieldList ( ';' ! fieldList )* ;
	public final OberonParser.fieldListSequence_return fieldListSequence() throws RecognitionException {
		OberonParser.fieldListSequence_return retval = new OberonParser.fieldListSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope fieldList114 =null;
		ParserRuleReturnScope fieldList116 =null;

		Object char_literal115_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:23: ( fieldList ( ';' ! fieldList )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:29: fieldList ( ';' ! fieldList )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fieldList_in_fieldListSequence1201);
			fieldList114=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList114.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:39: ( ';' ! fieldList )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==40) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:40: ';' ! fieldList
					{
					char_literal115=(Token)match(input,40,FOLLOW_40_in_fieldListSequence1204); 
					pushFollow(FOLLOW_fieldList_in_fieldListSequence1207);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:1: fieldList : ( identList ':' ^ type )? ;
	public final OberonParser.fieldList_return fieldList() throws RecognitionException {
		OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope identList117 =null;
		ParserRuleReturnScope type119 =null;

		Object char_literal118_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:23: ( ( identList ':' ^ type )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:29: ( identList ':' ^ type )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:29: ( identList ':' ^ type )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:30: identList ':' ^ type
					{
					pushFollow(FOLLOW_identList_in_fieldList1235);
					identList117=identList();
					state._fsp--;

					adaptor.addChild(root_0, identList117.getTree());

					char_literal118=(Token)match(input,38,FOLLOW_38_in_fieldList1237); 
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					root_0 = (Object)adaptor.becomeRoot(char_literal118_tree, root_0);

					pushFollow(FOLLOW_type_in_fieldList1240);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:1: identList : identdef ( ',' identdef )* ;
	public final OberonParser.identList_return identList() throws RecognitionException {
		OberonParser.identList_return retval = new OberonParser.identList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope identdef120 =null;
		ParserRuleReturnScope identdef122 =null;

		Object char_literal121_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:23: ( identdef ( ',' identdef )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:29: identdef ( ',' identdef )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_identList1266);
			identdef120=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef120.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:38: ( ',' identdef )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==33) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:39: ',' identdef
					{
					char_literal121=(Token)match(input,33,FOLLOW_33_in_identList1269); 
					char_literal121_tree = (Object)adaptor.create(char_literal121);
					adaptor.addChild(root_0, char_literal121_tree);

					pushFollow(FOLLOW_identdef_in_identList1271);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:1: pointerType : 'POINTER TO' ^ type ;
	public final OberonParser.pointerType_return pointerType() throws RecognitionException {
		OberonParser.pointerType_return retval = new OberonParser.pointerType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal123=null;
		ParserRuleReturnScope type124 =null;

		Object string_literal123_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:23: ( 'POINTER TO' ^ type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:66:29: 'POINTER TO' ^ type
			{
			root_0 = (Object)adaptor.nil();


			string_literal123=(Token)match(input,79,FOLLOW_79_in_pointerType1295); 
			string_literal123_tree = (Object)adaptor.create(string_literal123);
			root_0 = (Object)adaptor.becomeRoot(string_literal123_tree, root_0);

			pushFollow(FOLLOW_type_in_pointerType1298);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:1: procedureType : 'PROCEDURE' ^ ( formalParameters )? ;
	public final OberonParser.procedureType_return procedureType() throws RecognitionException {
		OberonParser.procedureType_return retval = new OberonParser.procedureType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal125=null;
		ParserRuleReturnScope formalParameters126 =null;

		Object string_literal125_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:23: ( 'PROCEDURE' ^ ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:29: 'PROCEDURE' ^ ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal125=(Token)match(input,80,FOLLOW_80_in_procedureType1318); 
			string_literal125_tree = (Object)adaptor.create(string_literal125);
			root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:42: ( formalParameters )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==29) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:42: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureType1321);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:1: variableDeclaration : identList ':' type -> ^( DECLARE identList type ) ;
	public final OberonParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		OberonParser.variableDeclaration_return retval = new OberonParser.variableDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal128=null;
		ParserRuleReturnScope identList127 =null;
		ParserRuleReturnScope type129 =null;

		Object char_literal128_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:23: ( identList ':' type -> ^( DECLARE identList type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:29: identList ':' type
			{
			pushFollow(FOLLOW_identList_in_variableDeclaration1336);
			identList127=identList();
			state._fsp--;

			stream_identList.add(identList127.getTree());
			char_literal128=(Token)match(input,38,FOLLOW_38_in_variableDeclaration1338);  
			stream_38.add(char_literal128);

			pushFollow(FOLLOW_type_in_variableDeclaration1340);
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
			// 71:29: -> ^( DECLARE identList type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:32: ^( DECLARE identList type )
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:1: qualident : ( options {greedy=true; } : IDENT '.' )? IDENT -> ^( ID ( IDENT )* ) ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:23: ( ( options {greedy=true; } : IDENT '.' )? IDENT -> ^( ID ( IDENT )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:29: ( options {greedy=true; } : IDENT '.' )? IDENT
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:29: ( options {greedy=true; } : IDENT '.' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==IDENT) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==35) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==IDENT) ) {
						alt15=1;
					}
				}
			}
			switch (alt15) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:53: IDENT '.'
					{
					IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1435);  
					stream_IDENT.add(IDENT130);

					char_literal131=(Token)match(input,35,FOLLOW_35_in_qualident1437);  
					stream_35.add(char_literal131);

					}
					break;

			}

			IDENT132=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1441);  
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
			// 75:29: -> ^( ID ( IDENT )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:32: ^( ID ( IDENT )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:37: ( IDENT )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:1: designator : qualident ( options {greedy=true; } : '.' ! IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )* ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:23: ( qualident ( options {greedy=true; } : '.' ! IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:29: qualident ( options {greedy=true; } : '.' ! IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_designator1502);
			qualident133=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident133.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:39: ( options {greedy=true; } : '.' ! IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )*
			loop16:
			while (true) {
				int alt16=5;
				switch ( input.LA(1) ) {
				case 29:
					{
					int LA16_1 = input.LA(2);
					if ( (LA16_1==IDENT) ) {
						int LA16_6 = input.LA(3);
						if ( (LA16_6==35) ) {
							int LA16_7 = input.LA(4);
							if ( (LA16_7==IDENT) ) {
								int LA16_9 = input.LA(5);
								if ( (LA16_9==30) ) {
									alt16=3;
								}

							}

						}
						else if ( (LA16_6==30) ) {
							alt16=3;
						}

					}

					}
					break;
				case 35:
					{
					alt16=1;
					}
					break;
				case 91:
					{
					alt16=2;
					}
					break;
				case 93:
					{
					alt16=4;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:63: '.' ! IDENT
					{
					char_literal134=(Token)match(input,35,FOLLOW_35_in_designator1513); 
					IDENT135=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator1516); 
					IDENT135_tree = (Object)adaptor.create(IDENT135);
					adaptor.addChild(root_0, IDENT135_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:76: '[' ! expList ']' !
					{
					char_literal136=(Token)match(input,91,FOLLOW_91_in_designator1520); 
					pushFollow(FOLLOW_expList_in_designator1523);
					expList137=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList137.getTree());

					char_literal138=(Token)match(input,92,FOLLOW_92_in_designator1525); 
					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:96: '(' ! qualident ')' !
					{
					char_literal139=(Token)match(input,29,FOLLOW_29_in_designator1530); 
					pushFollow(FOLLOW_qualident_in_designator1533);
					qualident140=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident140.getTree());

					char_literal141=(Token)match(input,30,FOLLOW_30_in_designator1535); 
					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:118: '^'
					{
					char_literal142=(Token)match(input,93,FOLLOW_93_in_designator1540); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:1: expList : expression ( ',' expression )* ;
	public final OberonParser.expList_return expList() throws RecognitionException {
		OberonParser.expList_return retval = new OberonParser.expList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope expression145 =null;

		Object char_literal144_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:23: ( expression ( ',' expression )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:29: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expList1568);
			expression143=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression143.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:40: ( ',' expression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==33) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:41: ',' expression
					{
					char_literal144=(Token)match(input,33,FOLLOW_33_in_expList1571); 
					char_literal144_tree = (Object)adaptor.create(char_literal144);
					adaptor.addChild(root_0, char_literal144_tree);

					pushFollow(FOLLOW_expression_in_expList1573);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:1: expression : simpleExpression ( relation ^ simpleExpression )? ;
	public final OberonParser.expression_return expression() throws RecognitionException {
		OberonParser.expression_return retval = new OberonParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleExpression146 =null;
		ParserRuleReturnScope relation147 =null;
		ParserRuleReturnScope simpleExpression148 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:23: ( simpleExpression ( relation ^ simpleExpression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:29: simpleExpression ( relation ^ simpleExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleExpression_in_expression1598);
			simpleExpression146=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression146.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:46: ( relation ^ simpleExpression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==27||(LA18_0 >= 41 && LA18_0 <= 45)||LA18_0==64||LA18_0==67) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:47: relation ^ simpleExpression
					{
					pushFollow(FOLLOW_relation_in_expression1601);
					relation147=relation();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(relation147.getTree(), root_0);
					pushFollow(FOLLOW_simpleExpression_in_expression1604);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:84:1: relation : ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' );
	public final OberonParser.relation_return relation() throws RecognitionException {
		OberonParser.relation_return retval = new OberonParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set149=null;

		Object set149_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:84:23: ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set149=input.LT(1);
			if ( input.LA(1)==27||(input.LA(1) >= 41 && input.LA(1) <= 45)||input.LA(1)==64||input.LA(1)==67 ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:1: simpleExpression : ( '+' | '-' )? term ( addOperator ^ term )* ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:23: ( ( '+' | '-' )? term ( addOperator ^ term )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:29: ( '+' | '-' )? term ( addOperator ^ term )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:29: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==32||LA19_0==34) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					set150=input.LT(1);
					if ( input.LA(1)==32||input.LA(1)==34 ) {
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

			pushFollow(FOLLOW_term_in_simpleExpression1700);
			term151=term();
			state._fsp--;

			adaptor.addChild(root_0, term151.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:45: ( addOperator ^ term )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==32||LA20_0==34||LA20_0==78) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:46: addOperator ^ term
					{
					pushFollow(FOLLOW_addOperator_in_simpleExpression1703);
					addOperator152=addOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addOperator152.getTree(), root_0);
					pushFollow(FOLLOW_term_in_simpleExpression1706);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:1: addOperator : ( '+' | '-' | 'OR' );
	public final OberonParser.addOperator_return addOperator() throws RecognitionException {
		OberonParser.addOperator_return retval = new OberonParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set154=null;

		Object set154_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:88:23: ( '+' | '-' | 'OR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set154=input.LT(1);
			if ( input.LA(1)==32||input.LA(1)==34||input.LA(1)==78 ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:1: term : factor ( mulOperator ^ factor )* ;
	public final OberonParser.term_return term() throws RecognitionException {
		OberonParser.term_return retval = new OberonParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor155 =null;
		ParserRuleReturnScope mulOperator156 =null;
		ParserRuleReturnScope factor157 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:23: ( factor ( mulOperator ^ factor )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:29: factor ( mulOperator ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term1767);
			factor155=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor155.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:36: ( mulOperator ^ factor )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==28||LA21_0==31||LA21_0==37||LA21_0==54||LA21_0==72) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:37: mulOperator ^ factor
					{
					pushFollow(FOLLOW_mulOperator_in_term1770);
					mulOperator156=mulOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(mulOperator156.getTree(), root_0);
					pushFollow(FOLLOW_factor_in_term1773);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:1: mulOperator : ( '*' | '/' | 'DIV' | 'MOD' | '&' );
	public final OberonParser.mulOperator_return mulOperator() throws RecognitionException {
		OberonParser.mulOperator_return retval = new OberonParser.mulOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set158=null;

		Object set158_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:92:23: ( '*' | '/' | 'DIV' | 'MOD' | '&' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set158=input.LT(1);
			if ( input.LA(1)==28||input.LA(1)==31||input.LA(1)==37||input.LA(1)==54||input.LA(1)==72 ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:1: factor : ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' ! expression ^ ')' !| '~' factor );
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:23: ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' ! expression ^ ')' !| '~' factor )
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
			case 75:
				{
				alt23=4;
				}
				break;
			case 95:
				{
				alt23=5;
				}
				break;
			case IDENT:
				{
				alt23=6;
				}
				break;
			case 29:
				{
				alt23=7;
				}
				break;
			case 98:
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:29: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor1832);
					number159=number();
					state._fsp--;

					adaptor.addChild(root_0, number159.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:38: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST160=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor1836); 
					CHARCONST160_tree = (Object)adaptor.create(CHARCONST160);
					adaptor.addChild(root_0, CHARCONST160_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:50: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING161=(Token)match(input,STRING,FOLLOW_STRING_in_factor1840); 
					STRING161_tree = (Object)adaptor.create(STRING161);
					adaptor.addChild(root_0, STRING161_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:59: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal162=(Token)match(input,75,FOLLOW_75_in_factor1844); 
					string_literal162_tree = (Object)adaptor.create(string_literal162);
					adaptor.addChild(root_0, string_literal162_tree);

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:67: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor1848);
					set163=set();
					state._fsp--;

					adaptor.addChild(root_0, set163.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:73: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor1852);
					designator164=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator164.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:84: ( actualParameters )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==29) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:84: actualParameters
							{
							pushFollow(FOLLOW_actualParameters_in_factor1854);
							actualParameters165=actualParameters();
							state._fsp--;

							adaptor.addChild(root_0, actualParameters165.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:104: '(' ! expression ^ ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal166=(Token)match(input,29,FOLLOW_29_in_factor1859); 
					pushFollow(FOLLOW_expression_in_factor1862);
					expression167=expression();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(expression167.getTree(), root_0);
					char_literal168=(Token)match(input,30,FOLLOW_30_in_factor1865); 
					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:128: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal169=(Token)match(input,98,FOLLOW_98_in_factor1870); 
					char_literal169_tree = (Object)adaptor.create(char_literal169);
					adaptor.addChild(root_0, char_literal169_tree);

					pushFollow(FOLLOW_factor_in_factor1872);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:1: set : '{' ( element ( ',' element )* )? '}' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:23: ( '{' ( element ( ',' element )* )? '}' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:29: '{' ( element ( ',' element )* )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal171=(Token)match(input,95,FOLLOW_95_in_set1902); 
			char_literal171_tree = (Object)adaptor.create(char_literal171);
			adaptor.addChild(root_0, char_literal171_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:33: ( element ( ',' element )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==CHARCONST||LA25_0==IDENT||LA25_0==INTEGER||LA25_0==REAL||LA25_0==STRING||LA25_0==29||LA25_0==32||LA25_0==34||LA25_0==75||LA25_0==95||LA25_0==98) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:34: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set1905);
					element172=element();
					state._fsp--;

					adaptor.addChild(root_0, element172.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:42: ( ',' element )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==33) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:43: ',' element
							{
							char_literal173=(Token)match(input,33,FOLLOW_33_in_set1908); 
							char_literal173_tree = (Object)adaptor.create(char_literal173);
							adaptor.addChild(root_0, char_literal173_tree);

							pushFollow(FOLLOW_element_in_set1910);
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

			char_literal175=(Token)match(input,97,FOLLOW_97_in_set1917); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:1: element : expression ( '..' expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal177=null;
		ParserRuleReturnScope expression176 =null;
		ParserRuleReturnScope expression178 =null;

		Object string_literal177_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:23: ( expression ( '..' expression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:29: expression ( '..' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element1943);
			expression176=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression176.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:40: ( '..' expression )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==36) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:42: '..' expression
					{
					string_literal177=(Token)match(input,36,FOLLOW_36_in_element1947); 
					string_literal177_tree = (Object)adaptor.create(string_literal177);
					adaptor.addChild(root_0, string_literal177_tree);

					pushFollow(FOLLOW_expression_in_element1949);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:1: actualParameters : '(' ! ( expList )? ')' !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:23: ( '(' ! ( expList )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:29: '(' ! ( expList )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal179=(Token)match(input,29,FOLLOW_29_in_actualParameters1968); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:34: ( expList )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==CHARCONST||LA27_0==IDENT||LA27_0==INTEGER||LA27_0==REAL||LA27_0==STRING||LA27_0==29||LA27_0==32||LA27_0==34||LA27_0==75||LA27_0==95||LA27_0==98) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:34: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters1971);
					expList180=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList180.getTree());

					}
					break;

			}

			char_literal181=(Token)match(input,30,FOLLOW_30_in_actualParameters1974); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:1: statement : ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:23: ( ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:29: ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:29: ( predefined | statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			int alt29=11;
			switch ( input.LA(1) ) {
				case 46:
				case 48:
				case 50:
				case 52:
				case 53:
				case 59:
				case 61:
				case 65:
				case 66:
				case 68:
				case 70:
				case 71:
				case 74:
				case 76:
				case 84:
				case 95:
					{
					alt29=1;
					}
					break;
				case IDENT:
					{
					alt29=2;
					}
					break;
				case 62:
					{
					alt29=3;
					}
					break;
				case 94:
					{
					alt29=4;
					}
					break;
				case 89:
					{
					alt29=5;
					}
					break;
				case 82:
					{
					alt29=6;
					}
					break;
				case 69:
					{
					alt29=7;
					}
					break;
				case 90:
					{
					alt29=8;
					}
					break;
				case 60:
					{
					alt29=9;
					}
					break;
				case 83:
					{
					alt29=10;
					}
					break;
			}
			switch (alt29) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:30: predefined
					{
					pushFollow(FOLLOW_predefined_in_statement2000);
					predefined182=predefined();
					state._fsp--;

					adaptor.addChild(root_0, predefined182.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:41: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement2002);
					statement2183=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement2183.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:52: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement2004);
					ifStatement184=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement184.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:64: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement2006);
					caseStatement185=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement185.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:78: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement2008);
					whileStatement186=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement186.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:93: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement2010);
					repeatStatement187=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement187.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:109: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement2012);
					loopStatement188=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement188.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:123: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement2014);
					withStatement189=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement189.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:138: 'EXIT'
					{
					string_literal190=(Token)match(input,60,FOLLOW_60_in_statement2017); 
					string_literal190_tree = (Object)adaptor.create(string_literal190);
					adaptor.addChild(root_0, string_literal190_tree);

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:147: 'RETURN' ( expression )?
					{
					string_literal191=(Token)match(input,83,FOLLOW_83_in_statement2021); 
					string_literal191_tree = (Object)adaptor.create(string_literal191);
					adaptor.addChild(root_0, string_literal191_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:156: ( expression )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==CHARCONST||LA28_0==IDENT||LA28_0==INTEGER||LA28_0==REAL||LA28_0==STRING||LA28_0==29||LA28_0==32||LA28_0==34||LA28_0==75||LA28_0==95||LA28_0==98) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:156: expression
							{
							pushFollow(FOLLOW_expression_in_statement2023);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:1: statement2 : designator ( ( ':=' expression ) | procedureCall ) -> ^( ASSIGN designator ( expression )? ( procedureCall )? ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal194=null;
		ParserRuleReturnScope designator193 =null;
		ParserRuleReturnScope expression195 =null;
		ParserRuleReturnScope procedureCall196 =null;

		Object string_literal194_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_designator=new RewriteRuleSubtreeStream(adaptor,"rule designator");
		RewriteRuleSubtreeStream stream_procedureCall=new RewriteRuleSubtreeStream(adaptor,"rule procedureCall");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:23: ( designator ( ( ':=' expression ) | procedureCall ) -> ^( ASSIGN designator ( expression )? ( procedureCall )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:29: designator ( ( ':=' expression ) | procedureCall )
			{
			pushFollow(FOLLOW_designator_in_statement22050);
			designator193=designator();
			state._fsp--;

			stream_designator.add(designator193.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:41: ( ( ':=' expression ) | procedureCall )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==39) ) {
				alt30=1;
			}
			else if ( (LA30_0==29||LA30_0==40||(LA30_0 >= 56 && LA30_0 <= 58)||LA30_0==87||LA30_0==96) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:42: ( ':=' expression )
					{
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:42: ( ':=' expression )
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:43: ':=' expression
					{
					string_literal194=(Token)match(input,39,FOLLOW_39_in_statement22055);  
					stream_39.add(string_literal194);

					pushFollow(FOLLOW_expression_in_statement22057);
					expression195=expression();
					state._fsp--;

					stream_expression.add(expression195.getTree());
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:104:62: procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement22062);
					procedureCall196=procedureCall();
					state._fsp--;

					stream_procedureCall.add(procedureCall196.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: procedureCall, expression, designator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:29: -> ^( ASSIGN designator ( expression )? ( procedureCall )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:32: ^( ASSIGN designator ( expression )? ( procedureCall )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_designator.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:52: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:64: ( procedureCall )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:1: procedureCall : ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualParameters197 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:23: ( ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:29: ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:29: ( actualParameters )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==29) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:29: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall2128);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:1: statementSequence : statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal199=null;
		ParserRuleReturnScope statement198 =null;
		ParserRuleReturnScope statement200 =null;

		Object char_literal199_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:23: ( statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:29: statement ( ';' statement )*
			{
			pushFollow(FOLLOW_statement_in_statementSequence2145);
			statement198=statement();
			state._fsp--;

			stream_statement.add(statement198.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:39: ( ';' statement )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==40) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:41: ';' statement
					{
					char_literal199=(Token)match(input,40,FOLLOW_40_in_statementSequence2149);  
					stream_40.add(char_literal199);

					pushFollow(FOLLOW_statement_in_statementSequence2151);
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
			// 110:29: -> ^( BLOCK statement ( statement )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:32: ^( BLOCK statement ( statement )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_statement.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:110:50: ( statement )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:1: ifStatement : 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? ) ;
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
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:23: ( 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:29: 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END'
			{
			string_literal201=(Token)match(input,62,FOLLOW_62_in_ifStatement2219);  
			stream_62.add(string_literal201);

			pushFollow(FOLLOW_expression_in_ifStatement2221);
			expression202=expression();
			state._fsp--;

			stream_expression.add(expression202.getTree());
			string_literal203=(Token)match(input,85,FOLLOW_85_in_ifStatement2223);  
			stream_85.add(string_literal203);

			pushFollow(FOLLOW_statementSequence_in_ifStatement2227);
			s1=statementSequence();
			state._fsp--;

			stream_statementSequence.add(s1.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:73: ( 'ELSIF' expression 'THEN' s2= statementSequence )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==57) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:74: 'ELSIF' expression 'THEN' s2= statementSequence
					{
					string_literal204=(Token)match(input,57,FOLLOW_57_in_ifStatement2230);  
					stream_57.add(string_literal204);

					pushFollow(FOLLOW_expression_in_ifStatement2232);
					expression205=expression();
					state._fsp--;

					stream_expression.add(expression205.getTree());
					string_literal206=(Token)match(input,85,FOLLOW_85_in_ifStatement2234);  
					stream_85.add(string_literal206);

					pushFollow(FOLLOW_statementSequence_in_ifStatement2238);
					s2=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s2.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:123: ( 'ELSE' s3= statementSequence )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==56) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:124: 'ELSE' s3= statementSequence
					{
					string_literal207=(Token)match(input,56,FOLLOW_56_in_ifStatement2243);  
					stream_56.add(string_literal207);

					pushFollow(FOLLOW_statementSequence_in_ifStatement2247);
					s3=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s3.getTree());
					}
					break;

			}

			string_literal208=(Token)match(input,58,FOLLOW_58_in_ifStatement2251);  
			stream_58.add(string_literal208);

			// AST REWRITE
			// elements: 56, expression, s3, s2, 62, expression, 57, s1
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
			// 113:29: -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:32: ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( 'ELSE' ( $s3)? )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_62.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:39: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:52: ( $s1)?
				if ( stream_s1.hasNext() ) {
					adaptor.addChild(root_1, stream_s1.nextTree());
				}
				stream_s1.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:56: ( ^( 'ELSIF' ( expression )? ( $s2)? ) )*
				while ( stream_57.hasNext() ) {
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:56: ^( 'ELSIF' ( expression )? ( $s2)? )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_57.nextNode(), root_2);
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:66: ( expression )?
					if ( stream_expression.hasNext() ) {
						adaptor.addChild(root_2, stream_expression.nextTree());
					}
					stream_expression.reset();

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:80: ( $s2)?
					if ( stream_s2.hasNext() ) {
						adaptor.addChild(root_2, stream_s2.nextTree());
					}
					stream_s2.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_57.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:86: ( 'ELSE' ( $s3)? )?
				if ( stream_56.hasNext()||stream_s3.hasNext() ) {
					adaptor.addChild(root_1, stream_56.nextNode());
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:95: ( $s3)?
					if ( stream_s3.hasNext() ) {
						adaptor.addChild(root_1, stream_s3.nextTree());
					}
					stream_s3.reset();

				}
				stream_56.reset();
				stream_s3.reset();

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) ;
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
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_casE=new RewriteRuleSubtreeStream(adaptor,"rule casE");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:29: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			string_literal209=(Token)match(input,94,FOLLOW_94_in_caseStatement2338);  
			stream_94.add(string_literal209);

			pushFollow(FOLLOW_expression_in_caseStatement2340);
			expression210=expression();
			state._fsp--;

			stream_expression.add(expression210.getTree());
			string_literal211=(Token)match(input,77,FOLLOW_77_in_caseStatement2342);  
			stream_77.add(string_literal211);

			pushFollow(FOLLOW_casE_in_caseStatement2344);
			casE212=casE();
			state._fsp--;

			stream_casE.add(casE212.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:57: ( '|' casE )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==96) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:58: '|' casE
					{
					char_literal213=(Token)match(input,96,FOLLOW_96_in_caseStatement2347);  
					stream_96.add(char_literal213);

					pushFollow(FOLLOW_casE_in_caseStatement2349);
					casE214=casE();
					state._fsp--;

					stream_casE.add(casE214.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:69: ( 'ELSE' statementSequence )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==56) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:70: 'ELSE' statementSequence
					{
					string_literal215=(Token)match(input,56,FOLLOW_56_in_caseStatement2354);  
					stream_56.add(string_literal215);

					pushFollow(FOLLOW_statementSequence_in_caseStatement2356);
					statementSequence216=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence216.getTree());
					}
					break;

			}

			string_literal217=(Token)match(input,58,FOLLOW_58_in_caseStatement2360);  
			stream_58.add(string_literal217);

			// AST REWRITE
			// elements: casE, 77, 94, 96, expression, statementSequence, casE, 58, 56
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 116:29: -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:32: ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_94.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_77.nextNode());
				adaptor.addChild(root_1, stream_casE.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:62: ( '|' casE )*
				while ( stream_96.hasNext()||stream_casE.hasNext() ) {
					adaptor.addChild(root_1, stream_96.nextNode());
					adaptor.addChild(root_1, stream_casE.nextTree());
				}
				stream_96.reset();
				stream_casE.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:116:74: ( 'ELSE' statementSequence )?
				if ( stream_statementSequence.hasNext()||stream_56.hasNext() ) {
					adaptor.addChild(root_1, stream_56.nextNode());
					adaptor.addChild(root_1, stream_statementSequence.nextTree());
				}
				stream_statementSequence.reset();
				stream_56.reset();

				adaptor.addChild(root_1, stream_58.nextNode());
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal219=null;
		ParserRuleReturnScope caseLabelList218 =null;
		ParserRuleReturnScope statementSequence220 =null;

		Object char_literal219_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:29: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:29: ( caseLabelList ':' statementSequence )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CHARCONST||LA37_0==IDENT||LA37_0==INTEGER||LA37_0==REAL||LA37_0==STRING||LA37_0==29||LA37_0==32||LA37_0==34||LA37_0==75||LA37_0==95||LA37_0==98) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:30: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE2447);
					caseLabelList218=caseLabelList();
					state._fsp--;

					adaptor.addChild(root_0, caseLabelList218.getTree());

					char_literal219=(Token)match(input,38,FOLLOW_38_in_casE2449); 
					char_literal219_tree = (Object)adaptor.create(char_literal219);
					adaptor.addChild(root_0, char_literal219_tree);

					pushFollow(FOLLOW_statementSequence_in_casE2451);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal222=null;
		ParserRuleReturnScope caseLabels221 =null;
		ParserRuleReturnScope caseLabels223 =null;

		Object char_literal222_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:29: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList2473);
			caseLabels221=caseLabels();
			state._fsp--;

			adaptor.addChild(root_0, caseLabels221.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:40: ( ',' caseLabels )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==33) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:41: ',' caseLabels
					{
					char_literal222=(Token)match(input,33,FOLLOW_33_in_caseLabelList2476); 
					char_literal222_tree = (Object)adaptor.create(char_literal222);
					adaptor.addChild(root_0, char_literal222_tree);

					pushFollow(FOLLOW_caseLabels_in_caseLabelList2478);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal225=null;
		ParserRuleReturnScope constExpression224 =null;
		ParserRuleReturnScope constExpression226 =null;

		Object string_literal225_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:29: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels2503);
			constExpression224=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression224.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:45: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:46: '..' constExpression
			{
			string_literal225=(Token)match(input,36,FOLLOW_36_in_caseLabels2506); 
			string_literal225_tree = (Object)adaptor.create(string_literal225);
			adaptor.addChild(root_0, string_literal225_tree);

			pushFollow(FOLLOW_constExpression_in_caseLabels2508);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) ;
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
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:23: ( 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:29: 'WHILE' expression 'DO' statementSequence 'END'
			{
			string_literal227=(Token)match(input,89,FOLLOW_89_in_whileStatement2528);  
			stream_89.add(string_literal227);

			pushFollow(FOLLOW_expression_in_whileStatement2530);
			expression228=expression();
			state._fsp--;

			stream_expression.add(expression228.getTree());
			string_literal229=(Token)match(input,55,FOLLOW_55_in_whileStatement2532);  
			stream_55.add(string_literal229);

			pushFollow(FOLLOW_statementSequence_in_whileStatement2534);
			statementSequence230=statementSequence();
			state._fsp--;

			stream_statementSequence.add(statementSequence230.getTree());
			string_literal231=(Token)match(input,58,FOLLOW_58_in_whileStatement2536);  
			stream_58.add(string_literal231);

			// AST REWRITE
			// elements: 89, expression, statementSequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:29: -> ^( 'WHILE' expression statementSequence )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:125:32: ^( 'WHILE' expression statementSequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_89.nextNode(), root_1);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:127:1: repeatStatement : 'REPEAT' ^ statementSequence 'UNTIL' ! expression ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:127:23: ( 'REPEAT' ^ statementSequence 'UNTIL' ! expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:127:29: 'REPEAT' ^ statementSequence 'UNTIL' ! expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal232=(Token)match(input,82,FOLLOW_82_in_repeatStatement2593); 
			string_literal232_tree = (Object)adaptor.create(string_literal232);
			root_0 = (Object)adaptor.becomeRoot(string_literal232_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_repeatStatement2596);
			statementSequence233=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence233.getTree());

			string_literal234=(Token)match(input,87,FOLLOW_87_in_repeatStatement2598); 
			pushFollow(FOLLOW_expression_in_repeatStatement2601);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:1: loopStatement : 'LOOP' ^ statementSequence 'END' !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:23: ( 'LOOP' ^ statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:29: 'LOOP' ^ statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal236=(Token)match(input,69,FOLLOW_69_in_loopStatement2621); 
			string_literal236_tree = (Object)adaptor.create(string_literal236);
			root_0 = (Object)adaptor.becomeRoot(string_literal236_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_loopStatement2624);
			statementSequence237=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence237.getTree());

			string_literal238=(Token)match(input,58,FOLLOW_58_in_loopStatement2626); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:1: withStatement : 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:23: ( 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:29: 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal239=(Token)match(input,90,FOLLOW_90_in_withStatement2647); 
			string_literal239_tree = (Object)adaptor.create(string_literal239);
			root_0 = (Object)adaptor.becomeRoot(string_literal239_tree, root_0);

			pushFollow(FOLLOW_qualident_in_withStatement2650);
			qualident240=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident240.getTree());

			char_literal241=(Token)match(input,38,FOLLOW_38_in_withStatement2652); 
			char_literal241_tree = (Object)adaptor.create(char_literal241);
			adaptor.addChild(root_0, char_literal241_tree);

			pushFollow(FOLLOW_qualident_in_withStatement2654);
			qualident242=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident242.getTree());

			string_literal243=(Token)match(input,55,FOLLOW_55_in_withStatement2656); 
			pushFollow(FOLLOW_statementSequence_in_withStatement2659);
			statementSequence244=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence244.getTree());

			string_literal245=(Token)match(input,58,FOLLOW_58_in_withStatement2661); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) ;
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
		RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:23: ( procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:29: procedureHeading ';' procedureBody IDENT
			{
			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration2675);
			procedureHeading246=procedureHeading();
			state._fsp--;

			stream_procedureHeading.add(procedureHeading246.getTree());
			char_literal247=(Token)match(input,40,FOLLOW_40_in_procedureDeclaration2677);  
			stream_40.add(char_literal247);

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration2679);
			procedureBody248=procedureBody();
			state._fsp--;

			stream_procedureBody.add(procedureBody248.getTree());
			IDENT249=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration2681);  
			stream_IDENT.add(IDENT249);

			// AST REWRITE
			// elements: procedureHeading, procedureBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:29: -> ^( PROCEDURE procedureHeading procedureBody )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:134:32: ^( PROCEDURE procedureHeading procedureBody )
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:1: procedureHeading : 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? ;
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
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:23: ( 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:29: 'PROCEDURE' ( '*' )? identdef ( formalParameters )?
			{
			string_literal250=(Token)match(input,80,FOLLOW_80_in_procedureHeading2754);  
			stream_80.add(string_literal250);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:41: ( '*' )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==31) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:41: '*'
					{
					char_literal251=(Token)match(input,31,FOLLOW_31_in_procedureHeading2756);  
					stream_31.add(char_literal251);

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading2759);
			identdef252=identdef();
			state._fsp--;

			stream_identdef.add(identdef252.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:55: ( formalParameters )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==29) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:55: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading2761);
					formalParameters253=formalParameters();
					state._fsp--;

					stream_formalParameters.add(formalParameters253.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: identdef, formalParameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 137:29: -> identdef ( formalParameters )?
			{
				adaptor.addChild(root_0, stream_identdef.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:41: ( formalParameters )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) ;
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
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
		RewriteRuleSubtreeStream stream_declarationSequence=new RewriteRuleSubtreeStream(adaptor,"rule declarationSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:29: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			pushFollow(FOLLOW_declarationSequence_in_procedureBody2818);
			declarationSequence254=declarationSequence();
			state._fsp--;

			stream_declarationSequence.add(declarationSequence254.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:49: ( 'BEGIN' statementSequence )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==49) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:50: 'BEGIN' statementSequence
					{
					string_literal255=(Token)match(input,49,FOLLOW_49_in_procedureBody2821);  
					stream_49.add(string_literal255);

					pushFollow(FOLLOW_statementSequence_in_procedureBody2823);
					statementSequence256=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence256.getTree());
					}
					break;

			}

			string_literal257=(Token)match(input,58,FOLLOW_58_in_procedureBody2827);  
			stream_58.add(string_literal257);

			// AST REWRITE
			// elements: declarationSequence, statementSequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:29: -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:140:32: ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:140:49: ( declarationSequence )?
				if ( stream_declarationSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_declarationSequence.nextTree());
				}
				stream_declarationSequence.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:140:71: ( statementSequence )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:29: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal258=(Token)match(input,80,FOLLOW_80_in_forwardDeclaration2887); 
			string_literal258_tree = (Object)adaptor.create(string_literal258);
			adaptor.addChild(root_0, string_literal258_tree);

			char_literal259=(Token)match(input,93,FOLLOW_93_in_forwardDeclaration2889); 
			char_literal259_tree = (Object)adaptor.create(char_literal259);
			adaptor.addChild(root_0, char_literal259_tree);

			pushFollow(FOLLOW_identdef_in_forwardDeclaration2891);
			identdef260=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef260.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:54: ( formalParameters )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==29) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:54: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration2893);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:1: declarationSequence : ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:24: ( ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:29: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:29: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )*
			loop43:
			while (true) {
				int alt43=4;
				switch ( input.LA(1) ) {
				case 51:
					{
					alt43=1;
					}
					break;
				case 86:
					{
					alt43=2;
					}
					break;
				case 88:
					{
					alt43=3;
					}
					break;
				}
				switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:30: constdeclarationSequence
					{
					pushFollow(FOLLOW_constdeclarationSequence_in_declarationSequence2909);
					constdeclarationSequence262=constdeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, constdeclarationSequence262.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:57: typedeclarationSequence
					{
					pushFollow(FOLLOW_typedeclarationSequence_in_declarationSequence2913);
					typedeclarationSequence263=typedeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, typedeclarationSequence263.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:82: vardeclarationSequence
					{
					pushFollow(FOLLOW_vardeclarationSequence_in_declarationSequence2916);
					vardeclarationSequence264=vardeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, vardeclarationSequence264.getTree());

					}
					break;

				default :
					break loop43;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:109: ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			loop44:
			while (true) {
				int alt44=3;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==80) ) {
					int LA44_2 = input.LA(2);
					if ( (LA44_2==93) ) {
						alt44=2;
					}
					else if ( (LA44_2==IDENT||LA44_2==31) ) {
						alt44=1;
					}

				}

				switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:110: procedureDeclaration ';' !
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence2923);
					procedureDeclaration265=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration265.getTree());

					char_literal266=(Token)match(input,40,FOLLOW_40_in_declarationSequence2925); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:138: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence2930);
					forwardDeclaration267=forwardDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, forwardDeclaration267.getTree());

					char_literal268=(Token)match(input,40,FOLLOW_40_in_declarationSequence2932); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:1: constdeclarationSequence : 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) ;
	public final OberonParser.constdeclarationSequence_return constdeclarationSequence() throws RecognitionException {
		OberonParser.constdeclarationSequence_return retval = new OberonParser.constdeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal269=null;
		Token char_literal271=null;
		ParserRuleReturnScope constantDeclaration270 =null;

		Object string_literal269_tree=null;
		Object char_literal271_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:26: ( 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:29: 'CONST' ( constantDeclaration ';' )*
			{
			string_literal269=(Token)match(input,51,FOLLOW_51_in_constdeclarationSequence2943);  
			stream_51.add(string_literal269);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:37: ( constantDeclaration ';' )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==IDENT) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:38: constantDeclaration ';'
					{
					pushFollow(FOLLOW_constantDeclaration_in_constdeclarationSequence2946);
					constantDeclaration270=constantDeclaration();
					state._fsp--;

					stream_constantDeclaration.add(constantDeclaration270.getTree());
					char_literal271=(Token)match(input,40,FOLLOW_40_in_constdeclarationSequence2948);  
					stream_40.add(char_literal271);

					}
					break;

				default :
					break loop45;
				}
			}

			// AST REWRITE
			// elements: 51, constantDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 147:29: -> ^( 'CONST' ( constantDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:32: ^( 'CONST' ( constantDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_51.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:147:42: ( constantDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:1: typedeclarationSequence : 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) ;
	public final OberonParser.typedeclarationSequence_return typedeclarationSequence() throws RecognitionException {
		OberonParser.typedeclarationSequence_return retval = new OberonParser.typedeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal272=null;
		Token char_literal274=null;
		ParserRuleReturnScope typeDeclaration273 =null;

		Object string_literal272_tree=null;
		Object char_literal274_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:25: ( 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:29: 'TYPE' ( typeDeclaration ';' )*
			{
			string_literal272=(Token)match(input,86,FOLLOW_86_in_typedeclarationSequence3007);  
			stream_86.add(string_literal272);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:36: ( typeDeclaration ';' )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==IDENT) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:38: typeDeclaration ';'
					{
					pushFollow(FOLLOW_typeDeclaration_in_typedeclarationSequence3011);
					typeDeclaration273=typeDeclaration();
					state._fsp--;

					stream_typeDeclaration.add(typeDeclaration273.getTree());
					char_literal274=(Token)match(input,40,FOLLOW_40_in_typedeclarationSequence3013);  
					stream_40.add(char_literal274);

					}
					break;

				default :
					break loop46;
				}
			}

			// AST REWRITE
			// elements: typeDeclaration, 86
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:29: -> ^( 'TYPE' ( typeDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:150:32: ^( 'TYPE' ( typeDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_86.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:150:41: ( typeDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:1: vardeclarationSequence : 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) ;
	public final OberonParser.vardeclarationSequence_return vardeclarationSequence() throws RecognitionException {
		OberonParser.vardeclarationSequence_return retval = new OberonParser.vardeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal275=null;
		Token char_literal277=null;
		ParserRuleReturnScope variableDeclaration276 =null;

		Object string_literal275_tree=null;
		Object char_literal277_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:24: ( 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:29: 'VAR' ( variableDeclaration ';' )*
			{
			string_literal275=(Token)match(input,88,FOLLOW_88_in_vardeclarationSequence3079);  
			stream_88.add(string_literal275);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:35: ( variableDeclaration ';' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==IDENT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:36: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_vardeclarationSequence3082);
					variableDeclaration276=variableDeclaration();
					state._fsp--;

					stream_variableDeclaration.add(variableDeclaration276.getTree());
					char_literal277=(Token)match(input,40,FOLLOW_40_in_vardeclarationSequence3084);  
					stream_40.add(char_literal277);

					}
					break;

				default :
					break loop47;
				}
			}

			// AST REWRITE
			// elements: variableDeclaration, 88
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 153:29: -> ^( 'VAR' ( variableDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:153:32: ^( 'VAR' ( variableDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_88.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:153:40: ( variableDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( F_PARAMS ( fpSection )* ( qualident )? ) ;
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
		RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( F_PARAMS ( fpSection )* ( qualident )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:29: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			char_literal278=(Token)match(input,29,FOLLOW_29_in_formalParameters3154);  
			stream_29.add(char_literal278);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:33: ( fpSection ( ';' fpSection )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==IDENT||LA49_0==88) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:34: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters3157);
					fpSection279=fpSection();
					state._fsp--;

					stream_fpSection.add(fpSection279.getTree());
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:44: ( ';' fpSection )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==40) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:45: ';' fpSection
							{
							char_literal280=(Token)match(input,40,FOLLOW_40_in_formalParameters3160);  
							stream_40.add(char_literal280);

							pushFollow(FOLLOW_fpSection_in_formalParameters3162);
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

			char_literal282=(Token)match(input,30,FOLLOW_30_in_formalParameters3168);  
			stream_30.add(char_literal282);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:67: ( ':' qualident )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==38) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:68: ':' qualident
					{
					char_literal283=(Token)match(input,38,FOLLOW_38_in_formalParameters3171);  
					stream_38.add(char_literal283);

					pushFollow(FOLLOW_qualident_in_formalParameters3173);
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
			// 157:29: -> ^( F_PARAMS ( fpSection )* ( qualident )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:157:32: ^( F_PARAMS ( fpSection )* ( qualident )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(F_PARAMS, "F_PARAMS"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:157:43: ( fpSection )*
				while ( stream_fpSection.hasNext() ) {
					adaptor.addChild(root_1, stream_fpSection.nextTree());
				}
				stream_fpSection.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:157:54: ( qualident )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType -> ^( F_PARAM ^( ID ( IDENT )* ) formalType ) ;
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
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_formalType=new RewriteRuleSubtreeStream(adaptor,"rule formalType");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType -> ^( F_PARAM ^( ID ( IDENT )* ) formalType ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:29: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:29: ( 'VAR' )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==88) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:29: 'VAR'
					{
					string_literal285=(Token)match(input,88,FOLLOW_88_in_fpSection3240);  
					stream_88.add(string_literal285);

					}
					break;

			}

			IDENT286=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection3243);  
			stream_IDENT.add(IDENT286);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:42: ( ',' IDENT )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==33) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:43: ',' IDENT
					{
					char_literal287=(Token)match(input,33,FOLLOW_33_in_fpSection3246);  
					stream_33.add(char_literal287);

					IDENT288=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection3248);  
					stream_IDENT.add(IDENT288);

					}
					break;

				default :
					break loop52;
				}
			}

			char_literal289=(Token)match(input,38,FOLLOW_38_in_fpSection3253);  
			stream_38.add(char_literal289);

			pushFollow(FOLLOW_formalType_in_fpSection3255);
			formalType290=formalType();
			state._fsp--;

			stream_formalType.add(formalType290.getTree());
			// AST REWRITE
			// elements: IDENT, formalType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 160:29: -> ^( F_PARAM ^( ID ( IDENT )* ) formalType )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:32: ^( F_PARAM ^( ID ( IDENT )* ) formalType )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(F_PARAM, "F_PARAM"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:42: ^( ID ( IDENT )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_2);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:47: ( IDENT )*
				while ( stream_IDENT.hasNext() ) {
					adaptor.addChild(root_2, stream_IDENT.nextNode());
				}
				stream_IDENT.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_formalType.nextTree());
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
	// $ANTLR end "fpSection"


	public static class formalType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalType"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:1: formalType : ( ( 'ARRAY' ^ 'OF' !)* qualident | procedureType );
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:23: ( ( 'ARRAY' ^ 'OF' !)* qualident | procedureType )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==IDENT||LA54_0==47) ) {
				alt54=1;
			}
			else if ( (LA54_0==80) ) {
				alt54=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:29: ( 'ARRAY' ^ 'OF' !)* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:29: ( 'ARRAY' ^ 'OF' !)*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==47) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:30: 'ARRAY' ^ 'OF' !
							{
							string_literal291=(Token)match(input,47,FOLLOW_47_in_formalType3323); 
							string_literal291_tree = (Object)adaptor.create(string_literal291);
							root_0 = (Object)adaptor.becomeRoot(string_literal291_tree, root_0);

							string_literal292=(Token)match(input,77,FOLLOW_77_in_formalType3326); 
							}
							break;

						default :
							break loop53;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType3331);
					qualident293=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident293.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:59: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType3335);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:1: module : 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:23: ( 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:29: 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !
			{
			root_0 = (Object)adaptor.nil();


			string_literal295=(Token)match(input,73,FOLLOW_73_in_module3362); 
			string_literal295_tree = (Object)adaptor.create(string_literal295);
			root_0 = (Object)adaptor.becomeRoot(string_literal295_tree, root_0);

			IDENT296=(Token)match(input,IDENT,FOLLOW_IDENT_in_module3365); 
			IDENT296_tree = (Object)adaptor.create(IDENT296);
			adaptor.addChild(root_0, IDENT296_tree);

			char_literal297=(Token)match(input,40,FOLLOW_40_in_module3367); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:50: ( importList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==63) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:50: importList
					{
					pushFollow(FOLLOW_importList_in_module3370);
					importList298=importList();
					state._fsp--;

					adaptor.addChild(root_0, importList298.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module3373);
			declarationSequence299=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence299.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:82: ( 'BEGIN' ! statementSequence )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==49) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:83: 'BEGIN' ! statementSequence
					{
					string_literal300=(Token)match(input,49,FOLLOW_49_in_module3376); 
					pushFollow(FOLLOW_statementSequence_in_module3379);
					statementSequence301=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence301.getTree());

					}
					break;

			}

			string_literal302=(Token)match(input,58,FOLLOW_58_in_module3383); 
			IDENT303=(Token)match(input,IDENT,FOLLOW_IDENT_in_module3386); 
			char_literal304=(Token)match(input,35,FOLLOW_35_in_module3389); 
			EOF305=(Token)match(input,EOF,FOLLOW_EOF_in_module3392); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) ;
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_importDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule importDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:29: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			string_literal306=(Token)match(input,63,FOLLOW_63_in_importList3416);  
			stream_63.add(string_literal306);

			pushFollow(FOLLOW_importDeclaration_in_importList3418);
			importDeclaration307=importDeclaration();
			state._fsp--;

			stream_importDeclaration.add(importDeclaration307.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:56: ( ',' importDeclaration )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==33) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:57: ',' importDeclaration
					{
					char_literal308=(Token)match(input,33,FOLLOW_33_in_importList3421);  
					stream_33.add(char_literal308);

					pushFollow(FOLLOW_importDeclaration_in_importList3423);
					importDeclaration309=importDeclaration();
					state._fsp--;

					stream_importDeclaration.add(importDeclaration309.getTree());
					}
					break;

				default :
					break loop57;
				}
			}

			char_literal310=(Token)match(input,40,FOLLOW_40_in_importList3427);  
			stream_40.add(char_literal310);

			// AST REWRITE
			// elements: importDeclaration, 63, importDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 167:29: -> ^( 'IMPORT' importDeclaration ( importDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:167:32: ^( 'IMPORT' importDeclaration ( importDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_63.nextNode(), root_1);
				adaptor.addChild(root_1, stream_importDeclaration.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:167:61: ( importDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:1: importDeclaration : IDENT ( ':=' IDENT )? -> ^( IMPORT_DECL IDENT ( IDENT )? ) ;
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
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:23: ( IDENT ( ':=' IDENT )? -> ^( IMPORT_DECL IDENT ( IDENT )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:29: IDENT ( ':=' IDENT )?
			{
			IDENT311=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration3492);  
			stream_IDENT.add(IDENT311);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:35: ( ':=' IDENT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==39) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:36: ':=' IDENT
					{
					string_literal312=(Token)match(input,39,FOLLOW_39_in_importDeclaration3495);  
					stream_39.add(string_literal312);

					IDENT313=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration3497);  
					stream_IDENT.add(IDENT313);

					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 170:29: -> ^( IMPORT_DECL IDENT ( IDENT )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:170:32: ^( IMPORT_DECL IDENT ( IDENT )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPORT_DECL, "IMPORT_DECL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:170:53: ( IDENT )?
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



	public static final BitSet FOLLOW_46_in_abs99 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_abs102 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_number_in_abs105 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_abs107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_odd137 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_odd140 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_odd143 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_odd145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_cap191 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_cap194 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CHARACTER_in_cap197 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_cap199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_ash229 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ash232 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_ash235 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_ash237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_len267 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_len270 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_len273 = new BitSet(new long[]{0x0000000240000000L});
	public static final BitSet FOLLOW_33_in_len276 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_len278 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_len282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_maxMin310 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_71_in_maxMin313 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_maxMin317 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_maxMin320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_maxMin322 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_maxMin324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_size354 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_size357 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_size360 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_size362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_inc393 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_inc396 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_inc399 = new BitSet(new long[]{0x0000000240000000L});
	public static final BitSet FOLLOW_33_in_inc402 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_inc405 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_inc409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_dec439 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_dec442 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_dec445 = new BitSet(new long[]{0x0000000240000000L});
	public static final BitSet FOLLOW_33_in_dec448 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_dec451 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_dec455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_incl484 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_incl487 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_set_in_incl490 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_incl492 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_incl495 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_incl497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_excl526 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_excl529 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_set_in_excl532 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_excl534 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_excl537 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_excl539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_copy568 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_copy571 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_copy574 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_copy576 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_copy579 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_copy581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_neW611 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_neW614 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_neW617 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_neW619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_halt649 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_halt652 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_halt655 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_halt657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abs_in_predefined682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_odd_in_predefined684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cap_in_predefined686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ash_in_predefined688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_len_in_predefined690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maxMin_in_predefined692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_predefined694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inc_in_predefined696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec_in_predefined698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incl_in_predefined700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_excl_in_predefined702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copy_in_predefined704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_neW_in_predefined706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_in_predefined708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identdef768 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_identdef770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration785 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_constantDeclaration787 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_constExpression_in_constantDeclaration789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constExpression852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_typeDeclaration870 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_typeDeclaration872 = new BitSet(new long[]{0x0000800000008000L,0x0000000000038000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_type959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_type975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_arrayType999 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_length_in_arrayType1001 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_33_in_arrayType1004 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_length_in_arrayType1006 = new BitSet(new long[]{0x0000000200000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_arrayType1010 = new BitSet(new long[]{0x0000800000008000L,0x0000000000038000L});
	public static final BitSet FOLLOW_type_in_arrayType1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constExpression_in_length1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_recordType1107 = new BitSet(new long[]{0x0000010020008000L});
	public static final BitSet FOLLOW_29_in_recordType1110 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_baseType_in_recordType1112 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_recordType1114 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_fieldListSequence_in_recordType1118 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_recordType1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_baseType1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence1201 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_fieldListSequence1204 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence1207 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_identList_in_fieldList1235 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_fieldList1237 = new BitSet(new long[]{0x0000800000008000L,0x0000000000038000L});
	public static final BitSet FOLLOW_type_in_fieldList1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_identList1266 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_identList1269 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identdef_in_identList1271 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_79_in_pointerType1295 = new BitSet(new long[]{0x0000800000008000L,0x0000000000038000L});
	public static final BitSet FOLLOW_type_in_pointerType1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_procedureType1318 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureType1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identList_in_variableDeclaration1336 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_variableDeclaration1338 = new BitSet(new long[]{0x0000800000008000L,0x0000000000038000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualident1435 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_qualident1437 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_qualident1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_designator1502 = new BitSet(new long[]{0x0000000820000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_35_in_designator1513 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_designator1516 = new BitSet(new long[]{0x0000000820000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_91_in_designator1520 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expList_in_designator1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_designator1525 = new BitSet(new long[]{0x0000000820000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_29_in_designator1530 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_designator1533 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_designator1535 = new BitSet(new long[]{0x0000000820000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_93_in_designator1540 = new BitSet(new long[]{0x0000000820000002L,0x0000000028000000L});
	public static final BitSet FOLLOW_expression_in_expList1568 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_expList1571 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_expList1573 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1598 = new BitSet(new long[]{0x00003E0008000002L,0x0000000000000009L});
	public static final BitSet FOLLOW_relation_in_expression1601 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression1700 = new BitSet(new long[]{0x0000000500000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression1703 = new BitSet(new long[]{0x0000000021428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_term_in_simpleExpression1706 = new BitSet(new long[]{0x0000000500000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_factor_in_term1767 = new BitSet(new long[]{0x0040002090000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_mulOperator_in_term1770 = new BitSet(new long[]{0x0000000021428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_factor_in_term1773 = new BitSet(new long[]{0x0040002090000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_number_in_factor1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_factor1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor1852 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_actualParameters_in_factor1854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_factor1859 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_factor1862 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_factor1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_factor1870 = new BitSet(new long[]{0x0000000021428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_factor_in_factor1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_set1902 = new BitSet(new long[]{0x0000000521428080L,0x0000000680000800L});
	public static final BitSet FOLLOW_element_in_set1905 = new BitSet(new long[]{0x0000000200000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_set1908 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_element_in_set1910 = new BitSet(new long[]{0x0000000200000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_set1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element1943 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_element1947 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_element1949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_actualParameters1968 = new BitSet(new long[]{0x0000000561428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expList_in_actualParameters1971 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_actualParameters1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predefined_in_statement2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement2_in_statement2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement2008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_statement2017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_statement2021 = new BitSet(new long[]{0x0000000521428082L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_statement2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement22050 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_39_in_statement22055 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_statement22057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement22062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall2128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence2145 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_statementSequence2149 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statement_in_statementSequence2151 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_62_in_ifStatement2219 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_ifStatement2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_ifStatement2223 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2227 = new BitSet(new long[]{0x0700000000000000L});
	public static final BitSet FOLLOW_57_in_ifStatement2230 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_ifStatement2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_ifStatement2234 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2238 = new BitSet(new long[]{0x0700000000000000L});
	public static final BitSet FOLLOW_56_in_ifStatement2243 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2247 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_ifStatement2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_caseStatement2338 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_caseStatement2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_caseStatement2342 = new BitSet(new long[]{0x0500000521428080L,0x0000000580000800L});
	public static final BitSet FOLLOW_casE_in_caseStatement2344 = new BitSet(new long[]{0x0500000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_caseStatement2347 = new BitSet(new long[]{0x0500000521428080L,0x0000000580000800L});
	public static final BitSet FOLLOW_casE_in_caseStatement2349 = new BitSet(new long[]{0x0500000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_56_in_caseStatement2354 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement2356 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_caseStatement2360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE2447 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_casE2449 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_casE2451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList2473 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_caseLabelList2476 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList2478 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels2503 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_caseLabels2506 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels2508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_whileStatement2528 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_whileStatement2530 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_whileStatement2532 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement2534 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_whileStatement2536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_repeatStatement2593 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_repeatStatement2598 = new BitSet(new long[]{0x0000000521428080L,0x0000000480000800L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_loopStatement2621 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement2624 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_loopStatement2626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_withStatement2647 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2650 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_withStatement2652 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2654 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_withStatement2656 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_withStatement2659 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_withStatement2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration2675 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_procedureDeclaration2677 = new BitSet(new long[]{0x040A000000000000L,0x0000000001410000L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration2679 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration2681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_procedureHeading2754 = new BitSet(new long[]{0x0000000080008000L});
	public static final BitSet FOLLOW_31_in_procedureHeading2756 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading2759 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody2818 = new BitSet(new long[]{0x0402000000000000L});
	public static final BitSet FOLLOW_49_in_procedureBody2821 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody2823 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_procedureBody2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_forwardDeclaration2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_forwardDeclaration2889 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration2891 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constdeclarationSequence_in_declarationSequence2909 = new BitSet(new long[]{0x0008000000000002L,0x0000000001410000L});
	public static final BitSet FOLLOW_typedeclarationSequence_in_declarationSequence2913 = new BitSet(new long[]{0x0008000000000002L,0x0000000001410000L});
	public static final BitSet FOLLOW_vardeclarationSequence_in_declarationSequence2916 = new BitSet(new long[]{0x0008000000000002L,0x0000000001410000L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence2923 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_declarationSequence2925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence2930 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_declarationSequence2932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_51_in_constdeclarationSequence2943 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_constantDeclaration_in_constdeclarationSequence2946 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_constdeclarationSequence2948 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_86_in_typedeclarationSequence3007 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typedeclarationSequence3011 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_typedeclarationSequence3013 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_88_in_vardeclarationSequence3079 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_variableDeclaration_in_vardeclarationSequence3082 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_vardeclarationSequence3084 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_29_in_formalParameters3154 = new BitSet(new long[]{0x0000000040008000L,0x0000000001000000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters3157 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_40_in_formalParameters3160 = new BitSet(new long[]{0x0000000000008000L,0x0000000001000000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters3162 = new BitSet(new long[]{0x0000010040000000L});
	public static final BitSet FOLLOW_30_in_formalParameters3168 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_formalParameters3171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualident_in_formalParameters3173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_fpSection3240 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection3243 = new BitSet(new long[]{0x0000004200000000L});
	public static final BitSet FOLLOW_33_in_fpSection3246 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection3248 = new BitSet(new long[]{0x0000004200000000L});
	public static final BitSet FOLLOW_38_in_fpSection3253 = new BitSet(new long[]{0x0000800000008000L,0x0000000000010000L});
	public static final BitSet FOLLOW_formalType_in_fpSection3255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_formalType3323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_formalType3326 = new BitSet(new long[]{0x0000800000008000L});
	public static final BitSet FOLLOW_qualident_in_formalType3331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType3335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_module3362 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_module3365 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_module3367 = new BitSet(new long[]{0x840A000000000000L,0x0000000001410000L});
	public static final BitSet FOLLOW_importList_in_module3370 = new BitSet(new long[]{0x040A000000000000L,0x0000000001410000L});
	public static final BitSet FOLLOW_declarationSequence_in_module3373 = new BitSet(new long[]{0x0402000000000000L});
	public static final BitSet FOLLOW_49_in_module3376 = new BitSet(new long[]{0x7835410000008000L,0x00000000C61C14F6L});
	public static final BitSet FOLLOW_statementSequence_in_module3379 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_module3383 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_module3386 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_module3389 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module3392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_importList3416 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList3418 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_33_in_importList3421 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList3423 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_40_in_importList3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration3492 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_importDeclaration3495 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration3497 = new BitSet(new long[]{0x0000000000000002L});
}
