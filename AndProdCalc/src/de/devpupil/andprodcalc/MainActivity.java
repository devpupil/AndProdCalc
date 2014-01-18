package de.devpupil.andprodcalc;

import de.devpupil.adapter.TabsPageAdapter;
import android.os.Bundle;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.app.ActionBar;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {
	
	private ViewPager viewPager;
	private TabsPageAdapter mAdapter;
	private ActionBar actionBar;
	// Tabs Titel
	private String[] tabs = { "Produktauswahl", "Produkt", "Eigenschaften" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Initialisieren der Tabs
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPageAdapter(getSupportFragmentManager());
		
		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));
		}
		
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				// wenn die Seite gewechselt wird, den entsprechenden Tab auswählen
				actionBar.setSelectedNavigationItem(position);
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Automatisch generierter Methodenstub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Automatisch generierter Methodenstub
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// das entsprechende Fragment anzeigen
		viewPager.setCurrentItem(tab.getPosition());
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Automatisch generierter Methodenstub
		
	}
	
	

}
