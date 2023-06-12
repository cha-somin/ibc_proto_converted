// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/query.proto

package com.cosmos.group.v1;

/**
 * <pre>
 * QueryProposalResponse is the Query/Proposal response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.group.v1.QueryProposalResponse}
 */
public final class QueryProposalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.group.v1.QueryProposalResponse)
    QueryProposalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProposalResponse.newBuilder() to construct.
  private QueryProposalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProposalResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProposalResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.group.v1.QueryProto.internal_static_cosmos_group_v1_QueryProposalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.group.v1.QueryProto.internal_static_cosmos_group_v1_QueryProposalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.group.v1.QueryProposalResponse.class, com.cosmos.group.v1.QueryProposalResponse.Builder.class);
  }

  public static final int PROPOSAL_FIELD_NUMBER = 1;
  private com.cosmos.group.v1.Proposal proposal_;
  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   * @return Whether the proposal field is set.
   */
  @java.lang.Override
  public boolean hasProposal() {
    return proposal_ != null;
  }
  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   * @return The proposal.
   */
  @java.lang.Override
  public com.cosmos.group.v1.Proposal getProposal() {
    return proposal_ == null ? com.cosmos.group.v1.Proposal.getDefaultInstance() : proposal_;
  }
  /**
   * <pre>
   * proposal is the proposal info.
   * </pre>
   *
   * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
   */
  @java.lang.Override
  public com.cosmos.group.v1.ProposalOrBuilder getProposalOrBuilder() {
    return proposal_ == null ? com.cosmos.group.v1.Proposal.getDefaultInstance() : proposal_;
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
    if (proposal_ != null) {
      output.writeMessage(1, getProposal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposal_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProposal());
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
    if (!(obj instanceof com.cosmos.group.v1.QueryProposalResponse)) {
      return super.equals(obj);
    }
    com.cosmos.group.v1.QueryProposalResponse other = (com.cosmos.group.v1.QueryProposalResponse) obj;

    if (hasProposal() != other.hasProposal()) return false;
    if (hasProposal()) {
      if (!getProposal()
          .equals(other.getProposal())) return false;
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
    if (hasProposal()) {
      hash = (37 * hash) + PROPOSAL_FIELD_NUMBER;
      hash = (53 * hash) + getProposal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.group.v1.QueryProposalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.group.v1.QueryProposalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.group.v1.QueryProposalResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.group.v1.QueryProposalResponse prototype) {
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
   * QueryProposalResponse is the Query/Proposal response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.group.v1.QueryProposalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.group.v1.QueryProposalResponse)
      com.cosmos.group.v1.QueryProposalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.group.v1.QueryProto.internal_static_cosmos_group_v1_QueryProposalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.group.v1.QueryProto.internal_static_cosmos_group_v1_QueryProposalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.group.v1.QueryProposalResponse.class, com.cosmos.group.v1.QueryProposalResponse.Builder.class);
    }

    // Construct using com.cosmos.group.v1.QueryProposalResponse.newBuilder()
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
      proposal_ = null;
      if (proposalBuilder_ != null) {
        proposalBuilder_.dispose();
        proposalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.group.v1.QueryProto.internal_static_cosmos_group_v1_QueryProposalResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.group.v1.QueryProposalResponse getDefaultInstanceForType() {
      return com.cosmos.group.v1.QueryProposalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.group.v1.QueryProposalResponse build() {
      com.cosmos.group.v1.QueryProposalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.group.v1.QueryProposalResponse buildPartial() {
      com.cosmos.group.v1.QueryProposalResponse result = new com.cosmos.group.v1.QueryProposalResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.group.v1.QueryProposalResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposal_ = proposalBuilder_ == null
            ? proposal_
            : proposalBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.group.v1.QueryProposalResponse) {
        return mergeFrom((com.cosmos.group.v1.QueryProposalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.group.v1.QueryProposalResponse other) {
      if (other == com.cosmos.group.v1.QueryProposalResponse.getDefaultInstance()) return this;
      if (other.hasProposal()) {
        mergeProposal(other.getProposal());
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
                  getProposalFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.cosmos.group.v1.Proposal proposal_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.group.v1.Proposal, com.cosmos.group.v1.Proposal.Builder, com.cosmos.group.v1.ProposalOrBuilder> proposalBuilder_;
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     * @return Whether the proposal field is set.
     */
    public boolean hasProposal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     * @return The proposal.
     */
    public com.cosmos.group.v1.Proposal getProposal() {
      if (proposalBuilder_ == null) {
        return proposal_ == null ? com.cosmos.group.v1.Proposal.getDefaultInstance() : proposal_;
      } else {
        return proposalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public Builder setProposal(com.cosmos.group.v1.Proposal value) {
      if (proposalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proposal_ = value;
      } else {
        proposalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public Builder setProposal(
        com.cosmos.group.v1.Proposal.Builder builderForValue) {
      if (proposalBuilder_ == null) {
        proposal_ = builderForValue.build();
      } else {
        proposalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public Builder mergeProposal(com.cosmos.group.v1.Proposal value) {
      if (proposalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          proposal_ != null &&
          proposal_ != com.cosmos.group.v1.Proposal.getDefaultInstance()) {
          getProposalBuilder().mergeFrom(value);
        } else {
          proposal_ = value;
        }
      } else {
        proposalBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public Builder clearProposal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposal_ = null;
      if (proposalBuilder_ != null) {
        proposalBuilder_.dispose();
        proposalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public com.cosmos.group.v1.Proposal.Builder getProposalBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProposalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    public com.cosmos.group.v1.ProposalOrBuilder getProposalOrBuilder() {
      if (proposalBuilder_ != null) {
        return proposalBuilder_.getMessageOrBuilder();
      } else {
        return proposal_ == null ?
            com.cosmos.group.v1.Proposal.getDefaultInstance() : proposal_;
      }
    }
    /**
     * <pre>
     * proposal is the proposal info.
     * </pre>
     *
     * <code>.cosmos.group.v1.Proposal proposal = 1 [json_name = "proposal"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.group.v1.Proposal, com.cosmos.group.v1.Proposal.Builder, com.cosmos.group.v1.ProposalOrBuilder> 
        getProposalFieldBuilder() {
      if (proposalBuilder_ == null) {
        proposalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.group.v1.Proposal, com.cosmos.group.v1.Proposal.Builder, com.cosmos.group.v1.ProposalOrBuilder>(
                getProposal(),
                getParentForChildren(),
                isClean());
        proposal_ = null;
      }
      return proposalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.group.v1.QueryProposalResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.group.v1.QueryProposalResponse)
  private static final com.cosmos.group.v1.QueryProposalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.group.v1.QueryProposalResponse();
  }

  public static com.cosmos.group.v1.QueryProposalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProposalResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryProposalResponse>() {
    @java.lang.Override
    public QueryProposalResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProposalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProposalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.group.v1.QueryProposalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

