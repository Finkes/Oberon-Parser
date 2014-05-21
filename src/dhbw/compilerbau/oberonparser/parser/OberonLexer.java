// $ANTLR 3.5.2 /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g 2014-05-21 17:46:50
package dhbw.compilerbau.oberonparser.parser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OberonLexer extends Lexer {
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

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:9:6: ( '.' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:9:8: '.'
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
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:10:6: ( ';' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:10:8: ';'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:11:6: ( 'BEGIN' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:11:8: 'BEGIN'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:6: ( 'END' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:12:8: 'END'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:7: ( 'IMPORT' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:13:9: 'IMPORT'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:7: ( 'MODULE' )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:14:9: 'MODULE'
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
	// $ANTLR end "T__11"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:21:25: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:24:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
		// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | ID | WS )
		int alt3=8;
		switch ( input.LA(1) ) {
		case '.':
			{
			alt3=1;
			}
			break;
		case ';':
			{
			alt3=2;
			}
			break;
		case 'B':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='E') ) {
				int LA3_9 = input.LA(3);
				if ( (LA3_9=='G') ) {
					int LA3_13 = input.LA(4);
					if ( (LA3_13=='I') ) {
						int LA3_17 = input.LA(5);
						if ( (LA3_17=='N') ) {
							int LA3_21 = input.LA(6);
							if ( ((LA3_21 >= '0' && LA3_21 <= '9')||(LA3_21 >= 'A' && LA3_21 <= 'Z')||(LA3_21 >= 'a' && LA3_21 <= 'z')) ) {
								alt3=7;
							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'E':
			{
			int LA3_4 = input.LA(2);
			if ( (LA3_4=='N') ) {
				int LA3_10 = input.LA(3);
				if ( (LA3_10=='D') ) {
					int LA3_14 = input.LA(4);
					if ( ((LA3_14 >= '0' && LA3_14 <= '9')||(LA3_14 >= 'A' && LA3_14 <= 'Z')||(LA3_14 >= 'a' && LA3_14 <= 'z')) ) {
						alt3=7;
					}

					else {
						alt3=4;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'I':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='M') ) {
				int LA3_11 = input.LA(3);
				if ( (LA3_11=='P') ) {
					int LA3_15 = input.LA(4);
					if ( (LA3_15=='O') ) {
						int LA3_19 = input.LA(5);
						if ( (LA3_19=='R') ) {
							int LA3_22 = input.LA(6);
							if ( (LA3_22=='T') ) {
								int LA3_25 = input.LA(7);
								if ( ((LA3_25 >= '0' && LA3_25 <= '9')||(LA3_25 >= 'A' && LA3_25 <= 'Z')||(LA3_25 >= 'a' && LA3_25 <= 'z')) ) {
									alt3=7;
								}

								else {
									alt3=5;
								}

							}

							else {
								alt3=7;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'M':
			{
			int LA3_6 = input.LA(2);
			if ( (LA3_6=='O') ) {
				int LA3_12 = input.LA(3);
				if ( (LA3_12=='D') ) {
					int LA3_16 = input.LA(4);
					if ( (LA3_16=='U') ) {
						int LA3_20 = input.LA(5);
						if ( (LA3_20=='L') ) {
							int LA3_23 = input.LA(6);
							if ( (LA3_23=='E') ) {
								int LA3_26 = input.LA(7);
								if ( ((LA3_26 >= '0' && LA3_26 <= '9')||(LA3_26 >= 'A' && LA3_26 <= 'Z')||(LA3_26 >= 'a' && LA3_26 <= 'z')) ) {
									alt3=7;
								}

								else {
									alt3=6;
								}

							}

							else {
								alt3=7;
							}

						}

						else {
							alt3=7;
						}

					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=7;
				}

			}

			else {
				alt3=7;
			}

			}
			break;
		case 'A':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=7;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:42: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// /home/dominik/dev/java/OberonParser/src/dhbw/compilerbau/oberonparser/parser/Oberon.g:1:45: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
