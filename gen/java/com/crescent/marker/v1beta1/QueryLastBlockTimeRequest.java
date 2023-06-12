// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/marker/v1beta1/query.proto

package com.crescent.marker.v1beta1;

/**
 * Protobuf type {@code crescent.marker.v1beta1.QueryLastBlockTimeRequest}
 */
public final class QueryLastBlockTimeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crescent.marker.v1beta1.QueryLastBlockTimeRequest)
    QueryLastBlockTimeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryLastBlockTimeRequest.newBuilder() to construct.
  private QueryLastBlockTimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryLastBlockTimeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryLastBlockTimeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.crescent.marker.v1beta1.QueryProto.internal_static_crescent_marker_v1beta1_QueryLastBlockTimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.crescent.marker.v1beta1.QueryProto.internal_static_crescent_marker_v1beta1_QueryLastBlockTimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.class, com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.Builder.class);
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
    if (!(obj instanceof com.crescent.marker.v1beta1.QueryLastBlockTimeRequest)) {
      return super.equals(obj);
    }
    com.crescent.marker.v1beta1.QueryLastBlockTimeRequest other = (com.crescent.marker.v1beta1.QueryLastBlockTimeRequest) obj;

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

  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest parseFrom(
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
  public static Builder newBuilder(com.crescent.marker.v1beta1.QueryLastBlockTimeRequest prototype) {
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
   * Protobuf type {@code crescent.marker.v1beta1.QueryLastBlockTimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crescent.marker.v1beta1.QueryLastBlockTimeRequest)
      com.crescent.marker.v1beta1.QueryLastBlockTimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.crescent.marker.v1beta1.QueryProto.internal_static_crescent_marker_v1beta1_QueryLastBlockTimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.crescent.marker.v1beta1.QueryProto.internal_static_crescent_marker_v1beta1_QueryLastBlockTimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.class, com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.Builder.class);
    }

    // Construct using com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.newBuilder()
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
      return com.crescent.marker.v1beta1.QueryProto.internal_static_crescent_marker_v1beta1_QueryLastBlockTimeRequest_descriptor;
    }

    @java.lang.Override
    public com.crescent.marker.v1beta1.QueryLastBlockTimeRequest getDefaultInstanceForType() {
      return com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.crescent.marker.v1beta1.QueryLastBlockTimeRequest build() {
      com.crescent.marker.v1beta1.QueryLastBlockTimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.crescent.marker.v1beta1.QueryLastBlockTimeRequest buildPartial() {
      com.crescent.marker.v1beta1.QueryLastBlockTimeRequest result = new com.crescent.marker.v1beta1.QueryLastBlockTimeRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.crescent.marker.v1beta1.QueryLastBlockTimeRequest) {
        return mergeFrom((com.crescent.marker.v1beta1.QueryLastBlockTimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.crescent.marker.v1beta1.QueryLastBlockTimeRequest other) {
      if (other == com.crescent.marker.v1beta1.QueryLastBlockTimeRequest.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:crescent.marker.v1beta1.QueryLastBlockTimeRequest)
  }

  // @@protoc_insertion_point(class_scope:crescent.marker.v1beta1.QueryLastBlockTimeRequest)
  private static final com.crescent.marker.v1beta1.QueryLastBlockTimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.crescent.marker.v1beta1.QueryLastBlockTimeRequest();
  }

  public static com.crescent.marker.v1beta1.QueryLastBlockTimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryLastBlockTimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryLastBlockTimeRequest>() {
    @java.lang.Override
    public QueryLastBlockTimeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryLastBlockTimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryLastBlockTimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.crescent.marker.v1beta1.QueryLastBlockTimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

