// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/query.proto

package com.osmosis.protorev.v1beta1;

/**
 * <pre>
 * QueryGetProtoRevTokenPairArbRoutesRequest is request type for the
 * Query/GetProtoRevTokenPairArbRoutes RPC method.
 * </pre>
 *
 * Protobuf type {@code osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest}
 */
public final class QueryGetProtoRevTokenPairArbRoutesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)
    QueryGetProtoRevTokenPairArbRoutesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetProtoRevTokenPairArbRoutesRequest.newBuilder() to construct.
  private QueryGetProtoRevTokenPairArbRoutesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetProtoRevTokenPairArbRoutesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetProtoRevTokenPairArbRoutesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.class, com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.Builder.class);
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
    if (!(obj instanceof com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)) {
      return super.equals(obj);
    }
    com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest other = (com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest) obj;

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

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest prototype) {
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
   * QueryGetProtoRevTokenPairArbRoutesRequest is request type for the
   * Query/GetProtoRevTokenPairArbRoutes RPC method.
   * </pre>
   *
   * Protobuf type {@code osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)
      com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.class, com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.Builder.class);
    }

    // Construct using com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.newBuilder()
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
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest getDefaultInstanceForType() {
      return com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest build() {
      com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest buildPartial() {
      com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest result = new com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest) {
        return mergeFrom((com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest other) {
      if (other == com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest)
  private static final com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest();
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetProtoRevTokenPairArbRoutesRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetProtoRevTokenPairArbRoutesRequest>() {
    @java.lang.Override
    public QueryGetProtoRevTokenPairArbRoutesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetProtoRevTokenPairArbRoutesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetProtoRevTokenPairArbRoutesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

