// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta2/cert.proto

package com.akash.cert.v1beta2;

/**
 * <pre>
 * CertificateID stores owner and sequence number
 * </pre>
 *
 * Protobuf type {@code akash.cert.v1beta2.CertificateID}
 */
public final class CertificateID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.cert.v1beta2.CertificateID)
    CertificateIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CertificateID.newBuilder() to construct.
  private CertificateID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CertificateID() {
    owner_ = "";
    serial_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CertificateID();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_CertificateID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_CertificateID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.cert.v1beta2.CertificateID.class, com.akash.cert.v1beta2.CertificateID.Builder.class);
  }

  public static final int OWNER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIAL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serial_ = "";
  /**
   * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
   * @return The serial.
   */
  @java.lang.Override
  public java.lang.String getSerial() {
    java.lang.Object ref = serial_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serial_ = s;
      return s;
    }
  }
  /**
   * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
   * @return The bytes for serial.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSerialBytes() {
    java.lang.Object ref = serial_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serial_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serial_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serial_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serial_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serial_);
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
    if (!(obj instanceof com.akash.cert.v1beta2.CertificateID)) {
      return super.equals(obj);
    }
    com.akash.cert.v1beta2.CertificateID other = (com.akash.cert.v1beta2.CertificateID) obj;

    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (!getSerial()
        .equals(other.getSerial())) return false;
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
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + SERIAL_FIELD_NUMBER;
    hash = (53 * hash) + getSerial().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.cert.v1beta2.CertificateID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.cert.v1beta2.CertificateID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta2.CertificateID parseFrom(
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
  public static Builder newBuilder(com.akash.cert.v1beta2.CertificateID prototype) {
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
   * CertificateID stores owner and sequence number
   * </pre>
   *
   * Protobuf type {@code akash.cert.v1beta2.CertificateID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.cert.v1beta2.CertificateID)
      com.akash.cert.v1beta2.CertificateIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_CertificateID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_CertificateID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.cert.v1beta2.CertificateID.class, com.akash.cert.v1beta2.CertificateID.Builder.class);
    }

    // Construct using com.akash.cert.v1beta2.CertificateID.newBuilder()
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
      owner_ = "";
      serial_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_CertificateID_descriptor;
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.CertificateID getDefaultInstanceForType() {
      return com.akash.cert.v1beta2.CertificateID.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.CertificateID build() {
      com.akash.cert.v1beta2.CertificateID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.CertificateID buildPartial() {
      com.akash.cert.v1beta2.CertificateID result = new com.akash.cert.v1beta2.CertificateID(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.cert.v1beta2.CertificateID result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serial_ = serial_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.cert.v1beta2.CertificateID) {
        return mergeFrom((com.akash.cert.v1beta2.CertificateID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.cert.v1beta2.CertificateID other) {
      if (other == com.akash.cert.v1beta2.CertificateID.getDefaultInstance()) return this;
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSerial().isEmpty()) {
        serial_ = other.serial_;
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
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              serial_ = input.readStringRequireUtf8();
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

    private java.lang.Object owner_ = "";
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object serial_ = "";
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return The serial.
     */
    public java.lang.String getSerial() {
      java.lang.Object ref = serial_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serial_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return The bytes for serial.
     */
    public com.google.protobuf.ByteString
        getSerialBytes() {
      java.lang.Object ref = serial_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serial_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @param value The serial to set.
     * @return This builder for chaining.
     */
    public Builder setSerial(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serial_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearSerial() {
      serial_ = getDefaultInstance().getSerial();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string serial = 2 [json_name = "serial", (.gogoproto.jsontag) = "serial", (.gogoproto.moretags) = "yaml:&#92;"serial&#92;""];</code>
     * @param value The bytes for serial to set.
     * @return This builder for chaining.
     */
    public Builder setSerialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serial_ = value;
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


    // @@protoc_insertion_point(builder_scope:akash.cert.v1beta2.CertificateID)
  }

  // @@protoc_insertion_point(class_scope:akash.cert.v1beta2.CertificateID)
  private static final com.akash.cert.v1beta2.CertificateID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.cert.v1beta2.CertificateID();
  }

  public static com.akash.cert.v1beta2.CertificateID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateID>
      PARSER = new com.google.protobuf.AbstractParser<CertificateID>() {
    @java.lang.Override
    public CertificateID parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.cert.v1beta2.CertificateID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

