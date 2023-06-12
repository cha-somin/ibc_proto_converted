// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iov/escrow/v1beta1/test.proto

package com.starnamed.x.escrow.v1beta1;

/**
 * <pre>
 * TestObject defines a transferable object used for testing
 * </pre>
 *
 * Protobuf type {@code starnamed.x.escrow.v1beta1.TestObject}
 */
public final class TestObject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:starnamed.x.escrow.v1beta1.TestObject)
    TestObjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestObject.newBuilder() to construct.
  private TestObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestObject() {
    owner_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestObject();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.starnamed.x.escrow.v1beta1.TestProto.internal_static_starnamed_x_escrow_v1beta1_TestObject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.starnamed.x.escrow.v1beta1.TestProto.internal_static_starnamed_x_escrow_v1beta1_TestObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.starnamed.x.escrow.v1beta1.TestObject.class, com.starnamed.x.escrow.v1beta1.TestObject.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int OWNER_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString owner_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes owner = 2 [json_name = "owner", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOwner() {
    return owner_;
  }

  public static final int NUM_ALLOWED_TRANSFERS_FIELD_NUMBER = 3;
  private long numAllowedTransfers_ = 0L;
  /**
   * <code>int64 num_allowed_transfers = 3 [json_name = "numAllowedTransfers"];</code>
   * @return The numAllowedTransfers.
   */
  @java.lang.Override
  public long getNumAllowedTransfers() {
    return numAllowedTransfers_;
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (!owner_.isEmpty()) {
      output.writeBytes(2, owner_);
    }
    if (numAllowedTransfers_ != 0L) {
      output.writeInt64(3, numAllowedTransfers_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (!owner_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, owner_);
    }
    if (numAllowedTransfers_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numAllowedTransfers_);
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
    if (!(obj instanceof com.starnamed.x.escrow.v1beta1.TestObject)) {
      return super.equals(obj);
    }
    com.starnamed.x.escrow.v1beta1.TestObject other = (com.starnamed.x.escrow.v1beta1.TestObject) obj;

    if (getId()
        != other.getId()) return false;
    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (getNumAllowedTransfers()
        != other.getNumAllowedTransfers()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + NUM_ALLOWED_TRANSFERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumAllowedTransfers());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.starnamed.x.escrow.v1beta1.TestObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.starnamed.x.escrow.v1beta1.TestObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.starnamed.x.escrow.v1beta1.TestObject parseFrom(
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
  public static Builder newBuilder(com.starnamed.x.escrow.v1beta1.TestObject prototype) {
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
   * TestObject defines a transferable object used for testing
   * </pre>
   *
   * Protobuf type {@code starnamed.x.escrow.v1beta1.TestObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:starnamed.x.escrow.v1beta1.TestObject)
      com.starnamed.x.escrow.v1beta1.TestObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.starnamed.x.escrow.v1beta1.TestProto.internal_static_starnamed_x_escrow_v1beta1_TestObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.starnamed.x.escrow.v1beta1.TestProto.internal_static_starnamed_x_escrow_v1beta1_TestObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.starnamed.x.escrow.v1beta1.TestObject.class, com.starnamed.x.escrow.v1beta1.TestObject.Builder.class);
    }

    // Construct using com.starnamed.x.escrow.v1beta1.TestObject.newBuilder()
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
      id_ = 0L;
      owner_ = com.google.protobuf.ByteString.EMPTY;
      numAllowedTransfers_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.starnamed.x.escrow.v1beta1.TestProto.internal_static_starnamed_x_escrow_v1beta1_TestObject_descriptor;
    }

    @java.lang.Override
    public com.starnamed.x.escrow.v1beta1.TestObject getDefaultInstanceForType() {
      return com.starnamed.x.escrow.v1beta1.TestObject.getDefaultInstance();
    }

    @java.lang.Override
    public com.starnamed.x.escrow.v1beta1.TestObject build() {
      com.starnamed.x.escrow.v1beta1.TestObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.starnamed.x.escrow.v1beta1.TestObject buildPartial() {
      com.starnamed.x.escrow.v1beta1.TestObject result = new com.starnamed.x.escrow.v1beta1.TestObject(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.starnamed.x.escrow.v1beta1.TestObject result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numAllowedTransfers_ = numAllowedTransfers_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.starnamed.x.escrow.v1beta1.TestObject) {
        return mergeFrom((com.starnamed.x.escrow.v1beta1.TestObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.starnamed.x.escrow.v1beta1.TestObject other) {
      if (other == com.starnamed.x.escrow.v1beta1.TestObject.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getOwner() != com.google.protobuf.ByteString.EMPTY) {
        setOwner(other.getOwner());
      }
      if (other.getNumAllowedTransfers() != 0L) {
        setNumAllowedTransfers(other.getNumAllowedTransfers());
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
              id_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              owner_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              numAllowedTransfers_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long id_ ;
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString owner_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes owner = 2 [json_name = "owner", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The owner.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOwner() {
      return owner_;
    }
    /**
     * <code>bytes owner = 2 [json_name = "owner", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes owner = 2 [json_name = "owner", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      bitField0_ = (bitField0_ & ~0x00000002);
      owner_ = getDefaultInstance().getOwner();
      onChanged();
      return this;
    }

    private long numAllowedTransfers_ ;
    /**
     * <code>int64 num_allowed_transfers = 3 [json_name = "numAllowedTransfers"];</code>
     * @return The numAllowedTransfers.
     */
    @java.lang.Override
    public long getNumAllowedTransfers() {
      return numAllowedTransfers_;
    }
    /**
     * <code>int64 num_allowed_transfers = 3 [json_name = "numAllowedTransfers"];</code>
     * @param value The numAllowedTransfers to set.
     * @return This builder for chaining.
     */
    public Builder setNumAllowedTransfers(long value) {

      numAllowedTransfers_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_allowed_transfers = 3 [json_name = "numAllowedTransfers"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumAllowedTransfers() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numAllowedTransfers_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:starnamed.x.escrow.v1beta1.TestObject)
  }

  // @@protoc_insertion_point(class_scope:starnamed.x.escrow.v1beta1.TestObject)
  private static final com.starnamed.x.escrow.v1beta1.TestObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.starnamed.x.escrow.v1beta1.TestObject();
  }

  public static com.starnamed.x.escrow.v1beta1.TestObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestObject>
      PARSER = new com.google.protobuf.AbstractParser<TestObject>() {
    @java.lang.Override
    public TestObject parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestObject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.starnamed.x.escrow.v1beta1.TestObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

