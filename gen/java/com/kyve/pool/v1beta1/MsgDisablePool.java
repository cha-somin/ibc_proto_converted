// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/pool/v1beta1/tx.proto

package com.kyve.pool.v1beta1;

/**
 * <pre>
 * MsgDisablePool defines a SDK message for disabling an existing pool.
 * </pre>
 *
 * Protobuf type {@code kyve.pool.v1beta1.MsgDisablePool}
 */
public final class MsgDisablePool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.pool.v1beta1.MsgDisablePool)
    MsgDisablePoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDisablePool.newBuilder() to construct.
  private MsgDisablePool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDisablePool() {
    authority_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDisablePool();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.pool.v1beta1.TxProto.internal_static_kyve_pool_v1beta1_MsgDisablePool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.pool.v1beta1.TxProto.internal_static_kyve_pool_v1beta1_MsgDisablePool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.pool.v1beta1.MsgDisablePool.class, com.kyve.pool.v1beta1.MsgDisablePool.Builder.class);
  }

  public static final int AUTHORITY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object authority_ = "";
  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  @java.lang.Override
  public java.lang.String getAuthority() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authority_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorityBytes() {
    java.lang.Object ref = authority_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authority_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long id_ = 0L;
  /**
   * <pre>
   * id ...
   * </pre>
   *
   * <code>uint64 id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authority_);
    }
    if (id_ != 0L) {
      output.writeUInt64(2, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authority_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, id_);
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
    if (!(obj instanceof com.kyve.pool.v1beta1.MsgDisablePool)) {
      return super.equals(obj);
    }
    com.kyve.pool.v1beta1.MsgDisablePool other = (com.kyve.pool.v1beta1.MsgDisablePool) obj;

    if (!getAuthority()
        .equals(other.getAuthority())) return false;
    if (getId()
        != other.getId()) return false;
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
    hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
    hash = (53 * hash) + getAuthority().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.pool.v1beta1.MsgDisablePool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.pool.v1beta1.MsgDisablePool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.pool.v1beta1.MsgDisablePool parseFrom(
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
  public static Builder newBuilder(com.kyve.pool.v1beta1.MsgDisablePool prototype) {
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
   * MsgDisablePool defines a SDK message for disabling an existing pool.
   * </pre>
   *
   * Protobuf type {@code kyve.pool.v1beta1.MsgDisablePool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.pool.v1beta1.MsgDisablePool)
      com.kyve.pool.v1beta1.MsgDisablePoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.pool.v1beta1.TxProto.internal_static_kyve_pool_v1beta1_MsgDisablePool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.pool.v1beta1.TxProto.internal_static_kyve_pool_v1beta1_MsgDisablePool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.pool.v1beta1.MsgDisablePool.class, com.kyve.pool.v1beta1.MsgDisablePool.Builder.class);
    }

    // Construct using com.kyve.pool.v1beta1.MsgDisablePool.newBuilder()
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
      authority_ = "";
      id_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.pool.v1beta1.TxProto.internal_static_kyve_pool_v1beta1_MsgDisablePool_descriptor;
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.MsgDisablePool getDefaultInstanceForType() {
      return com.kyve.pool.v1beta1.MsgDisablePool.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.MsgDisablePool build() {
      com.kyve.pool.v1beta1.MsgDisablePool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.pool.v1beta1.MsgDisablePool buildPartial() {
      com.kyve.pool.v1beta1.MsgDisablePool result = new com.kyve.pool.v1beta1.MsgDisablePool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.pool.v1beta1.MsgDisablePool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authority_ = authority_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.pool.v1beta1.MsgDisablePool) {
        return mergeFrom((com.kyve.pool.v1beta1.MsgDisablePool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.pool.v1beta1.MsgDisablePool other) {
      if (other == com.kyve.pool.v1beta1.MsgDisablePool.getDefaultInstance()) return this;
      if (!other.getAuthority().isEmpty()) {
        authority_ = other.authority_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
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
              authority_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              id_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object authority_ = "";
    /**
     * <pre>
     * authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The authority.
     */
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return The bytes for authority.
     */
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthority(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthority() {
      authority_ = getDefaultInstance().getAuthority();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * authority is the address of the governance account.
     * </pre>
     *
     * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     * @param value The bytes for authority to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      authority_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id ...
     * </pre>
     *
     * <code>uint64 id = 2 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      id_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:kyve.pool.v1beta1.MsgDisablePool)
  }

  // @@protoc_insertion_point(class_scope:kyve.pool.v1beta1.MsgDisablePool)
  private static final com.kyve.pool.v1beta1.MsgDisablePool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.pool.v1beta1.MsgDisablePool();
  }

  public static com.kyve.pool.v1beta1.MsgDisablePool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDisablePool>
      PARSER = new com.google.protobuf.AbstractParser<MsgDisablePool>() {
    @java.lang.Override
    public MsgDisablePool parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDisablePool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDisablePool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.pool.v1beta1.MsgDisablePool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

