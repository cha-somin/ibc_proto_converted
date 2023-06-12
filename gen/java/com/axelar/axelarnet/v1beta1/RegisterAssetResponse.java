// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/tx.proto

package com.axelar.axelarnet.v1beta1;

/**
 * Protobuf type {@code axelar.axelarnet.v1beta1.RegisterAssetResponse}
 */
public final class RegisterAssetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.axelarnet.v1beta1.RegisterAssetResponse)
    RegisterAssetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterAssetResponse.newBuilder() to construct.
  private RegisterAssetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterAssetResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterAssetResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_RegisterAssetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_RegisterAssetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.axelarnet.v1beta1.RegisterAssetResponse.class, com.axelar.axelarnet.v1beta1.RegisterAssetResponse.Builder.class);
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
    if (!(obj instanceof com.axelar.axelarnet.v1beta1.RegisterAssetResponse)) {
      return super.equals(obj);
    }
    com.axelar.axelarnet.v1beta1.RegisterAssetResponse other = (com.axelar.axelarnet.v1beta1.RegisterAssetResponse) obj;

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

  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse parseFrom(
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
  public static Builder newBuilder(com.axelar.axelarnet.v1beta1.RegisterAssetResponse prototype) {
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
   * Protobuf type {@code axelar.axelarnet.v1beta1.RegisterAssetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.axelarnet.v1beta1.RegisterAssetResponse)
      com.axelar.axelarnet.v1beta1.RegisterAssetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_RegisterAssetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_RegisterAssetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.axelarnet.v1beta1.RegisterAssetResponse.class, com.axelar.axelarnet.v1beta1.RegisterAssetResponse.Builder.class);
    }

    // Construct using com.axelar.axelarnet.v1beta1.RegisterAssetResponse.newBuilder()
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
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_RegisterAssetResponse_descriptor;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.RegisterAssetResponse getDefaultInstanceForType() {
      return com.axelar.axelarnet.v1beta1.RegisterAssetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.RegisterAssetResponse build() {
      com.axelar.axelarnet.v1beta1.RegisterAssetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.RegisterAssetResponse buildPartial() {
      com.axelar.axelarnet.v1beta1.RegisterAssetResponse result = new com.axelar.axelarnet.v1beta1.RegisterAssetResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.axelarnet.v1beta1.RegisterAssetResponse) {
        return mergeFrom((com.axelar.axelarnet.v1beta1.RegisterAssetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.axelarnet.v1beta1.RegisterAssetResponse other) {
      if (other == com.axelar.axelarnet.v1beta1.RegisterAssetResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:axelar.axelarnet.v1beta1.RegisterAssetResponse)
  }

  // @@protoc_insertion_point(class_scope:axelar.axelarnet.v1beta1.RegisterAssetResponse)
  private static final com.axelar.axelarnet.v1beta1.RegisterAssetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.axelarnet.v1beta1.RegisterAssetResponse();
  }

  public static com.axelar.axelarnet.v1beta1.RegisterAssetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterAssetResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegisterAssetResponse>() {
    @java.lang.Override
    public RegisterAssetResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterAssetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterAssetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.axelarnet.v1beta1.RegisterAssetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

