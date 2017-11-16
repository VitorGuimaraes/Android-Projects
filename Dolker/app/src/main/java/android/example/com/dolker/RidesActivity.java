package android.example.com.dolker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RidesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create arrays
        String dogName[] = new String[]{"Rufus", "Luna", "Maromba", "Raika"};
        String dolkerName[] = new String[]{"Aninha", "Biel", "Joan", "Sarah"};
        String ridePrice[] = new String[]{"R$2,50", "R$5,00", "R$3,00", "R$3,50"};
        String rideDate[] = new String[]{"10/07/17", "02/07/17", "26/06/17", "22/06/17"};
        String rideHour[] = new String[]{"8:10", "9:55", "7:30", "15:00"};
        String rideTime[] = new String[]{"30min", "20min", "25min", "30min"};

        int dogProfileImg[] = new int[]{R.drawable.dog2, R.drawable.dog1, R.drawable.dog3, R.drawable.dog4};
        int dolkerProfileImg[] = new int[]{R.drawable.ana, R.drawable.biel, R.drawable.joan, R.drawable.sarah};

        ArrayList<DataPack> data = new ArrayList<DataPack>();
        int x = dogName.length;

        for(int i = 0; i < x; i++){
            //Create DataPack object and pass parameter
            data.add(new DataPack(dogName[i], dolkerName[i], ridePrice[i],
                    rideDate[i], rideHour[i], rideTime[i], dogProfileImg[i], dolkerProfileImg[i]));
        }

        RidesAdapter adapter = new RidesAdapter(this, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
