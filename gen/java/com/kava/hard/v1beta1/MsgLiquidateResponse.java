// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/hard/v1beta1/tx.proto

package com.kava.hard.v1beta1;

/**
 * <pre>
 * MsgLiquidateResponse defines the Msg/Liquidate response type.
 * </pre>
 *
 * Protobuf type {@code kava.hard.v1beta1.MsgLiquidateResponse}
 */
public final class MsgLiquidateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.hard.v1beta1.MsgLiquidateResponse)
    MsgLiquidateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgLiquidateResponse.newBuilder() to construct.
  private MsgLiquidateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgLiquidateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgLiquidateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.hard.v1beta1.TxProto.internal_static_kava_hard_v1beta1_MsgLiquidateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.hard.v1beta1.TxProto.internal_static_kava_hard_v1beta1_MsgLiquidateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.hard.v1beta1.MsgLiquidateResponse.class, com.kava.hard.v1beta1.MsgLiquidateResponse.Builder.class);
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
    if (!(obj instanceof com.kava.hard.v1beta1.MsgLiquidateResponse)) {
      return super.equals(obj);
    }
    com.kava.hard.v1beta1.MsgLiquidateResponse other = (com.kava.hard.v1beta1.MsgLiquidateResponse) obj;

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

  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.hard.v1beta1.MsgLiquidateResponse parseFrom(
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
  public static Builder newBuilder(com.kava.hard.v1beta1.MsgLiquidateResponse prototype) {
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
   * MsgLiquidateResponse defines the Msg/Liquidate response type.
   * </pre>
   *
   * Protobuf type {@code kava.hard.v1beta1.MsgLiquidateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.hard.v1beta1.MsgLiquidateResponse)
      com.kava.hard.v1beta1.MsgLiquidateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.hard.v1beta1.TxProto.internal_static_kava_hard_v1beta1_MsgLiquidateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.hard.v1beta1.TxProto.internal_static_kava_hard_v1beta1_MsgLiquidateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.hard.v1beta1.MsgLiquidateResponse.class, com.kava.hard.v1beta1.MsgLiquidateResponse.Builder.class);
    }

    // Construct using com.kava.hard.v1beta1.MsgLiquidateResponse.newBuilder()
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
      return com.kava.hard.v1beta1.TxProto.internal_static_kava_hard_v1beta1_MsgLiquidateResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.MsgLiquidateResponse getDefaultInstanceForType() {
      return com.kava.hard.v1beta1.MsgLiquidateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.MsgLiquidateResponse build() {
      com.kava.hard.v1beta1.MsgLiquidateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.hard.v1beta1.MsgLiquidateResponse buildPartial() {
      com.kava.hard.v1beta1.MsgLiquidateResponse result = new com.kava.hard.v1beta1.MsgLiquidateResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.hard.v1beta1.MsgLiquidateResponse) {
        return mergeFrom((com.kava.hard.v1beta1.MsgLiquidateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.hard.v1beta1.MsgLiquidateResponse other) {
      if (other == com.kava.hard.v1beta1.MsgLiquidateResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:kava.hard.v1beta1.MsgLiquidateResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.hard.v1beta1.MsgLiquidateResponse)
  private static final com.kava.hard.v1beta1.MsgLiquidateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.hard.v1beta1.MsgLiquidateResponse();
  }

  public static com.kava.hard.v1beta1.MsgLiquidateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgLiquidateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgLiquidateResponse>() {
    @java.lang.Override
    public MsgLiquidateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgLiquidateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgLiquidateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.hard.v1beta1.MsgLiquidateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

