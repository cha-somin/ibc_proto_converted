// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/query.proto

package com.cosmwasm.wasm.v1;

/**
 * <pre>
 * QueryRawContractStateRequest is the request type for the
 * Query/RawContractState RPC method
 * </pre>
 *
 * Protobuf type {@code cosmwasm.wasm.v1.QueryRawContractStateRequest}
 */
public final class QueryRawContractStateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmwasm.wasm.v1.QueryRawContractStateRequest)
    QueryRawContractStateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRawContractStateRequest.newBuilder() to construct.
  private QueryRawContractStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRawContractStateRequest() {
    address_ = "";
    queryData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRawContractStateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmwasm.wasm.v1.QueryProto.internal_static_cosmwasm_wasm_v1_QueryRawContractStateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmwasm.wasm.v1.QueryProto.internal_static_cosmwasm_wasm_v1_QueryRawContractStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmwasm.wasm.v1.QueryRawContractStateRequest.class, com.cosmwasm.wasm.v1.QueryRawContractStateRequest.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <pre>
   * address is the address of the contract
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * address is the address of the contract
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString queryData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes query_data = 2 [json_name = "queryData"];</code>
   * @return The queryData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQueryData() {
    return queryData_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!queryData_.isEmpty()) {
      output.writeBytes(2, queryData_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!queryData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, queryData_);
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
    if (!(obj instanceof com.cosmwasm.wasm.v1.QueryRawContractStateRequest)) {
      return super.equals(obj);
    }
    com.cosmwasm.wasm.v1.QueryRawContractStateRequest other = (com.cosmwasm.wasm.v1.QueryRawContractStateRequest) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getQueryData()
        .equals(other.getQueryData())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + QUERY_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getQueryData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest parseFrom(
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
  public static Builder newBuilder(com.cosmwasm.wasm.v1.QueryRawContractStateRequest prototype) {
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
   * QueryRawContractStateRequest is the request type for the
   * Query/RawContractState RPC method
   * </pre>
   *
   * Protobuf type {@code cosmwasm.wasm.v1.QueryRawContractStateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmwasm.wasm.v1.QueryRawContractStateRequest)
      com.cosmwasm.wasm.v1.QueryRawContractStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmwasm.wasm.v1.QueryProto.internal_static_cosmwasm_wasm_v1_QueryRawContractStateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmwasm.wasm.v1.QueryProto.internal_static_cosmwasm_wasm_v1_QueryRawContractStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmwasm.wasm.v1.QueryRawContractStateRequest.class, com.cosmwasm.wasm.v1.QueryRawContractStateRequest.Builder.class);
    }

    // Construct using com.cosmwasm.wasm.v1.QueryRawContractStateRequest.newBuilder()
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
      address_ = "";
      queryData_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmwasm.wasm.v1.QueryProto.internal_static_cosmwasm_wasm_v1_QueryRawContractStateRequest_descriptor;
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.QueryRawContractStateRequest getDefaultInstanceForType() {
      return com.cosmwasm.wasm.v1.QueryRawContractStateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.QueryRawContractStateRequest build() {
      com.cosmwasm.wasm.v1.QueryRawContractStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.QueryRawContractStateRequest buildPartial() {
      com.cosmwasm.wasm.v1.QueryRawContractStateRequest result = new com.cosmwasm.wasm.v1.QueryRawContractStateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmwasm.wasm.v1.QueryRawContractStateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queryData_ = queryData_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmwasm.wasm.v1.QueryRawContractStateRequest) {
        return mergeFrom((com.cosmwasm.wasm.v1.QueryRawContractStateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmwasm.wasm.v1.QueryRawContractStateRequest other) {
      if (other == com.cosmwasm.wasm.v1.QueryRawContractStateRequest.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getQueryData() != com.google.protobuf.ByteString.EMPTY) {
        setQueryData(other.getQueryData());
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              queryData_ = input.readBytes();
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

    private java.lang.Object address_ = "";
    /**
     * <pre>
     * address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * address is the address of the contract
     * </pre>
     *
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString queryData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes query_data = 2 [json_name = "queryData"];</code>
     * @return The queryData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getQueryData() {
      return queryData_;
    }
    /**
     * <code>bytes query_data = 2 [json_name = "queryData"];</code>
     * @param value The queryData to set.
     * @return This builder for chaining.
     */
    public Builder setQueryData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      queryData_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes query_data = 2 [json_name = "queryData"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      queryData_ = getDefaultInstance().getQueryData();
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


    // @@protoc_insertion_point(builder_scope:cosmwasm.wasm.v1.QueryRawContractStateRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmwasm.wasm.v1.QueryRawContractStateRequest)
  private static final com.cosmwasm.wasm.v1.QueryRawContractStateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmwasm.wasm.v1.QueryRawContractStateRequest();
  }

  public static com.cosmwasm.wasm.v1.QueryRawContractStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRawContractStateRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRawContractStateRequest>() {
    @java.lang.Override
    public QueryRawContractStateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRawContractStateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRawContractStateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmwasm.wasm.v1.QueryRawContractStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

