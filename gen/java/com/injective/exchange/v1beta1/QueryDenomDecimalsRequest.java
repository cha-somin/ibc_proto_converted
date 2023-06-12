// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QueryDenomDecimalsRequest is the request type for the Query/DenomDecimals RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QueryDenomDecimalsRequest}
 */
public final class QueryDenomDecimalsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QueryDenomDecimalsRequest)
    QueryDenomDecimalsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomDecimalsRequest.newBuilder() to construct.
  private QueryDenomDecimalsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomDecimalsRequest() {
    denoms_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomDecimalsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryDenomDecimalsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryDenomDecimalsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.class, com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.Builder.class);
  }

  public static final int DENOMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList denoms_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * denoms can be empty to query all denom decimals
   * </pre>
   *
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @return A list containing the denoms.
   */
  public com.google.protobuf.ProtocolStringList
      getDenomsList() {
    return denoms_;
  }
  /**
   * <pre>
   * denoms can be empty to query all denom decimals
   * </pre>
   *
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @return The count of denoms.
   */
  public int getDenomsCount() {
    return denoms_.size();
  }
  /**
   * <pre>
   * denoms can be empty to query all denom decimals
   * </pre>
   *
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @param index The index of the element to return.
   * @return The denoms at the given index.
   */
  public java.lang.String getDenoms(int index) {
    return denoms_.get(index);
  }
  /**
   * <pre>
   * denoms can be empty to query all denom decimals
   * </pre>
   *
   * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the denoms at the given index.
   */
  public com.google.protobuf.ByteString
      getDenomsBytes(int index) {
    return denoms_.getByteString(index);
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.injective.exchange.v1beta1.QueryDenomDecimalsRequest)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QueryDenomDecimalsRequest other = (com.injective.exchange.v1beta1.QueryDenomDecimalsRequest) obj;

    if (!getDenomsList()
        .equals(other.getDenomsList())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest prototype) {
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
   * QueryDenomDecimalsRequest is the request type for the Query/DenomDecimals RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QueryDenomDecimalsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QueryDenomDecimalsRequest)
      com.injective.exchange.v1beta1.QueryDenomDecimalsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryDenomDecimalsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryDenomDecimalsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.class, com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryDenomDecimalsRequest_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryDenomDecimalsRequest getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryDenomDecimalsRequest build() {
      com.injective.exchange.v1beta1.QueryDenomDecimalsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryDenomDecimalsRequest buildPartial() {
      com.injective.exchange.v1beta1.QueryDenomDecimalsRequest result = new com.injective.exchange.v1beta1.QueryDenomDecimalsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        denoms_.makeImmutable();
        result.denoms_ = denoms_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QueryDenomDecimalsRequest) {
        return mergeFrom((com.injective.exchange.v1beta1.QueryDenomDecimalsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QueryDenomDecimalsRequest other) {
      if (other == com.injective.exchange.v1beta1.QueryDenomDecimalsRequest.getDefaultInstance()) return this;
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
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @return A list containing the denoms.
     */
    public com.google.protobuf.ProtocolStringList
        getDenomsList() {
      denoms_.makeImmutable();
      return denoms_;
    }
    /**
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @return The count of denoms.
     */
    public int getDenomsCount() {
      return denoms_.size();
    }
    /**
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param index The index of the element to return.
     * @return The denoms at the given index.
     */
    public java.lang.String getDenoms(int index) {
      return denoms_.get(index);
    }
    /**
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
     * <code>repeated string denoms = 1 [json_name = "denoms"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the denoms at the given index.
     */
    public com.google.protobuf.ByteString
        getDenomsBytes(int index) {
      return denoms_.getByteString(index);
    }
    /**
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
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
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
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
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
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
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
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
     * <pre>
     * denoms can be empty to query all denom decimals
     * </pre>
     *
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QueryDenomDecimalsRequest)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QueryDenomDecimalsRequest)
  private static final com.injective.exchange.v1beta1.QueryDenomDecimalsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QueryDenomDecimalsRequest();
  }

  public static com.injective.exchange.v1beta1.QueryDenomDecimalsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomDecimalsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomDecimalsRequest>() {
    @java.lang.Override
    public QueryDenomDecimalsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomDecimalsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomDecimalsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QueryDenomDecimalsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

