// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-21 17:26:57
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class OberonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "'.'", "';'", "'BEGIN'", 
		"'END'", "'IMPORT'", "'MODULE'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int ID=4;
	public static final int WS=5;

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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:1: program : 'MODULE' ID ';' importDeclarations block ID '.' EOF ;
	public final OberonParser.program_return program() throws RecognitionException {
		OberonParser.program_return retval = new OberonParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token ID6=null;
		Token char_literal7=null;
		Token EOF8=null;
		ParserRuleReturnScope importDeclarations4 =null;
		ParserRuleReturnScope block5 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object ID6_tree=null;
		Object char_literal7_tree=null;
		Object EOF8_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:23: ( 'MODULE' ID ';' importDeclarations block ID '.' EOF )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:25: 'MODULE' ID ';' importDeclarations block ID '.' EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,11,FOLLOW_11_in_program63); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_program65); 
			ID2_tree = (Object)adaptor.create(ID2);
			adaptor.addChild(root_0, ID2_tree);

			char_literal3=(Token)match(input,7,FOLLOW_7_in_program67); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);

			pushFollow(FOLLOW_importDeclarations_in_program69);
			importDeclarations4=importDeclarations();
			state._fsp--;

			adaptor.addChild(root_0, importDeclarations4.getTree());

			pushFollow(FOLLOW_block_in_program71);
			block5=block();
			state._fsp--;

			adaptor.addChild(root_0, block5.getTree());

			ID6=(Token)match(input,ID,FOLLOW_ID_in_program73); 
			ID6_tree = (Object)adaptor.create(ID6);
			adaptor.addChild(root_0, ID6_tree);

			char_literal7=(Token)match(input,6,FOLLOW_6_in_program75); 
			char_literal7_tree = (Object)adaptor.create(char_literal7);
			adaptor.addChild(root_0, char_literal7_tree);

			EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_program77); 
			EOF8_tree = (Object)adaptor.create(EOF8);
			adaptor.addChild(root_0, EOF8_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class importDeclarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importDeclarations"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:1: importDeclarations : ( importDeclaration )* ;
	public final OberonParser.importDeclarations_return importDeclarations() throws RecognitionException {
		OberonParser.importDeclarations_return retval = new OberonParser.importDeclarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope importDeclaration9 =null;


		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:23: ( ( importDeclaration )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:25: ( importDeclaration )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:25: ( importDeclaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==10) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:25: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_importDeclarations88);
					importDeclaration9=importDeclaration();
					state._fsp--;

					adaptor.addChild(root_0, importDeclaration9.getTree());

					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "importDeclarations"


	public static class importDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "importDeclaration"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:1: importDeclaration : 'IMPORT' ID ';' ;
	public final OberonParser.importDeclaration_return importDeclaration() throws RecognitionException {
		OberonParser.importDeclaration_return retval = new OberonParser.importDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal10=null;
		Token ID11=null;
		Token char_literal12=null;

		Object string_literal10_tree=null;
		Object ID11_tree=null;
		Object char_literal12_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:23: ( 'IMPORT' ID ';' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:25: 'IMPORT' ID ';'
			{
			root_0 = (Object)adaptor.nil();


			string_literal10=(Token)match(input,10,FOLLOW_10_in_importDeclaration101); 
			string_literal10_tree = (Object)adaptor.create(string_literal10);
			adaptor.addChild(root_0, string_literal10_tree);

			ID11=(Token)match(input,ID,FOLLOW_ID_in_importDeclaration103); 
			ID11_tree = (Object)adaptor.create(ID11);
			adaptor.addChild(root_0, ID11_tree);

			char_literal12=(Token)match(input,7,FOLLOW_7_in_importDeclaration105); 
			char_literal12_tree = (Object)adaptor.create(char_literal12);
			adaptor.addChild(root_0, char_literal12_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
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


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:1: block : 'BEGIN' 'END' ;
	public final OberonParser.block_return block() throws RecognitionException {
		OberonParser.block_return retval = new OberonParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;
		Token string_literal14=null;

		Object string_literal13_tree=null;
		Object string_literal14_tree=null;

		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:23: ( 'BEGIN' 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:25: 'BEGIN' 'END'
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,8,FOLLOW_8_in_block129); 
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			adaptor.addChild(root_0, string_literal13_tree);

			string_literal14=(Token)match(input,9,FOLLOW_9_in_block131); 
			string_literal14_tree = (Object)adaptor.create(string_literal14);
			adaptor.addChild(root_0, string_literal14_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"

	// Delegated rules



	public static final BitSet FOLLOW_11_in_program63 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_program65 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_program67 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_importDeclarations_in_program69 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_block_in_program71 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_program73 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_program75 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_importDeclaration_in_importDeclarations88 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_importDeclaration101 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_importDeclaration103 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_importDeclaration105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_block129 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_block131 = new BitSet(new long[]{0x0000000000000002L});
}
