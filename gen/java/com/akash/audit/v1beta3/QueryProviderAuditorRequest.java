// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta3/query.proto

package com.akash.audit.v1beta3;

/**
 * <pre>
 * QueryProviderAuditorRequest is request type for the Query/Providers RPC method
 * </pre>
 *
 * Protobuf type {@code akash.audit.v1beta3.QueryProviderAuditorRequest}
 */
public final class QueryProviderAuditorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.audit.v1beta3.QueryProviderAuditorRequest)
    QueryProviderAuditorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProviderAuditorRequest.newBuilder() to construct.
  private QueryProviderAuditorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProviderAuditorRequest() {
    auditor_ = "";
    owner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProviderAuditorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.audit.v1beta3.QueryProto.internal_static_akash_audit_v1beta3_QueryProviderAuditorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.audit.v1beta3.QueryProto.internal_static_akash_audit_v1beta3_QueryProviderAuditorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.audit.v1beta3.QueryProviderAuditorRequest.class, com.akash.audit.v1beta3.QueryProviderAuditorRequest.Builder.class);
  }

  public static final int AUDITOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object auditor_ = "";
  /**
   * <code>string auditor = 1 [json_name = "auditor"];</code>
   * @return The auditor.
   */
  @java.lang.Override
  public java.lang.String getAuditor() {
    java.lang.Object ref = auditor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      auditor_ = s;
      return s;
    }
  }
  /**
   * <code>string auditor = 1 [json_name = "auditor"];</code>
   * @return The bytes for auditor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuditorBytes() {
    java.lang.Object ref = auditor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      auditor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(auditor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, auditor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, owner_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(auditor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, auditor_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, owner_);
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
    if (!(obj instanceof com.akash.audit.v1beta3.QueryProviderAuditorRequest)) {
      return super.equals(obj);
    }
    com.akash.audit.v1beta3.QueryProviderAuditorRequest other = (com.akash.audit.v1beta3.QueryProviderAuditorRequest) obj;

    if (!getAuditor()
        .equals(other.getAuditor())) return false;
    if (!getOwner()
        .equals(other.getOwner())) return false;
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
    hash = (37 * hash) + AUDITOR_FIELD_NUMBER;
    hash = (53 * hash) + getAuditor().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest parseFrom(
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
  public static Builder newBuilder(com.akash.audit.v1beta3.QueryProviderAuditorRequest prototype) {
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
   * QueryProviderAuditorRequest is request type for the Query/Providers RPC method
   * </pre>
   *
   * Protobuf type {@code akash.audit.v1beta3.QueryProviderAuditorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.audit.v1beta3.QueryProviderAuditorRequest)
      com.akash.audit.v1beta3.QueryProviderAuditorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.audit.v1beta3.QueryProto.internal_static_akash_audit_v1beta3_QueryProviderAuditorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.audit.v1beta3.QueryProto.internal_static_akash_audit_v1beta3_QueryProviderAuditorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.audit.v1beta3.QueryProviderAuditorRequest.class, com.akash.audit.v1beta3.QueryProviderAuditorRequest.Builder.class);
    }

    // Construct using com.akash.audit.v1beta3.QueryProviderAuditorRequest.newBuilder()
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
      auditor_ = "";
      owner_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.audit.v1beta3.QueryProto.internal_static_akash_audit_v1beta3_QueryProviderAuditorRequest_descriptor;
    }

    @java.lang.Override
    public com.akash.audit.v1beta3.QueryProviderAuditorRequest getDefaultInstanceForType() {
      return com.akash.audit.v1beta3.QueryProviderAuditorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.audit.v1beta3.QueryProviderAuditorRequest build() {
      com.akash.audit.v1beta3.QueryProviderAuditorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.audit.v1beta3.QueryProviderAuditorRequest buildPartial() {
      com.akash.audit.v1beta3.QueryProviderAuditorRequest result = new com.akash.audit.v1beta3.QueryProviderAuditorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.audit.v1beta3.QueryProviderAuditorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.auditor_ = auditor_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.owner_ = owner_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.audit.v1beta3.QueryProviderAuditorRequest) {
        return mergeFrom((com.akash.audit.v1beta3.QueryProviderAuditorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.audit.v1beta3.QueryProviderAuditorRequest other) {
      if (other == com.akash.audit.v1beta3.QueryProviderAuditorRequest.getDefaultInstance()) return this;
      if (!other.getAuditor().isEmpty()) {
        auditor_ = other.auditor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000002;
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
              auditor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object auditor_ = "";
    /**
     * <code>string auditor = 1 [json_name = "auditor"];</code>
     * @return The auditor.
     */
    public java.lang.String getAuditor() {
      java.lang.Object ref = auditor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        auditor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auditor = 1 [json_name = "auditor"];</code>
     * @return The bytes for auditor.
     */
    public com.google.protobuf.ByteString
        getAuditorBytes() {
      java.lang.Object ref = auditor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        auditor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auditor = 1 [json_name = "auditor"];</code>
     * @param value The auditor to set.
     * @return This builder for chaining.
     */
    public Builder setAuditor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      auditor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string auditor = 1 [json_name = "auditor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuditor() {
      auditor_ = getDefaultInstance().getAuditor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string auditor = 1 [json_name = "auditor"];</code>
     * @param value The bytes for auditor to set.
     * @return This builder for chaining.
     */
    public Builder setAuditorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      auditor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <code>string owner = 2 [json_name = "owner"];</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner = 2 [json_name = "owner"];</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner = 2 [json_name = "owner"];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 2 [json_name = "owner"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 2 [json_name = "owner"];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:akash.audit.v1beta3.QueryProviderAuditorRequest)
  }

  // @@protoc_insertion_point(class_scope:akash.audit.v1beta3.QueryProviderAuditorRequest)
  private static final com.akash.audit.v1beta3.QueryProviderAuditorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.audit.v1beta3.QueryProviderAuditorRequest();
  }

  public static com.akash.audit.v1beta3.QueryProviderAuditorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProviderAuditorRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryProviderAuditorRequest>() {
    @java.lang.Override
    public QueryProviderAuditorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProviderAuditorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryProviderAuditorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.audit.v1beta3.QueryProviderAuditorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

