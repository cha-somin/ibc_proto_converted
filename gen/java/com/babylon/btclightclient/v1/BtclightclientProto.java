// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: babylon/btclightclient/v1/btclightclient.proto

package com.babylon.btclightclient.v1;

public final class BtclightclientProto {
  private BtclightclientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BTCHeaderInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:babylon.btclightclient.v1.BTCHeaderInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes header = 1 [json_name = "header", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderBytes"];</code>
     * @return The header.
     */
    com.google.protobuf.ByteString getHeader();

    /**
     * <code>bytes hash = 2 [json_name = "hash", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderHashBytes"];</code>
     * @return The hash.
     */
    com.google.protobuf.ByteString getHash();

    /**
     * <code>uint32 height = 3 [json_name = "height"];</code>
     * @return The height.
     */
    int getHeight();

    /**
     * <code>bytes work = 4 [json_name = "work", (.gogoproto.customtype) = "cosmossdk.io/math.Uint"];</code>
     * @return The work.
     */
    com.google.protobuf.ByteString getWork();
  }
  /**
   * <pre>
   * BTCHeaderInfo is a structure that contains all relevant information about a
   * BTC header
   *  - Full header bytes
   *  - Header hash for easy retrieval
   *  - Height of the header in the BTC chain
   *  - Total work spent on the header. This is the sum of the work corresponding
   *  to the header Bits field
   *    and the total work of the header.
   * </pre>
   *
   * Protobuf type {@code babylon.btclightclient.v1.BTCHeaderInfo}
   */
  public static final class BTCHeaderInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:babylon.btclightclient.v1.BTCHeaderInfo)
      BTCHeaderInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BTCHeaderInfo.newBuilder() to construct.
    private BTCHeaderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BTCHeaderInfo() {
      header_ = com.google.protobuf.ByteString.EMPTY;
      hash_ = com.google.protobuf.ByteString.EMPTY;
      work_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BTCHeaderInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.babylon.btclightclient.v1.BtclightclientProto.internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.babylon.btclightclient.v1.BtclightclientProto.internal_static_babylon_btclightclient_v1_BTCHeaderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.class, com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.Builder.class);
    }

    public static final int HEADER_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString header_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes header = 1 [json_name = "header", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderBytes"];</code>
     * @return The header.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHeader() {
      return header_;
    }

    public static final int HASH_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash = 2 [json_name = "hash", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderHashBytes"];</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 3;
    private int height_ = 0;
    /**
     * <code>uint32 height = 3 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }

    public static final int WORK_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString work_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes work = 4 [json_name = "work", (.gogoproto.customtype) = "cosmossdk.io/math.Uint"];</code>
     * @return The work.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWork() {
      return work_;
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
      if (!header_.isEmpty()) {
        output.writeBytes(1, header_);
      }
      if (!hash_.isEmpty()) {
        output.writeBytes(2, hash_);
      }
      if (height_ != 0) {
        output.writeUInt32(3, height_);
      }
      if (!work_.isEmpty()) {
        output.writeBytes(4, work_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!header_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, header_);
      }
      if (!hash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, hash_);
      }
      if (height_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, height_);
      }
      if (!work_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, work_);
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
      if (!(obj instanceof com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo)) {
        return super.equals(obj);
      }
      com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo other = (com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo) obj;

      if (!getHeader()
          .equals(other.getHeader())) return false;
      if (!getHash()
          .equals(other.getHash())) return false;
      if (getHeight()
          != other.getHeight()) return false;
      if (!getWork()
          .equals(other.getWork())) return false;
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
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
      hash = (37 * hash) + HASH_FIELD_NUMBER;
      hash = (53 * hash) + getHash().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight();
      hash = (37 * hash) + WORK_FIELD_NUMBER;
      hash = (53 * hash) + getWork().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo parseFrom(
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
    public static Builder newBuilder(com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo prototype) {
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
     * BTCHeaderInfo is a structure that contains all relevant information about a
     * BTC header
     *  - Full header bytes
     *  - Header hash for easy retrieval
     *  - Height of the header in the BTC chain
     *  - Total work spent on the header. This is the sum of the work corresponding
     *  to the header Bits field
     *    and the total work of the header.
     * </pre>
     *
     * Protobuf type {@code babylon.btclightclient.v1.BTCHeaderInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:babylon.btclightclient.v1.BTCHeaderInfo)
        com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.babylon.btclightclient.v1.BtclightclientProto.internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.babylon.btclightclient.v1.BtclightclientProto.internal_static_babylon_btclightclient_v1_BTCHeaderInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.class, com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.Builder.class);
      }

      // Construct using com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.newBuilder()
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
        header_ = com.google.protobuf.ByteString.EMPTY;
        hash_ = com.google.protobuf.ByteString.EMPTY;
        height_ = 0;
        work_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.babylon.btclightclient.v1.BtclightclientProto.internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor;
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo getDefaultInstanceForType() {
        return com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo build() {
        com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo buildPartial() {
        com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo result = new com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.header_ = header_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hash_ = hash_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.height_ = height_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.work_ = work_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo) {
          return mergeFrom((com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo other) {
        if (other == com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo.getDefaultInstance()) return this;
        if (other.getHeader() != com.google.protobuf.ByteString.EMPTY) {
          setHeader(other.getHeader());
        }
        if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
          setHash(other.getHash());
        }
        if (other.getHeight() != 0) {
          setHeight(other.getHeight());
        }
        if (other.getWork() != com.google.protobuf.ByteString.EMPTY) {
          setWork(other.getWork());
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
                header_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                hash_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                height_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                work_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private com.google.protobuf.ByteString header_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes header = 1 [json_name = "header", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderBytes"];</code>
       * @return The header.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getHeader() {
        return header_;
      }
      /**
       * <code>bytes header = 1 [json_name = "header", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderBytes"];</code>
       * @param value The header to set.
       * @return This builder for chaining.
       */
      public Builder setHeader(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        header_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes header = 1 [json_name = "header", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderBytes"];</code>
       * @return This builder for chaining.
       */
      public Builder clearHeader() {
        bitField0_ = (bitField0_ & ~0x00000001);
        header_ = getDefaultInstance().getHeader();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes hash = 2 [json_name = "hash", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderHashBytes"];</code>
       * @return The hash.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getHash() {
        return hash_;
      }
      /**
       * <code>bytes hash = 2 [json_name = "hash", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderHashBytes"];</code>
       * @param value The hash to set.
       * @return This builder for chaining.
       */
      public Builder setHash(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        hash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes hash = 2 [json_name = "hash", (.gogoproto.customtype) = "github.com/babylonlabs-io/babylon/types.BTCHeaderHashBytes"];</code>
       * @return This builder for chaining.
       */
      public Builder clearHash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hash_ = getDefaultInstance().getHash();
        onChanged();
        return this;
      }

      private int height_ ;
      /**
       * <code>uint32 height = 3 [json_name = "height"];</code>
       * @return The height.
       */
      @java.lang.Override
      public int getHeight() {
        return height_;
      }
      /**
       * <code>uint32 height = 3 [json_name = "height"];</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(int value) {

        height_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 height = 3 [json_name = "height"];</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000004);
        height_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString work_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes work = 4 [json_name = "work", (.gogoproto.customtype) = "cosmossdk.io/math.Uint"];</code>
       * @return The work.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getWork() {
        return work_;
      }
      /**
       * <code>bytes work = 4 [json_name = "work", (.gogoproto.customtype) = "cosmossdk.io/math.Uint"];</code>
       * @param value The work to set.
       * @return This builder for chaining.
       */
      public Builder setWork(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        work_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bytes work = 4 [json_name = "work", (.gogoproto.customtype) = "cosmossdk.io/math.Uint"];</code>
       * @return This builder for chaining.
       */
      public Builder clearWork() {
        bitField0_ = (bitField0_ & ~0x00000008);
        work_ = getDefaultInstance().getWork();
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


      // @@protoc_insertion_point(builder_scope:babylon.btclightclient.v1.BTCHeaderInfo)
    }

    // @@protoc_insertion_point(class_scope:babylon.btclightclient.v1.BTCHeaderInfo)
    private static final com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo();
    }

    public static com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BTCHeaderInfo>
        PARSER = new com.google.protobuf.AbstractParser<BTCHeaderInfo>() {
      @java.lang.Override
      public BTCHeaderInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BTCHeaderInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BTCHeaderInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.babylon.btclightclient.v1.BtclightclientProto.BTCHeaderInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_babylon_btclightclient_v1_BTCHeaderInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.babylon/btclightclient/v1/btclightclie" +
      "nt.proto\022\031babylon.btclightclient.v1\032\024gog" +
      "oproto/gogo.proto\"\377\001\n\rBTCHeaderInfo\022R\n\006h" +
      "eader\030\001 \001(\014B:\332\336\0376github.com/babylonlabs-" +
      "io/babylon/types.BTCHeaderBytesR\006header\022" +
      "R\n\004hash\030\002 \001(\014B>\332\336\037:github.com/babylonlab" +
      "s-io/babylon/types.BTCHeaderHashBytesR\004h" +
      "ash\022\026\n\006height\030\003 \001(\rR\006height\022.\n\004work\030\004 \001(" +
      "\014B\032\332\336\037\026cosmossdk.io/math.UintR\004workB\362\001\n\035" +
      "com.babylon.btclightclient.v1B\023Btclightc" +
      "lientProtoZ8github.com/babylonlabs-io/ba" +
      "bylon/x/btclightclient/types\242\002\003BBX\252\002\031Bab" +
      "ylon.Btclightclient.V1\312\002\031Babylon\\Btcligh" +
      "tclient\\V1\342\002%Babylon\\Btclightclient\\V1\\G" +
      "PBMetadata\352\002\033Babylon::Btclightclient::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_babylon_btclightclient_v1_BTCHeaderInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_babylon_btclightclient_v1_BTCHeaderInfo_descriptor,
        new java.lang.String[] { "Header", "Hash", "Height", "Work", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
