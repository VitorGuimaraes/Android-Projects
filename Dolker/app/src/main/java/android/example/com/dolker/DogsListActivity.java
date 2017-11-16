package android.example.com.dolker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DogsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create arrays
        String dogName[] = new String[]{"Luna", "Bidu", "Maromba", "Raika"};
        String dogBreed[] = new String[]{"Poodle", "Bichon Havanês", "Chiuaua", "Pastor Alemão"};
        String dogAge[] = new String[]{"5", "1", "2", "4"};
        String dogWeight[] = new String[]{"3kg", "1kg", "2.5kg", "8kg"};
        int dogProfileImg[] = new int[]{R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4};

        ArrayList<DataPack> data = new ArrayList<DataPack>();
        int x = dogName.length;

        //Add data to ArrayList
        for(int i = 0; i < x; i++){
            //Create DataPack object and pass parameter
            data.add(new DataPack(dogName[i], dogBreed[i], dogAge[i], dogWeight[i], dogProfileImg[i]));
        }

        DogListAdapter adapter = new DogListAdapter(this, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
