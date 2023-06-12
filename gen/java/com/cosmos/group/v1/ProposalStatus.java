// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/types.proto

package com.cosmos.group.v1;

/**
 * <pre>
 * ProposalStatus defines proposal statuses.
 * </pre>
 *
 * Protobuf enum {@code cosmos.group.v1.ProposalStatus}
 */
public enum ProposalStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * An empty value is invalid and not allowed.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_UNSPECIFIED = 0;</code>
   */
  PROPOSAL_STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * Initial status of a proposal when submitted.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_SUBMITTED = 1;</code>
   */
  PROPOSAL_STATUS_SUBMITTED(1),
  /**
   * <pre>
   * Final status of a proposal when the final tally is done and the outcome
   * passes the group policy's decision policy.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_ACCEPTED = 2;</code>
   */
  PROPOSAL_STATUS_ACCEPTED(2),
  /**
   * <pre>
   * Final status of a proposal when the final tally is done and the outcome
   * is rejected by the group policy's decision policy.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_REJECTED = 3;</code>
   */
  PROPOSAL_STATUS_REJECTED(3),
  /**
   * <pre>
   * Final status of a proposal when the group policy is modified before the
   * final tally.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_ABORTED = 4;</code>
   */
  PROPOSAL_STATUS_ABORTED(4),
  /**
   * <pre>
   * A proposal can be withdrawn before the voting start time by the owner.
   * When this happens the final status is Withdrawn.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_WITHDRAWN = 5;</code>
   */
  PROPOSAL_STATUS_WITHDRAWN(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * An empty value is invalid and not allowed.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int PROPOSAL_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Initial status of a proposal when submitted.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_SUBMITTED = 1;</code>
   */
  public static final int PROPOSAL_STATUS_SUBMITTED_VALUE = 1;
  /**
   * <pre>
   * Final status of a proposal when the final tally is done and the outcome
   * passes the group policy's decision policy.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_ACCEPTED = 2;</code>
   */
  public static final int PROPOSAL_STATUS_ACCEPTED_VALUE = 2;
  /**
   * <pre>
   * Final status of a proposal when the final tally is done and the outcome
   * is rejected by the group policy's decision policy.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_REJECTED = 3;</code>
   */
  public static final int PROPOSAL_STATUS_REJECTED_VALUE = 3;
  /**
   * <pre>
   * Final status of a proposal when the group policy is modified before the
   * final tally.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_ABORTED = 4;</code>
   */
  public static final int PROPOSAL_STATUS_ABORTED_VALUE = 4;
  /**
   * <pre>
   * A proposal can be withdrawn before the voting start time by the owner.
   * When this happens the final status is Withdrawn.
   * </pre>
   *
   * <code>PROPOSAL_STATUS_WITHDRAWN = 5;</code>
   */
  public static final int PROPOSAL_STATUS_WITHDRAWN_VALUE = 5;


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
  public static ProposalStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProposalStatus forNumber(int value) {
    switch (value) {
      case 0: return PROPOSAL_STATUS_UNSPECIFIED;
      case 1: return PROPOSAL_STATUS_SUBMITTED;
      case 2: return PROPOSAL_STATUS_ACCEPTED;
      case 3: return PROPOSAL_STATUS_REJECTED;
      case 4: return PROPOSAL_STATUS_ABORTED;
      case 5: return PROPOSAL_STATUS_WITHDRAWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProposalStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProposalStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProposalStatus>() {
          public ProposalStatus findValueByNumber(int number) {
            return ProposalStatus.forNumber(number);
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
    return com.cosmos.group.v1.TypesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ProposalStatus[] VALUES = values();

  public static ProposalStatus valueOf(
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

  private ProposalStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.group.v1.ProposalStatus)
}

