package aplikasi.planet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailContentActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detailcontent);
		Intent i = getIntent();
		final String planet = i.getStringExtra("nm_planet");
		ImageView gbr = (ImageView)findViewById(R.id.imageView1);
		TextView deskrip = (TextView) findViewById(R.id.dt_diskrip);
		
		if(planet.equals("Merkurius")){
			gbr.setImageResource(R.drawable.dt_mercury);
			deskrip.setText(R.string.dt_merkurius1);
		}
		else if(planet.equals("Venus")){
			gbr.setImageResource(R.drawable.dt_venus);
			deskrip.setText(R.string.dt_venus1);
		}
		else if(planet.equals("Bumi")){
			gbr.setImageResource(R.drawable.dt_earth);
			deskrip.setText(R.string.dt_bumi1);
		}
		else if(planet.equals("Mars")){
			gbr.setImageResource(R.drawable.dt_mars);
			deskrip.setText(R.string.dt_mars1);
		}
		else if(planet.equals("Jupiter")){
			gbr.setImageResource(R.drawable.dt_jupiter);
			deskrip.setText(R.string.dt_jupiter1);
		}
		else if(planet.equals("Saturnus")){
			gbr.setImageResource(R.drawable.dt_saturnus);
			deskrip.setText(R.string.dt_saturnus1);
		}
		else if(planet.equals("Uranus")){
			gbr.setImageResource(R.drawable.dt_uranus);
			deskrip.setText(R.string.dt_uranus1);
		}
		else{
			gbr.setImageResource(R.drawable.dt_neptune);
			deskrip.setText(R.string.dt_neptunus1);
		}
	}	     
}
