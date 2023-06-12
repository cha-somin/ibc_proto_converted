// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/incentives/query.proto

package com.osmosis.incentives;

/**
 * Protobuf type {@code osmosis.incentives.ModuleToDistributeCoinsRequest}
 */
public final class ModuleToDistributeCoinsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.incentives.ModuleToDistributeCoinsRequest)
    ModuleToDistributeCoinsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleToDistributeCoinsRequest.newBuilder() to construct.
  private ModuleToDistributeCoinsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleToDistributeCoinsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleToDistributeCoinsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.incentives.QueryProto.internal_static_osmosis_incentives_ModuleToDistributeCoinsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.incentives.QueryProto.internal_static_osmosis_incentives_ModuleToDistributeCoinsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.incentives.ModuleToDistributeCoinsRequest.class, com.osmosis.incentives.ModuleToDistributeCoinsRequest.Builder.class);
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
    if (!(obj instanceof com.osmosis.incentives.ModuleToDistributeCoinsRequest)) {
      return super.equals(obj);
    }
    com.osmosis.incentives.ModuleToDistributeCoinsRequest other = (com.osmosis.incentives.ModuleToDistributeCoinsRequest) obj;

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

  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.incentives.ModuleToDistributeCoinsRequest prototype) {
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
   * Protobuf type {@code osmosis.incentives.ModuleToDistributeCoinsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.incentives.ModuleToDistributeCoinsRequest)
      com.osmosis.incentives.ModuleToDistributeCoinsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.incentives.QueryProto.internal_static_osmosis_incentives_ModuleToDistributeCoinsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.incentives.QueryProto.internal_static_osmosis_incentives_ModuleToDistributeCoinsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.incentives.ModuleToDistributeCoinsRequest.class, com.osmosis.incentives.ModuleToDistributeCoinsRequest.Builder.class);
    }

    // Construct using com.osmosis.incentives.ModuleToDistributeCoinsRequest.newBuilder()
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
      return com.osmosis.incentives.QueryProto.internal_static_osmosis_incentives_ModuleToDistributeCoinsRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.incentives.ModuleToDistributeCoinsRequest getDefaultInstanceForType() {
      return com.osmosis.incentives.ModuleToDistributeCoinsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.incentives.ModuleToDistributeCoinsRequest build() {
      com.osmosis.incentives.ModuleToDistributeCoinsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.incentives.ModuleToDistributeCoinsRequest buildPartial() {
      com.osmosis.incentives.ModuleToDistributeCoinsRequest result = new com.osmosis.incentives.ModuleToDistributeCoinsRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.incentives.ModuleToDistributeCoinsRequest) {
        return mergeFrom((com.osmosis.incentives.ModuleToDistributeCoinsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.incentives.ModuleToDistributeCoinsRequest other) {
      if (other == com.osmosis.incentives.ModuleToDistributeCoinsRequest.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:osmosis.incentives.ModuleToDistributeCoinsRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.incentives.ModuleToDistributeCoinsRequest)
  private static final com.osmosis.incentives.ModuleToDistributeCoinsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.incentives.ModuleToDistributeCoinsRequest();
  }

  public static com.osmosis.incentives.ModuleToDistributeCoinsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleToDistributeCoinsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModuleToDistributeCoinsRequest>() {
    @java.lang.Override
    public ModuleToDistributeCoinsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModuleToDistributeCoinsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleToDistributeCoinsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.incentives.ModuleToDistributeCoinsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

