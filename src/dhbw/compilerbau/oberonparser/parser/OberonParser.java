// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-21 19:56:53
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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
		"'PROCEDURE'", "'RECORD'", "'REPEAT'", "'RETURN'", "'THEN'", "'UNTIL'", 
		"'VAR'", "'WHILE'", "'WITH'", "'['", "']'", "'^'", "'case'", "'{'", "'|'", 
		"'}'", "'~'"
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
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set1));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
					IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident91); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT2_tree = (Object)adaptor.create(IDENT2);
					adaptor.addChild(root_0, IDENT2_tree);
					}

					char_literal3=(Token)match(input,24,FOLLOW_24_in_qualident93); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);
					}

					}
					break;

			}

			IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident97); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT4_tree = (Object)adaptor.create(IDENT4);
			adaptor.addChild(root_0, IDENT4_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef119); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT5_tree = (Object)adaptor.create(IDENT5);
			adaptor.addChild(root_0, IDENT5_tree);
			}

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
					char_literal6=(Token)match(input,20,FOLLOW_20_in_identdef121); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef7.getTree());

			char_literal8=(Token)match(input,32,FOLLOW_32_in_constantDeclaration134); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal8_tree = (Object)adaptor.create(char_literal8);
			adaptor.addChild(root_0, char_literal8_tree);
			}

			pushFollow(FOLLOW_constExpression_in_constantDeclaration136);
			constExpression9=constExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression9.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression10.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef11.getTree());

			char_literal12=(Token)match(input,32,FOLLOW_32_in_typeDeclaration166); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal12_tree = (Object)adaptor.create(char_literal12);
			adaptor.addChild(root_0, char_literal12_tree);
			}

			pushFollow(FOLLOW_type_in_typeDeclaration168);
			type13=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type13.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
				if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident14.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:37: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type197);
					arrayType15=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType15.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:49: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type201);
					recordType16=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType16.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:62: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type205);
					pointerType17=pointerType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pointerType17.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:76: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type209);
					procedureType18=procedureType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureType18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			string_literal19=(Token)match(input,36,FOLLOW_36_in_arrayType229); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			adaptor.addChild(root_0, string_literal19_tree);
			}

			pushFollow(FOLLOW_length_in_arrayType231);
			length20=length();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, length20.getTree());

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
					char_literal21=(Token)match(input,22,FOLLOW_22_in_arrayType234); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal21_tree = (Object)adaptor.create(char_literal21);
					adaptor.addChild(root_0, char_literal21_tree);
					}

					pushFollow(FOLLOW_length_in_arrayType236);
					length22=length();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, length22.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			string_literal23=(Token)match(input,53,FOLLOW_53_in_arrayType240); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			adaptor.addChild(root_0, string_literal23_tree);
			}

			pushFollow(FOLLOW_type_in_arrayType242);
			type24=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type24.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression25.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			string_literal26=(Token)match(input,57,FOLLOW_57_in_recordType284); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal26_tree = (Object)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);
			}

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
					char_literal27=(Token)match(input,18,FOLLOW_18_in_recordType287); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal27_tree = (Object)adaptor.create(char_literal27);
					adaptor.addChild(root_0, char_literal27_tree);
					}

					pushFollow(FOLLOW_baseType_in_recordType289);
					baseType28=baseType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, baseType28.getTree());

					char_literal29=(Token)match(input,19,FOLLOW_19_in_recordType291); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = (Object)adaptor.create(char_literal29);
					adaptor.addChild(root_0, char_literal29_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType295);
			fieldListSequence30=fieldListSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldListSequence30.getTree());

			string_literal31=(Token)match(input,43,FOLLOW_43_in_recordType297); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal31_tree = (Object)adaptor.create(string_literal31);
			adaptor.addChild(root_0, string_literal31_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident32.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList33.getTree());

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
					char_literal34=(Token)match(input,29,FOLLOW_29_in_fieldListSequence333); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);
					}

					pushFollow(FOLLOW_fieldList_in_fieldListSequence335);
					fieldList35=fieldList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList35.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identList36.getTree());

					char_literal37=(Token)match(input,27,FOLLOW_27_in_fieldList360); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal37_tree = (Object)adaptor.create(char_literal37);
					adaptor.addChild(root_0, char_literal37_tree);
					}

					pushFollow(FOLLOW_type_in_fieldList362);
					type38=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type38.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef39.getTree());

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
					char_literal40=(Token)match(input,22,FOLLOW_22_in_identList387); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal40_tree = (Object)adaptor.create(char_literal40);
					adaptor.addChild(root_0, char_literal40_tree);
					}

					pushFollow(FOLLOW_identdef_in_identList389);
					identdef41=identdef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef41.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			string_literal42=(Token)match(input,55,FOLLOW_55_in_pointerType409); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal42_tree = (Object)adaptor.create(string_literal42);
			adaptor.addChild(root_0, string_literal42_tree);
			}

			pushFollow(FOLLOW_type_in_pointerType411);
			type43=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type43.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			string_literal44=(Token)match(input,56,FOLLOW_56_in_procedureType427); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal44_tree = (Object)adaptor.create(string_literal44);
			adaptor.addChild(root_0, string_literal44_tree);
			}

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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters45.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identList46.getTree());

			char_literal47=(Token)match(input,27,FOLLOW_27_in_variableDeclaration442); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal47_tree = (Object)adaptor.create(char_literal47);
			adaptor.addChild(root_0, char_literal47_tree);
			}

			pushFollow(FOLLOW_type_in_variableDeclaration444);
			type48=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, type48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident49.getTree());

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
				case 65:
					{
					alt10=2;
					}
					break;
				case 67:
					{
					alt10=4;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:36: '.' IDENT
					{
					char_literal50=(Token)match(input,24,FOLLOW_24_in_designator466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);
					}

					IDENT51=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator468); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT51_tree = (Object)adaptor.create(IDENT51);
					adaptor.addChild(root_0, IDENT51_tree);
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:48: '[' expList ']'
					{
					char_literal52=(Token)match(input,65,FOLLOW_65_in_designator472); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal52_tree = (Object)adaptor.create(char_literal52);
					adaptor.addChild(root_0, char_literal52_tree);
					}

					pushFollow(FOLLOW_expList_in_designator474);
					expList53=expList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expList53.getTree());

					char_literal54=(Token)match(input,66,FOLLOW_66_in_designator476); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					adaptor.addChild(root_0, char_literal54_tree);
					}

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:66: '(' qualident ')'
					{
					char_literal55=(Token)match(input,18,FOLLOW_18_in_designator480); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					}

					pushFollow(FOLLOW_qualident_in_designator482);
					qualident56=qualident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident56.getTree());

					char_literal57=(Token)match(input,19,FOLLOW_19_in_designator484); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal57_tree = (Object)adaptor.create(char_literal57);
					adaptor.addChild(root_0, char_literal57_tree);
					}

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:86: '^'
					{
					char_literal58=(Token)match(input,67,FOLLOW_67_in_designator488); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal58_tree = (Object)adaptor.create(char_literal58);
					adaptor.addChild(root_0, char_literal58_tree);
					}

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression59.getTree());

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
					char_literal60=(Token)match(input,22,FOLLOW_22_in_expList515); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);
					}

					pushFollow(FOLLOW_expression_in_expList517);
					expression61=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression62.getTree());

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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relation63.getTree());

					pushFollow(FOLLOW_simpleExpression_in_expression543);
					simpleExpression64=simpleExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression64.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set65));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set66));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_term_in_simpleExpression602);
			term67=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term67.getTree());

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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addOperator68.getTree());

					pushFollow(FOLLOW_term_in_simpleExpression607);
					term69=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term69.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set70));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor71.getTree());

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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mulOperator72.getTree());

					pushFollow(FOLLOW_factor_in_term665);
					factor73=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor73.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set74));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			case 69:
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
			case 72:
				{
				alt17=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, number75.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:34: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST76=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor720); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHARCONST76_tree = (Object)adaptor.create(CHARCONST76);
					adaptor.addChild(root_0, CHARCONST76_tree);
					}

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:46: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING77=(Token)match(input,STRING,FOLLOW_STRING_in_factor724); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING77_tree = (Object)adaptor.create(STRING77);
					adaptor.addChild(root_0, STRING77_tree);
					}

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:55: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal78=(Token)match(input,52,FOLLOW_52_in_factor728); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);
					}

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:63: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor732);
					set79=set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set79.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:69: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor736);
					designator80=designator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, designator80.getTree());

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
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters81.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:100: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal82=(Token)match(input,18,FOLLOW_18_in_factor743); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal82_tree = (Object)adaptor.create(char_literal82);
					adaptor.addChild(root_0, char_literal82_tree);
					}

					pushFollow(FOLLOW_expression_in_factor745);
					expression83=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression83.getTree());

					char_literal84=(Token)match(input,19,FOLLOW_19_in_factor747); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal84_tree = (Object)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);
					}

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:121: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal85=(Token)match(input,72,FOLLOW_72_in_factor751); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal85_tree = (Object)adaptor.create(char_literal85);
					adaptor.addChild(root_0, char_literal85_tree);
					}

					pushFollow(FOLLOW_factor_in_factor753);
					factor86=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor86.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			char_literal87=(Token)match(input,69,FOLLOW_69_in_set779); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:29: ( element ( ',' element )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHARCONST||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||LA19_0==REAL||LA19_0==STRING||LA19_0==18||LA19_0==21||LA19_0==23||LA19_0==52||LA19_0==69||LA19_0==72) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:30: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set782);
					element88=element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, element88.getTree());

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
							char_literal89=(Token)match(input,22,FOLLOW_22_in_set785); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal89_tree = (Object)adaptor.create(char_literal89);
							adaptor.addChild(root_0, char_literal89_tree);
							}

							pushFollow(FOLLOW_element_in_set787);
							element90=element();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, element90.getTree());

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			char_literal91=(Token)match(input,71,FOLLOW_71_in_set794); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal91_tree = (Object)adaptor.create(char_literal91);
			adaptor.addChild(root_0, char_literal91_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression92.getTree());

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
					string_literal93=(Token)match(input,25,FOLLOW_25_in_element820); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal93_tree = (Object)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);
					}

					pushFollow(FOLLOW_expression_in_element822);
					expression94=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression94.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


			char_literal95=(Token)match(input,18,FOLLOW_18_in_actualParameters837); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal95_tree = (Object)adaptor.create(char_literal95);
			adaptor.addChild(root_0, char_literal95_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:29: ( expList )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CHARCONST||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||LA21_0==REAL||LA21_0==STRING||LA21_0==18||LA21_0==21||LA21_0==23||LA21_0==52||LA21_0==69||LA21_0==72) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:29: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters839);
					expList96=expList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expList96.getTree());

					}
					break;

			}

			char_literal97=(Token)match(input,19,FOLLOW_19_in_actualParameters842); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal97_tree = (Object)adaptor.create(char_literal97);
			adaptor.addChild(root_0, char_literal97_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:1: statement : ( options {backtrack=true; } : assignment | procedureCall | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? ;
	public final OberonParser.statement_return statement() throws RecognitionException {
		OberonParser.statement_return retval = new OberonParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		Token string_literal107=null;
		ParserRuleReturnScope assignment98 =null;
		ParserRuleReturnScope procedureCall99 =null;
		ParserRuleReturnScope ifStatement100 =null;
		ParserRuleReturnScope caseStatement101 =null;
		ParserRuleReturnScope whileStatement102 =null;
		ParserRuleReturnScope repeatStatement103 =null;
		ParserRuleReturnScope loopStatement104 =null;
		ParserRuleReturnScope withStatement105 =null;
		ParserRuleReturnScope expression108 =null;

		Object string_literal106_tree=null;
		Object string_literal107_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:23: ( ( options {backtrack=true; } : assignment | procedureCall | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:26: ( options {backtrack=true; } : assignment | procedureCall | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:26: ( options {backtrack=true; } : assignment | procedureCall | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			int alt23=11;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA23_1 = input.LA(2);
					if ( (synpred1_Oberon()) ) {
						alt23=1;
					}
					else if ( (synpred2_Oberon()) ) {
						alt23=2;
					}
					}
					break;
				case 45:
					{
					alt23=3;
					}
					break;
				case 68:
					{
					alt23=4;
					}
					break;
				case 63:
					{
					alt23=5;
					}
					break;
				case 58:
					{
					alt23=6;
					}
					break;
				case 49:
					{
					alt23=7;
					}
					break;
				case 64:
					{
					alt23=8;
					}
					break;
				case 44:
					{
					alt23=9;
					}
					break;
				case 59:
					{
					alt23=10;
					}
					break;
			}
			switch (alt23) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:52: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement871);
					assignment98=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment98.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:63: procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement873);
					procedureCall99=procedureCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall99.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:77: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement875);
					ifStatement100=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement100.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:89: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement877);
					caseStatement101=caseStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStatement101.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:103: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement879);
					whileStatement102=whileStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement102.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:118: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement881);
					repeatStatement103=repeatStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatStatement103.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:134: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement883);
					loopStatement104=loopStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, loopStatement104.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:148: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement885);
					withStatement105=withStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement105.getTree());

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:163: 'EXIT'
					{
					string_literal106=(Token)match(input,44,FOLLOW_44_in_statement888); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					adaptor.addChild(root_0, string_literal106_tree);
					}

					}
					break;
				case 10 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:172: 'RETURN' ( expression )?
					{
					string_literal107=(Token)match(input,59,FOLLOW_59_in_statement892); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal107_tree = (Object)adaptor.create(string_literal107);
					adaptor.addChild(root_0, string_literal107_tree);
					}

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:181: ( expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==CHARCONST||(LA22_0 >= IDENT && LA22_0 <= INTEGER)||LA22_0==REAL||LA22_0==STRING||LA22_0==18||LA22_0==21||LA22_0==23||LA22_0==52||LA22_0==69||LA22_0==72) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:181: expression
							{
							pushFollow(FOLLOW_expression_in_statement894);
							expression108=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression108.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:1: assignment : designator ':=' expression ;
	public final OberonParser.assignment_return assignment() throws RecognitionException {
		OberonParser.assignment_return retval = new OberonParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal110=null;
		ParserRuleReturnScope designator109 =null;
		ParserRuleReturnScope expression111 =null;

		Object string_literal110_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:23: ( designator ':=' expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:25: designator ':=' expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_designator_in_assignment917);
			designator109=designator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, designator109.getTree());

			string_literal110=(Token)match(input,28,FOLLOW_28_in_assignment919); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal110_tree = (Object)adaptor.create(string_literal110);
			adaptor.addChild(root_0, string_literal110_tree);
			}

			pushFollow(FOLLOW_expression_in_assignment921);
			expression111=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression111.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:1: procedureCall : designator ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope designator112 =null;
		ParserRuleReturnScope actualParameters113 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:23: ( designator ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:25: designator ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_designator_in_procedureCall937);
			designator112=designator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, designator112.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:36: ( actualParameters )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==18) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:36: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall939);
					actualParameters113=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters113.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:1: statementSequence : statement ( ';' statement )* ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope statement114 =null;
		ParserRuleReturnScope statement116 =null;

		Object char_literal115_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:23: ( statement ( ';' statement )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:25: statement ( ';' statement )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statementSequence952);
			statement114=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement114.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:35: ( ';' statement )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==29) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:37: ';' statement
					{
					char_literal115=(Token)match(input,29,FOLLOW_29_in_statementSequence956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal115_tree = (Object)adaptor.create(char_literal115);
					adaptor.addChild(root_0, char_literal115_tree);
					}

					pushFollow(FOLLOW_statement_in_statementSequence958);
					statement116=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement116.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:23: ( 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:25: 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal117=(Token)match(input,45,FOLLOW_45_in_ifStatement978); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal117_tree = (Object)adaptor.create(string_literal117);
			adaptor.addChild(root_0, string_literal117_tree);
			}

			pushFollow(FOLLOW_expression_in_ifStatement980);
			expression118=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

			string_literal119=(Token)match(input,60,FOLLOW_60_in_ifStatement982); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal119_tree = (Object)adaptor.create(string_literal119);
			adaptor.addChild(root_0, string_literal119_tree);
			}

			pushFollow(FOLLOW_statementSequence_in_ifStatement984);
			statementSequence120=statementSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence120.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:66: ( 'ELSEIF' expression 'THEN' statementSequence )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==42) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:67: 'ELSEIF' expression 'THEN' statementSequence
					{
					string_literal121=(Token)match(input,42,FOLLOW_42_in_ifStatement987); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal121_tree = (Object)adaptor.create(string_literal121);
					adaptor.addChild(root_0, string_literal121_tree);
					}

					pushFollow(FOLLOW_expression_in_ifStatement989);
					expression122=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression122.getTree());

					string_literal123=(Token)match(input,60,FOLLOW_60_in_ifStatement991); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal123_tree = (Object)adaptor.create(string_literal123);
					adaptor.addChild(root_0, string_literal123_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_ifStatement993);
					statementSequence124=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence124.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:114: ( 'ELSE' statementSequence )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==41) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:115: 'ELSE' statementSequence
					{
					string_literal125=(Token)match(input,41,FOLLOW_41_in_ifStatement998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal125_tree = (Object)adaptor.create(string_literal125);
					adaptor.addChild(root_0, string_literal125_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_ifStatement1000);
					statementSequence126=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence126.getTree());

					}
					break;

			}

			string_literal127=(Token)match(input,43,FOLLOW_43_in_ifStatement1004); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal127_tree = (Object)adaptor.create(string_literal127);
			adaptor.addChild(root_0, string_literal127_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:25: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal128=(Token)match(input,68,FOLLOW_68_in_caseStatement1020); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal128_tree = (Object)adaptor.create(string_literal128);
			adaptor.addChild(root_0, string_literal128_tree);
			}

			pushFollow(FOLLOW_expression_in_caseStatement1022);
			expression129=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());

			string_literal130=(Token)match(input,53,FOLLOW_53_in_caseStatement1024); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal130_tree = (Object)adaptor.create(string_literal130);
			adaptor.addChild(root_0, string_literal130_tree);
			}

			pushFollow(FOLLOW_casE_in_caseStatement1026);
			casE131=casE();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, casE131.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:53: ( '|' casE )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==70) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:54: '|' casE
					{
					char_literal132=(Token)match(input,70,FOLLOW_70_in_caseStatement1029); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal132_tree = (Object)adaptor.create(char_literal132);
					adaptor.addChild(root_0, char_literal132_tree);
					}

					pushFollow(FOLLOW_casE_in_caseStatement1031);
					casE133=casE();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, casE133.getTree());

					}
					break;

				default :
					break loop28;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:65: ( 'ELSE' statementSequence )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==41) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:66: 'ELSE' statementSequence
					{
					string_literal134=(Token)match(input,41,FOLLOW_41_in_caseStatement1036); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal134_tree = (Object)adaptor.create(string_literal134);
					adaptor.addChild(root_0, string_literal134_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_caseStatement1038);
					statementSequence135=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence135.getTree());

					}
					break;

			}

			string_literal136=(Token)match(input,43,FOLLOW_43_in_caseStatement1042); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal136_tree = (Object)adaptor.create(string_literal136);
			adaptor.addChild(root_0, string_literal136_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		ParserRuleReturnScope caseLabelList137 =null;
		ParserRuleReturnScope statementSequence139 =null;

		Object char_literal138_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:25: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:25: ( caseLabelList ':' statementSequence )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==CHARCONST||(LA30_0 >= IDENT && LA30_0 <= INTEGER)||LA30_0==REAL||LA30_0==STRING||LA30_0==18||LA30_0==21||LA30_0==23||LA30_0==52||LA30_0==69||LA30_0==72) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:26: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE1068);
					caseLabelList137=caseLabelList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabelList137.getTree());

					char_literal138=(Token)match(input,27,FOLLOW_27_in_casE1070); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal138_tree = (Object)adaptor.create(char_literal138);
					adaptor.addChild(root_0, char_literal138_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_casE1072);
					statementSequence139=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence139.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal141=null;
		ParserRuleReturnScope caseLabels140 =null;
		ParserRuleReturnScope caseLabels142 =null;

		Object char_literal141_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:25: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList1090);
			caseLabels140=caseLabels();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabels140.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:36: ( ',' caseLabels )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==22) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:37: ',' caseLabels
					{
					char_literal141=(Token)match(input,22,FOLLOW_22_in_caseLabelList1093); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal141_tree = (Object)adaptor.create(char_literal141);
					adaptor.addChild(root_0, char_literal141_tree);
					}

					pushFollow(FOLLOW_caseLabels_in_caseLabelList1095);
					caseLabels142=caseLabels();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabels142.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal144=null;
		ParserRuleReturnScope constExpression143 =null;
		ParserRuleReturnScope constExpression145 =null;

		Object string_literal144_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:25: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels1116);
			constExpression143=constExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression143.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:41: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:42: '..' constExpression
			{
			string_literal144=(Token)match(input,25,FOLLOW_25_in_caseLabels1119); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal144_tree = (Object)adaptor.create(string_literal144);
			adaptor.addChild(root_0, string_literal144_tree);
			}

			pushFollow(FOLLOW_constExpression_in_caseLabels1121);
			constExpression145=constExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression145.getTree());

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:23: ( 'WHILE' expression 'DO' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:25: 'WHILE' expression 'DO' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal146=(Token)match(input,63,FOLLOW_63_in_whileStatement1137); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal146_tree = (Object)adaptor.create(string_literal146);
			adaptor.addChild(root_0, string_literal146_tree);
			}

			pushFollow(FOLLOW_expression_in_whileStatement1139);
			expression147=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression147.getTree());

			string_literal148=(Token)match(input,40,FOLLOW_40_in_whileStatement1141); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal148_tree = (Object)adaptor.create(string_literal148);
			adaptor.addChild(root_0, string_literal148_tree);
			}

			pushFollow(FOLLOW_statementSequence_in_whileStatement1143);
			statementSequence149=statementSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence149.getTree());

			string_literal150=(Token)match(input,43,FOLLOW_43_in_whileStatement1145); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal150_tree = (Object)adaptor.create(string_literal150);
			adaptor.addChild(root_0, string_literal150_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:1: repeatStatement : 'REPEAT' statementSequence 'UNTIL' expression ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:23: ( 'REPEAT' statementSequence 'UNTIL' expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:25: 'REPEAT' statementSequence 'UNTIL' expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal151=(Token)match(input,58,FOLLOW_58_in_repeatStatement1159); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal151_tree = (Object)adaptor.create(string_literal151);
			adaptor.addChild(root_0, string_literal151_tree);
			}

			pushFollow(FOLLOW_statementSequence_in_repeatStatement1161);
			statementSequence152=statementSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence152.getTree());

			string_literal153=(Token)match(input,61,FOLLOW_61_in_repeatStatement1163); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal153_tree = (Object)adaptor.create(string_literal153);
			adaptor.addChild(root_0, string_literal153_tree);
			}

			pushFollow(FOLLOW_expression_in_repeatStatement1165);
			expression154=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression154.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:1: loopStatement : 'LOOP' statementSequence 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:23: ( 'LOOP' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:25: 'LOOP' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal155=(Token)match(input,49,FOLLOW_49_in_loopStatement1181); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal155_tree = (Object)adaptor.create(string_literal155);
			adaptor.addChild(root_0, string_literal155_tree);
			}

			pushFollow(FOLLOW_statementSequence_in_loopStatement1183);
			statementSequence156=statementSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence156.getTree());

			string_literal157=(Token)match(input,43,FOLLOW_43_in_loopStatement1185); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal157_tree = (Object)adaptor.create(string_literal157);
			adaptor.addChild(root_0, string_literal157_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:1: withStatement : 'WITH' qualident ':' qualident 'DO' statementSequence 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:23: ( 'WITH' qualident ':' qualident 'DO' statementSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:25: 'WITH' qualident ':' qualident 'DO' statementSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal158=(Token)match(input,64,FOLLOW_64_in_withStatement1201); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal158_tree = (Object)adaptor.create(string_literal158);
			adaptor.addChild(root_0, string_literal158_tree);
			}

			pushFollow(FOLLOW_qualident_in_withStatement1203);
			qualident159=qualident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident159.getTree());

			char_literal160=(Token)match(input,27,FOLLOW_27_in_withStatement1205); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal160_tree = (Object)adaptor.create(char_literal160);
			adaptor.addChild(root_0, char_literal160_tree);
			}

			pushFollow(FOLLOW_qualident_in_withStatement1207);
			qualident161=qualident();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident161.getTree());

			string_literal162=(Token)match(input,40,FOLLOW_40_in_withStatement1209); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal162_tree = (Object)adaptor.create(string_literal162);
			adaptor.addChild(root_0, string_literal162_tree);
			}

			pushFollow(FOLLOW_statementSequence_in_withStatement1211);
			statementSequence163=statementSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence163.getTree());

			string_literal164=(Token)match(input,43,FOLLOW_43_in_withStatement1213); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal164_tree = (Object)adaptor.create(string_literal164);
			adaptor.addChild(root_0, string_literal164_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:23: ( procedureHeading ';' procedureBody IDENT )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:25: procedureHeading ';' procedureBody IDENT
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1222);
			procedureHeading165=procedureHeading();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureHeading165.getTree());

			char_literal166=(Token)match(input,29,FOLLOW_29_in_procedureDeclaration1224); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal166_tree = (Object)adaptor.create(char_literal166);
			adaptor.addChild(root_0, char_literal166_tree);
			}

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1226);
			procedureBody167=procedureBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureBody167.getTree());

			IDENT168=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1228); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT168_tree = (Object)adaptor.create(IDENT168);
			adaptor.addChild(root_0, IDENT168_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:1: procedureHeading : 'PROCEDURE' ( '*' )? identdef ( formalParameters )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:23: ( 'PROCEDURE' ( '*' )? identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:25: 'PROCEDURE' ( '*' )? identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal169=(Token)match(input,56,FOLLOW_56_in_procedureHeading1241); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal169_tree = (Object)adaptor.create(string_literal169);
			adaptor.addChild(root_0, string_literal169_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:37: ( '*' )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==20) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:37: '*'
					{
					char_literal170=(Token)match(input,20,FOLLOW_20_in_procedureHeading1243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal170_tree = (Object)adaptor.create(char_literal170);
					adaptor.addChild(root_0, char_literal170_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading1246);
			identdef171=identdef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef171.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:51: ( formalParameters )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==18) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:51: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading1248);
					formalParameters172=formalParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters172.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:25: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declarationSequence_in_procedureBody1265);
			declarationSequence173=declarationSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationSequence173.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:45: ( 'BEGIN' statementSequence )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==37) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:46: 'BEGIN' statementSequence
					{
					string_literal174=(Token)match(input,37,FOLLOW_37_in_procedureBody1268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal174_tree = (Object)adaptor.create(string_literal174);
					adaptor.addChild(root_0, string_literal174_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_procedureBody1270);
					statementSequence175=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence175.getTree());

					}
					break;

			}

			string_literal176=(Token)match(input,43,FOLLOW_43_in_procedureBody1274); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal176_tree = (Object)adaptor.create(string_literal176);
			adaptor.addChild(root_0, string_literal176_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:25: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal177=(Token)match(input,56,FOLLOW_56_in_forwardDeclaration1285); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal177_tree = (Object)adaptor.create(string_literal177);
			adaptor.addChild(root_0, string_literal177_tree);
			}

			char_literal178=(Token)match(input,67,FOLLOW_67_in_forwardDeclaration1287); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal178_tree = (Object)adaptor.create(char_literal178);
			adaptor.addChild(root_0, char_literal178_tree);
			}

			pushFollow(FOLLOW_identdef_in_forwardDeclaration1288);
			identdef179=identdef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identdef179.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:49: ( formalParameters )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==18) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:49: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration1290);
					formalParameters180=formalParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameters180.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:1: declarationSequence : ( 'CONST' ( constantDeclaration ';' )* | type ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )* ;
	public final OberonParser.declarationSequence_return declarationSequence() throws RecognitionException {
		OberonParser.declarationSequence_return retval = new OberonParser.declarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal181=null;
		Token char_literal183=null;
		Token char_literal186=null;
		Token string_literal187=null;
		Token char_literal189=null;
		Token char_literal191=null;
		Token char_literal193=null;
		ParserRuleReturnScope constantDeclaration182 =null;
		ParserRuleReturnScope type184 =null;
		ParserRuleReturnScope typeDeclaration185 =null;
		ParserRuleReturnScope variableDeclaration188 =null;
		ParserRuleReturnScope procedureDeclaration190 =null;
		ParserRuleReturnScope forwardDeclaration192 =null;

		Object string_literal181_tree=null;
		Object char_literal183_tree=null;
		Object char_literal186_tree=null;
		Object string_literal187_tree=null;
		Object char_literal189_tree=null;
		Object char_literal191_tree=null;
		Object char_literal193_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:24: ( ( 'CONST' ( constantDeclaration ';' )* | type ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:26: ( 'CONST' ( constantDeclaration ';' )* | type ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )* ( procedureDeclaration ';' | forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:26: ( 'CONST' ( constantDeclaration ';' )* | type ( typeDeclaration ';' )* | 'VAR' ( variableDeclaration ';' )* )*
			loop39:
			while (true) {
				int alt39=4;
				switch ( input.LA(1) ) {
				case 56:
					{
					int LA39_1 = input.LA(2);
					if ( (LA39_1==IDENT) ) {
						int LA39_6 = input.LA(3);
						if ( (LA39_6==IDENT||LA39_6==24||LA39_6==32||(LA39_6 >= 36 && LA39_6 <= 38)||LA39_6==43||(LA39_6 >= 55 && LA39_6 <= 57)||LA39_6==62) ) {
							alt39=2;
						}
						else if ( (LA39_6==20) ) {
							int LA39_7 = input.LA(4);
							if ( (LA39_7==32) ) {
								alt39=2;
							}

						}

					}
					else if ( (LA39_1==18||(LA39_1 >= 36 && LA39_1 <= 38)||LA39_1==43||(LA39_1 >= 55 && LA39_1 <= 57)||LA39_1==62) ) {
						alt39=2;
					}

					}
					break;
				case 38:
					{
					alt39=1;
					}
					break;
				case IDENT:
				case 36:
				case 55:
				case 57:
					{
					alt39=2;
					}
					break;
				case 62:
					{
					alt39=3;
					}
					break;
				}
				switch (alt39) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:27: 'CONST' ( constantDeclaration ';' )*
					{
					string_literal181=(Token)match(input,38,FOLLOW_38_in_declarationSequence1303); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal181_tree = (Object)adaptor.create(string_literal181);
					adaptor.addChild(root_0, string_literal181_tree);
					}

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:35: ( constantDeclaration ';' )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==IDENT) ) {
							int LA36_2 = input.LA(2);
							if ( (LA36_2==20||LA36_2==32) ) {
								alt36=1;
							}

						}

						switch (alt36) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:36: constantDeclaration ';'
							{
							pushFollow(FOLLOW_constantDeclaration_in_declarationSequence1306);
							constantDeclaration182=constantDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, constantDeclaration182.getTree());

							char_literal183=(Token)match(input,29,FOLLOW_29_in_declarationSequence1308); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal183_tree = (Object)adaptor.create(char_literal183);
							adaptor.addChild(root_0, char_literal183_tree);
							}

							}
							break;

						default :
							break loop36;
						}
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:65: type ( typeDeclaration ';' )*
					{
					pushFollow(FOLLOW_type_in_declarationSequence1315);
					type184=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type184.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:70: ( typeDeclaration ';' )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==IDENT) ) {
							int LA37_2 = input.LA(2);
							if ( (LA37_2==20||LA37_2==32) ) {
								alt37=1;
							}

						}

						switch (alt37) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:72: typeDeclaration ';'
							{
							pushFollow(FOLLOW_typeDeclaration_in_declarationSequence1319);
							typeDeclaration185=typeDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDeclaration185.getTree());

							char_literal186=(Token)match(input,29,FOLLOW_29_in_declarationSequence1321); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal186_tree = (Object)adaptor.create(char_literal186);
							adaptor.addChild(root_0, char_literal186_tree);
							}

							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:96: 'VAR' ( variableDeclaration ';' )*
					{
					string_literal187=(Token)match(input,62,FOLLOW_62_in_declarationSequence1327); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal187_tree = (Object)adaptor.create(string_literal187);
					adaptor.addChild(root_0, string_literal187_tree);
					}

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:102: ( variableDeclaration ';' )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==IDENT) ) {
							int LA38_2 = input.LA(2);
							if ( (LA38_2==20||LA38_2==22||LA38_2==27) ) {
								alt38=1;
							}

						}

						switch (alt38) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:103: variableDeclaration ';'
							{
							pushFollow(FOLLOW_variableDeclaration_in_declarationSequence1330);
							variableDeclaration188=variableDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration188.getTree());

							char_literal189=(Token)match(input,29,FOLLOW_29_in_declarationSequence1332); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal189_tree = (Object)adaptor.create(char_literal189);
							adaptor.addChild(root_0, char_literal189_tree);
							}

							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

				default :
					break loop39;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:132: ( procedureDeclaration ';' | forwardDeclaration ';' )*
			loop40:
			while (true) {
				int alt40=3;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==56) ) {
					int LA40_2 = input.LA(2);
					if ( (LA40_2==67) ) {
						alt40=2;
					}
					else if ( (LA40_2==IDENT||LA40_2==20) ) {
						alt40=1;
					}

				}

				switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:133: procedureDeclaration ';'
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence1340);
					procedureDeclaration190=procedureDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureDeclaration190.getTree());

					char_literal191=(Token)match(input,29,FOLLOW_29_in_declarationSequence1342); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal191_tree = (Object)adaptor.create(char_literal191);
					adaptor.addChild(root_0, char_literal191_tree);
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:160: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence1346);
					forwardDeclaration192=forwardDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forwardDeclaration192.getTree());

					char_literal193=(Token)match(input,29,FOLLOW_29_in_declarationSequence1348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal193_tree = (Object)adaptor.create(char_literal193);
					adaptor.addChild(root_0, char_literal193_tree);
					}

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:25: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal194=(Token)match(input,18,FOLLOW_18_in_formalParameters1363); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:29: ( fpSection ( ';' fpSection )* )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==IDENT||LA42_0==62) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:30: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters1366);
					fpSection195=fpSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fpSection195.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:40: ( ';' fpSection )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==29) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:41: ';' fpSection
							{
							char_literal196=(Token)match(input,29,FOLLOW_29_in_formalParameters1369); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal196_tree = (Object)adaptor.create(char_literal196);
							adaptor.addChild(root_0, char_literal196_tree);
							}

							pushFollow(FOLLOW_fpSection_in_formalParameters1371);
							fpSection197=fpSection();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, fpSection197.getTree());

							}
							break;

						default :
							break loop41;
						}
					}

					}
					break;

			}

			char_literal198=(Token)match(input,19,FOLLOW_19_in_formalParameters1377); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal198_tree = (Object)adaptor.create(char_literal198);
			adaptor.addChild(root_0, char_literal198_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:63: ( ':' qualident )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==27) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:64: ':' qualident
					{
					char_literal199=(Token)match(input,27,FOLLOW_27_in_formalParameters1380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal199_tree = (Object)adaptor.create(char_literal199);
					adaptor.addChild(root_0, char_literal199_tree);
					}

					pushFollow(FOLLOW_qualident_in_formalParameters1382);
					qualident200=qualident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident200.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:25: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:25: ( 'VAR' )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==62) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:25: 'VAR'
					{
					string_literal201=(Token)match(input,62,FOLLOW_62_in_fpSection1404); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);
					}

					}
					break;

			}

			IDENT202=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1407); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT202_tree = (Object)adaptor.create(IDENT202);
			adaptor.addChild(root_0, IDENT202_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:38: ( ',' IDENT )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==22) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:39: ',' IDENT
					{
					char_literal203=(Token)match(input,22,FOLLOW_22_in_fpSection1410); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal203_tree = (Object)adaptor.create(char_literal203);
					adaptor.addChild(root_0, char_literal203_tree);
					}

					IDENT204=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1412); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT204_tree = (Object)adaptor.create(IDENT204);
					adaptor.addChild(root_0, IDENT204_tree);
					}

					}
					break;

				default :
					break loop45;
				}
			}

			char_literal205=(Token)match(input,27,FOLLOW_27_in_fpSection1417); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal205_tree = (Object)adaptor.create(char_literal205);
			adaptor.addChild(root_0, char_literal205_tree);
			}

			pushFollow(FOLLOW_formalType_in_fpSection1419);
			formalType206=formalType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalType206.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:1: formalType : ( ( 'ARRAY OF' )* qualident | procedureType );
	public final OberonParser.formalType_return formalType() throws RecognitionException {
		OberonParser.formalType_return retval = new OberonParser.formalType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal207=null;
		ParserRuleReturnScope qualident208 =null;
		ParserRuleReturnScope procedureType209 =null;

		Object string_literal207_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:23: ( ( 'ARRAY OF' )* qualident | procedureType )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==IDENT||LA47_0==35) ) {
				alt47=1;
			}
			else if ( (LA47_0==56) ) {
				alt47=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:25: ( 'ARRAY OF' )* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:25: ( 'ARRAY OF' )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==35) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:26: 'ARRAY OF'
							{
							string_literal207=(Token)match(input,35,FOLLOW_35_in_formalType1439); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal207_tree = (Object)adaptor.create(string_literal207);
							adaptor.addChild(root_0, string_literal207_tree);
							}

							}
							break;

						default :
							break loop46;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType1443);
					qualident208=qualident();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident208.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:51: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType1447);
					procedureType209=procedureType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureType209.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:1: module : 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:23: ( 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:25: 'MODULE' IDENT ';' ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal210=(Token)match(input,51,FOLLOW_51_in_module1470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal210_tree = (Object)adaptor.create(string_literal210);
			adaptor.addChild(root_0, string_literal210_tree);
			}

			IDENT211=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT211_tree = (Object)adaptor.create(IDENT211);
			adaptor.addChild(root_0, IDENT211_tree);
			}

			char_literal212=(Token)match(input,29,FOLLOW_29_in_module1474); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal212_tree = (Object)adaptor.create(char_literal212);
			adaptor.addChild(root_0, char_literal212_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:44: ( importList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==46) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:44: importList
					{
					pushFollow(FOLLOW_importList_in_module1476);
					importList213=importList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importList213.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module1479);
			declarationSequence214=declarationSequence();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationSequence214.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:76: ( 'BEGIN' statementSequence )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==37) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:77: 'BEGIN' statementSequence
					{
					string_literal215=(Token)match(input,37,FOLLOW_37_in_module1482); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal215_tree = (Object)adaptor.create(string_literal215);
					adaptor.addChild(root_0, string_literal215_tree);
					}

					pushFollow(FOLLOW_statementSequence_in_module1484);
					statementSequence216=statementSequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence216.getTree());

					}
					break;

			}

			string_literal217=(Token)match(input,43,FOLLOW_43_in_module1488); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal217_tree = (Object)adaptor.create(string_literal217);
			adaptor.addChild(root_0, string_literal217_tree);
			}

			IDENT218=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1490); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT218_tree = (Object)adaptor.create(IDENT218);
			adaptor.addChild(root_0, IDENT218_tree);
			}

			char_literal219=(Token)match(input,24,FOLLOW_24_in_module1492); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal219_tree = (Object)adaptor.create(char_literal219);
			adaptor.addChild(root_0, char_literal219_tree);
			}

			EOF220=(Token)match(input,EOF,FOLLOW_EOF_in_module1494); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF220_tree = (Object)adaptor.create(EOF220);
			adaptor.addChild(root_0, EOF220_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:25: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal221=(Token)match(input,46,FOLLOW_46_in_importList1513); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal221_tree = (Object)adaptor.create(string_literal221);
			adaptor.addChild(root_0, string_literal221_tree);
			}

			pushFollow(FOLLOW_importDeclaration_in_importList1515);
			importDeclaration222=importDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration222.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:52: ( ',' importDeclaration )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==22) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:53: ',' importDeclaration
					{
					char_literal223=(Token)match(input,22,FOLLOW_22_in_importList1518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal223_tree = (Object)adaptor.create(char_literal223);
					adaptor.addChild(root_0, char_literal223_tree);
					}

					pushFollow(FOLLOW_importDeclaration_in_importList1520);
					importDeclaration224=importDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, importDeclaration224.getTree());

					}
					break;

				default :
					break loop50;
				}
			}

			char_literal225=(Token)match(input,29,FOLLOW_29_in_importList1524); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal225_tree = (Object)adaptor.create(char_literal225);
			adaptor.addChild(root_0, char_literal225_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:1: importDeclaration : IDENT ( ':=' IDENT )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:23: ( IDENT ( ':=' IDENT )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:26: IDENT ( ':=' IDENT )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT226=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1538); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT226_tree = (Object)adaptor.create(IDENT226);
			adaptor.addChild(root_0, IDENT226_tree);
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:32: ( ':=' IDENT )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==28) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:33: ':=' IDENT
					{
					string_literal227=(Token)match(input,28,FOLLOW_28_in_importDeclaration1541); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal227_tree = (Object)adaptor.create(string_literal227);
					adaptor.addChild(root_0, string_literal227_tree);
					}

					IDENT228=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT228_tree = (Object)adaptor.create(IDENT228);
					adaptor.addChild(root_0, IDENT228_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
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

	// $ANTLR start synpred1_Oberon
	public final void synpred1_Oberon_fragment() throws RecognitionException {
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:52: ( assignment )
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:52: assignment
		{
		pushFollow(FOLLOW_assignment_in_synpred1_Oberon871);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Oberon

	// $ANTLR start synpred2_Oberon
	public final void synpred2_Oberon_fragment() throws RecognitionException {
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:63: ( procedureCall )
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:63: procedureCall
		{
		pushFollow(FOLLOW_procedureCall_in_synpred2_Oberon873);
		procedureCall();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Oberon

	// Delegated rules

	public final boolean synpred2_Oberon() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Oberon_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Oberon() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Oberon_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_IDENT_in_qualident91 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_qualident93 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_qualident97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_identdef119 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_identdef121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration132 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_constantDeclaration134 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
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
	public static final BitSet FOLLOW_36_in_arrayType229 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_length_in_arrayType231 = new BitSet(new long[]{0x0020000000400000L});
	public static final BitSet FOLLOW_22_in_arrayType234 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
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
	public static final BitSet FOLLOW_qualident_in_designator463 = new BitSet(new long[]{0x0000000001040002L,0x000000000000000AL});
	public static final BitSet FOLLOW_24_in_designator466 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_designator468 = new BitSet(new long[]{0x0000000001040002L,0x000000000000000AL});
	public static final BitSet FOLLOW_65_in_designator472 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expList_in_designator474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_designator476 = new BitSet(new long[]{0x0000000001040002L,0x000000000000000AL});
	public static final BitSet FOLLOW_18_in_designator480 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_designator482 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_designator484 = new BitSet(new long[]{0x0000000001040002L,0x000000000000000AL});
	public static final BitSet FOLLOW_67_in_designator488 = new BitSet(new long[]{0x0000000001040002L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expList512 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_expList515 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_expList517 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression538 = new BitSet(new long[]{0x00018007C0010002L});
	public static final BitSet FOLLOW_relation_in_expression541 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_simpleExpression_in_expression543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression602 = new BitSet(new long[]{0x0040000000A00002L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression605 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000120L});
	public static final BitSet FOLLOW_term_in_simpleExpression607 = new BitSet(new long[]{0x0040000000A00002L});
	public static final BitSet FOLLOW_factor_in_term660 = new BitSet(new long[]{0x0004008004120002L});
	public static final BitSet FOLLOW_mulOperator_in_term663 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000120L});
	public static final BitSet FOLLOW_factor_in_term665 = new BitSet(new long[]{0x0004008004120002L});
	public static final BitSet FOLLOW_number_in_factor716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_factor728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor736 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_actualParameters_in_factor738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_factor743 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_factor745 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_factor747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_factor751 = new BitSet(new long[]{0x0010000000045620L,0x0000000000000120L});
	public static final BitSet FOLLOW_factor_in_factor753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_set779 = new BitSet(new long[]{0x0010000000A45620L,0x00000000000001A0L});
	public static final BitSet FOLLOW_element_in_set782 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000080L});
	public static final BitSet FOLLOW_22_in_set785 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_element_in_set787 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_set794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element816 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_element820 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_element822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_actualParameters837 = new BitSet(new long[]{0x0010000000AC5620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expList_in_actualParameters839 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_actualParameters842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_statement888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_statement892 = new BitSet(new long[]{0x0010000000A45622L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_statement894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_assignment917 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_assignment919 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_assignment921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_procedureCall937 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence952 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_statementSequence956 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statement_in_statementSequence958 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_45_in_ifStatement978 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_ifStatement980 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement982 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement984 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_42_in_ifStatement987 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_ifStatement989 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement991 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement993 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_41_in_ifStatement998 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1000 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ifStatement1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_caseStatement1020 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_caseStatement1022 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_caseStatement1024 = new BitSet(new long[]{0x00100A0000A45620L,0x0000000000000160L});
	public static final BitSet FOLLOW_casE_in_caseStatement1026 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_caseStatement1029 = new BitSet(new long[]{0x00100A0000A45620L,0x0000000000000160L});
	public static final BitSet FOLLOW_casE_in_caseStatement1031 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_41_in_caseStatement1036 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement1038 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_caseStatement1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE1068 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_casE1070 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_casE1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1090 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_caseLabelList1093 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1095 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1116 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_caseLabels1119 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_whileStatement1137 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_whileStatement1139 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_whileStatement1141 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement1143 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_whileStatement1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_repeatStatement1159 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement1161 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_repeatStatement1163 = new BitSet(new long[]{0x0010000000A45620L,0x0000000000000120L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_loopStatement1181 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement1183 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_loopStatement1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_withStatement1201 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_withStatement1203 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_withStatement1205 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_withStatement1207 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_withStatement1209 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_withStatement1211 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_withStatement1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1222 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_procedureDeclaration1224 = new BitSet(new long[]{0x4380087000000200L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1226 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedureHeading1241 = new BitSet(new long[]{0x0000000000100200L});
	public static final BitSet FOLLOW_20_in_procedureHeading1243 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading1246 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody1265 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_procedureBody1268 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody1270 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_procedureBody1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_forwardDeclaration1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_forwardDeclaration1287 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration1288 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_declarationSequence1303 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_constantDeclaration_in_declarationSequence1306 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1308 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_type_in_declarationSequence1315 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_typeDeclaration_in_declarationSequence1319 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1321 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_62_in_declarationSequence1327 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_variableDeclaration_in_declarationSequence1330 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1332 = new BitSet(new long[]{0x4380005000000202L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence1340 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1342 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence1346 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarationSequence1348 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_18_in_formalParameters1363 = new BitSet(new long[]{0x4000000000080200L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1366 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_29_in_formalParameters1369 = new BitSet(new long[]{0x4000000000000200L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1371 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_19_in_formalParameters1377 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_formalParameters1380 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_qualident_in_formalParameters1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_fpSection1404 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1407 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_22_in_fpSection1410 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1412 = new BitSet(new long[]{0x0000000008400000L});
	public static final BitSet FOLLOW_27_in_fpSection1417 = new BitSet(new long[]{0x0100000800000200L});
	public static final BitSet FOLLOW_formalType_in_fpSection1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_formalType1439 = new BitSet(new long[]{0x0000000800000200L});
	public static final BitSet FOLLOW_qualident_in_formalType1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_module1470 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_module1472 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_module1474 = new BitSet(new long[]{0x4380487000000200L});
	public static final BitSet FOLLOW_importList_in_module1476 = new BitSet(new long[]{0x4380087000000200L});
	public static final BitSet FOLLOW_declarationSequence_in_module1479 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_module1482 = new BitSet(new long[]{0x8C02300020000200L,0x0000000000000011L});
	public static final BitSet FOLLOW_statementSequence_in_module1484 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_module1488 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_module1490 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_module1492 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_importList1513 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1515 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_22_in_importList1518 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1520 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_29_in_importList1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1538 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_importDeclaration1541 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_synpred1_Oberon871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_synpred2_Oberon873 = new BitSet(new long[]{0x0000000000000002L});
}
