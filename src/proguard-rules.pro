# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.AccessibleField.AccessibleField {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/AccessibleField/repack'
-flattenpackagehierarchy
-dontpreverify
