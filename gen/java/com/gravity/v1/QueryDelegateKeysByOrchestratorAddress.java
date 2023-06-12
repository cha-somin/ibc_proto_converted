// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.QueryDelegateKeysByOrchestratorAddress}
 */
public final class QueryDelegateKeysByOrchestratorAddress extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.QueryDelegateKeysByOrchestratorAddress)
    QueryDelegateKeysByOrchestratorAddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegateKeysByOrchestratorAddress.newBuilder() to construct.
  private QueryDelegateKeysByOrchestratorAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegateKeysByOrchestratorAddress() {
    orchestratorAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegateKeysByOrchestratorAddress();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByOrchestratorAddress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByOrchestratorAddress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.class, com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.Builder.class);
  }

  public static final int ORCHESTRATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orchestratorAddress_ = "";
  /**
   * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
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
   * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orchestratorAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orchestratorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orchestratorAddress_);
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
    if (!(obj instanceof com.gravity.v1.QueryDelegateKeysByOrchestratorAddress)) {
      return super.equals(obj);
    }
    com.gravity.v1.QueryDelegateKeysByOrchestratorAddress other = (com.gravity.v1.QueryDelegateKeysByOrchestratorAddress) obj;

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
    hash = (37 * hash) + ORCHESTRATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getOrchestratorAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress prototype) {
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
   * Protobuf type {@code gravity.v1.QueryDelegateKeysByOrchestratorAddress}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.QueryDelegateKeysByOrchestratorAddress)
      com.gravity.v1.QueryDelegateKeysByOrchestratorAddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByOrchestratorAddress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByOrchestratorAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.class, com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.Builder.class);
    }

    // Construct using com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.newBuilder()
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
      orchestratorAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.QueryProto.internal_static_gravity_v1_QueryDelegateKeysByOrchestratorAddress_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByOrchestratorAddress getDefaultInstanceForType() {
      return com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByOrchestratorAddress build() {
      com.gravity.v1.QueryDelegateKeysByOrchestratorAddress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.QueryDelegateKeysByOrchestratorAddress buildPartial() {
      com.gravity.v1.QueryDelegateKeysByOrchestratorAddress result = new com.gravity.v1.QueryDelegateKeysByOrchestratorAddress(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orchestratorAddress_ = orchestratorAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.QueryDelegateKeysByOrchestratorAddress) {
        return mergeFrom((com.gravity.v1.QueryDelegateKeysByOrchestratorAddress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress other) {
      if (other == com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.getDefaultInstance()) return this;
      if (!other.getOrchestratorAddress().isEmpty()) {
        orchestratorAddress_ = other.orchestratorAddress_;
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
              orchestratorAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object orchestratorAddress_ = "";
    /**
     * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
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
     * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
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
     * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
     * @param value The orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orchestratorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrchestratorAddress() {
      orchestratorAddress_ = getDefaultInstance().getOrchestratorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string orchestrator_address = 1 [json_name = "orchestratorAddress"];</code>
     * @param value The bytes for orchestratorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setOrchestratorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orchestratorAddress_ = value;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.QueryDelegateKeysByOrchestratorAddress)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.QueryDelegateKeysByOrchestratorAddress)
  private static final com.gravity.v1.QueryDelegateKeysByOrchestratorAddress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.QueryDelegateKeysByOrchestratorAddress();
  }

  public static com.gravity.v1.QueryDelegateKeysByOrchestratorAddress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegateKeysByOrchestratorAddress>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegateKeysByOrchestratorAddress>() {
    @java.lang.Override
    public QueryDelegateKeysByOrchestratorAddress parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegateKeysByOrchestratorAddress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDelegateKeysByOrchestratorAddress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.QueryDelegateKeysByOrchestratorAddress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

