// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

/**
 * Protobuf type {@code likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse}
 */
public final class MsgUpdateRoyaltyConfigResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)
    MsgUpdateRoyaltyConfigResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateRoyaltyConfigResponse.newBuilder() to construct.
  private MsgUpdateRoyaltyConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateRoyaltyConfigResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateRoyaltyConfigResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.class, com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.Builder.class);
  }

  public static final int ROYALTY_CONFIG_FIELD_NUMBER = 1;
  private com.likechain.likenft.v1.RoyaltyConfig royaltyConfig_;
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return Whether the royaltyConfig field is set.
   */
  @java.lang.Override
  public boolean hasRoyaltyConfig() {
    return royaltyConfig_ != null;
  }
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return The royaltyConfig.
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyConfig getRoyaltyConfig() {
    return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance() : royaltyConfig_;
  }
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.likechain.likenft.v1.RoyaltyConfigOrBuilder getRoyaltyConfigOrBuilder() {
    return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance() : royaltyConfig_;
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
    if (royaltyConfig_ != null) {
      output.writeMessage(1, getRoyaltyConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (royaltyConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRoyaltyConfig());
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
    if (!(obj instanceof com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)) {
      return super.equals(obj);
    }
    com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse other = (com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse) obj;

    if (hasRoyaltyConfig() != other.hasRoyaltyConfig()) return false;
    if (hasRoyaltyConfig()) {
      if (!getRoyaltyConfig()
          .equals(other.getRoyaltyConfig())) return false;
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
    if (hasRoyaltyConfig()) {
      hash = (37 * hash) + ROYALTY_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getRoyaltyConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse parseFrom(
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
  public static Builder newBuilder(com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse prototype) {
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
   * Protobuf type {@code likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)
      com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.class, com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.Builder.class);
    }

    // Construct using com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.newBuilder()
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
      royaltyConfig_ = null;
      if (royaltyConfigBuilder_ != null) {
        royaltyConfigBuilder_.dispose();
        royaltyConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.likenft.v1.TxProto.internal_static_likechain_likenft_v1_MsgUpdateRoyaltyConfigResponse_descriptor;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse getDefaultInstanceForType() {
      return com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse build() {
      com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse buildPartial() {
      com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse result = new com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.royaltyConfig_ = royaltyConfigBuilder_ == null
            ? royaltyConfig_
            : royaltyConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse) {
        return mergeFrom((com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse other) {
      if (other == com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse.getDefaultInstance()) return this;
      if (other.hasRoyaltyConfig()) {
        mergeRoyaltyConfig(other.getRoyaltyConfig());
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
                  getRoyaltyConfigFieldBuilder().getBuilder(),
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

    private com.likechain.likenft.v1.RoyaltyConfig royaltyConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyConfig, com.likechain.likenft.v1.RoyaltyConfig.Builder, com.likechain.likenft.v1.RoyaltyConfigOrBuilder> royaltyConfigBuilder_;
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     * @return Whether the royaltyConfig field is set.
     */
    public boolean hasRoyaltyConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     * @return The royaltyConfig.
     */
    public com.likechain.likenft.v1.RoyaltyConfig getRoyaltyConfig() {
      if (royaltyConfigBuilder_ == null) {
        return royaltyConfig_ == null ? com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance() : royaltyConfig_;
      } else {
        return royaltyConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRoyaltyConfig(com.likechain.likenft.v1.RoyaltyConfig value) {
      if (royaltyConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        royaltyConfig_ = value;
      } else {
        royaltyConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRoyaltyConfig(
        com.likechain.likenft.v1.RoyaltyConfig.Builder builderForValue) {
      if (royaltyConfigBuilder_ == null) {
        royaltyConfig_ = builderForValue.build();
      } else {
        royaltyConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeRoyaltyConfig(com.likechain.likenft.v1.RoyaltyConfig value) {
      if (royaltyConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          royaltyConfig_ != null &&
          royaltyConfig_ != com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance()) {
          getRoyaltyConfigBuilder().mergeFrom(value);
        } else {
          royaltyConfig_ = value;
        }
      } else {
        royaltyConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearRoyaltyConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      royaltyConfig_ = null;
      if (royaltyConfigBuilder_ != null) {
        royaltyConfigBuilder_.dispose();
        royaltyConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyConfig.Builder getRoyaltyConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRoyaltyConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    public com.likechain.likenft.v1.RoyaltyConfigOrBuilder getRoyaltyConfigOrBuilder() {
      if (royaltyConfigBuilder_ != null) {
        return royaltyConfigBuilder_.getMessageOrBuilder();
      } else {
        return royaltyConfig_ == null ?
            com.likechain.likenft.v1.RoyaltyConfig.getDefaultInstance() : royaltyConfig_;
      }
    }
    /**
     * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 1 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.likechain.likenft.v1.RoyaltyConfig, com.likechain.likenft.v1.RoyaltyConfig.Builder, com.likechain.likenft.v1.RoyaltyConfigOrBuilder> 
        getRoyaltyConfigFieldBuilder() {
      if (royaltyConfigBuilder_ == null) {
        royaltyConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.likechain.likenft.v1.RoyaltyConfig, com.likechain.likenft.v1.RoyaltyConfig.Builder, com.likechain.likenft.v1.RoyaltyConfigOrBuilder>(
                getRoyaltyConfig(),
                getParentForChildren(),
                isClean());
        royaltyConfig_ = null;
      }
      return royaltyConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse)
  private static final com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse();
  }

  public static com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateRoyaltyConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateRoyaltyConfigResponse>() {
    @java.lang.Override
    public MsgUpdateRoyaltyConfigResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateRoyaltyConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateRoyaltyConfigResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.likenft.v1.MsgUpdateRoyaltyConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

