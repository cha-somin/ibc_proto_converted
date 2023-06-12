// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

/**
 * <pre>
 * PacketReceiptAbsenceData returns the SignBytes data for
 * packet receipt absence verification.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData}
 */
public final class PacketReceiptAbsenceData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)
    PacketReceiptAbsenceDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PacketReceiptAbsenceData.newBuilder() to construct.
  private PacketReceiptAbsenceData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PacketReceiptAbsenceData() {
    path_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PacketReceiptAbsenceData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_PacketReceiptAbsenceData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_PacketReceiptAbsenceData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.class, com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPath() {
    return path_;
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
    if (!path_.isEmpty()) {
      output.writeBytes(1, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!path_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, path_);
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
    if (!(obj instanceof com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)) {
      return super.equals(obj);
    }
    com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData other = (com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData parseFrom(
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
  public static Builder newBuilder(com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData prototype) {
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
   * PacketReceiptAbsenceData returns the SignBytes data for
   * packet receipt absence verification.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)
      com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_PacketReceiptAbsenceData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_PacketReceiptAbsenceData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.class, com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.newBuilder()
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
      path_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.lightclients.solomachine.v2.SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_PacketReceiptAbsenceData_descriptor;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData getDefaultInstanceForType() {
      return com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData build() {
      com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData buildPartial() {
      com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData result = new com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData) {
        return mergeFrom((com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData other) {
      if (other == com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData.getDefaultInstance()) return this;
      if (other.getPath() != com.google.protobuf.ByteString.EMPTY) {
        setPath(other.getPath());
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
              path_ = input.readBytes();
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

    private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @return The path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPath() {
      return path_;
    }
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes path = 1 [json_name = "path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000001);
      path_ = getDefaultInstance().getPath();
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData)
  private static final com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData();
  }

  public static com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PacketReceiptAbsenceData>
      PARSER = new com.google.protobuf.AbstractParser<PacketReceiptAbsenceData>() {
    @java.lang.Override
    public PacketReceiptAbsenceData parsePartialFrom(
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

  public static com.google.protobuf.Parser<PacketReceiptAbsenceData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PacketReceiptAbsenceData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.lightclients.solomachine.v2.PacketReceiptAbsenceData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

