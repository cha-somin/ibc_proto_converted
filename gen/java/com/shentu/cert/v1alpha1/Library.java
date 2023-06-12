// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/cert/v1alpha1/cert.proto

package com.shentu.cert.v1alpha1;

/**
 * <pre>
 * Library is a type for certified libraries.
 * </pre>
 *
 * Protobuf type {@code shentu.cert.v1alpha1.Library}
 */
public final class Library extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.cert.v1alpha1.Library)
    LibraryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Library.newBuilder() to construct.
  private Library(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Library() {
    address_ = "";
    publisher_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Library();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.cert.v1alpha1.CertProto.internal_static_shentu_cert_v1alpha1_Library_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.cert.v1alpha1.CertProto.internal_static_shentu_cert_v1alpha1_Library_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.cert.v1alpha1.Library.class, com.shentu.cert.v1alpha1.Library.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISHER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object publisher_ = "";
  /**
   * <code>string publisher = 2 [json_name = "publisher"];</code>
   * @return The publisher.
   */
  @java.lang.Override
  public java.lang.String getPublisher() {
    java.lang.Object ref = publisher_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publisher_ = s;
      return s;
    }
  }
  /**
   * <code>string publisher = 2 [json_name = "publisher"];</code>
   * @return The bytes for publisher.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublisherBytes() {
    java.lang.Object ref = publisher_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publisher_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisher_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, publisher_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publisher_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, publisher_);
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
    if (!(obj instanceof com.shentu.cert.v1alpha1.Library)) {
      return super.equals(obj);
    }
    com.shentu.cert.v1alpha1.Library other = (com.shentu.cert.v1alpha1.Library) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getPublisher()
        .equals(other.getPublisher())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + PUBLISHER_FIELD_NUMBER;
    hash = (53 * hash) + getPublisher().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.cert.v1alpha1.Library parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.cert.v1alpha1.Library parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.cert.v1alpha1.Library parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.cert.v1alpha1.Library parseFrom(
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
  public static Builder newBuilder(com.shentu.cert.v1alpha1.Library prototype) {
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
   * Library is a type for certified libraries.
   * </pre>
   *
   * Protobuf type {@code shentu.cert.v1alpha1.Library}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.cert.v1alpha1.Library)
      com.shentu.cert.v1alpha1.LibraryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.cert.v1alpha1.CertProto.internal_static_shentu_cert_v1alpha1_Library_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.cert.v1alpha1.CertProto.internal_static_shentu_cert_v1alpha1_Library_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.cert.v1alpha1.Library.class, com.shentu.cert.v1alpha1.Library.Builder.class);
    }

    // Construct using com.shentu.cert.v1alpha1.Library.newBuilder()
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
      address_ = "";
      publisher_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.cert.v1alpha1.CertProto.internal_static_shentu_cert_v1alpha1_Library_descriptor;
    }

    @java.lang.Override
    public com.shentu.cert.v1alpha1.Library getDefaultInstanceForType() {
      return com.shentu.cert.v1alpha1.Library.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.cert.v1alpha1.Library build() {
      com.shentu.cert.v1alpha1.Library result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.cert.v1alpha1.Library buildPartial() {
      com.shentu.cert.v1alpha1.Library result = new com.shentu.cert.v1alpha1.Library(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.cert.v1alpha1.Library result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.publisher_ = publisher_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.cert.v1alpha1.Library) {
        return mergeFrom((com.shentu.cert.v1alpha1.Library)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.cert.v1alpha1.Library other) {
      if (other == com.shentu.cert.v1alpha1.Library.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPublisher().isEmpty()) {
        publisher_ = other.publisher_;
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              publisher_ = input.readStringRequireUtf8();
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object publisher_ = "";
    /**
     * <code>string publisher = 2 [json_name = "publisher"];</code>
     * @return The publisher.
     */
    public java.lang.String getPublisher() {
      java.lang.Object ref = publisher_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publisher_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string publisher = 2 [json_name = "publisher"];</code>
     * @return The bytes for publisher.
     */
    public com.google.protobuf.ByteString
        getPublisherBytes() {
      java.lang.Object ref = publisher_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publisher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string publisher = 2 [json_name = "publisher"];</code>
     * @param value The publisher to set.
     * @return This builder for chaining.
     */
    public Builder setPublisher(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      publisher_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string publisher = 2 [json_name = "publisher"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPublisher() {
      publisher_ = getDefaultInstance().getPublisher();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string publisher = 2 [json_name = "publisher"];</code>
     * @param value The bytes for publisher to set.
     * @return This builder for chaining.
     */
    public Builder setPublisherBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      publisher_ = value;
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


    // @@protoc_insertion_point(builder_scope:shentu.cert.v1alpha1.Library)
  }

  // @@protoc_insertion_point(class_scope:shentu.cert.v1alpha1.Library)
  private static final com.shentu.cert.v1alpha1.Library DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.cert.v1alpha1.Library();
  }

  public static com.shentu.cert.v1alpha1.Library getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Library>
      PARSER = new com.google.protobuf.AbstractParser<Library>() {
    @java.lang.Override
    public Library parsePartialFrom(
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

  public static com.google.protobuf.Parser<Library> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Library> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.cert.v1alpha1.Library getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

