// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/feeshare/v1/tx.proto

package com.juno.feeshare.v1;

/**
 * <pre>
 * MsgCancelFeeShareResponse defines the MsgCancelFeeShare response type
 * </pre>
 *
 * Protobuf type {@code juno.feeshare.v1.MsgCancelFeeShareResponse}
 */
public final class MsgCancelFeeShareResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:juno.feeshare.v1.MsgCancelFeeShareResponse)
    MsgCancelFeeShareResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCancelFeeShareResponse.newBuilder() to construct.
  private MsgCancelFeeShareResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCancelFeeShareResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCancelFeeShareResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.juno.feeshare.v1.TxProto.internal_static_juno_feeshare_v1_MsgCancelFeeShareResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.juno.feeshare.v1.TxProto.internal_static_juno_feeshare_v1_MsgCancelFeeShareResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.juno.feeshare.v1.MsgCancelFeeShareResponse.class, com.juno.feeshare.v1.MsgCancelFeeShareResponse.Builder.class);
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
    if (!(obj instanceof com.juno.feeshare.v1.MsgCancelFeeShareResponse)) {
      return super.equals(obj);
    }
    com.juno.feeshare.v1.MsgCancelFeeShareResponse other = (com.juno.feeshare.v1.MsgCancelFeeShareResponse) obj;

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

  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse parseFrom(
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
  public static Builder newBuilder(com.juno.feeshare.v1.MsgCancelFeeShareResponse prototype) {
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
   * MsgCancelFeeShareResponse defines the MsgCancelFeeShare response type
   * </pre>
   *
   * Protobuf type {@code juno.feeshare.v1.MsgCancelFeeShareResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:juno.feeshare.v1.MsgCancelFeeShareResponse)
      com.juno.feeshare.v1.MsgCancelFeeShareResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.juno.feeshare.v1.TxProto.internal_static_juno_feeshare_v1_MsgCancelFeeShareResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.juno.feeshare.v1.TxProto.internal_static_juno_feeshare_v1_MsgCancelFeeShareResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.juno.feeshare.v1.MsgCancelFeeShareResponse.class, com.juno.feeshare.v1.MsgCancelFeeShareResponse.Builder.class);
    }

    // Construct using com.juno.feeshare.v1.MsgCancelFeeShareResponse.newBuilder()
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
      return com.juno.feeshare.v1.TxProto.internal_static_juno_feeshare_v1_MsgCancelFeeShareResponse_descriptor;
    }

    @java.lang.Override
    public com.juno.feeshare.v1.MsgCancelFeeShareResponse getDefaultInstanceForType() {
      return com.juno.feeshare.v1.MsgCancelFeeShareResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.juno.feeshare.v1.MsgCancelFeeShareResponse build() {
      com.juno.feeshare.v1.MsgCancelFeeShareResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.juno.feeshare.v1.MsgCancelFeeShareResponse buildPartial() {
      com.juno.feeshare.v1.MsgCancelFeeShareResponse result = new com.juno.feeshare.v1.MsgCancelFeeShareResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.juno.feeshare.v1.MsgCancelFeeShareResponse) {
        return mergeFrom((com.juno.feeshare.v1.MsgCancelFeeShareResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.juno.feeshare.v1.MsgCancelFeeShareResponse other) {
      if (other == com.juno.feeshare.v1.MsgCancelFeeShareResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:juno.feeshare.v1.MsgCancelFeeShareResponse)
  }

  // @@protoc_insertion_point(class_scope:juno.feeshare.v1.MsgCancelFeeShareResponse)
  private static final com.juno.feeshare.v1.MsgCancelFeeShareResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.juno.feeshare.v1.MsgCancelFeeShareResponse();
  }

  public static com.juno.feeshare.v1.MsgCancelFeeShareResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCancelFeeShareResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgCancelFeeShareResponse>() {
    @java.lang.Override
    public MsgCancelFeeShareResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCancelFeeShareResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCancelFeeShareResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.juno.feeshare.v1.MsgCancelFeeShareResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

