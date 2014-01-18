package de.devpupil.adapter;

import de.devpupil.andprodcalc.Eigenschaften;
import de.devpupil.andprodcalc.Produkt;
import de.devpupil.andprodcalc.ProduktAuswahl;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPageAdapter extends FragmentPagerAdapter {

	public TabsPageAdapter(FragmentManager fm) {
		super(fm);
		// TODO Automatisch generierter Konstruktorstub
	}
	
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			//Produktauswahl
			return new ProduktAuswahl();
		case 1:
			// Produkt selber
			return new Produkt();
		case 2:
			//Eigenschaften des Produkts
			return new Eigenschaften();		}
		return null;
		
	}

	@Override
	public int getCount() {
		// gibt die Anzahl der tabs zurück
		return 3;
	}
}
