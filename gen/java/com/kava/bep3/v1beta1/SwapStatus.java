// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/bep3/v1beta1/bep3.proto

package com.kava.bep3.v1beta1;

/**
 * <pre>
 * SwapStatus is the status of an AtomicSwap
 * </pre>
 *
 * Protobuf enum {@code kava.bep3.v1beta1.SwapStatus}
 */
public enum SwapStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * SWAP_STATUS_UNSPECIFIED represents an unspecified status
   * </pre>
   *
   * <code>SWAP_STATUS_UNSPECIFIED = 0;</code>
   */
  SWAP_STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * SWAP_STATUS_OPEN represents an open swap
   * </pre>
   *
   * <code>SWAP_STATUS_OPEN = 1;</code>
   */
  SWAP_STATUS_OPEN(1),
  /**
   * <pre>
   * SWAP_STATUS_COMPLETED represents a completed swap
   * </pre>
   *
   * <code>SWAP_STATUS_COMPLETED = 2;</code>
   */
  SWAP_STATUS_COMPLETED(2),
  /**
   * <pre>
   * SWAP_STATUS_EXPIRED represents an expired swap
   * </pre>
   *
   * <code>SWAP_STATUS_EXPIRED = 3;</code>
   */
  SWAP_STATUS_EXPIRED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * SWAP_STATUS_UNSPECIFIED represents an unspecified status
   * </pre>
   *
   * <code>SWAP_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int SWAP_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * SWAP_STATUS_OPEN represents an open swap
   * </pre>
   *
   * <code>SWAP_STATUS_OPEN = 1;</code>
   */
  public static final int SWAP_STATUS_OPEN_VALUE = 1;
  /**
   * <pre>
   * SWAP_STATUS_COMPLETED represents a completed swap
   * </pre>
   *
   * <code>SWAP_STATUS_COMPLETED = 2;</code>
   */
  public static final int SWAP_STATUS_COMPLETED_VALUE = 2;
  /**
   * <pre>
   * SWAP_STATUS_EXPIRED represents an expired swap
   * </pre>
   *
   * <code>SWAP_STATUS_EXPIRED = 3;</code>
   */
  public static final int SWAP_STATUS_EXPIRED_VALUE = 3;


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
  public static SwapStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SwapStatus forNumber(int value) {
    switch (value) {
      case 0: return SWAP_STATUS_UNSPECIFIED;
      case 1: return SWAP_STATUS_OPEN;
      case 2: return SWAP_STATUS_COMPLETED;
      case 3: return SWAP_STATUS_EXPIRED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SwapStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SwapStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SwapStatus>() {
          public SwapStatus findValueByNumber(int number) {
            return SwapStatus.forNumber(number);
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
    return com.kava.bep3.v1beta1.Bep3Proto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SwapStatus[] VALUES = values();

  public static SwapStatus valueOf(
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

  private SwapStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:kava.bep3.v1beta1.SwapStatus)
}

