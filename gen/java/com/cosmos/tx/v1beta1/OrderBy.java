// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package com.cosmos.tx.v1beta1;

/**
 * <pre>
 * OrderBy defines the sorting order
 * </pre>
 *
 * Protobuf enum {@code cosmos.tx.v1beta1.OrderBy}
 */
public enum OrderBy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * ORDER_BY_UNSPECIFIED specifies an unknown sorting order. OrderBy defaults
   * to ASC in this case.
   * </pre>
   *
   * <code>ORDER_BY_UNSPECIFIED = 0;</code>
   */
  ORDER_BY_UNSPECIFIED(0),
  /**
   * <pre>
   * ORDER_BY_ASC defines ascending order
   * </pre>
   *
   * <code>ORDER_BY_ASC = 1;</code>
   */
  ORDER_BY_ASC(1),
  /**
   * <pre>
   * ORDER_BY_DESC defines descending order
   * </pre>
   *
   * <code>ORDER_BY_DESC = 2;</code>
   */
  ORDER_BY_DESC(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * ORDER_BY_UNSPECIFIED specifies an unknown sorting order. OrderBy defaults
   * to ASC in this case.
   * </pre>
   *
   * <code>ORDER_BY_UNSPECIFIED = 0;</code>
   */
  public static final int ORDER_BY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * ORDER_BY_ASC defines ascending order
   * </pre>
   *
   * <code>ORDER_BY_ASC = 1;</code>
   */
  public static final int ORDER_BY_ASC_VALUE = 1;
  /**
   * <pre>
   * ORDER_BY_DESC defines descending order
   * </pre>
   *
   * <code>ORDER_BY_DESC = 2;</code>
   */
  public static final int ORDER_BY_DESC_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OrderBy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrderBy forNumber(int value) {
    switch (value) {
      case 0: return ORDER_BY_UNSPECIFIED;
      case 1: return ORDER_BY_ASC;
      case 2: return ORDER_BY_DESC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrderBy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrderBy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrderBy>() {
          public OrderBy findValueByNumber(int number) {
            return OrderBy.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.cosmos.tx.v1beta1.ServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OrderBy[] VALUES = values();

  public static OrderBy valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OrderBy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.tx.v1beta1.OrderBy)
}

