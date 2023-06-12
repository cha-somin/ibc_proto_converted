// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v3/solomachine.proto

package com.ibc.lightclients.solomachine.v3;

/**
 * <pre>
 * ConsensusState defines a solo machine consensus state. The sequence of a
 * consensus state is contained in the "height" key used in storing the
 * consensus state.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v3.ConsensusState}
 */
public final class ConsensusState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v3.ConsensusState)
    ConsensusStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusState.newBuilder() to construct.
  private ConsensusState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusState() {
    diversifier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsensusState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.lightclients.solomachine.v3.SolomachineProto.internal_static_ibc_lightclients_solomachine_v3_ConsensusState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.lightclients.solomachine.v3.SolomachineProto.internal_static_ibc_lightclients_solomachine_v3_ConsensusState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.lightclients.solomachine.v3.ConsensusState.class, com.ibc.lightclients.solomachine.v3.ConsensusState.Builder.class);
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.Any publicKey_;
  /**
   * <pre>
   * public key of the solo machine
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return Whether the publicKey field is set.
   */
  @java.lang.Override
  public boolean hasPublicKey() {
    return publicKey_ != null;
  }
  /**
   * <pre>
   * public key of the solo machine
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public com.google.protobuf.Any getPublicKey() {
    return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
  }
  /**
   * <pre>
   * public key of the solo machine
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getPublicKeyOrBuilder() {
    return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
  }

  public static final int DIVERSIFIER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object diversifier_ = "";
  /**
   * <pre>
   * diversifier allows the same public key to be re-used across different solo
   * machine clients (potentially on different chains) without being considered
   * misbehaviour.
   * </pre>
   *
   * <code>string diversifier = 2 [json_name = "diversifier"];</code>
   * @return The diversifier.
   */
  @java.lang.Override
  public java.lang.String getDiversifier() {
    java.lang.Object ref = diversifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diversifier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * diversifier allows the same public key to be re-used across different solo
   * machine clients (potentially on different chains) without being considered
   * misbehaviour.
   * </pre>
   *
   * <code>string diversifier = 2 [json_name = "diversifier"];</code>
   * @return The bytes for diversifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiversifierBytes() {
    java.lang.Object ref = diversifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diversifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_ = 0L;
  /**
   * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (publicKey_ != null) {
      output.writeMessage(1, getPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diversifier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diversifier_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(3, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (publicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diversifier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diversifier_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, timestamp_);
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
    if (!(obj instanceof com.ibc.lightclients.solomachine.v3.ConsensusState)) {
      return super.equals(obj);
    }
    com.ibc.lightclients.solomachine.v3.ConsensusState other = (com.ibc.lightclients.solomachine.v3.ConsensusState) obj;

    if (hasPublicKey() != other.hasPublicKey()) return false;
    if (hasPublicKey()) {
      if (!getPublicKey()
          .equals(other.getPublicKey())) return false;
    }
    if (!getDiversifier()
        .equals(other.getDiversifier())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    if (hasPublicKey()) {
      hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPublicKey().hashCode();
    }
    hash = (37 * hash) + DIVERSIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getDiversifier().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v3.ConsensusState parseFrom(
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
  public static Builder newBuilder(com.ibc.lightclients.solomachine.v3.ConsensusState prototype) {
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
   * ConsensusState defines a solo machine consensus state. The sequence of a
   * consensus state is contained in the "height" key used in storing the
   * consensus state.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v3.ConsensusState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v3.ConsensusState)
      com.ibc.lightclients.solomachine.v3.ConsensusStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.lightclients.solomachine.v3.SolomachineProto.internal_static_ibc_lightclients_solomachine_v3_ConsensusState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.lightclients.solomachine.v3.SolomachineProto.internal_static_ibc_lightclients_solomachine_v3_ConsensusState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.lightclients.solomachine.v3.ConsensusState.class, com.ibc.lightclients.solomachine.v3.ConsensusState.Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v3.ConsensusState.newBuilder()
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
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      diversifier_ = "";
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.lightclients.solomachine.v3.SolomachineProto.internal_static_ibc_lightclients_solomachine_v3_ConsensusState_descriptor;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v3.ConsensusState getDefaultInstanceForType() {
      return com.ibc.lightclients.solomachine.v3.ConsensusState.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v3.ConsensusState build() {
      com.ibc.lightclients.solomachine.v3.ConsensusState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v3.ConsensusState buildPartial() {
      com.ibc.lightclients.solomachine.v3.ConsensusState result = new com.ibc.lightclients.solomachine.v3.ConsensusState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.lightclients.solomachine.v3.ConsensusState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publicKey_ = publicKeyBuilder_ == null
            ? publicKey_
            : publicKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diversifier_ = diversifier_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestamp_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.lightclients.solomachine.v3.ConsensusState) {
        return mergeFrom((com.ibc.lightclients.solomachine.v3.ConsensusState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.lightclients.solomachine.v3.ConsensusState other) {
      if (other == com.ibc.lightclients.solomachine.v3.ConsensusState.getDefaultInstance()) return this;
      if (other.hasPublicKey()) {
        mergePublicKey(other.getPublicKey());
      }
      if (!other.getDiversifier().isEmpty()) {
        diversifier_ = other.diversifier_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              input.readMessage(
                  getPublicKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              diversifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              timestamp_ = input.readUInt64();
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

    private com.google.protobuf.Any publicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> publicKeyBuilder_;
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     * @return Whether the publicKey field is set.
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     * @return The publicKey.
     */
    public com.google.protobuf.Any getPublicKey() {
      if (publicKeyBuilder_ == null) {
        return publicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : publicKey_;
      } else {
        return publicKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(com.google.protobuf.Any value) {
      if (publicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        publicKey_ = value;
      } else {
        publicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(
        com.google.protobuf.Any.Builder builderForValue) {
      if (publicKeyBuilder_ == null) {
        publicKey_ = builderForValue.build();
      } else {
        publicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder mergePublicKey(com.google.protobuf.Any value) {
      if (publicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          publicKey_ != null &&
          publicKey_ != com.google.protobuf.Any.getDefaultInstance()) {
          getPublicKeyBuilder().mergeFrom(value);
        } else {
          publicKey_ = value;
        }
      } else {
        publicKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public Builder clearPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public com.google.protobuf.Any.Builder getPublicKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getPublicKeyOrBuilder() {
      if (publicKeyBuilder_ != null) {
        return publicKeyBuilder_.getMessageOrBuilder();
      } else {
        return publicKey_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : publicKey_;
      }
    }
    /**
     * <pre>
     * public key of the solo machine
     * </pre>
     *
     * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getPublicKeyFieldBuilder() {
      if (publicKeyBuilder_ == null) {
        publicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getPublicKey(),
                getParentForChildren(),
                isClean());
        publicKey_ = null;
      }
      return publicKeyBuilder_;
    }

    private java.lang.Object diversifier_ = "";
    /**
     * <pre>
     * diversifier allows the same public key to be re-used across different solo
     * machine clients (potentially on different chains) without being considered
     * misbehaviour.
     * </pre>
     *
     * <code>string diversifier = 2 [json_name = "diversifier"];</code>
     * @return The diversifier.
     */
    public java.lang.String getDiversifier() {
      java.lang.Object ref = diversifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diversifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * diversifier allows the same public key to be re-used across different solo
     * machine clients (potentially on different chains) without being considered
     * misbehaviour.
     * </pre>
     *
     * <code>string diversifier = 2 [json_name = "diversifier"];</code>
     * @return The bytes for diversifier.
     */
    public com.google.protobuf.ByteString
        getDiversifierBytes() {
      java.lang.Object ref = diversifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diversifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * diversifier allows the same public key to be re-used across different solo
     * machine clients (potentially on different chains) without being considered
     * misbehaviour.
     * </pre>
     *
     * <code>string diversifier = 2 [json_name = "diversifier"];</code>
     * @param value The diversifier to set.
     * @return This builder for chaining.
     */
    public Builder setDiversifier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      diversifier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diversifier allows the same public key to be re-used across different solo
     * machine clients (potentially on different chains) without being considered
     * misbehaviour.
     * </pre>
     *
     * <code>string diversifier = 2 [json_name = "diversifier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiversifier() {
      diversifier_ = getDefaultInstance().getDiversifier();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diversifier allows the same public key to be re-used across different solo
     * machine clients (potentially on different chains) without being considered
     * misbehaviour.
     * </pre>
     *
     * <code>string diversifier = 2 [json_name = "diversifier"];</code>
     * @param value The bytes for diversifier to set.
     * @return This builder for chaining.
     */
    public Builder setDiversifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      diversifier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 3 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v3.ConsensusState)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v3.ConsensusState)
  private static final com.ibc.lightclients.solomachine.v3.ConsensusState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.lightclients.solomachine.v3.ConsensusState();
  }

  public static com.ibc.lightclients.solomachine.v3.ConsensusState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusState>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusState>() {
    @java.lang.Override
    public ConsensusState parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConsensusState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.lightclients.solomachine.v3.ConsensusState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

