// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta2/cert.proto

package com.akash.cert.v1beta2;

/**
 * <pre>
 * MsgCreateCertificateResponse defines the Msg/CreateCertificate response type.
 * </pre>
 *
 * Protobuf type {@code akash.cert.v1beta2.MsgCreateCertificateResponse}
 */
public final class MsgCreateCertificateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.cert.v1beta2.MsgCreateCertificateResponse)
    MsgCreateCertificateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateCertificateResponse.newBuilder() to construct.
  private MsgCreateCertificateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateCertificateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateCertificateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_MsgCreateCertificateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_MsgCreateCertificateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.cert.v1beta2.MsgCreateCertificateResponse.class, com.akash.cert.v1beta2.MsgCreateCertificateResponse.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.akash.cert.v1beta2.MsgCreateCertificateResponse)) {
      return super.equals(obj);
    }
    com.akash.cert.v1beta2.MsgCreateCertificateResponse other = (com.akash.cert.v1beta2.MsgCreateCertificateResponse) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse parseFrom(
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
  public static Builder newBuilder(com.akash.cert.v1beta2.MsgCreateCertificateResponse prototype) {
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
   * MsgCreateCertificateResponse defines the Msg/CreateCertificate response type.
   * </pre>
   *
   * Protobuf type {@code akash.cert.v1beta2.MsgCreateCertificateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.cert.v1beta2.MsgCreateCertificateResponse)
      com.akash.cert.v1beta2.MsgCreateCertificateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_MsgCreateCertificateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_MsgCreateCertificateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.cert.v1beta2.MsgCreateCertificateResponse.class, com.akash.cert.v1beta2.MsgCreateCertificateResponse.Builder.class);
    }

    // Construct using com.akash.cert.v1beta2.MsgCreateCertificateResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.cert.v1beta2.CertProto.internal_static_akash_cert_v1beta2_MsgCreateCertificateResponse_descriptor;
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.MsgCreateCertificateResponse getDefaultInstanceForType() {
      return com.akash.cert.v1beta2.MsgCreateCertificateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.MsgCreateCertificateResponse build() {
      com.akash.cert.v1beta2.MsgCreateCertificateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.cert.v1beta2.MsgCreateCertificateResponse buildPartial() {
      com.akash.cert.v1beta2.MsgCreateCertificateResponse result = new com.akash.cert.v1beta2.MsgCreateCertificateResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.cert.v1beta2.MsgCreateCertificateResponse) {
        return mergeFrom((com.akash.cert.v1beta2.MsgCreateCertificateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.cert.v1beta2.MsgCreateCertificateResponse other) {
      if (other == com.akash.cert.v1beta2.MsgCreateCertificateResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:akash.cert.v1beta2.MsgCreateCertificateResponse)
  }

  // @@protoc_insertion_point(class_scope:akash.cert.v1beta2.MsgCreateCertificateResponse)
  private static final com.akash.cert.v1beta2.MsgCreateCertificateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.cert.v1beta2.MsgCreateCertificateResponse();
  }

  public static com.akash.cert.v1beta2.MsgCreateCertificateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateCertificateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateCertificateResponse>() {
    @java.lang.Override
    public MsgCreateCertificateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateCertificateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateCertificateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.cert.v1beta2.MsgCreateCertificateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

