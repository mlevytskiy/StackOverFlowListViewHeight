package listviewheight.stackoverflow.mlevytskiy.stackoverflowlistviewheight;

import java.util.ArrayList;

/**
 * Created by max on 09.09.15.
 */
public class WordDefinition {
    String word,definition;

    public WordDefinition(String word,ArrayList<String> alldefinition) {
        this.word=word;

        StringBuilder stringBuilder=new StringBuilder();
        for (String string : alldefinition) {
            stringBuilder.append(string);
        }
        this.word=stringBuilder.toString();

    }

    public WordDefinition(String word,String alldefinition) {
        this.word=word;
        this.definition=alldefinition;

    }


}
