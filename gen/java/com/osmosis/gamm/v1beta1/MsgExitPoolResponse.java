// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/tx.proto

package com.osmosis.gamm.v1beta1;

/**
 * Protobuf type {@code osmosis.gamm.v1beta1.MsgExitPoolResponse}
 */
public final class MsgExitPoolResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.gamm.v1beta1.MsgExitPoolResponse)
    MsgExitPoolResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgExitPoolResponse.newBuilder() to construct.
  private MsgExitPoolResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgExitPoolResponse() {
    tokenOut_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgExitPoolResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitPoolResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitPoolResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.gamm.v1beta1.MsgExitPoolResponse.class, com.osmosis.gamm.v1beta1.MsgExitPoolResponse.Builder.class);
  }

  public static final int TOKEN_OUT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> tokenOut_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getTokenOutList() {
    return tokenOut_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getTokenOutOrBuilderList() {
    return tokenOut_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  @java.lang.Override
  public int getTokenOutCount() {
    return tokenOut_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getTokenOut(int index) {
    return tokenOut_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder(
      int index) {
    return tokenOut_.get(index);
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
    for (int i = 0; i < tokenOut_.size(); i++) {
      output.writeMessage(1, tokenOut_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tokenOut_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tokenOut_.get(i));
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
    if (!(obj instanceof com.osmosis.gamm.v1beta1.MsgExitPoolResponse)) {
      return super.equals(obj);
    }
    com.osmosis.gamm.v1beta1.MsgExitPoolResponse other = (com.osmosis.gamm.v1beta1.MsgExitPoolResponse) obj;

    if (!getTokenOutList()
        .equals(other.getTokenOutList())) return false;
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
    if (getTokenOutCount() > 0) {
      hash = (37 * hash) + TOKEN_OUT_FIELD_NUMBER;
      hash = (53 * hash) + getTokenOutList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse parseFrom(
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
  public static Builder newBuilder(com.osmosis.gamm.v1beta1.MsgExitPoolResponse prototype) {
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
   * Protobuf type {@code osmosis.gamm.v1beta1.MsgExitPoolResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.gamm.v1beta1.MsgExitPoolResponse)
      com.osmosis.gamm.v1beta1.MsgExitPoolResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitPoolResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitPoolResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.gamm.v1beta1.MsgExitPoolResponse.class, com.osmosis.gamm.v1beta1.MsgExitPoolResponse.Builder.class);
    }

    // Construct using com.osmosis.gamm.v1beta1.MsgExitPoolResponse.newBuilder()
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
      if (tokenOutBuilder_ == null) {
        tokenOut_ = java.util.Collections.emptyList();
      } else {
        tokenOut_ = null;
        tokenOutBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.gamm.v1beta1.TxProto.internal_static_osmosis_gamm_v1beta1_MsgExitPoolResponse_descriptor;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitPoolResponse getDefaultInstanceForType() {
      return com.osmosis.gamm.v1beta1.MsgExitPoolResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitPoolResponse build() {
      com.osmosis.gamm.v1beta1.MsgExitPoolResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.gamm.v1beta1.MsgExitPoolResponse buildPartial() {
      com.osmosis.gamm.v1beta1.MsgExitPoolResponse result = new com.osmosis.gamm.v1beta1.MsgExitPoolResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.osmosis.gamm.v1beta1.MsgExitPoolResponse result) {
      if (tokenOutBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tokenOut_ = java.util.Collections.unmodifiableList(tokenOut_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tokenOut_ = tokenOut_;
      } else {
        result.tokenOut_ = tokenOutBuilder_.build();
      }
    }

    private void buildPartial0(com.osmosis.gamm.v1beta1.MsgExitPoolResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.gamm.v1beta1.MsgExitPoolResponse) {
        return mergeFrom((com.osmosis.gamm.v1beta1.MsgExitPoolResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.gamm.v1beta1.MsgExitPoolResponse other) {
      if (other == com.osmosis.gamm.v1beta1.MsgExitPoolResponse.getDefaultInstance()) return this;
      if (tokenOutBuilder_ == null) {
        if (!other.tokenOut_.isEmpty()) {
          if (tokenOut_.isEmpty()) {
            tokenOut_ = other.tokenOut_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTokenOutIsMutable();
            tokenOut_.addAll(other.tokenOut_);
          }
          onChanged();
        }
      } else {
        if (!other.tokenOut_.isEmpty()) {
          if (tokenOutBuilder_.isEmpty()) {
            tokenOutBuilder_.dispose();
            tokenOutBuilder_ = null;
            tokenOut_ = other.tokenOut_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tokenOutBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTokenOutFieldBuilder() : null;
          } else {
            tokenOutBuilder_.addAllMessages(other.tokenOut_);
          }
        }
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
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (tokenOutBuilder_ == null) {
                ensureTokenOutIsMutable();
                tokenOut_.add(m);
              } else {
                tokenOutBuilder_.addMessage(m);
              }
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> tokenOut_ =
      java.util.Collections.emptyList();
    private void ensureTokenOutIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tokenOut_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(tokenOut_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> tokenOutBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getTokenOutList() {
      if (tokenOutBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tokenOut_);
      } else {
        return tokenOutBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public int getTokenOutCount() {
      if (tokenOutBuilder_ == null) {
        return tokenOut_.size();
      } else {
        return tokenOutBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin getTokenOut(int index) {
      if (tokenOutBuilder_ == null) {
        return tokenOut_.get(index);
      } else {
        return tokenOutBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder setTokenOut(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (tokenOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenOutIsMutable();
        tokenOut_.set(index, value);
        onChanged();
      } else {
        tokenOutBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder setTokenOut(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenOutBuilder_ == null) {
        ensureTokenOutIsMutable();
        tokenOut_.set(index, builderForValue.build());
        onChanged();
      } else {
        tokenOutBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder addTokenOut(com.cosmos.base.v1beta1.Coin value) {
      if (tokenOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenOutIsMutable();
        tokenOut_.add(value);
        onChanged();
      } else {
        tokenOutBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder addTokenOut(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (tokenOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokenOutIsMutable();
        tokenOut_.add(index, value);
        onChanged();
      } else {
        tokenOutBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder addTokenOut(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenOutBuilder_ == null) {
        ensureTokenOutIsMutable();
        tokenOut_.add(builderForValue.build());
        onChanged();
      } else {
        tokenOutBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder addTokenOut(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (tokenOutBuilder_ == null) {
        ensureTokenOutIsMutable();
        tokenOut_.add(index, builderForValue.build());
        onChanged();
      } else {
        tokenOutBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder addAllTokenOut(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (tokenOutBuilder_ == null) {
        ensureTokenOutIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tokenOut_);
        onChanged();
      } else {
        tokenOutBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder clearTokenOut() {
      if (tokenOutBuilder_ == null) {
        tokenOut_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tokenOutBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public Builder removeTokenOut(int index) {
      if (tokenOutBuilder_ == null) {
        ensureTokenOutIsMutable();
        tokenOut_.remove(index);
        onChanged();
      } else {
        tokenOutBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getTokenOutBuilder(
        int index) {
      return getTokenOutFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getTokenOutOrBuilder(
        int index) {
      if (tokenOutBuilder_ == null) {
        return tokenOut_.get(index);  } else {
        return tokenOutBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getTokenOutOrBuilderList() {
      if (tokenOutBuilder_ != null) {
        return tokenOutBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tokenOut_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTokenOutBuilder() {
      return getTokenOutFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addTokenOutBuilder(
        int index) {
      return getTokenOutFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin token_out = 1 [json_name = "tokenOut", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"token_out&#92;""];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getTokenOutBuilderList() {
      return getTokenOutFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getTokenOutFieldBuilder() {
      if (tokenOutBuilder_ == null) {
        tokenOutBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                tokenOut_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tokenOut_ = null;
      }
      return tokenOutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:osmosis.gamm.v1beta1.MsgExitPoolResponse)
  }

  // @@protoc_insertion_point(class_scope:osmosis.gamm.v1beta1.MsgExitPoolResponse)
  private static final com.osmosis.gamm.v1beta1.MsgExitPoolResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.gamm.v1beta1.MsgExitPoolResponse();
  }

  public static com.osmosis.gamm.v1beta1.MsgExitPoolResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgExitPoolResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgExitPoolResponse>() {
    @java.lang.Override
    public MsgExitPoolResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgExitPoolResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgExitPoolResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.gamm.v1beta1.MsgExitPoolResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

