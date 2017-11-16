package android.example.com.dolker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CallDolkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create arrays
        String dolkerName[] = new String[]{"Allex", "Nicholas", "Chicão", "Hitin", "David"};
        String dolkerAge[] = new String[]{"22", "23", "22", "25", "23"};
        String dolkerRegion[] = new String[]{"Bairro de Fátima", "Parangaba", "Parquelândia", "Anywhere", "Bairro de Fátima"};
        int dolkerProfileImg[] = new int[]{R.drawable.allex, R.drawable.nicholas, R.drawable.chicao, R.drawable.hitin, R.drawable.david};

        ArrayList<DataPack> data = new ArrayList<DataPack>();
        int x = dolkerName.length;

        //Add data to ArrayList
        for(int i = 0; i < x; i++){
            //Create DataPack object and pass parameter
            data.add(new DataPack(dolkerName[i], dolkerAge[i], dolkerRegion[i], dolkerProfileImg[i]));
        }

        DolkerAdapter adapter = new DolkerAdapter(this, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
