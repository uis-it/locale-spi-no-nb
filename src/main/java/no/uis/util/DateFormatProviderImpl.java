package no.uis.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

public class DateFormatProviderImpl extends DateFormatProvider {

  private static final Locale LOCALE_NB_NO = new Locale("nb", "NO");
  private static final Locale LOCALE_NO = new Locale("no");
  
  private static final Locale[] locales = {LOCALE_NB_NO};

  public DateFormatProviderImpl() {
  }
  
  @Override
  public Locale[] getAvailableLocales() {
    return locales;
  }

  @Override
  public DateFormat getDateInstance(int style, Locale locale) {
    return SimpleDateFormat.getDateInstance(style, LOCALE_NO);
  }

  @Override
  public DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale) {
    return SimpleDateFormat.getDateTimeInstance(dateStyle, timeStyle, LOCALE_NO);
  }

  @Override
  public DateFormat getTimeInstance(int style, Locale locale) {
    return SimpleDateFormat.getTimeInstance(style, LOCALE_NO);
  }
}
