// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QueryAggregateVolumesRequest is the request type for the
 * Query/AggregateVolumes RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QueryAggregateVolumesRequest}
 */
public final class QueryAggregateVolumesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QueryAggregateVolumesRequest)
    QueryAggregateVolumesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAggregateVolumesRequest.newBuilder() to construct.
  private QueryAggregateVolumesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAggregateVolumesRequest() {
    accounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    marketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAggregateVolumesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryAggregateVolumesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryAggregateVolumesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.class, com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.Builder.class);
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList accounts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @return A list containing the accounts.
   */
  public com.google.protobuf.ProtocolStringList
      getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @return The count of accounts.
   */
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @param index The index of the element to return.
   * @return The accounts at the given index.
   */
  public java.lang.String getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the accounts at the given index.
   */
  public com.google.protobuf.ByteString
      getAccountsBytes(int index) {
    return accounts_.getByteString(index);
  }

  public static final int MARKET_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList marketIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @return A list containing the marketIds.
   */
  public com.google.protobuf.ProtocolStringList
      getMarketIdsList() {
    return marketIds_;
  }
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @return The count of marketIds.
   */
  public int getMarketIdsCount() {
    return marketIds_.size();
  }
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @param index The index of the element to return.
   * @return The marketIds at the given index.
   */
  public java.lang.String getMarketIds(int index) {
    return marketIds_.get(index);
  }
  /**
   * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the marketIds at the given index.
   */
  public com.google.protobuf.ByteString
      getMarketIdsBytes(int index) {
    return marketIds_.getByteString(index);
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
    for (int i = 0; i < accounts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accounts_.getRaw(i));
    }
    for (int i = 0; i < marketIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, marketIds_.getRaw(i));
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
      for (int i = 0; i < accounts_.size(); i++) {
        dataSize += computeStringSizeNoTag(accounts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAccountsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < marketIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(marketIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMarketIdsList().size();
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QueryAggregateVolumesRequest)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QueryAggregateVolumesRequest other = (com.injective.exchange.v1beta1.QueryAggregateVolumesRequest) obj;

    if (!getAccountsList()
        .equals(other.getAccountsList())) return false;
    if (!getMarketIdsList()
        .equals(other.getMarketIdsList())) return false;
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
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    if (getMarketIdsCount() > 0) {
      hash = (37 * hash) + MARKET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getMarketIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest prototype) {
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
   * QueryAggregateVolumesRequest is the request type for the
   * Query/AggregateVolumes RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QueryAggregateVolumesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QueryAggregateVolumesRequest)
      com.injective.exchange.v1beta1.QueryAggregateVolumesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryAggregateVolumesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryAggregateVolumesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.class, com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.newBuilder()
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
      accounts_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      marketIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryAggregateVolumesRequest_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryAggregateVolumesRequest getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryAggregateVolumesRequest build() {
      com.injective.exchange.v1beta1.QueryAggregateVolumesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryAggregateVolumesRequest buildPartial() {
      com.injective.exchange.v1beta1.QueryAggregateVolumesRequest result = new com.injective.exchange.v1beta1.QueryAggregateVolumesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        accounts_.makeImmutable();
        result.accounts_ = accounts_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        marketIds_.makeImmutable();
        result.marketIds_ = marketIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QueryAggregateVolumesRequest) {
        return mergeFrom((com.injective.exchange.v1beta1.QueryAggregateVolumesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QueryAggregateVolumesRequest other) {
      if (other == com.injective.exchange.v1beta1.QueryAggregateVolumesRequest.getDefaultInstance()) return this;
      if (!other.accounts_.isEmpty()) {
        if (accounts_.isEmpty()) {
          accounts_ = other.accounts_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAccountsIsMutable();
          accounts_.addAll(other.accounts_);
        }
        onChanged();
      }
      if (!other.marketIds_.isEmpty()) {
        if (marketIds_.isEmpty()) {
          marketIds_ = other.marketIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureMarketIdsIsMutable();
          marketIds_.addAll(other.marketIds_);
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
              ensureAccountsIsMutable();
              accounts_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureMarketIdsIsMutable();
              marketIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList accounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAccountsIsMutable() {
      if (!accounts_.isModifiable()) {
        accounts_ = new com.google.protobuf.LazyStringArrayList(accounts_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @return A list containing the accounts.
     */
    public com.google.protobuf.ProtocolStringList
        getAccountsList() {
      accounts_.makeImmutable();
      return accounts_;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @return The count of accounts.
     */
    public int getAccountsCount() {
      return accounts_.size();
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param index The index of the element to return.
     * @return The accounts at the given index.
     */
    public java.lang.String getAccounts(int index) {
      return accounts_.get(index);
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the accounts at the given index.
     */
    public com.google.protobuf.ByteString
        getAccountsBytes(int index) {
      return accounts_.getByteString(index);
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param index The index to set the value at.
     * @param value The accounts to set.
     * @return This builder for chaining.
     */
    public Builder setAccounts(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAccountsIsMutable();
      accounts_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param value The accounts to add.
     * @return This builder for chaining.
     */
    public Builder addAccounts(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAccountsIsMutable();
      accounts_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param values The accounts to add.
     * @return This builder for chaining.
     */
    public Builder addAllAccounts(
        java.lang.Iterable<java.lang.String> values) {
      ensureAccountsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, accounts_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccounts() {
      accounts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string accounts = 1 [json_name = "accounts"];</code>
     * @param value The bytes of the accounts to add.
     * @return This builder for chaining.
     */
    public Builder addAccountsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAccountsIsMutable();
      accounts_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList marketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureMarketIdsIsMutable() {
      if (!marketIds_.isModifiable()) {
        marketIds_ = new com.google.protobuf.LazyStringArrayList(marketIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @return A list containing the marketIds.
     */
    public com.google.protobuf.ProtocolStringList
        getMarketIdsList() {
      marketIds_.makeImmutable();
      return marketIds_;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @return The count of marketIds.
     */
    public int getMarketIdsCount() {
      return marketIds_.size();
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param index The index of the element to return.
     * @return The marketIds at the given index.
     */
    public java.lang.String getMarketIds(int index) {
      return marketIds_.get(index);
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the marketIds at the given index.
     */
    public com.google.protobuf.ByteString
        getMarketIdsBytes(int index) {
      return marketIds_.getByteString(index);
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param index The index to set the value at.
     * @param value The marketIds to set.
     * @return This builder for chaining.
     */
    public Builder setMarketIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMarketIdsIsMutable();
      marketIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param value The marketIds to add.
     * @return This builder for chaining.
     */
    public Builder addMarketIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureMarketIdsIsMutable();
      marketIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param values The marketIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllMarketIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureMarketIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, marketIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMarketIds() {
      marketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string market_ids = 2 [json_name = "marketIds"];</code>
     * @param value The bytes of the marketIds to add.
     * @return This builder for chaining.
     */
    public Builder addMarketIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureMarketIdsIsMutable();
      marketIds_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QueryAggregateVolumesRequest)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QueryAggregateVolumesRequest)
  private static final com.injective.exchange.v1beta1.QueryAggregateVolumesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QueryAggregateVolumesRequest();
  }

  public static com.injective.exchange.v1beta1.QueryAggregateVolumesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAggregateVolumesRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryAggregateVolumesRequest>() {
    @java.lang.Override
    public QueryAggregateVolumesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAggregateVolumesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAggregateVolumesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QueryAggregateVolumesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

