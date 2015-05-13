package mg.strongpasswordgenerator;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {
	
	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("a15357da93e19dd");
	    
	    
	    interstitial.setAdListener(new AdListener() {
	        @Override
	        public void onAdLoaded() {
	          
	        	displayInterstitial();

	          
	        }
	        @Override
	        public void onAdFailedToLoad(int errorCode) {
	          
	        }
	    });
		
	    // Create ad request.
	    
	    AdRequest adRequest = new AdRequest.Builder().build();
	    
	    
	    
	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequest);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void gP(View view) {
		try{
		EditText  mEdit   = (EditText)findViewById(R.id.editText1);
		int n=Integer.parseInt(mEdit.getText().toString());
		String output="";
		ArrayList<String> aC=new ArrayList<String>();
		aC.add("A") ;
		aC.add("B") ;
		aC.add("C") ;
		aC.add("D") ;
		aC.add("E") ;
		aC.add("F") ;
		aC.add("G") ;
		aC.add("H") ;
		aC.add("I") ;
		aC.add("J") ;
		aC.add("K") ;
		aC.add("L") ;
		aC.add("M") ;
		aC.add("N") ;
		aC.add("O") ;
		aC.add("P") ;
		aC.add("Q") ;
		aC.add("R") ;
		aC.add("S") ;
		aC.add("T") ;
		aC.add("U") ;
		aC.add("V") ;
		aC.add("W") ;
		aC.add("X") ;
		aC.add("Y") ;
		aC.add("Z") ;
		aC.add("a") ;
		aC.add("b") ;
		aC.add("c") ;
		aC.add("d") ;
		aC.add("e") ;
		aC.add("f") ;
		aC.add("g") ;
		aC.add("h") ;
		aC.add("i") ;
		aC.add("j") ;
		aC.add("k") ;
		aC.add("l") ;
		aC.add("m") ;
		aC.add("n") ;
		aC.add("o") ;
		aC.add("p") ;
		aC.add("q") ;
		aC.add("r") ;
		aC.add("s") ;
		aC.add("t") ;
		aC.add("u") ;
		aC.add("v") ;
		aC.add("w") ;
		aC.add("x") ;
		aC.add("y") ;
		aC.add("z") ;
		aC.add("0") ;
		aC.add("1") ;
		aC.add("2") ;
		aC.add("3") ;
		aC.add("4") ;
		aC.add("5") ;
		aC.add("6") ;
		aC.add("7") ;
		aC.add("8") ;
		aC.add("9") ;
		
		
		CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox1);
		if(checkBox.isChecked())
		{
			aC.add("`"); 
			aC.add("!"); 
			aC.add("\""); 
			aC.add("?"); 
			aC.add("$"); 
			aC.add("%"); 
			aC.add("^"); 
			aC.add("&"); 
			aC.add("*"); 
			aC.add("("); 
			aC.add(")"); 
			aC.add("_"); 
			aC.add("-"); 
			aC.add("+"); 
			aC.add("="); 
			aC.add("{"); 
			aC.add("["); 
			aC.add("}"); 
			aC.add("]"); 
			aC.add(":"); 
			aC.add(";"); 
			aC.add("@"); 
			aC.add("'"); 
			aC.add("~"); 
			aC.add("#"); 
			aC.add("|"); 
			aC.add("\\"); 
			aC.add("<"); 
			aC.add(","); 
			aC.add(">"); 
			aC.add("."); 
			aC.add("/"); 
		}
		for(int i=0;i<n;i++)
		{
		output+=aC.get((int)Math.floor(Math.random()*(aC.size())));

		}
		
		TextView textView = (TextView) findViewById(R.id.textView2);
		textView.setText(output);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	// Invoke displayInterstitial() when you are ready to display an interstitial.
	  public void displayInterstitial() {
	    if (interstitial.isLoaded()) {
	      interstitial.show();
	    }
	  }

}
