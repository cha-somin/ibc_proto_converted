// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thorchain/v1/x/thorchain/types/type_tss_keysign.proto

package com.types;

public final class TypeTssKeysignProto {
  private TypeTssKeysignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TssKeysignFailVoterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.TssKeysignFailVoter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>int64 height = 4 [json_name = "height"];</code>
     * @return The height.
     */
    long getHeight();

    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @return A list containing the signers.
     */
    java.util.List<java.lang.String>
        getSignersList();
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @return The count of signers.
     */
    int getSignersCount();
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    java.lang.String getSigners(int index);
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    com.google.protobuf.ByteString
        getSignersBytes(int index);

    /**
     * <code>int64 round7_count = 7 [json_name = "round7Count"];</code>
     * @return The round7Count.
     */
    long getRound7Count();
  }
  /**
   * Protobuf type {@code types.TssKeysignFailVoter}
   */
  public static final class TssKeysignFailVoter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.TssKeysignFailVoter)
      TssKeysignFailVoterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TssKeysignFailVoter.newBuilder() to construct.
    private TssKeysignFailVoter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TssKeysignFailVoter() {
      id_ = "";
      signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TssKeysignFailVoter();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.types.TypeTssKeysignProto.internal_static_types_TssKeysignFailVoter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.types.TypeTssKeysignProto.internal_static_types_TssKeysignFailVoter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.types.TypeTssKeysignProto.TssKeysignFailVoter.class, com.types.TypeTssKeysignProto.TssKeysignFailVoter.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HEIGHT_FIELD_NUMBER = 4;
    private long height_ = 0L;
    /**
     * <code>int64 height = 4 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }

    public static final int SIGNERS_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @return A list containing the signers.
     */
    public com.google.protobuf.ProtocolStringList
        getSignersList() {
      return signers_;
    }
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @return The count of signers.
     */
    public int getSignersCount() {
      return signers_.size();
    }
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    public java.lang.String getSigners(int index) {
      return signers_.get(index);
    }
    /**
     * <code>repeated string signers = 6 [json_name = "signers"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    public com.google.protobuf.ByteString
        getSignersBytes(int index) {
      return signers_.getByteString(index);
    }

    public static final int ROUND7_COUNT_FIELD_NUMBER = 7;
    private long round7Count_ = 0L;
    /**
     * <code>int64 round7_count = 7 [json_name = "round7Count"];</code>
     * @return The round7Count.
     */
    @java.lang.Override
    public long getRound7Count() {
      return round7Count_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (height_ != 0L) {
        output.writeInt64(4, height_);
      }
      for (int i = 0; i < signers_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, signers_.getRaw(i));
      }
      if (round7Count_ != 0L) {
        output.writeInt64(7, round7Count_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (height_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, height_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < signers_.size(); i++) {
          dataSize += computeStringSizeNoTag(signers_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getSignersList().size();
      }
      if (round7Count_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, round7Count_);
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
      if (!(obj instanceof com.types.TypeTssKeysignProto.TssKeysignFailVoter)) {
        return super.equals(obj);
      }
      com.types.TypeTssKeysignProto.TssKeysignFailVoter other = (com.types.TypeTssKeysignProto.TssKeysignFailVoter) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (getHeight()
          != other.getHeight()) return false;
      if (!getSignersList()
          .equals(other.getSignersList())) return false;
      if (getRound7Count()
          != other.getRound7Count()) return false;
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
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeight());
      if (getSignersCount() > 0) {
        hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
        hash = (53 * hash) + getSignersList().hashCode();
      }
      hash = (37 * hash) + ROUND7_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRound7Count());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter parseFrom(
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
    public static Builder newBuilder(com.types.TypeTssKeysignProto.TssKeysignFailVoter prototype) {
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
     * Protobuf type {@code types.TssKeysignFailVoter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.TssKeysignFailVoter)
        com.types.TypeTssKeysignProto.TssKeysignFailVoterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.types.TypeTssKeysignProto.internal_static_types_TssKeysignFailVoter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.types.TypeTssKeysignProto.internal_static_types_TssKeysignFailVoter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.types.TypeTssKeysignProto.TssKeysignFailVoter.class, com.types.TypeTssKeysignProto.TssKeysignFailVoter.Builder.class);
      }

      // Construct using com.types.TypeTssKeysignProto.TssKeysignFailVoter.newBuilder()
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
        id_ = "";
        height_ = 0L;
        signers_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        round7Count_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.types.TypeTssKeysignProto.internal_static_types_TssKeysignFailVoter_descriptor;
      }

      @java.lang.Override
      public com.types.TypeTssKeysignProto.TssKeysignFailVoter getDefaultInstanceForType() {
        return com.types.TypeTssKeysignProto.TssKeysignFailVoter.getDefaultInstance();
      }

      @java.lang.Override
      public com.types.TypeTssKeysignProto.TssKeysignFailVoter build() {
        com.types.TypeTssKeysignProto.TssKeysignFailVoter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.types.TypeTssKeysignProto.TssKeysignFailVoter buildPartial() {
        com.types.TypeTssKeysignProto.TssKeysignFailVoter result = new com.types.TypeTssKeysignProto.TssKeysignFailVoter(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.types.TypeTssKeysignProto.TssKeysignFailVoter result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.height_ = height_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          signers_.makeImmutable();
          result.signers_ = signers_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.round7Count_ = round7Count_;
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
        if (other instanceof com.types.TypeTssKeysignProto.TssKeysignFailVoter) {
          return mergeFrom((com.types.TypeTssKeysignProto.TssKeysignFailVoter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.types.TypeTssKeysignProto.TssKeysignFailVoter other) {
        if (other == com.types.TypeTssKeysignProto.TssKeysignFailVoter.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getHeight() != 0L) {
          setHeight(other.getHeight());
        }
        if (!other.signers_.isEmpty()) {
          if (signers_.isEmpty()) {
            signers_ = other.signers_;
            bitField0_ |= 0x00000004;
          } else {
            ensureSignersIsMutable();
            signers_.addAll(other.signers_);
          }
          onChanged();
        }
        if (other.getRound7Count() != 0L) {
          setRound7Count(other.getRound7Count());
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
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 32: {
                height_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 50: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureSignersIsMutable();
                signers_.add(s);
                break;
              } // case 50
              case 56: {
                round7Count_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 56
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

      private java.lang.Object id_ = "";
      /**
       * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
       * @return The id.
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
       * @return The bytes for id.
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        id_ = getDefaultInstance().getId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long height_ ;
      /**
       * <code>int64 height = 4 [json_name = "height"];</code>
       * @return The height.
       */
      @java.lang.Override
      public long getHeight() {
        return height_;
      }
      /**
       * <code>int64 height = 4 [json_name = "height"];</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(long value) {

        height_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int64 height = 4 [json_name = "height"];</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000002);
        height_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureSignersIsMutable() {
        if (!signers_.isModifiable()) {
          signers_ = new com.google.protobuf.LazyStringArrayList(signers_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @return A list containing the signers.
       */
      public com.google.protobuf.ProtocolStringList
          getSignersList() {
        signers_.makeImmutable();
        return signers_;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @return The count of signers.
       */
      public int getSignersCount() {
        return signers_.size();
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param index The index of the element to return.
       * @return The signers at the given index.
       */
      public java.lang.String getSigners(int index) {
        return signers_.get(index);
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param index The index of the value to return.
       * @return The bytes of the signers at the given index.
       */
      public com.google.protobuf.ByteString
          getSignersBytes(int index) {
        return signers_.getByteString(index);
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param index The index to set the value at.
       * @param value The signers to set.
       * @return This builder for chaining.
       */
      public Builder setSigners(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureSignersIsMutable();
        signers_.set(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param value The signers to add.
       * @return This builder for chaining.
       */
      public Builder addSigners(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureSignersIsMutable();
        signers_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param values The signers to add.
       * @return This builder for chaining.
       */
      public Builder addAllSigners(
          java.lang.Iterable<java.lang.String> values) {
        ensureSignersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, signers_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @return This builder for chaining.
       */
      public Builder clearSigners() {
        signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string signers = 6 [json_name = "signers"];</code>
       * @param value The bytes of the signers to add.
       * @return This builder for chaining.
       */
      public Builder addSignersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureSignersIsMutable();
        signers_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private long round7Count_ ;
      /**
       * <code>int64 round7_count = 7 [json_name = "round7Count"];</code>
       * @return The round7Count.
       */
      @java.lang.Override
      public long getRound7Count() {
        return round7Count_;
      }
      /**
       * <code>int64 round7_count = 7 [json_name = "round7Count"];</code>
       * @param value The round7Count to set.
       * @return This builder for chaining.
       */
      public Builder setRound7Count(long value) {

        round7Count_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int64 round7_count = 7 [json_name = "round7Count"];</code>
       * @return This builder for chaining.
       */
      public Builder clearRound7Count() {
        bitField0_ = (bitField0_ & ~0x00000008);
        round7Count_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:types.TssKeysignFailVoter)
    }

    // @@protoc_insertion_point(class_scope:types.TssKeysignFailVoter)
    private static final com.types.TypeTssKeysignProto.TssKeysignFailVoter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.types.TypeTssKeysignProto.TssKeysignFailVoter();
    }

    public static com.types.TypeTssKeysignProto.TssKeysignFailVoter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TssKeysignFailVoter>
        PARSER = new com.google.protobuf.AbstractParser<TssKeysignFailVoter>() {
      @java.lang.Override
      public TssKeysignFailVoter parsePartialFrom(
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

    public static com.google.protobuf.Parser<TssKeysignFailVoter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TssKeysignFailVoter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.types.TypeTssKeysignProto.TssKeysignFailVoter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_TssKeysignFailVoter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_TssKeysignFailVoter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5thorchain/v1/x/thorchain/types/type_ts" +
      "s_keysign.proto\022\005types\032\024gogoproto/gogo.p" +
      "roto\"\202\001\n\023TssKeysignFailVoter\022\026\n\002id\030\001 \001(\t" +
      "B\006\342\336\037\002IDR\002id\022\026\n\006height\030\004 \001(\003R\006height\022\030\n\007" +
      "signers\030\006 \003(\tR\007signers\022!\n\014round7_count\030\007" +
      " \001(\003R\013round7CountB\217\001\n\tcom.typesB\023TypeTss" +
      "KeysignProtoZ/gitlab.com/thorchain/thorn" +
      "ode/x/thorchain/types\242\002\003TXX\252\002\005Types\312\002\005Ty" +
      "pes\342\002\021Types\\GPBMetadata\352\002\005Types\310\341\036\000\330\341\036\000\200" +
      "\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_types_TssKeysignFailVoter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_TssKeysignFailVoter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_TssKeysignFailVoter_descriptor,
        new java.lang.String[] { "Id", "Height", "Signers", "Round7Count", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringerAll);
    registry.add(com.gogoproto.GogoProto.stringerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
