/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.kvdb;

public class kvdbAccessJNI {
  public final static native long new_Access();
  public final static native void delete_Access(long jarg1);
  public final static native boolean Access_open(long jarg1, Access jarg1_, String jarg2, String jarg3);
  public final static native boolean Access_write(long jarg1, Access jarg1_, String jarg2, String jarg3);
  public final static native boolean Access_update(long jarg1, Access jarg1_, String jarg2, String jarg3);
  public final static native String Access_read(long jarg1, Access jarg1_, String jarg2);
  public final static native boolean Access_remove(long jarg1, Access jarg1_, String jarg2);
}
