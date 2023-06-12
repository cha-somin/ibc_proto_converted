// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/ledger.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf enum {@code stafihub.stafihub.ledger.PoolBondState}
 */
public enum PoolBondState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ERA_UPDATED = 0 [(.gogoproto.enumvalue_customname) = "EraUpdated"];</code>
   */
  ERA_UPDATED(0),
  /**
   * <code>BOND_REPORTED = 1 [(.gogoproto.enumvalue_customname) = "BondReported"];</code>
   */
  BOND_REPORTED(1),
  /**
   * <code>ACTIVE_REPORTED = 2 [(.gogoproto.enumvalue_customname) = "ActiveReported"];</code>
   */
  ACTIVE_REPORTED(2),
  /**
   * <code>TRANSFER_SKIPPED = 3 [(.gogoproto.enumvalue_customname) = "TransferSkipped"];</code>
   */
  TRANSFER_SKIPPED(3),
  /**
   * <code>TRANSFER_REPORTED = 4 [(.gogoproto.enumvalue_customname) = "TransferReported"];</code>
   */
  TRANSFER_REPORTED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ERA_UPDATED = 0 [(.gogoproto.enumvalue_customname) = "EraUpdated"];</code>
   */
  public static final int ERA_UPDATED_VALUE = 0;
  /**
   * <code>BOND_REPORTED = 1 [(.gogoproto.enumvalue_customname) = "BondReported"];</code>
   */
  public static final int BOND_REPORTED_VALUE = 1;
  /**
   * <code>ACTIVE_REPORTED = 2 [(.gogoproto.enumvalue_customname) = "ActiveReported"];</code>
   */
  public static final int ACTIVE_REPORTED_VALUE = 2;
  /**
   * <code>TRANSFER_SKIPPED = 3 [(.gogoproto.enumvalue_customname) = "TransferSkipped"];</code>
   */
  public static final int TRANSFER_SKIPPED_VALUE = 3;
  /**
   * <code>TRANSFER_REPORTED = 4 [(.gogoproto.enumvalue_customname) = "TransferReported"];</code>
   */
  public static final int TRANSFER_REPORTED_VALUE = 4;


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
  public static PoolBondState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoolBondState forNumber(int value) {
    switch (value) {
      case 0: return ERA_UPDATED;
      case 1: return BOND_REPORTED;
      case 2: return ACTIVE_REPORTED;
      case 3: return TRANSFER_SKIPPED;
      case 4: return TRANSFER_REPORTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoolBondState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoolBondState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoolBondState>() {
          public PoolBondState findValueByNumber(int number) {
            return PoolBondState.forNumber(number);
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
    return com.stafihub.stafihub.ledger.LedgerProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final PoolBondState[] VALUES = values();

  public static PoolBondState valueOf(
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

  private PoolBondState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:stafihub.stafihub.ledger.PoolBondState)
}

