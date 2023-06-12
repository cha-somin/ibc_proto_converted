// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/msgs_chain_links.proto

package com.desmos.profiles.v3;

/**
 * <pre>
 * MsgLinkChainAccountResponse defines the Msg/LinkAccount response type.
 * </pre>
 *
 * Protobuf type {@code desmos.profiles.v3.MsgLinkChainAccountResponse}
 */
public final class MsgLinkChainAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:desmos.profiles.v3.MsgLinkChainAccountResponse)
    MsgLinkChainAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgLinkChainAccountResponse.newBuilder() to construct.
  private MsgLinkChainAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgLinkChainAccountResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgLinkChainAccountResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgLinkChainAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgLinkChainAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.desmos.profiles.v3.MsgLinkChainAccountResponse.class, com.desmos.profiles.v3.MsgLinkChainAccountResponse.Builder.class);
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
    if (!(obj instanceof com.desmos.profiles.v3.MsgLinkChainAccountResponse)) {
      return super.equals(obj);
    }
    com.desmos.profiles.v3.MsgLinkChainAccountResponse other = (com.desmos.profiles.v3.MsgLinkChainAccountResponse) obj;

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

  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse parseFrom(
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
  public static Builder newBuilder(com.desmos.profiles.v3.MsgLinkChainAccountResponse prototype) {
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
   * MsgLinkChainAccountResponse defines the Msg/LinkAccount response type.
   * </pre>
   *
   * Protobuf type {@code desmos.profiles.v3.MsgLinkChainAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:desmos.profiles.v3.MsgLinkChainAccountResponse)
      com.desmos.profiles.v3.MsgLinkChainAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgLinkChainAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgLinkChainAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.desmos.profiles.v3.MsgLinkChainAccountResponse.class, com.desmos.profiles.v3.MsgLinkChainAccountResponse.Builder.class);
    }

    // Construct using com.desmos.profiles.v3.MsgLinkChainAccountResponse.newBuilder()
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
      return com.desmos.profiles.v3.MsgsChainLinksProto.internal_static_desmos_profiles_v3_MsgLinkChainAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgLinkChainAccountResponse getDefaultInstanceForType() {
      return com.desmos.profiles.v3.MsgLinkChainAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgLinkChainAccountResponse build() {
      com.desmos.profiles.v3.MsgLinkChainAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.desmos.profiles.v3.MsgLinkChainAccountResponse buildPartial() {
      com.desmos.profiles.v3.MsgLinkChainAccountResponse result = new com.desmos.profiles.v3.MsgLinkChainAccountResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.desmos.profiles.v3.MsgLinkChainAccountResponse) {
        return mergeFrom((com.desmos.profiles.v3.MsgLinkChainAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.desmos.profiles.v3.MsgLinkChainAccountResponse other) {
      if (other == com.desmos.profiles.v3.MsgLinkChainAccountResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:desmos.profiles.v3.MsgLinkChainAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:desmos.profiles.v3.MsgLinkChainAccountResponse)
  private static final com.desmos.profiles.v3.MsgLinkChainAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.desmos.profiles.v3.MsgLinkChainAccountResponse();
  }

  public static com.desmos.profiles.v3.MsgLinkChainAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgLinkChainAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgLinkChainAccountResponse>() {
    @java.lang.Override
    public MsgLinkChainAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgLinkChainAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgLinkChainAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.desmos.profiles.v3.MsgLinkChainAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

