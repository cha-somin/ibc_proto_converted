// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tokenfactory/tx.proto

package com.noble.tokenfactory;

/**
 * Protobuf type {@code noble.tokenfactory.MsgConfigureMinterResponse}
 */
public final class MsgConfigureMinterResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:noble.tokenfactory.MsgConfigureMinterResponse)
    MsgConfigureMinterResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgConfigureMinterResponse.newBuilder() to construct.
  private MsgConfigureMinterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgConfigureMinterResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgConfigureMinterResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.noble.tokenfactory.TxProto.internal_static_noble_tokenfactory_MsgConfigureMinterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noble.tokenfactory.TxProto.internal_static_noble_tokenfactory_MsgConfigureMinterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noble.tokenfactory.MsgConfigureMinterResponse.class, com.noble.tokenfactory.MsgConfigureMinterResponse.Builder.class);
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
    if (!(obj instanceof com.noble.tokenfactory.MsgConfigureMinterResponse)) {
      return super.equals(obj);
    }
    com.noble.tokenfactory.MsgConfigureMinterResponse other = (com.noble.tokenfactory.MsgConfigureMinterResponse) obj;

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

  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.tokenfactory.MsgConfigureMinterResponse parseFrom(
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
  public static Builder newBuilder(com.noble.tokenfactory.MsgConfigureMinterResponse prototype) {
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
   * Protobuf type {@code noble.tokenfactory.MsgConfigureMinterResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:noble.tokenfactory.MsgConfigureMinterResponse)
      com.noble.tokenfactory.MsgConfigureMinterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.tokenfactory.TxProto.internal_static_noble_tokenfactory_MsgConfigureMinterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.tokenfactory.TxProto.internal_static_noble_tokenfactory_MsgConfigureMinterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.tokenfactory.MsgConfigureMinterResponse.class, com.noble.tokenfactory.MsgConfigureMinterResponse.Builder.class);
    }

    // Construct using com.noble.tokenfactory.MsgConfigureMinterResponse.newBuilder()
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
      return com.noble.tokenfactory.TxProto.internal_static_noble_tokenfactory_MsgConfigureMinterResponse_descriptor;
    }

    @java.lang.Override
    public com.noble.tokenfactory.MsgConfigureMinterResponse getDefaultInstanceForType() {
      return com.noble.tokenfactory.MsgConfigureMinterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.noble.tokenfactory.MsgConfigureMinterResponse build() {
      com.noble.tokenfactory.MsgConfigureMinterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.noble.tokenfactory.MsgConfigureMinterResponse buildPartial() {
      com.noble.tokenfactory.MsgConfigureMinterResponse result = new com.noble.tokenfactory.MsgConfigureMinterResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noble.tokenfactory.MsgConfigureMinterResponse) {
        return mergeFrom((com.noble.tokenfactory.MsgConfigureMinterResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noble.tokenfactory.MsgConfigureMinterResponse other) {
      if (other == com.noble.tokenfactory.MsgConfigureMinterResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:noble.tokenfactory.MsgConfigureMinterResponse)
  }

  // @@protoc_insertion_point(class_scope:noble.tokenfactory.MsgConfigureMinterResponse)
  private static final com.noble.tokenfactory.MsgConfigureMinterResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noble.tokenfactory.MsgConfigureMinterResponse();
  }

  public static com.noble.tokenfactory.MsgConfigureMinterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgConfigureMinterResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgConfigureMinterResponse>() {
    @java.lang.Override
    public MsgConfigureMinterResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgConfigureMinterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgConfigureMinterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.noble.tokenfactory.MsgConfigureMinterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

