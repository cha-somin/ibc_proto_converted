// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/circuit/v1/tx.proto

package com.cosmos.circuit.v1;

/**
 * <pre>
 * MsgAuthorizeCircuitBreaker defines the Msg/AuthorizeCircuitBreaker response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse}
 */
public final class MsgAuthorizeCircuitBreakerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)
    MsgAuthorizeCircuitBreakerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAuthorizeCircuitBreakerResponse.newBuilder() to construct.
  private MsgAuthorizeCircuitBreakerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAuthorizeCircuitBreakerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAuthorizeCircuitBreakerResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.circuit.v1.TxProto.internal_static_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.circuit.v1.TxProto.internal_static_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.class, com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_ = false;
  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
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
    if (!(obj instanceof com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)) {
      return super.equals(obj);
    }
    com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse other = (com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse prototype) {
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
   * MsgAuthorizeCircuitBreaker defines the Msg/AuthorizeCircuitBreaker response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)
      com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.circuit.v1.TxProto.internal_static_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.circuit.v1.TxProto.internal_static_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.class, com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.Builder.class);
    }

    // Construct using com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.newBuilder()
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
      success_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.circuit.v1.TxProto.internal_static_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse getDefaultInstanceForType() {
      return com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse build() {
      com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse buildPartial() {
      com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse result = new com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.success_ = success_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse) {
        return mergeFrom((com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse other) {
      if (other == com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
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
            case 8: {
              success_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean success_ ;
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {

      success_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      bitField0_ = (bitField0_ & ~0x00000001);
      success_ = false;
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


    // @@protoc_insertion_point(builder_scope:cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse)
  private static final com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse();
  }

  public static com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAuthorizeCircuitBreakerResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgAuthorizeCircuitBreakerResponse>() {
    @java.lang.Override
    public MsgAuthorizeCircuitBreakerResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAuthorizeCircuitBreakerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAuthorizeCircuitBreakerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

