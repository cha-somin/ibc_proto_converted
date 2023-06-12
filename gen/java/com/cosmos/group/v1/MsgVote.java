// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/tx.proto

package com.cosmos.group.v1;

/**
 * <pre>
 * MsgVote is the Msg/Vote request type.
 * </pre>
 *
 * Protobuf type {@code cosmos.group.v1.MsgVote}
 */
public final class MsgVote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.group.v1.MsgVote)
    MsgVoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgVote.newBuilder() to construct.
  private MsgVote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgVote() {
    voter_ = "";
    option_ = 0;
    metadata_ = "";
    exec_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgVote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgVote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgVote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.group.v1.MsgVote.class, com.cosmos.group.v1.MsgVote.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <pre>
   * proposal is the unique ID of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
   * @return The proposalId.
   */
  @java.lang.Override
  public long getProposalId() {
    return proposalId_;
  }

  public static final int VOTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object voter_ = "";
  /**
   * <pre>
   * voter is the voter account address.
   * </pre>
   *
   * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The voter.
   */
  @java.lang.Override
  public java.lang.String getVoter() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * voter is the voter account address.
   * </pre>
   *
   * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for voter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVoterBytes() {
    java.lang.Object ref = voter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTION_FIELD_NUMBER = 3;
  private int option_ = 0;
  /**
   * <pre>
   * option is the voter's choice on the proposal.
   * </pre>
   *
   * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
   * @return The enum numeric value on the wire for option.
   */
  @java.lang.Override public int getOptionValue() {
    return option_;
  }
  /**
   * <pre>
   * option is the voter's choice on the proposal.
   * </pre>
   *
   * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
   * @return The option.
   */
  @java.lang.Override public com.cosmos.group.v1.VoteOption getOption() {
    com.cosmos.group.v1.VoteOption result = com.cosmos.group.v1.VoteOption.forNumber(option_);
    return result == null ? com.cosmos.group.v1.VoteOption.UNRECOGNIZED : result;
  }

  public static final int METADATA_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metadata_ = "";
  /**
   * <pre>
   * metadata is any arbitrary metadata attached to the vote.
   * </pre>
   *
   * <code>string metadata = 4 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public java.lang.String getMetadata() {
    java.lang.Object ref = metadata_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadata_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * metadata is any arbitrary metadata attached to the vote.
   * </pre>
   *
   * <code>string metadata = 4 [json_name = "metadata"];</code>
   * @return The bytes for metadata.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetadataBytes() {
    java.lang.Object ref = metadata_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metadata_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXEC_FIELD_NUMBER = 5;
  private int exec_ = 0;
  /**
   * <pre>
   * exec defines whether the proposal should be executed
   * immediately after voting or not.
   * </pre>
   *
   * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
   * @return The enum numeric value on the wire for exec.
   */
  @java.lang.Override public int getExecValue() {
    return exec_;
  }
  /**
   * <pre>
   * exec defines whether the proposal should be executed
   * immediately after voting or not.
   * </pre>
   *
   * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
   * @return The exec.
   */
  @java.lang.Override public com.cosmos.group.v1.Exec getExec() {
    com.cosmos.group.v1.Exec result = com.cosmos.group.v1.Exec.forNumber(exec_);
    return result == null ? com.cosmos.group.v1.Exec.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, voter_);
    }
    if (option_ != com.cosmos.group.v1.VoteOption.VOTE_OPTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, option_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadata_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, metadata_);
    }
    if (exec_ != com.cosmos.group.v1.Exec.EXEC_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, exec_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, voter_);
    }
    if (option_ != com.cosmos.group.v1.VoteOption.VOTE_OPTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, option_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadata_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, metadata_);
    }
    if (exec_ != com.cosmos.group.v1.Exec.EXEC_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, exec_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cosmos.group.v1.MsgVote)) {
      return super.equals(obj);
    }
    com.cosmos.group.v1.MsgVote other = (com.cosmos.group.v1.MsgVote) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (option_ != other.option_) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
    if (exec_ != other.exec_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    hash = (37 * hash) + OPTION_FIELD_NUMBER;
    hash = (53 * hash) + option_;
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (37 * hash) + EXEC_FIELD_NUMBER;
    hash = (53 * hash) + exec_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.group.v1.MsgVote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.group.v1.MsgVote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.group.v1.MsgVote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.MsgVote parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cosmos.group.v1.MsgVote prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgVote is the Msg/Vote request type.
   * </pre>
   *
   * Protobuf type {@code cosmos.group.v1.MsgVote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.group.v1.MsgVote)
      com.cosmos.group.v1.MsgVoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.group.v1.MsgVote.class, com.cosmos.group.v1.MsgVote.Builder.class);
    }

    // Construct using com.cosmos.group.v1.MsgVote.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      proposalId_ = 0L;
      voter_ = "";
      option_ = 0;
      metadata_ = "";
      exec_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.group.v1.TxProto.internal_static_cosmos_group_v1_MsgVote_descriptor;
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgVote getDefaultInstanceForType() {
      return com.cosmos.group.v1.MsgVote.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgVote build() {
      com.cosmos.group.v1.MsgVote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.group.v1.MsgVote buildPartial() {
      com.cosmos.group.v1.MsgVote result = new com.cosmos.group.v1.MsgVote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.group.v1.MsgVote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voter_ = voter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.option_ = option_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.metadata_ = metadata_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.exec_ = exec_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.group.v1.MsgVote) {
        return mergeFrom((com.cosmos.group.v1.MsgVote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.group.v1.MsgVote other) {
      if (other == com.cosmos.group.v1.MsgVote.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.option_ != 0) {
        setOptionValue(other.getOptionValue());
      }
      if (!other.getMetadata().isEmpty()) {
        metadata_ = other.metadata_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.exec_ != 0) {
        setExecValue(other.getExecValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              proposalId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              voter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              option_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              metadata_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              exec_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long proposalId_ ;
    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return The proposalId.
     */
    @java.lang.Override
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @param value The proposalId to set.
     * @return This builder for chaining.
     */
    public Builder setProposalId(long value) {

      proposalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal is the unique ID of the proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object voter_ = "";
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The voter.
     */
    public java.lang.String getVoter() {
      java.lang.Object ref = voter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for voter.
     */
    public com.google.protobuf.ByteString
        getVoterBytes() {
      java.lang.Object ref = voter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      voter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoter() {
      voter_ = getDefaultInstance().getVoter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * voter is the voter account address.
     * </pre>
     *
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      voter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int option_ = 0;
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     * @param value The enum numeric value on the wire for option to set.
     * @return This builder for chaining.
     */
    public Builder setOptionValue(int value) {
      option_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     * @return The option.
     */
    @java.lang.Override
    public com.cosmos.group.v1.VoteOption getOption() {
      com.cosmos.group.v1.VoteOption result = com.cosmos.group.v1.VoteOption.forNumber(option_);
      return result == null ? com.cosmos.group.v1.VoteOption.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     * @param value The option to set.
     * @return This builder for chaining.
     */
    public Builder setOption(com.cosmos.group.v1.VoteOption value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      option_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * option is the voter's choice on the proposal.
     * </pre>
     *
     * <code>.cosmos.group.v1.VoteOption option = 3 [json_name = "option"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOption() {
      bitField0_ = (bitField0_ & ~0x00000004);
      option_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object metadata_ = "";
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public java.lang.String getMetadata() {
      java.lang.Object ref = metadata_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadata_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     * @return The bytes for metadata.
     */
    public com.google.protobuf.ByteString
        getMetadataBytes() {
      java.lang.Object ref = metadata_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metadata_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      metadata_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {
      metadata_ = getDefaultInstance().getMetadata();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * metadata is any arbitrary metadata attached to the vote.
     * </pre>
     *
     * <code>string metadata = 4 [json_name = "metadata"];</code>
     * @param value The bytes for metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      metadata_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int exec_ = 0;
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
     * @return The enum numeric value on the wire for exec.
     */
    @java.lang.Override public int getExecValue() {
      return exec_;
    }
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
     * @param value The enum numeric value on the wire for exec to set.
     * @return This builder for chaining.
     */
    public Builder setExecValue(int value) {
      exec_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
     * @return The exec.
     */
    @java.lang.Override
    public com.cosmos.group.v1.Exec getExec() {
      com.cosmos.group.v1.Exec result = com.cosmos.group.v1.Exec.forNumber(exec_);
      return result == null ? com.cosmos.group.v1.Exec.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
     * @param value The exec to set.
     * @return This builder for chaining.
     */
    public Builder setExec(com.cosmos.group.v1.Exec value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      exec_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * exec defines whether the proposal should be executed
     * immediately after voting or not.
     * </pre>
     *
     * <code>.cosmos.group.v1.Exec exec = 5 [json_name = "exec"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExec() {
      bitField0_ = (bitField0_ & ~0x00000010);
      exec_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cosmos.group.v1.MsgVote)
  }

  // @@protoc_insertion_point(class_scope:cosmos.group.v1.MsgVote)
  private static final com.cosmos.group.v1.MsgVote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.group.v1.MsgVote();
  }

  public static com.cosmos.group.v1.MsgVote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgVote>
      PARSER = new com.google.protobuf.AbstractParser<MsgVote>() {
    @java.lang.Override
    public MsgVote parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgVote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgVote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.group.v1.MsgVote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

