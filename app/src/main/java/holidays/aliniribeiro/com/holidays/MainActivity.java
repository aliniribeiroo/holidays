package holidays.aliniribeiro.com.holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView monthsList;
    private String[] months = {
            "Janeiro","Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};

    private String[] holidays = {
            "01/01 - Confraternização Universal",
            "28/02 - Carnaval",
            "01/03 - Quarta-Feira de Cinzas",
            "14/04 - Paixão de Cristo" + '\n' + "21/04 - Tiradentes",
            "01/05 - Dia do trabalhador" + '\n' + "14/05 - Dia das mães",
            "12/06 - Dia dos Namorados" + '\n' + "15/06 Corpus Christi",
            "Não há feriados em Julho",
            "13/08 - Dia dos Pais",
            "07/09 - Independência do Brasil",
            "12/10 - Dia das Crianças",
            "01/11 - Finados" + '\n' + "15/01 Proclamação da Republica",
            "25/12 - Natal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monthsList = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                months
        );

        monthsList.setAdapter(adapter);
        monthsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int clickPosition = position;
                Toast.makeText(getApplicationContext(), holidays[clickPosition], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
