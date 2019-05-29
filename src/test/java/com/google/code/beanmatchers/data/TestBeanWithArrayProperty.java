package com.google.code.beanmatchers.data;

public class TestBeanWithArrayProperty {

  private int[] field1;

  public int[] getField1() {
    return field1 == null ? null : field1.clone();
  }

  public void setField1(int[] field1) {
    this.field1 = field1 == null ? null : field1.clone();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TestBeanWithArrayProperty that = (TestBeanWithArrayProperty) o;

    if (field1 != null ? !field1.equals(that.field1) : that.field1 != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return field1 != null ? field1.hashCode() : 0;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{field1=" + field1 + "}";
  }
}
