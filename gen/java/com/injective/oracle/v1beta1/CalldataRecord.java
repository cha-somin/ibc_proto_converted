// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/genesis.proto

package com.injective.oracle.v1beta1;

/**
 * Protobuf type {@code injective.oracle.v1beta1.CalldataRecord}
 */
public final class CalldataRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.CalldataRecord)
    CalldataRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalldataRecord.newBuilder() to construct.
  private CalldataRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalldataRecord() {
    calldata_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalldataRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.GenesisProto.internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.GenesisProto.internal_static_injective_oracle_v1beta1_CalldataRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.CalldataRecord.class, com.injective.oracle.v1beta1.CalldataRecord.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private long clientId_ = 0L;
  /**
   * <code>uint64 client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  @java.lang.Override
  public long getClientId() {
    return clientId_;
  }

  public static final int CALLDATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString calldata_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes calldata = 2 [json_name = "calldata"];</code>
   * @return The calldata.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCalldata() {
    return calldata_;
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
    if (clientId_ != 0L) {
      output.writeUInt64(1, clientId_);
    }
    if (!calldata_.isEmpty()) {
      output.writeBytes(2, calldata_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, clientId_);
    }
    if (!calldata_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, calldata_);
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
    if (!(obj instanceof com.injective.oracle.v1beta1.CalldataRecord)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.CalldataRecord other = (com.injective.oracle.v1beta1.CalldataRecord) obj;

    if (getClientId()
        != other.getClientId()) return false;
    if (!getCalldata()
        .equals(other.getCalldata())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientId());
    hash = (37 * hash) + CALLDATA_FIELD_NUMBER;
    hash = (53 * hash) + getCalldata().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.CalldataRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.CalldataRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.CalldataRecord parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.CalldataRecord prototype) {
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
   * Protobuf type {@code injective.oracle.v1beta1.CalldataRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.CalldataRecord)
      com.injective.oracle.v1beta1.CalldataRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.GenesisProto.internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.GenesisProto.internal_static_injective_oracle_v1beta1_CalldataRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.CalldataRecord.class, com.injective.oracle.v1beta1.CalldataRecord.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.CalldataRecord.newBuilder()
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
      clientId_ = 0L;
      calldata_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.oracle.v1beta1.GenesisProto.internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.CalldataRecord getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.CalldataRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.CalldataRecord build() {
      com.injective.oracle.v1beta1.CalldataRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.CalldataRecord buildPartial() {
      com.injective.oracle.v1beta1.CalldataRecord result = new com.injective.oracle.v1beta1.CalldataRecord(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.oracle.v1beta1.CalldataRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.calldata_ = calldata_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.CalldataRecord) {
        return mergeFrom((com.injective.oracle.v1beta1.CalldataRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.CalldataRecord other) {
      if (other == com.injective.oracle.v1beta1.CalldataRecord.getDefaultInstance()) return this;
      if (other.getClientId() != 0L) {
        setClientId(other.getClientId());
      }
      if (other.getCalldata() != com.google.protobuf.ByteString.EMPTY) {
        setCalldata(other.getCalldata());
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
              clientId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              calldata_ = input.readBytes();
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

    private long clientId_ ;
    /**
     * <code>uint64 client_id = 1 [json_name = "clientId"];</code>
     * @return The clientId.
     */
    @java.lang.Override
    public long getClientId() {
      return clientId_;
    }
    /**
     * <code>uint64 client_id = 1 [json_name = "clientId"];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(long value) {

      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 client_id = 1 [json_name = "clientId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString calldata_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes calldata = 2 [json_name = "calldata"];</code>
     * @return The calldata.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCalldata() {
      return calldata_;
    }
    /**
     * <code>bytes calldata = 2 [json_name = "calldata"];</code>
     * @param value The calldata to set.
     * @return This builder for chaining.
     */
    public Builder setCalldata(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      calldata_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes calldata = 2 [json_name = "calldata"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCalldata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      calldata_ = getDefaultInstance().getCalldata();
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.CalldataRecord)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.CalldataRecord)
  private static final com.injective.oracle.v1beta1.CalldataRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.CalldataRecord();
  }

  public static com.injective.oracle.v1beta1.CalldataRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalldataRecord>
      PARSER = new com.google.protobuf.AbstractParser<CalldataRecord>() {
    @java.lang.Override
    public CalldataRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<CalldataRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalldataRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.CalldataRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

