package listviewheight.stackoverflow.mlevytskiy.stackoverflowlistviewheight;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    public static final String PREFS_NAME = "MyPrefsFile1";

    private TextView mTextView;
    private ListView mListView;

    ListView dictionaryListView;

    ArrayList<WordDefinition> allWordDefinitions = new ArrayList<WordDefinition>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dictionaryListView = (ListView) findViewById(R.id.dictionaryListView);
        mTextView = (TextView) findViewById(R.id.text);
        mListView = (ListView) findViewById(R.id.list);
        allWordDefinitions = new ArrayList<>(Arrays.asList(Mock.array));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dictionaryListView.setAdapter(new BaseAdapter() {

                    @Override
                    public View getView(int position, View view, ViewGroup arg2) {
                        if (view == null) {
                            view = getLayoutInflater().inflate(R.layout.item, arg2, false);
                        }
                        TextView textView = (TextView) view.findViewById(R.id.listItemTextView);
                        textView.setText(allWordDefinitions.get(position).word);

                        return view;
                    }

                    @Override
                    public long getItemId(int arg0) {
                        // TODO Auto-generated method stub
                        return 0;
                    }

                    @Override
                    public Object getItem(int arg0) {
                        // TODO Auto-generated method stub
                        return null;
                    }

                    @Override
                    public int getCount() {
                        // TODO Auto-generated method stub
                        return allWordDefinitions.size();
                    }
                });
            }
        }, 2000);
    }
}
