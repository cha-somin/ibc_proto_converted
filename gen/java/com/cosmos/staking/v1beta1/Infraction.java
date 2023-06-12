// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * Infraction indicates the infraction a validator commited.
 * </pre>
 *
 * Protobuf enum {@code cosmos.staking.v1beta1.Infraction}
 */
public enum Infraction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * UNSPECIFIED defines an empty infraction.
   * </pre>
   *
   * <code>INFRACTION_UNSPECIFIED = 0;</code>
   */
  INFRACTION_UNSPECIFIED(0),
  /**
   * <pre>
   * DOUBLE_SIGN defines a validator that double-signs a block.
   * </pre>
   *
   * <code>INFRACTION_DOUBLE_SIGN = 1;</code>
   */
  INFRACTION_DOUBLE_SIGN(1),
  /**
   * <pre>
   * DOWNTIME defines a validator that missed signing too many blocks.
   * </pre>
   *
   * <code>INFRACTION_DOWNTIME = 2;</code>
   */
  INFRACTION_DOWNTIME(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * UNSPECIFIED defines an empty infraction.
   * </pre>
   *
   * <code>INFRACTION_UNSPECIFIED = 0;</code>
   */
  public static final int INFRACTION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * DOUBLE_SIGN defines a validator that double-signs a block.
   * </pre>
   *
   * <code>INFRACTION_DOUBLE_SIGN = 1;</code>
   */
  public static final int INFRACTION_DOUBLE_SIGN_VALUE = 1;
  /**
   * <pre>
   * DOWNTIME defines a validator that missed signing too many blocks.
   * </pre>
   *
   * <code>INFRACTION_DOWNTIME = 2;</code>
   */
  public static final int INFRACTION_DOWNTIME_VALUE = 2;


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
  public static Infraction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Infraction forNumber(int value) {
    switch (value) {
      case 0: return INFRACTION_UNSPECIFIED;
      case 1: return INFRACTION_DOUBLE_SIGN;
      case 2: return INFRACTION_DOWNTIME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Infraction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Infraction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Infraction>() {
          public Infraction findValueByNumber(int number) {
            return Infraction.forNumber(number);
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
    return com.cosmos.staking.v1beta1.StakingProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Infraction[] VALUES = values();

  public static Infraction valueOf(
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

  private Infraction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.staking.v1beta1.Infraction)
}

