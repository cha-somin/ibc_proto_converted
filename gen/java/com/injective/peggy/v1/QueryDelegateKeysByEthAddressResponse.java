// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/query.proto

package com.injective.peggy.v1;

/**
 * Protobuf type {@code injective.peggy.v1.QueryDelegateKeysByEthAddressResponse}
 */
public final class QueryDelegateKeysByEthAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)
    QueryDelegateKeysByEthAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegateKeysByEthAddressResponse.newBuilder() to construct.
  private QueryDelegateKeysByEthAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegateKeysByEthAddressResponse() {
    validatorAddress_ = "";
    orchestratorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegateKeysByEthAddressResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.peggy.v1.QueryProto.internal_static_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.peggy.v1.QueryProto.internal_static_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.class, com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.Builder.class);
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object validatorAddress_ = "";
  /**
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The validatorAddress.
   */
  @java.lang.Override
  public java.lang.String getValidatorAddress() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The bytes for validatorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    java.lang.Object ref = validatorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORCHESTRATOR_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orchestratorAddress_ = "";
  /**
   * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
   * @return The orchestratorAddress.
   */
  @java.lang.Override
  public java.lang.String getOrchestratorAddress() {
    java.lang.Object ref = orchestratorAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orchestratorAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
   * @return The bytes for orchestratorAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrchestratorAddressBytes() {
    java.lang.Object ref = orchestratorAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orchestratorAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orchestratorAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orchestratorAddress_);
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
    if (!(obj instanceof com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)) {
      return super.equals(obj);
    }
    com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse other = (com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse) obj;

    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
    if (!getOrchestratorAddress()
        .equals(other.getOrchestratorAddress())) return false;
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
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (37 * hash) + ORCHESTRATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOrchestratorAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse parseFrom(
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
  public static Builder newBuilder(com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse prototype) {
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
   * Protobuf type {@code injective.peggy.v1.QueryDelegateKeysByEthAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)
      com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.peggy.v1.QueryProto.internal_static_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.peggy.v1.QueryProto.internal_static_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.class, com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.Builder.class);
    }

    // Construct using com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.newBuilder()
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
      validatorAddress_ = "";
      orchestratorAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.peggy.v1.QueryProto.internal_static_injective_peggy_v1_QueryDelegateKeysByEthAddressResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse getDefaultInstanceForType() {
      return com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse build() {
      com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse buildPartial() {
      com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse result = new com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validatorAddress_ = validatorAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orchestratorAddress_ = orchestratorAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse) {
        return mergeFrom((com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse other) {
      if (other == com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse.getDefaultInstance()) return this;
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOrchestratorAddress().isEmpty()) {
        orchestratorAddress_ = other.orchestratorAddress_;
        bitField0_ |= 0x00000002;
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
              validatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              orchestratorAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object validatorAddress_ = "";
    /**
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The validatorAddress.
     */
    public java.lang.String getValidatorAddress() {
      java.lang.Object ref = validatorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      java.lang.Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object orchestratorAddress_ = "";
    /**
     * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
     * @return The orchestratorAddress.
     */
    public java.lang.String getOrchestratorAddress() {
      java.lang.Object ref = orchestratorAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orchestratorAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
     * @return The bytes for orchestratorAddress.
     */
    public com.google.protobuf.ByteString
        getOrchestratorAddressBytes() {
      java.lang.Object ref = orchestratorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orchestratorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
     * @param value The orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orchestratorAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrchestratorAddress() {
      orchestratorAddress_ = getDefaultInstance().getOrchestratorAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 2 [json_name = "orchestratorAddress"];</code>
     * @param value The bytes for orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orchestratorAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.peggy.v1.QueryDelegateKeysByEthAddressResponse)
  private static final com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse();
  }

  public static com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegateKeysByEthAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegateKeysByEthAddressResponse>() {
    @java.lang.Override
    public QueryDelegateKeysByEthAddressResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegateKeysByEthAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegateKeysByEthAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.peggy.v1.QueryDelegateKeysByEthAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

