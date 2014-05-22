// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-22 13:25:10
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER", "CHARCONST", "COMMENT", 
		"DIGIT", "HEX_DIGIT", "IDENT", "INTEGER", "LETTER", "REAL", "SCALE_FACTOR", 
		"STRING", "WS", "'#'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'..'", "'/'", "':'", "':='", "';'", "'<'", "'<='", "'='", "'>'", 
		"'>='", "'ARRAY OF'", "'ARRAY'", "'BEGIN'", "'CONST'", "'DIV'", "'DO'", 
		"'ELSE'", "'ELSEIF'", "'END'", "'EXIT'", "'IF'", "'IMPORT'", "'IN'", "'IS'", 
		"'LOOP'", "'MOD'", "'MODULE'", "'NIL'", "'OF'", "'OR'", "'POINTER TO'", 
		"'PROCEDURE'", "'RECORD'", "'REPEAT'", "'RETURN'", "'THEN'", "'TYPE'", 
		"'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", "'['", "']'", "'^'", "'case'", 
		"'{'", "'|'", "'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
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
	public static final int CHARACTER=4;
	public static final int CHARCONST=5;
	public static final int COMMENT=6;
	public static final int DIGIT=7;
	public static final int HEX_DIGIT=8;
	public static final int IDENT=9;
	public static final int INTEGER=10;
	public static final int LETTER=11;
	public static final int REAL=12;
	public static final int SCALE_FACTOR=13;
	public static final int STRING=14;
	public static final int WS=15;

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


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:1: number : ( INTEGER | REAL );
	public final OberonParser.number_return number() throws RecognitionException {
		OberonParser.number_return retval = new OberonParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;

		Object set1_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:23: ( INTEGER | REAL )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set1=input.LT(1);
			if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set1));
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


	public static class qualident_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualident"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:1: qualident : ( IDENT '.' )? IDENT ;
	public final OberonParser.qualident_return qualident() throws RecognitionException {
		OberonParser.qualident_return retval = new OberonParser.qualident_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT2=null;
		Token char_literal3=null;
		Token IDENT4=null;

		Object IDENT2_tree=null;
		Object char_literal3_tree=null;
		Object IDENT4_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:23: ( ( IDENT '.' )? IDENT )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:25: ( IDENT '.' )? IDENT
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:25: ( IDENT '.' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==IDENT) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==24) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==IDENT) ) {
						alt1=1;
					}
				}
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:26: IDENT '.'
					{
					IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident91); 
					IDENT2_tree = (Object)adaptor.create(IDENT2);
					adaptor.addChild(root_0, IDENT2_tree);

					char_literal3=(Token)match(input,24,FOLLOW_24_in_qualident93); 
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);

					}
					break;

			}

			IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident97); 
			IDENT4_tree = (Object)adaptor.create(IDENT4);
			adaptor.addChild(root_0, IDENT4_tree);

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


	public static class identdef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identdef"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:1: identdef : IDENT ( '*' )? ;
	public final OberonParser.identdef_return identdef() throws RecognitionException {
		OberonParser.identdef_return retval = new OberonParser.identdef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT5=null;
		Token char_literal6=null;

		Object IDENT5_tree=null;
		Object char_literal6_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:23: ( IDENT ( '*' )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:25: IDENT ( '*' )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef119); 
			IDENT5_tree = (Object)adaptor.create(IDENT5);
			adaptor.addChild(root_0, IDENT5_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:31: ( '*' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==20) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:31: '*'
					{
					char_literal6=(Token)match(input,20,FOLLOW_20_in_identdef121); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:1: constantDeclaration : identdef '=' constExpression ;
	public final OberonParser.constantDeclaration_return constantDeclaration() throws RecognitionException {
		OberonParser.constantDeclaration_return retval = new OberonParser.constantDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal8=null;
		ParserRuleReturnScope identdef7 =null;
		ParserRuleReturnScope constExpression9 =null;

		Object char_literal8_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:23: ( identdef '=' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:25: identdef '=' constExpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_constantDeclaration132);
			identdef7=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef7.getTree());

			char_literal8=(Token)match(input,32,FOLLOW_32_in_constantDeclaration134); 
			char_literal8_tree = (Object)adaptor.create(char_literal8);
			adaptor.addChild(root_0, char_literal8_tree);

			pushFollow(FOLLOW_constExpression_in_constantDeclaration136);
			constExpression9=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression9.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:1: constExpression : expression ;
	public final OberonParser.constExpression_return constExpression() throws RecognitionException {
		OberonParser.constExpression_return retval = new OberonParser.constExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression10 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:23: ( expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:25: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constExpression150);
			expression10=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression10.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:1: typeDeclaration : identdef '=' type ;
	public final OberonParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		OberonParser.typeDeclaration_return retval = new OberonParser.typeDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal12=null;
		ParserRuleReturnScope identdef11 =null;
		ParserRuleReturnScope type13 =null;

		Object char_literal12_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:23: ( identdef '=' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:25: identdef '=' type
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_typeDeclaration164);
			identdef11=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef11.getTree());

			char_literal12=(Token)match(input,32,FOLLOW_32_in_typeDeclaration166); 
			char_literal12_tree = (Object)adaptor.create(char_literal12);
			adaptor.addChild(root_0, char_literal12_tree);

			pushFollow(FOLLOW_type_in_typeDeclaration168);
			type13=type();
			state._fsp--;

			adaptor.addChild(root_0, type13.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:1: type : ( qualident | arrayType | recordType | pointerType | procedureType );
	public final OberonParser.type_return type() throws RecognitionException {
		OberonParser.type_return retval = new OberonParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident14 =null;
		ParserRuleReturnScope arrayType15 =null;
		ParserRuleReturnScope recordType16 =null;
		ParserRuleReturnScope pointerType17 =null;
		ParserRuleReturnScope procedureType18 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:23: ( qualident | arrayType | recordType | pointerType | procedureType )
			int alt3=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt3=1;
				}
				break;
			case 36:
				{
				alt3=2;
				}
				break;
			case 57:
				{
				alt3=3;
				}
				break;
			case 55:
				{
				alt3=4;
				}
				break;
			case 56:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:25: qualident
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualident_in_type193);
					qualident14=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident14.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:37: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type197);
					arrayType15=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType15.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:49: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type201);
					recordType16=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType16.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:62: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type205);
					pointerType17=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType17.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:76: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type209);
					procedureType18=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType18.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:1: arrayType : 'ARRAY' length ( ',' length )* 'OF' type ;
	public final OberonParser.arrayType_return arrayType() throws RecognitionException {
		OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal19=null;
		Token char_literal21=null;
		Token string_literal23=null;
		ParserRuleReturnScope length20 =null;
		ParserRuleReturnScope length22 =null;
		ParserRuleReturnScope type24 =null;

		Object string_literal19_tree=null;
		Object char_literal21_tree=null;
		Object string_literal23_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:23: ( 'ARRAY' length ( ',' length )* 'OF' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:25: 'ARRAY' length ( ',' length )* 'OF' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal19=(Token)match(input,36,FOLLOW_36_in_arrayType229); 
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			adaptor.addChild(root_0, string_literal19_tree);

			pushFollow(FOLLOW_length_in_arrayType231);
			length20=length();
			state._fsp--;

			adaptor.addChild(root_0, length20.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:40: ( ',' length )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==22) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:41: ',' length
					{
					char_literal21=(Token)match(input,22,FOLLOW_22_in_arrayType234); 
					char_literal21_tree = (Object)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);

					pushFollow(FOLLOW_length_in_arrayType236);
					length22=length();
					state._fsp--;

					adaptor.addChild(root_0, length22.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			string_literal23=(Token)match(input,53,FOLLOW_53_in_arrayType240); 
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			adaptor.addChild(root_0, string_literal23_tree);

			pushFollow(FOLLOW_type_in_arrayType242);
			type24=type();
			state._fsp--;

			adaptor.addChild(root_0, type24.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:1: length : constExpression ;
	public final OberonParser.length_return length() throws RecognitionException {
		OberonParser.length_return retval = new OberonParser.length_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constExpression25 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:23: ( constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:25: constExpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_length265);
			constExpression25=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression25.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:1: recordType : 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' ;
	public final OberonParser.recordType_return recordType() throws RecognitionException {
		OberonParser.recordType_return retval = new OberonParser.recordType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal26=null;
		Token char_literal27=null;
		Token char_literal29=null;
		Token string_literal31=null;
		ParserRuleReturnScope baseType28 =null;
		ParserRuleReturnScope fieldListSequence30 =null;

		Object string_literal26_tree=null;
		Object char_literal27_tree=null;
		Object char_literal29_tree=null;
		Object string_literal31_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:23: ( 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:25: 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal26=(Token)match(input,57,FOLLOW_57_in_recordType284); 
			string_literal26_tree = (Object)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:34: ( '(' baseType ')' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==18) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:35: '(' baseType ')'
					{
					char_literal27=(Token)match(input,18,FOLLOW_18_in_recordType287); 
					char_literal27_tree = (Object)adaptor.create(char_literal27);
					adaptor.addChild(root_0, char_literal27_tree);

					pushFollow(FOLLOW_baseType_in_recordType289);
					baseType28=baseType();
					state._fsp--;

					adaptor.addChild(root_0, baseType28.getTree());

					char_literal29=(Token)match(input,19,FOLLOW_19_in_recordType291); 
					char_literal29_tree = (Object)adaptor.create(char_literal29);
					adaptor.addChild(root_0, char_literal29_tree);

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType295);
			fieldListSequence30=fieldListSequence();
			state._fsp--;

			adaptor.addChild(root_0, fieldListSequence30.getTree());

			string_literal31=(Token)match(input,43,FOLLOW_43_in_recordType297); 
			string_literal31_tree = (Object)adaptor.create(string_literal31);
			adaptor.addChild(root_0, string_literal31_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:1: baseType : qualident ;
	public final OberonParser.baseType_return baseType() throws RecognitionException {
		OberonParser.baseType_return retval = new OberonParser.baseType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident32 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:23: ( qualident )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:25: qualident
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_baseType318);
			qualident32=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident32.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:1: fieldListSequence : fieldList ( ';' fieldList )* ;
	public final OberonParser.fieldListSequence_return fieldListSequence() throws RecognitionException {
		OberonParser.fieldListSequence_return retval = new OberonParser.fieldListSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal34=null;
		ParserRuleReturnScope fieldList33 =null;
		ParserRuleReturnScope fieldList35 =null;

		Object char_literal34_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:23: ( fieldList ( ';' fieldList )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:25: fieldList ( ';' fieldList )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fieldList_in_fieldListSequence330);
			fieldList33=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList33.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:35: ( ';' fieldList )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==29) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:36: ';' fieldList
					{
					char_literal34=(Token)match(input,29,FOLLOW_29_in_fieldListSequence333); 
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);

					pushFollow(FOLLOW_fieldList_in_fieldListSequence335);
					fieldList35=fieldList();
					state._fsp--;

					adaptor.addChild(root_0, fieldList35.getTree());

					}
					break;

				default :
					break loop6;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:1: fieldList : ( identList ':' type )? ;
	public final OberonParser.fieldList_return fieldList() throws RecognitionException {
		OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal37=null;
		ParserRuleReturnScope identList36 =null;
		ParserRuleReturnScope type38 =null;

		Object char_literal37_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:23: ( ( identList ':' type )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:25: ( identList ':' type )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:25: ( identList ':' type )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDENT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:26: identList ':' type
					{
					pushFollow(FOLLOW_identList_in_fieldList358);
					identList36=identList();
					state._fsp--;

					adaptor.addChild(root_0, identList36.getTree());

					char_literal37=(Token)match(input,27,FOLLOW_27_in_fieldList360); 
					char_literal37_tree = (Object)adaptor.create(char_literal37);
					adaptor.addChild(root_0, char_literal37_tree);

					pushFollow(FOLLOW_type_in_fieldList362);
					type38=type();
					state._fsp--;

					adaptor.addChild(root_0, type38.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:1: identList : identdef ( ',' identdef )* ;
	public final OberonParser.identList_return identList() throws RecognitionException {
		OberonParser.identList_return retval = new OberonParser.identList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal40=null;
		ParserRuleReturnScope identdef39 =null;
		ParserRuleReturnScope identdef41 =null;

		Object char_literal40_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:23: ( identdef ( ',' identdef )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:25: identdef ( ',' identdef )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_identList384);
			identdef39=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef39.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:34: ( ',' identdef )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==22) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:35: ',' identdef
					{
					char_literal40=(Token)match(input,22,FOLLOW_22_in_identList387); 
					char_literal40_tree = (Object)adaptor.create(char_literal40);
					adaptor.addChild(root_0, char_literal40_tree);

					pushFollow(FOLLOW_identdef_in_identList389);
					identdef41=identdef();
					state._fsp--;

					adaptor.addChild(root_0, identdef41.getTree());

					}
					break;

				default :
					break loop8;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:1: pointerType : 'POINTER TO' type ;
	public final OberonParser.pointerType_return pointerType() throws RecognitionException {
		OberonParser.pointerType_return retval = new OberonParser.pointerType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal42=null;
		ParserRuleReturnScope type43 =null;

		Object string_literal42_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:23: ( 'POINTER TO' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:25: 'POINTER TO' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal42=(Token)match(input,55,FOLLOW_55_in_pointerType409); 
			string_literal42_tree = (Object)adaptor.create(string_literal42);
			adaptor.addChild(root_0, string_literal42_tree);

			pushFollow(FOLLOW_type_in_pointerType411);
			type43=type();
			state._fsp--;

			adaptor.addChild(root_0, type43.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:1: procedureType : 'PROCEDURE' ( formalParameters )? ;
	public final OberonParser.procedureType_return procedureType() throws RecognitionException {
		OberonParser.procedureType_return retval = new OberonParser.procedureType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal44=null;
		ParserRuleReturnScope formalParameters45 =null;

		Object string_literal44_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:23: ( 'PROCEDURE' ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:25: 'PROCEDURE' ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal44=(Token)match(input,56,FOLLOW_56_in_procedureType427); 
			string_literal44_tree = (Object)adaptor.create(string_literal44);
			adaptor.addChild(root_0, string_literal44_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:37: ( formalParameters )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==18) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:37: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureType429);
					formalParameters45=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters45.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:1: variableDeclaration : identList ':' type ;
	public final OberonParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		OberonParser.variableDeclaration_return retval = new OberonParser.variableDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope identList46 =null;
		ParserRuleReturnScope type48 =null;

		Object char_literal47_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:23: ( identList ':' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:25: identList ':' type
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identList_in_variableDeclaration440);
			identList46=identList();
			state._fsp--;

			adaptor.addChild(root_0, identList46.getTree());

			char_literal47=(Token)match(input,27,FOLLOW_27_in_variableDeclaration442); 
			char_literal47_tree = (Object)adaptor.create(char_literal47);
			adaptor.addChild(root_0, char_literal47_tree);

			pushFollow(FOLLOW_type_in_variableDeclaration444);
			type48=type();
			state._fsp--;

			adaptor.addChild(root_0, type48.getTree());

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


	public static class designator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "designator"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:1: designator : qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )* ;
	public final OberonParser.designator_return designator() throws RecognitionException {
		OberonParser.designator_return retval = new OberonParser.designator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal50=null;
		Token IDENT51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		Token char_literal58=null;
		ParserRuleReturnScope qualident49 =null;
		ParserRuleReturnScope expList53 =null;
		ParserRuleReturnScope qualident56 =null;

		Object char_literal50_tree=null;
		Object IDENT51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		Object char_literal58_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:23: ( qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:25: qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_designator463);
			qualident49=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident49.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:35: ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )*
			loop10:
			while (true) {
				int alt10=5;
				switch ( input.LA(1) ) {
				case 18:
					{
					int LA10_1 = input.LA(2);
					if ( (LA10_1==IDENT) ) {
						int LA10_6 = input.LA(3);
						if ( (LA10_6==24) ) {
							int LA10_7 = input.LA(4);
							if ( (LA10_7==IDENT) ) {
								int LA10_9 = input.LA(5);
								if ( (LA10_9==19) ) {
									alt10=3;
								}

							}

						}
						else if ( (LA10_6==19) ) {
							alt10=3;
						}

					}

					}
					break;
				case 24:
					{
					alt10=1;
					}
					break;
				case 66:
					{
					alt10=2;
					}
					break;
				case 68:
					{
					alt10=4;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:36: '.' IDENT
					{
					char_literal50=(Token)match(input,24,FOLLOW_24_in_designator466); 
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);

					IDENT51=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator468); 
					IDENT51_tree = (Object)adaptor.create(IDENT51);
					adaptor.addChild(root_0, IDENT51_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:48: '[' expList ']'
					{
					char_literal52=(Token)match(input,66,FOLLOW_66_in_designator472); 
					char_literal52_tree = (Object)adaptor.create(char_literal52);
					adaptor.addChild(root_0, char_literal52_tree);

					pushFollow(FOLLOW_expList_in_designator474);
					expList53=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList53.getTree());

					char_literal54=(Token)match(input,67,FOLLOW_67_in_designator476); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					adaptor.addChild(root_0, char_literal54_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:66: '(' qualident ')'
					{
					char_literal55=(Token)match(input,18,FOLLOW_18_in_designator480); 
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);

					pushFollow(FOLLOW_qualident_in_designator482);
					qualident56=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident56.getTree());

					char_literal57=(Token)match(input,19,FOLLOW_19_in_designator484); 
					char_literal57_tree = (Object)adaptor.create(char_literal57);
					adaptor.addChild(root_0, char_literal57_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:86: '^'
					{
					char_literal58=(Token)match(input,68,FOLLOW_68_in_designator488); 
					char_literal58_tree = (Object)adaptor.create(char_literal58);
					adaptor.addChild(root_0, char_literal58_tree);

					}
					break;

				default :
					break loop10;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:1: expList : expression ( ',' expression )* ;
	public final OberonParser.expList_return expList() throws RecognitionException {
		OberonParser.expList_return retval = new OberonParser.expList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal60=null;
		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope expression61 =null;

		Object char_literal60_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:23: ( expression ( ',' expression )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:25: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expList512);
			expression59=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression59.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:36: ( ',' expression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==22) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:37: ',' expression
					{
					char_literal60=(Token)match(input,22,FOLLOW_22_in_expList515); 
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);

					pushFollow(FOLLOW_expression_in_expList517);
					expression61=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression61.getTree());

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
	// $ANTLR end "expList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:1: expression : simpleExpression ( relation simpleExpression )? ;
	public final OberonParser.expression_return expression() throws RecognitionException {
		OberonParser.expression_return retval = new OberonParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleExpression62 =null;
		ParserRuleReturnScope relation63 =null;
		ParserRuleReturnScope simpleExpression64 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:23: ( simpleExpression ( relation simpleExpression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:25: simpleExpression ( relation simpleExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleExpression_in_expression538);
			simpleExpression62=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression62.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:42: ( relation simpleExpression )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==16||(LA12_0 >= 30 && LA12_0 <= 34)||(LA12_0 >= 47 && LA12_0 <= 48)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:43: relation simpleExpression
					{
					pushFollow(FOLLOW_relation_in_expression541);
					relation63=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation63.getTree());

					pushFollow(FOLLOW_simpleExpression_in_expression543);
					simpleExpression64=simpleExpression();
					state._fsp--;

					adaptor.addChild(root_0, simpleExpression64.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:1: relation : ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' );
	public final OberonParser.relation_return relation() throws RecognitionException {
		OberonParser.relation_return retval = new OberonParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set65=null;

		Object set65_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:23: ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set65=input.LT(1);
			if ( input.LA(1)==16||(input.LA(1) >= 30 && input.LA(1) <= 34)||(input.LA(1) >= 47 && input.LA(1) <= 48) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set65));
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:1: simpleExpression : ( '+' | '-' )? term ( addOperator term )* ;
	public final OberonParser.simpleExpression_return simpleExpression() throws RecognitionException {
		OberonParser.simpleExpression_return retval = new OberonParser.simpleExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set66=null;
		ParserRuleReturnScope term67 =null;
		ParserRuleReturnScope addOperator68 =null;
		ParserRuleReturnScope term69 =null;

		Object set66_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:23: ( ( '+' | '-' )? term ( addOperator term )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:25: ( '+' | '-' )? term ( addOperator term )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:25: ( '+' | '-' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==21||LA13_0==23) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					set66=input.LT(1);
					if ( input.LA(1)==21||input.LA(1)==23 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set66));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_term_in_simpleExpression602);
			term67=term();
			state._fsp--;

			adaptor.addChild(root_0, term67.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:41: ( addOperator term )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==21||LA14_0==23||LA14_0==54) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:42: addOperator term
					{
					pushFollow(FOLLOW_addOperator_in_simpleExpression605);
					addOperator68=addOperator();
					state._fsp--;

					adaptor.addChild(root_0, addOperator68.getTree());

					pushFollow(FOLLOW_term_in_simpleExpression607);
					term69=term();
					state._fsp--;

					adaptor.addChild(root_0, term69.getTree());

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
	// $ANTLR end "simpleExpression"


	public static class addOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addOperator"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:1: addOperator : ( '+' | '-' | 'OR' );
	public final OberonParser.addOperator_return addOperator() throws RecognitionException {
		OberonParser.addOperator_return retval = new OberonParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set70=null;

		Object set70_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:23: ( '+' | '-' | 'OR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set70=input.LT(1);
			if ( input.LA(1)==21||input.LA(1)==23||input.LA(1)==54 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set70));
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:1: term : factor ( mulOperator factor )* ;
	public final OberonParser.term_return term() throws RecognitionException {
		OberonParser.term_return retval = new OberonParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor71 =null;
		ParserRuleReturnScope mulOperator72 =null;
		ParserRuleReturnScope factor73 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:23: ( factor ( mulOperator factor )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:25: factor ( mulOperator factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term660);
			factor71=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor71.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:32: ( mulOperator factor )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==17||LA15_0==20||LA15_0==26||LA15_0==39||LA15_0==50) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:33: mulOperator factor
					{
					pushFollow(FOLLOW_mulOperator_in_term663);
					mulOperator72=mulOperator();
					state._fsp--;

					adaptor.addChild(root_0, mulOperator72.getTree());

					pushFollow(FOLLOW_factor_in_term665);
					factor73=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor73.getTree());

					}
					break;

				default :
					break loop15;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:1: mulOperator : ( '*' | '/' | 'DIV' | 'MOD' | '&' );
	public final OberonParser.mulOperator_return mulOperator() throws RecognitionException {
		OberonParser.mulOperator_return retval = new OberonParser.mulOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74=null;

		Object set74_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:23: ( '*' | '/' | 'DIV' | 'MOD' | '&' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set74=input.LT(1);
			if ( input.LA(1)==17||input.LA(1)==20||input.LA(1)==26||input.LA(1)==39||input.LA(1)==50 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set74));
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:1: factor : ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' expression ')' | '~' factor );
	public final OberonParser.factor_return factor() throws RecognitionException {
		OberonParser.factor_return retval = new OberonParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHARCONST76=null;
		Token STRING77=null;
		Token string_literal78=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal85=null;
		ParserRuleReturnScope number75 =null;
		ParserRuleReturnScope set79 =null;
		ParserRuleReturnScope designator80 =null;
		ParserRuleReturnScope actualParameters81 =null;
		ParserRuleReturnScope expression83 =null;
		ParserRuleReturnScope factor86 =null;

		Object CHARCONST76_tree=null;
		Object STRING77_tree=null;
		Object string_literal78_tree=null;
		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		Object char_literal85_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:23: ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' expression ')' | '~' factor )
			int alt17=8;
			switch ( input.LA(1) ) {
			case INTEGER:
			case REAL:
				{
				alt17=1;
				}
				break;
			case CHARCONST:
				{
				alt17=2;
				}
				break;
			case STRING:
				{
				alt17=3;
				}
				break;
			case 52:
				{
				alt17=4;
				}
				break;
			case 70:
				{
				alt17=5;
				}
				break;
			case IDENT:
				{
				alt17=6;
				}
				break;
			case 18:
				{
				alt17=7;
				}
				break;
			case 73:
				{
				alt17=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:25: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor716);
					number75=number();
					state._fsp--;

					adaptor.addChild(root_0, number75.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:34: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST76=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor720); 
					CHARCONST76_tree = (Object)adaptor.create(CHARCONST76);
					adaptor.addChild(root_0, CHARCONST76_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:46: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING77=(Token)match(input,STRING,FOLLOW_STRING_in_factor724); 
					STRING77_tree = (Object)adaptor.create(STRING77);
					adaptor.addChild(root_0, STRING77_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:55: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal78=(Token)match(input,52,FOLLOW_52_in_factor728); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:63: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor732);
					set79=set();
					state._fsp--;

					adaptor.addChild(root_0, set79.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:69: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor736);
					designator80=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator80.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:80: ( actualParameters )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==18) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:80: actualParameters
							{
							pushFollow(FOLLOW_actualParameters_in_factor738);
							actualParameters81=actualParameters();
							state._fsp--;

							adaptor.addChild(root_0, actualParameters81.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:100: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal82=(Token)match(input,18,FOLLOW_18_in_factor743); 
					char_literal82_tree = (Object)adaptor.create(char_literal82);
					adaptor.addChild(root_0, char_literal82_tree);

					pushFollow(FOLLOW_expression_in_factor745);
					expression83=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression83.getTree());

					char_literal84=(Token)match(input,19,FOLLOW_19_in_factor747); 
					char_literal84_tree = (Object)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:121: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal85=(Token)match(input,73,FOLLOW_73_in_factor751); 
					char_literal85_tree = (Object)adaptor.create(char_literal85);
					adaptor.addChild(root_0, char_literal85_tree);

					pushFollow(FOLLOW_factor_in_factor753);
					factor86=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor86.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:1: set : '{' ( element ( ',' element )* )? '}' ;
	public final OberonParser.set_return set() throws RecognitionException {
		OberonParser.set_return retval = new OberonParser.set_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		ParserRuleReturnScope element88 =null;
		ParserRuleReturnScope element90 =null;

		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:23: ( '{' ( element ( ',' element )* )? '}' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:25: '{' ( element ( ',' element )* )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal87=(Token)match(input,70,FOLLOW_70_in_set779); 
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:29: ( element ( ',' element )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHARCONST||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||LA19_0==REAL||LA19_0==STRING||LA19_0==18||LA19_0==21||LA19_0==23||LA19_0==52||LA19_0==70||LA19_0==73) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:30: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set782);
					element88=element();
					state._fsp--;

					adaptor.addChild(root_0, element88.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:38: ( ',' element )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==22) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:39: ',' element
							{
							char_literal89=(Token)match(input,22,FOLLOW_22_in_set785); 
							char_literal89_tree = (Object)adaptor.create(char_literal89);
							adaptor.addChild(root_0, char_literal89_tree);

							pushFollow(FOLLOW_element_in_set787);
							element90=element();
							state._fsp--;

							adaptor.addChild(root_0, element90.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			char_literal91=(Token)match(input,72,FOLLOW_72_in_set794); 
			char_literal91_tree = (Object)adaptor.create(char_literal91);
			adaptor.addChild(root_0, char_literal91_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:1: element : expression ( '..' expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal93=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope expression94 =null;

		Object string_literal93_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:23: ( expression ( '..' expression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:25: expression ( '..' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element816);
			expression92=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression92.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:36: ( '..' expression )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==25) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:38: '..' expression
					{
					string_literal93=(Token)match(input,25,FOLLOW_25_in_element820); 
					string_literal93_tree = (Object)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);

					pushFollow(FOLLOW_expression_in_element822);
					expression94=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression94.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:1: actualParameters : '(' ( expList )? ')' ;
	public final OberonParser.actualParameters_return actualParameters() throws RecognitionException {
		OberonParser.actualParameters_return retval = new OberonParser.actualParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal95=null;
		Token char_literal97=null;
		ParserRuleReturnScope expList96 =null;

		Object char_literal95_tree=null;
		Object char_literal97_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:23: ( '(' ( expList )? ')' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:25: '(' ( expList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal95=(Token)match(input,18,FOLLOW_18_in_actualParameters837); 
			char_literal95_tree = (Object)adaptor.create(char_literal95);
			adaptor.addChild(root_0, char_literal95_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:29: ( expList )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CHARCONST||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||LA21_0==REAL||LA21_0==STRING||LA21_0==18||LA21_0==21||LA21_0==23||LA21_0==52||LA21_0==70||LA21_0==73) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:29: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters839);
					expList96=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList96.getTree());

					}
					break;

			}

			char_literal97=(Token)match(input,19,FOLLOW_19_in_actualParameters842); 
			char_literal97_tree = (Object)adaptor.create(char_literal97);
			adaptor.addChild(root_0, char_literal97_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:1: statement : ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? ;
	public final OberonParser.statement_return statement() throws RecognitionException {
		OberonParser.statement_return retval = new OberonParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal105=null;
		Token string_literal106=null;
		ParserRuleReturnScope statement298 =null;
		ParserRuleReturnScope ifStatement99 =null;
		ParserRuleReturnScope caseStatement100 =null;
		ParserRuleReturnScope whileStatement101 =null;
		ParserRuleReturnScope repeatStatement102 =null;
		ParserRuleReturnScope loopStatement103 =null;
		ParserRuleReturnScope withStatement104 =null;
		ParserRuleReturnScope expression107 =null;

		Object string_literal105_tree=null;
		Object string_literal106_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:23: ( ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:26: ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:26: ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			int alt23=10;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					alt23=1;
					}
					break;
				case 45:
					{
					alt23=2;
					}
					break;
				case 69:
					{
					alt23=3;
					}
					break;
				case 64:
					{
					alt23=4;
					}
					break;
				case 58:
					{
					alt23=5;
					}
					break;
				case 49:
					{
					alt23=6;
					}
					break;
				case 65:
					{
					alt23=7;
					}
					break;
				case 44:
					{
					alt23=8;
					}
					break;
				case 59:
					{
					alt23=9;
					}
					break;
			}
			switch (alt23) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:27: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement864);
					statement298=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement298.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:38: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement866);
					ifStatement99=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement99.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:50: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement868);
					caseStatement100=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement100.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:64: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement870);
					whileStatement101=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement101.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:79: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement872);
					repeatStatement102=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement102.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:95: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement874);
					loopStatement103=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement103.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:109: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement876);
					withStatement104=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement104.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:124: 'EXIT'
					{
					string_literal105=(Token)match(input,44,FOLLOW_44_in_statement879); 
					string_literal105_tree = (Object)adaptor.create(string_literal105);
					adaptor.addChild(root_0, string_literal105_tree);

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:133: 'RETURN' ( expression )?
					{
					string_literal106=(Token)match(input,59,FOLLOW_59_in_statement883); 
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					adaptor.addChild(root_0, string_literal106_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:142: ( expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==CHARCONST||(LA22_0 >= IDENT && LA22_0 <= INTEGER)||LA22_0==REAL||LA22_0==STRING||LA22_0==18||LA22_0==21||LA22_0==23||LA22_0==52||LA22_0==70||LA22_0==73) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:142: expression
							{
							pushFollow(FOLLOW_expression_in_statement885);
							expression107=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression107.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:1: statement2 : designator ( assignment | procedureCall ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope designator108 =null;
		ParserRuleReturnScope assignment109 =null;
		ParserRuleReturnScope procedureCall110 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:23: ( designator ( assignment | procedureCall ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:25: designator ( assignment | procedureCall )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_designator_in_statement2908);
			designator108=designator();
			state._fsp--;

			adaptor.addChild(root_0, designator108.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:36: ( assignment | procedureCall )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==28) ) {
				alt24=1;
			}
			else if ( (LA24_0==18||LA24_0==29||(LA24_0 >= 41 && LA24_0 <= 43)||LA24_0==62||LA24_0==71) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:38: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement2912);
					assignment109=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment109.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:51: procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement2916);
					procedureCall110=procedureCall();
					state._fsp--;

					adaptor.addChild(root_0, procedureCall110.getTree());

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


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:1: assignment : ':=' expression ;
	public final OberonParser.assignment_return assignment() throws RecognitionException {
		OberonParser.assignment_return retval = new OberonParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal111=null;
		ParserRuleReturnScope expression112 =null;

		Object string_literal111_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:23: ( ':=' expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:26: ':=' expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal111=(Token)match(input,28,FOLLOW_28_in_assignment938); 
			string_literal111_tree = (Object)adaptor.create(string_literal111);
			adaptor.addChild(root_0, string_literal111_tree);

			pushFollow(FOLLOW_expression_in_assignment940);
			expression112=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression112.getTree());

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
	// $ANTLR end "assignment"


	public static class procedureCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureCall"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:1: procedureCall : ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualParameters113 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:23: ( ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:26: ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:26: ( actualParameters )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==18) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:26: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall957);
					actualParameters113=actualParameters();
					state._fsp--;

					adaptor.addChild(root_0, actualParameters113.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:1: statementSequence : statement ( ';' statement )* ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope statement114 =null;
		ParserRuleReturnScope statement116 =null;

		Object char_literal115_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:23: ( statement ( ';' statement )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:25: statement ( ';' statement )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statementSequence970);
			statement114=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement114.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:35: ( ';' statement )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==29) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:37: ';' statement
					{
					char_literal115=(Token)match(input,29,FOLLOW_29_in_statementSequence974); 
					char_literal115_tree = (Object)adaptor.create(char_literal115);
					adaptor.addChild(root_0, char_literal115_tree);

					pushFollow(FOLLOW_statement_in_statementSequence976);
					statement116=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement116.getTree());

					}
					break;

				default :
					break loop26;
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
	// $ANTLR end "statementSequence"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
	public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
		OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal117=null;
		Token string_literal119=null;
		Token string_literal121=null;
		Token string_literal123=null;
		Token string_literal125=null;
		Token string_literal127=null;
		ParserRuleReturnScope expression118 =null;
		ParserRuleReturnScope statementSequence120 =null;
		ParserRuleReturnScope expression122 =null;
		ParserRuleReturnScope statementSequence124 =null;
		ParserRuleReturnScope statementSequence126 =null;

		Object string_literal117_tree=null;
		Object string_literal119_tree=null;
		Object string_literal121_tree=null;
		Object string_literal123_tree=null;
		Object string_literal125_tree=null;
		Object string_literal127_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:23: ( 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:25: 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal117=(Token)match(input,45,FOLLOW_45_in_ifStatement996); 
			string_literal117_tree = (Object)adaptor.create(string_literal117);
			adaptor.addChild(root_0, string_literal117_tree);

			pushFollow(FOLLOW_expression_in_ifStatement998);
			expression118=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression118.getTree());

			string_literal119=(Token)match(input,60,FOLLOW_60_in_ifStatement1000); 
			string_literal119_tree = (Object)adaptor.create(string_literal119);
			adaptor.addChild(root_0, string_literal119_tree);

			pushFollow(FOLLOW_statementSequence_in_ifStatement1002);
			statementSequence120=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence120.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:66: ( 'ELSEIF' expression 'THEN' statementSequence )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==42) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:67: 'ELSEIF' expression 'THEN' statementSequence
					{
					string_literal121=(Token)match(input,42,FOLLOW_42_in_ifStatement1005); 
					string_literal121_tree = (Object)adaptor.create(string_literal121);
					adaptor.addChild(root_0, string_literal121_tree);

					pushFollow(FOLLOW_expression_in_ifStatement1007);
					expression122=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression122.getTree());

					string_literal123=(Token)match(input,60,FOLLOW_60_in_ifStatement1009); 
					string_literal123_tree = (Object)adaptor.create(string_literal123);
					adaptor.addChild(root_0, string_literal123_tree);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1011);
					statementSequence124=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence124.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:114: ( 'ELSE' statementSequence )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==41) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:115: 'ELSE' statementSequence
					{
					string_literal125=(Token)match(input,41,FOLLOW_41_in_ifStatement1016); 
					string_literal125_tree = (Object)adaptor.create(string_literal125);
					adaptor.addChild(root_0, string_literal125_tree);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1018);
					statementSequence126=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence126.getTree());

					}
					break;

			}

			string_literal127=(Token)match(input,43,FOLLOW_43_in_ifStatement1022); 
			string_literal127_tree = (Object)adaptor.create(string_literal127);
			adaptor.addChild(root_0, string_literal127_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ;
	public final OberonParser.caseStatement_return caseStatement() throws RecognitionException {
		OberonParser.caseStatement_return retval = new OberonParser.caseStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal128=null;
		Token string_literal130=null;
		Token char_literal132=null;
		Token string_literal134=null;
		Token string_literal136=null;
		ParserRuleReturnScope expression129 =null;
		ParserRuleReturnScope casE131 =null;
		ParserRuleReturnScope casE133 =null;
		ParserRuleReturnScope statementSequence135 =null;

		Object string_literal128_tree=null;
		Object string_literal130_tree=null;
		Object char_literal132_tree=null;
		Object string_literal134_tree=null;
		Object string_literal136_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:25: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal128=(Token)match(input,69,FOLLOW_69_in_caseStatement1038); 
			string_literal128_tree = (Object)adaptor.create(string_literal128);
			adaptor.addChild(root_0, string_literal128_tree);

			pushFollow(FOLLOW_expression_in_caseStatement1040);
			expression129=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression129.getTree());

			string_literal130=(Token)match(input,53,FOLLOW_53_in_caseStatement1042); 
			string_literal130_tree = (Object)adaptor.create(string_literal130);
			adaptor.addChild(root_0, string_literal130_tree);

			pushFollow(FOLLOW_casE_in_caseStatement1044);
			casE131=casE();
			state._fsp--;

			adaptor.addChild(root_0, casE131.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:53: ( '|' casE )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==71) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:54: '|' casE
					{
					char_literal132=(Token)match(input,71,FOLLOW_71_in_caseStatement1047); 
					char_literal132_tree = (Object)adaptor.create(char_literal132);
					adaptor.addChild(root_0, char_literal132_tree);

					pushFollow(FOLLOW_casE_in_caseStatement1049);
					casE133=casE();
					state._fsp--;

					adaptor.addChild(root_0, casE133.getTree());

					}
					break;

				default :
					break loop29;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:65: ( 'ELSE' statementSequence )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==41) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:66: 'ELSE' statementSequence
					{
					string_literal134=(Token)match(input,41,FOLLOW_41_in_caseStatement1054); 
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);

					pushFollow(FOLLOW_statementSequence_in_caseStatement1056);
					statementSequence135=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence135.getTree());

					}
					break;

			}

			string_literal136=(Token)match(input,43,FOLLOW_43_in_caseStatement1060); 
			string_literal136_tree = (Object)adaptor.create(string_literal136);
			adaptor.addChild(root_0, string_literal136_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		ParserRuleReturnScope caseLabelList137 =null;
		ParserRuleReturnScope statementSequence139 =null;

		Object char_literal138_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:25: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:25: ( caseLabelList ':' statementSequence )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CHARCONST||(LA31_0 >= IDENT && LA31_0 <= INTEGER)||LA31_0==REAL||LA31_0==STRING||LA31_0==18||LA31_0==21||LA31_0==23||LA31_0==52||LA31_0==70||LA31_0==73) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:26: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE1086);
					caseLabelList137=caseLabelList();
					state._fsp--;

					adaptor.addChild(root_0, caseLabelList137.getTree());

					char_literal138=(Token)match(input,27,FOLLOW_27_in_casE1088); 
					char_literal138_tree = (Object)adaptor.create(char_literal138);
					adaptor.addChild(root_0, char_literal138_tree);

					pushFollow(FOLLOW_statementSequence_in_casE1090);
					statementSequence139=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence139.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal141=null;
		ParserRuleReturnScope caseLabels140 =null;
		ParserRuleReturnScope caseLabels142 =null;

		Object char_literal141_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:25: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList1108);
			caseLabels140=caseLabels();
			state._fsp--;

			adaptor.addChild(root_0, caseLabels140.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:36: ( ',' caseLabels )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==22) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:37: ',' caseLabels
					{
					char_literal141=(Token)match(input,22,FOLLOW_22_in_caseLabelList1111); 
					char_literal141_tree = (Object)adaptor.create(char_literal141);
					adaptor.addChild(root_0, char_literal141_tree);

					pushFollow(FOLLOW_caseLabels_in_caseLabelList1113);
					caseLabels142=caseLabels();
					state._fsp--;

					adaptor.addChild(root_0, caseLabels142.getTree());

					}
					break;

				default :
					break loop32;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal144=null;
		ParserRuleReturnScope constExpression143 =null;
		ParserRuleReturnScope constExpression145 =null;

		Object string_literal144_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:25: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels1134);
			constExpression143=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression143.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:41: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:42: '..' constExpression
			{
			string_literal144=(Token)match(input,25,FOLLOW_25_in_caseLabels1137); 
			string_literal144_tree = (Object)adaptor.create(string_literal144);
			adaptor.addChild(root_0, string_literal144_tree);

			pushFollow(FOLLOW_constExpression_in_caseLabels1139);
			constExpression145=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression145.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
	public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
		OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal146=null;
		Token string_literal148=null;
		Token string_literal150=null;
		ParserRuleReturnScope expression147 =null;
		ParserRuleReturnScope statementSequence149 =null;

		Object string_literal146_tree=null;
		Object string_literal148_tree=null;
		Object string_literal150_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:23: ( 'WHILE' expression 'DO' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:25: 'WHILE' expression 'DO' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal146=(Token)match(input,64,FOLLOW_64_in_whileStatement1155); 
			string_literal146_tree = (Object)adaptor.create(string_literal146);
			adaptor.addChild(root_0, string_literal146_tree);

			pushFollow(FOLLOW_expression_in_whileStatement1157);
			expression147=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression147.getTree());

			string_literal148=(Token)match(input,40,FOLLOW_40_in_whileStatement1159); 
			string_literal148_tree = (Object)adaptor.create(string_literal148);
			adaptor.addChild(root_0, string_literal148_tree);

			pushFollow(FOLLOW_statementSequence_in_whileStatement1161);
			statementSequence149=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence149.getTree());

			string_literal150=(Token)match(input,43,FOLLOW_43_in_whileStatement1163); 
			string_literal150_tree = (Object)adaptor.create(string_literal150);
			adaptor.addChild(root_0, string_literal150_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:1: repeatStatement : 'REPEAT' statementSequence 'UNTIL' expression ;
	public final OberonParser.repeatStatement_return repeatStatement() throws RecognitionException {
		OberonParser.repeatStatement_return retval = new OberonParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal151=null;
		Token string_literal153=null;
		ParserRuleReturnScope statementSequence152 =null;
		ParserRuleReturnScope expression154 =null;

		Object string_literal151_tree=null;
		Object string_literal153_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:23: ( 'REPEAT' statementSequence 'UNTIL' expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:25: 'REPEAT' statementSequence 'UNTIL' expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal151=(Token)match(input,58,FOLLOW_58_in_repeatStatement1177); 
			string_literal151_tree = (Object)adaptor.create(string_literal151);
			adaptor.addChild(root_0, string_literal151_tree);

			pushFollow(FOLLOW_statementSequence_in_repeatStatement1179);
			statementSequence152=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence152.getTree());

			string_literal153=(Token)match(input,62,FOLLOW_62_in_repeatStatement1181); 
			string_literal153_tree = (Object)adaptor.create(string_literal153);
			adaptor.addChild(root_0, string_literal153_tree);

			pushFollow(FOLLOW_expression_in_repeatStatement1183);
			expression154=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression154.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:1: loopStatement : 'LOOP' statementSequence 'END' ;
	public final OberonParser.loopStatement_return loopStatement() throws RecognitionException {
		OberonParser.loopStatement_return retval = new OberonParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal155=null;
		Token string_literal157=null;
		ParserRuleReturnScope statementSequence156 =null;

		Object string_literal155_tree=null;
		Object string_literal157_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:23: ( 'LOOP' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:25: 'LOOP' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal155=(Token)match(input,49,FOLLOW_49_in_loopStatement1199); 
			string_literal155_tree = (Object)adaptor.create(string_literal155);
			adaptor.addChild(root_0, string_literal155_tree);

			pushFollow(FOLLOW_statementSequence_in_loopStatement1201);
			statementSequence156=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence156.getTree());

			string_literal157=(Token)match(input,43,FOLLOW_43_in_loopStatement1203); 
			string_literal157_tree = (Object)adaptor.create(string_literal157);
			adaptor.addChild(root_0, string_literal157_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:1: withStatement : 'WITH' qualident ':' qualident 'DO' statementSequence 'END' ;
	public final OberonParser.withStatement_return withStatement() throws RecognitionException {
		OberonParser.withStatement_return retval = new OberonParser.withStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal158=null;
		Token char_literal160=null;
		Token string_literal162=null;
		Token string_literal164=null;
		ParserRuleReturnScope qualident159 =null;
		ParserRuleReturnScope qualident161 =null;
		ParserRuleReturnScope statementSequence163 =null;

		Object string_literal158_tree=null;
		Object char_literal160_tree=null;
		Object string_literal162_tree=null;
		Object string_literal164_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:23: ( 'WITH' qualident ':' qualident 'DO' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:25: 'WITH' qualident ':' qualident 'DO' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal158=(Token)match(input,65,FOLLOW_65_in_withStatement1219); 
			string_literal158_tree = (Object)adaptor.create(string_literal158);
			adaptor.addChild(root_0, string_literal158_tree);

			pushFollow(FOLLOW_qualident_in_withStatement1221);
			qualident159=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident159.getTree());

			char_literal160=(Token)match(input,27,FOLLOW_27_in_withStatement1223); 
			char_literal160_tree = (Object)adaptor.create(char_literal160);
			adaptor.addChild(root_0, char_literal160_tree);

			pushFollow(FOLLOW_qualident_in_withStatement1225);
			qualident161=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident161.getTree());

			string_literal162=(Token)match(input,40,FOLLOW_40_in_withStatement1227); 
			string_literal162_tree = (Object)adaptor.create(string_literal162);
			adaptor.addChild(root_0, string_literal162_tree);

			pushFollow(FOLLOW_statementSequence_in_withStatement1229);
			statementSequence163=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence163.getTree());

			string_literal164=(Token)match(input,43,FOLLOW_43_in_withStatement1231); 
			string_literal164_tree = (Object)adaptor.create(string_literal164);
			adaptor.addChild(root_0, string_literal164_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT ;
	public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
		OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal166=null;
		Token IDENT168=null;
		ParserRuleReturnScope procedureHeading165 =null;
		ParserRuleReturnScope procedureBody167 =null;

		Object char_literal166_tree=null;
		Object IDENT168_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:23: ( procedureHeading ';' procedureBody IDENT )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:25: procedureHeading ';' procedureBody IDENT
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1240);
			procedureHeading165=procedureHeading();
			state._fsp--;

			adaptor.addChild(root_0, procedureHeading165.getTree());

			char_literal166=(Token)match(input,29,FOLLOW_29_in_procedureDeclaration1242); 
			char_literal166_tree = (Object)adaptor.create(char_literal166);
			adaptor.addChild(root_0, char_literal166_tree);

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1244);
			procedureBody167=procedureBody();
			state._fsp--;

			adaptor.addChild(root_0, procedureBody167.getTree());

			IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1246); 
			IDENT168_tree = (Object)adaptor.create(IDENT168);
			adaptor.addChild(root_0, IDENT168_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:1: procedureHeading : 'PROCEDURE' ( '*' )? identdef ( formalParameters )? ;
	public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
		OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal169=null;
		Token char_literal170=null;
		ParserRuleReturnScope identdef171 =null;
		ParserRuleReturnScope formalParameters172 =null;

		Object string_literal169_tree=null;
		Object char_literal170_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:23: ( 'PROCEDURE' ( '*' )? identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:25: 'PROCEDURE' ( '*' )? identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal169=(Token)match(input,56,FOLLOW_56_in_procedureHeading1259); 
			string_literal169_tree = (Object)adaptor.create(string_literal169);
			adaptor.addChild(root_0, string_literal169_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:37: ( '*' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==20) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:37: '*'
					{
					char_literal170=(Token)match(input,20,FOLLOW_20_in_procedureHeading1261); 
					char_literal170_tree = (Object)adaptor.create(char_literal170);
					adaptor.addChild(root_0, char_literal170_tree);

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading1264);
			identdef171=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef171.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:51: ( formalParameters )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==18) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:51: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading1266);
					formalParameters172=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters172.getTree());

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
	// $ANTLR end "procedureHeading"


	public static class procedureBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureBody"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' ;
	public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
		OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal174=null;
		Token string_literal176=null;
		ParserRuleReturnScope declarationSequence173 =null;
		ParserRuleReturnScope statementSequence175 =null;

		Object string_literal174_tree=null;
		Object string_literal176_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:25: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declarationSequence_in_procedureBody1283);
			declarationSequence173=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence173.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:45: ( 'BEGIN' statementSequence )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==37) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:46: 'BEGIN' statementSequence
					{
					string_literal174=(Token)match(input,37,FOLLOW_37_in_procedureBody1286); 
					string_literal174_tree = (Object)adaptor.create(string_literal174);
					adaptor.addChild(root_0, string_literal174_tree);

					pushFollow(FOLLOW_statementSequence_in_procedureBody1288);
					statementSequence175=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence175.getTree());

					}
					break;

			}

			string_literal176=(Token)match(input,43,FOLLOW_43_in_procedureBody1292); 
			string_literal176_tree = (Object)adaptor.create(string_literal176);
			adaptor.addChild(root_0, string_literal176_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
	public final OberonParser.forwardDeclaration_return forwardDeclaration() throws RecognitionException {
		OberonParser.forwardDeclaration_return retval = new OberonParser.forwardDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal177=null;
		Token char_literal178=null;
		ParserRuleReturnScope identdef179 =null;
		ParserRuleReturnScope formalParameters180 =null;

		Object string_literal177_tree=null;
		Object char_literal178_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:25: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal177=(Token)match(input,56,FOLLOW_56_in_forwardDeclaration1303); 
			string_literal177_tree = (Object)adaptor.create(string_literal177);
			adaptor.addChild(root_0, string_literal177_tree);

			char_literal178=(Token)match(input,68,FOLLOW_68_in_forwardDeclaration1305); 
			char_literal178_tree = (Object)adaptor.create(char_literal178);
			adaptor.addChild(root_0, char_literal178_tree);

			pushFollow(FOLLOW_identdef_in_forwardDeclaration1307);
			identdef179=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef179.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:50: ( formalParameters )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==18) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:50: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration1309);
					formalParameters180=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters180.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:1: declarationSequence : ( 'CONST' ( constantDeclaration ';' )* | 'TYPE' ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )* ;
	public final OberonParser.declarationSequence_return declarationSequence() throws RecognitionException {
		OberonParser.declarationSequence_return retval = new OberonParser.declarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal181=null;
		Token char_literal183=null;
		Token string_literal184=null;
		Token char_literal186=null;
		Token string_literal187=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token char_literal193=null;
		ParserRuleReturnScope constantDeclaration182 =null;
		ParserRuleReturnScope typeDeclaration185 =null;
		ParserRuleReturnScope variableDeclaration188 =null;
		ParserRuleReturnScope procedureDeclaration190 =null;
		ParserRuleReturnScope forwardDeclaration192 =null;

		Object string_literal181_tree=null;
		Object char_literal183_tree=null;
		Object string_literal184_tree=null;
		Object char_literal186_tree=null;
		Object string_literal187_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object char_literal193_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:24: ( ( 'CONST' ( constantDeclaration ';' )* | 'TYPE' ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:26: ( 'CONST' ( constantDeclaration ';' )* | 'TYPE' ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:26: ( 'CONST' ( constantDeclaration ';' )* | 'TYPE' ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )*
			loop40:
			while (true) {
				int alt40=4;
				switch ( input.LA(1) ) {
				case 38:
					{
					alt40=1;
					}
					break;
				case 61:
					{
					alt40=2;
					}
					break;
				case 63:
					{
					alt40=3;
					}
					break;
				}
				switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:27: 'CONST' ( constantDeclaration ';' )*
					{
					string_literal181=(Token)match(input,38,FOLLOW_38_in_declarationSequence1322); 
					string_literal181_tree = (Object)adaptor.create(string_literal181);
					adaptor.addChild(root_0, string_literal181_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:35: ( constantDeclaration ';' )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==IDENT) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:36: constantDeclaration ';'
							{
							pushFollow(FOLLOW_constantDeclaration_in_declarationSequence1325);
							constantDeclaration182=constantDeclaration();
							state._fsp--;

							adaptor.addChild(root_0, constantDeclaration182.getTree());

							char_literal183=(Token)match(input,29,FOLLOW_29_in_declarationSequence1327); 
							char_literal183_tree = (Object)adaptor.create(char_literal183);
							adaptor.addChild(root_0, char_literal183_tree);

							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:65: 'TYPE' ( typeDeclaration ';' )*
					{
					string_literal184=(Token)match(input,61,FOLLOW_61_in_declarationSequence1334); 
					string_literal184_tree = (Object)adaptor.create(string_literal184);
					adaptor.addChild(root_0, string_literal184_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:72: ( typeDeclaration ';' )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==IDENT) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:74: typeDeclaration ';'
							{
							pushFollow(FOLLOW_typeDeclaration_in_declarationSequence1338);
							typeDeclaration185=typeDeclaration();
							state._fsp--;

							adaptor.addChild(root_0, typeDeclaration185.getTree());

							char_literal186=(Token)match(input,29,FOLLOW_29_in_declarationSequence1340); 
							char_literal186_tree = (Object)adaptor.create(char_literal186);
							adaptor.addChild(root_0, char_literal186_tree);

							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:98: 'VAR' ( variableDeclaration ';' )*
					{
					string_literal187=(Token)match(input,63,FOLLOW_63_in_declarationSequence1346); 
					string_literal187_tree = (Object)adaptor.create(string_literal187);
					adaptor.addChild(root_0, string_literal187_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:104: ( variableDeclaration ';' )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==IDENT) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:105: variableDeclaration ';'
							{
							pushFollow(FOLLOW_variableDeclaration_in_declarationSequence1349);
							variableDeclaration188=variableDeclaration();
							state._fsp--;

							adaptor.addChild(root_0, variableDeclaration188.getTree());

							char_literal189=(Token)match(input,29,FOLLOW_29_in_declarationSequence1351); 
							char_literal189_tree = (Object)adaptor.create(char_literal189);
							adaptor.addChild(root_0, char_literal189_tree);

							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

				default :
					break loop40;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:134: ( procedureDeclaration ';' | forwardDeclaration ';' )*
			loop41:
			while (true) {
				int alt41=3;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==56) ) {
					int LA41_2 = input.LA(2);
					if ( (LA41_2==68) ) {
						alt41=2;
					}
					else if ( (LA41_2==IDENT||LA41_2==20) ) {
						alt41=1;
					}

				}

				switch (alt41) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:135: procedureDeclaration ';'
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence1359);
					procedureDeclaration190=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration190.getTree());

					char_literal191=(Token)match(input,29,FOLLOW_29_in_declarationSequence1361); 
					char_literal191_tree = (Object)adaptor.create(char_literal191);
					adaptor.addChild(root_0, char_literal191_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:162: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence1365);
					forwardDeclaration192=forwardDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, forwardDeclaration192.getTree());

					char_literal193=(Token)match(input,29,FOLLOW_29_in_declarationSequence1367); 
					char_literal193_tree = (Object)adaptor.create(char_literal193);
					adaptor.addChild(root_0, char_literal193_tree);

					}
					break;

				default :
					break loop41;
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


	public static class formalParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? ;
	public final OberonParser.formalParameters_return formalParameters() throws RecognitionException {
		OberonParser.formalParameters_return retval = new OberonParser.formalParameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal194=null;
		Token char_literal196=null;
		Token char_literal198=null;
		Token char_literal199=null;
		ParserRuleReturnScope fpSection195 =null;
		ParserRuleReturnScope fpSection197 =null;
		ParserRuleReturnScope qualident200 =null;

		Object char_literal194_tree=null;
		Object char_literal196_tree=null;
		Object char_literal198_tree=null;
		Object char_literal199_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:25: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal194=(Token)match(input,18,FOLLOW_18_in_formalParameters1382); 
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:29: ( fpSection ( ';' fpSection )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==IDENT||LA43_0==63) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:30: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters1385);
					fpSection195=fpSection();
					state._fsp--;

					adaptor.addChild(root_0, fpSection195.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:40: ( ';' fpSection )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==29) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:41: ';' fpSection
							{
							char_literal196=(Token)match(input,29,FOLLOW_29_in_formalParameters1388); 
							char_literal196_tree = (Object)adaptor.create(char_literal196);
							adaptor.addChild(root_0, char_literal196_tree);

							pushFollow(FOLLOW_fpSection_in_formalParameters1390);
							fpSection197=fpSection();
							state._fsp--;

							adaptor.addChild(root_0, fpSection197.getTree());

							}
							break;

						default :
							break loop42;
						}
					}

					}
					break;

			}

			char_literal198=(Token)match(input,19,FOLLOW_19_in_formalParameters1396); 
			char_literal198_tree = (Object)adaptor.create(char_literal198);
			adaptor.addChild(root_0, char_literal198_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:63: ( ':' qualident )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==27) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:64: ':' qualident
					{
					char_literal199=(Token)match(input,27,FOLLOW_27_in_formalParameters1399); 
					char_literal199_tree = (Object)adaptor.create(char_literal199);
					adaptor.addChild(root_0, char_literal199_tree);

					pushFollow(FOLLOW_qualident_in_formalParameters1401);
					qualident200=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident200.getTree());

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
	// $ANTLR end "formalParameters"


	public static class fpSection_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fpSection"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType ;
	public final OberonParser.fpSection_return fpSection() throws RecognitionException {
		OberonParser.fpSection_return retval = new OberonParser.fpSection_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal201=null;
		Token IDENT202=null;
		Token char_literal203=null;
		Token IDENT204=null;
		Token char_literal205=null;
		ParserRuleReturnScope formalType206 =null;

		Object string_literal201_tree=null;
		Object IDENT202_tree=null;
		Object char_literal203_tree=null;
		Object IDENT204_tree=null;
		Object char_literal205_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:25: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:25: ( 'VAR' )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==63) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:25: 'VAR'
					{
					string_literal201=(Token)match(input,63,FOLLOW_63_in_fpSection1423); 
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);

					}
					break;

			}

			IDENT202=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1426); 
			IDENT202_tree = (Object)adaptor.create(IDENT202);
			adaptor.addChild(root_0, IDENT202_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:38: ( ',' IDENT )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==22) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:39: ',' IDENT
					{
					char_literal203=(Token)match(input,22,FOLLOW_22_in_fpSection1429); 
					char_literal203_tree = (Object)adaptor.create(char_literal203);
					adaptor.addChild(root_0, char_literal203_tree);

					IDENT204=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1431); 
					IDENT204_tree = (Object)adaptor.create(IDENT204);
					adaptor.addChild(root_0, IDENT204_tree);

					}
					break;

				default :
					break loop46;
				}
			}

			char_literal205=(Token)match(input,27,FOLLOW_27_in_fpSection1436); 
			char_literal205_tree = (Object)adaptor.create(char_literal205);
			adaptor.addChild(root_0, char_literal205_tree);

			pushFollow(FOLLOW_formalType_in_fpSection1438);
			formalType206=formalType();
			state._fsp--;

			adaptor.addChild(root_0, formalType206.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:1: formalType : ( ( 'ARRAY OF' )* qualident | procedureType );
	public final OberonParser.formalType_return formalType() throws RecognitionException {
		OberonParser.formalType_return retval = new OberonParser.formalType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal207=null;
		ParserRuleReturnScope qualident208 =null;
		ParserRuleReturnScope procedureType209 =null;

		Object string_literal207_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:23: ( ( 'ARRAY OF' )* qualident | procedureType )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==IDENT||LA48_0==35) ) {
				alt48=1;
			}
			else if ( (LA48_0==56) ) {
				alt48=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:25: ( 'ARRAY OF' )* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:25: ( 'ARRAY OF' )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==35) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:26: 'ARRAY OF'
							{
							string_literal207=(Token)match(input,35,FOLLOW_35_in_formalType1458); 
							string_literal207_tree = (Object)adaptor.create(string_literal207);
							adaptor.addChild(root_0, string_literal207_tree);

							}
							break;

						default :
							break loop47;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType1462);
					qualident208=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident208.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:51: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType1466);
					procedureType209=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType209.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:1: module : 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF ;
	public final OberonParser.module_return module() throws RecognitionException {
		OberonParser.module_return retval = new OberonParser.module_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal210=null;
		Token IDENT211=null;
		Token char_literal212=null;
		Token string_literal215=null;
		Token string_literal217=null;
		Token IDENT218=null;
		Token char_literal219=null;
		Token EOF220=null;
		ParserRuleReturnScope importList213 =null;
		ParserRuleReturnScope declarationSequence214 =null;
		ParserRuleReturnScope statementSequence216 =null;

		Object string_literal210_tree=null;
		Object IDENT211_tree=null;
		Object char_literal212_tree=null;
		Object string_literal215_tree=null;
		Object string_literal217_tree=null;
		Object IDENT218_tree=null;
		Object char_literal219_tree=null;
		Object EOF220_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:23: ( 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:25: 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal210=(Token)match(input,51,FOLLOW_51_in_module1489); 
			string_literal210_tree = (Object)adaptor.create(string_literal210);
			adaptor.addChild(root_0, string_literal210_tree);

			IDENT211=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1491); 
			IDENT211_tree = (Object)adaptor.create(IDENT211);
			adaptor.addChild(root_0, IDENT211_tree);

			char_literal212=(Token)match(input,29,FOLLOW_29_in_module1493); 
			char_literal212_tree = (Object)adaptor.create(char_literal212);
			adaptor.addChild(root_0, char_literal212_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:44: ( importList )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==46) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:44: importList
					{
					pushFollow(FOLLOW_importList_in_module1495);
					importList213=importList();
					state._fsp--;

					adaptor.addChild(root_0, importList213.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module1498);
			declarationSequence214=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence214.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:76: ( 'BEGIN' statementSequence )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==37) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:77: 'BEGIN' statementSequence
					{
					string_literal215=(Token)match(input,37,FOLLOW_37_in_module1501); 
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);

					pushFollow(FOLLOW_statementSequence_in_module1503);
					statementSequence216=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence216.getTree());

					}
					break;

			}

			string_literal217=(Token)match(input,43,FOLLOW_43_in_module1507); 
			string_literal217_tree = (Object)adaptor.create(string_literal217);
			adaptor.addChild(root_0, string_literal217_tree);

			IDENT218=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1509); 
			IDENT218_tree = (Object)adaptor.create(IDENT218);
			adaptor.addChild(root_0, IDENT218_tree);

			char_literal219=(Token)match(input,24,FOLLOW_24_in_module1511); 
			char_literal219_tree = (Object)adaptor.create(char_literal219);
			adaptor.addChild(root_0, char_literal219_tree);

			EOF220=(Token)match(input,EOF,FOLLOW_EOF_in_module1513); 
			EOF220_tree = (Object)adaptor.create(EOF220);
			adaptor.addChild(root_0, EOF220_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' ;
	public final OberonParser.importList_return importList() throws RecognitionException {
		OberonParser.importList_return retval = new OberonParser.importList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal221=null;
		Token char_literal223=null;
		Token char_literal225=null;
		ParserRuleReturnScope importDeclaration222 =null;
		ParserRuleReturnScope importDeclaration224 =null;

		Object string_literal221_tree=null;
		Object char_literal223_tree=null;
		Object char_literal225_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:25: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal221=(Token)match(input,46,FOLLOW_46_in_importList1532); 
			string_literal221_tree = (Object)adaptor.create(string_literal221);
			adaptor.addChild(root_0, string_literal221_tree);

			pushFollow(FOLLOW_importDeclaration_in_importList1534);
			importDeclaration222=importDeclaration();
			state._fsp--;

			adaptor.addChild(root_0, importDeclaration222.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:52: ( ',' importDeclaration )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==22) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:53: ',' importDeclaration
					{
					char_literal223=(Token)match(input,22,FOLLOW_22_in_importList1537); 
					char_literal223_tree = (Object)adaptor.create(char_literal223);
					adaptor.addChild(root_0, char_literal223_tree);

					pushFollow(FOLLOW_importDeclaration_in_importList1539);
					importDeclaration224=importDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, importDeclaration224.getTree());

					}
					break;

				default :
					break loop51;
				}
			}

			char_literal225=(Token)match(input,29,FOLLOW_29_in_importList1543); 
			char_literal225_tree = (Object)adaptor.create(char_literal225);
			adaptor.addChild(root_0, char_literal225_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:119:1: importDeclaration : IDENT ( ':=' IDENT )? ;
	public final OberonParser.importDeclaration_return importDeclaration() throws RecognitionException {
		OberonParser.importDeclaration_return retval = new OberonParser.importDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT226=null;
		Token string_literal227=null;
		Token IDENT228=null;

		Object IDENT226_tree=null;
		Object string_literal227_tree=null;
		Object IDENT228_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:119:23: ( IDENT ( ':=' IDENT )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:119:26: IDENT ( ':=' IDENT )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT226=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1557); 
			IDENT226_tree = (Object)adaptor.create(IDENT226);
			adaptor.addChild(root_0, IDENT226_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:119:32: ( ':=' IDENT )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==28) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:119:33: ':=' IDENT
					{
					string_literal227=(Token)match(input,28,FOLLOW_28_in_importDeclaration1560); 
					string_literal227_tree = (Object)adaptor.create(string_literal227);
					adaptor.addChild(root_0, string_literal227_tree);

					IDENT228=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1562); 
					IDENT228_tree = (Object)adaptor.create(IDENT228);
					adaptor.addChild(root_0, IDENT228_tree);

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
	// $ANTLR end "importDeclaration"

	// Delegated rules



	public static final BitSet FOLLOW_IDENT_in_qualident91 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_qualident93 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_qualident97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identdef119 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_identdef121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration132 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_constantDeclaration134 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_constExpression_in_constantDeclaration136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constExpression150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_typeDeclaration164 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_typeDeclaration166 = new BitSet(new long[]{0x0380001000000200L});
	public static final BitSet FOLLOW_type_in_typeDeclaration168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_type193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_type209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_arrayType229 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arrayType231 = new BitSet(new long[]{0x0020000000400000L});
	public static final BitSet FOLLOW_22_in_arrayType234 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arrayType236 = new BitSet(new long[]{0x0020000000400000L});
	public static final BitSet FOLLOW_53_in_arrayType240 = new BitSet(new long[]{0x0380001000000200L});
	public static final BitSet FOLLOW_type_in_arrayType242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constExpression_in_length265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_recordType284 = new BitSet(new long[]{0x0000000020040200L});
	public static final BitSet FOLLOW_18_in_recordType287 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_baseType_in_recordType289 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_recordType291 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_fieldListSequence_in_recordType295 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_recordType297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_baseType318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence330 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_fieldListSequence333 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence335 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_identList_in_fieldList358 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_fieldList360 = new BitSet(new long[]{0x0380001000000200L});
	public static final BitSet FOLLOW_type_in_fieldList362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_identList384 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_identList387 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identdef_in_identList389 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_55_in_pointerType409 = new BitSet(new long[]{0x0380001000000200L});
	public static final BitSet FOLLOW_type_in_pointerType411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedureType427 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureType429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identList_in_variableDeclaration440 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_variableDeclaration442 = new BitSet(new long[]{0x0380001000000200L});
	public static final BitSet FOLLOW_type_in_variableDeclaration444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_designator463 = new BitSet(new long[]{0x0000000001040002L,0x0000000000000014L});
	public static final BitSet FOLLOW_24_in_designator466 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_designator468 = new BitSet(new long[]{0x0000000001040002L,0x0000000000000014L});
	public static final BitSet FOLLOW_66_in_designator472 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expList_in_designator474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_designator476 = new BitSet(new long[]{0x0000000001040002L,0x0000000000000014L});
	public static final BitSet FOLLOW_18_in_designator480 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_designator482 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_designator484 = new BitSet(new long[]{0x0000000001040002L,0x0000000000000014L});
	public static final BitSet FOLLOW_68_in_designator488 = new BitSet(new long[]{0x0000000001040002L,0x0000000000000014L});
	public static final BitSet FOLLOW_expression_in_expList512 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_expList515 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_expList517 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression538 = new BitSet(new long[]{0x00018007C0010002L});
	public static final BitSet FOLLOW_relation_in_expression541 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_simpleExpression_in_expression543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression602 = new BitSet(new long[]{0x0040000000A00002L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression605 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000240L});
	public static final BitSet FOLLOW_term_in_simpleExpression607 = new BitSet(new long[]{0x0040000000A00002L});
	public static final BitSet FOLLOW_factor_in_term660 = new BitSet(new long[]{0x0004008004120002L});
	public static final BitSet FOLLOW_mulOperator_in_term663 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_term665 = new BitSet(new long[]{0x0004008004120002L});
	public static final BitSet FOLLOW_number_in_factor716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_factor728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor736 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_actualParameters_in_factor738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_factor743 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_factor745 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_factor747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_factor751 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_factor753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_set779 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000340L});
	public static final BitSet FOLLOW_element_in_set782 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
	public static final BitSet FOLLOW_22_in_set785 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_element_in_set787 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_set794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element816 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_element820 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_element822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_actualParameters837 = new BitSet(new long[]{0x0010000000AC5620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expList_in_actualParameters839 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_actualParameters842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement2_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_statement879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_statement883 = new BitSet(new long[]{0x0010000000A45622L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_statement885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement2908 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_assignment_in_statement2912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignment938 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_assignment940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence970 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_statementSequence974 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statement_in_statementSequence976 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_45_in_ifStatement996 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifStatement998 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement1000 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1002 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_42_in_ifStatement1005 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifStatement1007 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement1009 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1011 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_41_in_ifStatement1016 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1018 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ifStatement1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_caseStatement1038 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_caseStatement1040 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_caseStatement1042 = new BitSet(new long[]{0x00100A0000A45620L,0x00000000000002C0L});
	public static final BitSet FOLLOW_casE_in_caseStatement1044 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_caseStatement1047 = new BitSet(new long[]{0x00100A0000A45620L,0x00000000000002C0L});
	public static final BitSet FOLLOW_casE_in_caseStatement1049 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_41_in_caseStatement1054 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement1056 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_caseStatement1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE1086 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_casE1088 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_casE1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1108 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_caseLabelList1111 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1113 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1134 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_caseLabels1137 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_whileStatement1155 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_whileStatement1157 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_whileStatement1159 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement1161 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_whileStatement1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_repeatStatement1177 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement1179 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_repeatStatement1181 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_loopStatement1199 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement1201 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_loopStatement1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_withStatement1219 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_withStatement1221 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_withStatement1223 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_withStatement1225 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_withStatement1227 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_withStatement1229 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_withStatement1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1240 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_procedureDeclaration1242 = new BitSet(new long[]{0xA100086000000000L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1244 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedureHeading1259 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_20_in_procedureHeading1261 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading1264 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody1283 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_procedureBody1286 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody1288 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_procedureBody1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_forwardDeclaration1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_forwardDeclaration1305 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration1307 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_declarationSequence1322 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_constantDeclaration_in_declarationSequence1325 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1327 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_61_in_declarationSequence1334 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_typeDeclaration_in_declarationSequence1338 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1340 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_63_in_declarationSequence1346 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_variableDeclaration_in_declarationSequence1349 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1351 = new BitSet(new long[]{0xA100004000000202L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence1359 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1361 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence1365 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1367 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_18_in_formalParameters1382 = new BitSet(new long[]{0x8000000000080200L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1385 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_29_in_formalParameters1388 = new BitSet(new long[]{0x8000000000000200L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1390 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_19_in_formalParameters1396 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_formalParameters1399 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_formalParameters1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_fpSection1423 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1426 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_22_in_fpSection1429 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1431 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_27_in_fpSection1436 = new BitSet(new long[]{0x0100000800000200L});
	public static final BitSet FOLLOW_formalType_in_fpSection1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_formalType1458 = new BitSet(new long[]{0x0000000800000200L});
	public static final BitSet FOLLOW_qualident_in_formalType1462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_module1489 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_module1491 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_module1493 = new BitSet(new long[]{0xA100486000000000L});
	public static final BitSet FOLLOW_importList_in_module1495 = new BitSet(new long[]{0xA100086000000000L});
	public static final BitSet FOLLOW_declarationSequence_in_module1498 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_module1501 = new BitSet(new long[]{0x0C02300020000200L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_module1503 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_module1507 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_module1509 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_module1511 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_importList1532 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1534 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_22_in_importList1537 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1539 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_29_in_importList1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1557 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_importDeclaration1560 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1562 = new BitSet(new long[]{0x0000000000000002L});
}
