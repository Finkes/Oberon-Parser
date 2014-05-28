// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-28 10:02:07
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CHARACTER", "CHARCONST", 
		"COMMENT", "DIGIT", "HEX_DIGIT", "IDENT", "INTEGER", "LETTER", "REAL", 
		"SCALE_FACTOR", "STRING", "WS", "'#'", "'&'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'..'", "'/'", "':'", "':='", "';'", "'<'", "'<='", 
		"'='", "'>'", "'>='", "'ARRAY'", "'BEGIN'", "'CONST'", "'DIV'", "'DO'", 
		"'ELSE'", "'ELSIF'", "'END'", "'EXIT'", "'IF'", "'IMPORT'", "'IN'", "'IS'", 
		"'LOOP'", "'MOD'", "'MODULE'", "'NIL'", "'OF'", "'OR'", "'POINTER TO'", 
		"'PROCEDURE'", "'RECORD'", "'REPEAT'", "'RETURN'", "'THEN'", "'TYPE'", 
		"'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", "'['", "']'", "'^'", "'case'", 
		"'{'", "'|'", "'}'", "'~'"
	};
	public static final int EOF=-1;
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
	public static final int ASSIGN=4;
	public static final int CHARACTER=5;
	public static final int CHARCONST=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int HEX_DIGIT=9;
	public static final int IDENT=10;
	public static final int INTEGER=11;
	public static final int LETTER=12;
	public static final int REAL=13;
	public static final int SCALE_FACTOR=14;
	public static final int STRING=15;
	public static final int WS=16;

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:1: number : ( INTEGER | REAL );
	public final OberonParser.number_return number() throws RecognitionException {
		OberonParser.number_return retval = new OberonParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;

		Object set1_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:23: ( INTEGER | REAL )
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


	public static class identdef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identdef"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:1: identdef : IDENT ( '*' )? ;
	public final OberonParser.identdef_return identdef() throws RecognitionException {
		OberonParser.identdef_return retval = new OberonParser.identdef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT2=null;
		Token char_literal3=null;

		Object IDENT2_tree=null;
		Object char_literal3_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:23: ( IDENT ( '*' )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:25: IDENT ( '*' )?
			{
			root_0 = (Object)adaptor.nil();


			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identdef99); 
			IDENT2_tree = (Object)adaptor.create(IDENT2);
			adaptor.addChild(root_0, IDENT2_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:31: ( '*' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==21) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:31: '*'
					{
					char_literal3=(Token)match(input,21,FOLLOW_21_in_identdef101); 
					char_literal3_tree = (Object)adaptor.create(char_literal3);
					adaptor.addChild(root_0, char_literal3_tree);

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:1: constantDeclaration : identdef '=' constExpression -> ^( '=' identdef constExpression ) ;
	public final OberonParser.constantDeclaration_return constantDeclaration() throws RecognitionException {
		OberonParser.constantDeclaration_return retval = new OberonParser.constantDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal5=null;
		ParserRuleReturnScope identdef4 =null;
		ParserRuleReturnScope constExpression6 =null;

		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:23: ( identdef '=' constExpression -> ^( '=' identdef constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:25: identdef '=' constExpression
			{
			pushFollow(FOLLOW_identdef_in_constantDeclaration112);
			identdef4=identdef();
			state._fsp--;

			stream_identdef.add(identdef4.getTree());
			char_literal5=(Token)match(input,33,FOLLOW_33_in_constantDeclaration114);  
			stream_33.add(char_literal5);

			pushFollow(FOLLOW_constExpression_in_constantDeclaration116);
			constExpression6=constExpression();
			state._fsp--;

			stream_constExpression.add(constExpression6.getTree());
			// AST REWRITE
			// elements: constExpression, 33, identdef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 21:59: -> ^( '=' identdef constExpression )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:62: ^( '=' identdef constExpression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:1: constExpression : expression ;
	public final OberonParser.constExpression_return constExpression() throws RecognitionException {
		OberonParser.constExpression_return retval = new OberonParser.constExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression7 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:23: ( expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:25: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_constExpression146);
			expression7=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression7.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:1: typeDeclaration : identdef '=' type -> ^( '=' identdef type ) ;
	public final OberonParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		OberonParser.typeDeclaration_return retval = new OberonParser.typeDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		ParserRuleReturnScope identdef8 =null;
		ParserRuleReturnScope type10 =null;

		Object char_literal9_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_identdef=new RewriteRuleSubtreeStream(adaptor,"rule identdef");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:23: ( identdef '=' type -> ^( '=' identdef type ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:25: identdef '=' type
			{
			pushFollow(FOLLOW_identdef_in_typeDeclaration160);
			identdef8=identdef();
			state._fsp--;

			stream_identdef.add(identdef8.getTree());
			char_literal9=(Token)match(input,33,FOLLOW_33_in_typeDeclaration162);  
			stream_33.add(char_literal9);

			pushFollow(FOLLOW_type_in_typeDeclaration164);
			type10=type();
			state._fsp--;

			stream_type.add(type10.getTree());
			// AST REWRITE
			// elements: identdef, type, 33
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:59: -> ^( '=' identdef type )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:62: ^( '=' identdef type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:1: type : ( qualident | arrayType | recordType | pointerType | procedureType );
	public final OberonParser.type_return type() throws RecognitionException {
		OberonParser.type_return retval = new OberonParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident11 =null;
		ParserRuleReturnScope arrayType12 =null;
		ParserRuleReturnScope recordType13 =null;
		ParserRuleReturnScope pointerType14 =null;
		ParserRuleReturnScope procedureType15 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:23: ( qualident | arrayType | recordType | pointerType | procedureType )
			int alt2=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt2=1;
				}
				break;
			case 36:
				{
				alt2=2;
				}
				break;
			case 57:
				{
				alt2=3;
				}
				break;
			case 55:
				{
				alt2=4;
				}
				break;
			case 56:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:25: qualident
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualident_in_type216);
					qualident11=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident11.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:37: arrayType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type220);
					arrayType12=arrayType();
					state._fsp--;

					adaptor.addChild(root_0, arrayType12.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:49: recordType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type224);
					recordType13=recordType();
					state._fsp--;

					adaptor.addChild(root_0, recordType13.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:62: pointerType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pointerType_in_type228);
					pointerType14=pointerType();
					state._fsp--;

					adaptor.addChild(root_0, pointerType14.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:76: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_type232);
					procedureType15=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType15.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:1: arrayType : 'ARRAY' length ( ',' length )* 'OF' type ;
	public final OberonParser.arrayType_return arrayType() throws RecognitionException {
		OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token char_literal18=null;
		Token string_literal20=null;
		ParserRuleReturnScope length17 =null;
		ParserRuleReturnScope length19 =null;
		ParserRuleReturnScope type21 =null;

		Object string_literal16_tree=null;
		Object char_literal18_tree=null;
		Object string_literal20_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:23: ( 'ARRAY' length ( ',' length )* 'OF' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:25: 'ARRAY' length ( ',' length )* 'OF' type
			{
			root_0 = (Object)adaptor.nil();


			string_literal16=(Token)match(input,36,FOLLOW_36_in_arrayType252); 
			string_literal16_tree = (Object)adaptor.create(string_literal16);
			adaptor.addChild(root_0, string_literal16_tree);

			pushFollow(FOLLOW_length_in_arrayType254);
			length17=length();
			state._fsp--;

			adaptor.addChild(root_0, length17.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:40: ( ',' length )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:41: ',' length
					{
					char_literal18=(Token)match(input,23,FOLLOW_23_in_arrayType257); 
					char_literal18_tree = (Object)adaptor.create(char_literal18);
					adaptor.addChild(root_0, char_literal18_tree);

					pushFollow(FOLLOW_length_in_arrayType259);
					length19=length();
					state._fsp--;

					adaptor.addChild(root_0, length19.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			string_literal20=(Token)match(input,53,FOLLOW_53_in_arrayType263); 
			string_literal20_tree = (Object)adaptor.create(string_literal20);
			adaptor.addChild(root_0, string_literal20_tree);

			pushFollow(FOLLOW_type_in_arrayType265);
			type21=type();
			state._fsp--;

			adaptor.addChild(root_0, type21.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:1: length : constExpression ;
	public final OberonParser.length_return length() throws RecognitionException {
		OberonParser.length_return retval = new OberonParser.length_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope constExpression22 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:23: ( constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:25: constExpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_length288);
			constExpression22=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression22.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:1: recordType : 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' ;
	public final OberonParser.recordType_return recordType() throws RecognitionException {
		OberonParser.recordType_return retval = new OberonParser.recordType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token char_literal24=null;
		Token char_literal26=null;
		Token string_literal28=null;
		ParserRuleReturnScope baseType25 =null;
		ParserRuleReturnScope fieldListSequence27 =null;

		Object string_literal23_tree=null;
		Object char_literal24_tree=null;
		Object char_literal26_tree=null;
		Object string_literal28_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:23: ( 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:25: 'RECORD' ( '(' baseType ')' )? fieldListSequence 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(Token)match(input,57,FOLLOW_57_in_recordType307); 
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			adaptor.addChild(root_0, string_literal23_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:34: ( '(' baseType ')' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==19) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:35: '(' baseType ')'
					{
					char_literal24=(Token)match(input,19,FOLLOW_19_in_recordType310); 
					char_literal24_tree = (Object)adaptor.create(char_literal24);
					adaptor.addChild(root_0, char_literal24_tree);

					pushFollow(FOLLOW_baseType_in_recordType312);
					baseType25=baseType();
					state._fsp--;

					adaptor.addChild(root_0, baseType25.getTree());

					char_literal26=(Token)match(input,20,FOLLOW_20_in_recordType314); 
					char_literal26_tree = (Object)adaptor.create(char_literal26);
					adaptor.addChild(root_0, char_literal26_tree);

					}
					break;

			}

			pushFollow(FOLLOW_fieldListSequence_in_recordType318);
			fieldListSequence27=fieldListSequence();
			state._fsp--;

			adaptor.addChild(root_0, fieldListSequence27.getTree());

			string_literal28=(Token)match(input,43,FOLLOW_43_in_recordType320); 
			string_literal28_tree = (Object)adaptor.create(string_literal28);
			adaptor.addChild(root_0, string_literal28_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:1: baseType : qualident ;
	public final OberonParser.baseType_return baseType() throws RecognitionException {
		OberonParser.baseType_return retval = new OberonParser.baseType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope qualident29 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:23: ( qualident )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:25: qualident
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_baseType341);
			qualident29=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident29.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:1: fieldListSequence : fieldList ( ';' fieldList )* ;
	public final OberonParser.fieldListSequence_return fieldListSequence() throws RecognitionException {
		OberonParser.fieldListSequence_return retval = new OberonParser.fieldListSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		ParserRuleReturnScope fieldList30 =null;
		ParserRuleReturnScope fieldList32 =null;

		Object char_literal31_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:23: ( fieldList ( ';' fieldList )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:25: fieldList ( ';' fieldList )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fieldList_in_fieldListSequence353);
			fieldList30=fieldList();
			state._fsp--;

			adaptor.addChild(root_0, fieldList30.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:35: ( ';' fieldList )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==30) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:36: ';' fieldList
					{
					char_literal31=(Token)match(input,30,FOLLOW_30_in_fieldListSequence356); 
					char_literal31_tree = (Object)adaptor.create(char_literal31);
					adaptor.addChild(root_0, char_literal31_tree);

					pushFollow(FOLLOW_fieldList_in_fieldListSequence358);
					fieldList32=fieldList();
					state._fsp--;

					adaptor.addChild(root_0, fieldList32.getTree());

					}
					break;

				default :
					break loop5;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:1: fieldList : ( identList ':' type )? ;
	public final OberonParser.fieldList_return fieldList() throws RecognitionException {
		OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal34=null;
		ParserRuleReturnScope identList33 =null;
		ParserRuleReturnScope type35 =null;

		Object char_literal34_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:23: ( ( identList ':' type )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:25: ( identList ':' type )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:25: ( identList ':' type )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:26: identList ':' type
					{
					pushFollow(FOLLOW_identList_in_fieldList381);
					identList33=identList();
					state._fsp--;

					adaptor.addChild(root_0, identList33.getTree());

					char_literal34=(Token)match(input,28,FOLLOW_28_in_fieldList383); 
					char_literal34_tree = (Object)adaptor.create(char_literal34);
					adaptor.addChild(root_0, char_literal34_tree);

					pushFollow(FOLLOW_type_in_fieldList385);
					type35=type();
					state._fsp--;

					adaptor.addChild(root_0, type35.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:1: identList : identdef ( ',' identdef )* ;
	public final OberonParser.identList_return identList() throws RecognitionException {
		OberonParser.identList_return retval = new OberonParser.identList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal37=null;
		ParserRuleReturnScope identdef36 =null;
		ParserRuleReturnScope identdef38 =null;

		Object char_literal37_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:23: ( identdef ( ',' identdef )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:25: identdef ( ',' identdef )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identdef_in_identList407);
			identdef36=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef36.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:34: ( ',' identdef )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:35: ',' identdef
					{
					char_literal37=(Token)match(input,23,FOLLOW_23_in_identList410); 
					char_literal37_tree = (Object)adaptor.create(char_literal37);
					adaptor.addChild(root_0, char_literal37_tree);

					pushFollow(FOLLOW_identdef_in_identList412);
					identdef38=identdef();
					state._fsp--;

					adaptor.addChild(root_0, identdef38.getTree());

					}
					break;

				default :
					break loop7;
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:1: pointerType : 'POINTER TO' ^ type ;
	public final OberonParser.pointerType_return pointerType() throws RecognitionException {
		OberonParser.pointerType_return retval = new OberonParser.pointerType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		ParserRuleReturnScope type40 =null;

		Object string_literal39_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:23: ( 'POINTER TO' ^ type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:25: 'POINTER TO' ^ type
			{
			root_0 = (Object)adaptor.nil();


			string_literal39=(Token)match(input,55,FOLLOW_55_in_pointerType432); 
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			root_0 = (Object)adaptor.becomeRoot(string_literal39_tree, root_0);

			pushFollow(FOLLOW_type_in_pointerType435);
			type40=type();
			state._fsp--;

			adaptor.addChild(root_0, type40.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:1: procedureType : 'PROCEDURE' ( formalParameters )? ;
	public final OberonParser.procedureType_return procedureType() throws RecognitionException {
		OberonParser.procedureType_return retval = new OberonParser.procedureType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		ParserRuleReturnScope formalParameters42 =null;

		Object string_literal41_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:23: ( 'PROCEDURE' ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:25: 'PROCEDURE' ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal41=(Token)match(input,56,FOLLOW_56_in_procedureType451); 
			string_literal41_tree = (Object)adaptor.create(string_literal41);
			adaptor.addChild(root_0, string_literal41_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:37: ( formalParameters )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==19) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:37: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureType453);
					formalParameters42=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters42.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:1: variableDeclaration : identList ':' type ;
	public final OberonParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		OberonParser.variableDeclaration_return retval = new OberonParser.variableDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal44=null;
		ParserRuleReturnScope identList43 =null;
		ParserRuleReturnScope type45 =null;

		Object char_literal44_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:23: ( identList ':' type )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:25: identList ':' type
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_identList_in_variableDeclaration464);
			identList43=identList();
			state._fsp--;

			adaptor.addChild(root_0, identList43.getTree());

			char_literal44=(Token)match(input,28,FOLLOW_28_in_variableDeclaration466); 
			char_literal44_tree = (Object)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);

			pushFollow(FOLLOW_type_in_variableDeclaration468);
			type45=type();
			state._fsp--;

			adaptor.addChild(root_0, type45.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:1: qualident : ( options {greedy=true; } : IDENT '.' )? IDENT ;
	public final OberonParser.qualident_return qualident() throws RecognitionException {
		OberonParser.qualident_return retval = new OberonParser.qualident_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT46=null;
		Token char_literal47=null;
		Token IDENT48=null;

		Object IDENT46_tree=null;
		Object char_literal47_tree=null;
		Object IDENT48_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:23: ( ( options {greedy=true; } : IDENT '.' )? IDENT )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:25: ( options {greedy=true; } : IDENT '.' )? IDENT
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:25: ( options {greedy=true; } : IDENT '.' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENT) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==25) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==IDENT) ) {
						alt9=1;
					}
				}
			}
			switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:49: IDENT '.'
					{
					IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident497); 
					IDENT46_tree = (Object)adaptor.create(IDENT46);
					adaptor.addChild(root_0, IDENT46_tree);

					char_literal47=(Token)match(input,25,FOLLOW_25_in_qualident499); 
					char_literal47_tree = (Object)adaptor.create(char_literal47);
					adaptor.addChild(root_0, char_literal47_tree);

					}
					break;

			}

			IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualident503); 
			IDENT48_tree = (Object)adaptor.create(IDENT48);
			adaptor.addChild(root_0, IDENT48_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:1: designator : qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )* ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:23: ( qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:25: qualident ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_qualident_in_designator523);
			qualident49=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident49.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:35: ( '.' IDENT | '[' expList ']' | '(' qualident ')' | '^' )*
			loop10:
			while (true) {
				int alt10=5;
				switch ( input.LA(1) ) {
				case 19:
					{
					int LA10_1 = input.LA(2);
					if ( (LA10_1==IDENT) ) {
						int LA10_6 = input.LA(3);
						if ( (LA10_6==25) ) {
							int LA10_7 = input.LA(4);
							if ( (LA10_7==IDENT) ) {
								int LA10_9 = input.LA(5);
								if ( (LA10_9==20) ) {
									alt10=3;
								}

							}

						}
						else if ( (LA10_6==20) ) {
							alt10=3;
						}

					}

					}
					break;
				case 25:
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:36: '.' IDENT
					{
					char_literal50=(Token)match(input,25,FOLLOW_25_in_designator526); 
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);

					IDENT51=(Token)match(input,IDENT,FOLLOW_IDENT_in_designator528); 
					IDENT51_tree = (Object)adaptor.create(IDENT51);
					adaptor.addChild(root_0, IDENT51_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:48: '[' expList ']'
					{
					char_literal52=(Token)match(input,66,FOLLOW_66_in_designator532); 
					char_literal52_tree = (Object)adaptor.create(char_literal52);
					adaptor.addChild(root_0, char_literal52_tree);

					pushFollow(FOLLOW_expList_in_designator534);
					expList53=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList53.getTree());

					char_literal54=(Token)match(input,67,FOLLOW_67_in_designator536); 
					char_literal54_tree = (Object)adaptor.create(char_literal54);
					adaptor.addChild(root_0, char_literal54_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:66: '(' qualident ')'
					{
					char_literal55=(Token)match(input,19,FOLLOW_19_in_designator540); 
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);

					pushFollow(FOLLOW_qualident_in_designator542);
					qualident56=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident56.getTree());

					char_literal57=(Token)match(input,20,FOLLOW_20_in_designator544); 
					char_literal57_tree = (Object)adaptor.create(char_literal57);
					adaptor.addChild(root_0, char_literal57_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:86: '^'
					{
					char_literal58=(Token)match(input,68,FOLLOW_68_in_designator548); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:1: expList : expression ( ',' expression )* ;
	public final OberonParser.expList_return expList() throws RecognitionException {
		OberonParser.expList_return retval = new OberonParser.expList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal60=null;
		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope expression61 =null;

		Object char_literal60_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:23: ( expression ( ',' expression )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:25: expression ( ',' expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expList572);
			expression59=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression59.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:36: ( ',' expression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==23) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:37: ',' expression
					{
					char_literal60=(Token)match(input,23,FOLLOW_23_in_expList575); 
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);

					pushFollow(FOLLOW_expression_in_expList577);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:1: expression : simpleExpression ( relation ^ simpleExpression )? ;
	public final OberonParser.expression_return expression() throws RecognitionException {
		OberonParser.expression_return retval = new OberonParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleExpression62 =null;
		ParserRuleReturnScope relation63 =null;
		ParserRuleReturnScope simpleExpression64 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:23: ( simpleExpression ( relation ^ simpleExpression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:25: simpleExpression ( relation ^ simpleExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleExpression_in_expression598);
			simpleExpression62=simpleExpression();
			state._fsp--;

			adaptor.addChild(root_0, simpleExpression62.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:42: ( relation ^ simpleExpression )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==17||(LA12_0 >= 31 && LA12_0 <= 35)||(LA12_0 >= 47 && LA12_0 <= 48)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:43: relation ^ simpleExpression
					{
					pushFollow(FOLLOW_relation_in_expression601);
					relation63=relation();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(relation63.getTree(), root_0);
					pushFollow(FOLLOW_simpleExpression_in_expression604);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:1: relation : ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' );
	public final OberonParser.relation_return relation() throws RecognitionException {
		OberonParser.relation_return retval = new OberonParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set65=null;

		Object set65_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:23: ( '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set65=input.LT(1);
			if ( input.LA(1)==17||(input.LA(1) >= 31 && input.LA(1) <= 35)||(input.LA(1) >= 47 && input.LA(1) <= 48) ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:1: simpleExpression : ( '+' | '-' )? term ( addOperator term )* ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:23: ( ( '+' | '-' )? term ( addOperator term )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:25: ( '+' | '-' )? term ( addOperator term )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:25: ( '+' | '-' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==22||LA13_0==24) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					set66=input.LT(1);
					if ( input.LA(1)==22||input.LA(1)==24 ) {
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

			pushFollow(FOLLOW_term_in_simpleExpression663);
			term67=term();
			state._fsp--;

			adaptor.addChild(root_0, term67.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:41: ( addOperator term )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==22||LA14_0==24||LA14_0==54) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:42: addOperator term
					{
					pushFollow(FOLLOW_addOperator_in_simpleExpression666);
					addOperator68=addOperator();
					state._fsp--;

					adaptor.addChild(root_0, addOperator68.getTree());

					pushFollow(FOLLOW_term_in_simpleExpression668);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:1: addOperator : ( '+' | '-' | 'OR' );
	public final OberonParser.addOperator_return addOperator() throws RecognitionException {
		OberonParser.addOperator_return retval = new OberonParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set70=null;

		Object set70_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:23: ( '+' | '-' | 'OR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set70=input.LT(1);
			if ( input.LA(1)==22||input.LA(1)==24||input.LA(1)==54 ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:1: term : factor ( mulOperator factor )* ;
	public final OberonParser.term_return term() throws RecognitionException {
		OberonParser.term_return retval = new OberonParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor71 =null;
		ParserRuleReturnScope mulOperator72 =null;
		ParserRuleReturnScope factor73 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:23: ( factor ( mulOperator factor )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:25: factor ( mulOperator factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term721);
			factor71=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor71.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:32: ( mulOperator factor )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==18||LA15_0==21||LA15_0==27||LA15_0==39||LA15_0==50) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:33: mulOperator factor
					{
					pushFollow(FOLLOW_mulOperator_in_term724);
					mulOperator72=mulOperator();
					state._fsp--;

					adaptor.addChild(root_0, mulOperator72.getTree());

					pushFollow(FOLLOW_factor_in_term726);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:1: mulOperator : ( '*' | '/' | 'DIV' | 'MOD' | '&' );
	public final OberonParser.mulOperator_return mulOperator() throws RecognitionException {
		OberonParser.mulOperator_return retval = new OberonParser.mulOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74=null;

		Object set74_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:23: ( '*' | '/' | 'DIV' | 'MOD' | '&' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			root_0 = (Object)adaptor.nil();


			set74=input.LT(1);
			if ( input.LA(1)==18||input.LA(1)==21||input.LA(1)==27||input.LA(1)==39||input.LA(1)==50 ) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:1: factor : ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' expression ')' | '~' factor );
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:23: ( number | CHARCONST | STRING | 'NIL' | set | designator ( actualParameters )? | '(' expression ')' | '~' factor )
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
			case 19:
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:25: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_factor777);
					number75=number();
					state._fsp--;

					adaptor.addChild(root_0, number75.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:34: CHARCONST
					{
					root_0 = (Object)adaptor.nil();


					CHARCONST76=(Token)match(input,CHARCONST,FOLLOW_CHARCONST_in_factor781); 
					CHARCONST76_tree = (Object)adaptor.create(CHARCONST76);
					adaptor.addChild(root_0, CHARCONST76_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:46: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING77=(Token)match(input,STRING,FOLLOW_STRING_in_factor785); 
					STRING77_tree = (Object)adaptor.create(STRING77);
					adaptor.addChild(root_0, STRING77_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:55: 'NIL'
					{
					root_0 = (Object)adaptor.nil();


					string_literal78=(Token)match(input,52,FOLLOW_52_in_factor789); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:63: set
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_set_in_factor793);
					set79=set();
					state._fsp--;

					adaptor.addChild(root_0, set79.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:69: designator ( actualParameters )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_designator_in_factor797);
					designator80=designator();
					state._fsp--;

					adaptor.addChild(root_0, designator80.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:80: ( actualParameters )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==19) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:80: actualParameters
							{
							pushFollow(FOLLOW_actualParameters_in_factor799);
							actualParameters81=actualParameters();
							state._fsp--;

							adaptor.addChild(root_0, actualParameters81.getTree());

							}
							break;

					}

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:100: '(' expression ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal82=(Token)match(input,19,FOLLOW_19_in_factor804); 
					char_literal82_tree = (Object)adaptor.create(char_literal82);
					adaptor.addChild(root_0, char_literal82_tree);

					pushFollow(FOLLOW_expression_in_factor806);
					expression83=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression83.getTree());

					char_literal84=(Token)match(input,20,FOLLOW_20_in_factor808); 
					char_literal84_tree = (Object)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:67:121: '~' factor
					{
					root_0 = (Object)adaptor.nil();


					char_literal85=(Token)match(input,73,FOLLOW_73_in_factor812); 
					char_literal85_tree = (Object)adaptor.create(char_literal85);
					adaptor.addChild(root_0, char_literal85_tree);

					pushFollow(FOLLOW_factor_in_factor814);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:1: set : '{' ( element ( ',' element )* )? '}' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:23: ( '{' ( element ( ',' element )* )? '}' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:25: '{' ( element ( ',' element )* )? '}'
			{
			root_0 = (Object)adaptor.nil();


			char_literal87=(Token)match(input,70,FOLLOW_70_in_set840); 
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:29: ( element ( ',' element )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHARCONST||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||LA19_0==REAL||LA19_0==STRING||LA19_0==19||LA19_0==22||LA19_0==24||LA19_0==52||LA19_0==70||LA19_0==73) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:30: element ( ',' element )*
					{
					pushFollow(FOLLOW_element_in_set843);
					element88=element();
					state._fsp--;

					adaptor.addChild(root_0, element88.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:38: ( ',' element )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==23) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:69:39: ',' element
							{
							char_literal89=(Token)match(input,23,FOLLOW_23_in_set846); 
							char_literal89_tree = (Object)adaptor.create(char_literal89);
							adaptor.addChild(root_0, char_literal89_tree);

							pushFollow(FOLLOW_element_in_set848);
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

			char_literal91=(Token)match(input,72,FOLLOW_72_in_set855); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:1: element : expression ( '..' expression )? ;
	public final OberonParser.element_return element() throws RecognitionException {
		OberonParser.element_return retval = new OberonParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal93=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope expression94 =null;

		Object string_literal93_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:23: ( expression ( '..' expression )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:25: expression ( '..' expression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_element877);
			expression92=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression92.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:36: ( '..' expression )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==26) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:71:38: '..' expression
					{
					string_literal93=(Token)match(input,26,FOLLOW_26_in_element881); 
					string_literal93_tree = (Object)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);

					pushFollow(FOLLOW_expression_in_element883);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:1: actualParameters : '(' ( expList )? ')' ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:23: ( '(' ( expList )? ')' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:25: '(' ( expList )? ')'
			{
			root_0 = (Object)adaptor.nil();


			char_literal95=(Token)match(input,19,FOLLOW_19_in_actualParameters898); 
			char_literal95_tree = (Object)adaptor.create(char_literal95);
			adaptor.addChild(root_0, char_literal95_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:29: ( expList )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CHARCONST||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||LA21_0==REAL||LA21_0==STRING||LA21_0==19||LA21_0==22||LA21_0==24||LA21_0==52||LA21_0==70||LA21_0==73) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:73:29: expList
					{
					pushFollow(FOLLOW_expList_in_actualParameters900);
					expList96=expList();
					state._fsp--;

					adaptor.addChild(root_0, expList96.getTree());

					}
					break;

			}

			char_literal97=(Token)match(input,20,FOLLOW_20_in_actualParameters903); 
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:1: statement : ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:23: ( ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:26: ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:26: ( statement2 | ifStatement | caseStatement | whileStatement | repeatStatement | loopStatement | withStatement | 'EXIT' | 'RETURN' ( expression )? )?
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:27: statement2
					{
					pushFollow(FOLLOW_statement2_in_statement925);
					statement298=statement2();
					state._fsp--;

					adaptor.addChild(root_0, statement298.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:38: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement927);
					ifStatement99=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement99.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:50: caseStatement
					{
					pushFollow(FOLLOW_caseStatement_in_statement929);
					caseStatement100=caseStatement();
					state._fsp--;

					adaptor.addChild(root_0, caseStatement100.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:64: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement931);
					whileStatement101=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement101.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:79: repeatStatement
					{
					pushFollow(FOLLOW_repeatStatement_in_statement933);
					repeatStatement102=repeatStatement();
					state._fsp--;

					adaptor.addChild(root_0, repeatStatement102.getTree());

					}
					break;
				case 6 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:95: loopStatement
					{
					pushFollow(FOLLOW_loopStatement_in_statement935);
					loopStatement103=loopStatement();
					state._fsp--;

					adaptor.addChild(root_0, loopStatement103.getTree());

					}
					break;
				case 7 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:109: withStatement
					{
					pushFollow(FOLLOW_withStatement_in_statement937);
					withStatement104=withStatement();
					state._fsp--;

					adaptor.addChild(root_0, withStatement104.getTree());

					}
					break;
				case 8 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:124: 'EXIT'
					{
					string_literal105=(Token)match(input,44,FOLLOW_44_in_statement940); 
					string_literal105_tree = (Object)adaptor.create(string_literal105);
					adaptor.addChild(root_0, string_literal105_tree);

					}
					break;
				case 9 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:133: 'RETURN' ( expression )?
					{
					string_literal106=(Token)match(input,59,FOLLOW_59_in_statement944); 
					string_literal106_tree = (Object)adaptor.create(string_literal106);
					adaptor.addChild(root_0, string_literal106_tree);

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:142: ( expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==CHARCONST||(LA22_0 >= IDENT && LA22_0 <= INTEGER)||LA22_0==REAL||LA22_0==STRING||LA22_0==19||LA22_0==22||LA22_0==24||LA22_0==52||LA22_0==70||LA22_0==73) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:75:142: expression
							{
							pushFollow(FOLLOW_expression_in_statement946);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:1: statement2 : aaaa= designator (aaaa= assignment |b= procedureCall ) ;
	public final OberonParser.statement2_return statement2() throws RecognitionException {
		OberonParser.statement2_return retval = new OberonParser.statement2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope aaaa =null;
		ParserRuleReturnScope b =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:23: (aaaa= designator (aaaa= assignment |b= procedureCall ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:25: aaaa= designator (aaaa= assignment |b= procedureCall )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_designator_in_statement2971);
			aaaa=designator();
			state._fsp--;

			adaptor.addChild(root_0, aaaa.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:41: (aaaa= assignment |b= procedureCall )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==29) ) {
				alt24=1;
			}
			else if ( (LA24_0==19||LA24_0==30||(LA24_0 >= 41 && LA24_0 <= 43)||LA24_0==62||LA24_0==71) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:43: aaaa= assignment
					{
					pushFollow(FOLLOW_assignment_in_statement2977);
					aaaa=assignment();
					state._fsp--;

					adaptor.addChild(root_0, aaaa.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:77:61: b= procedureCall
					{
					pushFollow(FOLLOW_procedureCall_in_statement2983);
					b=procedureCall();
					state._fsp--;

					adaptor.addChild(root_0, b.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:1: assignment : ':=' expression -> ^( ASSIGN ':=' expression ) ;
	public final OberonParser.assignment_return assignment() throws RecognitionException {
		OberonParser.assignment_return retval = new OberonParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal108=null;
		ParserRuleReturnScope expression109 =null;

		Object string_literal108_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:23: ( ':=' expression -> ^( ASSIGN ':=' expression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:26: ':=' expression
			{
			string_literal108=(Token)match(input,29,FOLLOW_29_in_assignment1006);  
			stream_29.add(string_literal108);

			pushFollow(FOLLOW_expression_in_assignment1008);
			expression109=expression();
			state._fsp--;

			stream_expression.add(expression109.getTree());
			// AST REWRITE
			// elements: 29, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:42: -> ^( ASSIGN ':=' expression )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:79:45: ^( ASSIGN ':=' expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_29.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
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
	// $ANTLR end "assignment"


	public static class procedureCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procedureCall"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:1: procedureCall : ( actualParameters )? ;
	public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
		OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actualParameters110 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:23: ( ( actualParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:26: ( actualParameters )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:26: ( actualParameters )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==19) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:81:26: actualParameters
					{
					pushFollow(FOLLOW_actualParameters_in_procedureCall1036);
					actualParameters110=actualParameters();
					state._fsp--;

					adaptor.addChild(root_0, actualParameters110.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:1: statementSequence : statement ( ';' statement )* -> ^( statement ( statement )* ) ;
	public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
		OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope statement111 =null;
		ParserRuleReturnScope statement113 =null;

		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:23: ( statement ( ';' statement )* -> ^( statement ( statement )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:25: statement ( ';' statement )*
			{
			pushFollow(FOLLOW_statement_in_statementSequence1049);
			statement111=statement();
			state._fsp--;

			stream_statement.add(statement111.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:35: ( ';' statement )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==30) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:37: ';' statement
					{
					char_literal112=(Token)match(input,30,FOLLOW_30_in_statementSequence1053);  
					stream_30.add(char_literal112);

					pushFollow(FOLLOW_statement_in_statementSequence1055);
					statement113=statement();
					state._fsp--;

					stream_statement.add(statement113.getTree());
					}
					break;

				default :
					break loop26;
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
			// 83:53: -> ^( statement ( statement )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:56: ^( statement ( statement )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_statement.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:83:68: ( statement )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
	public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
		OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal114=null;
		Token string_literal116=null;
		Token string_literal118=null;
		Token string_literal120=null;
		Token string_literal122=null;
		Token string_literal124=null;
		ParserRuleReturnScope expression115 =null;
		ParserRuleReturnScope statementSequence117 =null;
		ParserRuleReturnScope expression119 =null;
		ParserRuleReturnScope statementSequence121 =null;
		ParserRuleReturnScope statementSequence123 =null;

		Object string_literal114_tree=null;
		Object string_literal116_tree=null;
		Object string_literal118_tree=null;
		Object string_literal120_tree=null;
		Object string_literal122_tree=null;
		Object string_literal124_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:23: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:25: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal114=(Token)match(input,45,FOLLOW_45_in_ifStatement1087); 
			string_literal114_tree = (Object)adaptor.create(string_literal114);
			adaptor.addChild(root_0, string_literal114_tree);

			pushFollow(FOLLOW_expression_in_ifStatement1089);
			expression115=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression115.getTree());

			string_literal116=(Token)match(input,60,FOLLOW_60_in_ifStatement1091); 
			string_literal116_tree = (Object)adaptor.create(string_literal116);
			adaptor.addChild(root_0, string_literal116_tree);

			pushFollow(FOLLOW_statementSequence_in_ifStatement1093);
			statementSequence117=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence117.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:66: ( 'ELSIF' expression 'THEN' statementSequence )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==42) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:67: 'ELSIF' expression 'THEN' statementSequence
					{
					string_literal118=(Token)match(input,42,FOLLOW_42_in_ifStatement1096); 
					string_literal118_tree = (Object)adaptor.create(string_literal118);
					adaptor.addChild(root_0, string_literal118_tree);

					pushFollow(FOLLOW_expression_in_ifStatement1098);
					expression119=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression119.getTree());

					string_literal120=(Token)match(input,60,FOLLOW_60_in_ifStatement1100); 
					string_literal120_tree = (Object)adaptor.create(string_literal120);
					adaptor.addChild(root_0, string_literal120_tree);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1102);
					statementSequence121=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence121.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:113: ( 'ELSE' statementSequence )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==41) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:85:114: 'ELSE' statementSequence
					{
					string_literal122=(Token)match(input,41,FOLLOW_41_in_ifStatement1107); 
					string_literal122_tree = (Object)adaptor.create(string_literal122);
					adaptor.addChild(root_0, string_literal122_tree);

					pushFollow(FOLLOW_statementSequence_in_ifStatement1109);
					statementSequence123=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence123.getTree());

					}
					break;

			}

			string_literal124=(Token)match(input,43,FOLLOW_43_in_ifStatement1113); 
			string_literal124_tree = (Object)adaptor.create(string_literal124);
			adaptor.addChild(root_0, string_literal124_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:1: caseStatement : 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) ;
	public final OberonParser.caseStatement_return caseStatement() throws RecognitionException {
		OberonParser.caseStatement_return retval = new OberonParser.caseStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal125=null;
		Token string_literal127=null;
		Token char_literal129=null;
		Token string_literal131=null;
		Token string_literal133=null;
		ParserRuleReturnScope expression126 =null;
		ParserRuleReturnScope casE128 =null;
		ParserRuleReturnScope casE130 =null;
		ParserRuleReturnScope statementSequence132 =null;

		Object string_literal125_tree=null;
		Object string_literal127_tree=null;
		Object char_literal129_tree=null;
		Object string_literal131_tree=null;
		Object string_literal133_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_casE=new RewriteRuleSubtreeStream(adaptor,"rule casE");
		RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:23: ( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:25: 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END'
			{
			string_literal125=(Token)match(input,69,FOLLOW_69_in_caseStatement1129);  
			stream_69.add(string_literal125);

			pushFollow(FOLLOW_expression_in_caseStatement1131);
			expression126=expression();
			state._fsp--;

			stream_expression.add(expression126.getTree());
			string_literal127=(Token)match(input,53,FOLLOW_53_in_caseStatement1133);  
			stream_53.add(string_literal127);

			pushFollow(FOLLOW_casE_in_caseStatement1135);
			casE128=casE();
			state._fsp--;

			stream_casE.add(casE128.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:53: ( '|' casE )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==71) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:54: '|' casE
					{
					char_literal129=(Token)match(input,71,FOLLOW_71_in_caseStatement1138);  
					stream_71.add(char_literal129);

					pushFollow(FOLLOW_casE_in_caseStatement1140);
					casE130=casE();
					state._fsp--;

					stream_casE.add(casE130.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:65: ( 'ELSE' statementSequence )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==41) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:66: 'ELSE' statementSequence
					{
					string_literal131=(Token)match(input,41,FOLLOW_41_in_caseStatement1145);  
					stream_41.add(string_literal131);

					pushFollow(FOLLOW_statementSequence_in_caseStatement1147);
					statementSequence132=statementSequence();
					state._fsp--;

					stream_statementSequence.add(statementSequence132.getTree());
					}
					break;

			}

			string_literal133=(Token)match(input,43,FOLLOW_43_in_caseStatement1151);  
			stream_43.add(string_literal133);

			// AST REWRITE
			// elements: casE, 53, expression, casE, 71, 43, 41, statementSequence, 69
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:99: -> ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:102: ^( 'case' expression 'OF' casE ( '|' casE )* ( 'ELSE' statementSequence )? 'END' )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_69.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_53.nextNode());
				adaptor.addChild(root_1, stream_casE.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:132: ( '|' casE )*
				while ( stream_casE.hasNext()||stream_71.hasNext() ) {
					adaptor.addChild(root_1, stream_71.nextNode());
					adaptor.addChild(root_1, stream_casE.nextTree());
				}
				stream_casE.reset();
				stream_71.reset();

				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:87:144: ( 'ELSE' statementSequence )?
				if ( stream_41.hasNext()||stream_statementSequence.hasNext() ) {
					adaptor.addChild(root_1, stream_41.nextNode());
					adaptor.addChild(root_1, stream_statementSequence.nextTree());
				}
				stream_41.reset();
				stream_statementSequence.reset();

				adaptor.addChild(root_1, stream_43.nextNode());
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:1: casE : ( caseLabelList ':' statementSequence )? ;
	public final OberonParser.casE_return casE() throws RecognitionException {
		OberonParser.casE_return retval = new OberonParser.casE_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal135=null;
		ParserRuleReturnScope caseLabelList134 =null;
		ParserRuleReturnScope statementSequence136 =null;

		Object char_literal135_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:23: ( ( caseLabelList ':' statementSequence )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:25: ( caseLabelList ':' statementSequence )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:25: ( caseLabelList ':' statementSequence )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CHARCONST||(LA31_0 >= IDENT && LA31_0 <= INTEGER)||LA31_0==REAL||LA31_0==STRING||LA31_0==19||LA31_0==22||LA31_0==24||LA31_0==52||LA31_0==70||LA31_0==73) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:89:26: caseLabelList ':' statementSequence
					{
					pushFollow(FOLLOW_caseLabelList_in_casE1205);
					caseLabelList134=caseLabelList();
					state._fsp--;

					adaptor.addChild(root_0, caseLabelList134.getTree());

					char_literal135=(Token)match(input,28,FOLLOW_28_in_casE1207); 
					char_literal135_tree = (Object)adaptor.create(char_literal135);
					adaptor.addChild(root_0, char_literal135_tree);

					pushFollow(FOLLOW_statementSequence_in_casE1209);
					statementSequence136=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence136.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:1: caseLabelList : caseLabels ( ',' caseLabels )* ;
	public final OberonParser.caseLabelList_return caseLabelList() throws RecognitionException {
		OberonParser.caseLabelList_return retval = new OberonParser.caseLabelList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		ParserRuleReturnScope caseLabels137 =null;
		ParserRuleReturnScope caseLabels139 =null;

		Object char_literal138_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:23: ( caseLabels ( ',' caseLabels )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:25: caseLabels ( ',' caseLabels )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_caseLabels_in_caseLabelList1227);
			caseLabels137=caseLabels();
			state._fsp--;

			adaptor.addChild(root_0, caseLabels137.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:36: ( ',' caseLabels )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==23) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:91:37: ',' caseLabels
					{
					char_literal138=(Token)match(input,23,FOLLOW_23_in_caseLabelList1230); 
					char_literal138_tree = (Object)adaptor.create(char_literal138);
					adaptor.addChild(root_0, char_literal138_tree);

					pushFollow(FOLLOW_caseLabels_in_caseLabelList1232);
					caseLabels139=caseLabels();
					state._fsp--;

					adaptor.addChild(root_0, caseLabels139.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:1: caseLabels : constExpression ( '..' constExpression ) ;
	public final OberonParser.caseLabels_return caseLabels() throws RecognitionException {
		OberonParser.caseLabels_return retval = new OberonParser.caseLabels_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal141=null;
		ParserRuleReturnScope constExpression140 =null;
		ParserRuleReturnScope constExpression142 =null;

		Object string_literal141_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:23: ( constExpression ( '..' constExpression ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:25: constExpression ( '..' constExpression )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_constExpression_in_caseLabels1253);
			constExpression140=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression140.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:41: ( '..' constExpression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:93:42: '..' constExpression
			{
			string_literal141=(Token)match(input,26,FOLLOW_26_in_caseLabels1256); 
			string_literal141_tree = (Object)adaptor.create(string_literal141);
			adaptor.addChild(root_0, string_literal141_tree);

			pushFollow(FOLLOW_constExpression_in_caseLabels1258);
			constExpression142=constExpression();
			state._fsp--;

			adaptor.addChild(root_0, constExpression142.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:1: whileStatement : 'WHILE' ^ expression 'DO' ! statementSequence 'END' !;
	public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
		OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal143=null;
		Token string_literal145=null;
		Token string_literal147=null;
		ParserRuleReturnScope expression144 =null;
		ParserRuleReturnScope statementSequence146 =null;

		Object string_literal143_tree=null;
		Object string_literal145_tree=null;
		Object string_literal147_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:23: ( 'WHILE' ^ expression 'DO' ! statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:95:25: 'WHILE' ^ expression 'DO' ! statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal143=(Token)match(input,64,FOLLOW_64_in_whileStatement1274); 
			string_literal143_tree = (Object)adaptor.create(string_literal143);
			root_0 = (Object)adaptor.becomeRoot(string_literal143_tree, root_0);

			pushFollow(FOLLOW_expression_in_whileStatement1277);
			expression144=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression144.getTree());

			string_literal145=(Token)match(input,40,FOLLOW_40_in_whileStatement1279); 
			pushFollow(FOLLOW_statementSequence_in_whileStatement1282);
			statementSequence146=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence146.getTree());

			string_literal147=(Token)match(input,43,FOLLOW_43_in_whileStatement1284); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:1: repeatStatement : 'REPEAT' ^ statementSequence 'UNTIL' ! expression ;
	public final OberonParser.repeatStatement_return repeatStatement() throws RecognitionException {
		OberonParser.repeatStatement_return retval = new OberonParser.repeatStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal148=null;
		Token string_literal150=null;
		ParserRuleReturnScope statementSequence149 =null;
		ParserRuleReturnScope expression151 =null;

		Object string_literal148_tree=null;
		Object string_literal150_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:23: ( 'REPEAT' ^ statementSequence 'UNTIL' ! expression )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:97:25: 'REPEAT' ^ statementSequence 'UNTIL' ! expression
			{
			root_0 = (Object)adaptor.nil();


			string_literal148=(Token)match(input,58,FOLLOW_58_in_repeatStatement1299); 
			string_literal148_tree = (Object)adaptor.create(string_literal148);
			root_0 = (Object)adaptor.becomeRoot(string_literal148_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_repeatStatement1302);
			statementSequence149=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence149.getTree());

			string_literal150=(Token)match(input,62,FOLLOW_62_in_repeatStatement1304); 
			pushFollow(FOLLOW_expression_in_repeatStatement1307);
			expression151=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression151.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:1: loopStatement : 'LOOP' ^ statementSequence 'END' !;
	public final OberonParser.loopStatement_return loopStatement() throws RecognitionException {
		OberonParser.loopStatement_return retval = new OberonParser.loopStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal152=null;
		Token string_literal154=null;
		ParserRuleReturnScope statementSequence153 =null;

		Object string_literal152_tree=null;
		Object string_literal154_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:23: ( 'LOOP' ^ statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:99:25: 'LOOP' ^ statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal152=(Token)match(input,49,FOLLOW_49_in_loopStatement1323); 
			string_literal152_tree = (Object)adaptor.create(string_literal152);
			root_0 = (Object)adaptor.becomeRoot(string_literal152_tree, root_0);

			pushFollow(FOLLOW_statementSequence_in_loopStatement1326);
			statementSequence153=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence153.getTree());

			string_literal154=(Token)match(input,43,FOLLOW_43_in_loopStatement1328); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:1: withStatement : 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !;
	public final OberonParser.withStatement_return withStatement() throws RecognitionException {
		OberonParser.withStatement_return retval = new OberonParser.withStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal155=null;
		Token char_literal157=null;
		Token string_literal159=null;
		Token string_literal161=null;
		ParserRuleReturnScope qualident156 =null;
		ParserRuleReturnScope qualident158 =null;
		ParserRuleReturnScope statementSequence160 =null;

		Object string_literal155_tree=null;
		Object char_literal157_tree=null;
		Object string_literal159_tree=null;
		Object string_literal161_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:23: ( 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !)
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:101:25: 'WITH' ^ qualident ':' qualident 'DO' ! statementSequence 'END' !
			{
			root_0 = (Object)adaptor.nil();


			string_literal155=(Token)match(input,65,FOLLOW_65_in_withStatement1345); 
			string_literal155_tree = (Object)adaptor.create(string_literal155);
			root_0 = (Object)adaptor.becomeRoot(string_literal155_tree, root_0);

			pushFollow(FOLLOW_qualident_in_withStatement1348);
			qualident156=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident156.getTree());

			char_literal157=(Token)match(input,28,FOLLOW_28_in_withStatement1350); 
			char_literal157_tree = (Object)adaptor.create(char_literal157);
			adaptor.addChild(root_0, char_literal157_tree);

			pushFollow(FOLLOW_qualident_in_withStatement1352);
			qualident158=qualident();
			state._fsp--;

			adaptor.addChild(root_0, qualident158.getTree());

			string_literal159=(Token)match(input,40,FOLLOW_40_in_withStatement1354); 
			pushFollow(FOLLOW_statementSequence_in_withStatement1357);
			statementSequence160=statementSequence();
			state._fsp--;

			adaptor.addChild(root_0, statementSequence160.getTree());

			string_literal161=(Token)match(input,43,FOLLOW_43_in_withStatement1359); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT -> ^( procedureHeading procedureBody IDENT ) ;
	public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
		OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal163=null;
		Token IDENT165=null;
		ParserRuleReturnScope procedureHeading162 =null;
		ParserRuleReturnScope procedureBody164 =null;

		Object char_literal163_tree=null;
		Object IDENT165_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
		RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:23: ( procedureHeading ';' procedureBody IDENT -> ^( procedureHeading procedureBody IDENT ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:25: procedureHeading ';' procedureBody IDENT
			{
			pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1369);
			procedureHeading162=procedureHeading();
			state._fsp--;

			stream_procedureHeading.add(procedureHeading162.getTree());
			char_literal163=(Token)match(input,30,FOLLOW_30_in_procedureDeclaration1371);  
			stream_30.add(char_literal163);

			pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1373);
			procedureBody164=procedureBody();
			state._fsp--;

			stream_procedureBody.add(procedureBody164.getTree());
			IDENT165=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1375);  
			stream_IDENT.add(IDENT165);

			// AST REWRITE
			// elements: procedureHeading, procedureBody, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:81: -> ^( procedureHeading procedureBody IDENT )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:103:84: ^( procedureHeading procedureBody IDENT )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_procedureHeading.nextNode(), root_1);
				adaptor.addChild(root_1, stream_procedureBody.nextTree());
				adaptor.addChild(root_1, stream_IDENT.nextNode());
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:1: procedureHeading : 'PROCEDURE' ^ ( '*' )? identdef ( formalParameters )? ;
	public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
		OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal166=null;
		Token char_literal167=null;
		ParserRuleReturnScope identdef168 =null;
		ParserRuleReturnScope formalParameters169 =null;

		Object string_literal166_tree=null;
		Object char_literal167_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:23: ( 'PROCEDURE' ^ ( '*' )? identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:25: 'PROCEDURE' ^ ( '*' )? identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal166=(Token)match(input,56,FOLLOW_56_in_procedureHeading1414); 
			string_literal166_tree = (Object)adaptor.create(string_literal166);
			root_0 = (Object)adaptor.becomeRoot(string_literal166_tree, root_0);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:38: ( '*' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==21) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:38: '*'
					{
					char_literal167=(Token)match(input,21,FOLLOW_21_in_procedureHeading1417); 
					char_literal167_tree = (Object)adaptor.create(char_literal167);
					adaptor.addChild(root_0, char_literal167_tree);

					}
					break;

			}

			pushFollow(FOLLOW_identdef_in_procedureHeading1420);
			identdef168=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef168.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:52: ( formalParameters )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==19) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:105:52: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_procedureHeading1422);
					formalParameters169=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters169.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:1: procedureBody : declarationSequence ( 'BEGIN' statementSequence )? 'END' ;
	public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
		OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal171=null;
		Token string_literal173=null;
		ParserRuleReturnScope declarationSequence170 =null;
		ParserRuleReturnScope statementSequence172 =null;

		Object string_literal171_tree=null;
		Object string_literal173_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:23: ( declarationSequence ( 'BEGIN' statementSequence )? 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:25: declarationSequence ( 'BEGIN' statementSequence )? 'END'
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_declarationSequence_in_procedureBody1439);
			declarationSequence170=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence170.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:45: ( 'BEGIN' statementSequence )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==37) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:107:46: 'BEGIN' statementSequence
					{
					string_literal171=(Token)match(input,37,FOLLOW_37_in_procedureBody1442); 
					string_literal171_tree = (Object)adaptor.create(string_literal171);
					adaptor.addChild(root_0, string_literal171_tree);

					pushFollow(FOLLOW_statementSequence_in_procedureBody1444);
					statementSequence172=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence172.getTree());

					}
					break;

			}

			string_literal173=(Token)match(input,43,FOLLOW_43_in_procedureBody1448); 
			string_literal173_tree = (Object)adaptor.create(string_literal173);
			adaptor.addChild(root_0, string_literal173_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:1: forwardDeclaration : 'PROCEDURE' '^' identdef ( formalParameters )? ;
	public final OberonParser.forwardDeclaration_return forwardDeclaration() throws RecognitionException {
		OberonParser.forwardDeclaration_return retval = new OberonParser.forwardDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal174=null;
		Token char_literal175=null;
		ParserRuleReturnScope identdef176 =null;
		ParserRuleReturnScope formalParameters177 =null;

		Object string_literal174_tree=null;
		Object char_literal175_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:23: ( 'PROCEDURE' '^' identdef ( formalParameters )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:25: 'PROCEDURE' '^' identdef ( formalParameters )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal174=(Token)match(input,56,FOLLOW_56_in_forwardDeclaration1461); 
			string_literal174_tree = (Object)adaptor.create(string_literal174);
			adaptor.addChild(root_0, string_literal174_tree);

			char_literal175=(Token)match(input,68,FOLLOW_68_in_forwardDeclaration1463); 
			char_literal175_tree = (Object)adaptor.create(char_literal175);
			adaptor.addChild(root_0, char_literal175_tree);

			pushFollow(FOLLOW_identdef_in_forwardDeclaration1465);
			identdef176=identdef();
			state._fsp--;

			adaptor.addChild(root_0, identdef176.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:50: ( formalParameters )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==19) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:109:50: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_forwardDeclaration1467);
					formalParameters177=formalParameters();
					state._fsp--;

					adaptor.addChild(root_0, formalParameters177.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:1: declarationSequence : ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* ;
	public final OberonParser.declarationSequence_return declarationSequence() throws RecognitionException {
		OberonParser.declarationSequence_return retval = new OberonParser.declarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal182=null;
		Token char_literal184=null;
		ParserRuleReturnScope constdeclarationSequence178 =null;
		ParserRuleReturnScope typedeclarationSequence179 =null;
		ParserRuleReturnScope vardeclarationSequence180 =null;
		ParserRuleReturnScope procedureDeclaration181 =null;
		ParserRuleReturnScope forwardDeclaration183 =null;

		Object char_literal182_tree=null;
		Object char_literal184_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:24: ( ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:26: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )* ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:26: ( constdeclarationSequence | typedeclarationSequence | vardeclarationSequence )*
			loop37:
			while (true) {
				int alt37=4;
				switch ( input.LA(1) ) {
				case 38:
					{
					alt37=1;
					}
					break;
				case 61:
					{
					alt37=2;
					}
					break;
				case 63:
					{
					alt37=3;
					}
					break;
				}
				switch (alt37) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:27: constdeclarationSequence
					{
					pushFollow(FOLLOW_constdeclarationSequence_in_declarationSequence1480);
					constdeclarationSequence178=constdeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, constdeclarationSequence178.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:54: typedeclarationSequence
					{
					pushFollow(FOLLOW_typedeclarationSequence_in_declarationSequence1484);
					typedeclarationSequence179=typedeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, typedeclarationSequence179.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:79: vardeclarationSequence
					{
					pushFollow(FOLLOW_vardeclarationSequence_in_declarationSequence1487);
					vardeclarationSequence180=vardeclarationSequence();
					state._fsp--;

					adaptor.addChild(root_0, vardeclarationSequence180.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:106: ( procedureDeclaration ';' !| forwardDeclaration ';' )*
			loop38:
			while (true) {
				int alt38=3;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==56) ) {
					int LA38_2 = input.LA(2);
					if ( (LA38_2==68) ) {
						alt38=2;
					}
					else if ( (LA38_2==IDENT||LA38_2==21) ) {
						alt38=1;
					}

				}

				switch (alt38) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:107: procedureDeclaration ';' !
					{
					pushFollow(FOLLOW_procedureDeclaration_in_declarationSequence1494);
					procedureDeclaration181=procedureDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, procedureDeclaration181.getTree());

					char_literal182=(Token)match(input,30,FOLLOW_30_in_declarationSequence1496); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:111:135: forwardDeclaration ';'
					{
					pushFollow(FOLLOW_forwardDeclaration_in_declarationSequence1501);
					forwardDeclaration183=forwardDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, forwardDeclaration183.getTree());

					char_literal184=(Token)match(input,30,FOLLOW_30_in_declarationSequence1503); 
					char_literal184_tree = (Object)adaptor.create(char_literal184);
					adaptor.addChild(root_0, char_literal184_tree);

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
	// $ANTLR end "declarationSequence"


	public static class constdeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constdeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:1: constdeclarationSequence : 'CONST' ( constantDeclaration ';' )* ;
	public final OberonParser.constdeclarationSequence_return constdeclarationSequence() throws RecognitionException {
		OberonParser.constdeclarationSequence_return retval = new OberonParser.constdeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal185=null;
		Token char_literal187=null;
		ParserRuleReturnScope constantDeclaration186 =null;

		Object string_literal185_tree=null;
		Object char_literal187_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:26: ( 'CONST' ( constantDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:28: 'CONST' ( constantDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			string_literal185=(Token)match(input,38,FOLLOW_38_in_constdeclarationSequence1513); 
			string_literal185_tree = (Object)adaptor.create(string_literal185);
			adaptor.addChild(root_0, string_literal185_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:36: ( constantDeclaration ';' )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==IDENT) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:113:37: constantDeclaration ';'
					{
					pushFollow(FOLLOW_constantDeclaration_in_constdeclarationSequence1516);
					constantDeclaration186=constantDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, constantDeclaration186.getTree());

					char_literal187=(Token)match(input,30,FOLLOW_30_in_constdeclarationSequence1518); 
					char_literal187_tree = (Object)adaptor.create(char_literal187);
					adaptor.addChild(root_0, char_literal187_tree);

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
	// $ANTLR end "constdeclarationSequence"


	public static class typedeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:1: typedeclarationSequence : 'TYPE' ( typeDeclaration ';' )* ;
	public final OberonParser.typedeclarationSequence_return typedeclarationSequence() throws RecognitionException {
		OberonParser.typedeclarationSequence_return retval = new OberonParser.typedeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal188=null;
		Token char_literal190=null;
		ParserRuleReturnScope typeDeclaration189 =null;

		Object string_literal188_tree=null;
		Object char_literal190_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:25: ( 'TYPE' ( typeDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:27: 'TYPE' ( typeDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			string_literal188=(Token)match(input,61,FOLLOW_61_in_typedeclarationSequence1533); 
			string_literal188_tree = (Object)adaptor.create(string_literal188);
			adaptor.addChild(root_0, string_literal188_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:34: ( typeDeclaration ';' )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==IDENT) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:115:36: typeDeclaration ';'
					{
					pushFollow(FOLLOW_typeDeclaration_in_typedeclarationSequence1537);
					typeDeclaration189=typeDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, typeDeclaration189.getTree());

					char_literal190=(Token)match(input,30,FOLLOW_30_in_typedeclarationSequence1539); 
					char_literal190_tree = (Object)adaptor.create(char_literal190);
					adaptor.addChild(root_0, char_literal190_tree);

					}
					break;

				default :
					break loop40;
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
	// $ANTLR end "typedeclarationSequence"


	public static class vardeclarationSequence_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vardeclarationSequence"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:1: vardeclarationSequence : 'VAR' ( variableDeclaration ';' )* ;
	public final OberonParser.vardeclarationSequence_return vardeclarationSequence() throws RecognitionException {
		OberonParser.vardeclarationSequence_return retval = new OberonParser.vardeclarationSequence_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal191=null;
		Token char_literal193=null;
		ParserRuleReturnScope variableDeclaration192 =null;

		Object string_literal191_tree=null;
		Object char_literal193_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:24: ( 'VAR' ( variableDeclaration ';' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:27: 'VAR' ( variableDeclaration ';' )*
			{
			root_0 = (Object)adaptor.nil();


			string_literal191=(Token)match(input,63,FOLLOW_63_in_vardeclarationSequence1560); 
			string_literal191_tree = (Object)adaptor.create(string_literal191);
			adaptor.addChild(root_0, string_literal191_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:33: ( variableDeclaration ';' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==IDENT) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:117:34: variableDeclaration ';'
					{
					pushFollow(FOLLOW_variableDeclaration_in_vardeclarationSequence1563);
					variableDeclaration192=variableDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, variableDeclaration192.getTree());

					char_literal193=(Token)match(input,30,FOLLOW_30_in_vardeclarationSequence1565); 
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
	// $ANTLR end "vardeclarationSequence"


	public static class formalParameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:23: ( '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:25: '(' ( fpSection ( ';' fpSection )* )? ')' ( ':' qualident )?
			{
			root_0 = (Object)adaptor.nil();


			char_literal194=(Token)match(input,19,FOLLOW_19_in_formalParameters1589); 
			char_literal194_tree = (Object)adaptor.create(char_literal194);
			adaptor.addChild(root_0, char_literal194_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:29: ( fpSection ( ';' fpSection )* )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==IDENT||LA43_0==63) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:30: fpSection ( ';' fpSection )*
					{
					pushFollow(FOLLOW_fpSection_in_formalParameters1592);
					fpSection195=fpSection();
					state._fsp--;

					adaptor.addChild(root_0, fpSection195.getTree());

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:40: ( ';' fpSection )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==30) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:41: ';' fpSection
							{
							char_literal196=(Token)match(input,30,FOLLOW_30_in_formalParameters1595); 
							char_literal196_tree = (Object)adaptor.create(char_literal196);
							adaptor.addChild(root_0, char_literal196_tree);

							pushFollow(FOLLOW_fpSection_in_formalParameters1597);
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

			char_literal198=(Token)match(input,20,FOLLOW_20_in_formalParameters1603); 
			char_literal198_tree = (Object)adaptor.create(char_literal198);
			adaptor.addChild(root_0, char_literal198_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:63: ( ':' qualident )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==28) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:120:64: ':' qualident
					{
					char_literal199=(Token)match(input,28,FOLLOW_28_in_formalParameters1606); 
					char_literal199_tree = (Object)adaptor.create(char_literal199);
					adaptor.addChild(root_0, char_literal199_tree);

					pushFollow(FOLLOW_qualident_in_formalParameters1608);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:1: fpSection : ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType ;
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
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:23: ( ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:25: ( 'VAR' )? IDENT ( ',' IDENT )* ':' formalType
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:25: ( 'VAR' )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==63) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:25: 'VAR'
					{
					string_literal201=(Token)match(input,63,FOLLOW_63_in_fpSection1630); 
					string_literal201_tree = (Object)adaptor.create(string_literal201);
					adaptor.addChild(root_0, string_literal201_tree);

					}
					break;

			}

			IDENT202=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1633); 
			IDENT202_tree = (Object)adaptor.create(IDENT202);
			adaptor.addChild(root_0, IDENT202_tree);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:38: ( ',' IDENT )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==23) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:122:39: ',' IDENT
					{
					char_literal203=(Token)match(input,23,FOLLOW_23_in_fpSection1636); 
					char_literal203_tree = (Object)adaptor.create(char_literal203);
					adaptor.addChild(root_0, char_literal203_tree);

					IDENT204=(Token)match(input,IDENT,FOLLOW_IDENT_in_fpSection1638); 
					IDENT204_tree = (Object)adaptor.create(IDENT204);
					adaptor.addChild(root_0, IDENT204_tree);

					}
					break;

				default :
					break loop46;
				}
			}

			char_literal205=(Token)match(input,28,FOLLOW_28_in_fpSection1643); 
			char_literal205_tree = (Object)adaptor.create(char_literal205);
			adaptor.addChild(root_0, char_literal205_tree);

			pushFollow(FOLLOW_formalType_in_fpSection1645);
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:1: formalType : ( ( 'ARRAY' 'OF' )* qualident | procedureType );
	public final OberonParser.formalType_return formalType() throws RecognitionException {
		OberonParser.formalType_return retval = new OberonParser.formalType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal207=null;
		Token string_literal208=null;
		ParserRuleReturnScope qualident209 =null;
		ParserRuleReturnScope procedureType210 =null;

		Object string_literal207_tree=null;
		Object string_literal208_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:23: ( ( 'ARRAY' 'OF' )* qualident | procedureType )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==IDENT||LA48_0==36) ) {
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
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:25: ( 'ARRAY' 'OF' )* qualident
					{
					root_0 = (Object)adaptor.nil();


					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:25: ( 'ARRAY' 'OF' )*
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==36) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:26: 'ARRAY' 'OF'
							{
							string_literal207=(Token)match(input,36,FOLLOW_36_in_formalType1665); 
							string_literal207_tree = (Object)adaptor.create(string_literal207);
							adaptor.addChild(root_0, string_literal207_tree);

							string_literal208=(Token)match(input,53,FOLLOW_53_in_formalType1667); 
							string_literal208_tree = (Object)adaptor.create(string_literal208);
							adaptor.addChild(root_0, string_literal208_tree);

							}
							break;

						default :
							break loop47;
						}
					}

					pushFollow(FOLLOW_qualident_in_formalType1671);
					qualident209=qualident();
					state._fsp--;

					adaptor.addChild(root_0, qualident209.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:124:53: procedureType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_procedureType_in_formalType1675);
					procedureType210=procedureType();
					state._fsp--;

					adaptor.addChild(root_0, procedureType210.getTree());

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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:1: module : 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' ! EOF ;
	public final OberonParser.module_return module() throws RecognitionException {
		OberonParser.module_return retval = new OberonParser.module_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal211=null;
		Token IDENT212=null;
		Token char_literal213=null;
		Token string_literal216=null;
		Token string_literal218=null;
		Token IDENT219=null;
		Token char_literal220=null;
		Token EOF221=null;
		ParserRuleReturnScope importList214 =null;
		ParserRuleReturnScope declarationSequence215 =null;
		ParserRuleReturnScope statementSequence217 =null;

		Object string_literal211_tree=null;
		Object IDENT212_tree=null;
		Object char_literal213_tree=null;
		Object string_literal216_tree=null;
		Object string_literal218_tree=null;
		Object IDENT219_tree=null;
		Object char_literal220_tree=null;
		Object EOF221_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:23: ( 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' ! EOF )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:25: 'MODULE' ^ IDENT ';' ! ( importList )? declarationSequence ( 'BEGIN' statementSequence )? 'END' IDENT '.' ! EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal211=(Token)match(input,51,FOLLOW_51_in_module1698); 
			string_literal211_tree = (Object)adaptor.create(string_literal211);
			root_0 = (Object)adaptor.becomeRoot(string_literal211_tree, root_0);

			IDENT212=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1701); 
			IDENT212_tree = (Object)adaptor.create(IDENT212);
			adaptor.addChild(root_0, IDENT212_tree);

			char_literal213=(Token)match(input,30,FOLLOW_30_in_module1703); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:46: ( importList )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==46) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:46: importList
					{
					pushFollow(FOLLOW_importList_in_module1706);
					importList214=importList();
					state._fsp--;

					adaptor.addChild(root_0, importList214.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_declarationSequence_in_module1709);
			declarationSequence215=declarationSequence();
			state._fsp--;

			adaptor.addChild(root_0, declarationSequence215.getTree());

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:78: ( 'BEGIN' statementSequence )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==37) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:126:79: 'BEGIN' statementSequence
					{
					string_literal216=(Token)match(input,37,FOLLOW_37_in_module1712); 
					string_literal216_tree = (Object)adaptor.create(string_literal216);
					adaptor.addChild(root_0, string_literal216_tree);

					pushFollow(FOLLOW_statementSequence_in_module1714);
					statementSequence217=statementSequence();
					state._fsp--;

					adaptor.addChild(root_0, statementSequence217.getTree());

					}
					break;

			}

			string_literal218=(Token)match(input,43,FOLLOW_43_in_module1718); 
			string_literal218_tree = (Object)adaptor.create(string_literal218);
			adaptor.addChild(root_0, string_literal218_tree);

			IDENT219=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1720); 
			IDENT219_tree = (Object)adaptor.create(IDENT219);
			adaptor.addChild(root_0, IDENT219_tree);

			char_literal220=(Token)match(input,25,FOLLOW_25_in_module1722); 
			EOF221=(Token)match(input,EOF,FOLLOW_EOF_in_module1725); 
			EOF221_tree = (Object)adaptor.create(EOF221);
			adaptor.addChild(root_0, EOF221_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:1: importList : 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) ;
	public final OberonParser.importList_return importList() throws RecognitionException {
		OberonParser.importList_return retval = new OberonParser.importList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal222=null;
		Token char_literal224=null;
		Token char_literal226=null;
		ParserRuleReturnScope importDeclaration223 =null;
		ParserRuleReturnScope importDeclaration225 =null;

		Object string_literal222_tree=null;
		Object char_literal224_tree=null;
		Object char_literal226_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleSubtreeStream stream_importDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule importDeclaration");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:23: ( 'IMPORT' importDeclaration ( ',' importDeclaration )* ';' -> ^( 'IMPORT' importDeclaration ( importDeclaration )* ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:25: 'IMPORT' importDeclaration ( ',' importDeclaration )* ';'
			{
			string_literal222=(Token)match(input,46,FOLLOW_46_in_importList1744);  
			stream_46.add(string_literal222);

			pushFollow(FOLLOW_importDeclaration_in_importList1746);
			importDeclaration223=importDeclaration();
			state._fsp--;

			stream_importDeclaration.add(importDeclaration223.getTree());
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:52: ( ',' importDeclaration )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==23) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:53: ',' importDeclaration
					{
					char_literal224=(Token)match(input,23,FOLLOW_23_in_importList1749);  
					stream_23.add(char_literal224);

					pushFollow(FOLLOW_importDeclaration_in_importList1751);
					importDeclaration225=importDeclaration();
					state._fsp--;

					stream_importDeclaration.add(importDeclaration225.getTree());
					}
					break;

				default :
					break loop51;
				}
			}

			char_literal226=(Token)match(input,30,FOLLOW_30_in_importList1755);  
			stream_30.add(char_literal226);

			// AST REWRITE
			// elements: 46, importDeclaration, importDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:85: -> ^( 'IMPORT' importDeclaration ( importDeclaration )* )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:88: ^( 'IMPORT' importDeclaration ( importDeclaration )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);
				adaptor.addChild(root_1, stream_importDeclaration.nextTree());
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:128:117: ( importDeclaration )*
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
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:1: importDeclaration : IDENT ( ':=' IDENT )? -> ^( IDENT ( ':=' IDENT )? ) ;
	public final OberonParser.importDeclaration_return importDeclaration() throws RecognitionException {
		OberonParser.importDeclaration_return retval = new OberonParser.importDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT227=null;
		Token string_literal228=null;
		Token IDENT229=null;

		Object IDENT227_tree=null;
		Object string_literal228_tree=null;
		Object IDENT229_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:23: ( IDENT ( ':=' IDENT )? -> ^( IDENT ( ':=' IDENT )? ) )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:26: IDENT ( ':=' IDENT )?
			{
			IDENT227=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1788);  
			stream_IDENT.add(IDENT227);

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:32: ( ':=' IDENT )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==29) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:33: ':=' IDENT
					{
					string_literal228=(Token)match(input,29,FOLLOW_29_in_importDeclaration1791);  
					stream_29.add(string_literal228);

					IDENT229=(Token)match(input,IDENT,FOLLOW_IDENT_in_importDeclaration1793);  
					stream_IDENT.add(IDENT229);

					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, IDENT, 29
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:85: -> ^( IDENT ( ':=' IDENT )? )
			{
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:88: ^( IDENT ( ':=' IDENT )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:130:96: ( ':=' IDENT )?
				if ( stream_IDENT.hasNext()||stream_29.hasNext() ) {
					adaptor.addChild(root_1, stream_29.nextNode());
					adaptor.addChild(root_1, stream_IDENT.nextNode());
				}
				stream_IDENT.reset();
				stream_29.reset();

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



	public static final BitSet FOLLOW_IDENT_in_identdef99 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_identdef101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_constantDeclaration112 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_constantDeclaration114 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_constExpression_in_constantDeclaration116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constExpression146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_typeDeclaration160 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_typeDeclaration162 = new BitSet(new long[]{0x0380001000000400L});
	public static final BitSet FOLLOW_type_in_typeDeclaration164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_type216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pointerType_in_type228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_type232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_arrayType252 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arrayType254 = new BitSet(new long[]{0x0020000000800000L});
	public static final BitSet FOLLOW_23_in_arrayType257 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_length_in_arrayType259 = new BitSet(new long[]{0x0020000000800000L});
	public static final BitSet FOLLOW_53_in_arrayType263 = new BitSet(new long[]{0x0380001000000400L});
	public static final BitSet FOLLOW_type_in_arrayType265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constExpression_in_length288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_recordType307 = new BitSet(new long[]{0x0000000040080400L});
	public static final BitSet FOLLOW_19_in_recordType310 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_baseType_in_recordType312 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_recordType314 = new BitSet(new long[]{0x0000000040000400L});
	public static final BitSet FOLLOW_fieldListSequence_in_recordType318 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_recordType320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_baseType341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence353 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_fieldListSequence356 = new BitSet(new long[]{0x0000000040000400L});
	public static final BitSet FOLLOW_fieldList_in_fieldListSequence358 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_identList_in_fieldList381 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_fieldList383 = new BitSet(new long[]{0x0380001000000400L});
	public static final BitSet FOLLOW_type_in_fieldList385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identdef_in_identList407 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_identList410 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identdef_in_identList412 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_55_in_pointerType432 = new BitSet(new long[]{0x0380001000000400L});
	public static final BitSet FOLLOW_type_in_pointerType435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedureType451 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureType453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identList_in_variableDeclaration464 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_variableDeclaration466 = new BitSet(new long[]{0x0380001000000400L});
	public static final BitSet FOLLOW_type_in_variableDeclaration468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_qualident497 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_qualident499 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_qualident503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualident_in_designator523 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000014L});
	public static final BitSet FOLLOW_25_in_designator526 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_designator528 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000014L});
	public static final BitSet FOLLOW_66_in_designator532 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expList_in_designator534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_designator536 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000014L});
	public static final BitSet FOLLOW_19_in_designator540 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_qualident_in_designator542 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_designator544 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000014L});
	public static final BitSet FOLLOW_68_in_designator548 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000014L});
	public static final BitSet FOLLOW_expression_in_expList572 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_expList575 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_expList577 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_simpleExpression_in_expression598 = new BitSet(new long[]{0x0001800F80020002L});
	public static final BitSet FOLLOW_relation_in_expression601 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_simpleExpression_in_expression604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression663 = new BitSet(new long[]{0x0040000001400002L});
	public static final BitSet FOLLOW_addOperator_in_simpleExpression666 = new BitSet(new long[]{0x001000000008AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_term_in_simpleExpression668 = new BitSet(new long[]{0x0040000001400002L});
	public static final BitSet FOLLOW_factor_in_term721 = new BitSet(new long[]{0x0004008008240002L});
	public static final BitSet FOLLOW_mulOperator_in_term724 = new BitSet(new long[]{0x001000000008AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_term726 = new BitSet(new long[]{0x0004008008240002L});
	public static final BitSet FOLLOW_number_in_factor777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARCONST_in_factor781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_factor785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_factor789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_factor793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_factor797 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_actualParameters_in_factor799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_factor804 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_factor806 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_factor808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_factor812 = new BitSet(new long[]{0x001000000008AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_factor_in_factor814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_set840 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000340L});
	public static final BitSet FOLLOW_element_in_set843 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000100L});
	public static final BitSet FOLLOW_23_in_set846 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_element_in_set848 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_set855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_element877 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_element881 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_element883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_actualParameters898 = new BitSet(new long[]{0x001000000158AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expList_in_actualParameters900 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_actualParameters903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement2_in_statement925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseStatement_in_statement929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeatStatement_in_statement933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loopStatement_in_statement935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_withStatement_in_statement937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_statement940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_statement944 = new BitSet(new long[]{0x001000000148AC42L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_statement946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_designator_in_statement2971 = new BitSet(new long[]{0x0000000020080000L});
	public static final BitSet FOLLOW_assignment_in_statement2977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureCall_in_statement2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_assignment1006 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_assignment1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actualParameters_in_procedureCall1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statementSequence1049 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_statementSequence1053 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statement_in_statementSequence1055 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_45_in_ifStatement1087 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifStatement1089 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement1091 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1093 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_42_in_ifStatement1096 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_ifStatement1098 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement1100 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1102 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_41_in_ifStatement1107 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_ifStatement1109 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ifStatement1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_caseStatement1129 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_caseStatement1131 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_caseStatement1133 = new BitSet(new long[]{0x00100A000148AC40L,0x00000000000002C0L});
	public static final BitSet FOLLOW_casE_in_caseStatement1135 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_caseStatement1138 = new BitSet(new long[]{0x00100A000148AC40L,0x00000000000002C0L});
	public static final BitSet FOLLOW_casE_in_caseStatement1140 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_41_in_caseStatement1145 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_caseStatement1147 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_caseStatement1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabelList_in_casE1205 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_casE1207 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_casE1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1227 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_caseLabelList1230 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_caseLabels_in_caseLabelList1232 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1253 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_caseLabels1256 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_constExpression_in_caseLabels1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_whileStatement1274 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_whileStatement1277 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_whileStatement1279 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_whileStatement1282 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_whileStatement1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_repeatStatement1299 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_repeatStatement1302 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_repeatStatement1304 = new BitSet(new long[]{0x001000000148AC40L,0x0000000000000240L});
	public static final BitSet FOLLOW_expression_in_repeatStatement1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_loopStatement1323 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_loopStatement1326 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_loopStatement1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_withStatement1345 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_qualident_in_withStatement1348 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_withStatement1350 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_qualident_in_withStatement1352 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_withStatement1354 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_withStatement1357 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_withStatement1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1369 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_procedureDeclaration1371 = new BitSet(new long[]{0xA100086000000000L});
	public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1373 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_procedureHeading1414 = new BitSet(new long[]{0x0000000000200400L});
	public static final BitSet FOLLOW_21_in_procedureHeading1417 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identdef_in_procedureHeading1420 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_formalParameters_in_procedureHeading1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationSequence_in_procedureBody1439 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_procedureBody1442 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_procedureBody1444 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_procedureBody1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_forwardDeclaration1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_forwardDeclaration1463 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_identdef_in_forwardDeclaration1465 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_formalParameters_in_forwardDeclaration1467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constdeclarationSequence_in_declarationSequence1480 = new BitSet(new long[]{0xA100004000000002L});
	public static final BitSet FOLLOW_typedeclarationSequence_in_declarationSequence1484 = new BitSet(new long[]{0xA100004000000002L});
	public static final BitSet FOLLOW_vardeclarationSequence_in_declarationSequence1487 = new BitSet(new long[]{0xA100004000000002L});
	public static final BitSet FOLLOW_procedureDeclaration_in_declarationSequence1494 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declarationSequence1496 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_forwardDeclaration_in_declarationSequence1501 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declarationSequence1503 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_38_in_constdeclarationSequence1513 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_constantDeclaration_in_constdeclarationSequence1516 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_constdeclarationSequence1518 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_61_in_typedeclarationSequence1533 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_typeDeclaration_in_typedeclarationSequence1537 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_typedeclarationSequence1539 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_63_in_vardeclarationSequence1560 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_variableDeclaration_in_vardeclarationSequence1563 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_vardeclarationSequence1565 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_19_in_formalParameters1589 = new BitSet(new long[]{0x8000000000100400L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1592 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_30_in_formalParameters1595 = new BitSet(new long[]{0x8000000000000400L});
	public static final BitSet FOLLOW_fpSection_in_formalParameters1597 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_20_in_formalParameters1603 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_formalParameters1606 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_qualident_in_formalParameters1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_fpSection1630 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1633 = new BitSet(new long[]{0x0000000010800000L});
	public static final BitSet FOLLOW_23_in_fpSection1636 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_fpSection1638 = new BitSet(new long[]{0x0000000010800000L});
	public static final BitSet FOLLOW_28_in_fpSection1643 = new BitSet(new long[]{0x0100001000000400L});
	public static final BitSet FOLLOW_formalType_in_fpSection1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_formalType1665 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_formalType1667 = new BitSet(new long[]{0x0000001000000400L});
	public static final BitSet FOLLOW_qualident_in_formalType1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedureType_in_formalType1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_module1698 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_module1701 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_module1703 = new BitSet(new long[]{0xA100486000000000L});
	public static final BitSet FOLLOW_importList_in_module1706 = new BitSet(new long[]{0xA100086000000000L});
	public static final BitSet FOLLOW_declarationSequence_in_module1709 = new BitSet(new long[]{0x0000082000000000L});
	public static final BitSet FOLLOW_37_in_module1712 = new BitSet(new long[]{0x0C02300040000400L,0x0000000000000023L});
	public static final BitSet FOLLOW_statementSequence_in_module1714 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_module1718 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_module1720 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_module1722 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_module1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_importList1744 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1746 = new BitSet(new long[]{0x0000000040800000L});
	public static final BitSet FOLLOW_23_in_importList1749 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_importDeclaration_in_importList1751 = new BitSet(new long[]{0x0000000040800000L});
	public static final BitSet FOLLOW_30_in_importList1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1788 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_importDeclaration1791 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_IDENT_in_importDeclaration1793 = new BitSet(new long[]{0x0000000000000002L});
}
