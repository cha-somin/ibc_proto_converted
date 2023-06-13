// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/offer_expire_queue.proto

package com.likechain.likenft.v1;

public final class OfferExpireQueueProto {
  private OfferExpireQueueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OfferExpireQueueEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.OfferExpireQueueEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the expireTime field is set.
     */
    boolean hasExpireTime();
    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The expireTime.
     */
    com.google.protobuf.Timestamp getExpireTime();
    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

    /**
     * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
     * @return The offerKey.
     */
    com.google.protobuf.ByteString getOfferKey();
  }
  /**
   * Protobuf type {@code likechain.likenft.v1.OfferExpireQueueEntry}
   */
  public static final class OfferExpireQueueEntry extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:likechain.likenft.v1.OfferExpireQueueEntry)
      OfferExpireQueueEntryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OfferExpireQueueEntry.newBuilder() to construct.
    private OfferExpireQueueEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OfferExpireQueueEntry() {
      offerKey_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OfferExpireQueueEntry();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.likenft.v1.OfferExpireQueueProto.internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.likenft.v1.OfferExpireQueueProto.internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.class, com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.Builder.class);
    }

    public static final int EXPIRE_TIME_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp expireTime_;
    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the expireTime field is set.
     */
    @java.lang.Override
    public boolean hasExpireTime() {
      return expireTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getExpireTime() {
      return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
    }
    /**
     * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
    }

    public static final int OFFER_KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString offerKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
     * @return The offerKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOfferKey() {
      return offerKey_;
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
      if (expireTime_ != null) {
        output.writeMessage(1, getExpireTime());
      }
      if (!offerKey_.isEmpty()) {
        output.writeBytes(2, offerKey_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (expireTime_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getExpireTime());
      }
      if (!offerKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, offerKey_);
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
      if (!(obj instanceof com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry)) {
        return super.equals(obj);
      }
      com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry other = (com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry) obj;

      if (hasExpireTime() != other.hasExpireTime()) return false;
      if (hasExpireTime()) {
        if (!getExpireTime()
            .equals(other.getExpireTime())) return false;
      }
      if (!getOfferKey()
          .equals(other.getOfferKey())) return false;
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
      if (hasExpireTime()) {
        hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getExpireTime().hashCode();
      }
      hash = (37 * hash) + OFFER_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getOfferKey().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry parseFrom(
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
    public static Builder newBuilder(com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry prototype) {
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
     * Protobuf type {@code likechain.likenft.v1.OfferExpireQueueEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:likechain.likenft.v1.OfferExpireQueueEntry)
        com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.likechain.likenft.v1.OfferExpireQueueProto.internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.likechain.likenft.v1.OfferExpireQueueProto.internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.class, com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.Builder.class);
      }

      // Construct using com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.newBuilder()
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
        expireTime_ = null;
        if (expireTimeBuilder_ != null) {
          expireTimeBuilder_.dispose();
          expireTimeBuilder_ = null;
        }
        offerKey_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.likechain.likenft.v1.OfferExpireQueueProto.internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor;
      }

      @java.lang.Override
      public com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry getDefaultInstanceForType() {
        return com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.getDefaultInstance();
      }

      @java.lang.Override
      public com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry build() {
        com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry buildPartial() {
        com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry result = new com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.expireTime_ = expireTimeBuilder_ == null
              ? expireTime_
              : expireTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.offerKey_ = offerKey_;
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
        if (other instanceof com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry) {
          return mergeFrom((com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry other) {
        if (other == com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry.getDefaultInstance()) return this;
        if (other.hasExpireTime()) {
          mergeExpireTime(other.getExpireTime());
        }
        if (other.getOfferKey() != com.google.protobuf.ByteString.EMPTY) {
          setOfferKey(other.getOfferKey());
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
                    getExpireTimeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                offerKey_ = input.readBytes();
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

      private com.google.protobuf.Timestamp expireTime_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireTimeBuilder_;
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return Whether the expireTime field is set.
       */
      public boolean hasExpireTime() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       * @return The expireTime.
       */
      public com.google.protobuf.Timestamp getExpireTime() {
        if (expireTimeBuilder_ == null) {
          return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
        } else {
          return expireTimeBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setExpireTime(com.google.protobuf.Timestamp value) {
        if (expireTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          expireTime_ = value;
        } else {
          expireTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder setExpireTime(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (expireTimeBuilder_ == null) {
          expireTime_ = builderForValue.build();
        } else {
          expireTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
        if (expireTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            expireTime_ != null &&
            expireTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
            getExpireTimeBuilder().mergeFrom(value);
          } else {
            expireTime_ = value;
          }
        } else {
          expireTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public Builder clearExpireTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        expireTime_ = null;
        if (expireTimeBuilder_ != null) {
          expireTimeBuilder_.dispose();
          expireTimeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getExpireTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
        if (expireTimeBuilder_ != null) {
          return expireTimeBuilder_.getMessageOrBuilder();
        } else {
          return expireTime_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getExpireTimeFieldBuilder() {
        if (expireTimeBuilder_ == null) {
          expireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getExpireTime(),
                  getParentForChildren(),
                  isClean());
          expireTime_ = null;
        }
        return expireTimeBuilder_;
      }

      private com.google.protobuf.ByteString offerKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
       * @return The offerKey.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getOfferKey() {
        return offerKey_;
      }
      /**
       * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
       * @param value The offerKey to set.
       * @return This builder for chaining.
       */
      public Builder setOfferKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        offerKey_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        offerKey_ = getDefaultInstance().getOfferKey();
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


      // @@protoc_insertion_point(builder_scope:likechain.likenft.v1.OfferExpireQueueEntry)
    }

    // @@protoc_insertion_point(class_scope:likechain.likenft.v1.OfferExpireQueueEntry)
    private static final com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry();
    }

    public static com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OfferExpireQueueEntry>
        PARSER = new com.google.protobuf.AbstractParser<OfferExpireQueueEntry>() {
      @java.lang.Override
      public OfferExpireQueueEntry parsePartialFrom(
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

    public static com.google.protobuf.Parser<OfferExpireQueueEntry> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OfferExpireQueueEntry> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.likechain.likenft.v1.OfferExpireQueueProto.OfferExpireQueueEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-likechain/likenft/v1/offer_expire_queu" +
      "e.proto\022\024likechain.likenft.v1\032\024gogoproto" +
      "/gogo.proto\032\037google/protobuf/timestamp.p" +
      "roto\"{\n\025OfferExpireQueueEntry\022E\n\013expire_" +
      "time\030\001 \001(\0132\032.google.protobuf.TimestampB\010" +
      "\310\336\037\000\220\337\037\001R\nexpireTime\022\033\n\toffer_key\030\002 \001(\014R" +
      "\010offerKeyB\330\001\n\030com.likechain.likenft.v1B\025" +
      "OfferExpireQueueProtoZ5github.com/likeco" +
      "in/likecoin-chain/v4/x/likenft/types\242\002\003L" +
      "LX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\Li" +
      "kenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMetad" +
      "ata\352\002\026Likechain::Likenft::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor,
        new java.lang.String[] { "ExpireTime", "OfferKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
