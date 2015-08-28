import java.io.StringReader;
import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.process.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;
/**
 * Template for ex1 of 11791 F15
*/
public class SimpleTokenizer {
  /**
   * Tokenize a sentence in the argument, and print out
   * the tokens to the console.
   *
   * @param args
* * */
//Set the first argument as the sentence to be tokenized.
  public static void main(String[] args) {
    String sentence = "What… is the air-speed velocity of an unladen swallow?";
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(sentence));
    System.out.println(tokenizer.tokenize());
} }