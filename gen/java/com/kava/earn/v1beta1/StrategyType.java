// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/earn/v1beta1/strategy.proto

package com.kava.earn.v1beta1;

/**
 * <pre>
 * StrategyType is the type of strategy that a vault uses to optimize yields.
 * </pre>
 *
 * Protobuf enum {@code kava.earn.v1beta1.StrategyType}
 */
public enum StrategyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * STRATEGY_TYPE_UNSPECIFIED represents an unspecified or invalid strategy type.
   * </pre>
   *
   * <code>STRATEGY_TYPE_UNSPECIFIED = 0;</code>
   */
  STRATEGY_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * STRATEGY_TYPE_HARD represents the strategy that deposits assets in the Hard
   * module.
   * </pre>
   *
   * <code>STRATEGY_TYPE_HARD = 1;</code>
   */
  STRATEGY_TYPE_HARD(1),
  /**
   * <pre>
   * STRATEGY_TYPE_SAVINGS represents the strategy that deposits assets in the
   * Savings module.
   * </pre>
   *
   * <code>STRATEGY_TYPE_SAVINGS = 2;</code>
   */
  STRATEGY_TYPE_SAVINGS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * STRATEGY_TYPE_UNSPECIFIED represents an unspecified or invalid strategy type.
   * </pre>
   *
   * <code>STRATEGY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int STRATEGY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * STRATEGY_TYPE_HARD represents the strategy that deposits assets in the Hard
   * module.
   * </pre>
   *
   * <code>STRATEGY_TYPE_HARD = 1;</code>
   */
  public static final int STRATEGY_TYPE_HARD_VALUE = 1;
  /**
   * <pre>
   * STRATEGY_TYPE_SAVINGS represents the strategy that deposits assets in the
   * Savings module.
   * </pre>
   *
   * <code>STRATEGY_TYPE_SAVINGS = 2;</code>
   */
  public static final int STRATEGY_TYPE_SAVINGS_VALUE = 2;


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
  public static StrategyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StrategyType forNumber(int value) {
    switch (value) {
      case 0: return STRATEGY_TYPE_UNSPECIFIED;
      case 1: return STRATEGY_TYPE_HARD;
      case 2: return STRATEGY_TYPE_SAVINGS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StrategyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StrategyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StrategyType>() {
          public StrategyType findValueByNumber(int number) {
            return StrategyType.forNumber(number);
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
    return com.kava.earn.v1beta1.StrategyProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final StrategyType[] VALUES = values();

  public static StrategyType valueOf(
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

  private StrategyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:kava.earn.v1beta1.StrategyType)
}

