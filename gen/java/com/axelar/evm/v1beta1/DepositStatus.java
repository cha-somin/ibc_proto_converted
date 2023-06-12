// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/types.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf enum {@code axelar.evm.v1beta1.DepositStatus}
 */
public enum DepositStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEPOSIT_STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "None"];</code>
   */
  DEPOSIT_STATUS_UNSPECIFIED(0),
  /**
   * <code>DEPOSIT_STATUS_PENDING = 1 [(.gogoproto.enumvalue_customname) = "Pending"];</code>
   */
  DEPOSIT_STATUS_PENDING(1),
  /**
   * <code>DEPOSIT_STATUS_CONFIRMED = 2 [(.gogoproto.enumvalue_customname) = "Confirmed"];</code>
   */
  DEPOSIT_STATUS_CONFIRMED(2),
  /**
   * <code>DEPOSIT_STATUS_BURNED = 3 [(.gogoproto.enumvalue_customname) = "Burned"];</code>
   */
  DEPOSIT_STATUS_BURNED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEPOSIT_STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "None"];</code>
   */
  public static final int DEPOSIT_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DEPOSIT_STATUS_PENDING = 1 [(.gogoproto.enumvalue_customname) = "Pending"];</code>
   */
  public static final int DEPOSIT_STATUS_PENDING_VALUE = 1;
  /**
   * <code>DEPOSIT_STATUS_CONFIRMED = 2 [(.gogoproto.enumvalue_customname) = "Confirmed"];</code>
   */
  public static final int DEPOSIT_STATUS_CONFIRMED_VALUE = 2;
  /**
   * <code>DEPOSIT_STATUS_BURNED = 3 [(.gogoproto.enumvalue_customname) = "Burned"];</code>
   */
  public static final int DEPOSIT_STATUS_BURNED_VALUE = 3;


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
  public static DepositStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DepositStatus forNumber(int value) {
    switch (value) {
      case 0: return DEPOSIT_STATUS_UNSPECIFIED;
      case 1: return DEPOSIT_STATUS_PENDING;
      case 2: return DEPOSIT_STATUS_CONFIRMED;
      case 3: return DEPOSIT_STATUS_BURNED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DepositStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DepositStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DepositStatus>() {
          public DepositStatus findValueByNumber(int number) {
            return DepositStatus.forNumber(number);
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
    return com.axelar.evm.v1beta1.TypesProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final DepositStatus[] VALUES = values();

  public static DepositStatus valueOf(
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

  private DepositStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:axelar.evm.v1beta1.DepositStatus)
}

