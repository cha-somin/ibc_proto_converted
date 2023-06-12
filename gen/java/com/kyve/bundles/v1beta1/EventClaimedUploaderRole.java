// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/events.proto

package com.kyve.bundles.v1beta1;

/**
 * <pre>
 * EventClaimedUploaderRole is an event emitted when an uploader claims the uploader role
 * emitted_by: MsgClaimUploaderRole
 * </pre>
 *
 * Protobuf type {@code kyve.bundles.v1beta1.EventClaimedUploaderRole}
 */
public final class EventClaimedUploaderRole extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kyve.bundles.v1beta1.EventClaimedUploaderRole)
    EventClaimedUploaderRoleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventClaimedUploaderRole.newBuilder() to construct.
  private EventClaimedUploaderRole(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventClaimedUploaderRole() {
    newUploader_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventClaimedUploaderRole();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kyve.bundles.v1beta1.EventsProto.internal_static_kyve_bundles_v1beta1_EventClaimedUploaderRole_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kyve.bundles.v1beta1.EventsProto.internal_static_kyve_bundles_v1beta1_EventClaimedUploaderRole_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kyve.bundles.v1beta1.EventClaimedUploaderRole.class, com.kyve.bundles.v1beta1.EventClaimedUploaderRole.Builder.class);
  }

  public static final int POOL_ID_FIELD_NUMBER = 1;
  private long poolId_ = 0L;
  /**
   * <pre>
   * pool_id is the unique ID of the pool.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  @java.lang.Override
  public long getPoolId() {
    return poolId_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long id_ = 0L;
  /**
   * <pre>
   * id internal id for the KYVE-bundle
   * </pre>
   *
   * <code>uint64 id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NEW_UPLOADER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newUploader_ = "";
  /**
   * <pre>
   * new_uploader the address of the participant who claimed
   * the free uploader role
   * </pre>
   *
   * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
   * @return The newUploader.
   */
  @java.lang.Override
  public java.lang.String getNewUploader() {
    java.lang.Object ref = newUploader_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newUploader_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * new_uploader the address of the participant who claimed
   * the free uploader role
   * </pre>
   *
   * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
   * @return The bytes for newUploader.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewUploaderBytes() {
    java.lang.Object ref = newUploader_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newUploader_ = b;
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
    if (poolId_ != 0L) {
      output.writeUInt64(1, poolId_);
    }
    if (id_ != 0L) {
      output.writeUInt64(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newUploader_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newUploader_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (poolId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, poolId_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newUploader_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newUploader_);
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
    if (!(obj instanceof com.kyve.bundles.v1beta1.EventClaimedUploaderRole)) {
      return super.equals(obj);
    }
    com.kyve.bundles.v1beta1.EventClaimedUploaderRole other = (com.kyve.bundles.v1beta1.EventClaimedUploaderRole) obj;

    if (getPoolId()
        != other.getPoolId()) return false;
    if (getId()
        != other.getId()) return false;
    if (!getNewUploader()
        .equals(other.getNewUploader())) return false;
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
    hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPoolId());
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NEW_UPLOADER_FIELD_NUMBER;
    hash = (53 * hash) + getNewUploader().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole parseFrom(
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
  public static Builder newBuilder(com.kyve.bundles.v1beta1.EventClaimedUploaderRole prototype) {
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
   * EventClaimedUploaderRole is an event emitted when an uploader claims the uploader role
   * emitted_by: MsgClaimUploaderRole
   * </pre>
   *
   * Protobuf type {@code kyve.bundles.v1beta1.EventClaimedUploaderRole}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kyve.bundles.v1beta1.EventClaimedUploaderRole)
      com.kyve.bundles.v1beta1.EventClaimedUploaderRoleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kyve.bundles.v1beta1.EventsProto.internal_static_kyve_bundles_v1beta1_EventClaimedUploaderRole_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kyve.bundles.v1beta1.EventsProto.internal_static_kyve_bundles_v1beta1_EventClaimedUploaderRole_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kyve.bundles.v1beta1.EventClaimedUploaderRole.class, com.kyve.bundles.v1beta1.EventClaimedUploaderRole.Builder.class);
    }

    // Construct using com.kyve.bundles.v1beta1.EventClaimedUploaderRole.newBuilder()
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
      poolId_ = 0L;
      id_ = 0L;
      newUploader_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kyve.bundles.v1beta1.EventsProto.internal_static_kyve_bundles_v1beta1_EventClaimedUploaderRole_descriptor;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.EventClaimedUploaderRole getDefaultInstanceForType() {
      return com.kyve.bundles.v1beta1.EventClaimedUploaderRole.getDefaultInstance();
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.EventClaimedUploaderRole build() {
      com.kyve.bundles.v1beta1.EventClaimedUploaderRole result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kyve.bundles.v1beta1.EventClaimedUploaderRole buildPartial() {
      com.kyve.bundles.v1beta1.EventClaimedUploaderRole result = new com.kyve.bundles.v1beta1.EventClaimedUploaderRole(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kyve.bundles.v1beta1.EventClaimedUploaderRole result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.poolId_ = poolId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newUploader_ = newUploader_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kyve.bundles.v1beta1.EventClaimedUploaderRole) {
        return mergeFrom((com.kyve.bundles.v1beta1.EventClaimedUploaderRole)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kyve.bundles.v1beta1.EventClaimedUploaderRole other) {
      if (other == com.kyve.bundles.v1beta1.EventClaimedUploaderRole.getDefaultInstance()) return this;
      if (other.getPoolId() != 0L) {
        setPoolId(other.getPoolId());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNewUploader().isEmpty()) {
        newUploader_ = other.newUploader_;
        bitField0_ |= 0x00000004;
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
            case 8: {
              poolId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              id_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              newUploader_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long poolId_ ;
    /**
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return The poolId.
     */
    @java.lang.Override
    public long getPoolId() {
      return poolId_;
    }
    /**
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @param value The poolId to set.
     * @return This builder for chaining.
     */
    public Builder setPoolId(long value) {

      poolId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pool_id is the unique ID of the pool.
     * </pre>
     *
     * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPoolId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      poolId_ = 0L;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * id internal id for the KYVE-bundle
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
     * id internal id for the KYVE-bundle
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
     * id internal id for the KYVE-bundle
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

    private java.lang.Object newUploader_ = "";
    /**
     * <pre>
     * new_uploader the address of the participant who claimed
     * the free uploader role
     * </pre>
     *
     * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
     * @return The newUploader.
     */
    public java.lang.String getNewUploader() {
      java.lang.Object ref = newUploader_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newUploader_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * new_uploader the address of the participant who claimed
     * the free uploader role
     * </pre>
     *
     * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
     * @return The bytes for newUploader.
     */
    public com.google.protobuf.ByteString
        getNewUploaderBytes() {
      java.lang.Object ref = newUploader_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newUploader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * new_uploader the address of the participant who claimed
     * the free uploader role
     * </pre>
     *
     * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
     * @param value The newUploader to set.
     * @return This builder for chaining.
     */
    public Builder setNewUploader(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newUploader_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_uploader the address of the participant who claimed
     * the free uploader role
     * </pre>
     *
     * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewUploader() {
      newUploader_ = getDefaultInstance().getNewUploader();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_uploader the address of the participant who claimed
     * the free uploader role
     * </pre>
     *
     * <code>string new_uploader = 3 [json_name = "newUploader"];</code>
     * @param value The bytes for newUploader to set.
     * @return This builder for chaining.
     */
    public Builder setNewUploaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newUploader_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:kyve.bundles.v1beta1.EventClaimedUploaderRole)
  }

  // @@protoc_insertion_point(class_scope:kyve.bundles.v1beta1.EventClaimedUploaderRole)
  private static final com.kyve.bundles.v1beta1.EventClaimedUploaderRole DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kyve.bundles.v1beta1.EventClaimedUploaderRole();
  }

  public static com.kyve.bundles.v1beta1.EventClaimedUploaderRole getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventClaimedUploaderRole>
      PARSER = new com.google.protobuf.AbstractParser<EventClaimedUploaderRole>() {
    @java.lang.Override
    public EventClaimedUploaderRole parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventClaimedUploaderRole> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventClaimedUploaderRole> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kyve.bundles.v1beta1.EventClaimedUploaderRole getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

