// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-21 19:56:53
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OberonLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public OberonLexer() {} 
	public OberonLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public OberonLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:9:7: ( '#' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:9:9: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:10:7: ( '&' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:10:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:11:7: ( '(' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:7: ( ')' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:7: ( '*' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:7: ( '+' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:7: ( ',' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:15:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:7: ( '-' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:16:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:7: ( '.' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:17:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:7: ( '..' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:18:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:7: ( '/' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:19:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:7: ( ':' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:20:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:7: ( ':=' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:7: ( ';' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:22:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:7: ( '<' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:23:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:7: ( '<=' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:7: ( '=' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:25:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:7: ( '>' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:26:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:7: ( '>=' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:27:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:7: ( 'ARRAY OF' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:28:9: 'ARRAY OF'
			{
			match("ARRAY OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:7: ( 'ARRAY' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:29:9: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:7: ( 'BEGIN' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:30:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:7: ( 'CONST' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:31:9: 'CONST'
			{
			match("CONST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:7: ( 'DIV' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:32:9: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:7: ( 'DO' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:33:9: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:34:7: ( 'ELSE' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:34:9: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:7: ( 'ELSEIF' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:35:9: 'ELSEIF'
			{
			match("ELSEIF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:36:7: ( 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:36:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:7: ( 'EXIT' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:37:9: 'EXIT'
			{
			match("EXIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:7: ( 'IF' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:38:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:7: ( 'IMPORT' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:39:9: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:7: ( 'IN' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:40:9: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:7: ( 'IS' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:41:9: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:42:7: ( 'LOOP' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:42:9: 'LOOP'
			{
			match("LOOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:7: ( 'MOD' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:43:9: 'MOD'
			{
			match("MOD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:7: ( 'MODULE' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:44:9: 'MODULE'
			{
			match("MODULE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:7: ( 'NIL' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:45:9: 'NIL'
			{
			match("NIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:7: ( 'OF' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:46:9: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:7: ( 'OR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:47:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:7: ( 'POINTER TO' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:48:9: 'POINTER TO'
			{
			match("POINTER TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:7: ( 'PROCEDURE' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:49:9: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:7: ( 'RECORD' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:50:9: 'RECORD'
			{
			match("RECORD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:7: ( 'REPEAT' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:51:9: 'REPEAT'
			{
			match("REPEAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:7: ( 'RETURN' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:52:9: 'RETURN'
			{
			match("RETURN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:7: ( 'THEN' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:53:9: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:54:7: ( 'UNTIL' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:54:9: 'UNTIL'
			{
			match("UNTIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:7: ( 'VAR' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:55:9: 'VAR'
			{
			match("VAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:7: ( 'WHILE' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:56:9: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:7: ( 'WITH' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:57:9: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:7: ( '[' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:58:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:7: ( ']' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:59:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:7: ( '^' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:60:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:7: ( 'case' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:61:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:7: ( '{' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:62:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:7: ( '|' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:63:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:7: ( '}' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:64:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:7: ( '~' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:65:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:23: ( ( LETTER ) ( LETTER | DIGIT )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:25: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:135:33: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:23: ( DIGIT ( DIGIT )* | DIGIT ( HEX_DIGIT )* 'H' )
			int alt4=2;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:25: DIGIT ( DIGIT )*
					{
					mDIGIT(); 

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:31: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:40: DIGIT ( HEX_DIGIT )* 'H'
					{
					mDIGIT(); 

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:137:46: ( HEX_DIGIT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					match('H'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:23: ( DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )? )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:25: DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )?
			{
			mDIGIT(); 

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:31: ( DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('.'); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:42: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:49: ( SCALE_FACTOR )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= 'D' && LA7_0 <= 'E')) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:139:49: SCALE_FACTOR
					{
					mSCALE_FACTOR(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "CHARCONST"
	public final void mCHARCONST() throws RecognitionException {
		try {
			int _type = CHARCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:23: ( '\"' CHARACTER '\"' | DIGIT ( HEX_DIGIT )* 'X' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\"') ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:25: '\"' CHARACTER '\"'
					{
					match('\"'); 
					mCHARACTER(); 

					match('\"'); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:45: DIGIT ( HEX_DIGIT )* 'X'
					{
					mDIGIT(); 

					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:141:51: ( HEX_DIGIT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'F')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					match('X'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARCONST"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:23: ( '\"' ( CHARACTER )* '\"' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:25: '\"' ( CHARACTER )* '\"'
			{
			match('\"'); 
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:143:29: ( CHARACTER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='!'||LA10_0==','||LA10_0=='.'||LA10_0=='?'||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)==','||input.LA(1)=='.'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:23: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:25: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:30: ( options {greedy=false; } : . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='*') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='/') ) {
						alt11=2;
					}
					else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:146:55: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:148:23: ( '0' .. '9' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:150:23: ( DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "SCALE_FACTOR"
	public final void mSCALE_FACTOR() throws RecognitionException {
		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:23: ( ( 'E' | 'D' ) ( '+' | '-' )? DIGIT ( DIGIT )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:25: ( 'E' | 'D' ) ( '+' | '-' )? DIGIT ( DIGIT )*
			{
			if ( (input.LA(1) >= 'D' && input.LA(1) <= 'E') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:37: ( '+' | '-' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='+'||LA12_0=='-') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mDIGIT(); 

			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:152:56: ( DIGIT )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCALE_FACTOR"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:154:23: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:156:23: ( LETTER | '!' | '?' | '.' | ',' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)==','||input.LA(1)=='.'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:23: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:27: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:160:27: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | IDENT | INTEGER | REAL | CHARCONST | STRING | COMMENT | WS )
		int alt15=64;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:82: T__28
				{
				mT__28(); 

				}
				break;
			case 14 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:88: T__29
				{
				mT__29(); 

				}
				break;
			case 15 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:94: T__30
				{
				mT__30(); 

				}
				break;
			case 16 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:100: T__31
				{
				mT__31(); 

				}
				break;
			case 17 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:106: T__32
				{
				mT__32(); 

				}
				break;
			case 18 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:112: T__33
				{
				mT__33(); 

				}
				break;
			case 19 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:118: T__34
				{
				mT__34(); 

				}
				break;
			case 20 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:124: T__35
				{
				mT__35(); 

				}
				break;
			case 21 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:130: T__36
				{
				mT__36(); 

				}
				break;
			case 22 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:136: T__37
				{
				mT__37(); 

				}
				break;
			case 23 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:142: T__38
				{
				mT__38(); 

				}
				break;
			case 24 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:148: T__39
				{
				mT__39(); 

				}
				break;
			case 25 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:154: T__40
				{
				mT__40(); 

				}
				break;
			case 26 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:160: T__41
				{
				mT__41(); 

				}
				break;
			case 27 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:166: T__42
				{
				mT__42(); 

				}
				break;
			case 28 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:172: T__43
				{
				mT__43(); 

				}
				break;
			case 29 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:178: T__44
				{
				mT__44(); 

				}
				break;
			case 30 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:184: T__45
				{
				mT__45(); 

				}
				break;
			case 31 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:190: T__46
				{
				mT__46(); 

				}
				break;
			case 32 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:196: T__47
				{
				mT__47(); 

				}
				break;
			case 33 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:202: T__48
				{
				mT__48(); 

				}
				break;
			case 34 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:208: T__49
				{
				mT__49(); 

				}
				break;
			case 35 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:214: T__50
				{
				mT__50(); 

				}
				break;
			case 36 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:220: T__51
				{
				mT__51(); 

				}
				break;
			case 37 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:226: T__52
				{
				mT__52(); 

				}
				break;
			case 38 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:232: T__53
				{
				mT__53(); 

				}
				break;
			case 39 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:238: T__54
				{
				mT__54(); 

				}
				break;
			case 40 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:244: T__55
				{
				mT__55(); 

				}
				break;
			case 41 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:250: T__56
				{
				mT__56(); 

				}
				break;
			case 42 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:256: T__57
				{
				mT__57(); 

				}
				break;
			case 43 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:262: T__58
				{
				mT__58(); 

				}
				break;
			case 44 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:268: T__59
				{
				mT__59(); 

				}
				break;
			case 45 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:274: T__60
				{
				mT__60(); 

				}
				break;
			case 46 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:280: T__61
				{
				mT__61(); 

				}
				break;
			case 47 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:286: T__62
				{
				mT__62(); 

				}
				break;
			case 48 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:292: T__63
				{
				mT__63(); 

				}
				break;
			case 49 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:298: T__64
				{
				mT__64(); 

				}
				break;
			case 50 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:304: T__65
				{
				mT__65(); 

				}
				break;
			case 51 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:310: T__66
				{
				mT__66(); 

				}
				break;
			case 52 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:316: T__67
				{
				mT__67(); 

				}
				break;
			case 53 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:322: T__68
				{
				mT__68(); 

				}
				break;
			case 54 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:328: T__69
				{
				mT__69(); 

				}
				break;
			case 55 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:334: T__70
				{
				mT__70(); 

				}
				break;
			case 56 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:340: T__71
				{
				mT__71(); 

				}
				break;
			case 57 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:346: T__72
				{
				mT__72(); 

				}
				break;
			case 58 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:352: IDENT
				{
				mIDENT(); 

				}
				break;
			case 59 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:358: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 60 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:366: REAL
				{
				mREAL(); 

				}
				break;
			case 61 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:371: CHARCONST
				{
				mCHARCONST(); 

				}
				break;
			case 62 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:381: STRING
				{
				mSTRING(); 

				}
				break;
			case 63 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:388: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 64 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:396: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA4_eotS =
		"\1\uffff\1\2\1\uffff\1\2\1\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\60\1\uffff\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\71\1\110\1\uffff\1\110\1\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\1\1\uffff\1\2";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\12\1",
			"\12\3\7\uffff\6\4\1\uffff\1\4",
			"",
			"\12\3\7\uffff\6\4\1\uffff\1\4",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "137:1: INTEGER : ( DIGIT ( DIGIT )* | DIGIT ( HEX_DIGIT )* 'H' );";
		}
	}

	static final String DFA15_eotS =
		"\11\uffff\1\55\1\57\1\61\1\uffff\1\63\1\uffff\1\65\20\50\3\uffff\1\50"+
		"\5\uffff\1\120\14\uffff\4\50\1\133\3\50\1\137\1\50\1\141\1\142\3\50\1"+
		"\146\1\147\11\50\1\uffff\1\120\5\uffff\3\50\1\167\1\uffff\1\50\1\171\1"+
		"\50\1\uffff\1\50\2\uffff\1\50\1\176\1\177\2\uffff\7\50\1\u0087\3\50\1"+
		"\uffff\3\50\1\uffff\1\u008f\1\uffff\1\u0090\1\50\1\u0092\1\50\2\uffff"+
		"\5\50\1\u0099\1\50\1\uffff\1\50\1\u009c\1\u009d\1\u009f\1\u00a0\1\u00a1"+
		"\1\50\2\uffff\1\50\1\uffff\6\50\1\uffff\1\u00aa\1\u00ab\6\uffff\1\u00ac"+
		"\1\u00ad\1\u00ae\2\50\1\u00b1\1\u00b2\1\u00b3\5\uffff\2\50\4\uffff\1\50"+
		"\1\u00b7\1\uffff";
	static final String DFA15_eofS =
		"\u00b8\uffff";
	static final String DFA15_minS =
		"\1\11\10\uffff\1\56\1\52\1\75\1\uffff\1\75\1\uffff\1\75\1\122\1\105\1"+
		"\117\1\111\1\114\1\106\2\117\1\111\1\106\1\117\1\105\1\110\1\116\1\101"+
		"\1\110\3\uffff\1\141\5\uffff\1\56\1\41\13\uffff\1\122\1\107\1\116\1\126"+
		"\1\60\1\123\1\104\1\111\1\60\1\120\2\60\1\117\1\104\1\114\2\60\1\111\1"+
		"\117\1\103\1\105\1\124\1\122\1\111\1\124\1\163\1\uffff\1\56\1\60\2\uffff"+
		"\1\41\1\uffff\1\101\1\111\1\123\1\60\1\uffff\1\105\1\60\1\124\1\uffff"+
		"\1\117\2\uffff\1\120\2\60\2\uffff\1\116\1\103\1\117\1\105\1\125\1\116"+
		"\1\111\1\60\1\114\1\110\1\145\1\uffff\1\131\1\116\1\124\1\uffff\1\60\1"+
		"\uffff\1\60\1\122\1\60\1\114\2\uffff\1\124\1\105\1\122\1\101\1\122\1\60"+
		"\1\114\1\uffff\1\105\2\60\1\40\2\60\1\106\2\uffff\1\124\1\uffff\2\105"+
		"\2\104\1\124\1\116\1\uffff\2\60\6\uffff\3\60\1\122\1\125\3\60\5\uffff"+
		"\1\40\1\122\4\uffff\1\105\1\60\1\uffff";
	static final String DFA15_maxS =
		"\1\176\10\uffff\1\56\1\52\1\75\1\uffff\1\75\1\uffff\1\75\1\122\1\105\2"+
		"\117\1\130\1\123\2\117\1\111\2\122\1\105\1\110\1\116\1\101\1\111\3\uffff"+
		"\1\141\5\uffff\1\130\1\172\13\uffff\1\122\1\107\1\116\1\126\1\172\1\123"+
		"\1\104\1\111\1\172\1\120\2\172\1\117\1\104\1\114\2\172\1\111\1\117\1\124"+
		"\1\105\1\124\1\122\1\111\1\124\1\163\1\uffff\2\130\2\uffff\1\172\1\uffff"+
		"\1\101\1\111\1\123\1\172\1\uffff\1\105\1\172\1\124\1\uffff\1\117\2\uffff"+
		"\1\120\2\172\2\uffff\1\116\1\103\1\117\1\105\1\125\1\116\1\111\1\172\1"+
		"\114\1\110\1\145\1\uffff\1\131\1\116\1\124\1\uffff\1\172\1\uffff\1\172"+
		"\1\122\1\172\1\114\2\uffff\1\124\1\105\1\122\1\101\1\122\1\172\1\114\1"+
		"\uffff\1\105\5\172\1\106\2\uffff\1\124\1\uffff\2\105\2\104\1\124\1\116"+
		"\1\uffff\2\172\6\uffff\3\172\1\122\1\125\3\172\5\uffff\1\40\1\122\4\uffff"+
		"\1\105\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\16\1\uffff\1\21\21"+
		"\uffff\1\62\1\63\1\64\1\uffff\1\66\1\67\1\70\1\71\1\72\2\uffff\1\100\1"+
		"\12\1\11\1\77\1\13\1\15\1\14\1\20\1\17\1\23\1\22\32\uffff\1\73\2\uffff"+
		"\1\74\1\75\1\uffff\1\76\4\uffff\1\31\3\uffff\1\36\1\uffff\1\40\1\41\3"+
		"\uffff\1\46\1\47\13\uffff\1\75\3\uffff\1\30\1\uffff\1\34\4\uffff\1\43"+
		"\1\45\7\uffff\1\57\7\uffff\1\32\1\35\1\uffff\1\42\6\uffff\1\55\2\uffff"+
		"\1\61\1\65\1\24\1\25\1\26\1\27\10\uffff\1\56\1\60\1\33\1\37\1\44\2\uffff"+
		"\1\52\1\53\1\54\1\50\2\uffff\1\51";
	static final String DFA15_specialS =
		"\u00b8\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\52\1\1\2\uffff\1\2\1\uffff"+
			"\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\12\51\1\13\1\14\1\15\1\16\1\17\2"+
			"\uffff\1\20\1\21\1\22\1\23\1\24\3\50\1\25\2\50\1\26\1\27\1\30\1\31\1"+
			"\32\1\50\1\33\1\50\1\34\1\35\1\36\1\37\3\50\1\40\1\uffff\1\41\1\42\2"+
			"\uffff\2\50\1\43\27\50\1\44\1\45\1\46\1\47",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54",
			"\1\56",
			"\1\60",
			"",
			"\1\62",
			"",
			"\1\64",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\5\uffff\1\72",
			"\1\73\1\uffff\1\74\11\uffff\1\75",
			"\1\76\6\uffff\1\77\1\100\4\uffff\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105\13\uffff\1\106",
			"\1\107\2\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115\1\116",
			"",
			"",
			"",
			"\1\117",
			"",
			"",
			"",
			"",
			"",
			"\1\123\1\uffff\12\121\7\uffff\6\122\21\uffff\1\124",
			"\1\125\1\126\11\uffff\1\125\1\uffff\1\125\20\uffff\1\125\1\uffff\32"+
			"\125\6\uffff\32\125",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\134",
			"\1\135",
			"\1\136",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\140",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\150",
			"\1\151",
			"\1\152\14\uffff\1\153\3\uffff\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"",
			"\1\123\1\uffff\12\121\7\uffff\6\122\21\uffff\1\124",
			"\12\122\7\uffff\6\122\1\uffff\1\120\17\uffff\1\124",
			"",
			"",
			"\1\126\1\163\11\uffff\1\126\1\uffff\1\126\20\uffff\1\126\1\uffff\32"+
			"\126\6\uffff\32\126",
			"",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\170",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\172",
			"",
			"\1\173",
			"",
			"",
			"\1\174",
			"\12\50\7\uffff\24\50\1\175\5\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"",
			"\12\50\7\uffff\10\50\1\u008e\21\50\6\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0091",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0093",
			"",
			"",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u009a",
			"",
			"\1\u009b",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u009e\17\uffff\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00a2",
			"",
			"",
			"\1\u00a3",
			"",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00af",
			"\1\u00b0",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"",
			"",
			"",
			"\1\u00b6",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | IDENT | INTEGER | REAL | CHARCONST | STRING | COMMENT | WS );";
		}
	}

}
