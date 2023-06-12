// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/tx.proto

package com.injective.oracle.v1beta1;

/**
 * Protobuf type {@code injective.oracle.v1beta1.MsgRelayBandRatesResponse}
 */
public final class MsgRelayBandRatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.oracle.v1beta1.MsgRelayBandRatesResponse)
    MsgRelayBandRatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRelayBandRatesResponse.newBuilder() to construct.
  private MsgRelayBandRatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRelayBandRatesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRelayBandRatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.class, com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.Builder.class);
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
    if (!(obj instanceof com.injective.oracle.v1beta1.MsgRelayBandRatesResponse)) {
      return super.equals(obj);
    }
    com.injective.oracle.v1beta1.MsgRelayBandRatesResponse other = (com.injective.oracle.v1beta1.MsgRelayBandRatesResponse) obj;

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

  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse parseFrom(
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
  public static Builder newBuilder(com.injective.oracle.v1beta1.MsgRelayBandRatesResponse prototype) {
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
   * Protobuf type {@code injective.oracle.v1beta1.MsgRelayBandRatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.oracle.v1beta1.MsgRelayBandRatesResponse)
      com.injective.oracle.v1beta1.MsgRelayBandRatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.class, com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.Builder.class);
    }

    // Construct using com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.newBuilder()
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
      return com.injective.oracle.v1beta1.TxProto.internal_static_injective_oracle_v1beta1_MsgRelayBandRatesResponse_descriptor;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayBandRatesResponse getDefaultInstanceForType() {
      return com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayBandRatesResponse build() {
      com.injective.oracle.v1beta1.MsgRelayBandRatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.oracle.v1beta1.MsgRelayBandRatesResponse buildPartial() {
      com.injective.oracle.v1beta1.MsgRelayBandRatesResponse result = new com.injective.oracle.v1beta1.MsgRelayBandRatesResponse(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.oracle.v1beta1.MsgRelayBandRatesResponse) {
        return mergeFrom((com.injective.oracle.v1beta1.MsgRelayBandRatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.oracle.v1beta1.MsgRelayBandRatesResponse other) {
      if (other == com.injective.oracle.v1beta1.MsgRelayBandRatesResponse.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:injective.oracle.v1beta1.MsgRelayBandRatesResponse)
  }

  // @@protoc_insertion_point(class_scope:injective.oracle.v1beta1.MsgRelayBandRatesResponse)
  private static final com.injective.oracle.v1beta1.MsgRelayBandRatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.oracle.v1beta1.MsgRelayBandRatesResponse();
  }

  public static com.injective.oracle.v1beta1.MsgRelayBandRatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRelayBandRatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgRelayBandRatesResponse>() {
    @java.lang.Override
    public MsgRelayBandRatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRelayBandRatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRelayBandRatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.oracle.v1beta1.MsgRelayBandRatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

