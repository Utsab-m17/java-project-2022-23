package dateTimeCurrencyAPI;

import java.util.Currency;
import java.util.Locale;

public class CurrencyAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency currency = Currency.getInstance(Locale.GERMANY);
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
		
		System.out.println(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
		System.out.println(Currency.getInstance(Locale.getDefault()).getSymbol());
		System.out.println(Currency.getInstance(Locale.getDefault()).getDisplayName());
		
		System.out.println(Currency.getInstance(Locale.UK).getCurrencyCode());
		System.out.println(Currency.getInstance(Locale.UK).getSymbol());
		System.out.println(Currency.getInstance(Locale.UK).getDisplayName());

//	    System.out.println(Locale.);
	}

}
