// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/evidence.proto

package com.tendermint.types;

/**
 * <pre>
 * DuplicateVoteEvidence contains evidence of a validator signed two conflicting votes.
 * </pre>
 *
 * Protobuf type {@code tendermint.types.DuplicateVoteEvidence}
 */
public final class DuplicateVoteEvidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.DuplicateVoteEvidence)
    DuplicateVoteEvidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DuplicateVoteEvidence.newBuilder() to construct.
  private DuplicateVoteEvidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DuplicateVoteEvidence() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DuplicateVoteEvidence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.EvidenceProto.internal_static_tendermint_types_DuplicateVoteEvidence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.EvidenceProto.internal_static_tendermint_types_DuplicateVoteEvidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.DuplicateVoteEvidence.class, com.tendermint.types.DuplicateVoteEvidence.Builder.class);
  }

  public static final int VOTE_A_FIELD_NUMBER = 1;
  private com.tendermint.types.Vote voteA_;
  /**
   * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
   * @return Whether the voteA field is set.
   */
  @java.lang.Override
  public boolean hasVoteA() {
    return voteA_ != null;
  }
  /**
   * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
   * @return The voteA.
   */
  @java.lang.Override
  public com.tendermint.types.Vote getVoteA() {
    return voteA_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteA_;
  }
  /**
   * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.VoteOrBuilder getVoteAOrBuilder() {
    return voteA_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteA_;
  }

  public static final int VOTE_B_FIELD_NUMBER = 2;
  private com.tendermint.types.Vote voteB_;
  /**
   * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
   * @return Whether the voteB field is set.
   */
  @java.lang.Override
  public boolean hasVoteB() {
    return voteB_ != null;
  }
  /**
   * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
   * @return The voteB.
   */
  @java.lang.Override
  public com.tendermint.types.Vote getVoteB() {
    return voteB_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteB_;
  }
  /**
   * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.VoteOrBuilder getVoteBOrBuilder() {
    return voteB_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteB_;
  }

  public static final int TOTAL_VOTING_POWER_FIELD_NUMBER = 3;
  private long totalVotingPower_ = 0L;
  /**
   * <code>int64 total_voting_power = 3 [json_name = "totalVotingPower"];</code>
   * @return The totalVotingPower.
   */
  @java.lang.Override
  public long getTotalVotingPower() {
    return totalVotingPower_;
  }

  public static final int VALIDATOR_POWER_FIELD_NUMBER = 4;
  private long validatorPower_ = 0L;
  /**
   * <code>int64 validator_power = 4 [json_name = "validatorPower"];</code>
   * @return The validatorPower.
   */
  @java.lang.Override
  public long getValidatorPower() {
    return validatorPower_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
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
    if (voteA_ != null) {
      output.writeMessage(1, getVoteA());
    }
    if (voteB_ != null) {
      output.writeMessage(2, getVoteB());
    }
    if (totalVotingPower_ != 0L) {
      output.writeInt64(3, totalVotingPower_);
    }
    if (validatorPower_ != 0L) {
      output.writeInt64(4, validatorPower_);
    }
    if (timestamp_ != null) {
      output.writeMessage(5, getTimestamp());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (voteA_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVoteA());
    }
    if (voteB_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVoteB());
    }
    if (totalVotingPower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalVotingPower_);
    }
    if (validatorPower_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, validatorPower_);
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTimestamp());
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
    if (!(obj instanceof com.tendermint.types.DuplicateVoteEvidence)) {
      return super.equals(obj);
    }
    com.tendermint.types.DuplicateVoteEvidence other = (com.tendermint.types.DuplicateVoteEvidence) obj;

    if (hasVoteA() != other.hasVoteA()) return false;
    if (hasVoteA()) {
      if (!getVoteA()
          .equals(other.getVoteA())) return false;
    }
    if (hasVoteB() != other.hasVoteB()) return false;
    if (hasVoteB()) {
      if (!getVoteB()
          .equals(other.getVoteB())) return false;
    }
    if (getTotalVotingPower()
        != other.getTotalVotingPower()) return false;
    if (getValidatorPower()
        != other.getValidatorPower()) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
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
    if (hasVoteA()) {
      hash = (37 * hash) + VOTE_A_FIELD_NUMBER;
      hash = (53 * hash) + getVoteA().hashCode();
    }
    if (hasVoteB()) {
      hash = (37 * hash) + VOTE_B_FIELD_NUMBER;
      hash = (53 * hash) + getVoteB().hashCode();
    }
    hash = (37 * hash) + TOTAL_VOTING_POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalVotingPower());
    hash = (37 * hash) + VALIDATOR_POWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValidatorPower());
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tendermint.types.DuplicateVoteEvidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tendermint.types.DuplicateVoteEvidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.DuplicateVoteEvidence parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.DuplicateVoteEvidence prototype) {
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
   * DuplicateVoteEvidence contains evidence of a validator signed two conflicting votes.
   * </pre>
   *
   * Protobuf type {@code tendermint.types.DuplicateVoteEvidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.DuplicateVoteEvidence)
      com.tendermint.types.DuplicateVoteEvidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.EvidenceProto.internal_static_tendermint_types_DuplicateVoteEvidence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.EvidenceProto.internal_static_tendermint_types_DuplicateVoteEvidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.DuplicateVoteEvidence.class, com.tendermint.types.DuplicateVoteEvidence.Builder.class);
    }

    // Construct using com.tendermint.types.DuplicateVoteEvidence.newBuilder()
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
      voteA_ = null;
      if (voteABuilder_ != null) {
        voteABuilder_.dispose();
        voteABuilder_ = null;
      }
      voteB_ = null;
      if (voteBBuilder_ != null) {
        voteBBuilder_.dispose();
        voteBBuilder_ = null;
      }
      totalVotingPower_ = 0L;
      validatorPower_ = 0L;
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.EvidenceProto.internal_static_tendermint_types_DuplicateVoteEvidence_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.DuplicateVoteEvidence getDefaultInstanceForType() {
      return com.tendermint.types.DuplicateVoteEvidence.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.DuplicateVoteEvidence build() {
      com.tendermint.types.DuplicateVoteEvidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.DuplicateVoteEvidence buildPartial() {
      com.tendermint.types.DuplicateVoteEvidence result = new com.tendermint.types.DuplicateVoteEvidence(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.types.DuplicateVoteEvidence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.voteA_ = voteABuilder_ == null
            ? voteA_
            : voteABuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voteB_ = voteBBuilder_ == null
            ? voteB_
            : voteBBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalVotingPower_ = totalVotingPower_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validatorPower_ = validatorPower_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tendermint.types.DuplicateVoteEvidence) {
        return mergeFrom((com.tendermint.types.DuplicateVoteEvidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.DuplicateVoteEvidence other) {
      if (other == com.tendermint.types.DuplicateVoteEvidence.getDefaultInstance()) return this;
      if (other.hasVoteA()) {
        mergeVoteA(other.getVoteA());
      }
      if (other.hasVoteB()) {
        mergeVoteB(other.getVoteB());
      }
      if (other.getTotalVotingPower() != 0L) {
        setTotalVotingPower(other.getTotalVotingPower());
      }
      if (other.getValidatorPower() != 0L) {
        setValidatorPower(other.getValidatorPower());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
            case 10: {
              input.readMessage(
                  getVoteAFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getVoteBFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              totalVotingPower_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              validatorPower_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.tendermint.types.Vote voteA_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder> voteABuilder_;
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     * @return Whether the voteA field is set.
     */
    public boolean hasVoteA() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     * @return The voteA.
     */
    public com.tendermint.types.Vote getVoteA() {
      if (voteABuilder_ == null) {
        return voteA_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteA_;
      } else {
        return voteABuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public Builder setVoteA(com.tendermint.types.Vote value) {
      if (voteABuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        voteA_ = value;
      } else {
        voteABuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public Builder setVoteA(
        com.tendermint.types.Vote.Builder builderForValue) {
      if (voteABuilder_ == null) {
        voteA_ = builderForValue.build();
      } else {
        voteABuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public Builder mergeVoteA(com.tendermint.types.Vote value) {
      if (voteABuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          voteA_ != null &&
          voteA_ != com.tendermint.types.Vote.getDefaultInstance()) {
          getVoteABuilder().mergeFrom(value);
        } else {
          voteA_ = value;
        }
      } else {
        voteABuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public Builder clearVoteA() {
      bitField0_ = (bitField0_ & ~0x00000001);
      voteA_ = null;
      if (voteABuilder_ != null) {
        voteABuilder_.dispose();
        voteABuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public com.tendermint.types.Vote.Builder getVoteABuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVoteAFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    public com.tendermint.types.VoteOrBuilder getVoteAOrBuilder() {
      if (voteABuilder_ != null) {
        return voteABuilder_.getMessageOrBuilder();
      } else {
        return voteA_ == null ?
            com.tendermint.types.Vote.getDefaultInstance() : voteA_;
      }
    }
    /**
     * <code>.tendermint.types.Vote vote_a = 1 [json_name = "voteA"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder> 
        getVoteAFieldBuilder() {
      if (voteABuilder_ == null) {
        voteABuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder>(
                getVoteA(),
                getParentForChildren(),
                isClean());
        voteA_ = null;
      }
      return voteABuilder_;
    }

    private com.tendermint.types.Vote voteB_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder> voteBBuilder_;
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     * @return Whether the voteB field is set.
     */
    public boolean hasVoteB() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     * @return The voteB.
     */
    public com.tendermint.types.Vote getVoteB() {
      if (voteBBuilder_ == null) {
        return voteB_ == null ? com.tendermint.types.Vote.getDefaultInstance() : voteB_;
      } else {
        return voteBBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public Builder setVoteB(com.tendermint.types.Vote value) {
      if (voteBBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        voteB_ = value;
      } else {
        voteBBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public Builder setVoteB(
        com.tendermint.types.Vote.Builder builderForValue) {
      if (voteBBuilder_ == null) {
        voteB_ = builderForValue.build();
      } else {
        voteBBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public Builder mergeVoteB(com.tendermint.types.Vote value) {
      if (voteBBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          voteB_ != null &&
          voteB_ != com.tendermint.types.Vote.getDefaultInstance()) {
          getVoteBBuilder().mergeFrom(value);
        } else {
          voteB_ = value;
        }
      } else {
        voteBBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public Builder clearVoteB() {
      bitField0_ = (bitField0_ & ~0x00000002);
      voteB_ = null;
      if (voteBBuilder_ != null) {
        voteBBuilder_.dispose();
        voteBBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public com.tendermint.types.Vote.Builder getVoteBBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVoteBFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    public com.tendermint.types.VoteOrBuilder getVoteBOrBuilder() {
      if (voteBBuilder_ != null) {
        return voteBBuilder_.getMessageOrBuilder();
      } else {
        return voteB_ == null ?
            com.tendermint.types.Vote.getDefaultInstance() : voteB_;
      }
    }
    /**
     * <code>.tendermint.types.Vote vote_b = 2 [json_name = "voteB"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder> 
        getVoteBFieldBuilder() {
      if (voteBBuilder_ == null) {
        voteBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.Vote, com.tendermint.types.Vote.Builder, com.tendermint.types.VoteOrBuilder>(
                getVoteB(),
                getParentForChildren(),
                isClean());
        voteB_ = null;
      }
      return voteBBuilder_;
    }

    private long totalVotingPower_ ;
    /**
     * <code>int64 total_voting_power = 3 [json_name = "totalVotingPower"];</code>
     * @return The totalVotingPower.
     */
    @java.lang.Override
    public long getTotalVotingPower() {
      return totalVotingPower_;
    }
    /**
     * <code>int64 total_voting_power = 3 [json_name = "totalVotingPower"];</code>
     * @param value The totalVotingPower to set.
     * @return This builder for chaining.
     */
    public Builder setTotalVotingPower(long value) {

      totalVotingPower_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_voting_power = 3 [json_name = "totalVotingPower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalVotingPower() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalVotingPower_ = 0L;
      onChanged();
      return this;
    }

    private long validatorPower_ ;
    /**
     * <code>int64 validator_power = 4 [json_name = "validatorPower"];</code>
     * @return The validatorPower.
     */
    @java.lang.Override
    public long getValidatorPower() {
      return validatorPower_;
    }
    /**
     * <code>int64 validator_power = 4 [json_name = "validatorPower"];</code>
     * @param value The validatorPower to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorPower(long value) {

      validatorPower_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 validator_power = 4 [json_name = "validatorPower"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorPower() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validatorPower_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000010);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 5 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.DuplicateVoteEvidence)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.DuplicateVoteEvidence)
  private static final com.tendermint.types.DuplicateVoteEvidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.DuplicateVoteEvidence();
  }

  public static com.tendermint.types.DuplicateVoteEvidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DuplicateVoteEvidence>
      PARSER = new com.google.protobuf.AbstractParser<DuplicateVoteEvidence>() {
    @java.lang.Override
    public DuplicateVoteEvidence parsePartialFrom(
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

  public static com.google.protobuf.Parser<DuplicateVoteEvidence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DuplicateVoteEvidence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.DuplicateVoteEvidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

