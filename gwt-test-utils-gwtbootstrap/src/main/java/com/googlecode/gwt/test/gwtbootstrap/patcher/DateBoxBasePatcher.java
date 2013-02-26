package com.googlecode.gwt.test.gwtbootstrap.patcher;

import com.github.gwtbootstrap.datepicker.client.ui.base.DateBoxBase;
import com.google.gwt.dom.client.Element;
import com.googlecode.gwt.test.patchers.PatchClass;
import com.googlecode.gwt.test.patchers.PatchMethod;

/**
 * Patcher for {@link DateBoxBase}
 * 
 * @author Kenichiro Tanaka
 * 
 */
@PatchClass(DateBoxBase.class)
class DateBoxBasePatcher {

   @PatchMethod
   static void updateValue(DateBoxBase dateBoxBase, Element e) {
   }

   @PatchMethod
   static void execute(DateBoxBase dateBoxBase, String cmd) {
      if ("show".equals(cmd)) {
         dateBoxBase.onShow();
      } else if ("hide".equals(cmd)) {
         dateBoxBase.onHide();
      }
   }
}
