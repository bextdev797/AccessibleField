//AccessibleField written by Bextdev

package com.bextdev.AccessibleField; 

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Component;
import java.lang.reflect.Field;

public class AccessibleField extends AndroidNonvisibleComponent {
  private Field field;

  public AccessibleField(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void Initialize(Component component, String fieldName) throws Exception {
    field = component.getClass().getDeclaredField(fieldName);
    field.setAccessible(true);        
  }
}
