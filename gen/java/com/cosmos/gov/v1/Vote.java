// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1/gov.proto

package com.cosmos.gov.v1;

/**
 * <pre>
 * Vote defines a vote on a governance proposal.
 * A Vote consists of a proposal ID, the voter, and the vote option.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1.Vote}
 */
public final class Vote extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1.Vote)
    VoteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vote.newBuilder() to construct.
  private Vote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vote() {
    voter_ = "";
    options_ = java.util.Collections.emptyList();
    metadata_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Vote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.gov.v1.GovProto.internal_static_cosmos_gov_v1_Vote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.gov.v1.GovProto.internal_static_cosmos_gov_v1_Vote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.gov.v1.Vote.class, com.cosmos.gov.v1.Vote.Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <pre>
   * proposal_id defines the unique id of the proposal.
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
   * voter is the voter address of the proposal.
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
   * voter is the voter address of the proposal.
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

  public static final int OPTIONS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.gov.v1.WeightedVoteOption> options_;
  /**
   * <pre>
   * options is the weighted vote options.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.gov.v1.WeightedVoteOption> getOptionsList() {
    return options_;
  }
  /**
   * <pre>
   * options is the weighted vote options.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.gov.v1.WeightedVoteOptionOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <pre>
   * options is the weighted vote options.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <pre>
   * options is the weighted vote options.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1.WeightedVoteOption getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <pre>
   * options is the weighted vote options.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1.WeightedVoteOptionOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object metadata_ = "";
  /**
   * <pre>
   * metadata is any arbitrary metadata to attached to the vote.
   * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
   * </pre>
   *
   * <code>string metadata = 5 [json_name = "metadata"];</code>
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
   * metadata is any arbitrary metadata to attached to the vote.
   * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
   * </pre>
   *
   * <code>string metadata = 5 [json_name = "metadata"];</code>
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
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(4, options_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadata_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, metadata_);
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
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, options_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadata_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, metadata_);
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
    if (!(obj instanceof com.cosmos.gov.v1.Vote)) {
      return super.equals(obj);
    }
    com.cosmos.gov.v1.Vote other = (com.cosmos.gov.v1.Vote) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
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
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.gov.v1.Vote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.gov.v1.Vote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.gov.v1.Vote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1.Vote parseFrom(
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
  public static Builder newBuilder(com.cosmos.gov.v1.Vote prototype) {
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
   * Vote defines a vote on a governance proposal.
   * A Vote consists of a proposal ID, the voter, and the vote option.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1.Vote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1.Vote)
      com.cosmos.gov.v1.VoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.gov.v1.GovProto.internal_static_cosmos_gov_v1_Vote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.gov.v1.GovProto.internal_static_cosmos_gov_v1_Vote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.gov.v1.Vote.class, com.cosmos.gov.v1.Vote.Builder.class);
    }

    // Construct using com.cosmos.gov.v1.Vote.newBuilder()
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
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
      } else {
        options_ = null;
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      metadata_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.gov.v1.GovProto.internal_static_cosmos_gov_v1_Vote_descriptor;
    }

    @java.lang.Override
    public com.cosmos.gov.v1.Vote getDefaultInstanceForType() {
      return com.cosmos.gov.v1.Vote.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.gov.v1.Vote build() {
      com.cosmos.gov.v1.Vote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.gov.v1.Vote buildPartial() {
      com.cosmos.gov.v1.Vote result = new com.cosmos.gov.v1.Vote(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.gov.v1.Vote result) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.gov.v1.Vote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voter_ = voter_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.metadata_ = metadata_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.gov.v1.Vote) {
        return mergeFrom((com.cosmos.gov.v1.Vote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.gov.v1.Vote other) {
      if (other == com.cosmos.gov.v1.Vote.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (optionsBuilder_ == null) {
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureOptionsIsMutable();
            options_.addAll(other.options_);
          }
          onChanged();
        }
      } else {
        if (!other.options_.isEmpty()) {
          if (optionsBuilder_.isEmpty()) {
            optionsBuilder_.dispose();
            optionsBuilder_ = null;
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
            optionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOptionsFieldBuilder() : null;
          } else {
            optionsBuilder_.addAllMessages(other.options_);
          }
        }
      }
      if (!other.getMetadata().isEmpty()) {
        metadata_ = other.metadata_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 34: {
              com.cosmos.gov.v1.WeightedVoteOption m =
                  input.readMessage(
                      com.cosmos.gov.v1.WeightedVoteOption.parser(),
                      extensionRegistry);
              if (optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                options_.add(m);
              } else {
                optionsBuilder_.addMessage(m);
              }
              break;
            } // case 34
            case 42: {
              metadata_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
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

    private long proposalId_ ;
    /**
     * <pre>
     * proposal_id defines the unique id of the proposal.
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
     * proposal_id defines the unique id of the proposal.
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
     * proposal_id defines the unique id of the proposal.
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
     * voter is the voter address of the proposal.
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
     * voter is the voter address of the proposal.
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
     * voter is the voter address of the proposal.
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
     * voter is the voter address of the proposal.
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
     * voter is the voter address of the proposal.
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

    private java.util.List<com.cosmos.gov.v1.WeightedVoteOption> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        options_ = new java.util.ArrayList<com.cosmos.gov.v1.WeightedVoteOption>(options_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.gov.v1.WeightedVoteOption, com.cosmos.gov.v1.WeightedVoteOption.Builder, com.cosmos.gov.v1.WeightedVoteOptionOrBuilder> optionsBuilder_;

    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public java.util.List<com.cosmos.gov.v1.WeightedVoteOption> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public com.cosmos.gov.v1.WeightedVoteOption getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.cosmos.gov.v1.WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.set(index, value);
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.cosmos.gov.v1.WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.set(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(com.cosmos.gov.v1.WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.cosmos.gov.v1.WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(index, value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        com.cosmos.gov.v1.WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.cosmos.gov.v1.WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.cosmos.gov.v1.WeightedVoteOption> values) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, options_);
        onChanged();
      } else {
        optionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public Builder removeOptions(int index) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.remove(index);
        onChanged();
      } else {
        optionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public com.cosmos.gov.v1.WeightedVoteOption.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public com.cosmos.gov.v1.WeightedVoteOptionOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public java.util.List<? extends com.cosmos.gov.v1.WeightedVoteOptionOrBuilder> 
         getOptionsOrBuilderList() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(options_);
      }
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public com.cosmos.gov.v1.WeightedVoteOption.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          com.cosmos.gov.v1.WeightedVoteOption.getDefaultInstance());
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public com.cosmos.gov.v1.WeightedVoteOption.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, com.cosmos.gov.v1.WeightedVoteOption.getDefaultInstance());
    }
    /**
     * <pre>
     * options is the weighted vote options.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1.WeightedVoteOption options = 4 [json_name = "options"];</code>
     */
    public java.util.List<com.cosmos.gov.v1.WeightedVoteOption.Builder> 
         getOptionsBuilderList() {
      return getOptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.gov.v1.WeightedVoteOption, com.cosmos.gov.v1.WeightedVoteOption.Builder, com.cosmos.gov.v1.WeightedVoteOptionOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.gov.v1.WeightedVoteOption, com.cosmos.gov.v1.WeightedVoteOption.Builder, com.cosmos.gov.v1.WeightedVoteOptionOrBuilder>(
                options_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    private java.lang.Object metadata_ = "";
    /**
     * <pre>
     * metadata is any arbitrary metadata to attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
     * </pre>
     *
     * <code>string metadata = 5 [json_name = "metadata"];</code>
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
     * metadata is any arbitrary metadata to attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
     * </pre>
     *
     * <code>string metadata = 5 [json_name = "metadata"];</code>
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
     * metadata is any arbitrary metadata to attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
     * </pre>
     *
     * <code>string metadata = 5 [json_name = "metadata"];</code>
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
     * metadata is any arbitrary metadata to attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
     * </pre>
     *
     * <code>string metadata = 5 [json_name = "metadata"];</code>
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
     * metadata is any arbitrary metadata to attached to the vote.
     * the recommended format of the metadata is to be found here: https://docs.cosmos.network/v0.47/modules/gov#vote-5
     * </pre>
     *
     * <code>string metadata = 5 [json_name = "metadata"];</code>
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1.Vote)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1.Vote)
  private static final com.cosmos.gov.v1.Vote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.gov.v1.Vote();
  }

  public static com.cosmos.gov.v1.Vote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vote>
      PARSER = new com.google.protobuf.AbstractParser<Vote>() {
    @java.lang.Override
    public Vote parsePartialFrom(
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

  public static com.google.protobuf.Parser<Vote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.gov.v1.Vote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

