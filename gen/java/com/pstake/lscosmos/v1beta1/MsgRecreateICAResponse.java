// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pstake/lscosmos/v1beta1/msgs.proto

package com.pstake.lscosmos.v1beta1;

/**
 * Protobuf type {@code pstake.lscosmos.v1beta1.MsgRecreateICAResponse}
 */
public final class MsgRecreateICAResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pstake.lscosmos.v1beta1.MsgRecreateICAResponse)
    MsgRecreateICAResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRecreateICAResponse.newBuilder() to construct.
  private MsgRecreateICAResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRecreateICAResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRecreateICAResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pstake.lscosmos.v1beta1.MsgsProto.internal_static_pstake_lscosmos_v1beta1_MsgRecreateICAResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pstake.lscosmos.v1beta1.MsgsProto.internal_static_pstake_lscosmos_v1beta1_MsgRecreateICAResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.class, com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.Builder.class);
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
    if (!(obj instanceof com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse)) {
      return super.equals(obj);
    }
    com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse other = (com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse) obj;

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

  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse parseFrom(
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
  public static Builder newBuilder(com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse prototype) {
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
   * Protobuf type {@code pstake.lscosmos.v1beta1.MsgRecreateICAResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pstake.lscosmos.v1beta1.MsgRecreateICAResponse)
      com.pstake.lscosmos.v1beta1.MsgRecreateICAResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pstake.lscosmos.v1beta1.MsgsProto.internal_static_pstake_lscosmos_v1beta1_MsgRecreateICAResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pstake.lscosmos.v1beta1.MsgsProto.internal_static_pstake_lscosmos_v1beta1_MsgRecreateICAResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.class, com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.Builder.class);
    }

    // Construct using com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.newBuilder()
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
      return com.pstake.lscosmos.v1beta1.MsgsProto.internal_static_pstake_lscosmos_v1beta1_MsgRecreateICAResponse_descriptor;
    }

    @java.lang.Override
    public com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse getDefaultInstanceForType() {
      return com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse build() {
      com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse buildPartial() {
      com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse result = new com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse) {
        return mergeFrom((com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse other) {
      if (other == com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:pstake.lscosmos.v1beta1.MsgRecreateICAResponse)
  }

  // @@protoc_insertion_point(class_scope:pstake.lscosmos.v1beta1.MsgRecreateICAResponse)
  private static final com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse();
  }

  public static com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRecreateICAResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgRecreateICAResponse>() {
    @java.lang.Override
    public MsgRecreateICAResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRecreateICAResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRecreateICAResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

