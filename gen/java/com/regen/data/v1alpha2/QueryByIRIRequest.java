// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/query.proto

package com.regen.data.v1alpha2;

/**
 * <pre>
 * QueryByContentHashRequest is the Query/ByContentHash request type.
 * </pre>
 *
 * Protobuf type {@code regen.data.v1alpha2.QueryByIRIRequest}
 */
public final class QueryByIRIRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:regen.data.v1alpha2.QueryByIRIRequest)
    QueryByIRIRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryByIRIRequest.newBuilder() to construct.
  private QueryByIRIRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryByIRIRequest() {
    iri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryByIRIRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.regen.data.v1alpha2.QueryProto.internal_static_regen_data_v1alpha2_QueryByIRIRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.regen.data.v1alpha2.QueryProto.internal_static_regen_data_v1alpha2_QueryByIRIRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.regen.data.v1alpha2.QueryByIRIRequest.class, com.regen.data.v1alpha2.QueryByIRIRequest.Builder.class);
  }

  public static final int IRI_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object iri_ = "";
  /**
   * <pre>
   * hash is the hash-based identifier for the anchored content.
   * </pre>
   *
   * <code>string iri = 1 [json_name = "iri"];</code>
   * @return The iri.
   */
  @java.lang.Override
  public java.lang.String getIri() {
    java.lang.Object ref = iri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * hash is the hash-based identifier for the anchored content.
   * </pre>
   *
   * <code>string iri = 1 [json_name = "iri"];</code>
   * @return The bytes for iri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIriBytes() {
    java.lang.Object ref = iri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iri_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.regen.data.v1alpha2.QueryByIRIRequest)) {
      return super.equals(obj);
    }
    com.regen.data.v1alpha2.QueryByIRIRequest other = (com.regen.data.v1alpha2.QueryByIRIRequest) obj;

    if (!getIri()
        .equals(other.getIri())) return false;
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
    hash = (37 * hash) + IRI_FIELD_NUMBER;
    hash = (53 * hash) + getIri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.regen.data.v1alpha2.QueryByIRIRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.regen.data.v1alpha2.QueryByIRIRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.regen.data.v1alpha2.QueryByIRIRequest parseFrom(
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
  public static Builder newBuilder(com.regen.data.v1alpha2.QueryByIRIRequest prototype) {
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
   * QueryByContentHashRequest is the Query/ByContentHash request type.
   * </pre>
   *
   * Protobuf type {@code regen.data.v1alpha2.QueryByIRIRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:regen.data.v1alpha2.QueryByIRIRequest)
      com.regen.data.v1alpha2.QueryByIRIRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.regen.data.v1alpha2.QueryProto.internal_static_regen_data_v1alpha2_QueryByIRIRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.regen.data.v1alpha2.QueryProto.internal_static_regen_data_v1alpha2_QueryByIRIRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.regen.data.v1alpha2.QueryByIRIRequest.class, com.regen.data.v1alpha2.QueryByIRIRequest.Builder.class);
    }

    // Construct using com.regen.data.v1alpha2.QueryByIRIRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      iri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.regen.data.v1alpha2.QueryProto.internal_static_regen_data_v1alpha2_QueryByIRIRequest_descriptor;
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.QueryByIRIRequest getDefaultInstanceForType() {
      return com.regen.data.v1alpha2.QueryByIRIRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.QueryByIRIRequest build() {
      com.regen.data.v1alpha2.QueryByIRIRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.regen.data.v1alpha2.QueryByIRIRequest buildPartial() {
      com.regen.data.v1alpha2.QueryByIRIRequest result = new com.regen.data.v1alpha2.QueryByIRIRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.regen.data.v1alpha2.QueryByIRIRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.iri_ = iri_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.regen.data.v1alpha2.QueryByIRIRequest) {
        return mergeFrom((com.regen.data.v1alpha2.QueryByIRIRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.regen.data.v1alpha2.QueryByIRIRequest other) {
      if (other == com.regen.data.v1alpha2.QueryByIRIRequest.getDefaultInstance()) return this;
      if (!other.getIri().isEmpty()) {
        iri_ = other.iri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
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
            case 10: {
              iri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
    private int bitField0_;

    private java.lang.Object iri_ = "";
    /**
     * <pre>
     * hash is the hash-based identifier for the anchored content.
     * </pre>
     *
     * <code>string iri = 1 [json_name = "iri"];</code>
     * @return The iri.
     */
    public java.lang.String getIri() {
      java.lang.Object ref = iri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * hash is the hash-based identifier for the anchored content.
     * </pre>
     *
     * <code>string iri = 1 [json_name = "iri"];</code>
     * @return The bytes for iri.
     */
    public com.google.protobuf.ByteString
        getIriBytes() {
      java.lang.Object ref = iri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * hash is the hash-based identifier for the anchored content.
     * </pre>
     *
     * <code>string iri = 1 [json_name = "iri"];</code>
     * @param value The iri to set.
     * @return This builder for chaining.
     */
    public Builder setIri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      iri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the hash-based identifier for the anchored content.
     * </pre>
     *
     * <code>string iri = 1 [json_name = "iri"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIri() {
      iri_ = getDefaultInstance().getIri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the hash-based identifier for the anchored content.
     * </pre>
     *
     * <code>string iri = 1 [json_name = "iri"];</code>
     * @param value The bytes for iri to set.
     * @return This builder for chaining.
     */
    public Builder setIriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      iri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:regen.data.v1alpha2.QueryByIRIRequest)
  }

  // @@protoc_insertion_point(class_scope:regen.data.v1alpha2.QueryByIRIRequest)
  private static final com.regen.data.v1alpha2.QueryByIRIRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.regen.data.v1alpha2.QueryByIRIRequest();
  }

  public static com.regen.data.v1alpha2.QueryByIRIRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryByIRIRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryByIRIRequest>() {
    @java.lang.Override
    public QueryByIRIRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryByIRIRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryByIRIRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.regen.data.v1alpha2.QueryByIRIRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

