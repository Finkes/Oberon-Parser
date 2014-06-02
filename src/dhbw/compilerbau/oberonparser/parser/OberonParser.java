// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-06-02 11:08:57
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "CALL", "CHARACTER", 
		"CHARCONST", "COMMENT", "DECLARE", "DIGIT", "FIELD_LIST", "F_PARAM", "F_PARAMS", 
		"HEX_DIGIT", "ID", "IDENT", "IMPORT_DECL", "INTEGER", "LENGTH", "LETTER", 
		"PROCEDURE", "PROCEDURE_BODY", "REAL", "SCALE_FACTOR", "STRING", "TYPE_DECL", 
		"WS", "'#'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'..'", 
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
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int CALL=6;
	public static final int CHARACTER=7;
	public static final int CHARCONST=8;
	public static final int COMMENT=9;
	public static final int DECLARE=10;
	public static final int DIGIT=11;
	public static final int FIELD_LIST=12;
	public static final int F_PARAM=13;
	public static final int F_PARAMS=14;
	public static final int HEX_DIGIT=15;
	public static final int ID=16;
	public static final int IDENT=17;
	public static final int IMPORT_DECL=18;
	public static final int INTEGER=19;
	public static final int LENGTH=20;
	public static final int LETTER=21;
	public static final int PROCEDURE=22;
	public static final int PROCEDURE_BODY=23;
	public static final int REAL=24;
	public static final int SCALE_FACTOR=25;
	public static final int STRING=26;
	public static final int TYPE_DECL=27;
	public static final int WS=28;

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


			string_literal1=(Token)match(input,48,FOLLOW_48_in_abs103); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			root_0 = (Object)adaptor.becomeRoot(string_literal1_tree, root_0);

			char_literal2=(Token)match(input,31,FOLLOW_31_in_abs106); 
			pushFollow(FOLLOW_number_in_abs109);
			number3=number();
			state._fsp--;

			adaptor.addChild(root_0, number3.getTree());

			char_literal4=(Token)match(input,32,FOLLOW_32_in_abs111); 
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


			string_literal5=(Token)match(input,78,FOLLOW_78_in_odd141); 
			string_literal5_tree = (Object)adaptor.create(string_literal5);
			root_0 = (Object)adaptor.becomeRoot(string_literal5_tree, root_0);

			char_literal6=(Token)match(input,31,FOLLOW_31_in_odd144); 
			INTEGER7=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_odd147); 
			INTEGER7_tree = (Object)adaptor.create(INTEGER7);
			adaptor.addChild(root_0, INTEGER7_tree);

			char_literal8=(Token)match(input,32,FOLLOW_32_in_odd149); 
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


			string_literal9=(Token)match(input,52,FOLLOW_52_in_cap195); 
			string_literal9_tree = (Object)adaptor.create(string_literal9);
			root_0 = (Object)adaptor.becomeRoot(string_literal9_tree, root_0);

			char_literal10=(Token)match(input,31,FOLLOW_31_in_cap198); 
			CHARACTER11=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_cap201); 
			CHARACTER11_tree = (Object)adaptor.create(CHARACTER11);
			adaptor.addChild(root_0, CHARACTER11_tree);

			char_literal12=(Token)match(input,32,FOLLOW_32_in_cap203); 
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


			string_literal13=(Token)match(input,50,FOLLOW_50_in_ash233); 
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			root_0 = (Object)adaptor.becomeRoot(string_literal13_tree, root_0);

			char_literal14=(Token)match(input,31,FOLLOW_31_in_ash236); 
			INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_ash239); 
			INTEGER15_tree = (Object)adaptor.create(INTEGER15);
			adaptor.addChild(root_0, INTEGER15_tree);

			char_literal16=(Token)match(input,32,FOLLOW_32_in_ash241); 
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


			string_literal17=(Token)match(input,70,FOLLOW_70_in_len271); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);

			char_literal18=(Token)match(input,31,FOLLOW_31_in_len274); 
			pushFollow(FOLLOW_qualident_in_len277);
			qualident19=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident19.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:51: ( ',' INTEGER )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==35) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:52: ',' INTEGER
					{
					char_literal20=(Token)match(input,35,FOLLOW_35_in_len280); 
					char_literal20_tree = (Object)adaptor.create(char_literal20);
					adaptor.addChild(root_0, char_literal20_tree);

					INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_len282); 
					INTEGER21_tree = (Object)adaptor.create(INTEGER21);
					adaptor.addChild(root_0, INTEGER21_tree);

					}
					break;

			}

			char_literal22=(Token)match(input,32,FOLLOW_32_in_len286); 
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
			if ( ((LA3_0 >= 72 && LA3_0 <= 73)) ) {
				alt3=1;
			}
			else if ( (LA3_0==97) ) {
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
					if ( (LA2_0==72) ) {
						alt2=1;
					}
					else if ( (LA2_0==73) ) {
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
							string_literal23=(Token)match(input,72,FOLLOW_72_in_maxMin314); 
							string_literal23_tree = (Object)adaptor.create(string_literal23);
							root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

							}
							break;
						case 2 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:37: 'MIN' ^
							{
							string_literal24=(Token)match(input,73,FOLLOW_73_in_maxMin317); 
							string_literal24_tree = (Object)adaptor.create(string_literal24);
							root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);

							}
							break;

					}

					char_literal25=(Token)match(input,31,FOLLOW_31_in_maxMin321); 
					pushFollow(FOLLOW_qualident_in_maxMin324);
					qualident26=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident26.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:60: set ')' !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_maxMin326);
					set27=set();
					state._fsp--;

					adaptor.addChild(root_0, set27.getTree());

					char_literal28=(Token)match(input,32,FOLLOW_32_in_maxMin328); 
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


			string_literal29=(Token)match(input,86,FOLLOW_86_in_size358); 
			string_literal29_tree = (Object)adaptor.create(string_literal29);
			root_0 = (Object)adaptor.becomeRoot(string_literal29_tree, root_0);

			char_literal30=(Token)match(input,31,FOLLOW_31_in_size361); 
			pushFollow(FOLLOW_qualident_in_size364);
			qualident31=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident31.getTree());

			char_literal32=(Token)match(input,32,FOLLOW_32_in_size366); 
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


			string_literal33=(Token)match(input,67,FOLLOW_67_in_inc397); 
			string_literal33_tree = (Object)adaptor.create(string_literal33);
			root_0 = (Object)adaptor.becomeRoot(string_literal33_tree, root_0);

			char_literal34=(Token)match(input,31,FOLLOW_31_in_inc400); 
			INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc403); 
			INTEGER35_tree = (Object)adaptor.create(INTEGER35);
			adaptor.addChild(root_0, INTEGER35_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:49: ( ',' ! INTEGER )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==35) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:50: ',' ! INTEGER
					{
					char_literal36=(Token)match(input,35,FOLLOW_35_in_inc406); 
					INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_inc409); 
					INTEGER37_tree = (Object)adaptor.create(INTEGER37);
					adaptor.addChild(root_0, INTEGER37_tree);

					}
					break;

			}

			char_literal38=(Token)match(input,32,FOLLOW_32_in_inc413); 
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


			string_literal39=(Token)match(input,55,FOLLOW_55_in_dec443); 
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			root_0 = (Object)adaptor.becomeRoot(string_literal39_tree, root_0);

			char_literal40=(Token)match(input,31,FOLLOW_31_in_dec446); 
			INTEGER41=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec449); 
			INTEGER41_tree = (Object)adaptor.create(INTEGER41);
			adaptor.addChild(root_0, INTEGER41_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:49: ( ',' ! INTEGER )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==35) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:50: ',' ! INTEGER
					{
					char_literal42=(Token)match(input,35,FOLLOW_35_in_dec452); 
					INTEGER43=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dec455); 
					INTEGER43_tree = (Object)adaptor.create(INTEGER43);
					adaptor.addChild(root_0, INTEGER43_tree);

					}
					break;

			}

			char_literal44=(Token)match(input,32,FOLLOW_32_in_dec459); 
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


			string_literal45=(Token)match(input,68,FOLLOW_68_in_incl488); 
			string_literal45_tree = (Object)adaptor.create(string_literal45);
			root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);

			char_literal46=(Token)match(input,31,FOLLOW_31_in_incl491); 
			pushFollow(FOLLOW_set_in_incl494);
			set47=set();
			state._fsp--;

			adaptor.addChild(root_0, set47.getTree());

			char_literal48=(Token)match(input,35,FOLLOW_35_in_incl496); 
			INTEGER49=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_incl499); 
			INTEGER49_tree = (Object)adaptor.create(INTEGER49);
			adaptor.addChild(root_0, INTEGER49_tree);

			char_literal50=(Token)match(input,32,FOLLOW_32_in_incl501); 
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


			string_literal51=(Token)match(input,61,FOLLOW_61_in_excl530); 
			string_literal51_tree = (Object)adaptor.create(string_literal51);
			root_0 = (Object)adaptor.becomeRoot(string_literal51_tree, root_0);

			char_literal52=(Token)match(input,31,FOLLOW_31_in_excl533); 
			pushFollow(FOLLOW_set_in_excl536);
			set53=set();
			state._fsp--;

			adaptor.addChild(root_0, set53.getTree());

			char_literal54=(Token)match(input,35,FOLLOW_35_in_excl538); 
			INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_excl541); 
			INTEGER55_tree = (Object)adaptor.create(INTEGER55);
			adaptor.addChild(root_0, INTEGER55_tree);

			char_literal56=(Token)match(input,32,FOLLOW_32_in_excl543); 
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


			string_literal57=(Token)match(input,54,FOLLOW_54_in_copy572); 
			string_literal57_tree = (Object)adaptor.create(string_literal57);
			root_0 = (Object)adaptor.becomeRoot(string_literal57_tree, root_0);

			char_literal58=(Token)match(input,31,FOLLOW_31_in_copy575); 
			pushFollow(FOLLOW_qualident_in_copy578);
			qualident59=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident59.getTree());

			char_literal60=(Token)match(input,35,FOLLOW_35_in_copy580); 
			pushFollow(FOLLOW_qualident_in_copy583);
			qualident61=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident61.getTree());

			char_literal62=(Token)match(input,32,FOLLOW_32_in_copy585); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:1: neW : 'NEW' ^ '(' ! ( qualident )? ')' !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:23: ( 'NEW' ^ '(' ! ( qualident )? ')' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:29: 'NEW' ^ '(' ! ( qualident )? ')' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal63=(Token)match(input,76,FOLLOW_76_in_neW615); 
			string_literal63_tree = (Object)adaptor.create(string_literal63);
			root_0 = (Object)adaptor.becomeRoot(string_literal63_tree, root_0);

			char_literal64=(Token)match(input,31,FOLLOW_31_in_neW618); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:41: ( qualident )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:41: qualident
					{
					pushFollow(FOLLOW_qualident_in_neW621);
					qualident65=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident65.getTree());

					}
					break;

			}

			char_literal66=(Token)match(input,32,FOLLOW_32_in_neW624); 
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


			string_literal67=(Token)match(input,63,FOLLOW_63_in_halt654); 
			string_literal67_tree = (Object)adaptor.create(string_literal67);
			root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);

			char_literal68=(Token)match(input,31,FOLLOW_31_in_halt657); 
			INTEGER69=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_halt660); 
			INTEGER69_tree = (Object)adaptor.create(INTEGER69);
			adaptor.addChild(root_0, INTEGER69_tree);

			char_literal70=(Token)match(input,32,FOLLOW_32_in_halt662); 
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
			int alt7=14;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt7=1;
				}
				break;
			case 78:
				{
				alt7=2;
				}
				break;
			case 52:
				{
				alt7=3;
				}
				break;
			case 50:
				{
				alt7=4;
				}
				break;
			case 70:
				{
				alt7=5;
				}
				break;
			case 72:
			case 73:
			case 97:
				{
				alt7=6;
				}
				break;
			case 86:
				{
				alt7=7;
				}
				break;
			case 67:
				{
				alt7=8;
				}
				break;
			case 55:
				{
				alt7=9;
				}
				break;
			case 68:
				{
				alt7=10;
				}
				break;
			case 61:
				{
				alt7=11;
				}
				break;
			case 54:
				{
				alt7=12;
				}
				break;
			case 76:
				{
				alt7=13;
				}
				break;
			case 63:
				{
				alt7=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:30: abs
					{
					pushFollow(FOLLOW_abs_in_predefined687);
					abs71=abs();
					state._fsp--;

					adaptor.addChild(root_0, abs71.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:34: odd
					{
					pushFollow(FOLLOW_odd_in_predefined689);
					odd72=odd();
					state._fsp--;

					adaptor.addChild(root_0, odd72.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:38: cap
					{
					pushFollow(FOLLOW_cap_in_predefined691);
					cap73=cap();
					state._fsp--;

					adaptor.addChild(root_0, cap73.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:42: ash
					{
					pushFollow(FOLLOW_ash_in_predefined693);
					ash74=ash();
					state._fsp--;

					adaptor.addChild(root_0, ash74.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:46: len
					{
					pushFollow(FOLLOW_len_in_predefined695);
					len75=len();
					state._fsp--;

					adaptor.addChild(root_0, len75.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:50: maxMin
					{
					pushFollow(FOLLOW_maxMin_in_predefined697);
					maxMin76=maxMin();
					state._fsp--;

					adaptor.addChild(root_0, maxMin76.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:57: size
					{
					pushFollow(FOLLOW_size_in_predefined699);
					size77=size();
					state._fsp--;

					adaptor.addChild(root_0, size77.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:62: inc
					{
					pushFollow(FOLLOW_inc_in_predefined701);
					inc78=inc();
					state._fsp--;

					adaptor.addChild(root_0, inc78.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:66: dec
					{
					pushFollow(FOLLOW_dec_in_predefined703);
					dec79=dec();
					state._fsp--;

					adaptor.addChild(root_0, dec79.getTree());

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:70: incl
					{
					pushFollow(FOLLOW_incl_in_predefined705);
					incl80=incl();
					state._fsp--;

					adaptor.addChild(root_0, incl80.getTree());

					}
					break;
				case 11 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:75: excl
					{
					pushFollow(FOLLOW_excl_in_predefined707);
					excl81=excl();
					state._fsp--;

					adaptor.addChild(root_0, excl81.getTree());

					}
					break;
				case 12 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:80: copy
					{
					pushFollow(FOLLOW_copy_in_predefined709);
					copy82=copy();
					state._fsp--;

					adaptor.addChild(root_0, copy82.getTree());

					}
					break;
				case 13 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:85: neW
					{
					pushFollow(FOLLOW_neW_in_predefined711);
					neW83=neW();
					state._fsp--;

					adaptor.addChild(root_0, neW83.getTree());

					}
					break;
				case 14 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:89: halt
					{
					pushFollow(FOLLOW_halt_in_predefined713);
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


			IDENT86=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef773); 
			IDENT86_tree = (Object)adaptor.create(IDENT86);
			adaptor.addChild(root_0, IDENT86_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:35: ( '*' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==33) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:35: '*'
					{
					char_literal87=(Token)match(input,33,FOLLOW_33_in_identdef775); 
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:23: ( identdef '=' constExpression -> ^( '=' identdef constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:29: identdef '=' constExpression
			{
			pushFollow(FOLLOW_identdef_in_constantDeclaration790);
			identdef88=identdef();
			state._fsp--;

			stream_identdef.add(identdef88.getTree());
			char_literal89=(Token)match(input,45,FOLLOW_45_in_constantDeclaration792);  
			stream_45.add(char_literal89);

			pushFollow(FOLLOW_constExpression_in_constantDeclaration794);
			constExpression90=constExpression();
			state._fsp--;

			stream_constExpression.add(constExpression90.getTree());
			// AST REWRITE
			// elements: constExpression, identdef, 45
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
				root_1 = (Object)adaptor.becomeRoot(stream_45.nextNode(), root_1);
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


			pushFollow(FOLLOW_expression_in_constExpression857);
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:23: ( identdef '=' type -> ^( TYPE_DECL identdef type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:29: identdef '=' type
			{
			pushFollow(FOLLOW_identdef_in_typeDeclaration875);
			identdef92=identdef();
			state._fsp--;

			stream_identdef.add(identdef92.getTree());
			char_literal93=(Token)match(input,45,FOLLOW_45_in_typeDeclaration877);  
			stream_45.add(char_literal93);

			pushFollow(FOLLOW_type_in_typeDeclaration879);
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
			int alt9=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt9=1;
				}
				break;
			case 49:
				{
				alt9=2;
				}
				break;
			case 83:
				{
				alt9=3;
				}
				break;
			case 81:
				{
				alt9=4;
				}
				break;
			case 82:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:29: qualident
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualident_in_type964);
					qualident95=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident95.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:41: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type968);
					arrayType96=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType96.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:53: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type972);
					recordType97=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType97.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:66: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type976);
					pointerType98=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType98.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:80: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type980);
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
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_length=new RewriteRuleSubtreeStream(adaptor,"rule length");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:23: ( 'ARRAY' length ( ',' length )* 'OF' type -> ^( 'ARRAY' ^( LENGTH ( length )* ) type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:29: 'ARRAY' length ( ',' length )* 'OF' type
			{
			string_literal100=(Token)match(input,49,FOLLOW_49_in_arrayType1004);  
			stream_49.add(string_literal100);

			pushFollow(FOLLOW_length_in_arrayType1006);
			length101=length();
			state._fsp--;

			stream_length.add(length101.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:44: ( ',' length )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==35) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:45: ',' length
					{
					char_literal102=(Token)match(input,35,FOLLOW_35_in_arrayType1009);  
					stream_35.add(char_literal102);

					pushFollow(FOLLOW_length_in_arrayType1011);
					length103=length();
					state._fsp--;

					stream_length.add(length103.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			string_literal104=(Token)match(input,79,FOLLOW_79_in_arrayType1015);  
			stream_79.add(string_literal104);

			pushFollow(FOLLOW_type_in_arrayType1017);
			type105=type();
			state._fsp--;

			stream_type.add(type105.getTree());
			// AST REWRITE
			// elements: 49, length, type
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
				root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);
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


			pushFollow(FOLLOW_constExpression_in_length1089);
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
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_baseType=new RewriteRuleSubtreeStream(adaptor,"rule baseType");
		RewriteRuleSubtreeStream stream_fieldListSequence=new RewriteRuleSubtreeStream(adaptor,"rule fieldListSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:23: ( 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' -> ^( 'RECORD' ( baseType )? fieldListSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:29: 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END'
			{
			string_literal107=(Token)match(input,83,FOLLOW_83_in_recordType1112);  
			stream_83.add(string_literal107);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:38: ( '(' baseType ')' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==31) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:39: '(' baseType ')'
					{
					char_literal108=(Token)match(input,31,FOLLOW_31_in_recordType1115);  
					stream_31.add(char_literal108);

					pushFollow(FOLLOW_baseType_in_recordType1117);
					baseType109=baseType();
					state._fsp--;

					stream_baseType.add(baseType109.getTree());
					char_literal110=(Token)match(input,32,FOLLOW_32_in_recordType1119);  
					stream_32.add(char_literal110);

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType1123);
			fieldListSequence111=fieldListSequence();
			state._fsp--;

			stream_fieldListSequence.add(fieldListSequence111.getTree());
			string_literal112=(Token)match(input,60,FOLLOW_60_in_recordType1125);  
			stream_60.add(string_literal112);

			// AST REWRITE
			// elements: baseType, fieldListSequence, 83
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
				root_1 = (Object)adaptor.becomeRoot(stream_83.nextNode(), root_1);
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


			pushFollow(FOLLOW_qualident_in_baseType1191);
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


			pushFollow(FOLLOW_fieldList_in_fieldListSequence1207);
			fieldList114=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList114.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:39: ( ';' ! fieldList )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==42) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:40: ';' ! fieldList
					{
					char_literal115=(Token)match(input,42,FOLLOW_42_in_fieldListSequence1210); 
					pushFollow(FOLLOW_fieldList_in_fieldListSequence1213);
					fieldList116=fieldList();
					state._fsp--;

					adaptor.addChild(root_0, fieldList116.getTree());

					}
					break;

				default :
					break loop12;
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
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:30: identList ':' ^ type
					{
					pushFollow(FOLLOW_identList_in_fieldList1241);
					identList117=identList();
					state._fsp--;

					adaptor.addChild(root_0, identList117.getTree());

					char_literal118=(Token)match(input,40,FOLLOW_40_in_fieldList1243); 
					char_literal118_tree = (Object)adaptor.create(char_literal118);
					root_0 = (Object)adaptor.becomeRoot(char_literal118_tree, root_0);

					pushFollow(FOLLOW_type_in_fieldList1246);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:1: identList : identdef ( ',' ! identdef )* ;
	public final OberonParser.identList_return identList() throws RecognitionException {
		OberonParser.identList_return retval = new OberonParser.identList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		ParserRuleReturnScope identdef120 =null;
		ParserRuleReturnScope identdef122 =null;

		Object char_literal121_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:23: ( identdef ( ',' ! identdef )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:29: identdef ( ',' ! identdef )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_identList1272);
			identdef120=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef120.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:38: ( ',' ! identdef )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==35) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:39: ',' ! identdef
					{
					char_literal121=(Token)match(input,35,FOLLOW_35_in_identList1275); 
					pushFollow(FOLLOW_identdef_in_identList1278);
					identdef122=identdef();
					state._fsp--;

					adaptor.addChild(root_0, identdef122.getTree());

					}
					break;

				default :
					break loop14;
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


			string_literal123=(Token)match(input,81,FOLLOW_81_in_pointerType1302); 
			string_literal123_tree = (Object)adaptor.create(string_literal123);
			root_0 = (Object)adaptor.becomeRoot(string_literal123_tree, root_0);

			pushFollow(FOLLOW_type_in_pointerType1305);
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


			string_literal125=(Token)match(input,82,FOLLOW_82_in_procedureType1325); 
			string_literal125_tree = (Object)adaptor.create(string_literal125);
			root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:42: ( formalParameters )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==31) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:68:42: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureType1328);
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:23: ( identList ':' type -> ^( DECLARE identList type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:70:29: identList ':' type
			{
			pushFollow(FOLLOW_identList_in_variableDeclaration1343);
			identList127=identList();
			state._fsp--;

			stream_identList.add(identList127.getTree());
			char_literal128=(Token)match(input,40,FOLLOW_40_in_variableDeclaration1345);  
			stream_40.add(char_literal128);

			pushFollow(FOLLOW_type_in_variableDeclaration1347);
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
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:23: ( ( options {greedy=true; } : IDENT '.' )? IDENT -> ^( ID ( IDENT )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:29: ( options {greedy=true; } : IDENT '.' )? IDENT
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:29: ( options {greedy=true; } : IDENT '.' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENT) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==37) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==IDENT) ) {
						alt16=1;
					}
				}
			}
			switch (alt16) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:74:53: IDENT '.'
					{
					IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1442);  
					stream_IDENT.add(IDENT130);

					char_literal131=(Token)match(input,37,FOLLOW_37_in_qualident1444);  
					stream_37.add(char_literal131);

					}
					break;

			}

			IDENT132=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident1448);  
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


			pushFollow(FOLLOW_qualident_in_designator1509);
			qualident133=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident133.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:39: ( options {greedy=true; } : '.' ! IDENT | '[' ! expList ']' !| '(' ! qualident ')' !| '^' )*
			loop17:
			while (true) {
				int alt17=5;
				switch ( input.LA(1) ) {
				case 31:
					{
					int LA17_1 = input.LA(2);
					if ( (LA17_1==IDENT) ) {
						int LA17_6 = input.LA(3);
						if ( (LA17_6==37) ) {
							int LA17_7 = input.LA(4);
							if ( (LA17_7==IDENT) ) {
								int LA17_9 = input.LA(5);
								if ( (LA17_9==32) ) {
									alt17=3;
								}

							}

						}
						else if ( (LA17_6==32) ) {
							alt17=3;
						}

					}

					}
					break;
				case 37:
					{
					alt17=1;
					}
					break;
				case 93:
					{
					alt17=2;
					}
					break;
				case 95:
					{
					alt17=4;
					}
					break;
				}
				switch (alt17) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:63: '.' ! IDENT
					{
					char_literal134=(Token)match(input,37,FOLLOW_37_in_designator1520); 
					IDENT135=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator1523); 
					IDENT135_tree = (Object)adaptor.create(IDENT135);
					adaptor.addChild(root_0, IDENT135_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:76: '[' ! expList ']' !
					{
					char_literal136=(Token)match(input,93,FOLLOW_93_in_designator1527); 
					pushFollow(FOLLOW_expList_in_designator1530);
					expList137=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList137.getTree());

					char_literal138=(Token)match(input,94,FOLLOW_94_in_designator1532); 
					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:96: '(' ! qualident ')' !
					{
					char_literal139=(Token)match(input,31,FOLLOW_31_in_designator1537); 
					pushFollow(FOLLOW_qualident_in_designator1540);
					qualident140=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident140.getTree());

					char_literal141=(Token)match(input,32,FOLLOW_32_in_designator1542); 
					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:118: '^'
					{
					char_literal142=(Token)match(input,95,FOLLOW_95_in_designator1547); 
					char_literal142_tree = (Object)adaptor.create(char_literal142);
					adaptor.addChild(root_0, char_literal142_tree);

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
	// $ANTLR end "designator"


	public static class expList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expList"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:1: expList : expression ( ',' ! expression )* ;
	public final OberonParser.expList_return expList() throws RecognitionException {
		OberonParser.expList_return retval = new OberonParser.expList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope expression145 =null;

		Object char_literal144_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:23: ( expression ( ',' ! expression )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:29: expression ( ',' ! expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expList1575);
			expression143=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression143.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:40: ( ',' ! expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==35) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:41: ',' ! expression
					{
					char_literal144=(Token)match(input,35,FOLLOW_35_in_expList1578); 
					pushFollow(FOLLOW_expression_in_expList1581);
					expression145=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression145.getTree());

					}
					break;

				default :
					break loop18;
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


			pushFollow(FOLLOW_simpleExpression_in_expression1606);
			simpleExpression146=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression146.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:46: ( relation ^ simpleExpression )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==29||(LA19_0 >= 43 && LA19_0 <= 47)||LA19_0==66||LA19_0==69) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:47: relation ^ simpleExpression
					{
					pushFollow(FOLLOW_relation_in_expression1609);
					relation147=relation();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(relation147.getTree(), root_0);
					pushFollow(FOLLOW_simpleExpression_in_expression1612);
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
			if ( input.LA(1)==29||(input.LA(1) >= 43 && input.LA(1) <= 47)||input.LA(1)==66||input.LA(1)==69 ) {
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
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==34||LA20_0==36) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					set150=input.LT(1);
					if ( input.LA(1)==34||input.LA(1)==36 ) {
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

			pushFollow(FOLLOW_term_in_simpleExpression1708);
			term151=term();
			state._fsp--;

			adaptor.addChild(root_0, term151.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:45: ( addOperator ^ term )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==34||LA21_0==36||LA21_0==80) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:86:46: addOperator ^ term
					{
					pushFollow(FOLLOW_addOperator_in_simpleExpression1711);
					addOperator152=addOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addOperator152.getTree(), root_0);
					pushFollow(FOLLOW_term_in_simpleExpression1714);
					term153=term();
					state._fsp--;

					adaptor.addChild(root_0, term153.getTree());

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
			if ( input.LA(1)==34||input.LA(1)==36||input.LA(1)==80 ) {
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


			pushFollow(FOLLOW_factor_in_term1775);
			factor155=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor155.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:36: ( mulOperator ^ factor )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30||LA22_0==33||LA22_0==39||LA22_0==56||LA22_0==74) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:90:37: mulOperator ^ factor
					{
					pushFollow(FOLLOW_mulOperator_in_term1778);
					mulOperator156=mulOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(mulOperator156.getTree(), root_0);
					pushFollow(FOLLOW_factor_in_term1781);
					factor157=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor157.getTree());

					}
					break;

				default :
					break loop22;
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
			if ( input.LA(1)==30||input.LA(1)==33||input.LA(1)==39||input.LA(1)==56||input.LA(1)==74 ) {
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
			int alt24=8;
			switch ( input.LA(1) ) {
			case INTEGER:
			case REAL:
				{
				alt24=1;
				}
				break;
			case CHARCONST:
				{
				alt24=2;
				}
				break;
			case STRING:
				{
				alt24=3;
				}
				break;
			case 77:
				{
				alt24=4;
				}
				break;
			case 97:
				{
				alt24=5;
				}
				break;
			case IDENT:
				{
				alt24=6;
				}
				break;
			case 31:
				{
				alt24=7;
				}
				break;
			case 100:
				{
				alt24=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:29: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor1840);
					number159=number();
					state._fsp--;

					adaptor.addChild(root_0, number159.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:38: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST160=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor1844); 
					CHARCONST160_tree = (Object)adaptor.create(CHARCONST160);
					adaptor.addChild(root_0, CHARCONST160_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:50: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING161=(Token)match(input,STRING,FOLLOW_STRING_in_factor1848); 
					STRING161_tree = (Object)adaptor.create(STRING161);
					adaptor.addChild(root_0, STRING161_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:59: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal162=(Token)match(input,77,FOLLOW_77_in_factor1852); 
					string_literal162_tree = (Object)adaptor.create(string_literal162);
					adaptor.addChild(root_0, string_literal162_tree);

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:67: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor1856);
					set163=set();
					state._fsp--;

					adaptor.addChild(root_0, set163.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:73: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor1860);
					designator164=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator164.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:84: ( actualParameters )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==31) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:84: actualParameters
							{
							pushFollow(FOLLOW_actualParameters_in_factor1862);
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


					char_literal166=(Token)match(input,31,FOLLOW_31_in_factor1867); 
					pushFollow(FOLLOW_expression_in_factor1870);
					expression167=expression();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(expression167.getTree(), root_0);
					char_literal168=(Token)match(input,32,FOLLOW_32_in_factor1873); 
					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:94:128: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal169=(Token)match(input,100,FOLLOW_100_in_factor1878); 
					char_literal169_tree = (Object)adaptor.create(char_literal169);
					adaptor.addChild(root_0, char_literal169_tree);

					pushFollow(FOLLOW_factor_in_factor1880);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:1: set : '{' ! ( element ( ',' ! element )* )? '}' !;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:23: ( '{' ! ( element ( ',' ! element )* )? '}' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:29: '{' ! ( element ( ',' ! element )* )? '}' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal171=(Token)match(input,97,FOLLOW_97_in_set1910); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:34: ( element ( ',' ! element )* )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==CHARCONST||LA26_0==IDENT||LA26_0==INTEGER||LA26_0==REAL||LA26_0==STRING||LA26_0==31||LA26_0==34||LA26_0==36||LA26_0==77||LA26_0==97||LA26_0==100) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:35: element ( ',' ! element )*
					{
					pushFollow(FOLLOW_element_in_set1914);
					element172=element();
					state._fsp--;

					adaptor.addChild(root_0, element172.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:43: ( ',' ! element )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==35) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:96:44: ',' ! element
							{
							char_literal173=(Token)match(input,35,FOLLOW_35_in_set1917); 
							pushFollow(FOLLOW_element_in_set1920);
							element174=element();
							state._fsp--;

							adaptor.addChild(root_0, element174.getTree());

							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;

			}

			char_literal175=(Token)match(input,99,FOLLOW_99_in_set1927); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:1: element : expression ( '..' ! expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal177=null;
		ParserRuleReturnScope expression176 =null;
		ParserRuleReturnScope expression178 =null;

		Object string_literal177_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:23: ( expression ( '..' ! expression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:29: expression ( '..' ! expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element1954);
			expression176=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression176.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:40: ( '..' ! expression )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==38) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:98:42: '..' ! expression
					{
					string_literal177=(Token)match(input,38,FOLLOW_38_in_element1958); 
					pushFollow(FOLLOW_expression_in_element1961);
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


			char_literal179=(Token)match(input,31,FOLLOW_31_in_actualParameters1980); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:34: ( expList )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==CHARCONST||LA28_0==IDENT||LA28_0==INTEGER||LA28_0==REAL||LA28_0==STRING||LA28_0==31||LA28_0==34||LA28_0==36||LA28_0==77||LA28_0==97||LA28_0==100) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:100:34: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters1983);
					expList180=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList180.getTree());

					}
					break;

			}

			char_literal181=(Token)match(input,32,FOLLOW_32_in_actualParameters1986); 
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
			int alt30=11;
			switch ( input.LA(1) ) {
				case 48:
				case 50:
				case 52:
				case 54:
				case 55:
				case 61:
				case 63:
				case 67:
				case 68:
				case 70:
				case 72:
				case 73:
				case 76:
				case 78:
				case 86:
				case 97:
					{
					alt30=1;
					}
					break;
				case IDENT:
					{
					alt30=2;
					}
					break;
				case 64:
					{
					alt30=3;
					}
					break;
				case 96:
					{
					alt30=4;
					}
					break;
				case 91:
					{
					alt30=5;
					}
					break;
				case 84:
					{
					alt30=6;
					}
					break;
				case 71:
					{
					alt30=7;
					}
					break;
				case 92:
					{
					alt30=8;
					}
					break;
				case 62:
					{
					alt30=9;
					}
					break;
				case 85:
					{
					alt30=10;
					}
					break;
			}
			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:30: predefined
					{
					pushFollow(FOLLOW_predefined_in_statement2012);
					predefined182=predefined();
					state._fsp--;

					adaptor.addChild(root_0, predefined182.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:41: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement2014);
					statement2183=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement2183.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:52: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement2016);
					ifStatement184=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement184.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:64: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement2018);
					caseStatement185=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement185.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:78: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement2020);
					whileStatement186=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement186.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:93: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement2022);
					repeatStatement187=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement187.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:109: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement2024);
					loopStatement188=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement188.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:123: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement2026);
					withStatement189=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement189.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:138: 'EXIT'
					{
					string_literal190=(Token)match(input,62,FOLLOW_62_in_statement2029); 
					string_literal190_tree = (Object)adaptor.create(string_literal190);
					adaptor.addChild(root_0, string_literal190_tree);

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:147: 'RETURN' ( expression )?
					{
					string_literal191=(Token)match(input,85,FOLLOW_85_in_statement2033); 
					string_literal191_tree = (Object)adaptor.create(string_literal191);
					adaptor.addChild(root_0, string_literal191_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:156: ( expression )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==CHARCONST||LA29_0==IDENT||LA29_0==INTEGER||LA29_0==REAL||LA29_0==STRING||LA29_0==31||LA29_0==34||LA29_0==36||LA29_0==77||LA29_0==97||LA29_0==100) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:102:156: expression
							{
							pushFollow(FOLLOW_expression_in_statement2035);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:1: statement2 : d= designator ( ( ':=' expression ) -> ^( ASSIGN $d expression ) | procedureCall -> ^( CALL $d procedureCall ) ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal193=null;
		ParserRuleReturnScope d =null;
		ParserRuleReturnScope expression194 =null;
		ParserRuleReturnScope procedureCall195 =null;

		Object string_literal193_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_designator=new RewriteRuleSubtreeStream(adaptor,"rule designator");
		RewriteRuleSubtreeStream stream_procedureCall=new RewriteRuleSubtreeStream(adaptor,"rule procedureCall");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:23: (d= designator ( ( ':=' expression ) -> ^( ASSIGN $d expression ) | procedureCall -> ^( CALL $d procedureCall ) ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:29: d= designator ( ( ':=' expression ) -> ^( ASSIGN $d expression ) | procedureCall -> ^( CALL $d procedureCall ) )
			{
			pushFollow(FOLLOW_designator_in_statement22065);
			d=designator();
			state._fsp--;

			stream_designator.add(d.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:43: ( ( ':=' expression ) -> ^( ASSIGN $d expression ) | procedureCall -> ^( CALL $d procedureCall ) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==41) ) {
				alt31=1;
			}
			else if ( (LA31_0==31||LA31_0==42||(LA31_0 >= 58 && LA31_0 <= 60)||LA31_0==89||LA31_0==98) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:44: ( ':=' expression )
					{
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:44: ( ':=' expression )
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:45: ':=' expression
					{
					string_literal193=(Token)match(input,41,FOLLOW_41_in_statement22070);  
					stream_41.add(string_literal193);

					pushFollow(FOLLOW_expression_in_statement22072);
					expression194=expression();
					state._fsp--;

					stream_expression.add(expression194.getTree());
					}

					// AST REWRITE
					// elements: d, expression
					// token labels: 
					// rule labels: retval, d
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:62: -> ^( ASSIGN $d expression )
					{
						// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:65: ^( ASSIGN $d expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						adaptor.addChild(root_1, stream_d.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:90: procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement22087);
					procedureCall195=procedureCall();
					state._fsp--;

					stream_procedureCall.add(procedureCall195.getTree());
					// AST REWRITE
					// elements: procedureCall, d
					// token labels: 
					// rule labels: retval, d
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:104: -> ^( CALL $d procedureCall )
					{
						// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:107: ^( CALL $d procedureCall )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_d.nextTree());
						adaptor.addChild(root_1, stream_procedureCall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
	// $ANTLR end "statement2"


	public static class procedureCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureCall"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:1: procedureCall : ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualParameters196 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:23: ( ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:29: ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:29: ( actualParameters )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==31) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:29: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall2120);
					actualParameters196=actualParameters();
					state._fsp--;

					adaptor.addChild(root_0, actualParameters196.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:1: statementSequence : statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal198=null;
		ParserRuleReturnScope statement197 =null;
		ParserRuleReturnScope statement199 =null;

		Object char_literal198_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:23: ( statement ( ';' statement )* -> ^( BLOCK statement ( statement )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:29: statement ( ';' statement )*
			{
			pushFollow(FOLLOW_statement_in_statementSequence2137);
			statement197=statement();
			state._fsp--;

			stream_statement.add(statement197.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:39: ( ';' statement )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==42) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:41: ';' statement
					{
					char_literal198=(Token)match(input,42,FOLLOW_42_in_statementSequence2141);  
					stream_42.add(char_literal198);

					pushFollow(FOLLOW_statement_in_statementSequence2143);
					statement199=statement();
					state._fsp--;

					stream_statement.add(statement199.getTree());
					}
					break;

				default :
					break loop33;
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
			// 112:29: -> ^( BLOCK statement ( statement )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:32: ^( BLOCK statement ( statement )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_statement.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:112:50: ( statement )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:1: ifStatement : 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( ^( 'ELSE' ( $s3)? ) )? ) ;
	public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
		OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal200=null;
		Token string_literal202=null;
		Token string_literal203=null;
		Token string_literal205=null;
		Token string_literal206=null;
		Token string_literal207=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope s3 =null;
		ParserRuleReturnScope expression201 =null;
		ParserRuleReturnScope expression204 =null;

		Object string_literal200_tree=null;
		Object string_literal202_tree=null;
		Object string_literal203_tree=null;
		Object string_literal205_tree=null;
		Object string_literal206_tree=null;
		Object string_literal207_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:23: ( 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END' -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( ^( 'ELSE' ( $s3)? ) )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:29: 'IF' expression 'THEN' s1= statementSequence ( 'ELSIF' expression 'THEN' s2= statementSequence )* ( 'ELSE' s3= statementSequence )? 'END'
			{
			string_literal200=(Token)match(input,64,FOLLOW_64_in_ifStatement2211);  
			stream_64.add(string_literal200);

			pushFollow(FOLLOW_expression_in_ifStatement2213);
			expression201=expression();
			state._fsp--;

			stream_expression.add(expression201.getTree());
			string_literal202=(Token)match(input,87,FOLLOW_87_in_ifStatement2215);  
			stream_87.add(string_literal202);

			pushFollow(FOLLOW_statementSequence_in_ifStatement2219);
			s1=statementSequence();
			state._fsp--;

			stream_statementSequence.add(s1.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:73: ( 'ELSIF' expression 'THEN' s2= statementSequence )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==59) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:74: 'ELSIF' expression 'THEN' s2= statementSequence
					{
					string_literal203=(Token)match(input,59,FOLLOW_59_in_ifStatement2222);  
					stream_59.add(string_literal203);

					pushFollow(FOLLOW_expression_in_ifStatement2224);
					expression204=expression();
					state._fsp--;

					stream_expression.add(expression204.getTree());
					string_literal205=(Token)match(input,87,FOLLOW_87_in_ifStatement2226);  
					stream_87.add(string_literal205);

					pushFollow(FOLLOW_statementSequence_in_ifStatement2230);
					s2=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s2.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:123: ( 'ELSE' s3= statementSequence )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==58) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:114:124: 'ELSE' s3= statementSequence
					{
					string_literal206=(Token)match(input,58,FOLLOW_58_in_ifStatement2235);  
					stream_58.add(string_literal206);

					pushFollow(FOLLOW_statementSequence_in_ifStatement2239);
					s3=statementSequence();
					state._fsp--;

					stream_statementSequence.add(s3.getTree());
					}
					break;

			}

			string_literal207=(Token)match(input,60,FOLLOW_60_in_ifStatement2243);  
			stream_60.add(string_literal207);

			// AST REWRITE
			// elements: s2, 59, 58, expression, 64, s1, s3, expression
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
			// 115:29: -> ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( ^( 'ELSE' ( $s3)? ) )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:32: ^( 'IF' ( expression )? ( $s1)? ( ^( 'ELSIF' ( expression )? ( $s2)? ) )* ( ^( 'ELSE' ( $s3)? ) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_64.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:39: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:52: ( $s1)?
				if ( stream_s1.hasNext() ) {
					adaptor.addChild(root_1, stream_s1.nextTree());
				}
				stream_s1.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:56: ( ^( 'ELSIF' ( expression )? ( $s2)? ) )*
				while ( stream_59.hasNext() ) {
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:56: ^( 'ELSIF' ( expression )? ( $s2)? )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_59.nextNode(), root_2);
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:66: ( expression )?
					if ( stream_expression.hasNext() ) {
						adaptor.addChild(root_2, stream_expression.nextTree());
					}
					stream_expression.reset();

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:80: ( $s2)?
					if ( stream_s2.hasNext() ) {
						adaptor.addChild(root_2, stream_s2.nextTree());
					}
					stream_s2.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_59.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:86: ( ^( 'ELSE' ( $s3)? ) )?
				if ( stream_58.hasNext()||stream_s3.hasNext() ) {
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:86: ^( 'ELSE' ( $s3)? )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_58.nextNode(), root_2);
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:96: ( $s3)?
					if ( stream_s3.hasNext() ) {
						adaptor.addChild(root_2, stream_s3.nextTree());
					}
					stream_s3.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_58.reset();
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) ;
	public final OberonParser.caseStatement_return caseStatement() throws RecognitionException {
		OberonParser.caseStatement_return retval = new OberonParser.caseStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal208=null;
		Token string_literal210=null;
		Token char_literal212=null;
		Token string_literal214=null;
		Token string_literal216=null;
		ParserRuleReturnScope expression209 =null;
		ParserRuleReturnScope casE211 =null;
		ParserRuleReturnScope casE213 =null;
		ParserRuleReturnScope statementSequence215 =null;

		Object string_literal208_tree=null;
		Object string_literal210_tree=null;
		Object char_literal212_tree=null;
		Object string_literal214_tree=null;
		Object string_literal216_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_casE=new RewriteRuleSubtreeStream(adaptor,"rule casE");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:29: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			string_literal208=(Token)match(input,96,FOLLOW_96_in_caseStatement2330);  
			stream_96.add(string_literal208);

			pushFollow(FOLLOW_expression_in_caseStatement2332);
			expression209=expression();
			state._fsp--;

			stream_expression.add(expression209.getTree());
			string_literal210=(Token)match(input,79,FOLLOW_79_in_caseStatement2334);  
			stream_79.add(string_literal210);

			pushFollow(FOLLOW_casE_in_caseStatement2336);
			casE211=casE();
			state._fsp--;

			stream_casE.add(casE211.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:57: ( '|' casE )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==98) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:58: '|' casE
					{
					char_literal212=(Token)match(input,98,FOLLOW_98_in_caseStatement2339);  
					stream_98.add(char_literal212);

					pushFollow(FOLLOW_casE_in_caseStatement2341);
					casE213=casE();
					state._fsp--;

					stream_casE.add(casE213.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:69: ( 'ELSE' statementSequence )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==58) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:70: 'ELSE' statementSequence
					{
					string_literal214=(Token)match(input,58,FOLLOW_58_in_caseStatement2346);  
					stream_58.add(string_literal214);

					pushFollow(FOLLOW_statementSequence_in_caseStatement2348);
					statementSequence215=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence215.getTree());
					}
					break;

			}

			string_literal216=(Token)match(input,60,FOLLOW_60_in_caseStatement2352);  
			stream_60.add(string_literal216);

			// AST REWRITE
			// elements: 79, expression, casE, 96, 58, 98, 60, statementSequence, casE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:29: -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:32: ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_96.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_79.nextNode());
				adaptor.addChild(root_1, stream_casE.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:62: ( '|' casE )*
				while ( stream_98.hasNext()||stream_casE.hasNext() ) {
					adaptor.addChild(root_1, stream_98.nextNode());
					adaptor.addChild(root_1, stream_casE.nextTree());
				}
				stream_98.reset();
				stream_casE.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:118:74: ( 'ELSE' statementSequence )?
				if ( stream_58.hasNext()||stream_statementSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_58.nextNode());
					adaptor.addChild(root_1, stream_statementSequence.nextTree());
				}
				stream_58.reset();
				stream_statementSequence.reset();

				adaptor.addChild(root_1, stream_60.nextNode());
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal218=null;
		ParserRuleReturnScope caseLabelList217 =null;
		ParserRuleReturnScope statementSequence219 =null;

		Object char_literal218_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:29: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:29: ( caseLabelList ':' statementSequence )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==CHARCONST||LA38_0==IDENT||LA38_0==INTEGER||LA38_0==REAL||LA38_0==STRING||LA38_0==31||LA38_0==34||LA38_0==36||LA38_0==77||LA38_0==97||LA38_0==100) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:30: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE2439);
					caseLabelList217=caseLabelList();
					state._fsp--;

					adaptor.addChild(root_0, caseLabelList217.getTree());

					char_literal218=(Token)match(input,40,FOLLOW_40_in_casE2441); 
					char_literal218_tree = (Object)adaptor.create(char_literal218);
					adaptor.addChild(root_0, char_literal218_tree);

					pushFollow(FOLLOW_statementSequence_in_casE2443);
					statementSequence219=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence219.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal221=null;
		ParserRuleReturnScope caseLabels220 =null;
		ParserRuleReturnScope caseLabels222 =null;

		Object char_literal221_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:29: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList2465);
			caseLabels220=caseLabels();
			state._fsp--;

			adaptor.addChild(root_0, caseLabels220.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:40: ( ',' caseLabels )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==35) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:41: ',' caseLabels
					{
					char_literal221=(Token)match(input,35,FOLLOW_35_in_caseLabelList2468); 
					char_literal221_tree = (Object)adaptor.create(char_literal221);
					adaptor.addChild(root_0, char_literal221_tree);

					pushFollow(FOLLOW_caseLabels_in_caseLabelList2470);
					caseLabels222=caseLabels();
					state._fsp--;

					adaptor.addChild(root_0, caseLabels222.getTree());

					}
					break;

				default :
					break loop39;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal224=null;
		ParserRuleReturnScope constExpression223 =null;
		ParserRuleReturnScope constExpression225 =null;

		Object string_literal224_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:29: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels2495);
			constExpression223=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression223.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:45: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:46: '..' constExpression
			{
			string_literal224=(Token)match(input,38,FOLLOW_38_in_caseLabels2498); 
			string_literal224_tree = (Object)adaptor.create(string_literal224);
			adaptor.addChild(root_0, string_literal224_tree);

			pushFollow(FOLLOW_constExpression_in_caseLabels2500);
			constExpression225=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression225.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) ;
	public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
		OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal226=null;
		Token string_literal228=null;
		Token string_literal230=null;
		ParserRuleReturnScope expression227 =null;
		ParserRuleReturnScope statementSequence229 =null;

		Object string_literal226_tree=null;
		Object string_literal228_tree=null;
		Object string_literal230_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:23: ( 'WHILE' expression 'DO' statementSequence 'END' -> ^( 'WHILE' expression statementSequence ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:29: 'WHILE' expression 'DO' statementSequence 'END'
			{
			string_literal226=(Token)match(input,91,FOLLOW_91_in_whileStatement2520);  
			stream_91.add(string_literal226);

			pushFollow(FOLLOW_expression_in_whileStatement2522);
			expression227=expression();
			state._fsp--;

			stream_expression.add(expression227.getTree());
			string_literal228=(Token)match(input,57,FOLLOW_57_in_whileStatement2524);  
			stream_57.add(string_literal228);

			pushFollow(FOLLOW_statementSequence_in_whileStatement2526);
			statementSequence229=statementSequence();
			state._fsp--;

			stream_statementSequence.add(statementSequence229.getTree());
			string_literal230=(Token)match(input,60,FOLLOW_60_in_whileStatement2528);  
			stream_60.add(string_literal230);

			// AST REWRITE
			// elements: 91, expression, statementSequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 127:29: -> ^( 'WHILE' expression statementSequence )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:127:32: ^( 'WHILE' expression statementSequence )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_91.nextNode(), root_1);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:1: repeatStatement : 'REPEAT' ^ statementSequence 'UNTIL' ! expression ;
	public final OberonParser.repeatStatement_return repeatStatement() throws RecognitionException {
		OberonParser.repeatStatement_return retval = new OberonParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal231=null;
		Token string_literal233=null;
		ParserRuleReturnScope statementSequence232 =null;
		ParserRuleReturnScope expression234 =null;

		Object string_literal231_tree=null;
		Object string_literal233_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:23: ( 'REPEAT' ^ statementSequence 'UNTIL' ! expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:129:29: 'REPEAT' ^ statementSequence 'UNTIL' ! expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal231=(Token)match(input,84,FOLLOW_84_in_repeatStatement2585); 
			string_literal231_tree = (Object)adaptor.create(string_literal231);
			root_0 = (Object)adaptor.becomeRoot(string_literal231_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_repeatStatement2588);
			statementSequence232=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence232.getTree());

			string_literal233=(Token)match(input,89,FOLLOW_89_in_repeatStatement2590); 
			pushFollow(FOLLOW_expression_in_repeatStatement2593);
			expression234=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression234.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:1: loopStatement : 'LOOP' ^ statementSequence 'END' !;
	public final OberonParser.loopStatement_return loopStatement() throws RecognitionException {
		OberonParser.loopStatement_return retval = new OberonParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal235=null;
		Token string_literal237=null;
		ParserRuleReturnScope statementSequence236 =null;

		Object string_literal235_tree=null;
		Object string_literal237_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:23: ( 'LOOP' ^ statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:131:29: 'LOOP' ^ statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal235=(Token)match(input,71,FOLLOW_71_in_loopStatement2613); 
			string_literal235_tree = (Object)adaptor.create(string_literal235);
			root_0 = (Object)adaptor.becomeRoot(string_literal235_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_loopStatement2616);
			statementSequence236=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence236.getTree());

			string_literal237=(Token)match(input,60,FOLLOW_60_in_loopStatement2618); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:1: withStatement : 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !;
	public final OberonParser.withStatement_return withStatement() throws RecognitionException {
		OberonParser.withStatement_return retval = new OberonParser.withStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal238=null;
		Token char_literal240=null;
		Token string_literal242=null;
		Token string_literal244=null;
		ParserRuleReturnScope qualident239 =null;
		ParserRuleReturnScope qualident241 =null;
		ParserRuleReturnScope statementSequence243 =null;

		Object string_literal238_tree=null;
		Object char_literal240_tree=null;
		Object string_literal242_tree=null;
		Object string_literal244_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:23: ( 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:133:29: 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal238=(Token)match(input,92,FOLLOW_92_in_withStatement2639); 
			string_literal238_tree = (Object)adaptor.create(string_literal238);
			root_0 = (Object)adaptor.becomeRoot(string_literal238_tree, root_0);

			pushFollow(FOLLOW_qualident_in_withStatement2642);
			qualident239=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident239.getTree());

			char_literal240=(Token)match(input,40,FOLLOW_40_in_withStatement2644); 
			char_literal240_tree = (Object)adaptor.create(char_literal240);
			adaptor.addChild(root_0, char_literal240_tree);

			pushFollow(FOLLOW_qualident_in_withStatement2646);
			qualident241=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident241.getTree());

			string_literal242=(Token)match(input,57,FOLLOW_57_in_withStatement2648); 
			pushFollow(FOLLOW_statementSequence_in_withStatement2651);
			statementSequence243=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence243.getTree());

			string_literal244=(Token)match(input,60,FOLLOW_60_in_withStatement2653); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) ;
	public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
		OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal246=null;
		Token IDENT248=null;
		ParserRuleReturnScope procedureHeading245 =null;
		ParserRuleReturnScope procedureBody247 =null;

		Object char_literal246_tree=null;
		Object IDENT248_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
		RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:23: ( procedureHeading ';' procedureBody IDENT -> ^( PROCEDURE procedureHeading procedureBody ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:29: procedureHeading ';' procedureBody IDENT
			{
			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration2667);
			procedureHeading245=procedureHeading();
			state._fsp--;

			stream_procedureHeading.add(procedureHeading245.getTree());
			char_literal246=(Token)match(input,42,FOLLOW_42_in_procedureDeclaration2669);  
			stream_42.add(char_literal246);

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration2671);
			procedureBody247=procedureBody();
			state._fsp--;

			stream_procedureBody.add(procedureBody247.getTree());
			IDENT248=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration2673);  
			stream_IDENT.add(IDENT248);

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
			// 136:29: -> ^( PROCEDURE procedureHeading procedureBody )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:136:32: ^( PROCEDURE procedureHeading procedureBody )
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:1: procedureHeading : 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? ;
	public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
		OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal249=null;
		Token char_literal250=null;
		ParserRuleReturnScope identdef251 =null;
		ParserRuleReturnScope formalParameters252 =null;

		Object string_literal249_tree=null;
		Object char_literal250_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:23: ( 'PROCEDURE' ( '*' )? identdef ( formalParameters )? -> identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:29: 'PROCEDURE' ( '*' )? identdef ( formalParameters )?
			{
			string_literal249=(Token)match(input,82,FOLLOW_82_in_procedureHeading2746);  
			stream_82.add(string_literal249);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:41: ( '*' )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==33) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:41: '*'
					{
					char_literal250=(Token)match(input,33,FOLLOW_33_in_procedureHeading2748);  
					stream_33.add(char_literal250);

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading2751);
			identdef251=identdef();
			state._fsp--;

			stream_identdef.add(identdef251.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:55: ( formalParameters )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==31) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:138:55: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading2753);
					formalParameters252=formalParameters();
					state._fsp--;

					stream_formalParameters.add(formalParameters252.getTree());
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
			// 139:29: -> identdef ( formalParameters )?
			{
				adaptor.addChild(root_0, stream_identdef.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:41: ( formalParameters )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) ;
	public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
		OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal254=null;
		Token string_literal256=null;
		ParserRuleReturnScope declarationSequence253 =null;
		ParserRuleReturnScope statementSequence255 =null;

		Object string_literal254_tree=null;
		Object string_literal256_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
		RewriteRuleSubtreeStream stream_declarationSequence=new RewriteRuleSubtreeStream(adaptor,"rule declarationSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:29: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			pushFollow(FOLLOW_declarationSequence_in_procedureBody2810);
			declarationSequence253=declarationSequence();
			state._fsp--;

			stream_declarationSequence.add(declarationSequence253.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:49: ( 'BEGIN' statementSequence )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==51) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:50: 'BEGIN' statementSequence
					{
					string_literal254=(Token)match(input,51,FOLLOW_51_in_procedureBody2813);  
					stream_51.add(string_literal254);

					pushFollow(FOLLOW_statementSequence_in_procedureBody2815);
					statementSequence255=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence255.getTree());
					}
					break;

			}

			string_literal256=(Token)match(input,60,FOLLOW_60_in_procedureBody2819);  
			stream_60.add(string_literal256);

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
			// 142:29: -> ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:32: ^( PROCEDURE_BODY ( declarationSequence )? ( statementSequence )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:49: ( declarationSequence )?
				if ( stream_declarationSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_declarationSequence.nextTree());
				}
				stream_declarationSequence.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:142:71: ( statementSequence )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
	public final OberonParser.forwardDeclaration_return forwardDeclaration() throws RecognitionException {
		OberonParser.forwardDeclaration_return retval = new OberonParser.forwardDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal257=null;
		Token char_literal258=null;
		ParserRuleReturnScope identdef259 =null;
		ParserRuleReturnScope formalParameters260 =null;

		Object string_literal257_tree=null;
		Object char_literal258_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:29: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal257=(Token)match(input,82,FOLLOW_82_in_forwardDeclaration2879); 
			string_literal257_tree = (Object)adaptor.create(string_literal257);
			adaptor.addChild(root_0, string_literal257_tree);

			char_literal258=(Token)match(input,95,FOLLOW_95_in_forwardDeclaration2881); 
			char_literal258_tree = (Object)adaptor.create(char_literal258);
			adaptor.addChild(root_0, char_literal258_tree);

			pushFollow(FOLLOW_identdef_in_forwardDeclaration2883);
			identdef259=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef259.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:54: ( formalParameters )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==31) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:144:54: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration2885);
					formalParameters260=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters260.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:1: declarationSequence : ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* ;
	public final OberonParser.declarationSequence_return declarationSequence() throws RecognitionException {
		OberonParser.declarationSequence_return retval = new OberonParser.declarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal265=null;
		Token char_literal267=null;
		ParserRuleReturnScope constdeclarationSequence261 =null;
		ParserRuleReturnScope typedeclarationSequence262 =null;
		ParserRuleReturnScope vardeclarationSequence263 =null;
		ParserRuleReturnScope procedureDeclaration264 =null;
		ParserRuleReturnScope forwardDeclaration266 =null;

		Object char_literal265_tree=null;
		Object char_literal267_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:24: ( ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:29: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:29: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )*
			loop44:
			while (true) {
				int alt44=4;
				switch ( input.LA(1) ) {
				case 53:
					{
					alt44=1;
					}
					break;
				case 88:
					{
					alt44=2;
					}
					break;
				case 90:
					{
					alt44=3;
					}
					break;
				}
				switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:30: constdeclarationSequence
					{
					pushFollow(FOLLOW_constdeclarationSequence_in_declarationSequence2901);
					constdeclarationSequence261=constdeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, constdeclarationSequence261.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:57: typedeclarationSequence
					{
					pushFollow(FOLLOW_typedeclarationSequence_in_declarationSequence2905);
					typedeclarationSequence262=typedeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, typedeclarationSequence262.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:82: vardeclarationSequence
					{
					pushFollow(FOLLOW_vardeclarationSequence_in_declarationSequence2908);
					vardeclarationSequence263=vardeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, vardeclarationSequence263.getTree());

					}
					break;

				default :
					break loop44;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:109: ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			loop45:
			while (true) {
				int alt45=3;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==82) ) {
					int LA45_2 = input.LA(2);
					if ( (LA45_2==95) ) {
						alt45=2;
					}
					else if ( (LA45_2==IDENT||LA45_2==33) ) {
						alt45=1;
					}

				}

				switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:110: procedureDeclaration ';' !
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence2915);
					procedureDeclaration264=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration264.getTree());

					char_literal265=(Token)match(input,42,FOLLOW_42_in_declarationSequence2917); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:138: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence2922);
					forwardDeclaration266=forwardDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, forwardDeclaration266.getTree());

					char_literal267=(Token)match(input,42,FOLLOW_42_in_declarationSequence2924); 
					char_literal267_tree = (Object)adaptor.create(char_literal267);
					adaptor.addChild(root_0, char_literal267_tree);

					}
					break;

				default :
					break loop45;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:1: constdeclarationSequence : 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) ;
	public final OberonParser.constdeclarationSequence_return constdeclarationSequence() throws RecognitionException {
		OberonParser.constdeclarationSequence_return retval = new OberonParser.constdeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal268=null;
		Token char_literal270=null;
		ParserRuleReturnScope constantDeclaration269 =null;

		Object string_literal268_tree=null;
		Object char_literal270_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:26: ( 'CONST' ( constantDeclaration ';' )* -> ^( 'CONST' ( constantDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:29: 'CONST' ( constantDeclaration ';' )*
			{
			string_literal268=(Token)match(input,53,FOLLOW_53_in_constdeclarationSequence2935);  
			stream_53.add(string_literal268);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:37: ( constantDeclaration ';' )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==IDENT) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:38: constantDeclaration ';'
					{
					pushFollow(FOLLOW_constantDeclaration_in_constdeclarationSequence2938);
					constantDeclaration269=constantDeclaration();
					state._fsp--;

					stream_constantDeclaration.add(constantDeclaration269.getTree());
					char_literal270=(Token)match(input,42,FOLLOW_42_in_constdeclarationSequence2940);  
					stream_42.add(char_literal270);

					}
					break;

				default :
					break loop46;
				}
			}

			// AST REWRITE
			// elements: constantDeclaration, 53
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:29: -> ^( 'CONST' ( constantDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:32: ^( 'CONST' ( constantDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_53.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:149:42: ( constantDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:151:1: typedeclarationSequence : 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) ;
	public final OberonParser.typedeclarationSequence_return typedeclarationSequence() throws RecognitionException {
		OberonParser.typedeclarationSequence_return retval = new OberonParser.typedeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal271=null;
		Token char_literal273=null;
		ParserRuleReturnScope typeDeclaration272 =null;

		Object string_literal271_tree=null;
		Object char_literal273_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:151:25: ( 'TYPE' ( typeDeclaration ';' )* -> ^( 'TYPE' ( typeDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:151:29: 'TYPE' ( typeDeclaration ';' )*
			{
			string_literal271=(Token)match(input,88,FOLLOW_88_in_typedeclarationSequence2999);  
			stream_88.add(string_literal271);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:151:36: ( typeDeclaration ';' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==IDENT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:151:38: typeDeclaration ';'
					{
					pushFollow(FOLLOW_typeDeclaration_in_typedeclarationSequence3003);
					typeDeclaration272=typeDeclaration();
					state._fsp--;

					stream_typeDeclaration.add(typeDeclaration272.getTree());
					char_literal273=(Token)match(input,42,FOLLOW_42_in_typedeclarationSequence3005);  
					stream_42.add(char_literal273);

					}
					break;

				default :
					break loop47;
				}
			}

			// AST REWRITE
			// elements: 88, typeDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 152:29: -> ^( 'TYPE' ( typeDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:32: ^( 'TYPE' ( typeDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_88.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:41: ( typeDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:1: vardeclarationSequence : 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) ;
	public final OberonParser.vardeclarationSequence_return vardeclarationSequence() throws RecognitionException {
		OberonParser.vardeclarationSequence_return retval = new OberonParser.vardeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal274=null;
		Token char_literal276=null;
		ParserRuleReturnScope variableDeclaration275 =null;

		Object string_literal274_tree=null;
		Object char_literal276_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:24: ( 'VAR' ( variableDeclaration ';' )* -> ^( 'VAR' ( variableDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:29: 'VAR' ( variableDeclaration ';' )*
			{
			string_literal274=(Token)match(input,90,FOLLOW_90_in_vardeclarationSequence3071);  
			stream_90.add(string_literal274);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:35: ( variableDeclaration ';' )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==IDENT) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:36: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_vardeclarationSequence3074);
					variableDeclaration275=variableDeclaration();
					state._fsp--;

					stream_variableDeclaration.add(variableDeclaration275.getTree());
					char_literal276=(Token)match(input,42,FOLLOW_42_in_vardeclarationSequence3076);  
					stream_42.add(char_literal276);

					}
					break;

				default :
					break loop48;
				}
			}

			// AST REWRITE
			// elements: 90, variableDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 155:29: -> ^( 'VAR' ( variableDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:155:32: ^( 'VAR' ( variableDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_90.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:155:40: ( variableDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( F_PARAMS ( fpSection )* ( qualident )? ) ;
	public final OberonParser.formalParameters_return formalParameters() throws RecognitionException {
		OberonParser.formalParameters_return retval = new OberonParser.formalParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal277=null;
		Token char_literal279=null;
		Token char_literal281=null;
		Token char_literal282=null;
		ParserRuleReturnScope fpSection278 =null;
		ParserRuleReturnScope fpSection280 =null;
		ParserRuleReturnScope qualident283 =null;

		Object char_literal277_tree=null;
		Object char_literal279_tree=null;
		Object char_literal281_tree=null;
		Object char_literal282_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
		RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? -> ^( F_PARAMS ( fpSection )* ( qualident )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:29: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			char_literal277=(Token)match(input,31,FOLLOW_31_in_formalParameters3146);  
			stream_31.add(char_literal277);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:33: ( fpSection ( ';' fpSection )* )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==IDENT||LA50_0==90) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:34: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters3149);
					fpSection278=fpSection();
					state._fsp--;

					stream_fpSection.add(fpSection278.getTree());
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:44: ( ';' fpSection )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==42) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:45: ';' fpSection
							{
							char_literal279=(Token)match(input,42,FOLLOW_42_in_formalParameters3152);  
							stream_42.add(char_literal279);

							pushFollow(FOLLOW_fpSection_in_formalParameters3154);
							fpSection280=fpSection();
							state._fsp--;

							stream_fpSection.add(fpSection280.getTree());
							}
							break;

						default :
							break loop49;
						}
					}

					}
					break;

			}

			char_literal281=(Token)match(input,32,FOLLOW_32_in_formalParameters3160);  
			stream_32.add(char_literal281);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:67: ( ':' qualident )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==40) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:158:68: ':' qualident
					{
					char_literal282=(Token)match(input,40,FOLLOW_40_in_formalParameters3163);  
					stream_40.add(char_literal282);

					pushFollow(FOLLOW_qualident_in_formalParameters3165);
					qualident283=qualident();
					state._fsp--;

					stream_qualident.add(qualident283.getTree());
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
			// 159:29: -> ^( F_PARAMS ( fpSection )* ( qualident )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:32: ^( F_PARAMS ( fpSection )* ( qualident )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(F_PARAMS, "F_PARAMS"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:43: ( fpSection )*
				while ( stream_fpSection.hasNext() ) {
					adaptor.addChild(root_1, stream_fpSection.nextTree());
				}
				stream_fpSection.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:159:54: ( qualident )?
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType -> ^( F_PARAM ^( ID ( IDENT )* ) formalType ) ;
	public final OberonParser.fpSection_return fpSection() throws RecognitionException {
		OberonParser.fpSection_return retval = new OberonParser.fpSection_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal284=null;
		Token IDENT285=null;
		Token char_literal286=null;
		Token IDENT287=null;
		Token char_literal288=null;
		ParserRuleReturnScope formalType289 =null;

		Object string_literal284_tree=null;
		Object IDENT285_tree=null;
		Object char_literal286_tree=null;
		Object IDENT287_tree=null;
		Object char_literal288_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleSubtreeStream stream_formalType=new RewriteRuleSubtreeStream(adaptor,"rule formalType");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType -> ^( F_PARAM ^( ID ( IDENT )* ) formalType ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:29: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:29: ( 'VAR' )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==90) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:29: 'VAR'
					{
					string_literal284=(Token)match(input,90,FOLLOW_90_in_fpSection3232);  
					stream_90.add(string_literal284);

					}
					break;

			}

			IDENT285=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection3235);  
			stream_IDENT.add(IDENT285);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:42: ( ',' IDENT )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==35) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:161:43: ',' IDENT
					{
					char_literal286=(Token)match(input,35,FOLLOW_35_in_fpSection3238);  
					stream_35.add(char_literal286);

					IDENT287=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection3240);  
					stream_IDENT.add(IDENT287);

					}
					break;

				default :
					break loop53;
				}
			}

			char_literal288=(Token)match(input,40,FOLLOW_40_in_fpSection3245);  
			stream_40.add(char_literal288);

			pushFollow(FOLLOW_formalType_in_fpSection3247);
			formalType289=formalType();
			state._fsp--;

			stream_formalType.add(formalType289.getTree());
			// AST REWRITE
			// elements: formalType, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 162:29: -> ^( F_PARAM ^( ID ( IDENT )* ) formalType )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:32: ^( F_PARAM ^( ID ( IDENT )* ) formalType )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(F_PARAM, "F_PARAM"), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:42: ^( ID ( IDENT )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_2);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:162:47: ( IDENT )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:1: formalType : ( ( 'ARRAY' ^ 'OF' !)* qualident | procedureType );
	public final OberonParser.formalType_return formalType() throws RecognitionException {
		OberonParser.formalType_return retval = new OberonParser.formalType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal290=null;
		Token string_literal291=null;
		ParserRuleReturnScope qualident292 =null;
		ParserRuleReturnScope procedureType293 =null;

		Object string_literal290_tree=null;
		Object string_literal291_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:23: ( ( 'ARRAY' ^ 'OF' !)* qualident | procedureType )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==IDENT||LA55_0==49) ) {
				alt55=1;
			}
			else if ( (LA55_0==82) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:29: ( 'ARRAY' ^ 'OF' !)* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:29: ( 'ARRAY' ^ 'OF' !)*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==49) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:30: 'ARRAY' ^ 'OF' !
							{
							string_literal290=(Token)match(input,49,FOLLOW_49_in_formalType3315); 
							string_literal290_tree = (Object)adaptor.create(string_literal290);
							root_0 = (Object)adaptor.becomeRoot(string_literal290_tree, root_0);

							string_literal291=(Token)match(input,79,FOLLOW_79_in_formalType3318); 
							}
							break;

						default :
							break loop54;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType3323);
					qualident292=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident292.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:164:59: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType3327);
					procedureType293=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType293.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:1: module : 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !;
	public final OberonParser.module_return module() throws RecognitionException {
		OberonParser.module_return retval = new OberonParser.module_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal294=null;
		Token IDENT295=null;
		Token char_literal296=null;
		Token string_literal299=null;
		Token string_literal301=null;
		Token IDENT302=null;
		Token char_literal303=null;
		Token EOF304=null;
		ParserRuleReturnScope importList297 =null;
		ParserRuleReturnScope declarationSequence298 =null;
		ParserRuleReturnScope statementSequence300 =null;

		Object string_literal294_tree=null;
		Object IDENT295_tree=null;
		Object char_literal296_tree=null;
		Object string_literal299_tree=null;
		Object string_literal301_tree=null;
		Object IDENT302_tree=null;
		Object char_literal303_tree=null;
		Object EOF304_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:23: ( 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:29: 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' ! statementSequence )? 'END' ! IDENT ! '.' ! EOF !
			{
			root_0 = (Object)adaptor.nil();


			string_literal294=(Token)match(input,75,FOLLOW_75_in_module3354); 
			string_literal294_tree = (Object)adaptor.create(string_literal294);
			root_0 = (Object)adaptor.becomeRoot(string_literal294_tree, root_0);

			IDENT295=(Token)match(input,IDENT,FOLLOW_IDENT_in_module3357); 
			IDENT295_tree = (Object)adaptor.create(IDENT295);
			adaptor.addChild(root_0, IDENT295_tree);

			char_literal296=(Token)match(input,42,FOLLOW_42_in_module3359); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:50: ( importList )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==65) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:50: importList
					{
					pushFollow(FOLLOW_importList_in_module3362);
					importList297=importList();
					state._fsp--;

					adaptor.addChild(root_0, importList297.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module3365);
			declarationSequence298=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence298.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:82: ( 'BEGIN' ! statementSequence )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==51) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:166:83: 'BEGIN' ! statementSequence
					{
					string_literal299=(Token)match(input,51,FOLLOW_51_in_module3368); 
					pushFollow(FOLLOW_statementSequence_in_module3371);
					statementSequence300=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence300.getTree());

					}
					break;

			}

			string_literal301=(Token)match(input,60,FOLLOW_60_in_module3375); 
			IDENT302=(Token)match(input,IDENT,FOLLOW_IDENT_in_module3378); 
			char_literal303=(Token)match(input,37,FOLLOW_37_in_module3381); 
			EOF304=(Token)match(input,EOF,FOLLOW_EOF_in_module3384); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:168:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) ;
	public final OberonParser.importList_return importList() throws RecognitionException {
		OberonParser.importList_return retval = new OberonParser.importList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal305=null;
		Token char_literal307=null;
		Token char_literal309=null;
		ParserRuleReturnScope importDeclaration306 =null;
		ParserRuleReturnScope importDeclaration308 =null;

		Object string_literal305_tree=null;
		Object char_literal307_tree=null;
		Object char_literal309_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_importDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule importDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:168:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:168:29: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			string_literal305=(Token)match(input,65,FOLLOW_65_in_importList3408);  
			stream_65.add(string_literal305);

			pushFollow(FOLLOW_importDeclaration_in_importList3410);
			importDeclaration306=importDeclaration();
			state._fsp--;

			stream_importDeclaration.add(importDeclaration306.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:168:56: ( ',' importDeclaration )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==35) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:168:57: ',' importDeclaration
					{
					char_literal307=(Token)match(input,35,FOLLOW_35_in_importList3413);  
					stream_35.add(char_literal307);

					pushFollow(FOLLOW_importDeclaration_in_importList3415);
					importDeclaration308=importDeclaration();
					state._fsp--;

					stream_importDeclaration.add(importDeclaration308.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			char_literal309=(Token)match(input,42,FOLLOW_42_in_importList3419);  
			stream_42.add(char_literal309);

			// AST REWRITE
			// elements: importDeclaration, importDeclaration, 65
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 169:29: -> ^( 'IMPORT' importDeclaration ( importDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:32: ^( 'IMPORT' importDeclaration ( importDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_65.nextNode(), root_1);
				adaptor.addChild(root_1, stream_importDeclaration.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:169:61: ( importDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:171:1: importDeclaration : IDENT ( ':=' IDENT )? -> ^( IMPORT_DECL IDENT ( IDENT )? ) ;
	public final OberonParser.importDeclaration_return importDeclaration() throws RecognitionException {
		OberonParser.importDeclaration_return retval = new OberonParser.importDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT310=null;
		Token string_literal311=null;
		Token IDENT312=null;

		Object IDENT310_tree=null;
		Object string_literal311_tree=null;
		Object IDENT312_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:171:23: ( IDENT ( ':=' IDENT )? -> ^( IMPORT_DECL IDENT ( IDENT )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:171:29: IDENT ( ':=' IDENT )?
			{
			IDENT310=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration3484);  
			stream_IDENT.add(IDENT310);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:171:35: ( ':=' IDENT )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==41) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:171:36: ':=' IDENT
					{
					string_literal311=(Token)match(input,41,FOLLOW_41_in_importDeclaration3487);  
					stream_41.add(string_literal311);

					IDENT312=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration3489);  
					stream_IDENT.add(IDENT312);

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
			// 172:29: -> ^( IMPORT_DECL IDENT ( IDENT )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:172:32: ^( IMPORT_DECL IDENT ( IDENT )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPORT_DECL, "IMPORT_DECL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:172:53: ( IDENT )?
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



	public static final BitSet FOLLOW_48_in_abs103 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_abs106 = new BitSet(new long[]{0x0000000001080000L});
	public static final BitSet FOLLOW_number_in_abs109 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_abs111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_odd141 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_odd144 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_odd147 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_odd149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_cap195 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_cap198 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CHARACTER_in_cap201 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_cap203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ash233 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_ash236 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_ash239 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_ash241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_len271 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_len274 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_len277 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_len280 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_len282 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_len286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_maxMin314 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_73_in_maxMin317 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_maxMin321 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_maxMin324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_maxMin326 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_maxMin328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_size358 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_size361 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_size364 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_size366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_inc397 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_inc400 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_inc403 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_inc406 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_inc409 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_inc413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_dec443 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_dec446 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_dec449 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_dec452 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_dec455 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_dec459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_incl488 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_incl491 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_set_in_incl494 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_incl496 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_incl499 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_incl501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_excl530 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_excl533 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_set_in_excl536 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_excl538 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_excl541 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_excl543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_copy572 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_copy575 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_copy578 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_copy580 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_copy583 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_copy585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_neW615 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_neW618 = new BitSet(new long[]{0x0000000100020000L});
	public static final BitSet FOLLOW_qualident_in_neW621 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_neW624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_halt654 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_halt657 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INTEGER_in_halt660 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_halt662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abs_in_predefined687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_odd_in_predefined689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cap_in_predefined691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ash_in_predefined693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_len_in_predefined695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_maxMin_in_predefined697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_size_in_predefined699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inc_in_predefined701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dec_in_predefined703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incl_in_predefined705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_excl_in_predefined707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copy_in_predefined709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_neW_in_predefined711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_in_predefined713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identdef773 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_identdef775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration790 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_constantDeclaration792 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_constExpression_in_constantDeclaration794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constExpression857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_typeDeclaration875 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_typeDeclaration877 = new BitSet(new long[]{0x0002000000020000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_type964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_type980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_arrayType1004 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_length_in_arrayType1006 = new BitSet(new long[]{0x0000000800000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_35_in_arrayType1009 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_length_in_arrayType1011 = new BitSet(new long[]{0x0000000800000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_arrayType1015 = new BitSet(new long[]{0x0002000000020000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_type_in_arrayType1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constExpression_in_length1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_recordType1112 = new BitSet(new long[]{0x0000040080020000L});
	public static final BitSet FOLLOW_31_in_recordType1115 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_baseType_in_recordType1117 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_recordType1119 = new BitSet(new long[]{0x0000040000020000L});
	public static final BitSet FOLLOW_fieldListSequence_in_recordType1123 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_recordType1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_baseType1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence1207 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_fieldListSequence1210 = new BitSet(new long[]{0x0000040000020000L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence1213 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_identList_in_fieldList1241 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_fieldList1243 = new BitSet(new long[]{0x0002000000020000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_type_in_fieldList1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_identList1272 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_identList1275 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_identdef_in_identList1278 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_81_in_pointerType1302 = new BitSet(new long[]{0x0002000000020000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_type_in_pointerType1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_procedureType1325 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureType1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identList_in_variableDeclaration1343 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_variableDeclaration1345 = new BitSet(new long[]{0x0002000000020000L,0x00000000000E0000L});
	public static final BitSet FOLLOW_type_in_variableDeclaration1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualident1442 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_qualident1444 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_qualident1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_designator1509 = new BitSet(new long[]{0x0000002080000002L,0x00000000A0000000L});
	public static final BitSet FOLLOW_37_in_designator1520 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_designator1523 = new BitSet(new long[]{0x0000002080000002L,0x00000000A0000000L});
	public static final BitSet FOLLOW_93_in_designator1527 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expList_in_designator1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_designator1532 = new BitSet(new long[]{0x0000002080000002L,0x00000000A0000000L});
	public static final BitSet FOLLOW_31_in_designator1537 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_designator1540 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_designator1542 = new BitSet(new long[]{0x0000002080000002L,0x00000000A0000000L});
	public static final BitSet FOLLOW_95_in_designator1547 = new BitSet(new long[]{0x0000002080000002L,0x00000000A0000000L});
	public static final BitSet FOLLOW_expression_in_expList1575 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_expList1578 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_expList1581 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1606 = new BitSet(new long[]{0x0000F80020000002L,0x0000000000000024L});
	public static final BitSet FOLLOW_relation_in_expression1609 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_simpleExpression_in_expression1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression1708 = new BitSet(new long[]{0x0000001400000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression1711 = new BitSet(new long[]{0x00000000850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_term_in_simpleExpression1714 = new BitSet(new long[]{0x0000001400000002L,0x0000000000010000L});
	public static final BitSet FOLLOW_factor_in_term1775 = new BitSet(new long[]{0x0100008240000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_mulOperator_in_term1778 = new BitSet(new long[]{0x00000000850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_factor_in_term1781 = new BitSet(new long[]{0x0100008240000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_number_in_factor1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_factor1852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor1860 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_actualParameters_in_factor1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_factor1867 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_factor1870 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_factor1873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_factor1878 = new BitSet(new long[]{0x00000000850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_factor_in_factor1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_set1910 = new BitSet(new long[]{0x00000014850A0100L,0x0000001A00002000L});
	public static final BitSet FOLLOW_element_in_set1914 = new BitSet(new long[]{0x0000000800000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_set1917 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_element_in_set1920 = new BitSet(new long[]{0x0000000800000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_set1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element1954 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_element1958 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_element1961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_actualParameters1980 = new BitSet(new long[]{0x00000015850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expList_in_actualParameters1983 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_actualParameters1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predefined_in_statement2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement2_in_statement2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement2026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_statement2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_statement2033 = new BitSet(new long[]{0x00000014850A0102L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_statement2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement22065 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_41_in_statement22070 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_statement22072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement22087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence2137 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_statementSequence2141 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statement_in_statementSequence2143 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_64_in_ifStatement2211 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_ifStatement2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_ifStatement2215 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2219 = new BitSet(new long[]{0x1C00000000000000L});
	public static final BitSet FOLLOW_59_in_ifStatement2222 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_ifStatement2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_ifStatement2226 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2230 = new BitSet(new long[]{0x1C00000000000000L});
	public static final BitSet FOLLOW_58_in_ifStatement2235 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement2239 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement2243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_caseStatement2330 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_caseStatement2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_caseStatement2334 = new BitSet(new long[]{0x14000014850A0100L,0x0000001600002000L});
	public static final BitSet FOLLOW_casE_in_caseStatement2336 = new BitSet(new long[]{0x1400000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_caseStatement2339 = new BitSet(new long[]{0x14000014850A0100L,0x0000001600002000L});
	public static final BitSet FOLLOW_casE_in_caseStatement2341 = new BitSet(new long[]{0x1400000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_58_in_caseStatement2346 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement2348 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_caseStatement2352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE2439 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_casE2441 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_casE2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList2465 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_caseLabelList2468 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList2470 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels2495 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_caseLabels2498 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels2500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_whileStatement2520 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_whileStatement2522 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_whileStatement2524 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement2526 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_whileStatement2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_repeatStatement2585 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_repeatStatement2590 = new BitSet(new long[]{0x00000014850A0100L,0x0000001200002000L});
	public static final BitSet FOLLOW_expression_in_repeatStatement2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_loopStatement2613 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement2616 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_loopStatement2618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_withStatement2639 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2642 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_withStatement2644 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_withStatement2646 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_withStatement2648 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_withStatement2651 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_withStatement2653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration2667 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_procedureDeclaration2669 = new BitSet(new long[]{0x1028000000000000L,0x0000000005040000L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration2671 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration2673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_procedureHeading2746 = new BitSet(new long[]{0x0000000200020000L});
	public static final BitSet FOLLOW_33_in_procedureHeading2748 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading2751 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading2753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody2810 = new BitSet(new long[]{0x1008000000000000L});
	public static final BitSet FOLLOW_51_in_procedureBody2813 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody2815 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_procedureBody2819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_forwardDeclaration2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_forwardDeclaration2881 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration2883 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration2885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constdeclarationSequence_in_declarationSequence2901 = new BitSet(new long[]{0x0020000000000002L,0x0000000005040000L});
	public static final BitSet FOLLOW_typedeclarationSequence_in_declarationSequence2905 = new BitSet(new long[]{0x0020000000000002L,0x0000000005040000L});
	public static final BitSet FOLLOW_vardeclarationSequence_in_declarationSequence2908 = new BitSet(new long[]{0x0020000000000002L,0x0000000005040000L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence2915 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarationSequence2917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence2922 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_declarationSequence2924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_53_in_constdeclarationSequence2935 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_constantDeclaration_in_constdeclarationSequence2938 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_constdeclarationSequence2940 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_88_in_typedeclarationSequence2999 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typedeclarationSequence3003 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_typedeclarationSequence3005 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_90_in_vardeclarationSequence3071 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_variableDeclaration_in_vardeclarationSequence3074 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_vardeclarationSequence3076 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_31_in_formalParameters3146 = new BitSet(new long[]{0x0000000100020000L,0x0000000004000000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters3149 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_42_in_formalParameters3152 = new BitSet(new long[]{0x0000000000020000L,0x0000000004000000L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters3154 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_32_in_formalParameters3160 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_formalParameters3163 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_qualident_in_formalParameters3165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_fpSection3232 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection3235 = new BitSet(new long[]{0x0000010800000000L});
	public static final BitSet FOLLOW_35_in_fpSection3238 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_fpSection3240 = new BitSet(new long[]{0x0000010800000000L});
	public static final BitSet FOLLOW_40_in_fpSection3245 = new BitSet(new long[]{0x0002000000020000L,0x0000000000040000L});
	public static final BitSet FOLLOW_formalType_in_fpSection3247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_formalType3315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_formalType3318 = new BitSet(new long[]{0x0002000000020000L});
	public static final BitSet FOLLOW_qualident_in_formalType3323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType3327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_module3354 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_module3357 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_module3359 = new BitSet(new long[]{0x1028000000000000L,0x0000000005040002L});
	public static final BitSet FOLLOW_importList_in_module3362 = new BitSet(new long[]{0x1028000000000000L,0x0000000005040000L});
	public static final BitSet FOLLOW_declarationSequence_in_module3365 = new BitSet(new long[]{0x1008000000000000L});
	public static final BitSet FOLLOW_51_in_module3368 = new BitSet(new long[]{0xE0D5040000020000L,0x00000003187053D9L});
	public static final BitSet FOLLOW_statementSequence_in_module3371 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_module3375 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_module3378 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_module3381 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module3384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_importList3408 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList3410 = new BitSet(new long[]{0x0000040800000000L});
	public static final BitSet FOLLOW_35_in_importList3413 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_importDeclaration_in_importList3415 = new BitSet(new long[]{0x0000040800000000L});
	public static final BitSet FOLLOW_42_in_importList3419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration3484 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_importDeclaration3487 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration3489 = new BitSet(new long[]{0x0000000000000002L});
}
