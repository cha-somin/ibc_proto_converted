// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/claim/v1beta1/claim_record.proto

package com.publicawesome.stargaze.claim.v1beta1;

/**
 * Protobuf enum {@code publicawesome.stargaze.claim.v1beta1.Action}
 */
public enum Action
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ActionInitialClaim = 0;</code>
   */
  ActionInitialClaim(0),
  /**
   * <code>ActionBidNFT = 1;</code>
   */
  ActionBidNFT(1),
  /**
   * <code>ActionMintNFT = 2;</code>
   */
  ActionMintNFT(2),
  /**
   * <code>ActionVote = 3;</code>
   */
  ActionVote(3),
  /**
   * <code>ActionDelegateStake = 4;</code>
   */
  ActionDelegateStake(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ActionInitialClaim = 0;</code>
   */
  public static final int ActionInitialClaim_VALUE = 0;
  /**
   * <code>ActionBidNFT = 1;</code>
   */
  public static final int ActionBidNFT_VALUE = 1;
  /**
   * <code>ActionMintNFT = 2;</code>
   */
  public static final int ActionMintNFT_VALUE = 2;
  /**
   * <code>ActionVote = 3;</code>
   */
  public static final int ActionVote_VALUE = 3;
  /**
   * <code>ActionDelegateStake = 4;</code>
   */
  public static final int ActionDelegateStake_VALUE = 4;


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
      case 0: return ActionInitialClaim;
      case 1: return ActionBidNFT;
      case 2: return ActionMintNFT;
      case 3: return ActionVote;
      case 4: return ActionDelegateStake;
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
    return com.publicawesome.stargaze.claim.v1beta1.ClaimRecordProto.getDescriptor().getEnumTypes().get(0);
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

  // @@protoc_insertion_point(enum_scope:publicawesome.stargaze.claim.v1beta1.Action)
}

