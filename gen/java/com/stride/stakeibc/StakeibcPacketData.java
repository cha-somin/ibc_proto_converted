// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/packet.proto

package com.stride.stakeibc;

/**
 * Protobuf type {@code stride.stakeibc.StakeibcPacketData}
 */
public final class StakeibcPacketData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.stakeibc.StakeibcPacketData)
    StakeibcPacketDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StakeibcPacketData.newBuilder() to construct.
  private StakeibcPacketData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StakeibcPacketData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StakeibcPacketData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.stakeibc.PacketProto.internal_static_stride_stakeibc_StakeibcPacketData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.stakeibc.PacketProto.internal_static_stride_stakeibc_StakeibcPacketData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.stakeibc.StakeibcPacketData.class, com.stride.stakeibc.StakeibcPacketData.Builder.class);
  }

  private int packetCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object packet_;
  public enum PacketCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NO_DATA(1),
    PACKET_NOT_SET(0);
    private final int value;
    private PacketCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PacketCase valueOf(int value) {
      return forNumber(value);
    }

    public static PacketCase forNumber(int value) {
      switch (value) {
        case 1: return NO_DATA;
        case 0: return PACKET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PacketCase
  getPacketCase() {
    return PacketCase.forNumber(
        packetCase_);
  }

  public static final int NO_DATA_FIELD_NUMBER = 1;
  /**
   * <pre>
   * this line is used by starport scaffolding # ibc/packet/proto/field
   * </pre>
   *
   * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
   * @return Whether the noData field is set.
   */
  @java.lang.Override
  public boolean hasNoData() {
    return packetCase_ == 1;
  }
  /**
   * <pre>
   * this line is used by starport scaffolding # ibc/packet/proto/field
   * </pre>
   *
   * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
   * @return The noData.
   */
  @java.lang.Override
  public com.stride.stakeibc.NoData getNoData() {
    if (packetCase_ == 1) {
       return (com.stride.stakeibc.NoData) packet_;
    }
    return com.stride.stakeibc.NoData.getDefaultInstance();
  }
  /**
   * <pre>
   * this line is used by starport scaffolding # ibc/packet/proto/field
   * </pre>
   *
   * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
   */
  @java.lang.Override
  public com.stride.stakeibc.NoDataOrBuilder getNoDataOrBuilder() {
    if (packetCase_ == 1) {
       return (com.stride.stakeibc.NoData) packet_;
    }
    return com.stride.stakeibc.NoData.getDefaultInstance();
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
    if (packetCase_ == 1) {
      output.writeMessage(1, (com.stride.stakeibc.NoData) packet_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (packetCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.stride.stakeibc.NoData) packet_);
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
    if (!(obj instanceof com.stride.stakeibc.StakeibcPacketData)) {
      return super.equals(obj);
    }
    com.stride.stakeibc.StakeibcPacketData other = (com.stride.stakeibc.StakeibcPacketData) obj;

    if (!getPacketCase().equals(other.getPacketCase())) return false;
    switch (packetCase_) {
      case 1:
        if (!getNoData()
            .equals(other.getNoData())) return false;
        break;
      case 0:
      default:
    }
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
    switch (packetCase_) {
      case 1:
        hash = (37 * hash) + NO_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getNoData().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.stakeibc.StakeibcPacketData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.stakeibc.StakeibcPacketData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.StakeibcPacketData parseFrom(
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
  public static Builder newBuilder(com.stride.stakeibc.StakeibcPacketData prototype) {
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
   * Protobuf type {@code stride.stakeibc.StakeibcPacketData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.stakeibc.StakeibcPacketData)
      com.stride.stakeibc.StakeibcPacketDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.PacketProto.internal_static_stride_stakeibc_StakeibcPacketData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.PacketProto.internal_static_stride_stakeibc_StakeibcPacketData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.StakeibcPacketData.class, com.stride.stakeibc.StakeibcPacketData.Builder.class);
    }

    // Construct using com.stride.stakeibc.StakeibcPacketData.newBuilder()
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
      if (noDataBuilder_ != null) {
        noDataBuilder_.clear();
      }
      packetCase_ = 0;
      packet_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.stakeibc.PacketProto.internal_static_stride_stakeibc_StakeibcPacketData_descriptor;
    }

    @java.lang.Override
    public com.stride.stakeibc.StakeibcPacketData getDefaultInstanceForType() {
      return com.stride.stakeibc.StakeibcPacketData.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.stakeibc.StakeibcPacketData build() {
      com.stride.stakeibc.StakeibcPacketData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.stakeibc.StakeibcPacketData buildPartial() {
      com.stride.stakeibc.StakeibcPacketData result = new com.stride.stakeibc.StakeibcPacketData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.stakeibc.StakeibcPacketData result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.stride.stakeibc.StakeibcPacketData result) {
      result.packetCase_ = packetCase_;
      result.packet_ = this.packet_;
      if (packetCase_ == 1 &&
          noDataBuilder_ != null) {
        result.packet_ = noDataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.stakeibc.StakeibcPacketData) {
        return mergeFrom((com.stride.stakeibc.StakeibcPacketData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.stakeibc.StakeibcPacketData other) {
      if (other == com.stride.stakeibc.StakeibcPacketData.getDefaultInstance()) return this;
      switch (other.getPacketCase()) {
        case NO_DATA: {
          mergeNoData(other.getNoData());
          break;
        }
        case PACKET_NOT_SET: {
          break;
        }
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
                  getNoDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              packetCase_ = 1;
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
    private int packetCase_ = 0;
    private java.lang.Object packet_;
    public PacketCase
        getPacketCase() {
      return PacketCase.forNumber(
          packetCase_);
    }

    public Builder clearPacket() {
      packetCase_ = 0;
      packet_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.stakeibc.NoData, com.stride.stakeibc.NoData.Builder, com.stride.stakeibc.NoDataOrBuilder> noDataBuilder_;
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     * @return Whether the noData field is set.
     */
    @java.lang.Override
    public boolean hasNoData() {
      return packetCase_ == 1;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     * @return The noData.
     */
    @java.lang.Override
    public com.stride.stakeibc.NoData getNoData() {
      if (noDataBuilder_ == null) {
        if (packetCase_ == 1) {
          return (com.stride.stakeibc.NoData) packet_;
        }
        return com.stride.stakeibc.NoData.getDefaultInstance();
      } else {
        if (packetCase_ == 1) {
          return noDataBuilder_.getMessage();
        }
        return com.stride.stakeibc.NoData.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    public Builder setNoData(com.stride.stakeibc.NoData value) {
      if (noDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        packet_ = value;
        onChanged();
      } else {
        noDataBuilder_.setMessage(value);
      }
      packetCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    public Builder setNoData(
        com.stride.stakeibc.NoData.Builder builderForValue) {
      if (noDataBuilder_ == null) {
        packet_ = builderForValue.build();
        onChanged();
      } else {
        noDataBuilder_.setMessage(builderForValue.build());
      }
      packetCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    public Builder mergeNoData(com.stride.stakeibc.NoData value) {
      if (noDataBuilder_ == null) {
        if (packetCase_ == 1 &&
            packet_ != com.stride.stakeibc.NoData.getDefaultInstance()) {
          packet_ = com.stride.stakeibc.NoData.newBuilder((com.stride.stakeibc.NoData) packet_)
              .mergeFrom(value).buildPartial();
        } else {
          packet_ = value;
        }
        onChanged();
      } else {
        if (packetCase_ == 1) {
          noDataBuilder_.mergeFrom(value);
        } else {
          noDataBuilder_.setMessage(value);
        }
      }
      packetCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    public Builder clearNoData() {
      if (noDataBuilder_ == null) {
        if (packetCase_ == 1) {
          packetCase_ = 0;
          packet_ = null;
          onChanged();
        }
      } else {
        if (packetCase_ == 1) {
          packetCase_ = 0;
          packet_ = null;
        }
        noDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    public com.stride.stakeibc.NoData.Builder getNoDataBuilder() {
      return getNoDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    @java.lang.Override
    public com.stride.stakeibc.NoDataOrBuilder getNoDataOrBuilder() {
      if ((packetCase_ == 1) && (noDataBuilder_ != null)) {
        return noDataBuilder_.getMessageOrBuilder();
      } else {
        if (packetCase_ == 1) {
          return (com.stride.stakeibc.NoData) packet_;
        }
        return com.stride.stakeibc.NoData.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * this line is used by starport scaffolding # ibc/packet/proto/field
     * </pre>
     *
     * <code>.stride.stakeibc.NoData no_data = 1 [json_name = "noData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stride.stakeibc.NoData, com.stride.stakeibc.NoData.Builder, com.stride.stakeibc.NoDataOrBuilder> 
        getNoDataFieldBuilder() {
      if (noDataBuilder_ == null) {
        if (!(packetCase_ == 1)) {
          packet_ = com.stride.stakeibc.NoData.getDefaultInstance();
        }
        noDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stride.stakeibc.NoData, com.stride.stakeibc.NoData.Builder, com.stride.stakeibc.NoDataOrBuilder>(
                (com.stride.stakeibc.NoData) packet_,
                getParentForChildren(),
                isClean());
        packet_ = null;
      }
      packetCase_ = 1;
      onChanged();
      return noDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:stride.stakeibc.StakeibcPacketData)
  }

  // @@protoc_insertion_point(class_scope:stride.stakeibc.StakeibcPacketData)
  private static final com.stride.stakeibc.StakeibcPacketData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.stakeibc.StakeibcPacketData();
  }

  public static com.stride.stakeibc.StakeibcPacketData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StakeibcPacketData>
      PARSER = new com.google.protobuf.AbstractParser<StakeibcPacketData>() {
    @java.lang.Override
    public StakeibcPacketData parsePartialFrom(
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

  public static com.google.protobuf.Parser<StakeibcPacketData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StakeibcPacketData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.stakeibc.StakeibcPacketData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

