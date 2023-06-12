// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/airdrop/v1/query.proto

package com.quicksilver.airdrop.v1;

/**
 * <pre>
 * QueryClaimRecordsResponse is the response type for Query/ClaimRecords RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code quicksilver.airdrop.v1.QueryClaimRecordsResponse}
 */
public final class QueryClaimRecordsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.airdrop.v1.QueryClaimRecordsResponse)
    QueryClaimRecordsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClaimRecordsResponse.newBuilder() to construct.
  private QueryClaimRecordsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClaimRecordsResponse() {
    claimRecords_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClaimRecordsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.class, com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.Builder.class);
  }

  public static final int CLAIM_RECORDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.quicksilver.airdrop.v1.ClaimRecord> claimRecords_;
  /**
   * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.quicksilver.airdrop.v1.ClaimRecord> getClaimRecordsList() {
    return claimRecords_;
  }
  /**
   * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.quicksilver.airdrop.v1.ClaimRecordOrBuilder> 
      getClaimRecordsOrBuilderList() {
    return claimRecords_;
  }
  /**
   * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getClaimRecordsCount() {
    return claimRecords_.size();
  }
  /**
   * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quicksilver.airdrop.v1.ClaimRecord getClaimRecords(int index) {
    return claimRecords_.get(index);
  }
  /**
   * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quicksilver.airdrop.v1.ClaimRecordOrBuilder getClaimRecordsOrBuilder(
      int index) {
    return claimRecords_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
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
    for (int i = 0; i < claimRecords_.size(); i++) {
      output.writeMessage(1, claimRecords_.get(i));
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
    for (int i = 0; i < claimRecords_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, claimRecords_.get(i));
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
    if (!(obj instanceof com.quicksilver.airdrop.v1.QueryClaimRecordsResponse)) {
      return super.equals(obj);
    }
    com.quicksilver.airdrop.v1.QueryClaimRecordsResponse other = (com.quicksilver.airdrop.v1.QueryClaimRecordsResponse) obj;

    if (!getClaimRecordsList()
        .equals(other.getClaimRecordsList())) return false;
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
    if (getClaimRecordsCount() > 0) {
      hash = (37 * hash) + CLAIM_RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getClaimRecordsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse parseFrom(
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
  public static Builder newBuilder(com.quicksilver.airdrop.v1.QueryClaimRecordsResponse prototype) {
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
   * QueryClaimRecordsResponse is the response type for Query/ClaimRecords RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code quicksilver.airdrop.v1.QueryClaimRecordsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.airdrop.v1.QueryClaimRecordsResponse)
      com.quicksilver.airdrop.v1.QueryClaimRecordsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.class, com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.Builder.class);
    }

    // Construct using com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.newBuilder()
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
      if (claimRecordsBuilder_ == null) {
        claimRecords_ = java.util.Collections.emptyList();
      } else {
        claimRecords_ = null;
        claimRecordsBuilder_.clear();
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
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordsResponse_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordsResponse getDefaultInstanceForType() {
      return com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordsResponse build() {
      com.quicksilver.airdrop.v1.QueryClaimRecordsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordsResponse buildPartial() {
      com.quicksilver.airdrop.v1.QueryClaimRecordsResponse result = new com.quicksilver.airdrop.v1.QueryClaimRecordsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.quicksilver.airdrop.v1.QueryClaimRecordsResponse result) {
      if (claimRecordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          claimRecords_ = java.util.Collections.unmodifiableList(claimRecords_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.claimRecords_ = claimRecords_;
      } else {
        result.claimRecords_ = claimRecordsBuilder_.build();
      }
    }

    private void buildPartial0(com.quicksilver.airdrop.v1.QueryClaimRecordsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.airdrop.v1.QueryClaimRecordsResponse) {
        return mergeFrom((com.quicksilver.airdrop.v1.QueryClaimRecordsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.airdrop.v1.QueryClaimRecordsResponse other) {
      if (other == com.quicksilver.airdrop.v1.QueryClaimRecordsResponse.getDefaultInstance()) return this;
      if (claimRecordsBuilder_ == null) {
        if (!other.claimRecords_.isEmpty()) {
          if (claimRecords_.isEmpty()) {
            claimRecords_ = other.claimRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClaimRecordsIsMutable();
            claimRecords_.addAll(other.claimRecords_);
          }
          onChanged();
        }
      } else {
        if (!other.claimRecords_.isEmpty()) {
          if (claimRecordsBuilder_.isEmpty()) {
            claimRecordsBuilder_.dispose();
            claimRecordsBuilder_ = null;
            claimRecords_ = other.claimRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
            claimRecordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClaimRecordsFieldBuilder() : null;
          } else {
            claimRecordsBuilder_.addAllMessages(other.claimRecords_);
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
              com.quicksilver.airdrop.v1.ClaimRecord m =
                  input.readMessage(
                      com.quicksilver.airdrop.v1.ClaimRecord.parser(),
                      extensionRegistry);
              if (claimRecordsBuilder_ == null) {
                ensureClaimRecordsIsMutable();
                claimRecords_.add(m);
              } else {
                claimRecordsBuilder_.addMessage(m);
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

    private java.util.List<com.quicksilver.airdrop.v1.ClaimRecord> claimRecords_ =
      java.util.Collections.emptyList();
    private void ensureClaimRecordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        claimRecords_ = new java.util.ArrayList<com.quicksilver.airdrop.v1.ClaimRecord>(claimRecords_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quicksilver.airdrop.v1.ClaimRecord, com.quicksilver.airdrop.v1.ClaimRecord.Builder, com.quicksilver.airdrop.v1.ClaimRecordOrBuilder> claimRecordsBuilder_;

    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quicksilver.airdrop.v1.ClaimRecord> getClaimRecordsList() {
      if (claimRecordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(claimRecords_);
      } else {
        return claimRecordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public int getClaimRecordsCount() {
      if (claimRecordsBuilder_ == null) {
        return claimRecords_.size();
      } else {
        return claimRecordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.airdrop.v1.ClaimRecord getClaimRecords(int index) {
      if (claimRecordsBuilder_ == null) {
        return claimRecords_.get(index);
      } else {
        return claimRecordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClaimRecords(
        int index, com.quicksilver.airdrop.v1.ClaimRecord value) {
      if (claimRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimRecordsIsMutable();
        claimRecords_.set(index, value);
        onChanged();
      } else {
        claimRecordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder setClaimRecords(
        int index, com.quicksilver.airdrop.v1.ClaimRecord.Builder builderForValue) {
      if (claimRecordsBuilder_ == null) {
        ensureClaimRecordsIsMutable();
        claimRecords_.set(index, builderForValue.build());
        onChanged();
      } else {
        claimRecordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaimRecords(com.quicksilver.airdrop.v1.ClaimRecord value) {
      if (claimRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimRecordsIsMutable();
        claimRecords_.add(value);
        onChanged();
      } else {
        claimRecordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaimRecords(
        int index, com.quicksilver.airdrop.v1.ClaimRecord value) {
      if (claimRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimRecordsIsMutable();
        claimRecords_.add(index, value);
        onChanged();
      } else {
        claimRecordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaimRecords(
        com.quicksilver.airdrop.v1.ClaimRecord.Builder builderForValue) {
      if (claimRecordsBuilder_ == null) {
        ensureClaimRecordsIsMutable();
        claimRecords_.add(builderForValue.build());
        onChanged();
      } else {
        claimRecordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder addClaimRecords(
        int index, com.quicksilver.airdrop.v1.ClaimRecord.Builder builderForValue) {
      if (claimRecordsBuilder_ == null) {
        ensureClaimRecordsIsMutable();
        claimRecords_.add(index, builderForValue.build());
        onChanged();
      } else {
        claimRecordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllClaimRecords(
        java.lang.Iterable<? extends com.quicksilver.airdrop.v1.ClaimRecord> values) {
      if (claimRecordsBuilder_ == null) {
        ensureClaimRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, claimRecords_);
        onChanged();
      } else {
        claimRecordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearClaimRecords() {
      if (claimRecordsBuilder_ == null) {
        claimRecords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        claimRecordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeClaimRecords(int index) {
      if (claimRecordsBuilder_ == null) {
        ensureClaimRecordsIsMutable();
        claimRecords_.remove(index);
        onChanged();
      } else {
        claimRecordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.airdrop.v1.ClaimRecord.Builder getClaimRecordsBuilder(
        int index) {
      return getClaimRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.airdrop.v1.ClaimRecordOrBuilder getClaimRecordsOrBuilder(
        int index) {
      if (claimRecordsBuilder_ == null) {
        return claimRecords_.get(index);  } else {
        return claimRecordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.quicksilver.airdrop.v1.ClaimRecordOrBuilder> 
         getClaimRecordsOrBuilderList() {
      if (claimRecordsBuilder_ != null) {
        return claimRecordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(claimRecords_);
      }
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.airdrop.v1.ClaimRecord.Builder addClaimRecordsBuilder() {
      return getClaimRecordsFieldBuilder().addBuilder(
          com.quicksilver.airdrop.v1.ClaimRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public com.quicksilver.airdrop.v1.ClaimRecord.Builder addClaimRecordsBuilder(
        int index) {
      return getClaimRecordsFieldBuilder().addBuilder(
          index, com.quicksilver.airdrop.v1.ClaimRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .quicksilver.airdrop.v1.ClaimRecord claim_records = 1 [json_name = "claimRecords", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quicksilver.airdrop.v1.ClaimRecord.Builder> 
         getClaimRecordsBuilderList() {
      return getClaimRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quicksilver.airdrop.v1.ClaimRecord, com.quicksilver.airdrop.v1.ClaimRecord.Builder, com.quicksilver.airdrop.v1.ClaimRecordOrBuilder> 
        getClaimRecordsFieldBuilder() {
      if (claimRecordsBuilder_ == null) {
        claimRecordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.quicksilver.airdrop.v1.ClaimRecord, com.quicksilver.airdrop.v1.ClaimRecord.Builder, com.quicksilver.airdrop.v1.ClaimRecordOrBuilder>(
                claimRecords_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        claimRecords_ = null;
      }
      return claimRecordsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:quicksilver.airdrop.v1.QueryClaimRecordsResponse)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.airdrop.v1.QueryClaimRecordsResponse)
  private static final com.quicksilver.airdrop.v1.QueryClaimRecordsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.airdrop.v1.QueryClaimRecordsResponse();
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClaimRecordsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClaimRecordsResponse>() {
    @java.lang.Override
    public QueryClaimRecordsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClaimRecordsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClaimRecordsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.airdrop.v1.QueryClaimRecordsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

