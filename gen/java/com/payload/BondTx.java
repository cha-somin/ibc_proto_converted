// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/payload.proto

package com.payload;

/**
 * Protobuf type {@code payload.BondTx}
 */
public final class BondTx extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:payload.BondTx)
    BondTxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondTx.newBuilder() to construct.
  private BondTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondTx() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondTx();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.payload.PayloadProto.internal_static_payload_BondTx_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.payload.PayloadProto.internal_static_payload_BondTx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.payload.BondTx.class, com.payload.BondTx.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private com.payload.TxInput input_;
  /**
   * <pre>
   * Input must be the validator that desires to bond
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * Input must be the validator that desires to bond
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   * @return The input.
   */
  @java.lang.Override
  public com.payload.TxInput getInput() {
    return input_ == null ? com.payload.TxInput.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * Input must be the validator that desires to bond
   * </pre>
   *
   * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
   */
  @java.lang.Override
  public com.payload.TxInputOrBuilder getInputOrBuilder() {
    return input_ == null ? com.payload.TxInput.getDefaultInstance() : input_;
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
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
    if (!(obj instanceof com.payload.BondTx)) {
      return super.equals(obj);
    }
    com.payload.BondTx other = (com.payload.BondTx) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
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
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.payload.BondTx parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.BondTx parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.BondTx parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.BondTx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.BondTx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.BondTx parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.BondTx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.BondTx parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.payload.BondTx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.payload.BondTx parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.payload.BondTx parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.BondTx parseFrom(
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
  public static Builder newBuilder(com.payload.BondTx prototype) {
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
   * Protobuf type {@code payload.BondTx}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:payload.BondTx)
      com.payload.BondTxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.payload.PayloadProto.internal_static_payload_BondTx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.payload.PayloadProto.internal_static_payload_BondTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.payload.BondTx.class, com.payload.BondTx.Builder.class);
    }

    // Construct using com.payload.BondTx.newBuilder()
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
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.payload.PayloadProto.internal_static_payload_BondTx_descriptor;
    }

    @java.lang.Override
    public com.payload.BondTx getDefaultInstanceForType() {
      return com.payload.BondTx.getDefaultInstance();
    }

    @java.lang.Override
    public com.payload.BondTx build() {
      com.payload.BondTx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.payload.BondTx buildPartial() {
      com.payload.BondTx result = new com.payload.BondTx(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.payload.BondTx result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.payload.BondTx) {
        return mergeFrom((com.payload.BondTx)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.payload.BondTx other) {
      if (other == com.payload.BondTx.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
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
                  getInputFieldBuilder().getBuilder(),
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

    private com.payload.TxInput input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder> inputBuilder_;
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     * @return The input.
     */
    public com.payload.TxInput getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? com.payload.TxInput.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public Builder setInput(com.payload.TxInput value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
      } else {
        inputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public Builder setInput(
        com.payload.TxInput.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public Builder mergeInput(com.payload.TxInput value) {
      if (inputBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          input_ != null &&
          input_ != com.payload.TxInput.getDefaultInstance()) {
          getInputBuilder().mergeFrom(value);
        } else {
          input_ = value;
        }
      } else {
        inputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public Builder clearInput() {
      bitField0_ = (bitField0_ & ~0x00000001);
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public com.payload.TxInput.Builder getInputBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    public com.payload.TxInputOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            com.payload.TxInput.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * Input must be the validator that desires to bond
     * </pre>
     *
     * <code>.payload.TxInput Input = 1 [json_name = "Input"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
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


    // @@protoc_insertion_point(builder_scope:payload.BondTx)
  }

  // @@protoc_insertion_point(class_scope:payload.BondTx)
  private static final com.payload.BondTx DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.payload.BondTx();
  }

  public static com.payload.BondTx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondTx>
      PARSER = new com.google.protobuf.AbstractParser<BondTx>() {
    @java.lang.Override
    public BondTx parsePartialFrom(
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

  public static com.google.protobuf.Parser<BondTx> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondTx> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.payload.BondTx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

