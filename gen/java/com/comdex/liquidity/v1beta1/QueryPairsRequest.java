// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/query.proto

package com.comdex.liquidity.v1beta1;

/**
 * <pre>
 * QueryPairsRequest is request type for the Query/Pairs RPC method.
 * </pre>
 *
 * Protobuf type {@code comdex.liquidity.v1beta1.QueryPairsRequest}
 */
public final class QueryPairsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.liquidity.v1beta1.QueryPairsRequest)
    QueryPairsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPairsRequest.newBuilder() to construct.
  private QueryPairsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPairsRequest() {
    denoms_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPairsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryPairsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryPairsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.liquidity.v1beta1.QueryPairsRequest.class, com.comdex.liquidity.v1beta1.QueryPairsRequest.Builder.class);
  }

  public static final int DENOMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList denoms_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @return A list containing the denoms.
   */
  public com.google.protobuf.ProtocolStringList
      getDenomsList() {
    return denoms_;
  }
  /**
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @return The count of denoms.
   */
  public int getDenomsCount() {
    return denoms_.size();
  }
  /**
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @param index The index of the element to return.
   * @return The denoms at the given index.
   */
  public java.lang.String getDenoms(int index) {
    return denoms_.get(index);
  }
  /**
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the denoms at the given index.
   */
  public com.google.protobuf.ByteString
      getDenomsBytes(int index) {
    return denoms_.getByteString(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }

  public static final int APP_ID_FIELD_NUMBER = 3;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 3 [json_name = "appId"];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
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
    for (int i = 0; i < denoms_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denoms_.getRaw(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    if (appId_ != 0L) {
      output.writeUInt64(3, appId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < denoms_.size(); i++) {
        dataSize += computeStringSizeNoTag(denoms_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDenomsList().size();
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
    }
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, appId_);
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
    if (!(obj instanceof com.comdex.liquidity.v1beta1.QueryPairsRequest)) {
      return super.equals(obj);
    }
    com.comdex.liquidity.v1beta1.QueryPairsRequest other = (com.comdex.liquidity.v1beta1.QueryPairsRequest) obj;

    if (!getDenomsList()
        .equals(other.getDenomsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
    }
    if (getAppId()
        != other.getAppId()) return false;
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
    if (getDenomsCount() > 0) {
      hash = (37 * hash) + DENOMS_FIELD_NUMBER;
      hash = (53 * hash) + getDenomsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.liquidity.v1beta1.QueryPairsRequest parseFrom(
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
  public static Builder newBuilder(com.comdex.liquidity.v1beta1.QueryPairsRequest prototype) {
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
   * QueryPairsRequest is request type for the Query/Pairs RPC method.
   * </pre>
   *
   * Protobuf type {@code comdex.liquidity.v1beta1.QueryPairsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.liquidity.v1beta1.QueryPairsRequest)
      com.comdex.liquidity.v1beta1.QueryPairsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryPairsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryPairsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.liquidity.v1beta1.QueryPairsRequest.class, com.comdex.liquidity.v1beta1.QueryPairsRequest.Builder.class);
    }

    // Construct using com.comdex.liquidity.v1beta1.QueryPairsRequest.newBuilder()
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
      denoms_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      appId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.liquidity.v1beta1.QueryProto.internal_static_comdex_liquidity_v1beta1_QueryPairsRequest_descriptor;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryPairsRequest getDefaultInstanceForType() {
      return com.comdex.liquidity.v1beta1.QueryPairsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryPairsRequest build() {
      com.comdex.liquidity.v1beta1.QueryPairsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.liquidity.v1beta1.QueryPairsRequest buildPartial() {
      com.comdex.liquidity.v1beta1.QueryPairsRequest result = new com.comdex.liquidity.v1beta1.QueryPairsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.liquidity.v1beta1.QueryPairsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        denoms_.makeImmutable();
        result.denoms_ = denoms_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.appId_ = appId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.liquidity.v1beta1.QueryPairsRequest) {
        return mergeFrom((com.comdex.liquidity.v1beta1.QueryPairsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.liquidity.v1beta1.QueryPairsRequest other) {
      if (other == com.comdex.liquidity.v1beta1.QueryPairsRequest.getDefaultInstance()) return this;
      if (!other.denoms_.isEmpty()) {
        if (denoms_.isEmpty()) {
          denoms_ = other.denoms_;
          bitField0_ |= 0x00000001;
        } else {
          ensureDenomsIsMutable();
          denoms_.addAll(other.denoms_);
        }
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
      }
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDenomsIsMutable();
              denoms_.add(s);
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              appId_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.LazyStringArrayList denoms_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDenomsIsMutable() {
      if (!denoms_.isModifiable()) {
        denoms_ = new com.google.protobuf.LazyStringArrayList(denoms_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @return A list containing the denoms.
     */
    public com.google.protobuf.ProtocolStringList
        getDenomsList() {
      denoms_.makeImmutable();
      return denoms_;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @return The count of denoms.
     */
    public int getDenomsCount() {
      return denoms_.size();
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param index The index of the element to return.
     * @return The denoms at the given index.
     */
    public java.lang.String getDenoms(int index) {
      return denoms_.get(index);
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the denoms at the given index.
     */
    public com.google.protobuf.ByteString
        getDenomsBytes(int index) {
      return denoms_.getByteString(index);
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param index The index to set the value at.
     * @param value The denoms to set.
     * @return This builder for chaining.
     */
    public Builder setDenoms(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDenomsIsMutable();
      denoms_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param value The denoms to add.
     * @return This builder for chaining.
     */
    public Builder addDenoms(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDenomsIsMutable();
      denoms_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param values The denoms to add.
     * @return This builder for chaining.
     */
    public Builder addAllDenoms(
        java.lang.Iterable<java.lang.String> values) {
      ensureDenomsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, denoms_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenoms() {
      denoms_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param value The bytes of the denoms to add.
     * @return This builder for chaining.
     */
    public Builder addDenomsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDenomsIsMutable();
      denoms_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageRequest value) {
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
    }

    private long appId_ ;
    /**
     * <code>uint64 app_id = 3 [json_name = "appId"];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 3 [json_name = "appId"];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 3 [json_name = "appId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      appId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.liquidity.v1beta1.QueryPairsRequest)
  }

  // @@protoc_insertion_point(class_scope:comdex.liquidity.v1beta1.QueryPairsRequest)
  private static final com.comdex.liquidity.v1beta1.QueryPairsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.liquidity.v1beta1.QueryPairsRequest();
  }

  public static com.comdex.liquidity.v1beta1.QueryPairsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPairsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryPairsRequest>() {
    @java.lang.Override
    public QueryPairsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPairsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPairsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.liquidity.v1beta1.QueryPairsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

