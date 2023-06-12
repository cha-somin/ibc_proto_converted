// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

/**
 * <pre>
 * TimestampedSignatureData contains the signature data and the timestamp of the
 * signature.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v2.TimestampedSignatureData}
 */
public final class TimestampedSignatureData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v2.TimestampedSignatureData)
    TimestampedSignatureDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimestampedSignatureData.newBuilder() to construct.
  private TimestampedSignatureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimestampedSignatureData() {
    signatureData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimestampedSignatureData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_TimestampedSignatureData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_TimestampedSignatureData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.class, com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.Builder.class);
  }

  public static final int SIGNATURE_DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString signatureData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature_data = 1 [json_name = "signatureData"];</code>
   * @return The signatureData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignatureData() {
    return signatureData_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_ = 0L;
  /**
   * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!signatureData_.isEmpty()) {
      output.writeBytes(1, signatureData_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(2, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!signatureData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, signatureData_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
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
    if (!(obj instanceof com.ibc.lightclients.solomachine.v2.TimestampedSignatureData)) {
      return super.equals(obj);
    }
    com.ibc.lightclients.solomachine.v2.TimestampedSignatureData other = (com.ibc.lightclients.solomachine.v2.TimestampedSignatureData) obj;

    if (!getSignatureData()
        .equals(other.getSignatureData())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + SIGNATURE_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getSignatureData().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData parseFrom(
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
  public static Builder newBuilder(com.ibc.lightclients.solomachine.v2.TimestampedSignatureData prototype) {
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
   * TimestampedSignatureData contains the signature data and the timestamp of the
   * signature.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v2.TimestampedSignatureData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v2.TimestampedSignatureData)
      com.ibc.lightclients.solomachine.v2.TimestampedSignatureDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_TimestampedSignatureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_TimestampedSignatureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.class, com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.newBuilder()
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
      signatureData_ = com.google.protobuf.ByteString.EMPTY;
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_TimestampedSignatureData_descriptor;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.TimestampedSignatureData getDefaultInstanceForType() {
      return com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.TimestampedSignatureData build() {
      com.ibc.lightclients.solomachine.v2.TimestampedSignatureData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.TimestampedSignatureData buildPartial() {
      com.ibc.lightclients.solomachine.v2.TimestampedSignatureData result = new com.ibc.lightclients.solomachine.v2.TimestampedSignatureData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.lightclients.solomachine.v2.TimestampedSignatureData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signatureData_ = signatureData_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.lightclients.solomachine.v2.TimestampedSignatureData) {
        return mergeFrom((com.ibc.lightclients.solomachine.v2.TimestampedSignatureData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.lightclients.solomachine.v2.TimestampedSignatureData other) {
      if (other == com.ibc.lightclients.solomachine.v2.TimestampedSignatureData.getDefaultInstance()) return this;
      if (other.getSignatureData() != com.google.protobuf.ByteString.EMPTY) {
        setSignatureData(other.getSignatureData());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              signatureData_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.ByteString signatureData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature_data = 1 [json_name = "signatureData"];</code>
     * @return The signatureData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignatureData() {
      return signatureData_;
    }
    /**
     * <code>bytes signature_data = 1 [json_name = "signatureData"];</code>
     * @param value The signatureData to set.
     * @return This builder for chaining.
     */
    public Builder setSignatureData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signatureData_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature_data = 1 [json_name = "signatureData"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignatureData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      signatureData_ = getDefaultInstance().getSignatureData();
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v2.TimestampedSignatureData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v2.TimestampedSignatureData)
  private static final com.ibc.lightclients.solomachine.v2.TimestampedSignatureData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.lightclients.solomachine.v2.TimestampedSignatureData();
  }

  public static com.ibc.lightclients.solomachine.v2.TimestampedSignatureData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimestampedSignatureData>
      PARSER = new com.google.protobuf.AbstractParser<TimestampedSignatureData>() {
    @java.lang.Override
    public TimestampedSignatureData parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimestampedSignatureData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimestampedSignatureData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.lightclients.solomachine.v2.TimestampedSignatureData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

