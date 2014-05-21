package dhbw.compilerbau.oberonparser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import dhbw.compilerbau.oberonparser.parser.OberonLexer;
import dhbw.compilerbau.oberonparser.parser.OberonParser;
import dhbw.compilerbau.oberonparser.parser.OberonParser.program_return;

public class ParserTest 
{
	public static void main(String[] args) 
	{
		try
		{
			//load testfile from folder
			FileInputStream fileInputStream = new FileInputStream(new File("OberonTestFiles/oberon.test"));
			
			//create ANTLR input stream
			ANTLRInputStream inputStream = new ANTLRInputStream(fileInputStream);
			
			//create lexer
			OberonLexer lexer = new OberonLexer(inputStream);
			
			//Buffer for tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			//create parser
			OberonParser parser = new OberonParser(tokens);
			
			//start parser at it's first rule
			program_return result = parser.program();
			CommonTree tree = (CommonTree)result.getTree();
			
			//log tree to console
			System.out.println(tree.toStringTree());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		

	}

}
