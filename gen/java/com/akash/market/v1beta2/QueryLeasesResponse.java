// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/query.proto

package com.akash.market.v1beta2;

/**
 * <pre>
 * QueryLeasesResponse is response type for the Query/Leases RPC method
 * </pre>
 *
 * Protobuf type {@code akash.market.v1beta2.QueryLeasesResponse}
 */
public final class QueryLeasesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.market.v1beta2.QueryLeasesResponse)
    QueryLeasesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryLeasesResponse.newBuilder() to construct.
  private QueryLeasesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryLeasesResponse() {
    leases_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryLeasesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryLeasesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryLeasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.market.v1beta2.QueryLeasesResponse.class, com.akash.market.v1beta2.QueryLeasesResponse.Builder.class);
  }

  public static final int LEASES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.akash.market.v1beta2.QueryLeaseResponse> leases_;
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.akash.market.v1beta2.QueryLeaseResponse> getLeasesList() {
    return leases_;
  }
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.akash.market.v1beta2.QueryLeaseResponseOrBuilder> 
      getLeasesOrBuilderList() {
    return leases_;
  }
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getLeasesCount() {
    return leases_.size();
  }
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.akash.market.v1beta2.QueryLeaseResponse getLeases(int index) {
    return leases_.get(index);
  }
  /**
   * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.akash.market.v1beta2.QueryLeaseResponseOrBuilder getLeasesOrBuilder(
      int index) {
    return leases_.get(index);
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
    for (int i = 0; i < leases_.size(); i++) {
      output.writeMessage(1, leases_.get(i));
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
    for (int i = 0; i < leases_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, leases_.get(i));
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
    if (!(obj instanceof com.akash.market.v1beta2.QueryLeasesResponse)) {
      return super.equals(obj);
    }
    com.akash.market.v1beta2.QueryLeasesResponse other = (com.akash.market.v1beta2.QueryLeasesResponse) obj;

    if (!getLeasesList()
        .equals(other.getLeasesList())) return false;
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
    if (getLeasesCount() > 0) {
      hash = (37 * hash) + LEASES_FIELD_NUMBER;
      hash = (53 * hash) + getLeasesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.market.v1beta2.QueryLeasesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.market.v1beta2.QueryLeasesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.QueryLeasesResponse parseFrom(
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
  public static Builder newBuilder(com.akash.market.v1beta2.QueryLeasesResponse prototype) {
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
   * QueryLeasesResponse is response type for the Query/Leases RPC method
   * </pre>
   *
   * Protobuf type {@code akash.market.v1beta2.QueryLeasesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.market.v1beta2.QueryLeasesResponse)
      com.akash.market.v1beta2.QueryLeasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryLeasesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryLeasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.market.v1beta2.QueryLeasesResponse.class, com.akash.market.v1beta2.QueryLeasesResponse.Builder.class);
    }

    // Construct using com.akash.market.v1beta2.QueryLeasesResponse.newBuilder()
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
      if (leasesBuilder_ == null) {
        leases_ = java.util.Collections.emptyList();
      } else {
        leases_ = null;
        leasesBuilder_.clear();
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
      return com.akash.market.v1beta2.QueryProto.internal_static_akash_market_v1beta2_QueryLeasesResponse_descriptor;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryLeasesResponse getDefaultInstanceForType() {
      return com.akash.market.v1beta2.QueryLeasesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryLeasesResponse build() {
      com.akash.market.v1beta2.QueryLeasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.QueryLeasesResponse buildPartial() {
      com.akash.market.v1beta2.QueryLeasesResponse result = new com.akash.market.v1beta2.QueryLeasesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.akash.market.v1beta2.QueryLeasesResponse result) {
      if (leasesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          leases_ = java.util.Collections.unmodifiableList(leases_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.leases_ = leases_;
      } else {
        result.leases_ = leasesBuilder_.build();
      }
    }

    private void buildPartial0(com.akash.market.v1beta2.QueryLeasesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.market.v1beta2.QueryLeasesResponse) {
        return mergeFrom((com.akash.market.v1beta2.QueryLeasesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.market.v1beta2.QueryLeasesResponse other) {
      if (other == com.akash.market.v1beta2.QueryLeasesResponse.getDefaultInstance()) return this;
      if (leasesBuilder_ == null) {
        if (!other.leases_.isEmpty()) {
          if (leases_.isEmpty()) {
            leases_ = other.leases_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLeasesIsMutable();
            leases_.addAll(other.leases_);
          }
          onChanged();
        }
      } else {
        if (!other.leases_.isEmpty()) {
          if (leasesBuilder_.isEmpty()) {
            leasesBuilder_.dispose();
            leasesBuilder_ = null;
            leases_ = other.leases_;
            bitField0_ = (bitField0_ & ~0x00000001);
            leasesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLeasesFieldBuilder() : null;
          } else {
            leasesBuilder_.addAllMessages(other.leases_);
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
              com.akash.market.v1beta2.QueryLeaseResponse m =
                  input.readMessage(
                      com.akash.market.v1beta2.QueryLeaseResponse.parser(),
                      extensionRegistry);
              if (leasesBuilder_ == null) {
                ensureLeasesIsMutable();
                leases_.add(m);
              } else {
                leasesBuilder_.addMessage(m);
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

    private java.util.List<com.akash.market.v1beta2.QueryLeaseResponse> leases_ =
      java.util.Collections.emptyList();
    private void ensureLeasesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        leases_ = new java.util.ArrayList<com.akash.market.v1beta2.QueryLeaseResponse>(leases_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.market.v1beta2.QueryLeaseResponse, com.akash.market.v1beta2.QueryLeaseResponse.Builder, com.akash.market.v1beta2.QueryLeaseResponseOrBuilder> leasesBuilder_;

    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.akash.market.v1beta2.QueryLeaseResponse> getLeasesList() {
      if (leasesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(leases_);
      } else {
        return leasesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public int getLeasesCount() {
      if (leasesBuilder_ == null) {
        return leases_.size();
      } else {
        return leasesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.QueryLeaseResponse getLeases(int index) {
      if (leasesBuilder_ == null) {
        return leases_.get(index);
      } else {
        return leasesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLeases(
        int index, com.akash.market.v1beta2.QueryLeaseResponse value) {
      if (leasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLeasesIsMutable();
        leases_.set(index, value);
        onChanged();
      } else {
        leasesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder setLeases(
        int index, com.akash.market.v1beta2.QueryLeaseResponse.Builder builderForValue) {
      if (leasesBuilder_ == null) {
        ensureLeasesIsMutable();
        leases_.set(index, builderForValue.build());
        onChanged();
      } else {
        leasesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLeases(com.akash.market.v1beta2.QueryLeaseResponse value) {
      if (leasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLeasesIsMutable();
        leases_.add(value);
        onChanged();
      } else {
        leasesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLeases(
        int index, com.akash.market.v1beta2.QueryLeaseResponse value) {
      if (leasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLeasesIsMutable();
        leases_.add(index, value);
        onChanged();
      } else {
        leasesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLeases(
        com.akash.market.v1beta2.QueryLeaseResponse.Builder builderForValue) {
      if (leasesBuilder_ == null) {
        ensureLeasesIsMutable();
        leases_.add(builderForValue.build());
        onChanged();
      } else {
        leasesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder addLeases(
        int index, com.akash.market.v1beta2.QueryLeaseResponse.Builder builderForValue) {
      if (leasesBuilder_ == null) {
        ensureLeasesIsMutable();
        leases_.add(index, builderForValue.build());
        onChanged();
      } else {
        leasesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllLeases(
        java.lang.Iterable<? extends com.akash.market.v1beta2.QueryLeaseResponse> values) {
      if (leasesBuilder_ == null) {
        ensureLeasesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, leases_);
        onChanged();
      } else {
        leasesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearLeases() {
      if (leasesBuilder_ == null) {
        leases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        leasesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeLeases(int index) {
      if (leasesBuilder_ == null) {
        ensureLeasesIsMutable();
        leases_.remove(index);
        onChanged();
      } else {
        leasesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.QueryLeaseResponse.Builder getLeasesBuilder(
        int index) {
      return getLeasesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.QueryLeaseResponseOrBuilder getLeasesOrBuilder(
        int index) {
      if (leasesBuilder_ == null) {
        return leases_.get(index);  } else {
        return leasesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.akash.market.v1beta2.QueryLeaseResponseOrBuilder> 
         getLeasesOrBuilderList() {
      if (leasesBuilder_ != null) {
        return leasesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(leases_);
      }
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.QueryLeaseResponse.Builder addLeasesBuilder() {
      return getLeasesFieldBuilder().addBuilder(
          com.akash.market.v1beta2.QueryLeaseResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public com.akash.market.v1beta2.QueryLeaseResponse.Builder addLeasesBuilder(
        int index) {
      return getLeasesFieldBuilder().addBuilder(
          index, com.akash.market.v1beta2.QueryLeaseResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.market.v1beta2.QueryLeaseResponse leases = 1 [json_name = "leases", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.akash.market.v1beta2.QueryLeaseResponse.Builder> 
         getLeasesBuilderList() {
      return getLeasesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.market.v1beta2.QueryLeaseResponse, com.akash.market.v1beta2.QueryLeaseResponse.Builder, com.akash.market.v1beta2.QueryLeaseResponseOrBuilder> 
        getLeasesFieldBuilder() {
      if (leasesBuilder_ == null) {
        leasesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.akash.market.v1beta2.QueryLeaseResponse, com.akash.market.v1beta2.QueryLeaseResponse.Builder, com.akash.market.v1beta2.QueryLeaseResponseOrBuilder>(
                leases_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        leases_ = null;
      }
      return leasesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.market.v1beta2.QueryLeasesResponse)
  }

  // @@protoc_insertion_point(class_scope:akash.market.v1beta2.QueryLeasesResponse)
  private static final com.akash.market.v1beta2.QueryLeasesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.market.v1beta2.QueryLeasesResponse();
  }

  public static com.akash.market.v1beta2.QueryLeasesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryLeasesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryLeasesResponse>() {
    @java.lang.Override
    public QueryLeasesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryLeasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryLeasesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.market.v1beta2.QueryLeasesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

