package aplikasi.planet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class ContentActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {		 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
		Intent i = getIntent();
		final String planet = i.getStringExtra("nm_planet");
		Button gambar = (Button)findViewById(R.id.gbr_planet);
		TextView nama = (TextView) findViewById(R.id.nama_planet);
		TextView des1 = (TextView) findViewById(R.id.deskripsi1);
		TextView des2 = (TextView) findViewById(R.id.deskripsi2);
		gambar.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				arg0.startAnimation(animScale);
				new Handler().postDelayed(new Runnable() {        
		     		 @Override
		             public void run() {
		     			Intent a = new Intent(ContentActivity.this,DetailContentActivity.class);
						a.putExtra("nm_planet", planet);
						startActivity(a);
		                }
		            }, 300);					
			}});
		nama.setText(planet);
		if(planet.equals("Merkurius")){
			gambar.setBackgroundResource(R.drawable.ct_mercury);
			des1.setText(R.string.ct_merkurius1);
			des2.setText(R.string.ct_merkurius2);
		}
		else if(planet.equals("Venus")){
			gambar.setBackgroundResource(R.drawable.ct_venus);
			des1.setText(R.string.ct_venus1);
			des2.setText(R.string.ct_venus2);
		}
		else if(planet.equals("Bumi")){
			gambar.setBackgroundResource(R.drawable.ct_earth);
			des1.setText(R.string.ct_bumi1);
			des2.setText(R.string.ct_bumi2);
		}
		else if(planet.equals("Mars")){
			gambar.setBackgroundResource(R.drawable.ct_mars);
			des1.setText(R.string.ct_mars1);
			des2.setText(R.string.ct_mars2);
		}
		else if(planet.equals("Jupiter")){
			gambar.setBackgroundResource(R.drawable.ct_jupiter);
			des1.setText(R.string.ct_jupiter1);
			des2.setText(R.string.ct_jupiter2);
		}
		else if(planet.equals("Saturnus")){
			gambar.setBackgroundResource(R.drawable.ct_saturn);
			des1.setText(R.string.ct_saturnus1);
			des2.setText(R.string.ct_saturnus2);
		}
		else if(planet.equals("Uranus")){
			gambar.setBackgroundResource(R.drawable.ct_uranus);
			des1.setText(R.string.ct_uranus1);
			des2.setText(R.string.ct_uranus2);
		}
		else{
			gambar.setBackgroundResource(R.drawable.ct_neptune);
			des1.setText(R.string.ct_neptunus1);
			des2.setText(R.string.ct_neptunus2);
		}
	}	     
}
