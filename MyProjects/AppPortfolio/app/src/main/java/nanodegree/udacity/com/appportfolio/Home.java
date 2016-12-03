package nanodegree.udacity.com.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {

    Button btnPopularMovies,btnStockHawk,btnBuildItBigger,btnMakeYourAppMaterial,btnGoUbiquitous,btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPopularMovies=(Button) findViewById(R.id.btnPopularMovies);
        btnStockHawk=(Button) findViewById(R.id.btnStockHawk);
        btnBuildItBigger=(Button) findViewById(R.id.btnBuildItBigger);
        btnMakeYourAppMaterial=(Button) findViewById(R.id.btnMakeYourApp);
        btnGoUbiquitous=(Button) findViewById(R.id.btnGoUbiquitous);
        btnCapstone=(Button)findViewById(R.id.btnCapstone);

        btnPopularMovies.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnMakeYourAppMaterial.setOnClickListener(this);
        btnGoUbiquitous.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    String message = "This button will launch my ";
    String projectName="";
        switch (view.getId()){
            case R.id.btnPopularMovies:
                projectName="Popular Movies";
                break;
            case R.id.btnStockHawk:
                projectName="Stock Hawk";
                break;
            case R.id.btnBuildItBigger:
                projectName="Build It Bigger";
                break;
            case R.id.btnMakeYourApp:
                projectName="Make your App material";
                break;
            case R.id.btnGoUbiquitous:
                projectName="Go Ubiquitous";
                break;
            case R.id.btnCapstone:
                projectName="Capstone";
                break;
        }
        Toast.makeText(Home.this, message+projectName+" Project", Toast.LENGTH_LONG).show();
    }
}
