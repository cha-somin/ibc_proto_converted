// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/subscription/v2/subscription.proto

package com.sentinel.subscription.v2;

/**
 * Protobuf enum {@code sentinel.subscription.v2.SubscriptionType}
 */
public enum SubscriptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "TypeUnspecified"];</code>
   */
  TYPE_UNSPECIFIED(0),
  /**
   * <code>TYPE_NODE = 1 [(.gogoproto.enumvalue_customname) = "TypeNode"];</code>
   */
  TYPE_NODE(1),
  /**
   * <code>TYPE_PLAN = 2 [(.gogoproto.enumvalue_customname) = "TypePlan"];</code>
   */
  TYPE_PLAN(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "TypeUnspecified"];</code>
   */
  public static final int TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TYPE_NODE = 1 [(.gogoproto.enumvalue_customname) = "TypeNode"];</code>
   */
  public static final int TYPE_NODE_VALUE = 1;
  /**
   * <code>TYPE_PLAN = 2 [(.gogoproto.enumvalue_customname) = "TypePlan"];</code>
   */
  public static final int TYPE_PLAN_VALUE = 2;


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
  public static SubscriptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SubscriptionType forNumber(int value) {
    switch (value) {
      case 0: return TYPE_UNSPECIFIED;
      case 1: return TYPE_NODE;
      case 2: return TYPE_PLAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SubscriptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SubscriptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SubscriptionType>() {
          public SubscriptionType findValueByNumber(int number) {
            return SubscriptionType.forNumber(number);
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
    return com.sentinel.subscription.v2.SubscriptionProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SubscriptionType[] VALUES = values();

  public static SubscriptionType valueOf(
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

  private SubscriptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sentinel.subscription.v2.SubscriptionType)
}

