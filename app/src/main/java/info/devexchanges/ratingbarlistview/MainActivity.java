package info.devexchanges.ratingbarlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<Movie> adapter;
    private ArrayList<Movie> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        setLisData();
        adapter = new ListViewAdapter(this, R.layout.item_listview, arrayList);
        listView.setAdapter(adapter);

    }

    private void setLisData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Movie(1, "Avenger 2: Age of Ultron", "USA"));
        arrayList.add(new Movie(1, "Ant man", "USA"));
        arrayList.add(new Movie(1, "Ted 2", "USA"));
        arrayList.add(new Movie(1, "Cities In Love", "China"));
        arrayList.add(new Movie(1, "Attack on Titan 2: End of the World", "Japan"));
        arrayList.add(new Movie(1, "Dragon Ball Z: The Fall of Men", "France"));
        arrayList.add(new Movie(1, "Hitman: Agent 47", "USA"));
        arrayList.add(new Movie(1, "Criminal Activities", "USA"));
        arrayList.add(new Movie(1, "The Witness", "China"));
        arrayList.add(new Movie(1, "Paris Holiday ", "HongKong"));
        arrayList.add(new Movie(1, "The Beauty Inside", "Korea"));
        arrayList.add(new Movie(1, "Phantom", ""));
        arrayList.add(new Movie(1, "Youth", "France"));
        arrayList.add(new Movie(1, "The Third Way Of Love", "China"));
        arrayList.add(new Movie(1, "Maze Runner 2: The Scorch Trials", "USA"));


    }

}
