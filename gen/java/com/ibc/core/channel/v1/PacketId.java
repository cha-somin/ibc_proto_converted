// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * PacketId is an identifer for a unique Packet
 * Source chains refer to packets by source port/channel
 * Destination chains refer to packets by destination port/channel
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.PacketId}
 */
public final class PacketId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.PacketId)
    PacketIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PacketId.newBuilder() to construct.
  private PacketId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PacketId() {
    portId_ = "";
    channelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PacketId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.ChannelProto.internal_static_ibc_core_channel_v1_PacketId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.channel.v1.ChannelProto.internal_static_ibc_core_channel_v1_PacketId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.channel.v1.PacketId.class, com.ibc.core.channel.v1.PacketId.Builder.class);
  }

  public static final int PORT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object portId_ = "";
  /**
   * <pre>
   * channel port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The portId.
   */
  @java.lang.Override
  public java.lang.String getPortId() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * channel port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The bytes for portId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPortIdBytes() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      portId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object channelId_ = "";
  /**
   * <pre>
   * channel unique identifier
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * channel unique identifier
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEQUENCE_FIELD_NUMBER = 3;
  private long sequence_ = 0L;
  /**
   * <pre>
   * packet sequence
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, channelId_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(3, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, channelId_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, sequence_);
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
    if (!(obj instanceof com.ibc.core.channel.v1.PacketId)) {
      return super.equals(obj);
    }
    com.ibc.core.channel.v1.PacketId other = (com.ibc.core.channel.v1.PacketId) obj;

    if (!getPortId()
        .equals(other.getPortId())) return false;
    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (getSequence()
        != other.getSequence()) return false;
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
    hash = (37 * hash) + PORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPortId().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.channel.v1.PacketId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.core.channel.v1.PacketId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.core.channel.v1.PacketId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.PacketId parseFrom(
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
  public static Builder newBuilder(com.ibc.core.channel.v1.PacketId prototype) {
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
   * PacketId is an identifer for a unique Packet
   * Source chains refer to packets by source port/channel
   * Destination chains refer to packets by destination port/channel
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.PacketId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.PacketId)
      com.ibc.core.channel.v1.PacketIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.channel.v1.ChannelProto.internal_static_ibc_core_channel_v1_PacketId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.channel.v1.ChannelProto.internal_static_ibc_core_channel_v1_PacketId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.channel.v1.PacketId.class, com.ibc.core.channel.v1.PacketId.Builder.class);
    }

    // Construct using com.ibc.core.channel.v1.PacketId.newBuilder()
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
      portId_ = "";
      channelId_ = "";
      sequence_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.channel.v1.ChannelProto.internal_static_ibc_core_channel_v1_PacketId_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.PacketId getDefaultInstanceForType() {
      return com.ibc.core.channel.v1.PacketId.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.PacketId build() {
      com.ibc.core.channel.v1.PacketId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.PacketId buildPartial() {
      com.ibc.core.channel.v1.PacketId result = new com.ibc.core.channel.v1.PacketId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.channel.v1.PacketId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.portId_ = portId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelId_ = channelId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sequence_ = sequence_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.core.channel.v1.PacketId) {
        return mergeFrom((com.ibc.core.channel.v1.PacketId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.channel.v1.PacketId other) {
      if (other == com.ibc.core.channel.v1.PacketId.getDefaultInstance()) return this;
      if (!other.getPortId().isEmpty()) {
        portId_ = other.portId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getChannelId().isEmpty()) {
        channelId_ = other.channelId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
              portId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              channelId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              sequence_ = input.readUInt64();
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

    private java.lang.Object portId_ = "";
    /**
     * <pre>
     * channel port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The portId.
     */
    public java.lang.String getPortId() {
      java.lang.Object ref = portId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * channel port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The bytes for portId.
     */
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      java.lang.Object ref = portId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        portId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * channel port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      portId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPortId() {
      portId_ = getDefaultInstance().getPortId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The bytes for portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      portId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object channelId_ = "";
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The channelId.
     */
    public java.lang.String getChannelId() {
      java.lang.Object ref = channelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      java.lang.Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      channelId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      channelId_ = getDefaultInstance().getChannelId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel unique identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      channelId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <pre>
     * packet sequence
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * packet sequence
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * packet sequence
     * </pre>
     *
     * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sequence_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.PacketId)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.PacketId)
  private static final com.ibc.core.channel.v1.PacketId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.channel.v1.PacketId();
  }

  public static com.ibc.core.channel.v1.PacketId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PacketId>
      PARSER = new com.google.protobuf.AbstractParser<PacketId>() {
    @java.lang.Override
    public PacketId parsePartialFrom(
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

  public static com.google.protobuf.Parser<PacketId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PacketId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.channel.v1.PacketId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

