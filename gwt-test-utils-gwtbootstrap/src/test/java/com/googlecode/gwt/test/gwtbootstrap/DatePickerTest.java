package com.googlecode.gwt.test.gwtbootstrap;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mock;

import com.github.gwtbootstrap.client.ui.event.HideEvent;
import com.github.gwtbootstrap.client.ui.event.HideHandler;
import com.github.gwtbootstrap.client.ui.event.ShowEvent;
import com.github.gwtbootstrap.client.ui.event.ShowHandler;
import com.github.gwtbootstrap.datepicker.client.ui.DateBox;
import com.github.gwtbootstrap.datepicker.client.ui.util.LocaleUtil;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTestWithMockito;

@GwtModule("com.googlecode.gwt.test.gwtbootstrap.test.GwtBootstrapTest")
public class DatePickerTest extends GwtTestWithMockito {

   @Mock
   ShowHandler showHandler;

   @Mock
   HideHandler hideHandler;

   @Test
   public void testDateBox() {
      // avoid to call LocaleUtil.getBrowserLocale()
      LocaleUtil.forceLocale("en");

      DateBox dateBox = new DateBox();
      dateBox.setFormat("yyyy/MM/dd");
      dateBox.setLanguage("en");
      dateBox.setAutoClose(true);

      dateBox.addShowHandler(showHandler);
      dateBox.addHideHandler(hideHandler);

      dateBox.show();
      verify(showHandler).onShow(any(ShowEvent.class));

      dateBox.hide();
      verify(hideHandler).onHide(any(HideEvent.class));
   }
}
