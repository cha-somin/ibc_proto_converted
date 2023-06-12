// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/query.proto

package com.cudosnode.cudosnode.nft;

/**
 * <pre>
 * QueryCollectionsByIdsRequest is the request type for the Query/CollectionsByIds RPC method
 * </pre>
 *
 * Protobuf type {@code cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest}
 */
public final class QueryCollectionsByIdsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)
    QueryCollectionsByIdsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCollectionsByIdsRequest.newBuilder() to construct.
  private QueryCollectionsByIdsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCollectionsByIdsRequest() {
    denomIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCollectionsByIdsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.class, com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.Builder.class);
  }

  public static final int DENOM_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList denomIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
   * @return A list containing the denomIds.
   */
  public com.google.protobuf.ProtocolStringList
      getDenomIdsList() {
    return denomIds_;
  }
  /**
   * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
   * @return The count of denomIds.
   */
  public int getDenomIdsCount() {
    return denomIds_.size();
  }
  /**
   * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The denomIds at the given index.
   */
  public java.lang.String getDenomIds(int index) {
    return denomIds_.get(index);
  }
  /**
   * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the denomIds at the given index.
   */
  public com.google.protobuf.ByteString
      getDenomIdsBytes(int index) {
    return denomIds_.getByteString(index);
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
    for (int i = 0; i < denomIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denomIds_.getRaw(i));
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
      for (int i = 0; i < denomIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(denomIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDenomIdsList().size();
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
    if (!(obj instanceof com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)) {
      return super.equals(obj);
    }
    com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest other = (com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest) obj;

    if (!getDenomIdsList()
        .equals(other.getDenomIdsList())) return false;
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
    if (getDenomIdsCount() > 0) {
      hash = (37 * hash) + DENOM_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDenomIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest parseFrom(
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
  public static Builder newBuilder(com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest prototype) {
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
   * QueryCollectionsByIdsRequest is the request type for the Query/CollectionsByIds RPC method
   * </pre>
   *
   * Protobuf type {@code cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)
      com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.class, com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.Builder.class);
    }

    // Construct using com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.newBuilder()
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
      denomIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest_descriptor;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest getDefaultInstanceForType() {
      return com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest build() {
      com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest buildPartial() {
      com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest result = new com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        denomIds_.makeImmutable();
        result.denomIds_ = denomIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest) {
        return mergeFrom((com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest other) {
      if (other == com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.getDefaultInstance()) return this;
      if (!other.denomIds_.isEmpty()) {
        if (denomIds_.isEmpty()) {
          denomIds_ = other.denomIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureDenomIdsIsMutable();
          denomIds_.addAll(other.denomIds_);
        }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDenomIdsIsMutable();
              denomIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList denomIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDenomIdsIsMutable() {
      if (!denomIds_.isModifiable()) {
        denomIds_ = new com.google.protobuf.LazyStringArrayList(denomIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @return A list containing the denomIds.
     */
    public com.google.protobuf.ProtocolStringList
        getDenomIdsList() {
      denomIds_.makeImmutable();
      return denomIds_;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @return The count of denomIds.
     */
    public int getDenomIdsCount() {
      return denomIds_.size();
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param index The index of the element to return.
     * @return The denomIds at the given index.
     */
    public java.lang.String getDenomIds(int index) {
      return denomIds_.get(index);
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the denomIds at the given index.
     */
    public com.google.protobuf.ByteString
        getDenomIdsBytes(int index) {
      return denomIds_.getByteString(index);
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The denomIds to set.
     * @return This builder for chaining.
     */
    public Builder setDenomIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDenomIdsIsMutable();
      denomIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param value The denomIds to add.
     * @return This builder for chaining.
     */
    public Builder addDenomIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDenomIdsIsMutable();
      denomIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param values The denomIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDenomIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureDenomIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, denomIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenomIds() {
      denomIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string denom_ids = 1 [json_name = "denomIds", (.gogoproto.moretags) = "yaml:&#92;"denom_ids&#92;""];</code>
     * @param value The bytes of the denomIds to add.
     * @return This builder for chaining.
     */
    public Builder addDenomIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDenomIdsIsMutable();
      denomIds_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)
  }

  // @@protoc_insertion_point(class_scope:cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest)
  private static final com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest();
  }

  public static com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCollectionsByIdsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryCollectionsByIdsRequest>() {
    @java.lang.Override
    public QueryCollectionsByIdsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCollectionsByIdsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCollectionsByIdsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

