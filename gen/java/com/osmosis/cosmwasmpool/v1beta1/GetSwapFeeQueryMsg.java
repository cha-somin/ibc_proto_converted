// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/cosmwasmpool/v1beta1/model/pool_query_msg.proto

package com.osmosis.cosmwasmpool.v1beta1;

/**
 * <pre>
 * ===================== GetSwapFeeQueryMsg
 * </pre>
 *
 * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg}
 */
public final class GetSwapFeeQueryMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)
    GetSwapFeeQueryMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSwapFeeQueryMsg.newBuilder() to construct.
  private GetSwapFeeQueryMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSwapFeeQueryMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSwapFeeQueryMsg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.cosmwasmpool.v1beta1.PoolQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_GetSwapFeeQueryMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.cosmwasmpool.v1beta1.PoolQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_GetSwapFeeQueryMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.class, com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.Builder.class);
  }

  public static final int GET_SWAP_FEE_FIELD_NUMBER = 1;
  private com.osmosis.cosmwasmpool.v1beta1.EmptyStruct getSwapFee_;
  /**
   * <pre>
   * get_swap_fee is the query strcuture to get swap fee.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
   * @return Whether the getSwapFee field is set.
   */
  @java.lang.Override
  public boolean hasGetSwapFee() {
    return getSwapFee_ != null;
  }
  /**
   * <pre>
   * get_swap_fee is the query strcuture to get swap fee.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
   * @return The getSwapFee.
   */
  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.EmptyStruct getGetSwapFee() {
    return getSwapFee_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.getDefaultInstance() : getSwapFee_;
  }
  /**
   * <pre>
   * get_swap_fee is the query strcuture to get swap fee.
   * </pre>
   *
   * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.EmptyStructOrBuilder getGetSwapFeeOrBuilder() {
    return getSwapFee_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.getDefaultInstance() : getSwapFee_;
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
    if (getSwapFee_ != null) {
      output.writeMessage(1, getGetSwapFee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (getSwapFee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGetSwapFee());
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
    if (!(obj instanceof com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)) {
      return super.equals(obj);
    }
    com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg other = (com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg) obj;

    if (hasGetSwapFee() != other.hasGetSwapFee()) return false;
    if (hasGetSwapFee()) {
      if (!getGetSwapFee()
          .equals(other.getGetSwapFee())) return false;
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
    if (hasGetSwapFee()) {
      hash = (37 * hash) + GET_SWAP_FEE_FIELD_NUMBER;
      hash = (53 * hash) + getGetSwapFee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg parseFrom(
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
  public static Builder newBuilder(com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg prototype) {
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
   * ===================== GetSwapFeeQueryMsg
   * </pre>
   *
   * Protobuf type {@code osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)
      com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.cosmwasmpool.v1beta1.PoolQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_GetSwapFeeQueryMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.cosmwasmpool.v1beta1.PoolQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_GetSwapFeeQueryMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.class, com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.Builder.class);
    }

    // Construct using com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.newBuilder()
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
      getSwapFee_ = null;
      if (getSwapFeeBuilder_ != null) {
        getSwapFeeBuilder_.dispose();
        getSwapFeeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.cosmwasmpool.v1beta1.PoolQueryMsgProto.internal_static_osmosis_cosmwasmpool_v1beta1_GetSwapFeeQueryMsg_descriptor;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg getDefaultInstanceForType() {
      return com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg build() {
      com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg buildPartial() {
      com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg result = new com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.getSwapFee_ = getSwapFeeBuilder_ == null
            ? getSwapFee_
            : getSwapFeeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg) {
        return mergeFrom((com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg other) {
      if (other == com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg.getDefaultInstance()) return this;
      if (other.hasGetSwapFee()) {
        mergeGetSwapFee(other.getGetSwapFee());
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
                  getGetSwapFeeFieldBuilder().getBuilder(),
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

    private com.osmosis.cosmwasmpool.v1beta1.EmptyStruct getSwapFee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.cosmwasmpool.v1beta1.EmptyStruct, com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyStructOrBuilder> getSwapFeeBuilder_;
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     * @return Whether the getSwapFee field is set.
     */
    public boolean hasGetSwapFee() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     * @return The getSwapFee.
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyStruct getGetSwapFee() {
      if (getSwapFeeBuilder_ == null) {
        return getSwapFee_ == null ? com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.getDefaultInstance() : getSwapFee_;
      } else {
        return getSwapFeeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGetSwapFee(com.osmosis.cosmwasmpool.v1beta1.EmptyStruct value) {
      if (getSwapFeeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        getSwapFee_ = value;
      } else {
        getSwapFeeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGetSwapFee(
        com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.Builder builderForValue) {
      if (getSwapFeeBuilder_ == null) {
        getSwapFee_ = builderForValue.build();
      } else {
        getSwapFeeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeGetSwapFee(com.osmosis.cosmwasmpool.v1beta1.EmptyStruct value) {
      if (getSwapFeeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          getSwapFee_ != null &&
          getSwapFee_ != com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.getDefaultInstance()) {
          getGetSwapFeeBuilder().mergeFrom(value);
        } else {
          getSwapFee_ = value;
        }
      } else {
        getSwapFeeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearGetSwapFee() {
      bitField0_ = (bitField0_ & ~0x00000001);
      getSwapFee_ = null;
      if (getSwapFeeBuilder_ != null) {
        getSwapFeeBuilder_.dispose();
        getSwapFeeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.Builder getGetSwapFeeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGetSwapFeeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    public com.osmosis.cosmwasmpool.v1beta1.EmptyStructOrBuilder getGetSwapFeeOrBuilder() {
      if (getSwapFeeBuilder_ != null) {
        return getSwapFeeBuilder_.getMessageOrBuilder();
      } else {
        return getSwapFee_ == null ?
            com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.getDefaultInstance() : getSwapFee_;
      }
    }
    /**
     * <pre>
     * get_swap_fee is the query strcuture to get swap fee.
     * </pre>
     *
     * <code>.osmosis.cosmwasmpool.v1beta1.EmptyStruct get_swap_fee = 1 [json_name = "getSwapFee", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.osmosis.cosmwasmpool.v1beta1.EmptyStruct, com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyStructOrBuilder> 
        getGetSwapFeeFieldBuilder() {
      if (getSwapFeeBuilder_ == null) {
        getSwapFeeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.osmosis.cosmwasmpool.v1beta1.EmptyStruct, com.osmosis.cosmwasmpool.v1beta1.EmptyStruct.Builder, com.osmosis.cosmwasmpool.v1beta1.EmptyStructOrBuilder>(
                getGetSwapFee(),
                getParentForChildren(),
                isClean());
        getSwapFee_ = null;
      }
      return getSwapFeeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)
  }

  // @@protoc_insertion_point(class_scope:osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg)
  private static final com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg();
  }

  public static com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSwapFeeQueryMsg>
      PARSER = new com.google.protobuf.AbstractParser<GetSwapFeeQueryMsg>() {
    @java.lang.Override
    public GetSwapFeeQueryMsg parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSwapFeeQueryMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSwapFeeQueryMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.cosmwasmpool.v1beta1.GetSwapFeeQueryMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

