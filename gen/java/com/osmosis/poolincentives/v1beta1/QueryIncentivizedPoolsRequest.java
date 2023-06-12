// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/pool-incentives/v1beta1/query.proto

package com.osmosis.poolincentives.v1beta1;

/**
 * Protobuf type {@code osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest}
 */
public final class QueryIncentivizedPoolsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)
    QueryIncentivizedPoolsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryIncentivizedPoolsRequest.newBuilder() to construct.
  private QueryIncentivizedPoolsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryIncentivizedPoolsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryIncentivizedPoolsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.class, com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.Builder.class);
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
    if (!(obj instanceof com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)) {
      return super.equals(obj);
    }
    com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest other = (com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest) obj;

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

  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest prototype) {
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
   * Protobuf type {@code osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)
      com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.class, com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.Builder.class);
    }

    // Construct using com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.newBuilder()
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
      return com.osmosis.poolincentives.v1beta1.QueryProto.internal_static_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest getDefaultInstanceForType() {
      return com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest build() {
      com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest buildPartial() {
      com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest result = new com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest) {
        return mergeFrom((com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest other) {
      if (other == com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest)
  private static final com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest();
  }

  public static com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryIncentivizedPoolsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryIncentivizedPoolsRequest>() {
    @java.lang.Override
    public QueryIncentivizedPoolsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryIncentivizedPoolsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryIncentivizedPoolsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

