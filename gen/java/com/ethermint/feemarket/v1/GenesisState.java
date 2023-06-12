// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/feemarket/v1/genesis.proto

package com.ethermint.feemarket.v1;

/**
 * <pre>
 * GenesisState defines the feemarket module's genesis state.
 * </pre>
 *
 * Protobuf type {@code ethermint.feemarket.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ethermint.feemarket.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ethermint.feemarket.v1.GenesisProto.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ethermint.feemarket.v1.GenesisProto.internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ethermint.feemarket.v1.GenesisState.class, com.ethermint.feemarket.v1.GenesisState.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.ethermint.feemarket.v1.Params params_;
  /**
   * <pre>
   * params defines all the parameters of the feemarket module.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines all the parameters of the feemarket module.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.ethermint.feemarket.v1.Params getParams() {
    return params_ == null ? com.ethermint.feemarket.v1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines all the parameters of the feemarket module.
   * </pre>
   *
   * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ethermint.feemarket.v1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.ethermint.feemarket.v1.Params.getDefaultInstance() : params_;
  }

  public static final int BLOCK_GAS_FIELD_NUMBER = 3;
  private long blockGas_ = 0L;
  /**
   * <pre>
   * block_gas is the amount of gas wanted on the last block before the upgrade.
   * Zero by default.
   * </pre>
   *
   * <code>uint64 block_gas = 3 [json_name = "blockGas"];</code>
   * @return The blockGas.
   */
  @java.lang.Override
  public long getBlockGas() {
    return blockGas_;
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    if (blockGas_ != 0L) {
      output.writeUInt64(3, blockGas_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
    }
    if (blockGas_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, blockGas_);
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
    if (!(obj instanceof com.ethermint.feemarket.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.ethermint.feemarket.v1.GenesisState other = (com.ethermint.feemarket.v1.GenesisState) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (getBlockGas()
        != other.getBlockGas()) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (37 * hash) + BLOCK_GAS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockGas());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ethermint.feemarket.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ethermint.feemarket.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ethermint.feemarket.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.ethermint.feemarket.v1.GenesisState prototype) {
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
   * GenesisState defines the feemarket module's genesis state.
   * </pre>
   *
   * Protobuf type {@code ethermint.feemarket.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ethermint.feemarket.v1.GenesisState)
      com.ethermint.feemarket.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ethermint.feemarket.v1.GenesisProto.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ethermint.feemarket.v1.GenesisProto.internal_static_ethermint_feemarket_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ethermint.feemarket.v1.GenesisState.class, com.ethermint.feemarket.v1.GenesisState.Builder.class);
    }

    // Construct using com.ethermint.feemarket.v1.GenesisState.newBuilder()
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
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      blockGas_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ethermint.feemarket.v1.GenesisProto.internal_static_ethermint_feemarket_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.ethermint.feemarket.v1.GenesisState getDefaultInstanceForType() {
      return com.ethermint.feemarket.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.ethermint.feemarket.v1.GenesisState build() {
      com.ethermint.feemarket.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ethermint.feemarket.v1.GenesisState buildPartial() {
      com.ethermint.feemarket.v1.GenesisState result = new com.ethermint.feemarket.v1.GenesisState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ethermint.feemarket.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.blockGas_ = blockGas_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ethermint.feemarket.v1.GenesisState) {
        return mergeFrom((com.ethermint.feemarket.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ethermint.feemarket.v1.GenesisState other) {
      if (other == com.ethermint.feemarket.v1.GenesisState.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (other.getBlockGas() != 0L) {
        setBlockGas(other.getBlockGas());
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
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              blockGas_ = input.readUInt64();
              bitField0_ |= 0x00000002;
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

    private com.ethermint.feemarket.v1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ethermint.feemarket.v1.Params, com.ethermint.feemarket.v1.Params.Builder, com.ethermint.feemarket.v1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.ethermint.feemarket.v1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.ethermint.feemarket.v1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.ethermint.feemarket.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.ethermint.feemarket.v1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.ethermint.feemarket.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.ethermint.feemarket.v1.Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.ethermint.feemarket.v1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.ethermint.feemarket.v1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.ethermint.feemarket.v1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the feemarket module.
     * </pre>
     *
     * <code>.ethermint.feemarket.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ethermint.feemarket.v1.Params, com.ethermint.feemarket.v1.Params.Builder, com.ethermint.feemarket.v1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ethermint.feemarket.v1.Params, com.ethermint.feemarket.v1.Params.Builder, com.ethermint.feemarket.v1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private long blockGas_ ;
    /**
     * <pre>
     * block_gas is the amount of gas wanted on the last block before the upgrade.
     * Zero by default.
     * </pre>
     *
     * <code>uint64 block_gas = 3 [json_name = "blockGas"];</code>
     * @return The blockGas.
     */
    @java.lang.Override
    public long getBlockGas() {
      return blockGas_;
    }
    /**
     * <pre>
     * block_gas is the amount of gas wanted on the last block before the upgrade.
     * Zero by default.
     * </pre>
     *
     * <code>uint64 block_gas = 3 [json_name = "blockGas"];</code>
     * @param value The blockGas to set.
     * @return This builder for chaining.
     */
    public Builder setBlockGas(long value) {

      blockGas_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * block_gas is the amount of gas wanted on the last block before the upgrade.
     * Zero by default.
     * </pre>
     *
     * <code>uint64 block_gas = 3 [json_name = "blockGas"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockGas() {
      bitField0_ = (bitField0_ & ~0x00000002);
      blockGas_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ethermint.feemarket.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:ethermint.feemarket.v1.GenesisState)
  private static final com.ethermint.feemarket.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ethermint.feemarket.v1.GenesisState();
  }

  public static com.ethermint.feemarket.v1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ethermint.feemarket.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

