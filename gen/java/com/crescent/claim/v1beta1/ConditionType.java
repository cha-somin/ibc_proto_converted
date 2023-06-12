// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/claim/v1beta1/claim.proto

package com.crescent.claim.v1beta1;

/**
 * <pre>
 * ConditionType defines the type of condition that a recipient must execute in order to receive a claimable amount.
 * </pre>
 *
 * Protobuf enum {@code crescent.claim.v1beta1.ConditionType}
 */
public enum ConditionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * CONDITION_TYPE_UNSPECIFIED specifies an unknown condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "ConditionTypeUnspecified"];</code>
   */
  CONDITION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * CONDITION_TYPE_DEPOSIT specifies deposit condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_DEPOSIT = 1 [(.gogoproto.enumvalue_customname) = "ConditionTypeDeposit"];</code>
   */
  CONDITION_TYPE_DEPOSIT(1),
  /**
   * <pre>
   * CONDITION_TYPE_SWAP specifies swap condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_SWAP = 2 [(.gogoproto.enumvalue_customname) = "ConditionTypeSwap"];</code>
   */
  CONDITION_TYPE_SWAP(2),
  /**
   * <pre>
   * CONDITION_TYPE_LIQUIDSTAKE specifies liquid stake condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_LIQUIDSTAKE = 3 [(.gogoproto.enumvalue_customname) = "ConditionTypeLiquidStake"];</code>
   */
  CONDITION_TYPE_LIQUIDSTAKE(3),
  /**
   * <pre>
   * CONDITION_TYPE_VOTE specifies governance vote condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_VOTE = 4 [(.gogoproto.enumvalue_customname) = "ConditionTypeVote"];</code>
   */
  CONDITION_TYPE_VOTE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * CONDITION_TYPE_UNSPECIFIED specifies an unknown condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "ConditionTypeUnspecified"];</code>
   */
  public static final int CONDITION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * CONDITION_TYPE_DEPOSIT specifies deposit condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_DEPOSIT = 1 [(.gogoproto.enumvalue_customname) = "ConditionTypeDeposit"];</code>
   */
  public static final int CONDITION_TYPE_DEPOSIT_VALUE = 1;
  /**
   * <pre>
   * CONDITION_TYPE_SWAP specifies swap condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_SWAP = 2 [(.gogoproto.enumvalue_customname) = "ConditionTypeSwap"];</code>
   */
  public static final int CONDITION_TYPE_SWAP_VALUE = 2;
  /**
   * <pre>
   * CONDITION_TYPE_LIQUIDSTAKE specifies liquid stake condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_LIQUIDSTAKE = 3 [(.gogoproto.enumvalue_customname) = "ConditionTypeLiquidStake"];</code>
   */
  public static final int CONDITION_TYPE_LIQUIDSTAKE_VALUE = 3;
  /**
   * <pre>
   * CONDITION_TYPE_VOTE specifies governance vote condition type
   * </pre>
   *
   * <code>CONDITION_TYPE_VOTE = 4 [(.gogoproto.enumvalue_customname) = "ConditionTypeVote"];</code>
   */
  public static final int CONDITION_TYPE_VOTE_VALUE = 4;


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
  public static ConditionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConditionType forNumber(int value) {
    switch (value) {
      case 0: return CONDITION_TYPE_UNSPECIFIED;
      case 1: return CONDITION_TYPE_DEPOSIT;
      case 2: return CONDITION_TYPE_SWAP;
      case 3: return CONDITION_TYPE_LIQUIDSTAKE;
      case 4: return CONDITION_TYPE_VOTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConditionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConditionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConditionType>() {
          public ConditionType findValueByNumber(int number) {
            return ConditionType.forNumber(number);
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
    return com.crescent.claim.v1beta1.ClaimProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ConditionType[] VALUES = values();

  public static ConditionType valueOf(
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

  private ConditionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:crescent.claim.v1beta1.ConditionType)
}

