// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QuerySubaccountDepositsResponse is the response type for the
 * Query/SubaccountDeposits RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QuerySubaccountDepositResponse}
 */
public final class QuerySubaccountDepositResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QuerySubaccountDepositResponse)
    QuerySubaccountDepositResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySubaccountDepositResponse.newBuilder() to construct.
  private QuerySubaccountDepositResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySubaccountDepositResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySubaccountDepositResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySubaccountDepositResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySubaccountDepositResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.class, com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.Builder.class);
  }

  public static final int DEPOSITS_FIELD_NUMBER = 1;
  private com.injective.exchange.v1beta1.Deposit deposits_;
  /**
   * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
   * @return Whether the deposits field is set.
   */
  @java.lang.Override
  public boolean hasDeposits() {
    return deposits_ != null;
  }
  /**
   * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
   * @return The deposits.
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.Deposit getDeposits() {
    return deposits_ == null ? com.injective.exchange.v1beta1.Deposit.getDefaultInstance() : deposits_;
  }
  /**
   * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.DepositOrBuilder getDepositsOrBuilder() {
    return deposits_ == null ? com.injective.exchange.v1beta1.Deposit.getDefaultInstance() : deposits_;
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
    if (deposits_ != null) {
      output.writeMessage(1, getDeposits());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deposits_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeposits());
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QuerySubaccountDepositResponse)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QuerySubaccountDepositResponse other = (com.injective.exchange.v1beta1.QuerySubaccountDepositResponse) obj;

    if (hasDeposits() != other.hasDeposits()) return false;
    if (hasDeposits()) {
      if (!getDeposits()
          .equals(other.getDeposits())) return false;
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
    if (hasDeposits()) {
      hash = (37 * hash) + DEPOSITS_FIELD_NUMBER;
      hash = (53 * hash) + getDeposits().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QuerySubaccountDepositResponse prototype) {
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
   * QuerySubaccountDepositsResponse is the response type for the
   * Query/SubaccountDeposits RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QuerySubaccountDepositResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QuerySubaccountDepositResponse)
      com.injective.exchange.v1beta1.QuerySubaccountDepositResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySubaccountDepositResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySubaccountDepositResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.class, com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.newBuilder()
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
      deposits_ = null;
      if (depositsBuilder_ != null) {
        depositsBuilder_.dispose();
        depositsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QuerySubaccountDepositResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySubaccountDepositResponse getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySubaccountDepositResponse build() {
      com.injective.exchange.v1beta1.QuerySubaccountDepositResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QuerySubaccountDepositResponse buildPartial() {
      com.injective.exchange.v1beta1.QuerySubaccountDepositResponse result = new com.injective.exchange.v1beta1.QuerySubaccountDepositResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QuerySubaccountDepositResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deposits_ = depositsBuilder_ == null
            ? deposits_
            : depositsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QuerySubaccountDepositResponse) {
        return mergeFrom((com.injective.exchange.v1beta1.QuerySubaccountDepositResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QuerySubaccountDepositResponse other) {
      if (other == com.injective.exchange.v1beta1.QuerySubaccountDepositResponse.getDefaultInstance()) return this;
      if (other.hasDeposits()) {
        mergeDeposits(other.getDeposits());
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
                  getDepositsFieldBuilder().getBuilder(),
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

    private com.injective.exchange.v1beta1.Deposit deposits_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.Deposit, com.injective.exchange.v1beta1.Deposit.Builder, com.injective.exchange.v1beta1.DepositOrBuilder> depositsBuilder_;
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     * @return Whether the deposits field is set.
     */
    public boolean hasDeposits() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     * @return The deposits.
     */
    public com.injective.exchange.v1beta1.Deposit getDeposits() {
      if (depositsBuilder_ == null) {
        return deposits_ == null ? com.injective.exchange.v1beta1.Deposit.getDefaultInstance() : deposits_;
      } else {
        return depositsBuilder_.getMessage();
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public Builder setDeposits(com.injective.exchange.v1beta1.Deposit value) {
      if (depositsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deposits_ = value;
      } else {
        depositsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public Builder setDeposits(
        com.injective.exchange.v1beta1.Deposit.Builder builderForValue) {
      if (depositsBuilder_ == null) {
        deposits_ = builderForValue.build();
      } else {
        depositsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public Builder mergeDeposits(com.injective.exchange.v1beta1.Deposit value) {
      if (depositsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          deposits_ != null &&
          deposits_ != com.injective.exchange.v1beta1.Deposit.getDefaultInstance()) {
          getDepositsBuilder().mergeFrom(value);
        } else {
          deposits_ = value;
        }
      } else {
        depositsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public Builder clearDeposits() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deposits_ = null;
      if (depositsBuilder_ != null) {
        depositsBuilder_.dispose();
        depositsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public com.injective.exchange.v1beta1.Deposit.Builder getDepositsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDepositsFieldBuilder().getBuilder();
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    public com.injective.exchange.v1beta1.DepositOrBuilder getDepositsOrBuilder() {
      if (depositsBuilder_ != null) {
        return depositsBuilder_.getMessageOrBuilder();
      } else {
        return deposits_ == null ?
            com.injective.exchange.v1beta1.Deposit.getDefaultInstance() : deposits_;
      }
    }
    /**
     * <code>.injective.exchange.v1beta1.Deposit deposits = 1 [json_name = "deposits"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.injective.exchange.v1beta1.Deposit, com.injective.exchange.v1beta1.Deposit.Builder, com.injective.exchange.v1beta1.DepositOrBuilder> 
        getDepositsFieldBuilder() {
      if (depositsBuilder_ == null) {
        depositsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.injective.exchange.v1beta1.Deposit, com.injective.exchange.v1beta1.Deposit.Builder, com.injective.exchange.v1beta1.DepositOrBuilder>(
                getDeposits(),
                getParentForChildren(),
                isClean());
        deposits_ = null;
      }
      return depositsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QuerySubaccountDepositResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QuerySubaccountDepositResponse)
  private static final com.injective.exchange.v1beta1.QuerySubaccountDepositResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QuerySubaccountDepositResponse();
  }

  public static com.injective.exchange.v1beta1.QuerySubaccountDepositResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySubaccountDepositResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySubaccountDepositResponse>() {
    @java.lang.Override
    public QuerySubaccountDepositResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySubaccountDepositResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySubaccountDepositResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QuerySubaccountDepositResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

