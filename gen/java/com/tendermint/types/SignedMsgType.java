// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

/**
 * <pre>
 * SignedMsgType is a type of signed message in the consensus.
 * </pre>
 *
 * Protobuf enum {@code tendermint.types.SignedMsgType}
 */
public enum SignedMsgType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SIGNED_MSG_TYPE_UNKNOWN = 0 [(.gogoproto.enumvalue_customname) = "UnknownType"];</code>
   */
  SIGNED_MSG_TYPE_UNKNOWN(0),
  /**
   * <pre>
   * Votes
   * </pre>
   *
   * <code>SIGNED_MSG_TYPE_PREVOTE = 1 [(.gogoproto.enumvalue_customname) = "PrevoteType"];</code>
   */
  SIGNED_MSG_TYPE_PREVOTE(1),
  /**
   * <code>SIGNED_MSG_TYPE_PRECOMMIT = 2 [(.gogoproto.enumvalue_customname) = "PrecommitType"];</code>
   */
  SIGNED_MSG_TYPE_PRECOMMIT(2),
  /**
   * <pre>
   * Proposals
   * </pre>
   *
   * <code>SIGNED_MSG_TYPE_PROPOSAL = 32 [(.gogoproto.enumvalue_customname) = "ProposalType"];</code>
   */
  SIGNED_MSG_TYPE_PROPOSAL(32),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SIGNED_MSG_TYPE_UNKNOWN = 0 [(.gogoproto.enumvalue_customname) = "UnknownType"];</code>
   */
  public static final int SIGNED_MSG_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Votes
   * </pre>
   *
   * <code>SIGNED_MSG_TYPE_PREVOTE = 1 [(.gogoproto.enumvalue_customname) = "PrevoteType"];</code>
   */
  public static final int SIGNED_MSG_TYPE_PREVOTE_VALUE = 1;
  /**
   * <code>SIGNED_MSG_TYPE_PRECOMMIT = 2 [(.gogoproto.enumvalue_customname) = "PrecommitType"];</code>
   */
  public static final int SIGNED_MSG_TYPE_PRECOMMIT_VALUE = 2;
  /**
   * <pre>
   * Proposals
   * </pre>
   *
   * <code>SIGNED_MSG_TYPE_PROPOSAL = 32 [(.gogoproto.enumvalue_customname) = "ProposalType"];</code>
   */
  public static final int SIGNED_MSG_TYPE_PROPOSAL_VALUE = 32;


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
  public static SignedMsgType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SignedMsgType forNumber(int value) {
    switch (value) {
      case 0: return SIGNED_MSG_TYPE_UNKNOWN;
      case 1: return SIGNED_MSG_TYPE_PREVOTE;
      case 2: return SIGNED_MSG_TYPE_PRECOMMIT;
      case 32: return SIGNED_MSG_TYPE_PROPOSAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SignedMsgType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SignedMsgType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SignedMsgType>() {
          public SignedMsgType findValueByNumber(int number) {
            return SignedMsgType.forNumber(number);
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
    return com.tendermint.types.TypesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SignedMsgType[] VALUES = values();

  public static SignedMsgType valueOf(
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

  private SignedMsgType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tendermint.types.SignedMsgType)
}

