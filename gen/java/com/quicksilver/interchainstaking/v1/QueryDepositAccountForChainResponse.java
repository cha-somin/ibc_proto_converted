// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/interchainstaking/v1/query.proto

package com.quicksilver.interchainstaking.v1;

/**
 * <pre>
 * QueryDepositAccountForChainResponse the response type for the
 * Query/InterchainAccountAddress RPC
 * </pre>
 *
 * Protobuf type {@code quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse}
 */
public final class QueryDepositAccountForChainResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)
    QueryDepositAccountForChainResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDepositAccountForChainResponse.newBuilder() to construct.
  private QueryDepositAccountForChainResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDepositAccountForChainResponse() {
    depositAccountAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDepositAccountForChainResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.class, com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.Builder.class);
  }

  public static final int DEPOSIT_ACCOUNT_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object depositAccountAddress_ = "";
  /**
   * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
   * @return The depositAccountAddress.
   */
  @java.lang.Override
  public java.lang.String getDepositAccountAddress() {
    java.lang.Object ref = depositAccountAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      depositAccountAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
   * @return The bytes for depositAccountAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepositAccountAddressBytes() {
    java.lang.Object ref = depositAccountAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      depositAccountAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositAccountAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, depositAccountAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositAccountAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, depositAccountAddress_);
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
    if (!(obj instanceof com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)) {
      return super.equals(obj);
    }
    com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse other = (com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse) obj;

    if (!getDepositAccountAddress()
        .equals(other.getDepositAccountAddress())) return false;
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
    hash = (37 * hash) + DEPOSIT_ACCOUNT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDepositAccountAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse parseFrom(
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
  public static Builder newBuilder(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse prototype) {
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
   * QueryDepositAccountForChainResponse the response type for the
   * Query/InterchainAccountAddress RPC
   * </pre>
   *
   * Protobuf type {@code quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)
      com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.class, com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.Builder.class);
    }

    // Construct using com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.newBuilder()
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
      depositAccountAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quicksilver.interchainstaking.v1.QueryProto.internal_static_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse getDefaultInstanceForType() {
      return com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse build() {
      com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse buildPartial() {
      com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse result = new com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.depositAccountAddress_ = depositAccountAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse) {
        return mergeFrom((com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse other) {
      if (other == com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.getDefaultInstance()) return this;
      if (!other.getDepositAccountAddress().isEmpty()) {
        depositAccountAddress_ = other.depositAccountAddress_;
        bitField0_ |= 0x00000001;
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
              depositAccountAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object depositAccountAddress_ = "";
    /**
     * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
     * @return The depositAccountAddress.
     */
    public java.lang.String getDepositAccountAddress() {
      java.lang.Object ref = depositAccountAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        depositAccountAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
     * @return The bytes for depositAccountAddress.
     */
    public com.google.protobuf.ByteString
        getDepositAccountAddressBytes() {
      java.lang.Object ref = depositAccountAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        depositAccountAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
     * @param value The depositAccountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositAccountAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      depositAccountAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositAccountAddress() {
      depositAccountAddress_ = getDefaultInstance().getDepositAccountAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string deposit_account_address = 1 [json_name = "depositAccountAddress", (.gogoproto.moretags) = "yaml:&#92;"deposit_account_address&#92;""];</code>
     * @param value The bytes for depositAccountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositAccountAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositAccountAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse)
  private static final com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse();
  }

  public static com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDepositAccountForChainResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDepositAccountForChainResponse>() {
    @java.lang.Override
    public QueryDepositAccountForChainResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDepositAccountForChainResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDepositAccountForChainResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

