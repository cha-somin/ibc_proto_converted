// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryVotesResponse is the response type for the Query/Votes RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryVotesResponse}
 */
public final class QueryVotesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryVotesResponse)
    QueryVotesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryVotesResponse.newBuilder() to construct.
  private QueryVotesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryVotesResponse() {
    votes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryVotesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.gov.v1beta1.QueryVotesResponse.class, com.cosmos.gov.v1beta1.QueryVotesResponse.Builder.class);
  }

  public static final int VOTES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.gov.v1beta1.Vote> votes_;
  /**
   * <pre>
   * votes defines the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.gov.v1beta1.Vote> getVotesList() {
    return votes_;
  }
  /**
   * <pre>
   * votes defines the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.gov.v1beta1.VoteOrBuilder> 
      getVotesOrBuilderList() {
    return votes_;
  }
  /**
   * <pre>
   * votes defines the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public int getVotesCount() {
    return votes_.size();
  }
  /**
   * <pre>
   * votes defines the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.Vote getVotes(int index) {
    return votes_.get(index);
  }
  /**
   * <pre>
   * votes defines the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.gov.v1beta1.VoteOrBuilder getVotesOrBuilder(
      int index) {
    return votes_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < votes_.size(); i++) {
      output.writeMessage(1, votes_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < votes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, votes_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.cosmos.gov.v1beta1.QueryVotesResponse)) {
      return super.equals(obj);
    }
    com.cosmos.gov.v1beta1.QueryVotesResponse other = (com.cosmos.gov.v1beta1.QueryVotesResponse) obj;

    if (!getVotesList()
        .equals(other.getVotesList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getVotesCount() > 0) {
      hash = (37 * hash) + VOTES_FIELD_NUMBER;
      hash = (53 * hash) + getVotesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.gov.v1beta1.QueryVotesResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.gov.v1beta1.QueryVotesResponse prototype) {
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
   * QueryVotesResponse is the response type for the Query/Votes RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryVotesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryVotesResponse)
      com.cosmos.gov.v1beta1.QueryVotesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.gov.v1beta1.QueryVotesResponse.class, com.cosmos.gov.v1beta1.QueryVotesResponse.Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.QueryVotesResponse.newBuilder()
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
      if (votesBuilder_ == null) {
        votes_ = java.util.Collections.emptyList();
      } else {
        votes_ = null;
        votesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.gov.v1beta1.QueryProto.internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryVotesResponse getDefaultInstanceForType() {
      return com.cosmos.gov.v1beta1.QueryVotesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryVotesResponse build() {
      com.cosmos.gov.v1beta1.QueryVotesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.gov.v1beta1.QueryVotesResponse buildPartial() {
      com.cosmos.gov.v1beta1.QueryVotesResponse result = new com.cosmos.gov.v1beta1.QueryVotesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.gov.v1beta1.QueryVotesResponse result) {
      if (votesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          votes_ = java.util.Collections.unmodifiableList(votes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.votes_ = votes_;
      } else {
        result.votes_ = votesBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.gov.v1beta1.QueryVotesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.gov.v1beta1.QueryVotesResponse) {
        return mergeFrom((com.cosmos.gov.v1beta1.QueryVotesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.gov.v1beta1.QueryVotesResponse other) {
      if (other == com.cosmos.gov.v1beta1.QueryVotesResponse.getDefaultInstance()) return this;
      if (votesBuilder_ == null) {
        if (!other.votes_.isEmpty()) {
          if (votes_.isEmpty()) {
            votes_ = other.votes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVotesIsMutable();
            votes_.addAll(other.votes_);
          }
          onChanged();
        }
      } else {
        if (!other.votes_.isEmpty()) {
          if (votesBuilder_.isEmpty()) {
            votesBuilder_.dispose();
            votesBuilder_ = null;
            votes_ = other.votes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            votesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVotesFieldBuilder() : null;
          } else {
            votesBuilder_.addAllMessages(other.votes_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.cosmos.gov.v1beta1.Vote m =
                  input.readMessage(
                      com.cosmos.gov.v1beta1.Vote.parser(),
                      extensionRegistry);
              if (votesBuilder_ == null) {
                ensureVotesIsMutable();
                votes_.add(m);
              } else {
                votesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.cosmos.gov.v1beta1.Vote> votes_ =
      java.util.Collections.emptyList();
    private void ensureVotesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        votes_ = new java.util.ArrayList<com.cosmos.gov.v1beta1.Vote>(votes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.gov.v1beta1.Vote, com.cosmos.gov.v1beta1.Vote.Builder, com.cosmos.gov.v1beta1.VoteOrBuilder> votesBuilder_;

    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<com.cosmos.gov.v1beta1.Vote> getVotesList() {
      if (votesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(votes_);
      } else {
        return votesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public int getVotesCount() {
      if (votesBuilder_ == null) {
        return votes_.size();
      } else {
        return votesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.Vote getVotes(int index) {
      if (votesBuilder_ == null) {
        return votes_.get(index);
      } else {
        return votesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setVotes(
        int index, com.cosmos.gov.v1beta1.Vote value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.set(index, value);
        onChanged();
      } else {
        votesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder setVotes(
        int index, com.cosmos.gov.v1beta1.Vote.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.set(index, builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addVotes(com.cosmos.gov.v1beta1.Vote value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.add(value);
        onChanged();
      } else {
        votesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addVotes(
        int index, com.cosmos.gov.v1beta1.Vote value) {
      if (votesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVotesIsMutable();
        votes_.add(index, value);
        onChanged();
      } else {
        votesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addVotes(
        com.cosmos.gov.v1beta1.Vote.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.add(builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addVotes(
        int index, com.cosmos.gov.v1beta1.Vote.Builder builderForValue) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.add(index, builderForValue.build());
        onChanged();
      } else {
        votesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder addAllVotes(
        java.lang.Iterable<? extends com.cosmos.gov.v1beta1.Vote> values) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, votes_);
        onChanged();
      } else {
        votesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder clearVotes() {
      if (votesBuilder_ == null) {
        votes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        votesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public Builder removeVotes(int index) {
      if (votesBuilder_ == null) {
        ensureVotesIsMutable();
        votes_.remove(index);
        onChanged();
      } else {
        votesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.Vote.Builder getVotesBuilder(
        int index) {
      return getVotesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.VoteOrBuilder getVotesOrBuilder(
        int index) {
      if (votesBuilder_ == null) {
        return votes_.get(index);  } else {
        return votesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<? extends com.cosmos.gov.v1beta1.VoteOrBuilder> 
         getVotesOrBuilderList() {
      if (votesBuilder_ != null) {
        return votesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(votes_);
      }
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.Vote.Builder addVotesBuilder() {
      return getVotesFieldBuilder().addBuilder(
          com.cosmos.gov.v1beta1.Vote.getDefaultInstance());
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public com.cosmos.gov.v1beta1.Vote.Builder addVotesBuilder(
        int index) {
      return getVotesFieldBuilder().addBuilder(
          index, com.cosmos.gov.v1beta1.Vote.getDefaultInstance());
    }
    /**
     * <pre>
     * votes defines the queried votes.
     * </pre>
     *
     * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
     */
    public java.util.List<com.cosmos.gov.v1beta1.Vote.Builder> 
         getVotesBuilderList() {
      return getVotesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.gov.v1beta1.Vote, com.cosmos.gov.v1beta1.Vote.Builder, com.cosmos.gov.v1beta1.VoteOrBuilder> 
        getVotesFieldBuilder() {
      if (votesBuilder_ == null) {
        votesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.gov.v1beta1.Vote, com.cosmos.gov.v1beta1.Vote.Builder, com.cosmos.gov.v1beta1.VoteOrBuilder>(
                votes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        votes_ = null;
      }
      return votesBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryVotesResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryVotesResponse)
  private static final com.cosmos.gov.v1beta1.QueryVotesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.gov.v1beta1.QueryVotesResponse();
  }

  public static com.cosmos.gov.v1beta1.QueryVotesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryVotesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryVotesResponse>() {
    @java.lang.Override
    public QueryVotesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryVotesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryVotesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.gov.v1beta1.QueryVotesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

