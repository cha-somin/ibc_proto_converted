// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/claim/claim.proto

package com.stride.claim;

/**
 * Protobuf enum {@code stride.claim.Action}
 */
public enum Action
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ACTION_FREE = 0;</code>
   */
  ACTION_FREE(0),
  /**
   * <code>ACTION_LIQUID_STAKE = 1;</code>
   */
  ACTION_LIQUID_STAKE(1),
  /**
   * <code>ACTION_DELEGATE_STAKE = 2;</code>
   */
  ACTION_DELEGATE_STAKE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ACTION_FREE = 0;</code>
   */
  public static final int ACTION_FREE_VALUE = 0;
  /**
   * <code>ACTION_LIQUID_STAKE = 1;</code>
   */
  public static final int ACTION_LIQUID_STAKE_VALUE = 1;
  /**
   * <code>ACTION_DELEGATE_STAKE = 2;</code>
   */
  public static final int ACTION_DELEGATE_STAKE_VALUE = 2;


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
  public static Action valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Action forNumber(int value) {
    switch (value) {
      case 0: return ACTION_FREE;
      case 1: return ACTION_LIQUID_STAKE;
      case 2: return ACTION_DELEGATE_STAKE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Action>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Action> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Action>() {
          public Action findValueByNumber(int number) {
            return Action.forNumber(number);
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
    return com.stride.claim.ClaimProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Action[] VALUES = values();

  public static Action valueOf(
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

  private Action(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:stride.claim.Action)
}

